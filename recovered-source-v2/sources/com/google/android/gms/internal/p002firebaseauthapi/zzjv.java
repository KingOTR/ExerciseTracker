package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import java.security.GeneralSecurityException;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzjv extends zzkr {
    private final zzjp zza;

    @Nullable
    private final ECPoint zzb;

    @Nullable
    private final zzzc zzc;
    private final zzzc zzd;

    @Nullable
    private final Integer zze;

    public final zzjp zzb() {
        return this.zza;
    }

    public static zzjv zza(zzjp zzjpVar, zzzc zzzcVar, @Nullable Integer num) throws GeneralSecurityException {
        if (!zzjpVar.zzd().equals(zzjp.zzc.zzd)) {
            throw new GeneralSecurityException("createForCurveX25519 may only be called with parameters for curve X25519");
        }
        zzb(zzjpVar.zzg(), num);
        if (zzzcVar.zza() == 32) {
            return new zzjv(zzjpVar, null, zzzcVar, zza(zzjpVar.zzg(), num), num);
        }
        throw new GeneralSecurityException("Encoded public point byte length for X25519 curve must be 32");
    }

    public static zzjv zza(zzjp zzjpVar, ECPoint eCPoint, @Nullable Integer num) throws GeneralSecurityException {
        EllipticCurve curve;
        if (zzjpVar.zzd().equals(zzjp.zzc.zzd)) {
            throw new GeneralSecurityException("createForNistCurve may only be called with parameters for NIST curve");
        }
        zzb(zzjpVar.zzg(), num);
        zzjp.zzc zzd = zzjpVar.zzd();
        if (zzd == zzjp.zzc.zza) {
            curve = zzmk.zza.getCurve();
        } else if (zzd == zzjp.zzc.zzb) {
            curve = zzmk.zzb.getCurve();
        } else if (zzd == zzjp.zzc.zzc) {
            curve = zzmk.zzc.getCurve();
        } else {
            throw new IllegalArgumentException("Unable to determine NIST curve type for " + String.valueOf(zzd));
        }
        zzmk.zza(eCPoint, curve);
        return new zzjv(zzjpVar, eCPoint, null, zza(zzjpVar.zzg(), num), num);
    }

    private static zzzc zza(zzjp.zzd zzdVar, @Nullable Integer num) {
        if (zzdVar == zzjp.zzd.zzc) {
            return zzog.zza;
        }
        if (num == null) {
            throw new IllegalStateException("idRequirement must be non-null for EciesParameters.Variant: " + String.valueOf(zzdVar));
        }
        if (zzdVar == zzjp.zzd.zzb) {
            return zzog.zza(num.intValue());
        }
        if (zzdVar == zzjp.zzd.zza) {
            return zzog.zzb(num.intValue());
        }
        throw new IllegalStateException("Unknown EciesParameters.Variant: " + String.valueOf(zzdVar));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkr
    public final zzzc zzc() {
        return this.zzd;
    }

    @Nullable
    public final zzzc zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbp
    @Nullable
    public final Integer zza() {
        return this.zze;
    }

    @Nullable
    public final ECPoint zze() {
        return this.zzb;
    }

    private zzjv(zzjp zzjpVar, @Nullable ECPoint eCPoint, @Nullable zzzc zzzcVar, zzzc zzzcVar2, @Nullable Integer num) {
        this.zza = zzjpVar;
        this.zzb = eCPoint;
        this.zzc = zzzcVar;
        this.zzd = zzzcVar2;
        this.zze = num;
    }

    private static void zzb(zzjp.zzd zzdVar, @Nullable Integer num) throws GeneralSecurityException {
        if (!zzdVar.equals(zzjp.zzd.zzc) && num == null) {
            throw new GeneralSecurityException("'idRequirement' must be non-null for " + String.valueOf(zzdVar) + " variant.");
        }
        if (zzdVar.equals(zzjp.zzd.zzc) && num != null) {
            throw new GeneralSecurityException("'idRequirement' must be null for NO_PREFIX variant.");
        }
    }
}
