package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zztr extends zzajy<zztr, zza> implements zzale {
    private static final zztr zzc;
    private static volatile zzalp<zztr> zzd;

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zztr, zza> implements zzale {
        private zza() {
            super(zztr.zzc);
        }
    }

    public static zztr zzb() {
        return zzc;
    }

    public static zztr zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zztr) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zztt.zza[i - 1];
        switch (i2) {
            case 1:
                return new zztr();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzc;
            case 5:
                zzalp<zztr> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zztr.class) {
                        zzalpVar = zzd;
                        if (zzalpVar == null) {
                            zzalpVar = new zzajy.zzc<>(zzc);
                            zzd = zzalpVar;
                        }
                    }
                }
                return zzalpVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    static {
        zztr zztrVar = new zztr();
        zzc = zztrVar;
        zzajy.zza((Class<zztr>) zztr.class, zztrVar);
    }

    private zztr() {
    }
}
