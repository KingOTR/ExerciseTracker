package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
abstract class zzamo<T, B> {
    private static volatile int zza = 100;

    abstract int zza(T t);

    abstract B zza();

    abstract T zza(T t, T t2);

    abstract void zza(B b, int i, int i2);

    abstract void zza(B b, int i, long j);

    abstract void zza(B b, int i, zzaip zzaipVar);

    abstract void zza(B b, int i, T t);

    abstract void zza(T t, zzanf zzanfVar) throws IOException;

    abstract boolean zza(zzals zzalsVar);

    abstract int zzb(T t);

    abstract void zzb(B b, int i, long j);

    abstract void zzb(T t, zzanf zzanfVar) throws IOException;

    abstract void zzb(Object obj, B b);

    abstract B zzc(Object obj);

    abstract void zzc(Object obj, T t);

    abstract T zzd(Object obj);

    abstract T zze(B b);

    abstract void zzf(Object obj);

    zzamo() {
    }

    final boolean zza(B b, zzals zzalsVar, int i) throws IOException {
        int zzd = zzalsVar.zzd();
        int i2 = zzd >>> 3;
        int i3 = zzd & 7;
        if (i3 == 0) {
            zzb(b, i2, zzalsVar.zzl());
            return true;
        }
        if (i3 == 1) {
            zza((zzamo<T, B>) b, i2, zzalsVar.zzk());
            return true;
        }
        if (i3 == 2) {
            zza((zzamo<T, B>) b, i2, zzalsVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 == 5) {
                zza((zzamo<T, B>) b, i2, zzalsVar.zzf());
                return true;
            }
            throw zzakf.zza();
        }
        B zza2 = zza();
        int i4 = 4 | (i2 << 3);
        int i5 = i + 1;
        if (i5 >= zza) {
            throw zzakf.zzh();
        }
        while (zzalsVar.zzc() != Integer.MAX_VALUE && zza((zzamo<T, B>) zza2, zzalsVar, i5)) {
        }
        if (i4 != zzalsVar.zzd()) {
            throw zzakf.zzb();
        }
        zza((zzamo<T, B>) b, i2, (int) zze(zza2));
        return true;
    }
}
