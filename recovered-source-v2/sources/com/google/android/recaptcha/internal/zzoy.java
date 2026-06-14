package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzoy extends zzks implements zzly {
    private static final zzoy zzb;
    private int zzd;
    private zzka zze;
    private zzmz zzf;
    private zzka zzg;
    private zzmz zzh;

    static {
        zzoy zzoyVar = new zzoy();
        zzb = zzoyVar;
        zzks.zzF(zzoy.class, zzoyVar);
    }

    private zzoy() {
    }

    static /* synthetic */ void zzJ(zzoy zzoyVar, zzka zzkaVar) {
        zzkaVar.getClass();
        zzoyVar.zzg = zzkaVar;
        zzoyVar.zzd |= 4;
    }

    public static zzox zzf() {
        return (zzox) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzoy zzoyVar, zzka zzkaVar) {
        zzkaVar.getClass();
        zzoyVar.zze = zzkaVar;
        zzoyVar.zzd |= 1;
    }

    static /* synthetic */ void zzj(zzoy zzoyVar, zzmz zzmzVar) {
        zzmzVar.getClass();
        zzoyVar.zzh = zzmzVar;
        zzoyVar.zzd |= 8;
    }

    static /* synthetic */ void zzk(zzoy zzoyVar, zzmz zzmzVar) {
        zzmzVar.getClass();
        zzoyVar.zzf = zzmzVar;
        zzoyVar.zzd |= 2;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzoy();
        }
        zzow zzowVar = null;
        if (i2 == 4) {
            return new zzox(zzowVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
