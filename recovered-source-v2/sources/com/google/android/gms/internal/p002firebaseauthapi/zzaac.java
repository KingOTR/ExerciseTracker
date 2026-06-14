package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaac implements zzael<zzagl> {
    final /* synthetic */ zzzk zza;
    private final /* synthetic */ zzaia zzb;
    private final /* synthetic */ zzade zzc;

    zzaac(zzzk zzzkVar, zzaia zzaiaVar, zzade zzadeVar) {
        this.zzb = zzaiaVar;
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
        zzaejVar.zza(this.zzb, new zzaaf(this, this.zzc, this));
    }
}
