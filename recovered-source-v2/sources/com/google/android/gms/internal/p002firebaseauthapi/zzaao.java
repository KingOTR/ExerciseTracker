package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.firebase.auth.internal.zzaq;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzaao implements zzael<zzafs> {
    private final /* synthetic */ zzade zza;
    private final /* synthetic */ zzaap zzb;

    zzaao(zzaap zzaapVar, zzade zzadeVar) {
        this.zza = zzadeVar;
        this.zzb = zzaapVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaem
    public final void zza(String str) {
        this.zza.zza(zzaq.zza(str));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzael
    public final /* synthetic */ void zza(zzafs zzafsVar) {
        zzafs zzafsVar2 = zzafsVar;
        this.zzb.zza.zza(new zzagl(zzafsVar2.zzb(), zzafsVar2.zza(), Long.valueOf(zzagn.zza(zzafsVar2.zza())), "Bearer"), null, null, false, null, this.zza, this);
    }
}
