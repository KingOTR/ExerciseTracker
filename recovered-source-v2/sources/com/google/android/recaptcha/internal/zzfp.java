package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayList;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzfp implements zzfe {
    public static final zzfp zza = new zzfp();

    private zzfp() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        Object obj;
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
        if (true != (zza3 instanceof Integer)) {
            zza3 = null;
        }
        Integer num = (Integer) zza3;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int intValue = num.intValue();
        if (zza2 instanceof Integer) {
            obj = Integer.valueOf(((Number) zza2).intValue() * intValue);
        } else {
            if (!(zza2 instanceof int[])) {
                throw new zzby(4, 5, null);
            }
            int[] iArr = (int[]) zza2;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i2 : iArr) {
                arrayList.add(Integer.valueOf(i2 * intValue));
            }
            obj = (Serializable) arrayList.toArray(new Integer[0]);
        }
        zzekVar.zzc().zze(i, obj);
    }
}
