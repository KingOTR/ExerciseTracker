package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrs extends zzajy<zzrs, zza> implements zzale {
    private static final zzrs zzc;
    private static volatile zzalp<zzrs> zzd;
    private int zze;
    private int zzf;
    private zzrv zzg;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzrs, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zzrs) this.zza).zzf = i;
            return this;
        }

        public final zza zza(zzrv zzrvVar) {
            zzh();
            zzrs.zza((zzrs) this.zza, zzrvVar);
            return this;
        }

        private zza() {
            super(zzrs.zzc);
        }
    }

    public static zzrs zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzrs) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzrv zzd() {
        zzrv zzrvVar = this.zzg;
        return zzrvVar == null ? zzrv.zzd() : zzrvVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzru.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzrs();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzrs> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzrs.class) {
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

    static /* synthetic */ void zza(zzrs zzrsVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzrsVar.zzg = zzrvVar;
        zzrsVar.zze |= 1;
    }

    static {
        zzrs zzrsVar = new zzrs();
        zzc = zzrsVar;
        zzajy.zza((Class<zzrs>) zzrs.class, zzrsVar);
    }

    private zzrs() {
    }
}
