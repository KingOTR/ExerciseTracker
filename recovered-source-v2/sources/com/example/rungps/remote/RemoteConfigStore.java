package com.example.rungps.remote;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.core.app.NotificationCompat;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonBuilder;
import kotlinx.serialization.json.JsonKt;

/* compiled from: RemoteConfig.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0007J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007J\u000e\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0007J\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007J\u0010\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/remote/RemoteConfigStore;", "", "prefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "getUrl", "", "setUrl", "", "url", "getLastRawJson", "setLastRawJson", "raw", "getLastFetchError", "setLastFetchError", NotificationCompat.CATEGORY_ERROR, "loadConfigOrNull", "Lcom/example/rungps/remote/RemoteConfig;", "fetchAndStore", "Lkotlin/Result;", "fetchAndStore-d1pmJ48", "()Ljava/lang/Object;", "httpGet", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RemoteConfigStore {
    private static final String DEFAULT_URL = "https://example.invalid/rungps-config.json";
    private static final String KEY_LAST_ERROR = "last_error";
    private static final String KEY_LAST_JSON = "last_json";
    private static final String KEY_URL = "url";
    private static final String PREFS = "remote_config";
    private final SharedPreferences prefs;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final Json json = JsonKt.Json$default(null, new Function1() { // from class: com.example.rungps.remote.RemoteConfigStore$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            Unit json$lambda$5;
            json$lambda$5 = RemoteConfigStore.json$lambda$5((JsonBuilder) obj);
            return json$lambda$5;
        }
    }, 1, null);

    public RemoteConfigStore(SharedPreferences prefs) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        this.prefs = prefs;
    }

    public final String getUrl() {
        String string = this.prefs.getString("url", DEFAULT_URL);
        return string == null ? DEFAULT_URL : string;
    }

    public final void setUrl(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.prefs.edit().putString("url", url).apply();
    }

    public final String getLastRawJson() {
        return this.prefs.getString(KEY_LAST_JSON, null);
    }

    public final void setLastRawJson(String raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        this.prefs.edit().putString(KEY_LAST_JSON, raw).apply();
    }

    public final String getLastFetchError() {
        return this.prefs.getString(KEY_LAST_ERROR, null);
    }

    public final void setLastFetchError(String err) {
        this.prefs.edit().putString(KEY_LAST_ERROR, err).apply();
    }

    public final RemoteConfig loadConfigOrNull() {
        Object m7905constructorimpl;
        String lastRawJson = getLastRawJson();
        if (lastRawJson == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            RemoteConfigStore remoteConfigStore = this;
            m7905constructorimpl = Result.m7905constructorimpl((RemoteConfig) json.decodeFromString(RemoteConfig.INSTANCE.serializer(), lastRawJson));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return (RemoteConfig) (Result.m7911isFailureimpl(m7905constructorimpl) ? null : m7905constructorimpl);
    }

    /* renamed from: fetchAndStore-d1pmJ48, reason: not valid java name */
    public final Object m6901fetchAndStored1pmJ48() {
        Object m7905constructorimpl;
        String obj = StringsKt.trim((CharSequence) getUrl()).toString();
        if (obj.length() == 0) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m7905constructorimpl(ResultKt.createFailure(new IllegalArgumentException("Remote config URL is empty")));
        }
        try {
            Result.Companion companion2 = Result.INSTANCE;
            RemoteConfigStore remoteConfigStore = this;
            String httpGet = httpGet(obj);
            setLastRawJson(httpGet);
            setLastFetchError(null);
            m7905constructorimpl = Result.m7905constructorimpl((RemoteConfig) json.decodeFromString(RemoteConfig.INSTANCE.serializer(), httpGet));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            String message = m7908exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = m7908exceptionOrNullimpl.toString();
            }
            setLastFetchError(message);
        }
        return m7905constructorimpl;
    }

    private final String httpGet(String url) {
        URLConnection openConnection = new URL(url).openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setConnectTimeout(10000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setRequestMethod(ShareTarget.METHOD_GET);
        httpURLConnection.setRequestProperty(HttpHeaders.ACCEPT, "application/json");
        InputStream inputStream = httpURLConnection.getInputStream();
        Intrinsics.checkNotNullExpressionValue(inputStream, "getInputStream(...)");
        Reader inputStreamReader = new InputStreamReader(inputStream, Charsets.UTF_8);
        BufferedReader bufferedReader = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
        try {
            String readText = TextStreamsKt.readText(bufferedReader);
            int responseCode = httpURLConnection.getResponseCode();
            if (200 > responseCode || responseCode >= 300) {
                throw new IllegalStateException("HTTP " + httpURLConnection.getResponseCode() + ": " + readText);
            }
            CloseableKt.closeFinally(bufferedReader, null);
            return readText;
        } finally {
        }
    }

    /* compiled from: RemoteConfig.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/remote/RemoteConfigStore$Companion;", "", "<init>", "()V", "PREFS", "", "KEY_URL", "KEY_LAST_JSON", "KEY_LAST_ERROR", "DEFAULT_URL", "json", "Lkotlinx/serialization/json/Json;", "getJson", "()Lkotlinx/serialization/json/Json;", "from", "Lcom/example/rungps/remote/RemoteConfigStore;", "context", "Landroid/content/Context;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Json getJson() {
            return RemoteConfigStore.json;
        }

        public final RemoteConfigStore from(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences(RemoteConfigStore.PREFS, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
            return new RemoteConfigStore(sharedPreferences);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit json$lambda$5(JsonBuilder Json) {
        Intrinsics.checkNotNullParameter(Json, "$this$Json");
        Json.setIgnoreUnknownKeys(true);
        Json.setLenient(true);
        return Unit.INSTANCE;
    }
}
