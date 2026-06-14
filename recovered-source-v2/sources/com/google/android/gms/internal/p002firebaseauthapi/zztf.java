package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zztf extends zzajy<zztf, zza> implements zzale {
    private static final zztf zzc;
    private static volatile zzalp<zztf> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zztf, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zztf) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zztf.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zztf zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zztf) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzth.zza[i - 1];
        switch (i2) {
            case 1:
                return new zztf();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zzf", "zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zztf> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zztf.class) {
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
        zztf zztfVar = new zztf();
        zzc = zztfVar;
        zzajy.zza((Class<zztf>) zztf.class, zztfVar);
    }

    private zztf() {
    }
}
