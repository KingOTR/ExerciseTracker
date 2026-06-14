package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
abstract class zznb {
    zznb() {
    }

    abstract int zza(Object obj);

    abstract int zzb(Object obj);

    abstract Object zzc(Object obj);

    abstract Object zzd(Object obj);

    abstract Object zze(Object obj, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract void zzh(Object obj, int i, int i2);

    abstract void zzi(Object obj, int i, long j);

    abstract void zzj(Object obj, int i, Object obj2);

    abstract void zzk(Object obj, int i, zziv zzivVar);

    abstract void zzl(Object obj, int i, long j);

    abstract void zzm(Object obj);

    abstract void zzn(Object obj, Object obj2);

    abstract void zzo(Object obj, Object obj2);

    abstract void zzp(Object obj, zzno zznoVar) throws IOException;

    abstract void zzq(Object obj, zzno zznoVar) throws IOException;

    abstract boolean zzs(zzmj zzmjVar);

    final boolean zzr(Object obj, zzmj zzmjVar) throws IOException {
        int zzd = zzmjVar.zzd();
        int i = zzd >>> 3;
        int i2 = zzd & 7;
        if (i2 == 0) {
            zzl(obj, i, zzmjVar.zzl());
            return true;
        }
        if (i2 == 1) {
            zzi(obj, i, zzmjVar.zzk());
            return true;
        }
        if (i2 == 2) {
            zzk(obj, i, zzmjVar.zzp());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 != 5) {
                throw zzlc.zza();
            }
            zzh(obj, i, zzmjVar.zzf());
            return true;
        }
        Object zzf = zzf();
        int i3 = i << 3;
        while (zzmjVar.zzc() != Integer.MAX_VALUE && zzr(zzf, zzmjVar)) {
        }
        if ((4 | i3) != zzmjVar.zzd()) {
            throw zzlc.zzb();
        }
        zzg(zzf);
        zzj(obj, i, zzf);
        return true;
    }
}
