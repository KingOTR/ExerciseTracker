package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzjp extends zzkp {
    private static final Set<zzch> zza = (Set) zzpp.zza(new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjr
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final Object zza() {
            return zzjp.zzj();
        }
    });
    private final zzc zzb;
    private final zzb zzc;

    @Nullable
    private final zze zzd;
    private final zzd zze;
    private final zzch zzf;

    @Nullable
    private final zzzc zzg;

    public final int hashCode() {
        return Objects.hash(zzjp.class, this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza {
        private zzc zza;
        private zzb zzb;
        private zze zzc;
        private zzch zzd;
        private zzd zze;

        @Nullable
        private zzzc zzf;

        public final zza zza(zzc zzcVar) {
            this.zza = zzcVar;
            return this;
        }

        public final zza zza(zzch zzchVar) throws GeneralSecurityException {
            if (!zzjp.zza.contains(zzchVar)) {
                throw new GeneralSecurityException("Invalid DEM parameters " + String.valueOf(zzchVar) + "; only AES128_GCM_RAW, AES256_GCM_RAW, AES128_CTR_HMAC_SHA256_RAW, AES256_CTR_HMAC_SHA256_RAW XCHACHA20_POLY1305_RAW and AES256_SIV_RAW are currently supported.");
            }
            this.zzd = zzchVar;
            return this;
        }

        public final zza zza(zzb zzbVar) {
            this.zzb = zzbVar;
            return this;
        }

        public final zza zza(zze zzeVar) {
            this.zzc = zzeVar;
            return this;
        }

        public final zza zza(zzzc zzzcVar) {
            if (zzzcVar.zza() == 0) {
                this.zzf = null;
                return this;
            }
            this.zzf = zzzcVar;
            return this;
        }

        public final zza zza(zzd zzdVar) {
            this.zze = zzdVar;
            return this;
        }

        public final zzjp zza() throws GeneralSecurityException {
            zzc zzcVar = this.zza;
            if (zzcVar == null) {
                throw new GeneralSecurityException("Elliptic curve type is not set");
            }
            if (this.zzb == null) {
                throw new GeneralSecurityException("Hash type is not set");
            }
            if (this.zzd == null) {
                throw new GeneralSecurityException("DEM parameters are not set");
            }
            if (this.zze == null) {
                throw new GeneralSecurityException("Variant is not set");
            }
            if (zzcVar != zzc.zzd && this.zzc == null) {
                throw new GeneralSecurityException("Point format is not set");
            }
            if (this.zza == zzc.zzd && this.zzc != null) {
                throw new GeneralSecurityException("For Curve25519 point format must not be set");
            }
            return new zzjp(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
            this.zze = zzd.zzc;
            this.zzf = null;
        }
    }

    public final zzch zzb() {
        return this.zzf;
    }

    public static zza zzc() {
        return new zza();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zzd {
        public static final zzd zza = new zzd("TINK");
        public static final zzd zzb = new zzd("CRUNCHY");
        public static final zzd zzc = new zzd("NO_PREFIX");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zzd(String str) {
            this.zzd = str;
        }
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zze {
        public static final zze zza = new zze("COMPRESSED");
        public static final zze zzb = new zze("UNCOMPRESSED");
        public static final zze zzc = new zze("LEGACY_UNCOMPRESSED");
        private final String zzd;

        public final String toString() {
            return this.zzd;
        }

        private zze(String str) {
            this.zzd = str;
        }
    }

    public final zzc zzd() {
        return this.zzb;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zzc {
        public static final zzc zza = new zzc("NIST_P256");
        public static final zzc zzb = new zzc("NIST_P384");
        public static final zzc zzc = new zzc("NIST_P521");
        public static final zzc zzd = new zzc("X25519");
        private final String zze;

        public final String toString() {
            return this.zze;
        }

        private zzc(String str) {
            this.zze = str;
        }
    }

    public final zzb zze() {
        return this.zzc;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zzb {
        public static final zzb zza = new zzb("SHA1");
        public static final zzb zzb = new zzb("SHA224");
        public static final zzb zzc = new zzb("SHA256");
        public static final zzb zzd = new zzb("SHA384");
        public static final zzb zze = new zzb("SHA512");
        private final String zzf;

        public final String toString() {
            return this.zzf;
        }

        private zzb(String str) {
            this.zzf = str;
        }
    }

    @Nullable
    public final zze zzf() {
        return this.zzd;
    }

    public final zzd zzg() {
        return this.zze;
    }

    @Nullable
    public final zzzc zzh() {
        return this.zzg;
    }

    public final String toString() {
        return String.format("EciesParameters(curveType=%s, hashType=%s, pointFormat=%s, demParameters=%s, variant=%s, salt=%s)", this.zzb, this.zzc, this.zzd, this.zzf, this.zze, this.zzg);
    }

    static /* synthetic */ Set zzj() throws Exception {
        HashSet hashSet = new HashSet();
        hashSet.add(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzdv.zzb.zzc).zza());
        hashSet.add(zzdv.zze().zza(12).zzb(32).zzc(16).zza(zzdv.zzb.zzc).zza());
        hashSet.add(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza());
        hashSet.add(zzdg.zzf().zza(32).zzb(32).zzd(32).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza());
        hashSet.add(zzga.zzc());
        hashSet.add(zziv.zzc().zza(64).zza(zziv.zzb.zzc).zza());
        return Collections.unmodifiableSet(hashSet);
    }

    private zzjp(zzc zzcVar, zzb zzbVar, @Nullable zze zzeVar, zzch zzchVar, zzd zzdVar, zzzc zzzcVar) {
        this.zzb = zzcVar;
        this.zzc = zzbVar;
        this.zzd = zzeVar;
        this.zzf = zzchVar;
        this.zze = zzdVar;
        this.zzg = zzzcVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjp)) {
            return false;
        }
        zzjp zzjpVar = (zzjp) obj;
        return Objects.equals(zzjpVar.zzb, this.zzb) && Objects.equals(zzjpVar.zzc, this.zzc) && Objects.equals(zzjpVar.zzd, this.zzd) && Objects.equals(zzjpVar.zzf, this.zzf) && Objects.equals(zzjpVar.zze, this.zze) && Objects.equals(zzjpVar.zzg, this.zzg);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzch
    public final boolean zza() {
        return this.zze != zzd.zzc;
    }
}
