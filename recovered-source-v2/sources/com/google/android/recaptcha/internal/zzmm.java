package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
final class zzmm {
    public static final /* synthetic */ int zza = 0;
    private static final Class zzb;
    private static final zznb zzc;
    private static final zznb zzd;

    static {
        Class<?> cls;
        Class<?> cls2;
        zznb zznbVar = null;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            cls = null;
        }
        zzb = cls;
        try {
            cls2 = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused2) {
            cls2 = null;
        }
        if (cls2 != null) {
            try {
                zznbVar = (zznb) cls2.getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Throwable unused3) {
            }
        }
        zzc = zznbVar;
        zzd = new zznd();
    }

    public static void zzA(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzu(i, list, z);
    }

    public static void zzB(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzy(i, list, z);
    }

    public static void zzC(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzA(i, list, z);
    }

    public static void zzD(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzC(i, list, z);
    }

    public static void zzE(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzE(i, list, z);
    }

    public static void zzF(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzJ(i, list, z);
    }

    public static void zzG(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzL(i, list, z);
    }

    static boolean zzH(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    static int zza(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(zzktVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzb(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzx(i << 3) + 4);
    }

    static int zzc(List list) {
        return list.size() * 4;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzjg.zzx(i << 3) + 8);
    }

    static int zze(List list) {
        return list.size() * 8;
    }

    static int zzf(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(zzktVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzg(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(zzlmVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzh(int i, Object obj, zzmk zzmkVar) {
        int i2 = i << 3;
        if (!(obj instanceof zzli)) {
            return zzjg.zzx(i2) + zzjg.zzv((zzlx) obj, zzmkVar);
        }
        int zzx = zzjg.zzx(i2);
        int zza2 = ((zzli) obj).zza();
        return zzx + zzjg.zzx(zza2) + zza2;
    }

    static int zzi(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i = 0;
            while (i2 < size) {
                int zze = zzktVar.zze(i2);
                i += zzjg.zzx((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i += zzjg.zzx((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzj(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            i = 0;
            while (i2 < size) {
                long zze = zzlmVar.zze(i2);
                i += zzjg.zzy((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i += zzjg.zzy((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzk(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzkt) {
            zzkt zzktVar = (zzkt) list;
            i = 0;
            while (i2 < size) {
                i += zzjg.zzx(zzktVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjg.zzx(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzlm) {
            zzlm zzlmVar = (zzlm) list;
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(zzlmVar.zze(i2));
                i2++;
            }
        } else {
            i = 0;
            while (i2 < size) {
                i += zzjg.zzy(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zznb zzm() {
        return zzc;
    }

    public static zznb zzn() {
        return zzd;
    }

    static Object zzo(Object obj, int i, List list, zzkw zzkwVar, Object obj2, zznb zznbVar) {
        if (zzkwVar == null) {
            return obj2;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzkwVar.zza(intValue)) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj2 = zzp(obj, i, intValue, obj2, zznbVar);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj2;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzkwVar.zza(intValue2)) {
                    obj2 = zzp(obj, i, intValue2, obj2, zznbVar);
                    it.remove();
                }
            }
        }
        return obj2;
    }

    static Object zzp(Object obj, int i, int i2, Object obj2, zznb zznbVar) {
        if (obj2 == null) {
            obj2 = zznbVar.zzc(obj);
        }
        zznbVar.zzl(obj2, i, i2);
        return obj2;
    }

    static void zzq(zzke zzkeVar, Object obj, Object obj2) {
        zzki zzb2 = zzkeVar.zzb(obj2);
        if (zzb2.zza.isEmpty()) {
            return;
        }
        zzkeVar.zzc(obj).zzh(zzb2);
    }

    static void zzr(zznb zznbVar, Object obj, Object obj2) {
        zznbVar.zzo(obj, zznbVar.zze(zznbVar.zzd(obj), zznbVar.zzd(obj2)));
    }

    public static void zzs(Class cls) {
        Class cls2;
        if (!zzks.class.isAssignableFrom(cls) && (cls2 = zzb) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static void zzt(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzc(i, list, z);
    }

    public static void zzu(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzg(i, list, z);
    }

    public static void zzv(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzj(i, list, z);
    }

    public static void zzw(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzl(i, list, z);
    }

    public static void zzx(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzn(i, list, z);
    }

    public static void zzy(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzp(i, list, z);
    }

    public static void zzz(int i, List list, zzno zznoVar, boolean z) throws IOException {
        if (list == null || list.isEmpty()) {
            return;
        }
        zznoVar.zzs(i, list, z);
    }
}
