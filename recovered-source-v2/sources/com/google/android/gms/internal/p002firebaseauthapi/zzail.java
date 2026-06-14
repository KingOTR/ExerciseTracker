package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzail {
    private static volatile int zza = 100;

    static double zza(byte[] bArr, int i) {
        return Double.longBitsToDouble(zzd(bArr, i));
    }

    static float zzb(byte[] bArr, int i) {
        return Float.intBitsToFloat(zzc(bArr, i));
    }

    static int zza(byte[] bArr, int i, zzaik zzaikVar) throws zzakf {
        int zzc = zzc(bArr, i, zzaikVar);
        int i2 = zzaikVar.zza;
        if (i2 < 0) {
            throw zzakf.zzf();
        }
        if (i2 > bArr.length - zzc) {
            throw zzakf.zzj();
        }
        if (i2 == 0) {
            zzaikVar.zzc = zzaip.zza;
            return zzc;
        }
        zzaikVar.zzc = zzaip.zza(bArr, zzc, i2);
        return zzc + i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, Object obj, zzalc zzalcVar, zzamo<zzamn, zzamn> zzamoVar, zzaik zzaikVar) throws IOException {
        if (zzaikVar.zzd.zza(zzalcVar, i >>> 3) == null) {
            return zza(i, bArr, i2, i3, zzalg.zzc(obj), zzaikVar);
        }
        zzajy.zzb zzbVar = (zzajy.zzb) obj;
        zzbVar.zza();
        zzajr<zzajy.zze> zzajrVar = zzbVar.zzc;
        throw new NoSuchMethodError();
    }

    static int zzc(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    private static int zza(zzalv zzalvVar, byte[] bArr, int i, int i2, int i3, zzaik zzaikVar) throws IOException {
        Object zza2 = zzalvVar.zza();
        int zza3 = zza(zza2, zzalvVar, bArr, i, i2, i3, zzaikVar);
        zzalvVar.zzd(zza2);
        zzaikVar.zzc = zza2;
        return zza3;
    }

    static int zza(zzalv zzalvVar, int i, byte[] bArr, int i2, int i3, zzakc<?> zzakcVar, zzaik zzaikVar) throws IOException {
        int i4 = (i & (-8)) | 4;
        int zza2 = zza(zzalvVar, bArr, i2, i3, i4, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (zza2 < i3) {
            int zzc = zzc(bArr, zza2, zzaikVar);
            if (i != zzaikVar.zza) {
                break;
            }
            zza2 = zza(zzalvVar, bArr, zzc, i3, i4, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return zza2;
    }

    static int zza(zzalv zzalvVar, byte[] bArr, int i, int i2, zzaik zzaikVar) throws IOException {
        Object zza2 = zzalvVar.zza();
        int zza3 = zza(zza2, zzalvVar, bArr, i, i2, zzaikVar);
        zzalvVar.zzd(zza2);
        zzaikVar.zzc = zza2;
        return zza3;
    }

    static int zzb(zzalv<?> zzalvVar, int i, byte[] bArr, int i2, int i3, zzakc<?> zzakcVar, zzaik zzaikVar) throws IOException {
        int zza2 = zza(zzalvVar, bArr, i2, i3, zzaikVar);
        zzakcVar.add(zzaikVar.zzc);
        while (zza2 < i3) {
            int zzc = zzc(bArr, zza2, zzaikVar);
            if (i != zzaikVar.zza) {
                break;
            }
            zza2 = zza(zzalvVar, bArr, zzc, i3, zzaikVar);
            zzakcVar.add(zzaikVar.zzc);
        }
        return zza2;
    }

    static int zza(byte[] bArr, int i, zzakc<?> zzakcVar, zzaik zzaikVar) throws IOException {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int zzc = zzc(bArr, i, zzaikVar);
        int i2 = zzaikVar.zza + zzc;
        while (zzc < i2) {
            zzc = zzc(bArr, zzc, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        if (zzc == i2) {
            return zzc;
        }
        throw zzakf.zzj();
    }

    static int zzb(byte[] bArr, int i, zzaik zzaikVar) throws zzakf {
        int zzc = zzc(bArr, i, zzaikVar);
        int i2 = zzaikVar.zza;
        if (i2 < 0) {
            throw zzakf.zzf();
        }
        if (i2 == 0) {
            zzaikVar.zzc = "";
            return zzc;
        }
        zzaikVar.zzc = zzamt.zzb(bArr, zzc, i2);
        return zzc + i2;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzamn zzamnVar, zzaik zzaikVar) throws zzakf {
        if ((i >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzd = zzd(bArr, i2, zzaikVar);
            zzamnVar.zza(i, Long.valueOf(zzaikVar.zzb));
            return zzd;
        }
        if (i4 == 1) {
            zzamnVar.zza(i, Long.valueOf(zzd(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzc = zzc(bArr, i2, zzaikVar);
            int i5 = zzaikVar.zza;
            if (i5 < 0) {
                throw zzakf.zzf();
            }
            if (i5 > bArr.length - zzc) {
                throw zzakf.zzj();
            }
            if (i5 == 0) {
                zzamnVar.zza(i, zzaip.zza);
            } else {
                zzamnVar.zza(i, zzaip.zza(bArr, zzc, i5));
            }
            return zzc + i5;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                zzamnVar.zza(i, Integer.valueOf(zzc(bArr, i2)));
                return i2 + 4;
            }
            throw zzakf.zzc();
        }
        zzamn zzd2 = zzamn.zzd();
        int i6 = (i & (-8)) | 4;
        zzaikVar.zze++;
        zza(zzaikVar.zze);
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzc2 = zzc(bArr, i2, zzaikVar);
            int i8 = zzaikVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = zzc2;
                break;
            }
            int zza2 = zza(i7, bArr, zzc2, i3, zzd2, zzaikVar);
            i7 = i8;
            i2 = zza2;
        }
        zzaikVar.zze--;
        if (i2 > i3 || i7 != i6) {
            throw zzakf.zzg();
        }
        zzamnVar.zza(i, zzd2);
        return i2;
    }

    static int zzc(byte[] bArr, int i, zzaik zzaikVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b >= 0) {
            zzaikVar.zza = b;
            return i2;
        }
        return zza(b, bArr, i2, zzaikVar);
    }

    static int zza(int i, byte[] bArr, int i2, zzaik zzaikVar) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzaikVar.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzaikVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzaikVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzaikVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzaikVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzakc<?> zzakcVar, zzaik zzaikVar) {
        zzajz zzajzVar = (zzajz) zzakcVar;
        int zzc = zzc(bArr, i2, zzaikVar);
        zzajzVar.zzc(zzaikVar.zza);
        while (zzc < i3) {
            int zzc2 = zzc(bArr, zzc, zzaikVar);
            if (i != zzaikVar.zza) {
                break;
            }
            zzc = zzc(bArr, zzc2, zzaikVar);
            zzajzVar.zzc(zzaikVar.zza);
        }
        return zzc;
    }

    static int zzd(byte[] bArr, int i, zzaik zzaikVar) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            zzaikVar.zzb = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | ((b & Byte.MAX_VALUE) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            i4 += 7;
            j2 |= (r10 & Byte.MAX_VALUE) << i4;
            b = bArr[i3];
            i3 = i5;
        }
        zzaikVar.zzb = j2;
        return i3;
    }

    static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i, int i2, int i3, zzaik zzaikVar) throws IOException {
        zzaikVar.zze++;
        zza(zzaikVar.zze);
        int zza2 = ((zzalg) zzalvVar).zza((zzalg) obj, bArr, i, i2, i3, zzaikVar);
        zzaikVar.zze--;
        zzaikVar.zzc = obj;
        return zza2;
    }

    static int zza(Object obj, zzalv zzalvVar, byte[] bArr, int i, int i2, zzaik zzaikVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zza(i4, bArr, i3, zzaikVar);
            i4 = zzaikVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzakf.zzj();
        }
        zzaikVar.zze++;
        zza(zzaikVar.zze);
        int i6 = i4 + i5;
        zzalvVar.zza(obj, bArr, i5, i6, zzaikVar);
        zzaikVar.zze--;
        zzaikVar.zzc = obj;
        return i6;
    }

    static int zza(int i, byte[] bArr, int i2, int i3, zzaik zzaikVar) throws zzakf {
        if ((i >>> 3) == 0) {
            throw zzakf.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzd(bArr, i2, zzaikVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzc(bArr, i2, zzaikVar) + zzaikVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzakf.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzc(bArr, i2, zzaikVar);
            i6 = zzaikVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zza(i6, bArr, i2, i3, zzaikVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzakf.zzg();
        }
        return i2;
    }

    static long zzd(byte[] bArr, int i) {
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private static void zza(int i) throws zzakf {
        if (i >= zza) {
            throw zzakf.zzh();
        }
    }
}
