package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzqx extends zzks implements zzly {
    private static final zzqx zzb;
    private String zzd = "";
    private String zze = "";

    static {
        zzqx zzqxVar = new zzqx();
        zzb = zzqxVar;
        zzks.zzF(zzqx.class, zzqxVar);
    }

    private zzqx() {
    }

    public static zzqw zzf() {
        return (zzqw) zzb.zzp();
    }

    static /* synthetic */ void zzi(zzqx zzqxVar, String str) {
        str.getClass();
        zzqxVar.zzd = str;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new zzqx();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzqw(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
