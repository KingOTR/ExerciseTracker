package org.maplibre.android.module.http;

import android.os.Build;
import android.text.TextUtils;
import androidx.core.graphics.TypefaceCompat$$ExternalSyntheticBackport0;
import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.maplibre.android.BuildConfig;
import org.maplibre.android.constants.MapLibreConstants;
import org.maplibre.android.http.HttpIdentifier;
import org.maplibre.android.http.HttpLogger;
import org.maplibre.android.http.HttpRequest;
import org.maplibre.android.http.HttpRequestUrl;
import org.maplibre.android.http.HttpResponder;

/* loaded from: classes5.dex */
public class HttpRequestImpl implements HttpRequest {
    static final OkHttpClient DEFAULT_CLIENT;
    static Call.Factory client;
    private static final String userAgentString = HttpRequestUtil.toHumanReadableAscii(String.format("%s %s (%s) Android/%s (%s)", HttpIdentifier.getIdentifier(), BuildConfig.MAPLIBRE_VERSION_STRING, BuildConfig.GIT_REVISION_SHORT, Integer.valueOf(Build.VERSION.SDK_INT), Build.SUPPORTED_ABIS[0]));
    private Call call;

    static {
        OkHttpClient build = new OkHttpClient.Builder().dispatcher(getDispatcher()).build();
        DEFAULT_CLIENT = build;
        client = build;
    }

    @Override // org.maplibre.android.http.HttpRequest
    public void executeRequest(HttpResponder httpResponder, long j, String str, String str2, String str3, String str4, boolean z) {
        OkHttpCallback okHttpCallback = new OkHttpCallback(httpResponder);
        try {
            HttpUrl parse = HttpUrl.parse(str);
            if (parse == null) {
                HttpLogger.log(6, String.format("[HTTP] Unable to parse resourceUrl %s", str));
                return;
            }
            String buildResourceUrl = HttpRequestUrl.buildResourceUrl(parse.host().toLowerCase(MapLibreConstants.MAPLIBRE_LOCALE), str, parse.querySize(), z);
            Request.Builder addHeader = new Request.Builder().url(buildResourceUrl).tag(buildResourceUrl.toLowerCase(MapLibreConstants.MAPLIBRE_LOCALE)).addHeader(HttpHeaders.USER_AGENT, userAgentString);
            if (str2.length() > 0) {
                addHeader.addHeader(HttpHeaders.RANGE, str2);
            }
            if (str3.length() > 0) {
                addHeader.addHeader(HttpHeaders.IF_NONE_MATCH, str3);
            } else if (str4.length() > 0) {
                addHeader.addHeader(HttpHeaders.IF_MODIFIED_SINCE, str4);
            }
            Call newCall = client.newCall(addHeader.build());
            this.call = newCall;
            newCall.enqueue(okHttpCallback);
        } catch (Exception e) {
            okHttpCallback.handleFailure(this.call, e);
        }
    }

    @Override // org.maplibre.android.http.HttpRequest
    public void cancelRequest() {
        Call call = this.call;
        if (call != null) {
            HttpLogger.log(3, String.format("[HTTP] This request was cancelled (%s). This is expected for tiles that were being prefetched but are no longer needed for the map to render.", call.request().url()));
            this.call.cancel();
        }
    }

    public static void enablePrintRequestUrlOnFailure(boolean z) {
        HttpLogger.logRequestUrl = z;
    }

    public static void enableLog(boolean z) {
        HttpLogger.logEnabled = z;
    }

    public static void setOkHttpClient(Call.Factory factory) {
        client = (Call.Factory) TypefaceCompat$$ExternalSyntheticBackport0.m((Object) factory, (Object) DEFAULT_CLIENT);
    }

    private static class OkHttpCallback implements Callback {
        private HttpResponder httpRequest;

        OkHttpCallback(HttpResponder httpResponder) {
            this.httpRequest = httpResponder;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException iOException) {
            handleFailure(call, iOException);
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                HttpLogger.log(2, String.format("[HTTP] Request was successful (code = %s).", Integer.valueOf(response.code())));
            } else {
                HttpLogger.log(3, String.format("[HTTP] Request with response = %s: %s", Integer.valueOf(response.code()), !TextUtils.isEmpty(response.message()) ? response.message() : "No additional information"));
            }
            ResponseBody body = response.body();
            if (body == null) {
                HttpLogger.log(6, "[HTTP] Received empty response body");
                return;
            }
            try {
                try {
                    byte[] bytes = body.bytes();
                    response.close();
                    this.httpRequest.onResponse(response.code(), response.header(HttpHeaders.ETAG), response.header(HttpHeaders.LAST_MODIFIED), response.header("Cache-Control"), response.header("Expires"), response.header(HttpHeaders.RETRY_AFTER), response.header("x-rate-limit-reset"), bytes);
                } catch (IOException e) {
                    onFailure(call, e);
                    response.close();
                }
            } catch (Throwable th) {
                response.close();
                throw th;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void handleFailure(Call call, Exception exc) {
            String message = exc.getMessage() != null ? exc.getMessage() : "Error processing the request";
            int failureType = getFailureType(exc);
            if (HttpLogger.logEnabled && call != null && call.request() != null) {
                HttpLogger.logFailure(failureType, message, call.request().url().getUrl());
            }
            this.httpRequest.handleFailure(failureType, message);
        }

        private int getFailureType(Exception exc) {
            if ((exc instanceof NoRouteToHostException) || (exc instanceof UnknownHostException) || (exc instanceof SocketException) || (exc instanceof ProtocolException) || (exc instanceof SSLException)) {
                return 0;
            }
            return exc instanceof InterruptedIOException ? 1 : 2;
        }
    }

    private static Dispatcher getDispatcher() {
        Dispatcher dispatcher = new Dispatcher();
        dispatcher.setMaxRequestsPerHost(20);
        return dispatcher;
    }
}
