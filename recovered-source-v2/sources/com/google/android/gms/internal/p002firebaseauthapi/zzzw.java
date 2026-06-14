package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzzw implements zzael<zzahv> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzzk zzb;

    zzzw(zzzk zzzkVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahv zzahvVar) {
        zzahv zzahvVar2 = zzahvVar;
        this.zzb.zza(new zzagl(zzahvVar2.zzc(), zzahvVar2.zzb(), Long.valueOf(zzahvVar2.zza()), "Bearer"), null, null, Boolean.valueOf(zzahvVar2.zzd()), null, this.zza, this);
    }
}
