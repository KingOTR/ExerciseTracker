package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcz extends zzcu {
    private final zzdg zza;
    private final zzze zzb;
    private final zzze zzc;
    private final zzzc zzd;

    @Nullable
    private final Integer zze;

    public static zza zzb() {
        return new zza();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static class zza {

        @Nullable
        private zzdg zza;

        @Nullable
        private zzze zzb;

        @Nullable
        private zzze zzc;

        @Nullable
        private Integer zzd;

        public final zza zza(zzze zzzeVar) {
            this.zzb = zzzeVar;
            return this;
        }

        public final zza zzb(zzze zzzeVar) {
            this.zzc = zzzeVar;
            return this;
        }

        public final zza zza(@Nullable Integer num) {
            this.zzd = num;
            return this;
        }

        public final zza zza(zzdg zzdgVar) {
            this.zza = zzdgVar;
            return this;
        }

        public final zzcz zza() throws GeneralSecurityException {
            zzzc zzb;
            zzdg zzdgVar = this.zza;
            if (zzdgVar == null) {
                throw new GeneralSecurityException("Cannot build without parameters");
            }
            if (this.zzb == null || this.zzc == null) {
                throw new GeneralSecurityException("Cannot build without key material");
            }
            if (zzdgVar.zzb() != this.zzb.zza()) {
                throw new GeneralSecurityException("AES key size mismatch");
            }
            if (this.zza.zzc() != this.zzc.zza()) {
                throw new GeneralSecurityException("HMAC key size mismatch");
            }
            if (this.zza.zza() && this.zzd == null) {
                throw new GeneralSecurityException("Cannot create key without ID requirement with parameters with ID requirement");
            }
            if (!this.zza.zza() && this.zzd != null) {
                throw new GeneralSecurityException("Cannot create key with ID requirement with parameters without ID requirement");
            }
            if (this.zza.zzh() == zzdg.zzb.zzc) {
                zzb = zzog.zza;
            } else if (this.zza.zzh() == zzdg.zzb.zzb) {
                zzb = zzog.zza(this.zzd.intValue());
            } else if (this.zza.zzh() == zzdg.zzb.zza) {
                zzb = zzog.zzb(this.zzd.intValue());
            } else {
                throw new IllegalStateException("Unknown AesCtrHmacAeadParameters.Variant: " + String.valueOf(this.zza.zzh()));
            }
            return new zzcz(this.zza, this.zzb, this.zzc, zzb, this.zzd);
        }

        private zza() {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
            this.zzd = null;
        }
    }

    public final zzdg zzc() {
        return this.zza;
    }

    public final zzzc zzd() {
        return this.zzd;
    }

    public final zzze zze() {
        return this.zzb;
    }

    public final zzze zzf() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    @Nullable
    public final Integer zza() {
        return this.zze;
    }

    private zzcz(zzdg zzdgVar, zzze zzzeVar, zzze zzzeVar2, zzzc zzzcVar, @Nullable Integer num) {
        this.zza = zzdgVar;
        this.zzb = zzzeVar;
        this.zzc = zzzeVar2;
        this.zzd = zzzcVar;
        this.zze = num;
    }
}
