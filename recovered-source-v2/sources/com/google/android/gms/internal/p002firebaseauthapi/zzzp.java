package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzzp implements zzael<zzahx> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    zzzp(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahx zzahxVar) {
        zzahx zzahxVar2 = zzahxVar;
        if (zzahxVar2.zzf()) {
            this.zza.zza(new zzzl(zzahxVar2.zzc(), zzahxVar2.zze(), null));
        } else {
            this.zzb.zza(new zzagl(zzahxVar2.zzd(), zzahxVar2.zzb(), Long.valueOf(zzahxVar2.zza()), "Bearer"), null, null, false, null, this.zza, this);
        }
    }
}
