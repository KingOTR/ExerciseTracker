package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzpm extends zzks implements zzly {
    private static final zzpm zzb;
    private int zzd;
    private String zze = "";

    static {
        zzpm zzpmVar = new zzpm();
        zzb = zzpmVar;
        zzks.zzF(zzpm.class, zzpmVar);
    }

    private zzpm() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzpm();
        }
        zzpk zzpkVar = null;
        if (i2 == 4) {
            return new zzpl(zzpkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
