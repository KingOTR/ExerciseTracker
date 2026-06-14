package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaaj implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ zzade zzc;

    zzaaj(zzzk zzzkVar, String str, zzade zzadeVar) {
        this.zzb = str;
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
        zzagl zzaglVar2 = zzaglVar;
        zzagc zzagcVar = new zzagc(zzaglVar2.zzc());
        zzaejVar = this.zza.zza;
        zzaejVar.zza(zzagcVar, new zzaai(this, this, zzaglVar2, this.zzb, this.zzc));
    }
}
