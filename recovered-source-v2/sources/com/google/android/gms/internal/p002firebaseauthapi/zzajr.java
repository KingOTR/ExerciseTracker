package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajr<T extends zzajt<T>> {
    private static final zzajr<?> zzb = new zzajr<>(true);
    final zzalw<T, Object> zza;
    private boolean zzc;
    private boolean zzd;

    static int zza(zzamw zzamwVar, int i, Object obj) {
        int zzi = zzajg.zzi(i);
        if (zzamwVar == zzamw.zzj) {
            zzakb.zza((zzalc) obj);
            zzi <<= 1;
        }
        return zzi + zza(zzamwVar, obj);
    }

    private static int zza(zzamw zzamwVar, Object obj) {
        switch (zzajq.zzb[zzamwVar.ordinal()]) {
            case 1:
                return zzajg.zza(((Double) obj).doubleValue());
            case 2:
                return zzajg.zza(((Float) obj).floatValue());
            case 3:
                return zzajg.zzd(((Long) obj).longValue());
            case 4:
                return zzajg.zzg(((Long) obj).longValue());
            case 5:
                return zzajg.zze(((Integer) obj).intValue());
            case 6:
                return zzajg.zzc(((Long) obj).longValue());
            case 7:
                return zzajg.zzd(((Integer) obj).intValue());
            case 8:
                return zzajg.zza(((Boolean) obj).booleanValue());
            case 9:
                return zzajg.zza((zzalc) obj);
            case 10:
                if (obj instanceof zzakg) {
                    return zzajg.zza((zzakg) obj);
                }
                return zzajg.zzb((zzalc) obj);
            case 11:
                if (obj instanceof zzaip) {
                    return zzajg.zza((zzaip) obj);
                }
                return zzajg.zza((String) obj);
            case 12:
                if (obj instanceof zzaip) {
                    return zzajg.zza((zzaip) obj);
                }
                return zzajg.zza((byte[]) obj);
            case 13:
                return zzajg.zzj(((Integer) obj).intValue());
            case 14:
                return zzajg.zzg(((Integer) obj).intValue());
            case 15:
                return zzajg.zze(((Long) obj).longValue());
            case 16:
                return zzajg.zzh(((Integer) obj).intValue());
            case 17:
                return zzajg.zzf(((Long) obj).longValue());
            case 18:
                if (obj instanceof zzaka) {
                    return zzajg.zzc(((zzaka) obj).zza());
                }
                return zzajg.zzc(((Integer) obj).intValue());
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    public static int zza(zzajt<?> zzajtVar, Object obj) {
        zzamw zzb2 = zzajtVar.zzb();
        int zza = zzajtVar.zza();
        if (zzajtVar.zze()) {
            List list = (List) obj;
            int size = list.size();
            int i = 0;
            if (!zzajtVar.zzd()) {
                int i2 = 0;
                while (i < size) {
                    i2 += zza(zzb2, zza, list.get(i));
                    i++;
                }
                return i2;
            }
            if (list.isEmpty()) {
                return 0;
            }
            int i3 = 0;
            while (i < size) {
                i3 += zza(zzb2, list.get(i));
                i++;
            }
            return zzajg.zzi(zza) + i3 + zzajg.zzj(i3);
        }
        return zza(zzb2, zza, obj);
    }

    public final int zza() {
        int zza = this.zza.zza();
        int i = 0;
        for (int i2 = 0; i2 < zza; i2++) {
            i += zza((Map.Entry) this.zza.zza(i2));
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            i += zza((Map.Entry) it.next());
        }
        return i;
    }

    private static int zza(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        Object value = entry.getValue();
        if (key.zzc() == zzand.MESSAGE && !key.zze() && !key.zzd()) {
            if (value instanceof zzakg) {
                return zzajg.zza(entry.getKey().zza(), (zzakg) value);
            }
            return zzajg.zza(entry.getKey().zza(), (zzalc) value);
        }
        return zza((zzajt<?>) key, value);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public static <T extends zzajt<T>> zzajr<T> zzb() {
        return (zzajr<T>) zzb;
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzajr zzajrVar = new zzajr();
        int zza = this.zza.zza();
        for (int i = 0; i < zza; i++) {
            Map.Entry<T, Object> zza2 = this.zza.zza(i);
            zzajrVar.zzb(zza2.getKey(), zza2.getValue());
        }
        for (Map.Entry<T, Object> entry : this.zza.zzb()) {
            zzajrVar.zzb(entry.getKey(), entry.getValue());
        }
        zzajrVar.zzd = this.zzd;
        return zzajrVar;
    }

    private static Object zza(Object obj) {
        if (obj instanceof zzall) {
            return ((zzall) obj).clone();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private final Object zza(T t) {
        Object obj = this.zza.get(t);
        if (!(obj instanceof zzakg)) {
            return obj;
        }
        throw new NoSuchMethodError();
    }

    final Iterator<Map.Entry<T, Object>> zzc() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzaki(this.zza.zzc().iterator());
        }
        return this.zza.zzc().iterator();
    }

    public final Iterator<Map.Entry<T, Object>> zzd() {
        if (this.zza.isEmpty()) {
            return Collections.emptyIterator();
        }
        if (this.zzd) {
            return new zzaki(this.zza.entrySet().iterator());
        }
        return this.zza.entrySet().iterator();
    }

    private zzajr() {
        this.zza = new zzalz();
    }

    private zzajr(zzalw<T, Object> zzalwVar) {
        this.zza = zzalwVar;
        zze();
    }

    private zzajr(boolean z) {
        this(new zzalz());
        zze();
    }

    public final void zze() {
        if (this.zzc) {
            return;
        }
        int zza = this.zza.zza();
        for (int i = 0; i < zza; i++) {
            Object value = this.zza.zza(i).getValue();
            if (value instanceof zzajy) {
                ((zzajy) value).zzs();
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            Object value2 = it.next().getValue();
            if (value2 instanceof zzajy) {
                ((zzajy) value2).zzs();
            }
        }
        this.zza.zzd();
        this.zzc = true;
    }

    public final void zza(zzajr<T> zzajrVar) {
        int zza = zzajrVar.zza.zza();
        for (int i = 0; i < zza; i++) {
            zzb((Map.Entry) zzajrVar.zza.zza(i));
        }
        Iterator<Map.Entry<T, Object>> it = zzajrVar.zza.zzb().iterator();
        while (it.hasNext()) {
            zzb((Map.Entry) it.next());
        }
    }

    private final void zzb(Map.Entry<T, Object> entry) {
        zzalc zze;
        T key = entry.getKey();
        Object value = entry.getValue();
        boolean z = value instanceof zzakg;
        if (key.zze()) {
            if (z) {
                throw new IllegalStateException("Lazy fields can not be repeated");
            }
            Object zza = zza((zzajr<T>) key);
            List list = (List) value;
            int size = list.size();
            if (zza == null) {
                zza = new ArrayList(size);
            }
            List list2 = (List) zza;
            for (int i = 0; i < size; i++) {
                list2.add(zza(list.get(i)));
            }
            this.zza.zza((zzalw<T, Object>) key, (T) zza);
            return;
        }
        if (key.zzc() != zzand.MESSAGE) {
            if (z) {
                throw new IllegalStateException("Lazy fields must be message-valued");
            }
            this.zza.zza((zzalw<T, Object>) key, (T) zza(value));
            return;
        }
        Object zza2 = zza((zzajr<T>) key);
        if (zza2 == null) {
            this.zza.zza((zzalw<T, Object>) key, (T) zza(value));
            if (z) {
                this.zzd = true;
                return;
            }
            return;
        }
        if (z) {
            throw new NoSuchMethodError();
        }
        if (zza2 instanceof zzall) {
            zze = key.zza((zzall) zza2, (zzall) value);
        } else {
            zze = key.zza(((zzalc) zza2).zzr(), (zzalc) value).zze();
        }
        this.zza.zza((zzalw<T, Object>) key, (T) zze);
    }

    private final void zzb(T t, Object obj) {
        if (t.zze()) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
            }
            List list = (List) obj;
            int size = list.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                zzc(t, obj2);
                arrayList.add(obj2);
            }
            obj = arrayList;
        } else {
            zzc(t, obj);
        }
        if (obj instanceof zzakg) {
            this.zzd = true;
        }
        this.zza.zza((zzalw<T, Object>) t, (T) obj);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzakg) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if ((r4 instanceof com.google.android.gms.internal.p002firebaseauthapi.zzaka) == false) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        if ((r4 instanceof byte[]) == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void zzc(T t, Object obj) {
        zzamw zzb2 = t.zzb();
        zzakb.zza(obj);
        boolean z = true;
        switch (zzajq.zza[zzb2.zzb().ordinal()]) {
            case 1:
                z = obj instanceof Integer;
                break;
            case 2:
                z = obj instanceof Long;
                break;
            case 3:
                z = obj instanceof Float;
                break;
            case 4:
                z = obj instanceof Double;
                break;
            case 5:
                z = obj instanceof Boolean;
                break;
            case 6:
                z = obj instanceof String;
                break;
            case 7:
                if (!(obj instanceof zzaip)) {
                    break;
                }
                break;
            case 8:
                if (!(obj instanceof Integer)) {
                    break;
                }
                break;
            case 9:
                if (!(obj instanceof zzalc)) {
                    break;
                }
                break;
            default:
                z = false;
                break;
        }
        if (!z) {
            throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", Integer.valueOf(t.zza()), t.zzb().zzb(), obj.getClass().getName()));
        }
    }

    static void zza(zzajg zzajgVar, zzamw zzamwVar, int i, Object obj) throws IOException {
        if (zzamwVar == zzamw.zzj) {
            zzalc zzalcVar = (zzalc) obj;
            zzakb.zza(zzalcVar);
            zzajgVar.zzk(i, 3);
            zzalcVar.zza(zzajgVar);
            zzajgVar.zzk(i, 4);
        }
        zzajgVar.zzk(i, zzamwVar.zza());
        switch (zzajq.zzb[zzamwVar.ordinal()]) {
            case 1:
                zzajgVar.zzb(((Double) obj).doubleValue());
                break;
            case 2:
                zzajgVar.zzb(((Float) obj).floatValue());
                break;
            case 3:
                zzajgVar.zzj(((Long) obj).longValue());
                break;
            case 4:
                zzajgVar.zzj(((Long) obj).longValue());
                break;
            case 5:
                zzajgVar.zzl(((Integer) obj).intValue());
                break;
            case 6:
                zzajgVar.zzh(((Long) obj).longValue());
                break;
            case 7:
                zzajgVar.zzk(((Integer) obj).intValue());
                break;
            case 8:
                zzajgVar.zzb(((Boolean) obj).booleanValue());
                break;
            case 9:
                ((zzalc) obj).zza(zzajgVar);
                break;
            case 10:
                zzajgVar.zzc((zzalc) obj);
                break;
            case 11:
                if (obj instanceof zzaip) {
                    zzajgVar.zzb((zzaip) obj);
                    break;
                } else {
                    zzajgVar.zzb((String) obj);
                    break;
                }
            case 12:
                if (obj instanceof zzaip) {
                    zzajgVar.zzb((zzaip) obj);
                    break;
                } else {
                    byte[] bArr = (byte[]) obj;
                    zzajgVar.zzb(bArr, 0, bArr.length);
                    break;
                }
            case 13:
                zzajgVar.zzn(((Integer) obj).intValue());
                break;
            case 14:
                zzajgVar.zzk(((Integer) obj).intValue());
                break;
            case 15:
                zzajgVar.zzh(((Long) obj).longValue());
                break;
            case 16:
                zzajgVar.zzm(((Integer) obj).intValue());
                break;
            case 17:
                zzajgVar.zzi(((Long) obj).longValue());
                break;
            case 18:
                if (obj instanceof zzaka) {
                    zzajgVar.zzl(((zzaka) obj).zza());
                    break;
                } else {
                    zzajgVar.zzl(((Integer) obj).intValue());
                    break;
                }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zzajr) {
            return this.zza.equals(((zzajr) obj).zza);
        }
        return false;
    }

    public final boolean zzf() {
        return this.zzc;
    }

    public final boolean zzg() {
        int zza = this.zza.zza();
        for (int i = 0; i < zza; i++) {
            if (!zzc(this.zza.zza(i))) {
                return false;
            }
        }
        Iterator<Map.Entry<T, Object>> it = this.zza.zzb().iterator();
        while (it.hasNext()) {
            if (!zzc(it.next())) {
                return false;
            }
        }
        return true;
    }

    private static <T extends zzajt<T>> boolean zzc(Map.Entry<T, Object> entry) {
        T key = entry.getKey();
        if (key.zzc() != zzand.MESSAGE) {
            return true;
        }
        if (key.zze()) {
            List list = (List) entry.getValue();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (!zzb(list.get(i))) {
                    return false;
                }
            }
            return true;
        }
        return zzb(entry.getValue());
    }

    private static boolean zzb(Object obj) {
        if (obj instanceof zzale) {
            return ((zzale) obj).zzj();
        }
        if (obj instanceof zzakg) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }
}
