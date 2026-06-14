package com.google.android.recaptcha.internal;

import java.util.List;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzph extends zzks implements zzly {
    private static final zzph zzb;
    private zzkz zzd = zzks.zzz();

    static {
        zzph zzphVar = new zzph();
        zzb = zzphVar;
        zzks.zzF(zzph.class, zzphVar);
    }

    private zzph() {
    }

    public static zzph zzg() {
        return zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzks
    protected final Object zzh(int i, Object obj, Object obj2) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return zzC(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001Ț", new Object[]{"zzd"});
        }
        if (i2 == 3) {
            return new zzph();
        }
        zzpf zzpfVar = null;
        if (i2 == 4) {
            return new zzpg(zzpfVar);
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
