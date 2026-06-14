package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzet implements zzfe {
    public static final zzet zza = new zzet();

    private zzet() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
        boolean z = true;
        if (zzrrVarArr.length != 1) {
            throw new zzby(4, 3, null);
        }
        Object zza2 = zzekVar.zzc().zza(zzrrVarArr[0]);
        if (true != (zza2 instanceof Object)) {
            zza2 = null;
        }
        if (zza2 == null) {
            throw new zzby(4, 5, null);
        }
        try {
            try {
                if (zza2 instanceof String) {
                    zza2 = zzekVar.zzh().zza((String) zza2);
                }
                zzel zzc = zzekVar.zzc();
                try {
                    zzej.zza(zza2);
                } catch (zzby e) {
                    if (e.zzb() != 8 && e.zzb() != 6) {
                        if (e.zzb() != 47) {
                            throw e;
                        }
                    }
                    z = false;
                }
                zzc.zze(i, Boolean.valueOf(z));
            } catch (zzby e2) {
                throw e2;
            }
        } catch (Exception e3) {
            throw new zzby(6, 8, e3);
        }
    }
}
