package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzqz extends zzks implements zzly {
    private static final zzqz zzb;
    private int zzd;

    static {
        zzqz zzqzVar = new zzqz();
        zzb = zzqzVar;
        zzks.zzF(zzqz.class, zzqzVar);
    }

    private zzqz() {
    }

    public static zzqz zzg(byte[] bArr) throws zzlc {
        return (zzqz) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzqz();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzqy(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final zzrc zzi() {
        zzrc zzb2 = zzrc.zzb(this.zzd);
        return zzb2 == null ? zzrc.UNRECOGNIZED : zzb2;
    }
}
