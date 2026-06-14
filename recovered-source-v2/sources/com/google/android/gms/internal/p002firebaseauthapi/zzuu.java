package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuu extends zzajy<zzuu, zza> implements zzale {
    private static final zzuu zzc;
    private static volatile zzalp<zzuu> zzd;
    private int zze;
    private int zzf;
    private zzva zzg;
    private zzaip zzh = zzaip.zza;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzuu, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzuu.zza((zzuu) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzva zzvaVar) {
            zzh();
            zzuu.zza((zzuu) this.zza, zzvaVar);
            return this;
        }

        private zza() {
            super(zzuu.zzc);
        }
    }

    public static zzuu zzd() {
        return zzc;
    }

    public static zzuu zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzuu) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzva zze() {
        zzva zzvaVar = this.zzg;
        return zzvaVar == null ? zzva.zze() : zzvaVar;
    }

    public final zzaip zzf() {
        return this.zzh;
    }

    public static zzalp<zzuu> c_() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzut.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzuu();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzuu> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzuu.class) {
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

    static /* synthetic */ void zza(zzuu zzuuVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzuuVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzuu zzuuVar, zzva zzvaVar) {
        zzvaVar.getClass();
        zzuuVar.zzg = zzvaVar;
        zzuuVar.zze |= 1;
    }

    static {
        zzuu zzuuVar = new zzuu();
        zzc = zzuuVar;
        zzajy.zza((Class<zzuu>) zzuu.class, zzuuVar);
    }

    private zzuu() {
    }
}
