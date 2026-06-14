package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzrp extends zzajy<zzrp, zza> implements zzale {
    private static final zzrp zzc;
    private static volatile zzalp<zzrp> zzd;
    private int zze;
    private int zzf;
    private zzaip zzg = zzaip.zza;
    private zzrv zzh;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzrp, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzrp.zza((zzrp) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzrv zzrvVar) {
            zzh();
            zzrp.zza((zzrp) this.zza, zzrvVar);
            return this;
        }

        private zza() {
            super(zzrp.zzc);
        }
    }

    public static zzrp zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzrp) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzrv zzd() {
        zzrv zzrvVar = this.zzh;
        return zzrvVar == null ? zzrv.zzd() : zzrvVar;
    }

    public final zzaip zze() {
        return this.zzg;
    }

    public static zzalp<zzrp> zzf() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzrr.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzrp();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzrp> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzrp.class) {
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

    static /* synthetic */ void zza(zzrp zzrpVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzrpVar.zzg = zzaipVar;
    }

    static /* synthetic */ void zza(zzrp zzrpVar, zzrv zzrvVar) {
        zzrvVar.getClass();
        zzrpVar.zzh = zzrvVar;
        zzrpVar.zze |= 1;
    }

    static {
        zzrp zzrpVar = new zzrp();
        zzc = zzrpVar;
        zzajy.zza((Class<zzrp>) zzrp.class, zzrpVar);
    }

    private zzrp() {
    }
}
