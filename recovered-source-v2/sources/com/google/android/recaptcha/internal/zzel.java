package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzel {
    private final Map zza = new LinkedHashMap();
    private final Set zzb = new LinkedHashSet();

    private final List zzh(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zza((zzrr) it.next()));
        }
        return arrayList;
    }

    public final Object zza(zzrr zzrrVar) throws zzby {
        int zzQ = zzrrVar.zzQ();
        int i = zzQ - 1;
        if (zzQ == 0) {
            throw null;
        }
        switch (i) {
            case 0:
                return this.zza.get(Integer.valueOf(zzrrVar.zzi()));
            case 1:
                return Boolean.valueOf(zzrrVar.zzO());
            case 2:
                byte[] zzl = zzrrVar.zzK().zzl();
                if (zzl.length == 1) {
                    return Byte.valueOf(zzl[0]);
                }
                throw new zzby(4, 6, null);
            case 3:
                String zzM = zzrrVar.zzM();
                if (zzM.length() == 1) {
                    return Character.valueOf(zzM.charAt(0));
                }
                throw new zzby(4, 6, null);
            case 4:
                int zzj = zzrrVar.zzj();
                if (zzj < -32768 || zzj > 32767) {
                    throw new zzby(4, 6, null);
                }
                return Short.valueOf((short) zzj);
            case 5:
                return Integer.valueOf(zzrrVar.zzk());
            case 6:
            case 8:
                throw new zzby(4, 6, null);
            case 7:
                return Long.valueOf(zzrrVar.zzJ());
            case 9:
                return Float.valueOf(zzrrVar.zzg());
            case 10:
                return Double.valueOf(zzrrVar.zzf());
            case 11:
                return zzrrVar.zzN();
            case 12:
                return null;
            default:
                throw new zzby(4, 5, null);
        }
    }

    public final Object zzb(int i) {
        return this.zza.remove(Integer.valueOf(i));
    }

    public final void zzc() {
        this.zza.clear();
    }

    public final void zzd(int i, Object obj) {
        zze(173, obj);
        this.zzb.add(173);
    }

    public final void zze(int i, Object obj) {
        this.zza.put(Integer.valueOf(i), obj);
    }

    public final Class[] zzf(List list) {
        List zzh = zzh(list);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(zzh, 10));
        Iterator it = zzh.iterator();
        while (it.hasNext()) {
            arrayList.add(zzej.zza(it.next()));
        }
        return (Class[]) arrayList.toArray(new Class[0]);
    }

    public final Object[] zzg(List list) {
        return zzh(list).toArray(new Object[0]);
    }
}
