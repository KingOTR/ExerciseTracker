package com.google.android.recaptcha.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzeq implements zzfe {
    public static final zzeq zza = new zzeq();

    private zzeq() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 3) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Integer)) {
            zza2 = null;
        }
        Integer num = (Integer) zza2;
        if (num == null) {
            throw new zzby(4, 5, null);
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            throw new zzby(4, 6, null);
        }
        Object zza3 = zzekVar.zzc().zza(zzrrVarArr[1]);
        if (true != (zza3 instanceof Object)) {
            zza3 = null;
        }
        if (zza3 == null) {
            throw new zzby(4, 5, null);
        }
        Object zza4 = zzekVar.zzc().zza(zzrrVarArr[2]);
        if (true != (zza4 instanceof Object)) {
            zza4 = null;
        }
        if (zza4 == null) {
            throw new zzby(4, 5, null);
        }
        if (Intrinsics.areEqual(zza3, zza4)) {
            zzekVar.zzg(zzekVar.zza() + intValue);
        }
    }
}
