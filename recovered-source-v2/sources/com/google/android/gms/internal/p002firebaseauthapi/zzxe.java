package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzxe extends zzajy<zzxe, zza> implements zzale {
    private static final zzxe zzc;
    private static volatile zzalp<zzxe> zzd;
    private int zze;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzxe, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zzxe) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zzxe.zzc);
        }
    }

    public static zzxe zzd() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzxd.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzxe();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzxe> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzxe.class) {
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
        zzxe zzxeVar = new zzxe();
        zzc = zzxeVar;
        zzajy.zza((Class<zzxe>) zzxe.class, zzxeVar);
    }

    private zzxe() {
    }
}
