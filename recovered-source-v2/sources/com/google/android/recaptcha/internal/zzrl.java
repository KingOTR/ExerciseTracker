package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzrl extends zzks implements zzly {
    private static final zzrl zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzrl zzrlVar = new zzrl();
        zzb = zzrlVar;
        zzks.zzF(zzrl.class, zzrlVar);
    }

    private zzrl() {
    }

    static /* synthetic */ void zzJ(zzrl zzrlVar, double d) {
        zzrlVar.zzd = 10;
        zzrlVar.zze = Double.valueOf(d);
    }

    static /* synthetic */ void zzK(zzrl zzrlVar, String str) {
        str.getClass();
        zzrlVar.zzd = 11;
        zzrlVar.zze = str;
    }

    static /* synthetic */ void zzL(zzrl zzrlVar, boolean z) {
        zzrlVar.zzd = 1;
        zzrlVar.zze = Boolean.valueOf(z);
    }

    static /* synthetic */ void zzM(zzrl zzrlVar, zziv zzivVar) {
        zzrlVar.zzd = 2;
        zzrlVar.zze = zzivVar;
    }

    static /* synthetic */ void zzN(zzrl zzrlVar, String str) {
        str.getClass();
        zzrlVar.zzd = 3;
        zzrlVar.zze = str;
    }

    static /* synthetic */ void zzO(zzrl zzrlVar, int i) {
        zzrlVar.zzd = 4;
        zzrlVar.zze = Integer.valueOf(i);
    }

    public static zzrk zzf() {
        return (zzrk) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzrl zzrlVar, int i) {
        zzrlVar.zzd = 5;
        zzrlVar.zze = Integer.valueOf(i);
    }

    static /* synthetic */ void zzj(zzrl zzrlVar, long j) {
        zzrlVar.zzd = 7;
        zzrlVar.zze = Long.valueOf(j);
    }

    static /* synthetic */ void zzk(zzrl zzrlVar, float f) {
        zzrlVar.zzd = 9;
        zzrlVar.zze = Float.valueOf(f);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u000b\u0001\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001:\u0000\u0002=\u0000\u0003Ȼ\u0000\u0004B\u0000\u0005B\u0000\u0006>\u0000\u0007C\u0000\b6\u0000\t4\u0000\n3\u0000\u000bȻ\u0000", new Object[]{"zze", "zzd"});
        }
        if (i2 == 3) {
            return new zzrl();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzrk(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
