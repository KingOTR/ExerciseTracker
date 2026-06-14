package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzab extends zzae {
    private final /* synthetic */ zzo zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zza(int i) {
        return this.zzb.zza();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzae
    public final int zzb(int i) {
        if (this.zzb.zza(i)) {
            return this.zzb.zzb();
        }
        return -1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzab(zzac zzacVar, zzx zzxVar, CharSequence charSequence, zzo zzoVar) {
        super(zzxVar, charSequence);
        this.zzb = zzoVar;
    }
}
