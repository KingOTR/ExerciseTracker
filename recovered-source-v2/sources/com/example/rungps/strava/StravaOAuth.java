package com.example.rungps.strava;

import android.content.Context;
import android.content.SharedPreferences;
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
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;
import org.json.JSONObject;

/* compiled from: StravaOAuth.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0005H\u0002J\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0005J(\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005J\u001e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0005J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/strava/StravaOAuth;", "", "<init>", "()V", "OAUTH_PREFS", "", "KEY_PENDING_CODE", "REDIRECT_URI", "LEGACY_REDIRECT_URI", "json", "Lkotlinx/serialization/json/Json;", "formatTokenError", "", "httpCode", "", "body", "buildAuthorizeUrl", "clientId", "exchangeCodeForTokens", "Lcom/example/rungps/strava/StravaTokenResponse;", "clientSecret", "code", "redirectUri", "refreshAccessToken", "refreshToken", "markAuthCodePending", "", "context", "Landroid/content/Context;", "clearAuthCodePending", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaOAuth {
    private static final String KEY_PENDING_CODE = "pending_auth_code";
    public static final String LEGACY_REDIRECT_URI = "rungps://strava/oauth";
    private static final String OAUTH_PREFS = "strava_oauth";
    public static final String REDIRECT_URI = "http://localhost/oauth";
    public static final StravaOAuth INSTANCE = new StravaOAuth();
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.strava.StravaOAuth$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$0;
            json$lambda$0 = StravaOAuth.json$lambda$0((JsonBuilder) obj);
            return json$lambda$0;
        }
    }, 1, null);
    public static final int $stable = 8;

    private StravaOAuth() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$0(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Void formatTokenError(int httpCode, String body) {
        String str;
        String str2 = "";
        if (StravaAuthErrors.INSTANCE.isTokenEndpointAuthFailure(httpCode, body)) {
            throw StravaAuthErrors.reconnectException$default(StravaAuthErrors.INSTANCE, null, 1, null);
        }
        String obj = StringsKt.trim((CharSequence) body).toString();
        try {
            Result.Companion companion = Result.INSTANCE;
            StravaOAuth stravaOAuth = this;
            JSONObject jSONObject = new JSONObject(obj);
            StringBuilder sb = new StringBuilder();
            String optString = jSONObject.optString("error", "");
            Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
            String obj2 = StringsKt.trim((CharSequence) optString).toString();
            String optString2 = jSONObject.optString("error_description", "");
            Intrinsics.checkNotNullExpressionValue(optString2, "optString(...)");
            String obj3 = StringsKt.trim((CharSequence) optString2).toString();
            if (obj2.length() > 0) {
                sb.append(obj2);
            }
            if (obj3.length() > 0) {
                if (sb.length() > 0) {
                    sb.append(": ");
                }
                sb.append(obj3);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            String str3 = sb2;
            if (StringsKt.isBlank(str3)) {
                str3 = obj;
            }
            str = Result.m7905constructorimpl(str3);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            str = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (!Result.m7911isFailureimpl(str)) {
            obj = str;
        }
        String str4 = obj;
        String str5 = str4;
        if (StringsKt.contains((CharSequence) str5, (CharSequence) "invalid_client", true)) {
            str2 = " — check Client ID at strava.com/settings/api";
        } else if (StringsKt.contains((CharSequence) str5, (CharSequence) "invalid_grant", true)) {
            str2 = " — tap Connect Strava again (code expired or already used)";
        } else if (httpCode == 400 && StringsKt.contains((CharSequence) str5, (CharSequence) "bad request", true)) {
            str2 = " — save Client Secret from strava.com/settings/api; callback domain must be localhost";
        }
        throw new IllegalStateException("Strava token error " + httpCode + ": " + str4 + str2);
    }

    public final String buildAuthorizeUrl(String clientId) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        return "https://www.strava.com/oauth/mobile/authorize?client_id=" + URLEncoder.encode(clientId, Charsets.UTF_8.name()) + "&redirect_uri=" + URLEncoder.encode(REDIRECT_URI, Charsets.UTF_8.name()) + "&response_type=code&approval_prompt=auto&scope=activity:read_all,activity:write";
    }

    public static /* synthetic */ StravaTokenResponse exchangeCodeForTokens$default(StravaOAuth stravaOAuth, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 8) != 0) {
            str4 = REDIRECT_URI;
        }
        return stravaOAuth.exchangeCodeForTokens(str, str2, str3, str4);
    }

    public final StravaTokenResponse exchangeCodeForTokens(String clientId, String clientSecret, String code, String redirectUri) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(redirectUri, "redirectUri");
        String obj = StringsKt.trim((CharSequence) clientSecret).toString();
        if (obj.length() == 0) {
            throw new IllegalStateException("Save Strava Client Secret first (strava.com/settings/api — Strava requires it; PKCE is not supported).");
        }
        URLConnection openConnection = new URL("https://www.strava.com/oauth/token").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("client_id", clientId), TuplesKt.to("client_secret", obj), TuplesKt.to("code", code), TuplesKt.to("grant_type", "authorization_code"), TuplesKt.to("redirect_uri", redirectUri)}), "&", null, null, 0, null, new Function1() { // from class: com.example.rungps.strava.StravaOAuth$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CharSequence exchangeCodeForTokens$lambda$5;
                exchangeCodeForTokens$lambda$5 = StravaOAuth.exchangeCodeForTokens$lambda$5((Pair) obj2);
                return exchangeCodeForTokens$lambda$5;
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
                formatTokenError(responseCode, str);
                throw new KotlinNothingValueException();
            }
            return (StravaTokenResponse) json.decodeFromString(StravaTokenResponse.INSTANCE.serializer(), str);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence exchangeCodeForTokens$lambda$5(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return URLEncoder.encode(str, Charsets.UTF_8.name()) + "=" + URLEncoder.encode(str2, Charsets.UTF_8.name());
    }

    public final StravaTokenResponse refreshAccessToken(String clientId, String clientSecret, String refreshToken) {
        Intrinsics.checkNotNullParameter(clientId, "clientId");
        Intrinsics.checkNotNullParameter(clientSecret, "clientSecret");
        Intrinsics.checkNotNullParameter(refreshToken, "refreshToken");
        String obj = StringsKt.trim((CharSequence) clientSecret).toString();
        if (obj.length() == 0) {
            throw new IllegalStateException(StravaAuthErrors.MISSING_SECRET_MESSAGE);
        }
        URLConnection openConnection = new URL("https://www.strava.com/oauth/token").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
        String joinToString$default = CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("client_id", clientId), TuplesKt.to("client_secret", obj), TuplesKt.to("refresh_token", refreshToken), TuplesKt.to("grant_type", "refresh_token")}), "&", null, null, 0, null, new Function1() { // from class: com.example.rungps.strava.StravaOAuth$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                CharSequence refreshAccessToken$lambda$9;
                refreshAccessToken$lambda$9 = StravaOAuth.refreshAccessToken$lambda$9((Pair) obj2);
                return refreshAccessToken$lambda$9;
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
                formatTokenError(responseCode, str);
                throw new KotlinNothingValueException();
            }
            return (StravaTokenResponse) json.decodeFromString(StravaTokenResponse.INSTANCE.serializer(), str);
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence refreshAccessToken$lambda$9(Pair pair) {
        Intrinsics.checkNotNullParameter(pair, "<destruct>");
        String str = (String) pair.component1();
        String str2 = (String) pair.component2();
        return URLEncoder.encode(str, Charsets.UTF_8.name()) + "=" + URLEncoder.encode(str2, Charsets.UTF_8.name());
    }

    public final boolean markAuthCodePending(Context context, String code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(code, "code");
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(OAUTH_PREFS, 0);
        String obj = StringsKt.trim((CharSequence) code).toString();
        if (obj.length() == 0) {
            return false;
        }
        synchronized (this) {
            if (Intrinsics.areEqual(sharedPreferences.getString(KEY_PENDING_CODE, null), obj)) {
                return false;
            }
            sharedPreferences.edit().putString(KEY_PENDING_CODE, obj).commit();
            return true;
        }
    }

    public final void clearAuthCodePending(Context context, String code) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(code, "code");
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(OAUTH_PREFS, 0);
        synchronized (this) {
            if (Intrinsics.areEqual(sharedPreferences.getString(KEY_PENDING_CODE, null), StringsKt.trim((CharSequence) code).toString())) {
                sharedPreferences.edit().remove(KEY_PENDING_CODE).apply();
            }
            Unit unit = Unit.INSTANCE;
        }
    }
}
