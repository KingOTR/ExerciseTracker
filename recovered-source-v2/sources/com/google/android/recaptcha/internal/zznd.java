package com.google.android.recaptcha.internal;

import java.io.IOException;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zznd extends zznb {
    zznd() {
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ int zza(Object obj) {
        return ((zznc) obj).zza();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ int zzb(Object obj) {
        return ((zznc) obj).zzb();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* bridge */ /* synthetic */ Object zzc(Object obj) {
        zzks zzksVar = (zzks) obj;
        zznc zzncVar = zzksVar.zzc;
        if (zzncVar != zznc.zzc()) {
            return zzncVar;
        }
        zznc zzf = zznc.zzf();
        zzksVar.zzc = zzf;
        return zzf;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ Object zzd(Object obj) {
        return ((zzks) obj).zzc;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* bridge */ /* synthetic */ Object zze(Object obj, Object obj2) {
        if (zznc.zzc().equals(obj2)) {
            return obj;
        }
        if (zznc.zzc().equals(obj)) {
            return zznc.zze((zznc) obj, (zznc) obj2);
        }
        ((zznc) obj).zzd((zznc) obj2);
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ Object zzf() {
        return zznc.zzf();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ Object zzg(Object obj) {
        ((zznc) obj).zzh();
        return obj;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* bridge */ /* synthetic */ void zzh(Object obj, int i, int i2) {
        ((zznc) obj).zzj((i << 3) | 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* bridge */ /* synthetic */ void zzi(Object obj, int i, long j) {
        ((zznc) obj).zzj((i << 3) | 1, Long.valueOf(j));
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* bridge */ /* synthetic */ void zzj(Object obj, int i, Object obj2) {
        ((zznc) obj).zzj((i << 3) | 3, obj2);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* bridge */ /* synthetic */ void zzk(Object obj, int i, zziv zzivVar) {
        ((zznc) obj).zzj((i << 3) | 2, zzivVar);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* bridge */ /* synthetic */ void zzl(Object obj, int i, long j) {
        ((zznc) obj).zzj(i << 3, Long.valueOf(j));
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final void zzm(Object obj) {
        ((zzks) obj).zzc.zzh();
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ void zzn(Object obj, Object obj2) {
        ((zzks) obj).zzc = (zznc) obj2;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ void zzo(Object obj, Object obj2) {
        ((zzks) obj).zzc = (zznc) obj2;
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ void zzp(Object obj, zzno zznoVar) throws IOException {
        ((zznc) obj).zzk(zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final /* synthetic */ void zzq(Object obj, zzno zznoVar) throws IOException {
        ((zznc) obj).zzl(zznoVar);
    }

    @Override // com.google.android.recaptcha.internal.zznb
    final boolean zzs(zzmj zzmjVar) {
        return false;
    }
}
