package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzze {
    private final zzzc zza;

    public final int zza() {
        return this.zza.zza();
    }

    public static zzze zza(byte[] bArr, zzcn zzcnVar) {
        if (zzcnVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return new zzze(zzzc.zza(bArr));
    }

    public static zzze zza(int i) {
        return new zzze(zzzc.zza(zzpe.zza(i)));
    }

    private zzze(zzzc zzzcVar) {
        this.zza = zzzcVar;
    }

    public final byte[] zza(zzcn zzcnVar) {
        if (zzcnVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.zza.zzb();
    }
}
