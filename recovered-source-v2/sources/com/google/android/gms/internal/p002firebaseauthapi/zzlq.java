package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzju;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzlq {
    public static final byte[] zza = zza(1, 0);
    public static final byte[] zzb;
    public static final byte[] zzc;
    public static final byte[] zzd;
    public static final byte[] zze;
    public static final byte[] zzf;
    public static final byte[] zzg;
    public static final byte[] zzh;
    public static final byte[] zzi;
    public static final byte[] zzj;
    public static final byte[] zzk;
    public static final byte[] zzl;
    private static final byte[] zzm;
    private static final byte[] zzn;
    private static final byte[] zzo;

    public static int zza(zzju.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzju.zzf.zzd || zzfVar == zzju.zzf.zza) {
            return 32;
        }
        if (zzfVar == zzju.zzf.zzb) {
            return 48;
        }
        if (zzfVar == zzju.zzf.zzc) {
            return 66;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    public static int zzb(zzju.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzju.zzf.zzd) {
            return 32;
        }
        if (zzfVar == zzju.zzf.zza) {
            return 65;
        }
        if (zzfVar == zzju.zzf.zzb) {
            return 97;
        }
        if (zzfVar == zzju.zzf.zzc) {
            return 133;
        }
        throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
    }

    static zzya zzc(zzju.zzf zzfVar) throws GeneralSecurityException {
        if (zzfVar == zzju.zzf.zza) {
            return zzya.NIST_P256;
        }
        if (zzfVar == zzju.zzf.zzb) {
            return zzya.NIST_P384;
        }
        if (zzfVar == zzju.zzf.zzc) {
            return zzya.NIST_P521;
        }
        throw new GeneralSecurityException("Unrecognized NIST HPKE KEM identifier");
    }

    static {
        zza(1, 2);
        zzb = zza(2, 32);
        zzc = zza(2, 16);
        zzd = zza(2, 17);
        zze = zza(2, 18);
        zzf = zza(2, 1);
        zzg = zza(2, 2);
        zzh = zza(2, 3);
        zzi = zza(2, 1);
        zzj = zza(2, 2);
        zzk = zza(2, 3);
        zzl = new byte[0];
        zzm = "KEM".getBytes(zzpr.zza);
        zzn = "HPKE".getBytes(zzpr.zza);
        zzo = "HPKE-v1".getBytes(zzpr.zza);
    }

    static byte[] zza(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzxv.zza(zzn, bArr, bArr2, bArr3);
    }

    private static byte[] zza(int i, int i2) {
        if (i > 4 || i < 0) {
            throw new IllegalArgumentException("capacity must be between 0 and 4");
        }
        if (i2 < 0 || (i < 4 && i2 >= (1 << (i << 3)))) {
            throw new IllegalArgumentException("value too large");
        }
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) (i2 >> (((i - i3) - 1) * 8));
        }
        return bArr;
    }

    static byte[] zza(byte[] bArr) throws GeneralSecurityException {
        return zzxv.zza(zzm, bArr);
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzxv.zza(zzo, bArr2, str.getBytes(zzpr.zza), bArr);
    }

    static byte[] zza(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzxv.zza(zza(2, i), zzo, bArr2, str.getBytes(zzpr.zza), bArr);
    }
}
