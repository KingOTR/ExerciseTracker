package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpx;
import com.google.android.gms.internal.p002firebaseauthapi.zzqk;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyz implements zzci {
    private static final byte[] zza = {0};
    private final zzrq zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    public static zzci zza(zzpq zzpqVar) throws GeneralSecurityException {
        return new zzyz(zzpqVar);
    }

    public static zzci zza(zzqd zzqdVar) throws GeneralSecurityException {
        return new zzyz(zzqdVar);
    }

    private zzyz(zzpq zzpqVar) throws GeneralSecurityException {
        this.zzb = new zzyv(zzpqVar.zze().zza(zzbq.zza()));
        this.zzc = zzpqVar.zzc().zzb();
        this.zzd = zzpqVar.zzd().zzb();
        if (zzpqVar.zzc().zze().equals(zzpx.zzb.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.zze = new byte[0];
        }
    }

    private zzyz(zzqd zzqdVar) throws GeneralSecurityException {
        this.zzb = new zzyx("HMAC" + String.valueOf(zzqdVar.zzc().zze()), new SecretKeySpec(zzqdVar.zze().zza(zzbq.zza()), "HMAC"));
        this.zzc = zzqdVar.zzc().zzb();
        this.zzd = zzqdVar.zzd().zzb();
        if (zzqdVar.zzc().zzf().equals(zzqk.zzb.zzc)) {
            byte[] bArr = zza;
            this.zze = Arrays.copyOf(bArr, bArr.length);
        } else {
            this.zze = new byte[0];
        }
    }

    public zzyz(zzrq zzrqVar, int i) throws GeneralSecurityException {
        this.zzb = zzrqVar;
        this.zzc = i;
        this.zzd = new byte[0];
        this.zze = new byte[0];
        if (i < 10) {
            throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
        }
        zzrqVar.zza(new byte[0], i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(zza(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzci
    public final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = this.zze;
        if (bArr2.length > 0) {
            return zzxv.zza(this.zzd, this.zzb.zza(zzxv.zza(bArr, bArr2), this.zzc));
        }
        return zzxv.zza(this.zzd, this.zzb.zza(bArr, this.zzc));
    }
}
