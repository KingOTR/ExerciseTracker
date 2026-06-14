package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth.zzb;
import com.google.firebase.auth.internal.zzbq;
import com.google.firebase.auth.internal.zzce;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzab extends zzbq<Void> {
    private final /* synthetic */ boolean zza;
    private final /* synthetic */ FirebaseUser zzb;
    private final /* synthetic */ EmailAuthCredential zzc;
    private final /* synthetic */ FirebaseAuth zzd;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    /* JADX WARN: Type inference failed for: r9v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    @Override // com.google.firebase.auth.internal.zzbq
    public final Task<Void> zza(String str) {
        zzabj zzabjVar;
        FirebaseApp firebaseApp;
        zzabj zzabjVar2;
        FirebaseApp firebaseApp2;
        if (this.zza) {
            if (TextUtils.isEmpty(str)) {
                Log.i("FirebaseAuth", " Email link reauth with empty reCAPTCHA token");
            } else {
                Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with email link");
            }
            zzabjVar2 = this.zzd.zze;
            firebaseApp2 = this.zzd.zza;
            return zzabjVar2.zza(firebaseApp2, this.zzb, this.zzc, str, (zzce) this.zzd.new zzb());
        }
        String zzc = this.zzc.zzc();
        String zzd = this.zzc.zzd();
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Reauthenticating " + zzc + " with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for reauth with " + zzc);
        }
        zzabjVar = this.zzd.zze;
        firebaseApp = this.zzd.zza;
        return zzabjVar.zza(firebaseApp, this.zzb, zzc, Preconditions.checkNotEmpty(zzd), this.zzb.getTenantId(), str, this.zzd.new zzb());
    }

    zzab(FirebaseAuth firebaseAuth, boolean z, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = z;
        this.zzb = firebaseUser;
        this.zzc = emailAuthCredential;
        this.zzd = firebaseAuth;
    }
}
