package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzkf extends zzke {
    zzkf() {
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final int zza(Map.Entry entry) {
        return ((zzkp) entry.getKey()).zza;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final zzki zzb(Object obj) {
        return ((zzko) obj).zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final zzki zzc(Object obj) {
        return ((zzko) obj).zzi();
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final Object zzd(zzkd zzkdVar, zzlx zzlxVar, int i) {
        return zzkdVar.zza(zzlxVar, i);
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final Object zze(Object obj, zzmj zzmjVar, Object obj2, zzkd zzkdVar, zzki zzkiVar, Object obj3, zznb zznbVar) throws IOException {
        Object zze;
        zzkq zzkqVar = (zzkq) obj2;
        zznm zznmVar = zzkqVar.zza.zzb;
        Object obj4 = null;
        if (zznmVar == zznm.ENUM) {
            zzmjVar.zzg();
            throw null;
        }
        switch (zznmVar) {
            case DOUBLE:
                obj4 = Double.valueOf(zzmjVar.zza());
                break;
            case FLOAT:
                obj4 = Float.valueOf(zzmjVar.zzb());
                break;
            case INT64:
                obj4 = Long.valueOf(zzmjVar.zzl());
                break;
            case UINT64:
                obj4 = Long.valueOf(zzmjVar.zzo());
                break;
            case INT32:
                obj4 = Integer.valueOf(zzmjVar.zzg());
                break;
            case FIXED64:
                obj4 = Long.valueOf(zzmjVar.zzk());
                break;
            case FIXED32:
                obj4 = Integer.valueOf(zzmjVar.zzf());
                break;
            case BOOL:
                obj4 = Boolean.valueOf(zzmjVar.zzN());
                break;
            case STRING:
                obj4 = zzmjVar.zzr();
                break;
            case GROUP:
                Object zze2 = zzkiVar.zze(zzkqVar.zza);
                if (!(zze2 instanceof zzks)) {
                    throw null;
                }
                zzmk zzb = zzmg.zza().zzb(zze2.getClass());
                if (!((zzks) zze2).zzI()) {
                    Object zze3 = zzb.zze();
                    zzb.zzg(zze3, zze2);
                    zzkiVar.zzi(zzkqVar.zza, zze3);
                    zze2 = zze3;
                }
                zzmjVar.zzt(zze2, zzb, zzkdVar);
                return obj3;
            case MESSAGE:
                Object zze4 = zzkiVar.zze(zzkqVar.zza);
                if (!(zze4 instanceof zzks)) {
                    throw null;
                }
                zzmk zzb2 = zzmg.zza().zzb(zze4.getClass());
                if (!((zzks) zze4).zzI()) {
                    Object zze5 = zzb2.zze();
                    zzb2.zzg(zze5, zze4);
                    zzkiVar.zzi(zzkqVar.zza, zze5);
                    zze4 = zze5;
                }
                zzmjVar.zzu(zze4, zzb2, zzkdVar);
                return obj3;
            case BYTES:
                obj4 = zzmjVar.zzp();
                break;
            case UINT32:
                obj4 = Integer.valueOf(zzmjVar.zzj());
                break;
            case ENUM:
                throw new IllegalStateException("Shouldn't reach here.");
            case SFIXED32:
                obj4 = Integer.valueOf(zzmjVar.zzh());
                break;
            case SFIXED64:
                obj4 = Long.valueOf(zzmjVar.zzm());
                break;
            case SINT32:
                obj4 = Integer.valueOf(zzmjVar.zzi());
                break;
            case SINT64:
                obj4 = Long.valueOf(zzmjVar.zzn());
                break;
        }
        int ordinal = zzkqVar.zza.zzb.ordinal();
        if ((ordinal == 9 || ordinal == 10) && (zze = zzkiVar.zze(zzkqVar.zza)) != null) {
            byte[] bArr = zzla.zzb;
            obj4 = ((zzlx) zze).zzab().zzc((zzlx) obj4).zzk();
        }
        zzkiVar.zzi(zzkqVar.zza, obj4);
        return obj3;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzf(Object obj) {
        ((zzko) obj).zzb.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzg(zzmj zzmjVar, Object obj, zzkd zzkdVar, zzki zzkiVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzh(zziv zzivVar, Object obj, zzkd zzkdVar, zzki zzkiVar) throws IOException {
        throw null;
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final void zzi(zzno zznoVar, Map.Entry entry) throws IOException {
        zzkp zzkpVar = (zzkp) entry.getKey();
        zznm zznmVar = zznm.DOUBLE;
        switch (zzkpVar.zzb) {
            case DOUBLE:
                zznoVar.zzf(zzkpVar.zza, ((Double) entry.getValue()).doubleValue());
                break;
            case FLOAT:
                zznoVar.zzo(zzkpVar.zza, ((Float) entry.getValue()).floatValue());
                break;
            case INT64:
                zznoVar.zzt(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case UINT64:
                zznoVar.zzK(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case INT32:
                zznoVar.zzr(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case FIXED64:
                zznoVar.zzm(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case FIXED32:
                zznoVar.zzk(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case BOOL:
                zznoVar.zzb(zzkpVar.zza, ((Boolean) entry.getValue()).booleanValue());
                break;
            case STRING:
                zznoVar.zzG(zzkpVar.zza, (String) entry.getValue());
                break;
            case GROUP:
                zznoVar.zzq(zzkpVar.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                break;
            case MESSAGE:
                zznoVar.zzv(zzkpVar.zza, entry.getValue(), zzmg.zza().zzb(entry.getValue().getClass()));
                break;
            case BYTES:
                zznoVar.zzd(zzkpVar.zza, (zziv) entry.getValue());
                break;
            case UINT32:
                zznoVar.zzI(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case ENUM:
                zznoVar.zzr(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED32:
                zznoVar.zzx(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case SFIXED64:
                zznoVar.zzz(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
            case SINT32:
                zznoVar.zzB(zzkpVar.zza, ((Integer) entry.getValue()).intValue());
                break;
            case SINT64:
                zznoVar.zzD(zzkpVar.zza, ((Long) entry.getValue()).longValue());
                break;
        }
    }

    @Override // com.google.android.recaptcha.internal.zzke
    final boolean zzj(zzlx zzlxVar) {
        return zzlxVar instanceof zzko;
    }
}
