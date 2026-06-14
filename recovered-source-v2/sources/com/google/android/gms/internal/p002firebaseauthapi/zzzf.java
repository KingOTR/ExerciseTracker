package com.google.android.gms.internal.p002firebaseauthapi;

import java.math.BigInteger;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzzf {
    private final BigInteger zza;

    public static zzzf zza(BigInteger bigInteger, zzcn zzcnVar) {
        if (zzcnVar != null) {
            return new zzzf(bigInteger);
        }
        throw new NullPointerException("SecretKeyAccess required");
    }

    public final BigInteger zza(zzcn zzcnVar) {
        if (zzcnVar == null) {
            throw new NullPointerException("SecretKeyAccess required");
        }
        return this.zza;
    }

    private zzzf(BigInteger bigInteger) {
        this.zza = bigInteger;
    }
}
