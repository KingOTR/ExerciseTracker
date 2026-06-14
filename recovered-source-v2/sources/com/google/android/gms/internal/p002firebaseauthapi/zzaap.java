package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaap implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ zzafp zzb;
    private final /* synthetic */ zzade zzc;

    zzaap(zzzk zzzkVar, zzafp zzafpVar, zzade zzadeVar) {
        this.zzb = zzafpVar;
        this.zzc = zzadeVar;
        this.zza = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzc.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzaej zzaejVar;
        this.zzb.zza(zzaglVar.zzc());
        zzaejVar = this.zza.zza;
        zzaejVar.zza(this.zzb, new zzaao(this, this.zzc));
    }
}
