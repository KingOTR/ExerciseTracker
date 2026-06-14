package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzpo extends zzks implements zzly {
    private static final zzpo zzb;
    private zziv zzd = zziv.zzb;

    static {
        zzpo zzpoVar = new zzpo();
        zzb = zzpoVar;
        zzks.zzF(zzpo.class, zzpoVar);
    }

    private zzpo() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzpo();
        }
        zzpk zzpkVar = null;
        if (i2 == 4) {
            return new zzpn(zzpkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
