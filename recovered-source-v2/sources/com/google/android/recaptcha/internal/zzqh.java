package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzqh extends zzks implements zzly {
    private static final zzqh zzb;
    private int zzd;
    private String zze = "";
    private String zzf = "";

    static {
        zzqh zzqhVar = new zzqh();
        zzb = zzqhVar;
        zzks.zzF(zzqh.class, zzqhVar);
    }

    private zzqh() {
    }

    public final String zzg() {
        return this.zze;
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
            return new zzqh();
        }
        zzqb zzqbVar = null;
        if (i2 == 4) {
            return new zzqg(zzqbVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzi() {
        return this.zzf;
    }
}
