package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzff implements zzfe {
    public static final zzff zza = new zzff();

    private zzff() {
    }

    private static final List zzc(Object obj) {
        if (obj instanceof byte[]) {
            return ArraysKt.toList((byte[]) obj);
        }
        if (obj instanceof short[]) {
            return ArraysKt.toList((short[]) obj);
        }
        if (obj instanceof int[]) {
            return ArraysKt.toList((int[]) obj);
        }
        if (obj instanceof long[]) {
            return ArraysKt.toList((long[]) obj);
        }
        if (obj instanceof float[]) {
            return ArraysKt.toList((float[]) obj);
        }
        if (obj instanceof double[]) {
            return ArraysKt.toList((double[]) obj);
        }
        return null;
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 2) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzby(4, 5, null);
        }
        zzekVar.zzc().zze(i, zzb(zza2, zza3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object zzb(Object obj, Object obj2) throws zzby {
        List zzc = zzc(obj);
        List zzc2 = zzc(obj2);
        if (obj instanceof Number) {
            if (obj2 instanceof Number) {
                return Double.valueOf(Math.pow(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (zzc2 != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(zzc2, 10));
                Iterator it = zzc2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Double.valueOf(Math.pow(((Number) it.next()).doubleValue(), ((Number) obj).doubleValue())));
                }
                return (Serializable) arrayList.toArray(new Double[0]);
            }
        }
        if (zzc != null && (obj2 instanceof Number)) {
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(zzc, 10));
            Iterator it2 = zzc.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Double.valueOf(Math.pow(((Number) it2.next()).doubleValue(), ((Number) obj2).doubleValue())));
            }
            return (Serializable) arrayList2.toArray(new Double[0]);
        }
        if (zzc == null || zzc2 == null) {
            throw new zzby(4, 5, null);
        }
        zzfd.zza(this, zzc.size(), zzc2.size());
        int size = zzc.size();
        Double[] dArr = new Double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = Double.valueOf(Math.pow(((Number) zzc.get(i)).doubleValue(), ((Number) zzc2.get(i)).doubleValue()));
        }
        return (Serializable) dArr;
    }
}
