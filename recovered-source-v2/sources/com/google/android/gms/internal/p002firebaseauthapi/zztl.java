package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zztl extends zzajy<zztl, zza> implements zzale {
    private static final zztl zzc;
    private static volatile zzalp<zztl> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zztl, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zztl) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zztl.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zztl zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zztl) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zztn.zza[i - 1];
        switch (i2) {
            case 1:
                return new zztl();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zztl> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zztl.class) {
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
        zztl zztlVar = new zztl();
        zzc = zztlVar;
        zzajy.zza((Class<zztl>) zztl.class, zztlVar);
    }

    private zztl() {
    }
}
