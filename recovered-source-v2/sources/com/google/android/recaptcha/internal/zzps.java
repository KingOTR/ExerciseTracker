package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzps extends zzks implements zzly {
    private static final zzps zzb;
    private long zzf;
    private zziv zzd = zziv.zzb;
    private String zze = "";
    private zziv zzg = zziv.zzb;
    private String zzh = "";
    private String zzi = "";

    static {
        zzps zzpsVar = new zzps();
        zzb = zzpsVar;
        zzks.zzF(zzps.class, zzpsVar);
    }

    private zzps() {
    }

    public static zzps zzk() {
        return zzb;
    }

    public final String zzJ() {
        return this.zze;
    }

    public final long zzf() {
        return this.zzf;
    }

    public final zziv zzg() {
        return this.zzg;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\n\u0002Ȉ\u0003\u0002\u0004\n\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzps();
        }
        zzpk zzpkVar = null;
        if (i2 == 4) {
            return new zzpr(zzpkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zziv zzi() {
        return this.zzd;
    }
}
