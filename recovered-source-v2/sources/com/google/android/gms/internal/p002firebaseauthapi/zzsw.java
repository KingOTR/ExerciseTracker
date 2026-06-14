package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzsw extends zzajy<zzsw, zza> implements zzale {
    private static final zzsw zzc;
    private static volatile zzalp<zzsw> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzsw, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzsw.zza((zzsw) this.zza, zzaipVar);
            return this;
        }

        private zza() {
            super(zzsw.zzc);
        }
    }

    public static zzsw zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzsw) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzaip zzd() {
        return this.zzf;
    }

    public static zzalp<zzsw> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzsy.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzsw();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsw> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzsw.class) {
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

    static /* synthetic */ void zza(zzsw zzswVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzswVar.zzf = zzaipVar;
    }

    static {
        zzsw zzswVar = new zzsw();
        zzc = zzswVar;
        zzajy.zza((Class<zzsw>) zzsw.class, zzswVar);
    }

    private zzsw() {
    }
}
