package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzec extends zzcw {
    private final int zza;
    private final zza zzb;

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zzb {

        @Nullable
        private Integer zza;
        private zza zzb;

        public final zzb zza(int i) throws GeneralSecurityException {
            if (i != 16 && i != 32) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
            }
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zzb zza(zza zzaVar) {
            this.zzb = zzaVar;
            return this;
        }

        public final zzec zza() throws GeneralSecurityException {
            if (this.zza == null) {
                throw new GeneralSecurityException("Key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            return new zzec(this.zza.intValue(), this.zzb);
        }

        private zzb() {
            this.zza = null;
            this.zzb = zza.zzc;
        }
    }

    public final int zzb() {
        return this.zza;
    }

    public final int hashCode() {
        return Objects.hash(zzec.class, Integer.valueOf(this.zza), this.zzb);
    }

    public static zzb zzc() {
        return new zzb();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza {
        public static final zza zza = new zza("TINK");
        public static final zza zzb = new zza("CRUNCHY");
        public static final zza zzc = new zza("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zza(String str) {
            this.zzd = str;
        }
    }

    public final zza zzd() {
        return this.zzb;
    }

    public final String toString() {
        return "AesGcmSiv Parameters (variant: " + String.valueOf(this.zzb) + ", " + this.zza + "-byte key)";
    }

    private zzec(int i, zza zzaVar) {
        this.zza = i;
        this.zzb = zzaVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzec)) {
            return false;
        }
        zzec zzecVar = (zzec) obj;
        return zzecVar.zza == this.zza && zzecVar.zzb == this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzb != zza.zzc;
    }
}
