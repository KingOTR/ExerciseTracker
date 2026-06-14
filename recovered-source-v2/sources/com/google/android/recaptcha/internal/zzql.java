package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzql extends zzks implements zzly {
    private static final zzql zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";
    private zzkx zzg = zzw();
    private int zzh;
    private int zzi;

    static {
        zzql zzqlVar = new zzql();
        zzb = zzqlVar;
        zzks.zzF(zzql.class, zzqlVar);
    }

    private zzql() {
    }

    public static zzqj zzf() {
        return (zzqj) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzql zzqlVar, String str) {
        str.getClass();
        zzqlVar.zzd |= 1;
        zzqlVar.zze = str;
    }

    static /* synthetic */ void zzj(zzql zzqlVar, String str) {
        str.getClass();
        zzqlVar.zzd |= 2;
        zzqlVar.zzf = str;
    }

    static /* synthetic */ void zzk(zzql zzqlVar, int i) {
        zzqlVar.zzh = 2;
        zzqlVar.zzd |= 4;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003'\u0004᠌\u0002\u0005င\u0003", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", zzqk.zza, "zzi"});
        }
        if (i2 == 3) {
            return new zzql();
        }
        zzqi zzqiVar = null;
        if (i2 == 4) {
            return new zzqj(zzqiVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
