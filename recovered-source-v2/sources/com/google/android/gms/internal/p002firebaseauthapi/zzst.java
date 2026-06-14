package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzst extends zzajy<zzst, zza> implements zzale {
    private static final zzst zzc;
    private static volatile zzalp<zzst> zzd;
    private int zze;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzst, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zzst) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zzst.zzc);
        }
    }

    public static zzst zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzsv.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzst();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzst> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzst.class) {
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
        zzst zzstVar = new zzst();
        zzc = zzstVar;
        zzajy.zza((Class<zzst>) zzst.class, zzstVar);
    }

    private zzst() {
    }
}
