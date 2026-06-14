package com.google.android.gms.internal.p002firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzyc implements zzbg {
    private final zzys zza;
    private final zzci zzb;
    private final int zzc;
    private final byte[] zzd;

    public static zzbg zza(zzcz zzczVar) throws GeneralSecurityException {
        return new zzyc(new zzxn(zzczVar.zze().zza(zzbq.zza()), zzczVar.zzc().zzd()), new zzyz(new zzyx("HMAC" + String.valueOf(zzczVar.zzc().zzg()), new SecretKeySpec(zzczVar.zzf().zza(zzbq.zza()), "HMAC")), zzczVar.zzc().zze()), zzczVar.zzc().zze(), zzczVar.zzd().zzb());
    }

    private zzyc(zzys zzysVar, zzci zzciVar, int i, byte[] bArr) {
        this.zza = zzysVar;
        this.zzb = zzciVar;
        this.zzc = i;
        this.zzd = bArr;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i = this.zzc;
        byte[] bArr3 = this.zzd;
        if (length < i + bArr3.length) {
            throw new GeneralSecurityException("Decryption failed (ciphertext too short).");
        }
        if (!zzpr.zza(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        byte[] copyOfRange = Arrays.copyOfRange(bArr, this.zzd.length, bArr.length - this.zzc);
        byte[] copyOfRange2 = Arrays.copyOfRange(bArr, bArr.length - this.zzc, bArr.length);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        this.zzb.zza(copyOfRange2, zzxv.zza(bArr2, copyOfRange, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8)));
        return this.zza.zza(copyOfRange);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzbg
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzb = this.zza.zzb(bArr);
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        return zzxv.zza(this.zzd, zzb, this.zzb.zza(zzxv.zza(bArr2, zzb, Arrays.copyOf(ByteBuffer.allocate(8).putLong(bArr2.length * 8).array(), 8))));
    }
}
