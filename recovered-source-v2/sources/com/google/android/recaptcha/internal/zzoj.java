package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzoj extends zzks implements zzly {
    private static final zzoj zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzoj zzojVar = new zzoj();
        zzb = zzojVar;
        zzks.zzF(zzoj.class, zzojVar);
    }

    private zzoj() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzoj();
        }
        zzoh zzohVar = null;
        if (i2 == 4) {
            return new zzoi(zzohVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
