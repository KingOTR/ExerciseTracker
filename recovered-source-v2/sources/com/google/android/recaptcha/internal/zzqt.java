package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzqt extends zzks implements zzly {
    private static final zzqt zzb;
    private int zzg;
    private String zzd = "";
    private String zze = "";
    private String zzf = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";

    static {
        zzqt zzqtVar = new zzqt();
        zzb = zzqtVar;
        zzks.zzF(zzqt.class, zzqtVar);
    }

    private zzqt() {
    }

    static /* synthetic */ void zzM(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zzd = str;
    }

    static /* synthetic */ void zzN(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zzh = str;
    }

    static /* synthetic */ void zzO(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zzi = str;
    }

    static /* synthetic */ void zzQ(zzqt zzqtVar, String str) {
        str.getClass();
        zzqtVar.zze = str;
    }

    public static zzqs zzf() {
        return (zzqs) zzb.zzp();
    }

    public final String zzJ() {
        return this.zzf;
    }

    public final String zzK() {
        return this.zzh;
    }

    public final String zzL() {
        return this.zzd;
    }

    public final int zzS() {
        int i = this.zzg;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0007\u0000\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004\f\u0006Ȉ\u0007Ȉ\bȈ", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzqt();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzqs(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzj;
    }

    public final String zzj() {
        return this.zzi;
    }

    public final String zzk() {
        return this.zze;
    }
}
