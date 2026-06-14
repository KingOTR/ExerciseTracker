package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzabf implements zzael<zzagl> {
    private final /* synthetic */ String zza;
    private final /* synthetic */ zzade zzb;
    private final /* synthetic */ zzzk zzc;

    zzabf(zzzk zzzkVar, String str, zzade zzadeVar) {
        this.zza = str;
        this.zzb = zzadeVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzagl zzaglVar) {
        zzagl zzaglVar2 = zzaglVar;
        String zzc = zzaglVar2.zzc();
        zzahb zzahbVar = new zzahb();
        zzahbVar.zzd(zzc).zzf(this.zza);
        zzzk.zza(this.zzc, this.zzb, zzaglVar2, zzahbVar, this);
    }
}
