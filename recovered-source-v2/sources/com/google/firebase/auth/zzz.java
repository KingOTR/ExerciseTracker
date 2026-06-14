package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth.zza;
import com.google.firebase.auth.FirebaseAuth.zzb;
import com.google.firebase.auth.internal.zzbq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzz extends zzbq<AuthResult> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ boolean zzb;
    private final /* synthetic */ FirebaseUser zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ FirebaseAuth zzf;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    @Override // com.google.firebase.auth.internal.zzbq
    public final Task<AuthResult> zza(String str) {
        zzabj zzabjVar;
        FirebaseApp firebaseApp;
        zzabj zzabjVar2;
        FirebaseApp firebaseApp2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Logging in as " + this.zza + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login with email " + this.zza);
        }
        if (this.zzb) {
            zzabjVar2 = this.zzf.zze;
            firebaseApp2 = this.zzf.zza;
            return zzabjVar2.zzb(firebaseApp2, (FirebaseUser) Preconditions.checkNotNull(this.zzc), this.zza, this.zzd, this.zze, str, this.zzf.new zzb());
        }
        zzabjVar = this.zzf.zze;
        firebaseApp = this.zzf.zza;
        return zzabjVar.zzb(firebaseApp, this.zza, this.zzd, this.zze, str, this.zzf.new zza());
    }

    zzz(FirebaseAuth firebaseAuth, String str, boolean z, FirebaseUser firebaseUser, String str2, String str3) {
        this.zza = str;
        this.zzb = z;
        this.zzc = firebaseUser;
        this.zzd = str2;
        this.zze = str3;
        this.zzf = firebaseAuth;
    }
}
