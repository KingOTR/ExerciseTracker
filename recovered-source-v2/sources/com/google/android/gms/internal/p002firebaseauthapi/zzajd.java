package com.google.android.gms.internal.p002firebaseauthapi;

import androidx.work.WorkInfo;
import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajd extends zzajb {
    private final InputStream zze;
    private final byte[] zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    private final byte zzw() throws IOException {
        if (this.zzi == this.zzg) {
            zzg(1);
        }
        byte[] bArr = this.zzf;
        int i = this.zzi;
        this.zzi = i + 1;
        return bArr[i];
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final double zza() throws IOException {
        return Double.longBitsToDouble(zzz());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final float zzb() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    private static int zza(InputStream inputStream) throws IOException {
        try {
            return inputStream.available();
        } catch (zzakf e) {
            e.zzk();
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzc() {
        return this.zzk + this.zzi;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zza(int i) throws zzakf {
        if (i < 0) {
            throw zzakf.zzf();
        }
        int i2 = i + this.zzk + this.zzi;
        if (i2 < 0) {
            throw zzakf.zzg();
        }
        int i3 = this.zzl;
        if (i2 > i3) {
            throw zzakf.zzj();
        }
        this.zzl = i2;
        zzab();
        return i3;
    }

    private static int zza(InputStream inputStream, byte[] bArr, int i, int i2) throws IOException {
        try {
            return inputStream.read(bArr, i, i2);
        } catch (zzakf e) {
            e.zzk();
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzd() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zze() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzf() throws IOException {
        return zzy();
    }

    private final int zzx() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 4) {
            zzg(4);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 4;
        return (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24);
    }

    private final int zzy() throws IOException {
        int i;
        int i2 = this.zzi;
        int i3 = this.zzg;
        if (i3 != i2) {
            byte[] bArr = this.zzf;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.zzi = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Ascii.SO) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << Ascii.FS)) ^ 266354560;
                            if (b2 < 0) {
                                i9 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i9] < 0) {
                                        i9 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i9] < 0) {
                                                int i12 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i5 = i12;
                                                    i = i11;
                                                }
                                            }
                                        }
                                    }
                                }
                                i = i11;
                            }
                            i = i11;
                        }
                        i5 = i9;
                    }
                    i5 = i7;
                }
                this.zzi = i5;
                return i;
            }
        }
        return (int) zzm();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzg() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzh() throws IOException {
        return zze(zzy());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzi() throws IOException {
        if (zzt()) {
            this.zzj = 0;
            return 0;
        }
        int zzy = zzy();
        this.zzj = zzy;
        if ((zzy >>> 3) != 0) {
            return zzy;
        }
        throw zzakf.zzc();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final int zzj() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzk() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzl() throws IOException {
        return zzaa();
    }

    private final long zzz() throws IOException {
        int i = this.zzi;
        if (this.zzg - i < 8) {
            zzg(8);
            i = this.zzi;
        }
        byte[] bArr = this.zzf;
        this.zzi = i + 8;
        return ((bArr[i + 7] & 255) << 56) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 24) | ((bArr[i + 4] & 255) << 32) | ((bArr[i + 5] & 255) << 40) | ((bArr[i + 6] & 255) << 48);
    }

    private final long zzaa() throws IOException {
        long j;
        long j2;
        long j3;
        int i = this.zzi;
        int i2 = this.zzg;
        if (i2 != i) {
            byte[] bArr = this.zzf;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.zzi = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ WorkInfo.STOP_REASON_FOREGROUND_SERVICE_TIMEOUT;
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << Ascii.SO) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                        if (i9 < 0) {
                            long j4 = (-2080896) ^ i9;
                            i4 = i8;
                            j = j4;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (bArr[i8] << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                int i10 = i + 6;
                                long j7 = j6 ^ (bArr[i4] << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (bArr[i10] << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i10 = i + 8;
                                        j7 = j6 ^ (bArr[i4] << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (bArr[i10] << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i11 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i11;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j = j7 ^ j2;
                                i4 = i10;
                            }
                            j = j6 ^ j3;
                        }
                    }
                }
                this.zzi = i4;
                return j;
            }
        }
        return zzm();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    final long zzm() throws IOException {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            j |= (r3 & Byte.MAX_VALUE) << i;
            if ((zzw() & 128) == 0) {
                return j;
            }
        }
        throw zzakf.zze();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzn() throws IOException {
        return zzz();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzo() throws IOException {
        return zza(zzaa());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final long zzp() throws IOException {
        return zzaa();
    }

    private static long zza(InputStream inputStream, long j) throws IOException {
        try {
            return inputStream.skip(j);
        } catch (zzakf e) {
            e.zzk();
            throw e;
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final zzaip zzq() throws IOException {
        int zzy = zzy();
        int i = this.zzg;
        int i2 = this.zzi;
        if (zzy <= i - i2 && zzy > 0) {
            zzaip zza = zzaip.zza(this.zzf, i2, zzy);
            this.zzi += zzy;
            return zza;
        }
        if (zzy == 0) {
            return zzaip.zza;
        }
        if (zzy < 0) {
            throw zzakf.zzf();
        }
        byte[] zzj = zzj(zzy);
        if (zzj != null) {
            return zzaip.zza(zzj);
        }
        int i3 = this.zzi;
        int i4 = this.zzg;
        int i5 = i4 - i3;
        this.zzk += i4;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf = zzf(zzy - i5);
        byte[] bArr = new byte[zzy];
        System.arraycopy(this.zzf, i3, bArr, 0, i5);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i5, bArr2.length);
            i5 += bArr2.length;
        }
        return zzaip.zzb(bArr);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzr() throws IOException {
        int zzy = zzy();
        if (zzy > 0 && zzy <= this.zzg - this.zzi) {
            String str = new String(this.zzf, this.zzi, zzy, zzakb.zza);
            this.zzi += zzy;
            return str;
        }
        if (zzy == 0) {
            return "";
        }
        if (zzy < 0) {
            throw zzakf.zzf();
        }
        if (zzy <= this.zzg) {
            zzg(zzy);
            String str2 = new String(this.zzf, this.zzi, zzy, zzakb.zza);
            this.zzi += zzy;
            return str2;
        }
        return new String(zza(zzy, false), zzakb.zza);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final String zzs() throws IOException {
        byte[] zza;
        int zzy = zzy();
        int i = this.zzi;
        int i2 = this.zzg;
        if (zzy <= i2 - i && zzy > 0) {
            zza = this.zzf;
            this.zzi = i + zzy;
        } else {
            if (zzy == 0) {
                return "";
            }
            if (zzy < 0) {
                throw zzakf.zzf();
            }
            i = 0;
            if (zzy <= i2) {
                zzg(zzy);
                zza = this.zzf;
                this.zzi = zzy;
            } else {
                zza = zza(zzy, false);
            }
        }
        return zzamt.zzb(zza, i, zzy);
    }

    private final List<byte[]> zzf(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int min = Math.min(i, 4096);
            byte[] bArr = new byte[min];
            int i2 = 0;
            while (i2 < min) {
                int read = this.zze.read(bArr, i2, min - i2);
                if (read == -1) {
                    throw zzakf.zzj();
                }
                this.zzk += read;
                i2 += read;
            }
            i -= min;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    private zzajd(InputStream inputStream, int i) {
        super();
        this.zzl = Integer.MAX_VALUE;
        zzakb.zza(inputStream, "input");
        this.zze = inputStream;
        this.zzf = new byte[4096];
        this.zzg = 0;
        this.zzi = 0;
        this.zzk = 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzb(int i) throws zzakf {
        if (this.zzj != i) {
            throw zzakf.zzb();
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final void zzc(int i) {
        this.zzl = i;
        zzab();
    }

    private final void zzab() {
        int i = this.zzg + this.zzh;
        this.zzg = i;
        int i2 = this.zzk + i;
        int i3 = this.zzl;
        if (i2 > i3) {
            int i4 = i2 - i3;
            this.zzh = i4;
            this.zzg = i - i4;
            return;
        }
        this.zzh = 0;
    }

    private final void zzg(int i) throws IOException {
        if (zzi(i)) {
            return;
        }
        if (i > (this.zzc - this.zzk) - this.zzi) {
            throw zzakf.zzi();
        }
        throw zzakf.zzj();
    }

    private final void zzh(int i) throws IOException {
        int i2 = this.zzg;
        int i3 = this.zzi;
        if (i <= i2 - i3 && i >= 0) {
            this.zzi = i3 + i;
            return;
        }
        if (i < 0) {
            throw zzakf.zzf();
        }
        int i4 = this.zzk;
        int i5 = i4 + i3 + i;
        int i6 = this.zzl;
        if (i5 > i6) {
            zzh((i6 - i4) - i3);
            throw zzakf.zzj();
        }
        this.zzk = i4 + i3;
        int i7 = i2 - i3;
        this.zzg = 0;
        this.zzi = 0;
        while (i7 < i) {
            try {
                long j = i - i7;
                long zza = zza(this.zze, j);
                if (zza >= 0 && zza <= j) {
                    if (zza == 0) {
                        break;
                    } else {
                        i7 += (int) zza;
                    }
                } else {
                    throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#skip returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
                }
            } finally {
                this.zzk += i7;
                zzab();
            }
        }
        if (i7 >= i) {
            return;
        }
        int i8 = this.zzg;
        int i9 = i8 - this.zzi;
        this.zzi = i8;
        zzg(1);
        while (true) {
            int i10 = i - i9;
            int i11 = this.zzg;
            if (i10 > i11) {
                i9 += i11;
                this.zzi = i11;
                zzg(1);
            } else {
                this.zzi = i10;
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzt() throws IOException {
        return this.zzi == this.zzg && !zzi(1);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzu() throws IOException {
        return zzaa() != 0;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajb
    public final boolean zzd(int i) throws IOException {
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.zzg - this.zzi >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.zzf;
                    int i4 = this.zzi;
                    this.zzi = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw zzakf.zze();
            }
            while (i3 < 10) {
                if (zzw() < 0) {
                    i3++;
                }
            }
            throw zzakf.zze();
            return true;
        }
        if (i2 == 1) {
            zzh(8);
            return true;
        }
        if (i2 == 2) {
            zzh(zzy());
            return true;
        }
        if (i2 == 3) {
            zzv();
            zzb(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        if (i2 == 5) {
            zzh(4);
            return true;
        }
        throw zzakf.zza();
    }

    private final boolean zzi(int i) throws IOException {
        while (this.zzi + i > this.zzg) {
            int i2 = this.zzc;
            int i3 = this.zzk;
            int i4 = this.zzi;
            if (i > (i2 - i3) - i4 || i3 + i4 + i > this.zzl) {
                return false;
            }
            if (i4 > 0) {
                int i5 = this.zzg;
                if (i5 > i4) {
                    byte[] bArr = this.zzf;
                    System.arraycopy(bArr, i4, bArr, 0, i5 - i4);
                }
                this.zzk += i4;
                this.zzg -= i4;
                this.zzi = 0;
            }
            InputStream inputStream = this.zze;
            byte[] bArr2 = this.zzf;
            int i6 = this.zzg;
            int zza = zza(inputStream, bArr2, i6, Math.min(bArr2.length - i6, (this.zzc - this.zzk) - this.zzg));
            if (zza == 0 || zza < -1 || zza > this.zzf.length) {
                throw new IllegalStateException(String.valueOf(this.zze.getClass()) + "#read(byte[]) returned invalid result: " + zza + "\nThe InputStream implementation is buggy.");
            }
            if (zza <= 0) {
                return false;
            }
            this.zzg += zza;
            zzab();
            if (this.zzg >= i) {
                return true;
            }
        }
        throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
    }

    private final byte[] zza(int i, boolean z) throws IOException {
        byte[] zzj = zzj(i);
        if (zzj != null) {
            return zzj;
        }
        int i2 = this.zzi;
        int i3 = this.zzg;
        int i4 = i3 - i2;
        this.zzk += i3;
        this.zzi = 0;
        this.zzg = 0;
        List<byte[]> zzf = zzf(i - i4);
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, i2, bArr, 0, i4);
        for (byte[] bArr2 : zzf) {
            System.arraycopy(bArr2, 0, bArr, i4, bArr2.length);
            i4 += bArr2.length;
        }
        return bArr;
    }

    private final byte[] zzj(int i) throws IOException {
        if (i == 0) {
            return zzakb.zzb;
        }
        if (i < 0) {
            throw zzakf.zzf();
        }
        int i2 = this.zzk + this.zzi + i;
        if (i2 - this.zzc > 0) {
            throw zzakf.zzi();
        }
        int i3 = this.zzl;
        if (i2 > i3) {
            zzh((i3 - this.zzk) - this.zzi);
            throw zzakf.zzj();
        }
        int i4 = this.zzg - this.zzi;
        int i5 = i - i4;
        if (i5 >= 4096 && i5 > zza(this.zze)) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.zzf, this.zzi, bArr, 0, i4);
        this.zzk += this.zzg;
        this.zzi = 0;
        this.zzg = 0;
        while (i4 < i) {
            int zza = zza(this.zze, bArr, i4, i - i4);
            if (zza == -1) {
                throw zzakf.zzj();
            }
            this.zzk += zza;
            i4 += zza;
        }
        return bArr;
    }
}
