package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zznc {
    private static final zznc zza = new zznc(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zznc() {
        this(0, new int[8], new Object[8], true);
    }

    private zznc(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zznc zzc() {
        return zza;
    }

    static zznc zze(zznc zzncVar, zznc zzncVar2) {
        int i = zzncVar.zzb + zzncVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzncVar.zzc, i);
        System.arraycopy(zzncVar2.zzc, 0, copyOf, zzncVar.zzb, zzncVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzncVar.zzd, i);
        System.arraycopy(zzncVar2.zzd, 0, copyOf2, zzncVar.zzb, zzncVar2.zzb);
        return new zznc(i, copyOf, copyOf2, true);
    }

    static zznc zzf() {
        return new zznc(0, new int[8], new Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zznc)) {
            return false;
        }
        zznc zzncVar = (zznc) obj;
        int i = this.zzb;
        if (i == zzncVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzncVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzncVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int zzx;
        int zzy;
        int i;
        int i2 = this.zze;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzb; i4++) {
            int i5 = this.zzc[i4];
            int i6 = i5 >>> 3;
            int i7 = i5 & 7;
            if (i7 != 0) {
                if (i7 == 1) {
                    ((Long) this.zzd[i4]).longValue();
                    i = zzjg.zzx(i6 << 3) + 8;
                } else if (i7 == 2) {
                    int i8 = i6 << 3;
                    zziv zzivVar = (zziv) this.zzd[i4];
                    int zzx2 = zzjg.zzx(i8);
                    int zzd = zzivVar.zzd();
                    i = zzx2 + zzjg.zzx(zzd) + zzd;
                } else if (i7 == 3) {
                    int zzx3 = zzjg.zzx(i6 << 3);
                    zzx = zzx3 + zzx3;
                    zzy = ((zznc) this.zzd[i4]).zza();
                } else {
                    if (i7 != 5) {
                        throw new IllegalStateException(zzlc.zza());
                    }
                    ((Integer) this.zzd[i4]).intValue();
                    i = zzjg.zzx(i6 << 3) + 4;
                }
                i3 += i;
            } else {
                int i9 = i6 << 3;
                long longValue = ((Long) this.zzd[i4]).longValue();
                zzx = zzjg.zzx(i9);
                zzy = zzjg.zzy(longValue);
            }
            i = zzx + zzy;
            i3 += i;
        }
        this.zze = i3;
        return i3;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3] >>> 3;
            zziv zzivVar = (zziv) this.zzd[i3];
            int zzx = zzjg.zzx(8);
            int zzx2 = zzjg.zzx(16) + zzjg.zzx(i4);
            int zzx3 = zzjg.zzx(24);
            int zzd = zzivVar.zzd();
            i2 += zzx + zzx + zzx2 + zzx3 + zzjg.zzx(zzd) + zzd;
        }
        this.zze = i2;
        return i2;
    }

    final zznc zzd(zznc zzncVar) {
        if (zzncVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzncVar.zzb;
        zzm(i);
        System.arraycopy(zzncVar.zzc, 0, this.zzc, this.zzb, zzncVar.zzb);
        System.arraycopy(zzncVar.zzd, 0, this.zzd, this.zzb, zzncVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzlz.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(zzno zznoVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zznoVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzno zznoVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zznoVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zznoVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zznoVar.zzd(i4, (zziv) obj);
                } else if (i3 == 3) {
                    zznoVar.zzF(i4);
                    ((zznc) obj).zzl(zznoVar);
                    zznoVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new RuntimeException(zzlc.zza());
                    }
                    zznoVar.zzk(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}
