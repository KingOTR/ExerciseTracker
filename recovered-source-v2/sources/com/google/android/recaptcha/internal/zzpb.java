package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzpb extends zzks implements zzly {
    private static final zzpb zzb;
    private int zzd;
    private zzog zzf;
    private zzoa zzg;
    private zzoj zzh;
    private String zze = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzpb zzpbVar = new zzpb();
        zzb = zzpbVar;
        zzks.zzF(zzpb.class, zzpbVar);
    }

    private zzpb() {
    }

    static /* synthetic */ void zzJ(zzpb zzpbVar, zzoa zzoaVar) {
        zzoaVar.getClass();
        zzpbVar.zzg = zzoaVar;
        zzpbVar.zzd |= 2;
    }

    public static zzpa zzf() {
        return (zzpa) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zze = str;
    }

    static /* synthetic */ void zzj(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zzi = str;
    }

    static /* synthetic */ void zzk(zzpb zzpbVar, String str) {
        str.getClass();
        zzpbVar.zzj = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005Ȉ\u0006Ȉ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzpb();
        }
        zzoz zzozVar = null;
        if (i2 == 4) {
            return new zzpa(zzozVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
