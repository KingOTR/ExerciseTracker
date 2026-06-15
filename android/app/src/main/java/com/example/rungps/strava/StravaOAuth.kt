package com.example.rungps.strava

import android.content.Context
import android.content.SharedPreferences
import kotlinx.serialization.json.Json
import java.io.BufferedReader
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.net.HttpURLConnection
import java.net.URL
import java.net.URLEncoder

object StravaOAuth {
    const val REDIRECT_URI = "http://localhost/oauth"
    const val LEGACY_REDIRECT_URI = "rungps://strava/oauth"
    private const val PREFS = "strava_oauth"
    private const val KEY_PENDING_CODE = "pending_auth_code"

    private val json = Json { ignoreUnknownKeys = true }

    fun buildAuthorizeUrl(clientId: String): String {
        val encId = URLEncoder.encode(clientId, Charsets.UTF_8.name())
        val encRedirect = URLEncoder.encode(REDIRECT_URI, Charsets.UTF_8.name())
        return "https://www.strava.com/oauth/mobile/authorize" +
            "?client_id=$encId&redirect_uri=$encRedirect" +
            "&response_type=code&approval_prompt=auto&scope=activity:read_all,activity:write"
    }

    fun exchangeCodeForTokens(
        clientId: String,
        clientSecret: String,
        code: String,
        redirectUri: String = REDIRECT_URI,
    ): StravaTokenResponse {
        val secret = clientSecret.trim()
        require(secret.isNotEmpty()) { "Save Strava Client Secret first (strava.com/settings/api)." }
        val body = listOf(
            "client_id" to clientId,
            "client_secret" to secret,
            "code" to code,
            "grant_type" to "authorization_code",
            "redirect_uri" to redirectUri,
        ).joinToString("&") { (k, v) ->
            "${URLEncoder.encode(k, Charsets.UTF_8.name())}=${URLEncoder.encode(v, Charsets.UTF_8.name())}"
        }
        return postToken(body)
    }

    fun refreshAccessToken(clientId: String, clientSecret: String, refreshToken: String): StravaTokenResponse {
        val secret = clientSecret.trim()
        require(secret.isNotEmpty()) { "Strava client secret missing." }
        val body = listOf(
            "client_id" to clientId,
            "client_secret" to secret,
            "refresh_token" to refreshToken,
            "grant_type" to "refresh_token",
        ).joinToString("&") { (k, v) ->
            "${URLEncoder.encode(k, Charsets.UTF_8.name())}=${URLEncoder.encode(v, Charsets.UTF_8.name())}"
        }
        return postToken(body)
    }

    fun markAuthCodePending(context: Context, code: String): Boolean {
        if (code.isBlank()) return false
        prefs(context).edit().putString(KEY_PENDING_CODE, code).apply()
        return true
    }

    fun consumePendingAuthCode(context: Context): String? {
        val prefs = prefs(context)
        val code = prefs.getString(KEY_PENDING_CODE, null)
        if (code != null) prefs.edit().remove(KEY_PENDING_CODE).apply()
        return code
    }

    fun clearAuthCodePending(context: Context) {
        prefs(context).edit().remove(KEY_PENDING_CODE).apply()
    }

    private fun prefs(context: Context): SharedPreferences =
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)

    private fun postToken(formBody: String): StravaTokenResponse {
        val conn = (URL("https://www.strava.com/oauth/token").openConnection() as HttpURLConnection).apply {
            requestMethod = "POST"
            doOutput = true
            setRequestProperty("Content-Type", "application/x-www-form-urlencoded")
        }
        OutputStreamWriter(conn.outputStream, Charsets.UTF_8).use { it.write(formBody) }
        val code = conn.responseCode
        val stream = if (code in 200..299) conn.inputStream else conn.errorStream
        val text = stream?.let { BufferedReader(InputStreamReader(it, Charsets.UTF_8)).readText() } ?: ""
        if (code !in 200..299) {
            throw IllegalStateException("Strava token error $code: $text")
        }
        return json.decodeFromString(StravaTokenResponse.serializer(), text)
    }
}
