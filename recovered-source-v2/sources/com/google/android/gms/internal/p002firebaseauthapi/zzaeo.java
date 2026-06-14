package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.common.net.HttpHeaders;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaeo {
    private static void zza(HttpURLConnection httpURLConnection, zzael<?> zzaelVar, Type type) {
        try {
            int responseCode = httpURLConnection.getResponseCode();
            InputStream inputStream = zza(responseCode) ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    } else {
                        sb.append(readLine);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (zza(responseCode)) {
                zzaelVar.zza((zzael<?>) zzadr.zza(sb2, type));
            } else {
                zzaelVar.zza((String) zzadr.zza(sb2, String.class));
            }
        } catch (SocketTimeoutException unused) {
            zzaelVar.zza("TIMEOUT");
        } catch (zzabg | IOException e) {
            zzaelVar.zza(e.getMessage());
        } finally {
            httpURLConnection.disconnect();
        }
    }

    private static final boolean zza(int i) {
        return i >= 200 && i < 300;
    }

    public static void zza(String str, zzael<?> zzaelVar, Type type, zzadu zzaduVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(60000);
            zzaduVar.zza(httpURLConnection);
            zza(httpURLConnection, zzaelVar, type);
        } catch (SocketTimeoutException unused) {
            zzaelVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzaelVar.zza("<<Network Error>>");
        } catch (IOException e) {
            zzaelVar.zza(e.getMessage());
        }
    }

    public static void zza(String str, zzadq zzadqVar, zzael<?> zzaelVar, Type type, zzadu zzaduVar) {
        try {
            try {
                Preconditions.checkNotNull(zzadqVar);
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setDoOutput(true);
                byte[] bytes = zzadqVar.zza().getBytes(Charset.defaultCharset());
                httpURLConnection.setFixedLengthStreamingMode(bytes.length);
                httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/json");
                httpURLConnection.setConnectTimeout(60000);
                zzaduVar.zza(httpURLConnection);
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), bytes.length);
                try {
                    bufferedOutputStream.write(bytes, 0, bytes.length);
                    bufferedOutputStream.close();
                    zza(httpURLConnection, zzaelVar, type);
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException | NullPointerException | JSONException e) {
                zzaelVar.zza(e.getMessage());
            }
        } catch (SocketTimeoutException unused) {
            zzaelVar.zza("TIMEOUT");
        } catch (UnknownHostException unused2) {
            zzaelVar.zza("<<Network Error>>");
        }
    }
}
