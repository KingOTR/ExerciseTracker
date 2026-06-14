package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzov extends zzks implements zzly {
    private static final zzov zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private zzoy zzg;
    private int zzh;
    private zzod zzi;
    private zzom zzj;

    static {
        zzov zzovVar = new zzov();
        zzb = zzovVar;
        zzks.zzF(zzov.class, zzovVar);
    }

    private zzov() {
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000*\u0001\u0001\u0001**\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004?\u0000\u0005?\u0000\u0006?\u0000\u0007?\u0000\b?\u0000\t?\u0000\n?\u0000\u000b?\u0000\f?\u0000\r?\u0000\u000e?\u0000\u000f?\u0000\u0010?\u0000\u0011?\u0000\u0012?\u0000\u0013?\u0000\u0014?\u0000\u0015?\u0000\u0016?\u0000\u0017?\u0000\u0018?\u0000\u0019ဉ\u0002\u001a?\u0000\u001b?\u0000\u001c?\u0000\u001d?\u0000\u001e?\u0000\u001f?\u0000 ?\u0000!?\u0000\"?\u0000#?\u0000$?\u0000%?\u0000&?\u0000'?\u0000(?\u0000)?\u0000*?\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzov();
        }
        zzot zzotVar = null;
        if (i2 == 4) {
            return new zzou(zzotVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
