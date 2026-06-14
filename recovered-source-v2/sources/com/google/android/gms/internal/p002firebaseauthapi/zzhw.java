package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzhw implements zzbg {
    private final byte[] zza;
    private final int zzb;
    private final zzrq zzc;

    public static zzbg zza(zzfp zzfpVar) throws GeneralSecurityException {
        if (zzfpVar.zzb().zzb() < 8 || zzfpVar.zzb().zzb() > 12) {
            throw new GeneralSecurityException("invalid salt size");
        }
        return new zzhw(zzfpVar.zzd().zza(zzbq.zza()), zzfpVar.zzc(), zzfpVar.zzb().zzb());
    }

    private zzhw(byte[] bArr, zzzc zzzcVar, int i) throws GeneralSecurityException {
        this.zzc = new zzyv(bArr);
        this.zza = zzzcVar.zzb();
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("ciphertext is null");
        }
        int length = bArr.length;
        byte[] bArr3 = this.zza;
        if (length < bArr3.length + this.zzb + 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        int length2 = this.zza.length + this.zzb;
        zzhj zzhjVar = new zzhj(zza(Arrays.copyOfRange(bArr, this.zza.length, length2)));
        int i = length2 + 12;
        return zzhjVar.zza(Arrays.copyOfRange(bArr, length2, i), bArr, i, bArr2);
    }

    private final byte[] zza(byte[] bArr) throws GeneralSecurityException {
        byte[] bArr2 = {0, 1, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        byte[] bArr3 = {0, 2, 88, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        if (bArr.length > 12 || bArr.length < 8) {
            throw new GeneralSecurityException("invalid salt size");
        }
        System.arraycopy(bArr, 0, bArr2, 4, bArr.length);
        System.arraycopy(bArr, 0, bArr3, 4, bArr.length);
        byte[] bArr4 = new byte[32];
        System.arraycopy(this.zzc.zza(bArr2, 16), 0, bArr4, 0, 16);
        System.arraycopy(this.zzc.zza(bArr3, 16), 0, bArr4, 16, 16);
        return bArr4;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr == null) {
            throw new NullPointerException("plaintext is null");
        }
        byte[] zza = zzpe.zza(this.zzb + 12);
        byte[] copyOf = Arrays.copyOf(zza, this.zzb);
        int i = this.zzb;
        byte[] copyOfRange = Arrays.copyOfRange(zza, i, i + 12);
        byte[] zzb = new zzhj(zza(copyOf)).zzb(copyOfRange, bArr, this.zza.length + this.zzb + copyOfRange.length, bArr2);
        byte[] bArr3 = this.zza;
        System.arraycopy(bArr3, 0, zzb, 0, bArr3.length);
        System.arraycopy(zza, 0, zzb, this.zza.length, zza.length);
        return zzb;
    }
}
