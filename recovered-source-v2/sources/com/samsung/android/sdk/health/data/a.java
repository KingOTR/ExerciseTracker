package com.samsung.android.sdk.health.data;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.Pair;
import androidx.exifinterface.media.ExifInterface;
import androidx.webkit.ProxyConfig;
import coil.disk.DiskLruCache;
import com.google.common.net.HttpHeaders;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.security.SecureRandom;
import java.util.concurrent.TimeUnit;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserFactory;

/* loaded from: classes5.dex */
public abstract class a {
    public static final long a = TimeUnit.DAYS.toMillis(3) + new SecureRandom().nextInt(259200000);

    public static boolean b(Context context) {
        try {
            long j = context.getSharedPreferences("SAMSUNGHEALTH_SDK_SHARED_PREFERENCES", 0).getLong("SAMSUNGHEALTH_SDK_INFO_CHECKED_TIME", 0L);
            if (System.currentTimeMillis() - j <= a) {
                return context.getSharedPreferences("SAMSUNGHEALTH_SDK_SHARED_PREFERENCES", 0).getBoolean("SAMSUNGHEALTH_SDK_INFO_DOWNLOADABLE", true);
            }
            Log.d("[SHD]AppStoreUtil", "serverCheckExpired() timeout " + j);
            boolean b = b(a(context));
            a(context, System.currentTimeMillis(), b);
            return b;
        } catch (MalformedURLException unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002a, code lost:
    
        if (r4 != null) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0074 A[Catch: IOException -> 0x0077, TRY_LEAVE, TryCatch #0 {IOException -> 0x0077, blocks: (B:40:0x006f, B:35:0x0074), top: B:39:0x006f }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [java.net.URL] */
    /* JADX WARN: Type inference failed for: r4v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean b(URL url) {
        String str;
        HttpURLConnection httpURLConnection;
        InputStream inputStream = null;
        try {
            try {
                try {
                    httpURLConnection = a((URL) url);
                    try {
                        inputStream = httpURLConnection.getInputStream();
                        str = a(inputStream);
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    } catch (Exception e) {
                        e = e;
                        Log.e("[SHD]AppStoreUtil", "Failed to check update", e);
                        str = "N/A";
                        if (inputStream != null) {
                            inputStream.close();
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (0 != 0) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            throw th;
                        }
                    }
                    if (url != 0) {
                        url.disconnect();
                    }
                    throw th;
                }
            } catch (Exception e2) {
                e = e2;
                httpURLConnection = null;
            } catch (Throwable th2) {
                th = th2;
                url = 0;
                if (0 != 0) {
                }
                if (url != 0) {
                }
                throw th;
            }
            httpURLConnection.disconnect();
        } catch (IOException unused2) {
        }
        boolean z = DiskLruCache.VERSION.equals(str) || ExifInterface.GPS_MEASUREMENT_2D.equals(str);
        Log.d("[SHD]AppStoreUtil", "Downloading Samsung Health is " + (z ? "" : "un") + "available (" + str + ")");
        return z;
    }

    public static HttpURLConnection a(URL url) {
        HttpURLConnection httpURLConnection;
        boolean z;
        int i = 0;
        do {
            httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                z = false;
            } else {
                String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
                if (headerField != null) {
                    url = new URL(httpURLConnection.getURL(), headerField.replace("http://", "https://"));
                }
                httpURLConnection.disconnect();
                if ((!url.getProtocol().equals(ProxyConfig.MATCH_HTTP) && !url.getProtocol().equals(ProxyConfig.MATCH_HTTPS)) || i >= 5) {
                    throw new SecurityException("Illegal URL redirect");
                }
                i++;
                z = true;
            }
        } while (z);
        return httpURLConnection;
    }

    public static void a(Context context, long j, boolean z) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("SAMSUNGHEALTH_SDK_SHARED_PREFERENCES", 0);
        sharedPreferences.edit().putLong("SAMSUNGHEALTH_SDK_INFO_CHECKED_TIME", j).apply();
        sharedPreferences.edit().putBoolean("SAMSUNGHEALTH_SDK_INFO_DOWNLOADABLE", z).apply();
        Log.d("[SHD]AppStoreUtil", "saveInfo() " + j + ", " + z);
    }

    public static URL a(Context context) {
        String str;
        String str2;
        String str3;
        String str4;
        String simOperator;
        String str5 = "FAIL";
        String str6 = Build.MODEL;
        String str7 = "";
        if (str6.startsWith("OMAP_SS")) {
            File file = new File("/system/version");
            if (file.isFile()) {
                try {
                    InputStream newInputStream = Files.newInputStream(file.toPath(), new OpenOption[0]);
                    try {
                        byte[] bArr = new byte[128];
                        int read = newInputStream.read(bArr);
                        String str8 = read > 0 ? new String(bArr, 0, read, StandardCharsets.US_ASCII) : "";
                        try {
                            newInputStream.close();
                        } catch (IOException unused) {
                        }
                        str6 = str8;
                    } finally {
                    }
                } catch (IOException unused2) {
                }
            }
            str6 = "";
        } else if (str6.startsWith("SAMSUNG-")) {
            str6 = str6.substring(8);
        }
        TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
        if (telephonyManager == null || (simOperator = telephonyManager.getSimOperator()) == null || simOperator.length() <= 3) {
            str = "";
            str2 = str;
        } else {
            str2 = simOperator.substring(0, 3);
            str = simOperator.substring(3);
        }
        Pair pair = new Pair(str2, str);
        String packageName = context.getPackageName();
        try {
            str7 = Integer.toString(context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
            str3 = Integer.toString(context.getPackageManager().getPackageInfo("com.sec.android.app.shealth", 0).versionCode);
        } catch (PackageManager.NameNotFoundException unused3) {
            str3 = "0";
        }
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(ProxyConfig.MATCH_HTTPS);
        builder.authority("vas.samsungapps.com").path("stub/stubUpdateCheck.as");
        long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        Uri.Builder appendQueryParameter = builder.appendQueryParameter("appId", "com.sec.android.app.shealth").appendQueryParameter("callerId", packageName).appendQueryParameter("callerVersion", str7).appendQueryParameter("callerType", "shdSdk").appendQueryParameter("callerSdkVersion", Integer.toString(BuildConfig.SDK_VERSION_CODE)).appendQueryParameter("versionCode", str3).appendQueryParameter("deviceId", str6);
        try {
            Class<?> cls = Class.forName("android.os.SemSystemProperties");
            str5 = (String) cls.getMethod("getSalesCode", new Class[0]).invoke(cls, new Object[0]);
        } catch (RuntimeException | Exception unused4) {
        }
        if (str5 == null || str5.isEmpty()) {
            str5 = "NONE";
        }
        Uri.Builder appendQueryParameter2 = appendQueryParameter.appendQueryParameter("csc", str5).appendQueryParameter("cc", "NA").appendQueryParameter("sdkVer", Integer.toString(Build.VERSION.SDK_INT)).appendQueryParameter("systemId", Long.toString(currentTimeMillis));
        if (Build.SUPPORTED_64_BIT_ABIS.length > 0) {
            str4 = "64";
        } else if (Build.SUPPORTED_32_BIT_ABIS.length > 0) {
            str4 = "32";
        } else {
            str4 = "ex";
        }
        appendQueryParameter2.appendQueryParameter("abiType", str4).appendQueryParameter("extuk", Long.toString(currentTimeMillis)).appendQueryParameter("mcc", (String) pair.first).appendQueryParameter("mnc", (String) pair.second).appendQueryParameter("pd", "0");
        String uri = builder.build().toString();
        Log.d("[SHD]AppStoreUtil", "Server URL : " + uri);
        return new URL(uri);
    }

    public static String a(InputStream inputStream) {
        XmlPullParser newPullParser = XmlPullParserFactory.newInstance().newPullParser();
        newPullParser.setInput(inputStream, null);
        String str = "";
        for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
            if (eventType == 2 && "resultCode".equals(newPullParser.getName()) && newPullParser.next() == 4) {
                str = newPullParser.getText();
            }
        }
        return str;
    }
}
