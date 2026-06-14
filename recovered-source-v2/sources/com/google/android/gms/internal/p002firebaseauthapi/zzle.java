package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzle implements zzll {
    private final String zza;

    final int zza() throws GeneralSecurityException {
        return Mac.getInstance(this.zza).getMacLength();
    }

    zzle(String str) {
        this.zza = str;
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        Mac zza = zzyf.zzb.zza(this.zza);
        if (i > zza.getMacLength() * 255) {
            throw new GeneralSecurityException("size too large");
        }
        byte[] bArr3 = new byte[i];
        zza.init(new SecretKeySpec(bArr, this.zza));
        byte[] bArr4 = new byte[0];
        int i2 = 1;
        int i3 = 0;
        while (true) {
            zza.update(bArr4);
            zza.update(bArr2);
            zza.update((byte) i2);
            bArr4 = zza.doFinal();
            if (bArr4.length + i3 < i) {
                System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                i3 += bArr4.length;
                i2++;
            } else {
                System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                return bArr3;
            }
        }
    }

    private final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        Mac zza = zzyf.zzb.zza(this.zza);
        if (bArr2 == null || bArr2.length == 0) {
            zza.init(new SecretKeySpec(new byte[zza.getMacLength()], this.zza));
        } else {
            zza.init(new SecretKeySpec(bArr2, this.zza));
        }
        return zza.doFinal(bArr);
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, String str2, byte[] bArr4, int i) throws GeneralSecurityException {
        return zza(zza(zzlq.zza(str, bArr2, bArr4), null), zzlq.zza(str2, bArr3, bArr4, i), i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zzb() throws GeneralSecurityException {
        String str = this.zza;
        str.hashCode();
        switch (str) {
            case "HmacSha256":
                return zzlq.zzf;
            case "HmacSha384":
                return zzlq.zzg;
            case "HmacSha512":
                return zzlq.zzh;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3, int i) throws GeneralSecurityException {
        return zza(bArr, zzlq.zza(str, bArr2, bArr3, i), i);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzll
    public final byte[] zza(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) throws GeneralSecurityException {
        return zza(zzlq.zza(str, bArr2, bArr3), bArr);
    }
}
