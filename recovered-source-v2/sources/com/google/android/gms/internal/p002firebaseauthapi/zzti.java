package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzti extends zzajy<zzti, zza> implements zzale {
    private static final zzti zzc;
    private static volatile zzalp<zzti> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;

    public final int zza() {
        return this.zze;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzti, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzti.zza((zzti) this.zza, zzaipVar);
            return this;
        }

        private zza() {
            super(zzti.zzc);
        }
    }

    public static zzti zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzti) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzaip zzd() {
        return this.zzf;
    }

    public static zzalp<zzti> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zztk.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzti();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzti> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzti.class) {
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

    static /* synthetic */ void zza(zzti zztiVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zztiVar.zzf = zzaipVar;
    }

    static {
        zzti zztiVar = new zzti();
        zzc = zztiVar;
        zzajy.zza((Class<zzti>) zzti.class, zztiVar);
    }

    private zzti() {
    }
}
