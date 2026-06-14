package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzeu implements zzfe {
    public static final zzeu zza = new zzeu();

    private zzeu() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzrr) it.next()).zzP()));
        }
        return !arrayList.contains(false);
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (!zzb(ArraysKt.toList(zzrrVarArr))) {
            throw new zzby(4, 5, null);
        }
        for (zzrr zzrrVar : zzrrVarArr) {
            zzekVar.zzc().zzb(zzrrVar.zzi());
        }
    }
}
