package com.google.android.gms.internal.p002firebaseauthapi;

import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public enum zzvf implements zzaka {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);

    private final int zzh;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzvf zza(int i) {
        if (i == 0) {
            return KEM_UNKNOWN;
        }
        if (i == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=").append(zza());
        }
        return sb.append(" name=").append(name()).append(Typography.greater).toString();
    }

    zzvf(int i) {
        this.zzh = i;
    }
}
