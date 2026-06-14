package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzqa extends zzks implements zzly {
    private static final zzqa zzb;
    private int zzd;
    private String zze = "";

    static {
        zzqa zzqaVar = new zzqa();
        zzb = zzqaVar;
        zzks.zzF(zzqa.class, zzqaVar);
    }

    private zzqa() {
    }

    public static zzpz zzf() {
        return (zzpz) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqa zzqaVar, String str) {
        str.getClass();
        zzqaVar.zzd |= 1;
        zzqaVar.zze = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzqa();
        }
        zzpk zzpkVar = null;
        if (i2 == 4) {
            return new zzpz(zzpkVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
