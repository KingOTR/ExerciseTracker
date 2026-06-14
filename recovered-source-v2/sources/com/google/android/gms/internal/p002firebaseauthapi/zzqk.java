package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzqk extends zzqn {
    private final int zza;
    private final int zzb;
    private final zzb zzc;
    private final zzc zzd;

    public final int zzb() {
        return this.zzb;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza {

        @Nullable
        private Integer zza;

        @Nullable
        private Integer zzb;
        private zzc zzc;
        private zzb zzd;

        public final zza zza(zzc zzcVar) {
            this.zzc = zzcVar;
            return this;
        }

        public final zza zza(int i) throws GeneralSecurityException {
            this.zza = Integer.valueOf(i);
            return this;
        }

        public final zza zzb(int i) throws GeneralSecurityException {
            this.zzb = Integer.valueOf(i);
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzd = zzbVar;
            return this;
        }

        public final zzqk zza() throws GeneralSecurityException {
            Integer num = this.zza;
            if (num == null) {
                throw new GeneralSecurityException("key size is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("tag size is not set");
            }
            if (this.zzc == null) {
                throw new GeneralSecurityException("hash type is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("variant is not set");
            }
            if (num.intValue() < 16) {
                throw new InvalidAlgorithmParameterException(String.format("Invalid key size in bytes %d; must be at least 16 bytes", this.zza));
            }
            int intValue = this.zzb.intValue();
            zzc zzcVar = this.zzc;
            if (intValue < 10) {
                throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; must be at least 10 bytes", Integer.valueOf(intValue)));
            }
            if (zzcVar == zzc.zza) {
                if (intValue > 20) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 20 bytes for SHA1", Integer.valueOf(intValue)));
                }
            } else if (zzcVar == zzc.zzb) {
                if (intValue > 28) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 28 bytes for SHA224", Integer.valueOf(intValue)));
                }
            } else if (zzcVar == zzc.zzc) {
                if (intValue > 32) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 32 bytes for SHA256", Integer.valueOf(intValue)));
                }
            } else if (zzcVar == zzc.zzd) {
                if (intValue > 48) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 48 bytes for SHA384", Integer.valueOf(intValue)));
                }
            } else {
                if (zzcVar != zzc.zze) {
                    throw new GeneralSecurityException("unknown hash type; must be SHA256, SHA384 or SHA512");
                }
                if (intValue > 64) {
                    throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d; can be at most 64 bytes for SHA512", Integer.valueOf(intValue)));
                }
            }
            return new zzqk(this.zza.intValue(), this.zzb.intValue(), this.zzd, this.zzc);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = zzb.zzd;
        }
    }

    public final int zzc() {
        return this.zza;
    }

    private final int zzg() {
        int i;
        if (this.zzc == zzb.zzd) {
            return this.zzb;
        }
        if (this.zzc == zzb.zza) {
            i = this.zzb;
        } else if (this.zzc == zzb.zzb) {
            i = this.zzb;
        } else if (this.zzc == zzb.zzc) {
            i = this.zzb;
        } else {
            throw new IllegalStateException("Unknown variant");
        }
        return i + 5;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zzb {
        public static final zzb zza = new zzb("TINK");
        public static final zzb zzb = new zzb("CRUNCHY");
        public static final zzb zzc = new zzb("LEGACY");
        public static final zzb zzd = new zzb("NO_PREFIX");
        private final String zze;

        public final String toString() {
            return this.zze;
        }

        private zzb(String str) {
            this.zze = str;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zzc {
        public static final zzc zza = new zzc("SHA1");
        public static final zzc zzb = new zzc("SHA224");
        public static final zzc zzc = new zzc("SHA256");
        public static final zzc zzd = new zzc("SHA384");
        public static final zzc zze = new zzc("SHA512");
        private final String zzf;

        public final String toString() {
            return this.zzf;
        }

        private zzc(String str) {
            this.zzf = str;
        }
    }

    public final int hashCode() {
        return Objects.hash(zzqk.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public static zza zzd() {
        return new zza();
    }

    public final zzc zze() {
        return this.zzd;
    }

    public final zzb zzf() {
        return this.zzc;
    }

    public final String toString() {
        return "HMAC Parameters (variant: " + String.valueOf(this.zzc) + ", hashType: " + String.valueOf(this.zzd) + ", " + this.zzb + "-byte tags, and " + this.zza + "-byte key)";
    }

    private zzqk(int i, int i2, zzb zzbVar, zzc zzcVar) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzbVar;
        this.zzd = zzcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzqk)) {
            return false;
        }
        zzqk zzqkVar = (zzqk) obj;
        return zzqkVar.zza == this.zza && zzqkVar.zzg() == zzg() && zzqkVar.zzc == this.zzc && zzqkVar.zzd == this.zzd;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zzc != zzb.zzd;
    }
}
