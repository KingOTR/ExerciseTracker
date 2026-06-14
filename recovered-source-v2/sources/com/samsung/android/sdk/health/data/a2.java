package com.samsung.android.sdk.health.data;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.samsung.android.sdk.health.data.error.AuthorizationException;
import com.samsung.android.sdk.health.data.error.ErrorCode;
import com.samsung.android.sdk.health.data.error.PlatformInternalException;
import com.samsung.android.sdk.health.data.error.ResolvablePlatformException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes5.dex */
public abstract class a2 {
    public static final String[] a = {"ED:A1:B6:F8:11:61:62:5E:A9:DE:48:DB:2B:A8:D0:68:85:D3:92:B9:07:F3:48:F6:C0:1D:2E:6C:A4:20:78:8C", "A4:0D:A8:0A:59:D1:70:CA:A9:50:CF:15:C1:8C:45:4D:47:A3:9B:26:98:9D:8B:64:0E:CD:74:5B:A7:1B:F5:DC", "B9:A4:2D:D5:FC:4E:05:48:89:AE:41:27:A6:27:4C:EC:64:E7:5C:41:73:3D:42:F5:99:1E:70:19:F9:EA:5C:AF", "34:DF:0E:7A:9F:1C:F1:89:2E:45:C0:56:B4:97:3C:D8:1C:CF:14:8A:40:50:D1:1A:EA:4A:C5:A6:5F:90:0A:42"};
    public static final String[] b = {"B9:A4:2D:D5:FC:4E:05:48:89:AE:41:27:A6:27:4C:EC:64:E7:5C:41:73:3D:42:F5:99:1E:70:19:F9:EA:5C:AF", "34:DF:0E:7A:9F:1C:F1:89:2E:45:C0:56:B4:97:3C:D8:1C:CF:14:8A:40:50:D1:1A:EA:4A:C5:A6:5F:90:0A:42"};

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: Exception -> 0x003b, TryCatch #0 {Exception -> 0x003b, blocks: (B:5:0x000e, B:7:0x0018, B:10:0x0021, B:11:0x0026, B:15:0x002f, B:16:0x003a, B:18:0x0024), top: B:4:0x000e, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(Context context) {
        String[] strArr;
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.sec.android.app.shealth", 64);
            try {
                String str = Build.TYPE;
                if (!str.equalsIgnoreCase("eng") && !str.equalsIgnoreCase("userdebug")) {
                    strArr = b;
                    if (a(packageInfo.signatures, strArr)) {
                        throw new AuthorizationException(Integer.valueOf(ErrorCode.ERR_INVALID_PLATFORM_SIGNATURE), "Samsung Health signature is not matched");
                    }
                    return;
                }
                strArr = a;
                if (a(packageInfo.signatures, strArr)) {
                }
            } catch (Exception unused) {
                throw new AuthorizationException(Integer.valueOf(ErrorCode.ERR_INVALID_PLATFORM_SIGNATURE), "Problem with Samsung Health signature matching");
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            throw new ResolvablePlatformException(3000, "Samsung Health is not installed", a.b(context));
        } catch (Exception e) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), (String) Objects.requireNonNull(e.getMessage()), e);
        }
    }

    public static Executor a(final Looper looper) {
        return new Executor() { // from class: com.samsung.android.sdk.health.data.a2$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                new Handler(looper).post(runnable);
            }
        };
    }

    public static void a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo("com.sec.android.app.shealth", 0);
            Intent intent = new Intent("com.samsung.android.sdk.health.data.BIND");
            intent.setPackage("com.sec.android.app.shealth");
            if (packageManager.resolveService(intent, 0) != null) {
                if (!packageInfo.applicationInfo.enabled) {
                    throw new ResolvablePlatformException(3002, "Samsung Health is disabled", true);
                }
                return;
            }
            throw new PlatformInternalException(3001, "Samsung Health version is too old to support SDK");
        } catch (PackageManager.NameNotFoundException unused) {
            throw new ResolvablePlatformException(3000, "Samsung Health is not installed", a.b(context));
        } catch (Exception e) {
            throw new PlatformInternalException(Integer.valueOf(ErrorCode.ERR_INTERNAL_ERROR), (String) Objects.requireNonNull(e.getMessage()), e);
        }
    }

    public static boolean a(Signature[] signatureArr, String[] strArr) {
        for (Signature signature : signatureArr) {
            for (String str : strArr) {
                try {
                    if (str.equals(g0.a(signature))) {
                        return true;
                    }
                } catch (NoSuchAlgorithmException | CertificateException e) {
                    Log.e("[SHD]ServiceUtil", "Comparing signatures fails: " + e.getMessage());
                    return false;
                }
            }
        }
        if (signatureArr.length > 0) {
            for (Signature signature2 : signatureArr) {
                int length = signature2.toCharsString().length();
                Log.w("[SHD]ServiceUtil", "Signature : " + signature2.toCharsString().substring(length - 5, length));
            }
        } else {
            Log.w("[SHD]ServiceUtil", "No signatures");
        }
        return false;
    }
}
