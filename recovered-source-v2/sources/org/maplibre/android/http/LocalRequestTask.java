package org.maplibre.android.http;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import java.io.IOException;
import java.io.InputStream;
import org.maplibre.android.MapLibre;
import org.maplibre.android.MapStrictMode;
import org.maplibre.android.log.Logger;

/* loaded from: classes5.dex */
class LocalRequestTask extends AsyncTask<String, Void, byte[]> {
    private static final String TAG = "Mbgl-LocalRequestTask";
    private OnLocalRequestResponse requestResponse;

    public interface OnLocalRequestResponse {
        void onResponse(byte[] bArr);
    }

    LocalRequestTask(OnLocalRequestResponse onLocalRequestResponse) {
        this.requestResponse = onLocalRequestResponse;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public byte[] doInBackground(String... strArr) {
        return loadFile(MapLibre.getApplicationContext().getAssets(), "integration/" + strArr[0].substring(8).replaceAll("%20", " ").replaceAll("%2c", ","));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    public void onPostExecute(byte[] bArr) {
        OnLocalRequestResponse onLocalRequestResponse;
        super.onPostExecute((LocalRequestTask) bArr);
        if (bArr == null || (onLocalRequestResponse = this.requestResponse) == null) {
            return;
        }
        onLocalRequestResponse.onResponse(bArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v6 */
    private static byte[] loadFile(AssetManager assetManager, String str) {
        byte[] bArr;
        InputStream open;
        ?? r0 = 0;
        byte[] bArr2 = null;
        InputStream inputStream = null;
        try {
            try {
                open = assetManager.open(str);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e) {
            e = e;
            bArr = null;
        }
        try {
            bArr2 = new byte[open.available()];
            open.read(bArr2);
            r0 = bArr2;
            if (open != null) {
                try {
                    open.close();
                    r0 = bArr2;
                } catch (IOException e2) {
                    logFileError(e2);
                    r0 = bArr2;
                }
            }
        } catch (IOException e3) {
            e = e3;
            byte[] bArr3 = bArr2;
            inputStream = open;
            bArr = bArr3;
            logFileError(e);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    logFileError(e4);
                }
            }
            r0 = bArr;
            return r0;
        } catch (Throwable th2) {
            th = th2;
            r0 = open;
            if (r0 != 0) {
                try {
                    r0.close();
                } catch (IOException e5) {
                    logFileError(e5);
                }
            }
            throw th;
        }
        return r0;
    }

    private static void logFileError(Exception exc) {
        Logger.e(TAG, "Load file failed", exc);
        MapStrictMode.strictModeViolation("Load file failed", exc);
    }
}
