package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzqv extends zzks implements zzly {
    private static final zzqv zzb;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";

    static {
        zzqv zzqvVar = new zzqv();
        zzb = zzqvVar;
        zzks.zzF(zzqv.class, zzqvVar);
    }

    private zzqv() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzqv();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzqu(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
