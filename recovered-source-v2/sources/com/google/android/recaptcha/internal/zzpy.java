package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzpy extends zzks implements zzly {
    private static final zzpy zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzpy zzpyVar = new zzpy();
        zzb = zzpyVar;
        zzks.zzF(zzpy.class, zzpyVar);
    }

    private zzpy() {
    }

    public static zzpx zzf() {
        return (zzpx) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzpy zzpyVar, String str) {
        str.getClass();
        zzpyVar.zzd |= 1;
        zzpyVar.zze = str;
    }

    static /* synthetic */ void zzj(zzpy zzpyVar, String str) {
        str.getClass();
        zzpyVar.zzd |= 2;
        zzpyVar.zzf = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzpy();
        }
        zzpk zzpkVar = null;
        if (i2 == 4) {
            return new zzpx(zzpkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
