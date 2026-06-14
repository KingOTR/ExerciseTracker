package org.osmdroid.tileprovider.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.provider.Settings;
import android.util.Log;
import androidx.browser.trusted.sharing.ShareTarget;
import com.google.common.net.HttpHeaders;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import org.osmdroid.api.IMapView;
import org.osmdroid.config.Configuration;

/* loaded from: classes5.dex */
public class CloudmadeUtil {
    private static final String CLOUDMADE_ID = "CLOUDMADE_ID";
    private static final String CLOUDMADE_KEY = "CLOUDMADE_KEY";
    private static final String CLOUDMADE_TOKEN = "CLOUDMADE_TOKEN";
    public static boolean DEBUGMODE = false;
    private static String mAndroidId = "android_id";
    private static String mKey = "";
    private static SharedPreferences.Editor mPreferenceEditor = null;
    private static String mToken = "";

    public static void retrieveCloudmadeKey(Context context) {
        mAndroidId = Settings.Secure.getString(context.getContentResolver(), "android_id");
        mKey = ManifestUtil.retrieveKey(context, CLOUDMADE_KEY);
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        mPreferenceEditor = defaultSharedPreferences.edit();
        if (!defaultSharedPreferences.getString(CLOUDMADE_ID, "").equals(mAndroidId)) {
            mPreferenceEditor.putString(CLOUDMADE_ID, mAndroidId);
            mPreferenceEditor.commit();
            return;
        }
        String string = defaultSharedPreferences.getString(CLOUDMADE_TOKEN, "");
        mToken = string;
        if (string.length() > 0) {
            mPreferenceEditor = null;
        }
    }

    public static String getCloudmadeKey() {
        return mKey;
    }

    public static void setCloudmadeKey(String str) {
        mKey = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0131, code lost:
    
        if (r3 == 0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0133, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016a, code lost:
    
        if (r3 != 0) goto L100;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0167 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0162 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[Catch: all -> 0x0180, SYNTHETIC, TRY_ENTER, TryCatch #0 {, blocks: (B:6:0x000d, B:8:0x0015, B:48:0x0129, B:44:0x012e, B:40:0x0133, B:85:0x0170, B:81:0x0175, B:73:0x017a, B:74:0x017d, B:64:0x0162, B:60:0x0167, B:107:0x017e), top: B:5:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0175 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0170 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25, types: [java.io.InputStreamReader, java.io.Reader] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.io.InputStreamReader] */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [java.io.InputStreamReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getCloudmadeToken() {
        BufferedReader bufferedReader;
        Throwable th;
        ?? r3;
        IOException iOException;
        if (mToken.length() == 0) {
            synchronized (mToken) {
                if (mToken.length() == 0) {
                    HttpURLConnection httpURLConnection = null;
                    BufferedReader bufferedReader2 = null;
                    httpURLConnection = null;
                    try {
                        HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL("https://auth.cloudmade.com/token/" + mKey + "?userid=" + mAndroidId).openConnection();
                        try {
                            httpURLConnection2.setDoOutput(true);
                            httpURLConnection2.setRequestMethod("POST");
                            httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_TYPE, ShareTarget.ENCODING_TYPE_URL_ENCODED);
                            httpURLConnection2.setRequestProperty(Configuration.getInstance().getUserAgentHttpHeader(), Configuration.getInstance().getUserAgentValue());
                            for (Map.Entry<String, String> entry : Configuration.getInstance().getAdditionalHttpRequestProperties().entrySet()) {
                                httpURLConnection2.setRequestProperty(entry.getKey(), entry.getValue());
                            }
                            httpURLConnection2.connect();
                            if (DEBUGMODE) {
                                Log.d(IMapView.LOGTAG, "Response from Cloudmade auth: " + httpURLConnection2.getResponseMessage());
                            }
                            if (httpURLConnection2.getResponseCode() == 200) {
                                r3 = new InputStreamReader(httpURLConnection2.getInputStream(), "UTF-8");
                                try {
                                    bufferedReader = new BufferedReader(r3, 8192);
                                    try {
                                        String readLine = bufferedReader.readLine();
                                        if (DEBUGMODE) {
                                            Log.d(IMapView.LOGTAG, "First line from Cloudmade auth: " + readLine);
                                        }
                                        String trim = readLine.trim();
                                        mToken = trim;
                                        if (trim.length() > 0) {
                                            mPreferenceEditor.putString(CLOUDMADE_TOKEN, mToken);
                                            mPreferenceEditor.commit();
                                            mPreferenceEditor = null;
                                        } else {
                                            Log.e(IMapView.LOGTAG, "No authorization token received from Cloudmade");
                                        }
                                        bufferedReader2 = bufferedReader;
                                        r3 = r3;
                                    } catch (IOException e) {
                                        httpURLConnection = httpURLConnection2;
                                        iOException = e;
                                        r3 = r3;
                                        try {
                                            Log.e(IMapView.LOGTAG, "No authorization token received from Cloudmade: " + iOException);
                                            if (httpURLConnection != null) {
                                                try {
                                                    httpURLConnection.disconnect();
                                                } catch (Exception unused) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Exception unused2) {
                                                }
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (httpURLConnection != null) {
                                                try {
                                                    httpURLConnection.disconnect();
                                                } catch (Exception unused3) {
                                                }
                                            }
                                            if (bufferedReader != null) {
                                                try {
                                                    bufferedReader.close();
                                                } catch (Exception unused4) {
                                                }
                                            }
                                            if (r3 != 0) {
                                                try {
                                                    r3.close();
                                                    throw th;
                                                } catch (Exception unused5) {
                                                    throw th;
                                                }
                                            }
                                            throw th;
                                        }
                                    } catch (Throwable th3) {
                                        httpURLConnection = httpURLConnection2;
                                        th = th3;
                                        if (httpURLConnection != null) {
                                        }
                                        if (bufferedReader != null) {
                                        }
                                        if (r3 != 0) {
                                        }
                                    }
                                } catch (IOException e2) {
                                    httpURLConnection = httpURLConnection2;
                                    iOException = e2;
                                    bufferedReader = null;
                                    r3 = r3;
                                } catch (Throwable th4) {
                                    httpURLConnection = httpURLConnection2;
                                    th = th4;
                                    bufferedReader = null;
                                }
                            } else {
                                r3 = 0;
                            }
                            if (httpURLConnection2 != null) {
                                try {
                                    httpURLConnection2.disconnect();
                                } catch (Exception unused6) {
                                }
                            }
                            if (bufferedReader2 != null) {
                                try {
                                    bufferedReader2.close();
                                } catch (Exception unused7) {
                                }
                            }
                        } catch (IOException e3) {
                            e = e3;
                            bufferedReader = null;
                            httpURLConnection = httpURLConnection2;
                            iOException = e;
                            r3 = bufferedReader;
                            Log.e(IMapView.LOGTAG, "No authorization token received from Cloudmade: " + iOException);
                            if (httpURLConnection != null) {
                            }
                            if (bufferedReader != null) {
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            bufferedReader = null;
                            httpURLConnection = httpURLConnection2;
                            th = th;
                            r3 = bufferedReader;
                            if (httpURLConnection != null) {
                            }
                            if (bufferedReader != null) {
                            }
                            if (r3 != 0) {
                            }
                        }
                    } catch (IOException e4) {
                        e = e4;
                        bufferedReader = null;
                    } catch (Throwable th6) {
                        th = th6;
                        bufferedReader = null;
                    }
                }
            }
        }
        return mToken;
    }
}
