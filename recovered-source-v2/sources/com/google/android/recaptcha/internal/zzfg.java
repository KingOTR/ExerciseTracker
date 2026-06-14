package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzfg implements zzfe {
    public static final zzfg zza = new zzfg();

    private zzfg() {
    }

    @Override // com.google.android.recaptcha.internal.zzfe
    public final void zza(int i, zzek zzekVar, zzrr... zzrrVarArr) throws zzby {
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
            if (zza2 instanceof String) {
                zza2 = zzekVar.zzh().zza((String) zza2);
            }
            zzekVar.zzc().zze(i, zzej.zza(zza2));
        } catch (zzby e) {
            throw e;
        } catch (Exception e2) {
            throw new zzby(6, 8, e2);
        }
    }
}
