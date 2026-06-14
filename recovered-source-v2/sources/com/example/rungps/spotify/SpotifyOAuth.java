package com.example.rungps.spotify;

import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: SpotifyOAuth.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\rJ&\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007J\u0016\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/example/rungps/spotify/SpotifyOAuth;", "", "<init>", "()V", "json", "Lkotlinx/serialization/json/Json;", "buildAuthorizeUrl", "", "clientId", "codeChallenge", "state", "redirectUri", "scopes", "", "exchangeCodeForTokens", "Lcom/example/rungps/spotify/SpotifyTokenResponse;", "code", "codeVerifier", "refreshAccessToken", "refreshToken", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SpotifyOAuth {
    public static final SpotifyOAuth INSTANCE = new SpotifyOAuth();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.spotify.SpotifyOAuth$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = SpotifyOAuth.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    public static final int $stable = 8;

    private SpotifyOAuth() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    public final String buildAuthorizeUrl(String clientId, String codeChallenge, String state, String redirectUri, List<String> scopes) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(codeChallenge, "codeChallenge");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        Intrinsics.checkNotNullParameter(scopes, "scopes");
        return "https://accounts.spotify.com/authorize?client_id=" + URLEncoder.encode(clientId, Charsets.UTF_8.name()) + "&response_type=code&redirect_uri=" + URLEncoder.encode(redirectUri, Charsets.UTF_8.name()) + "&code_challenge_method=S256&code_challenge=" + URLEncoder.encode(codeChallenge, Charsets.UTF_8.name()) + "&state=" + URLEncoder.encode(state, Charsets.UTF_8.name()) + "&scope=" + URLEncoder.encode(CollectionsKt.joinToString$default(scopes, " ", null, null, 0, null, null, 62, null), Charsets.UTF_8.name());
    }

    public final SpotifyTokenResponse exchangeCodeForTokens(String clientId, String code, String codeVerifier, String redirectUri) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(codeVerifier, "codeVerifier");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        URLConnection openConnection = new URL("https://accounts.spotify.com/api/token").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("client_id", clientId), TuplesKt.to("grant_type", "authorization_code"), TuplesKt.to("code", code), TuplesKt.to("redirect_uri", redirectUri), TuplesKt.to("code_verifier", codeVerifier)}), "&", null, null, 0, null, new Function1() { // from class: com.example.rungps.spotify.SpotifyOAuth$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence exchangeCodeForTokens$lambda$2;
                exchangeCodeForTokens$lambda$2 = SpotifyOAuth.exchangeCodeForTokens$lambda$2((Pair) obj);
                return exchangeCodeForTokens$lambda$2;
            }
        }, 30, null);
        BufferedReader outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Charsets.UTF_8);
        try {
            outputStreamWriter.write(joinToString$default);
            Unit unit = Unit.INSTANCE;
            String str = null;
            CloseableKt.closeFinally(outputStreamWriter, null);
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                outputStreamWriter = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String readText = TextStreamsKt.readText(outputStreamWriter);
                    CloseableKt.closeFinally(outputStreamWriter, null);
                    str = readText;
                } finally {
                }
            }
            if (str == null) {
                str = "";
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Spotify token error " + responseCode + ": " + str).toString());
            }
            return (SpotifyTokenResponse) json.decodeFromString(SpotifyTokenResponse.INSTANCE.serializer(), str);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence exchangeCodeForTokens$lambda$2(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return URLEncoder.encode(str, Charsets.UTF_8.name()) + "=" + URLEncoder.encode(str2, Charsets.UTF_8.name());
    }

    public final SpotifyTokenResponse refreshAccessToken(String clientId, String refreshToken) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        URLConnection openConnection = new URL("https://accounts.spotify.com/api/token").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("client_id", clientId), TuplesKt.to("grant_type", "refresh_token"), TuplesKt.to("refresh_token", refreshToken)}), "&", null, null, 0, null, new Function1() { // from class: com.example.rungps.spotify.SpotifyOAuth$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence refreshAccessToken$lambda$6;
                refreshAccessToken$lambda$6 = SpotifyOAuth.refreshAccessToken$lambda$6((Pair) obj);
                return refreshAccessToken$lambda$6;
            }
        }, 30, null);
        BufferedReader outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), Charsets.UTF_8);
        try {
            outputStreamWriter.write(joinToString$default);
            Unit unit = Unit.INSTANCE;
            String str = null;
            CloseableKt.closeFinally(outputStreamWriter, null);
            int responseCode = httpURLConnection.getResponseCode();
            InputStream errorStream = (200 > responseCode || responseCode >= 300) ? httpURLConnection.getErrorStream() : httpURLConnection.getInputStream();
            if (errorStream != null) {
                Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                outputStreamWriter = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                try {
                    String readText = TextStreamsKt.readText(outputStreamWriter);
                    CloseableKt.closeFinally(outputStreamWriter, null);
                    str = readText;
                } finally {
                }
            }
            if (str == null) {
                str = "";
            }
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException(("Spotify refresh error " + responseCode + ": " + str).toString());
            }
            return (SpotifyTokenResponse) json.decodeFromString(SpotifyTokenResponse.INSTANCE.serializer(), str);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence refreshAccessToken$lambda$6(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return URLEncoder.encode(str, Charsets.UTF_8.name()) + "=" + URLEncoder.encode(str2, Charsets.UTF_8.name());
    }
}
