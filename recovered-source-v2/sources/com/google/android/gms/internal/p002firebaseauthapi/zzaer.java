package com.google.android.gms.internal.p002firebaseauthapi;

import android.app.Activity;
import androidx.collection.ArrayMap;
import com.example.rungps.nfc.GymNfcConfig;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzaer {
    private static final Map<String, zzaet> zza = new ArrayMap();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzady zzadyVar) {
        zza(str, zzadyVar);
        return new zzaeu(onVerificationStateChangedCallbacks, str);
    }

    public static void zza() {
        zza.clear();
    }

    private static void zza(String str, zzady zzadyVar) {
        zza.put(str, new zzaet(zzadyVar, DefaultClock.getInstance().currentTimeMillis()));
    }

    public static boolean zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        Map<String, zzaet> map = zza;
        if (map.containsKey(str)) {
            zzaet zzaetVar = map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzaetVar.zzb < GymNfcConfig.DEFAULT_SAVER_POLL_MS) {
                if (zzaetVar.zza == null) {
                    return true;
                }
                zzaetVar.zza.zza(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            zza(str, null);
            return false;
        }
        zza(str, null);
        return false;
    }
}
