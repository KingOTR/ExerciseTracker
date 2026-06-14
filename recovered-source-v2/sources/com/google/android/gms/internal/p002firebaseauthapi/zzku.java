package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import java.security.GeneralSecurityException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzku implements zzkw {
    private final int zza;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final int zza() {
        return this.zza;
    }

    public zzku(zzdv zzdvVar) throws GeneralSecurityException {
        if (zzdvVar.zzb() != 12) {
            throw new GeneralSecurityException("invalid IV size");
        }
        if (zzdvVar.zzd() != 16) {
            throw new GeneralSecurityException("invalid tag size");
        }
        if (zzdvVar.zzf() != zzdv.zzb.zzc) {
            throw new GeneralSecurityException("invalid variant");
        }
        this.zza = zzdvVar.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzkw
    public final byte[] zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        if (bArr2.length < i) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (bArr.length != this.zza) {
            throw new GeneralSecurityException("invalid key size");
        }
        SecretKey zzb = zzgo.zzb(bArr);
        int i2 = i + 12;
        if (bArr2.length < i + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        AlgorithmParameterSpec zza = zzgo.zza(bArr2, i, 12);
        Cipher zza2 = zzgo.zza();
        zza2.init(2, zzb, zza);
        return zza2.doFinal(bArr2, i2, (bArr2.length - i) - 12);
    }
}
