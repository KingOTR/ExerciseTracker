package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzamn {
    private static final zzamn zza = new zzamn(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    public final int zza() {
        int zze;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                zze = zzajg.zze(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 1) {
                zze = zzajg.zza(i5, ((Long) this.zzd[i3]).longValue());
            } else if (i6 == 2) {
                zze = zzajg.zza(i5, (zzaip) this.zzd[i3]);
            } else if (i6 == 3) {
                zze = (zzajg.zzi(i5) << 1) + ((zzamn) this.zzd[i3]).zza();
            } else {
                if (i6 != 5) {
                    throw new IllegalStateException(zzakf.zza());
                }
                zze = zzajg.zzc(i5, ((Integer) this.zzd[i3]).intValue());
            }
            i2 += zze;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            i2 += zzajg.zzb(this.zzc[i3] >>> 3, (zzaip) this.zzd[i3]);
        }
        this.zze = i2;
        return i2;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public static zzamn zzc() {
        return zza;
    }

    final zzamn zza(zzamn zzamnVar) {
        if (zzamnVar.equals(zza)) {
            return this;
        }
        zzf();
        int i = this.zzb + zzamnVar.zzb;
        zza(i);
        System.arraycopy(zzamnVar.zzc, 0, this.zzc, this.zzb, zzamnVar.zzb);
        System.arraycopy(zzamnVar.zzd, 0, this.zzd, this.zzb, zzamnVar.zzb);
        this.zzb = i;
        return this;
    }

    static zzamn zza(zzamn zzamnVar, zzamn zzamnVar2) {
        int i = zzamnVar.zzb + zzamnVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzamnVar.zzc, i);
        System.arraycopy(zzamnVar2.zzc, 0, copyOf, zzamnVar.zzb, zzamnVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzamnVar.zzd, i);
        System.arraycopy(zzamnVar2.zzd, 0, copyOf2, zzamnVar.zzb, zzamnVar2.zzb);
        return new zzamn(i, copyOf, copyOf2, true);
    }

    static zzamn zzd() {
        return new zzamn();
    }

    private zzamn() {
        this(0, new int[8], new Object[8], true);
    }

    private zzamn(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    private final void zzf() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    private final void zza(int i) {
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

    public final void zze() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zza(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzalh.zza(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zza(int i, Object obj) {
        zzf();
        zza(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zza(zzanf zzanfVar) throws IOException {
        if (zzanfVar.zza() == 2) {
            for (int i = this.zzb - 1; i >= 0; i--) {
                zzanfVar.zza(this.zzc[i] >>> 3, this.zzd[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzanfVar.zza(this.zzc[i2] >>> 3, this.zzd[i2]);
        }
    }

    private static void zza(int i, Object obj, zzanf zzanfVar) throws IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zzanfVar.zzb(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zzanfVar.zza(i2, ((Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zzanfVar.zza(i2, (zzaip) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zzanfVar.zzb(i2, ((Integer) obj).intValue());
                return;
            }
            throw new RuntimeException(zzakf.zza());
        }
        if (zzanfVar.zza() == 1) {
            zzanfVar.zzb(i2);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zza(i2);
        } else {
            zzanfVar.zza(i2);
            ((zzamn) obj).zzb(zzanfVar);
            zzanfVar.zzb(i2);
        }
    }

    public final void zzb(zzanf zzanfVar) throws IOException {
        if (this.zzb == 0) {
            return;
        }
        if (zzanfVar.zza() == 1) {
            for (int i = 0; i < this.zzb; i++) {
                zza(this.zzc[i], this.zzd[i], zzanfVar);
            }
            return;
        }
        for (int i2 = this.zzb - 1; i2 >= 0; i2--) {
            zza(this.zzc[i2], this.zzd[i2], zzanfVar);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzamn)) {
            return false;
        }
        zzamn zzamnVar = (zzamn) obj;
        int i = this.zzb;
        if (i == zzamnVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzamnVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    if (iArr[i2] != iArr2[i2]) {
                        break;
                    }
                    i2++;
                } else {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzamnVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }
}
