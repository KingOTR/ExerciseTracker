package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakv implements zzald {
    private zzald[] zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final zzala zza(Class<?> cls) {
        for (zzald zzaldVar : this.zza) {
            if (zzaldVar.zzb(cls)) {
                return zzaldVar.zza(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: " + cls.getName());
    }

    zzakv(zzald... zzaldVarArr) {
        this.zza = zzaldVarArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final boolean zzb(Class<?> cls) {
        for (zzald zzaldVar : this.zza) {
            if (zzaldVar.zzb(cls)) {
                return true;
            }
        }
        return false;
    }
}
