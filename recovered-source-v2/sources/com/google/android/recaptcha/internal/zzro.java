package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzro extends zzks implements zzly {
    private static final zzro zzb;
    private int zzd;
    private String zze = "";
    private zzkx zzf = zzw();
    private zzky zzg = zzy();
    private zzqq zzh;

    static {
        zzro zzroVar = new zzro();
        zzb = zzroVar;
        zzks.zzF(zzro.class, zzroVar);
    }

    private zzro() {
    }

    public static zzro zzi(byte[] bArr) throws zzlc {
        return (zzro) zzks.zzv(zzb, bArr);
    }

    public final zzqq zzf() {
        zzqq zzqqVar = this.zzh;
        return zzqqVar == null ? zzqq.zzg() : zzqqVar;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002'\u0003%\u0004ဉ\u0000", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzro();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzrn(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }

    public final String zzj() {
        return this.zze;
    }

    public final List zzk() {
        return this.zzg;
    }
}
