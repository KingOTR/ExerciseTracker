package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaad implements zzael<zzahf> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzaem zzb;
    private final /* synthetic */ zzzk zzc;

    zzaad(zzzk zzzkVar, zzade zzadeVar, zzaem zzaemVar) {
        this.zza = zzadeVar;
        this.zzb = zzaemVar;
        this.zzc = zzzkVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zzb.zza(str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzahf zzahfVar) {
        zzahf zzahfVar2 = zzahfVar;
        this.zzc.zza(new zzagl(zzahfVar2.zzc(), zzahfVar2.zzb(), Long.valueOf(zzahfVar2.zza()), "Bearer"), null, "password", false, null, this.zza, this);
    }
}
