package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.spec.ECParameterSpec;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzjw extends zzko {
    private final zzke zza;
    private final zzze zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzko, com.google.android.gms.internal.p002firebaseauthapi.zzck
    public final /* synthetic */ zzbp zzb() {
        return (zzke) zzb();
    }

    public final zzju zzc() {
        return this.zza.zzb();
    }

    public static zzjw zza(zzke zzkeVar, zzze zzzeVar) throws GeneralSecurityException {
        ECParameterSpec eCParameterSpec;
        if (zzkeVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without an HPKE public key");
        }
        if (zzzeVar == null) {
            throw new GeneralSecurityException("HPKE private key cannot be constructed without secret");
        }
        zzju.zzf zze = zzkeVar.zzb().zze();
        int zza = zzzeVar.zza();
        String str = "Encoded private key byte length for " + String.valueOf(zze) + " must be %d, not " + zza;
        if (zze == zzju.zzf.zza) {
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        } else if (zze == zzju.zzf.zzb) {
            if (zza != 48) {
                throw new GeneralSecurityException(String.format(str, 48));
            }
        } else if (zze == zzju.zzf.zzc) {
            if (zza != 66) {
                throw new GeneralSecurityException(String.format(str, 66));
            }
        } else {
            if (zze != zzju.zzf.zzd) {
                throw new GeneralSecurityException("Unable to validate private key length for " + String.valueOf(zze));
            }
            if (zza != 32) {
                throw new GeneralSecurityException(String.format(str, 32));
            }
        }
        zzju.zzf zze2 = zzkeVar.zzb().zze();
        byte[] zzb = zzkeVar.zzd().zzb();
        byte[] zza2 = zzzeVar.zza(zzbq.zza());
        if (zze2 == zzju.zzf.zza || zze2 == zzju.zzf.zzb || zze2 == zzju.zzf.zzc) {
            if (zze2 == zzju.zzf.zza) {
                eCParameterSpec = zzmk.zza;
            } else if (zze2 == zzju.zzf.zzb) {
                eCParameterSpec = zzmk.zzb;
            } else if (zze2 == zzju.zzf.zzc) {
                eCParameterSpec = zzmk.zzc;
            } else {
                throw new IllegalArgumentException("Unable to determine NIST curve params for " + String.valueOf(zze2));
            }
            BigInteger order = eCParameterSpec.getOrder();
            BigInteger zza3 = zzmj.zza(zza2);
            if (zza3.signum() <= 0 || zza3.compareTo(order) >= 0) {
                throw new GeneralSecurityException("Invalid private key.");
            }
            if (!zzmk.zza(zza3, eCParameterSpec).equals(zzyb.zza(eCParameterSpec.getCurve(), zzyd.UNCOMPRESSED, zzb))) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else if (zze2 == zzju.zzf.zzd) {
            if (!Arrays.equals(zzza.zza(zza2), zzb)) {
                throw new GeneralSecurityException("Invalid private key for public key.");
            }
        } else {
            throw new IllegalArgumentException("Unable to validate key pair for " + String.valueOf(zze2));
        }
        return new zzjw(zzkeVar, zzzeVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzko
    /* renamed from: zzd */
    public final /* synthetic */ zzkr zzb() {
        return this.zza;
    }

    public final zzze zze() {
        return this.zzb;
    }

    private zzjw(zzke zzkeVar, zzze zzzeVar) {
        this.zza = zzkeVar;
        this.zzb = zzzeVar;
    }
}
