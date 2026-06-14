package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzry extends zzajy<zzry, zza> implements zzale {
    private static final zzry zzc;
    private static volatile zzalp<zzry> zzd;
    private int zze;
    private int zzf;
    private zzse zzg;
    private zzuu zzh;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzry, zza> implements zzale {
        public final zza zza(zzse zzseVar) {
            zzh();
            zzry.zza((zzry) this.zza, zzseVar);
            return this;
        }

        public final zza zza(zzuu zzuuVar) {
            zzh();
            zzry.zza((zzry) this.zza, zzuuVar);
            return this;
        }

        private zza() {
            super(zzry.zzc);
        }
    }

    public static zzry zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzry) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzse zzd() {
        zzse zzseVar = this.zzg;
        return zzseVar == null ? zzse.zzd() : zzseVar;
    }

    public final zzuu zze() {
        zzuu zzuuVar = this.zzh;
        return zzuuVar == null ? zzuu.zzd() : zzuuVar;
    }

    public static zzalp<zzry> zzf() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzsa.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzry();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzry> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzry.class) {
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

    static /* synthetic */ void zza(zzry zzryVar, zzse zzseVar) {
        zzseVar.getClass();
        zzryVar.zzg = zzseVar;
        zzryVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzry zzryVar, zzuu zzuuVar) {
        zzuuVar.getClass();
        zzryVar.zzh = zzuuVar;
        zzryVar.zze |= 2;
    }

    static {
        zzry zzryVar = new zzry();
        zzc = zzryVar;
        zzajy.zza((Class<zzry>) zzry.class, zzryVar);
    }

    private zzry() {
    }
}
