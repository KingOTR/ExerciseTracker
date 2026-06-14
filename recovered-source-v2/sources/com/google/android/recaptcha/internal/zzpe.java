package com.google.android.recaptcha.internal;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzpe extends zzks implements zzly {
    private static final zzpe zzb;
    private int zzd;
    private int zze;
    private int zzf;
    private zzka zzi;
    private zzmz zzj;
    private int zzk;
    private zzom zzl;
    private String zzg = "";
    private String zzh = "";
    private zzkz zzm = zzz();

    static {
        zzpe zzpeVar = new zzpe();
        zzb = zzpeVar;
        zzks.zzF(zzpe.class, zzpeVar);
    }

    private zzpe() {
    }

    public static zzpe zzg() {
        return zzb;
    }

    public static zzpe zzi(byte[] bArr) throws zzlc {
        return (zzpe) zzks.zzv(zzb, bArr);
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\t\u0000\u0001\u0001\u000b\t\u0000\u0001\u0000\u0001\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005\f\u0007\u001b\b\f\tȈ\nȈ\u000bဉ\u0002", new Object[]{"zzd", "zze", "zzi", "zzj", "zzk", "zzm", zzov.class, "zzf", "zzg", "zzh", "zzl"});
        }
        if (i2 == 3) {
            return new zzpe();
        }
        zzpc zzpcVar = null;
        if (i2 == 4) {
            return new zzpd(zzpcVar);
        }
        if (i2 != 5) {
            return null;
        }
        return zzb;
    }
}
