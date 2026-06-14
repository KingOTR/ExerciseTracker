package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzmz extends zzks implements zzly {
    private static final zzmz zzb;
    private long zzd;
    private int zze;

    static {
        zzmz zzmzVar = new zzmz();
        zzb = zzmzVar;
        zzks.zzF(zzmz.class, zzmzVar);
    }

    private zzmz() {
    }

    public static zzmy zzi() {
        return (zzmy) zzb.zzp();
    }

    public final int zzf() {
        return this.zze;
    }

    public final long zzg() {
        return this.zzd;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzmi(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzmz();
        }
        zzmx zzmxVar = null;
        if (i2 == 4) {
            return new zzmy(zzmxVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
