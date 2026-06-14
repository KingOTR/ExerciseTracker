package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.collections.ArraysKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzfn implements zzfe {
    public static final zzfn zza = new zzfn();

    private zzfn() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        int length = zzrrVarArr.length;
        if (length == 0) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Method)) {
            zza2 = null;
        }
        Method method = (Method) zza2;
        if (method == null) {
            throw new zzby(4, 5, null);
        }
        Object[] zzg = zzekVar.zzc().zzg(ArraysKt.toList(zzrrVarArr).subList(1, length));
        try {
            zzekVar.zzc().zze(i, method.invoke(null, Arrays.copyOf(zzg, zzg.length)));
        } catch (Exception e) {
            throw new zzby(6, 15, e);
        }
    }
}
