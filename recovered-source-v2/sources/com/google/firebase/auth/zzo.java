package com.google.firebase.auth;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.p002firebaseauthapi.zzabj;
import com.google.android.gms.tasks.Task;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.FirebaseAuth.zzb;
import com.google.firebase.auth.internal.zzbq;
import com.google.firebase.auth.internal.zzce;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes4.dex */
final class zzo extends zzbq<AuthResult> {
    private final /* synthetic */ FirebaseUser zza;
    private final /* synthetic */ EmailAuthCredential zzb;
    private final /* synthetic */ FirebaseAuth zzc;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [com.google.firebase.auth.FirebaseAuth$zzb, com.google.firebase.auth.internal.zzce] */
    @Override // com.google.firebase.auth.internal.zzbq
    public final Task<AuthResult> zza(String str) {
        zzabj zzabjVar;
        FirebaseApp firebaseApp;
        if (TextUtils.isEmpty(str)) {
            Log.i("FirebaseAuth", "Linking email account with empty reCAPTCHA token");
        } else {
            Log.i("FirebaseAuth", "Got reCAPTCHA token for linking email account");
        }
        zzabjVar = this.zzc.zze;
        firebaseApp = this.zzc.zza;
        return zzabjVar.zza(firebaseApp, this.zza, (AuthCredential) this.zzb, str, (zzce) this.zzc.new zzb());
    }

    zzo(FirebaseAuth firebaseAuth, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential) {
        this.zza = firebaseUser;
        this.zzb = emailAuthCredential;
        this.zzc = firebaseAuth;
    }
}
