package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuj extends zzajy<zzuj, zza> implements zzale {
    private static final zzuj zzc;
    private static volatile zzalp<zzuj> zzd;
    private int zze;
    private int zzf;
    private zzud zzg;
    private zzaip zzh = zzaip.zza;
    private zzaip zzi = zzaip.zza;

    public final int zza() {
        return this.zzf;
    }

    public final zzud zzb() {
        zzud zzudVar = this.zzg;
        return zzudVar == null ? zzud.zze() : zzudVar;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzuj, zza> implements zzale {
        public final zza zza(zzud zzudVar) {
            zzh();
            zzuj.zza((zzuj) this.zza, zzudVar);
            return this;
        }

        public final zza zza(int i) {
            zzh();
            ((zzuj) this.zza).zzf = 0;
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzuj.zza((zzuj) this.zza, zzaipVar);
            return this;
        }

        public final zza zzb(zzaip zzaipVar) {
            zzh();
            zzuj.zzb((zzuj) this.zza, zzaipVar);
            return this;
        }

        private zza() {
            super(zzuj.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzuj zze() {
        return zzc;
    }

    public static zzuj zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzuj) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzaip zzf() {
        return this.zzh;
    }

    public final zzaip b_() {
        return this.zzi;
    }

    public static zzalp<zzuj> zzh() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzui.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzuj();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzuj> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzuj.class) {
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

    static /* synthetic */ void zza(zzuj zzujVar, zzud zzudVar) {
        zzudVar.getClass();
        zzujVar.zzg = zzudVar;
        zzujVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzuj zzujVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzujVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zzb(zzuj zzujVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzujVar.zzi = zzaipVar;
    }

    static {
        zzuj zzujVar = new zzuj();
        zzc = zzujVar;
        zzajy.zza((Class<zzuj>) zzuj.class, zzujVar);
    }

    private zzuj() {
    }
}
