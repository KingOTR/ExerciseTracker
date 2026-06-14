package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zznw extends zzks implements zzly {
    private static final zznw zzb;
    private int zzd;
    private zzka zze;
    private int zzf;

    static {
        zznw zznwVar = new zznw();
        zzb = zznwVar;
        zzks.zzF(zznw.class, zznwVar);
    }

    private zznw() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zznw();
        }
        zznu zznuVar = null;
        if (i2 == 4) {
            return new zznv(zznuVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
