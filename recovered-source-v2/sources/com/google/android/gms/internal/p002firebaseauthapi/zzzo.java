package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzzo implements zzael<zzagl> {
    private final /* synthetic */ EmailAuthCredential zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzade zzc;
    private final /* synthetic */ zzzk zzd;

    zzzo(zzzk zzzkVar, EmailAuthCredential emailAuthCredential, String str, zzade zzadeVar) {
        this.zza = emailAuthCredential;
        this.zzb = str;
        this.zzc = zzadeVar;
        this.zzd = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        this.zzd.zza(new zzafn(this.zza, zzaglVar.zzc(), this.zzb), this.zzc);
    }
}
