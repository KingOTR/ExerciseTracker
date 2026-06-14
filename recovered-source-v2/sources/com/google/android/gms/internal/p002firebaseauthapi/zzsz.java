package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzsz extends zzajy<zzsz, zza> implements zzale {
    private static final zzsz zzc;
    private static volatile zzalp<zzsz> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zze;
    }

    public final int zzb() {
        return this.zzf;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzsz, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zzsz) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zzsz.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzsz zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzsz) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zztb.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzsz();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsz> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzsz.class) {
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
        zzsz zzszVar = new zzsz();
        zzc = zzszVar;
        zzajy.zza((Class<zzsz>) zzsz.class, zzszVar);
    }

    private zzsz() {
    }
}
