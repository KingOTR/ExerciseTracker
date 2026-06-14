package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzrb extends zzks implements zzly {
    private static final zzrb zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        zzrb zzrbVar = new zzrb();
        zzb = zzrbVar;
        zzks.zzF(zzrb.class, zzrbVar);
    }

    private zzrb() {
    }

    public static zzrb zzg(byte[] bArr) throws zzlc {
        return (zzrb) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzrb();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzra(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzrc zzi() {
        zzrc zzb2 = zzrc.zzb(this.zzf);
        return zzb2 == null ? zzrc.UNRECOGNIZED : zzb2;
    }
}
