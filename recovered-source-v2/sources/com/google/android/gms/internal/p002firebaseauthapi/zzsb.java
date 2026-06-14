package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzsb extends zzajy<zzsb, zza> implements zzale {
    private static final zzsb zzc;
    private static volatile zzalp<zzsb> zzd;
    private int zze;
    private zzsh zzf;
    private zzux zzg;

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzsb zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzsb) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzsb, zza> implements zzale {
        public final zza zza(zzsh zzshVar) {
            zzh();
            zzsb.zza((zzsb) this.zza, zzshVar);
            return this;
        }

        public final zza zza(zzux zzuxVar) {
            zzh();
            zzsb.zza((zzsb) this.zza, zzuxVar);
            return this;
        }

        private zza() {
            super(zzsb.zzc);
        }
    }

    public final zzsh zzc() {
        zzsh zzshVar = this.zzf;
        return zzshVar == null ? zzsh.zzd() : zzshVar;
    }

    public final zzux zzd() {
        zzux zzuxVar = this.zzg;
        return zzuxVar == null ? zzux.zze() : zzuxVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzsd.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzsb();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsb> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzsb.class) {
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

    static /* synthetic */ void zza(zzsb zzsbVar, zzsh zzshVar) {
        zzshVar.getClass();
        zzsbVar.zzf = zzshVar;
        zzsbVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzsb zzsbVar, zzux zzuxVar) {
        zzuxVar.getClass();
        zzsbVar.zzg = zzuxVar;
        zzsbVar.zze |= 2;
    }

    static {
        zzsb zzsbVar = new zzsb();
        zzc = zzsbVar;
        zzajy.zza((Class<zzsb>) zzsb.class, zzsbVar);
    }

    private zzsb() {
    }
}
