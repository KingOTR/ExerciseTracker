package com.example.rungps.spotify

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.net.Uri
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

data class SpotifyPlayerState(
    val linked: Boolean = false,
    val trackTitle: String? = null,
    val artist: String? = null,
    val isPlaying: Boolean = false,
    val lastError: String? = null,
)

/**
 * Spotify integration: opens the Spotify app for playback/alarm and stores OAuth callback tokens.
 * Full SDK playback requires Spotify Premium + app installed; this bridges sleep alarm + mini-player UI.
 */
object SpotifyController {
    private const val PREFS = "spotify_bridge"
    private const val KEY_ACCESS_TOKEN = "access_token"
    private const val KEY_REFRESH_TOKEN = "refresh_token"
    private const val KEY_EXPIRES_AT = "expires_at_ms"

    private val _state = MutableStateFlow(SpotifyPlayerState())
    val state: StateFlow<SpotifyPlayerState> = _state.asStateFlow()

    fun prefs(context: Context): SharedPreferences =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    fun isLinked(context: Context): Boolean =
        !prefs(context).getString(KEY_ACCESS_TOKEN, null).isNullOrBlank()

    fun handleCallbackUri(context: Context, uri: Uri?): Boolean {
        if (uri == null) return false
        val isSpotify = uri.scheme == "exercisetracker" && uri.host == "spotify-callback" ||
            uri.scheme == "http" && uri.host == "localhost" && uri.path?.contains("spotify") == true
        if (!isSpotify) return false
        val token = uri.getQueryParameter("access_token")
            ?: uri.fragment?.split("&")?.firstOrNull { it.startsWith("access_token=") }
                ?.substringAfter("access_token=")
        if (!token.isNullOrBlank()) {
            prefs(context).edit().putString(KEY_ACCESS_TOKEN, token).apply()
            _state.value = _state.value.copy(linked = true, lastError = null)
            return true
        }
        _state.value = _state.value.copy(lastError = "Spotify callback missing token")
        return true
    }

    fun openAuthorize(context: Context, clientId: String, redirectUri: String) {
        val uri = Uri.parse(
            "https://accounts.spotify.com/authorize" +
                "?client_id=${Uri.encode(clientId)}" +
                "&response_type=token" +
                "&redirect_uri=${Uri.encode(redirectUri)}" +
                "&scope=${Uri.encode("user-read-playback-state user-modify-playback-state streaming")}",
        )
        context.startActivity(Intent(Intent.ACTION_VIEW, uri).addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
    }

    fun openSpotifyApp(context: Context) {
        val launch = context.packageManager.getLaunchIntentForPackage("com.spotify.music")
        if (launch != null) {
            context.startActivity(launch.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK))
        } else {
            context.startActivity(
                Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=com.spotify.music"))
                    .addFlags(Intent.FLAG_ACTIVITY_NEW_TASK),
            )
        }
    }

    fun playAlarmTrack(context: Context, query: String = "wake up") {
        val deepLink = Uri.parse("spotify:search:$query")
        val intent = Intent(Intent.ACTION_VIEW, deepLink).apply {
            setPackage("com.spotify.music")
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        if (intent.resolveActivity(context.packageManager) != null) {
            context.startActivity(intent)
            _state.value = _state.value.copy(isPlaying = true, trackTitle = query, artist = "Spotify")
        } else {
            openSpotifyApp(context)
        }
    }

    fun updateNowPlaying(title: String?, artist: String?, playing: Boolean) {
        _state.value = _state.value.copy(
            linked = true,
            trackTitle = title,
            artist = artist,
            isPlaying = playing,
        )
    }

    fun refreshLinkedState(context: Context) {
        _state.value = _state.value.copy(linked = isLinked(context))
    }

    fun clearTokens(context: Context) {
        prefs(context).edit().clear().apply()
        _state.value = SpotifyPlayerState()
    }
}
