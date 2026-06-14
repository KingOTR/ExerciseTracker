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
import com.google.firebase.auth.internal.zzce;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzac extends zzbq<AuthResult> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    @Override // com.google.firebase.auth.internal.zzbq
    public final Task<AuthResult> zza(String str) {
        zzabj zzabjVar;
        FirebaseApp firebaseApp;
        zzabj zzabjVar2;
        FirebaseApp firebaseApp2;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Email link login/reauth with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for login/reauth with email link");
        }
        if (this.zza) {
            zzabjVar2 = this.zzd.zze;
            firebaseApp2 = this.zzd.zza;
            return zzabjVar2.zzb(firebaseApp2, (FirebaseUser) Preconditions.checkNotNull(this.zzb), this.zzc, str, (zzce) this.zzd.new zzb());
        }
        zzabjVar = this.zzd.zze;
        firebaseApp = this.zzd.zza;
        return zzabjVar.zza(firebaseApp, this.zzc, str, (com.google.firebase.auth.internal.zzj) this.zzd.new zza());
    }

    zzac(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        this.zzd = firebaseAuth;
    }
}
