package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzux extends zzajy<zzux, zza> implements zzale {
    private static final zzux zzc;
    private static volatile zzalp<zzux> zzd;
    private int zze;
    private zzva zzf;
    private int zzg;
    private int zzh;

    public final int zza() {
        return this.zzg;
    }

    public final int zzb() {
        return this.zzh;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzux, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zzux) this.zza).zzg = i;
            return this;
        }

        public final zza zza(zzva zzvaVar) {
            zzh();
            zzux.zza((zzux) this.zza, zzvaVar);
            return this;
        }

        private zza() {
            super(zzux.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzux zze() {
        return zzc;
    }

    public static zzux zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzux) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzva zzf() {
        zzva zzvaVar = this.zzf;
        return zzvaVar == null ? zzva.zze() : zzvaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzuw.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzux();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzux> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzux.class) {
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

    static /* synthetic */ void zza(zzux zzuxVar, zzva zzvaVar) {
        zzvaVar.getClass();
        zzuxVar.zzf = zzvaVar;
        zzuxVar.zze |= 1;
    }

    static {
        zzux zzuxVar = new zzux();
        zzc = zzuxVar;
        zzajy.zza((Class<zzux>) zzux.class, zzuxVar);
    }

    private zzux() {
    }
}
