package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.internal.zzbq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzq extends zzbq<Void> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ ActionCodeSettings zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    @Override // com.google.firebase.auth.internal.zzbq
    public final Task<Void> zza(String str) {
        zzabj zzabjVar;
        FirebaseApp firebaseApp;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Password reset request " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for password reset of email " + this.zza);
        }
        zzabjVar = this.zzc.zze;
        firebaseApp = this.zzc.zza;
        String str3 = this.zza;
        ActionCodeSettings actionCodeSettings = this.zzb;
        str2 = this.zzc.zzk;
        return zzabjVar.zza(firebaseApp, str3, actionCodeSettings, str2, str);
    }

    zzq(FirebaseAuth firebaseAuth, String str, ActionCodeSettings actionCodeSettings) {
        this.zza = str;
        this.zzb = actionCodeSettings;
        this.zzc = firebaseAuth;
    }
}
