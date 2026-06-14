package com.example.rungps.strava;

import com.example.rungps.AppBranding;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.TextStreamsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: StravaPhotoUpload.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0007¨\u0006\r"}, d2 = {"Lcom/example/rungps/strava/StravaPhotoUpload;", "", "<init>", "()V", "uploadPhoto", "", "accessToken", "", "activityId", "", "imageBytes", "", "caption", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaPhotoUpload {
    public static final int $stable = 0;
    public static final StravaPhotoUpload INSTANCE = new StravaPhotoUpload();

    private StravaPhotoUpload() {
    }

    public static /* synthetic */ void uploadPhoto$default(StravaPhotoUpload stravaPhotoUpload, String str, long j, byte[] bArr, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = AppBranding.DISPLAY_NAME;
        }
        stravaPhotoUpload.uploadPhoto(str, j, bArr, str2);
    }

    public final void uploadPhoto(String accessToken, long activityId, byte[] imageBytes, String caption) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(imageBytes, "imageBytes");
        Intrinsics.checkNotNullParameter(caption, "caption");
        String str = "----ExerciseTracker" + UUID.randomUUID();
        URLConnection openConnection = new URL("https://www.strava.com/api/v3/activities/" + activityId + "/photos").openConnection();
        Intrinsics.checkNotNull(openConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) openConnection;
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, "Bearer " + accessToken);
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "multipart/form-data; boundary=" + str);
        BufferedReader dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            DataOutputStream dataOutputStream2 = dataOutputStream;
            dataOutputStream2.writeBytes("--" + str + "\r\n");
            dataOutputStream2.writeBytes("Content-Disposition: form-data; name=\"caption\"\r\n\r\n");
            dataOutputStream2.writeBytes(caption + "\r\n");
            dataOutputStream2.writeBytes("--" + str + "\r\n");
            dataOutputStream2.writeBytes("Content-Disposition: form-data; name=\"file\"; filename=\"run.png\"\r\n");
            dataOutputStream2.writeBytes("Content-Type: image/png\r\n\r\n");
            dataOutputStream2.write(imageBytes);
            dataOutputStream2.writeBytes("\r\n--" + str + "--\r\n");
            Unit unit = Unit.INSTANCE;
            String str2 = null;
            CloseableKt.closeFinally(dataOutputStream, null);
            int responseCode = httpURLConnection.getResponseCode();
            if (200 > responseCode || responseCode >= 300) {
                InputStream errorStream = httpURLConnection.getErrorStream();
                if (errorStream == null) {
                    errorStream = httpURLConnection.getInputStream();
                }
                if (errorStream != null) {
                    Reader inputStreamReader = new InputStreamReader(errorStream, Charsets.UTF_8);
                    dataOutputStream = inputStreamReader instanceof BufferedReader ? (BufferedReader) inputStreamReader : new BufferedReader(inputStreamReader, 8192);
                    try {
                        String readText = TextStreamsKt.readText(dataOutputStream);
                        CloseableKt.closeFinally(dataOutputStream, null);
                        str2 = readText;
                    } finally {
                    }
                }
                if (str2 == null) {
                    str2 = "";
                }
                throw new IllegalStateException(("Strava photo HTTP " + responseCode + ": " + str2).toString());
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
