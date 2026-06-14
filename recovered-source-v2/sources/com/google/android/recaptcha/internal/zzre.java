package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzre extends zzks implements zzly {
    private static final zzre zzb;
    private int zzd = 0;
    private Object zze;

    static {
        zzre zzreVar = new zzre();
        zzb = zzreVar;
        zzks.zzF(zzre.class, zzreVar);
    }

    private zzre() {
    }

    static /* synthetic */ void zzJ(zzre zzreVar, zzop zzopVar) {
        zzopVar.getClass();
        zzreVar.zze = zzopVar;
        zzreVar.zzd = 1;
    }

    static /* synthetic */ void zzK(zzre zzreVar, zzpe zzpeVar) {
        zzpeVar.getClass();
        zzreVar.zze = zzpeVar;
        zzreVar.zzd = 2;
    }

    public static zzrd zzi() {
        return (zzrd) zzb.zzp();
    }

    public static zzre zzk(byte[] bArr) throws zzlc {
        return (zzre) zzks.zzv(zzb, bArr);
    }

    public final int zzL() {
        int i = this.zzd;
        if (i == 0) {
            return 3;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public final zzop zzf() {
        return this.zzd == 1 ? (zzop) this.zze : zzop.zzk();
    }

    public final zzpe zzg() {
        return this.zzd == 2 ? (zzpe) this.zze : zzpe.zzg();
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzd", zzop.class, zzpe.class});
        }
        if (i2 == 3) {
            return new zzre();
        }
        zzqr zzqrVar = null;
        if (i2 == 4) {
            return new zzrd(zzqrVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
