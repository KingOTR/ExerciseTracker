package com.google.android.recaptcha.internal;

import com.google.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzil {
    static int zza(byte[] bArr, int i, zzik zzikVar) throws zzlc {
        int zzi = zzi(bArr, i, zzikVar);
        int i2 = zzikVar.zza;
        if (i2 < 0) {
            throw zzlc.zzf();
        }
        if (i2 > bArr.length - zzi) {
            throw zzlc.zzi();
        }
        if (i2 == 0) {
            zzikVar.zzc = zziv.zzb;
            return zzi;
        }
        zzikVar.zzc = zziv.zzk(bArr, zzi, i2);
        return zzi + i2;
    }

    static int zzb(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        int i3 = bArr[i + 1] & 255;
        int i4 = bArr[i + 2] & 255;
        return ((bArr[i + 3] & 255) << 24) | (i3 << 8) | i2 | (i4 << 16);
    }

    static int zzc(zzmk zzmkVar, byte[] bArr, int i, int i2, int i3, zzik zzikVar) throws IOException {
        Object zze = zzmkVar.zze();
        int zzm = zzm(zze, zzmkVar, bArr, i, i2, i3, zzikVar);
        zzmkVar.zzf(zze);
        zzikVar.zzc = zze;
        return zzm;
    }

    static int zzd(zzmk zzmkVar, byte[] bArr, int i, int i2, zzik zzikVar) throws IOException {
        Object zze = zzmkVar.zze();
        int zzn = zzn(zze, zzmkVar, bArr, i, i2, zzikVar);
        zzmkVar.zzf(zze);
        zzikVar.zzc = zze;
        return zzn;
    }

    static int zze(zzmk zzmkVar, int i, byte[] bArr, int i2, int i3, zzkz zzkzVar, zzik zzikVar) throws IOException {
        int zzd = zzd(zzmkVar, bArr, i2, i3, zzikVar);
        zzkzVar.add(zzikVar.zzc);
        while (zzd < i3) {
            int zzi = zzi(bArr, zzd, zzikVar);
            if (i != zzikVar.zza) {
                break;
            }
            zzd = zzd(zzmkVar, bArr, zzi, i3, zzikVar);
            zzkzVar.add(zzikVar.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzkz zzkzVar, zzik zzikVar) throws IOException {
        zzkt zzktVar = (zzkt) zzkzVar;
        int zzi = zzi(bArr, i, zzikVar);
        int i2 = zzikVar.zza + zzi;
        while (zzi < i2) {
            zzi = zzi(bArr, zzi, zzikVar);
            zzktVar.zzh(zzikVar.zza);
        }
        if (zzi == i2) {
            return zzi;
        }
        throw zzlc.zzi();
    }

    static int zzg(byte[] bArr, int i, zzik zzikVar) throws zzlc {
        int zzi = zzi(bArr, i, zzikVar);
        int i2 = zzikVar.zza;
        if (i2 < 0) {
            throw zzlc.zzf();
        }
        if (i2 == 0) {
            zzikVar.zzc = "";
            return zzi;
        }
        zzikVar.zzc = new String(bArr, zzi, i2, zzla.zza);
        return zzi + i2;
    }

    static int zzh(int i, byte[] bArr, int i2, int i3, zznc zzncVar, zzik zzikVar) throws zzlc {
        if ((i >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int zzl = zzl(bArr, i2, zzikVar);
            zzncVar.zzj(i, Long.valueOf(zzikVar.zzb));
            return zzl;
        }
        if (i4 == 1) {
            zzncVar.zzj(i, Long.valueOf(zzp(bArr, i2)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int zzi = zzi(bArr, i2, zzikVar);
            int i5 = zzikVar.zza;
            if (i5 < 0) {
                throw zzlc.zzf();
            }
            if (i5 > bArr.length - zzi) {
                throw zzlc.zzi();
            }
            if (i5 == 0) {
                zzncVar.zzj(i, zziv.zzb);
            } else {
                zzncVar.zzj(i, zziv.zzk(bArr, zzi, i5));
            }
            return zzi + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw zzlc.zzc();
            }
            zzncVar.zzj(i, Integer.valueOf(zzb(bArr, i2)));
            return i2 + 4;
        }
        int i6 = (i & (-8)) | 4;
        zznc zzf = zznc.zzf();
        int i7 = 0;
        while (true) {
            if (i2 >= i3) {
                break;
            }
            int zzi2 = zzi(bArr, i2, zzikVar);
            int i8 = zzikVar.zza;
            i7 = i8;
            if (i8 == i6) {
                i2 = zzi2;
                break;
            }
            int zzh = zzh(i7, bArr, zzi2, i3, zzf, zzikVar);
            i7 = i8;
            i2 = zzh;
        }
        if (i2 > i3 || i7 != i6) {
            throw zzlc.zzg();
        }
        zzncVar.zzj(i, zzf);
        return i2;
    }

    static int zzi(byte[] bArr, int i, zzik zzikVar) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzj(b, bArr, i2, zzikVar);
        }
        zzikVar.zza = b;
        return i2;
    }

    static int zzj(int i, byte[] bArr, int i2, zzik zzikVar) {
        byte b = bArr[i2];
        int i3 = i2 + 1;
        int i4 = i & 127;
        if (b >= 0) {
            zzikVar.zza = i4 | (b << 7);
            return i3;
        }
        int i5 = i4 | ((b & Byte.MAX_VALUE) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i3];
        if (b2 >= 0) {
            zzikVar.zza = i5 | (b2 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b2 & Byte.MAX_VALUE) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzikVar.zza = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & Byte.MAX_VALUE) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzikVar.zza = i9 | (b4 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b4 & Byte.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                zzikVar.zza = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    static int zzk(int i, byte[] bArr, int i2, int i3, zzkz zzkzVar, zzik zzikVar) {
        zzkt zzktVar = (zzkt) zzkzVar;
        int zzi = zzi(bArr, i2, zzikVar);
        zzktVar.zzh(zzikVar.zza);
        while (zzi < i3) {
            int zzi2 = zzi(bArr, zzi, zzikVar);
            if (i != zzikVar.zza) {
                break;
            }
            zzi = zzi(bArr, zzi2, zzikVar);
            zzktVar.zzh(zzikVar.zza);
        }
        return zzi;
    }

    static int zzl(byte[] bArr, int i, zzik zzikVar) {
        long j = bArr[i];
        int i2 = i + 1;
        if (j >= 0) {
            zzikVar.zzb = j;
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
        zzikVar.zzb = j2;
        return i3;
    }

    static int zzm(Object obj, zzmk zzmkVar, byte[] bArr, int i, int i2, int i3, zzik zzikVar) throws IOException {
        int zzc = ((zzma) zzmkVar).zzc(obj, bArr, i, i2, i3, zzikVar);
        zzikVar.zzc = obj;
        return zzc;
    }

    static int zzn(Object obj, zzmk zzmkVar, byte[] bArr, int i, int i2, zzik zzikVar) throws IOException {
        int i3 = i + 1;
        int i4 = bArr[i];
        if (i4 < 0) {
            i3 = zzj(i4, bArr, i3, zzikVar);
            i4 = zzikVar.zza;
        }
        int i5 = i3;
        if (i4 < 0 || i4 > i2 - i5) {
            throw zzlc.zzi();
        }
        int i6 = i4 + i5;
        zzmkVar.zzi(obj, bArr, i5, i6, zzikVar);
        zzikVar.zzc = obj;
        return i6;
    }

    static long zzp(byte[] bArr, int i) {
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48) | ((bArr[i + 7] & 255) << 56);
    }

    static int zzo(int i, byte[] bArr, int i2, int i3, zzik zzikVar) throws zzlc {
        if ((i >>> 3) == 0) {
            throw zzlc.zzc();
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return zzl(bArr, i2, zzikVar);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return zzi(bArr, i2, zzikVar) + zzikVar.zza;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw zzlc.zzc();
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = zzi(bArr, i2, zzikVar);
            i6 = zzikVar.zza;
            if (i6 == i5) {
                break;
            }
            i2 = zzo(i6, bArr, i2, i3, zzikVar);
        }
        if (i2 > i3 || i6 != i5) {
            throw zzlc.zzg();
        }
        return i2;
    }
}
