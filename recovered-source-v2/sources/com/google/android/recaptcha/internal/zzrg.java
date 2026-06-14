package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzrg extends zzks implements zzly {
    private static final zzrg zzb;
    private zzkz zzd = zzz();

    static {
        zzrg zzrgVar = new zzrg();
        zzb = zzrgVar;
        zzks.zzF(zzrg.class, zzrgVar);
    }

    private zzrg() {
    }

    public static zzrg zzg(byte[] bArr) throws zzlc {
        return (zzrg) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzd", zzrs.class});
        }
        if (i2 == 3) {
            return new zzrg();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzrf(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final List zzi() {
        return this.zzd;
    }
}
