package com.google.android.recaptcha.internal;

import java.lang.reflect.Array;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzep implements zzfe {
    public static final zzep zza = new zzep();

    private zzep() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 3) {
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
        Object zza4 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (zza4 instanceof Object)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            Array.set(zza2, intValue, zza4);
        } catch (Exception e) {
            if (!(e instanceof ArrayIndexOutOfBoundsException)) {
                throw new zzby(4, 25, e);
            }
            throw new zzby(4, 22, e);
        }
    }
}
