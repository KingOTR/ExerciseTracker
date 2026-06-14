package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzfs implements zzfe {
    public static final zzfs zza = new zzfs();

    private zzfs() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        zzekVar.zzc().zze(i, zzekVar.zzc().zza(zzrrVarArr[0]));
    }
}
