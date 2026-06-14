package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzzm implements zzael<zzahf> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    zzzm(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahf zzahfVar) {
        zzahf zzahfVar2 = zzahfVar;
        this.zzb.zza(new zzagl(zzahfVar2.zzc(), zzahfVar2.zzb(), Long.valueOf(zzahfVar2.zza()), "Bearer"), null, null, true, null, this.zza, this);
    }
}
