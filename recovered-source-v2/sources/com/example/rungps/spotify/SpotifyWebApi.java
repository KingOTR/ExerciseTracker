package com.example.rungps.spotify;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: SpotifyWebApi.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\tJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/spotify/SpotifyWebApi;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "nowPlaying", "Lcom/example/rungps/spotify/SpotifyNowPlaying;", "accessToken", "", "play", "", "pause", "next", "previous", "playerCommand", "action", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyWebApi {
    public static final SpotifyWebApi INSTANCE = new SpotifyWebApi();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.spotify.SpotifyWebApi$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = SpotifyWebApi.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    public static final int $stable = 8;

    private SpotifyWebApi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final SpotifyNowPlaying nowPlaying(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        URLConnection openConnection = new URL("https://api.spotify.com/v1/me/player/currently-playing").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
        int responseCode = httpURLConnection.getResponseCode();
        String str = null;
        if (responseCode == 204) {
            return null;
        }
        InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
        if (errorStream != null) {
            Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
            BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
            try {
                String readText = TextStreamsKt.readText(bufferedReader);
                CloseableKt.closeFinally(bufferedReader, null);
                str = readText;
            } finally {
            }
        }
        if (str == null) {
            str = "";
        }
        if (200 > responseCode || responseCode >= 300) {
            throw new IllegalStateException(("Spotify now-playing error " + responseCode + ": " + str).toString());
        }
        return (SpotifyNowPlaying) json.decodeFromString(SpotifyNowPlaying.INSTANCE.serializer(), str);
    }

    public final void play(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        playerCommand(accessToken, "play");
    }

    public final void pause(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        playerCommand(accessToken, "pause");
    }

    public final void next(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        playerCommand(accessToken, "next");
    }

    public final void previous(String accessToken) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        playerCommand(accessToken, "previous");
    }

    private final void playerCommand(String accessToken, String action) {
        String str;
        if (Intrinsics.areEqual(action, "play") || Intrinsics.areEqual(action, "pause")) {
            str = "PUT";
        } else {
            str = "POST";
        }
        URLConnection openConnection = new URL("https://api.spotify.com/v1/me/player/" + action).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod(str);
        httpURLConnection.setDoOutput(false);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        int responseCode = httpURLConnection.getResponseCode();
        if ((200 > responseCode || responseCode >= 300) && responseCode != 204) {
            InputStream errorStream = httpURLConnection.getErrorStream();
            String str2 = null;
            if (errorStream != null) {
                Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String readText = TextStreamsKt.readText(bufferedReader);
                    CloseableKt.closeFinally(bufferedReader, null);
                    str2 = readText;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (str2 == null) {
                str2 = "";
            }
            throw new IllegalStateException(("Spotify player " + action + " error " + responseCode + ": " + str2).toString());
        }
    }
}
