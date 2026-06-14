package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth.zza;
import com.google.firebase.auth.internal.zzbq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzn extends zzbq<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    @Override // com.google.firebase.auth.internal.zzbq
    public final Task<AuthResult> zza(String str) {
        zzabj zzabjVar;
        FirebaseApp firebaseApp;
        String str2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Creating user with " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for sign up with email " + this.zza);
        }
        zzabjVar = this.zzc.zze;
        firebaseApp = this.zzc.zza;
        String str3 = this.zza;
        String str4 = this.zzb;
        str2 = this.zzc.zzk;
        return zzabjVar.zza(firebaseApp, str3, str4, str2, str, this.zzc.new zza());
    }

    zzn(FirebaseAuth firebaseAuth, String str, String str2) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = firebaseAuth;
    }
}
