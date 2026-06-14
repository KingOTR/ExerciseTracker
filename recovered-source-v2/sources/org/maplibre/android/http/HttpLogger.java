package org.maplibre.android.http;

import org.maplibre.android.log.Logger;

/* loaded from: classes5.dex */
public class HttpLogger {
    private static final String TAG = "Mbgl-HttpRequest";
    public static boolean logEnabled = true;
    public static boolean logRequestUrl;

    private HttpLogger() {
    }

    public static void logFailure(int i, String str, String str2) {
        String str3;
        int i2 = i == 1 ? 3 : i == 0 ? 4 : 5;
        if (i == 1) {
            str3 = "temporary";
        } else {
            str3 = i == 0 ? "connection" : "permanent";
        }
        if (!logRequestUrl) {
            str2 = "";
        }
        log(i2, String.format("Request failed due to a %s error: %s %s", str3, str, str2));
    }

    public static void log(int i, String str) {
        if (logEnabled) {
            Logger.log(i, TAG, str);
        }
    }
}
