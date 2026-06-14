package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzvn extends zzajy<zzvn, zza> implements zzale {
    private static final zzvn zzc;
    private static volatile zzalp<zzvn> zzd;
    private int zze;
    private int zzf;
    private zzvh zzg;
    private zzaip zzh = zzaip.zza;

    public final int zza() {
        return this.zzf;
    }

    public final zzvh zzb() {
        zzvh zzvhVar = this.zzg;
        return zzvhVar == null ? zzvh.zzf() : zzvhVar;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzvn, zza> implements zzale {
        public final zza zza(zzvh zzvhVar) {
            zzh();
            zzvn.zza((zzvn) this.zza, zzvhVar);
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzvn.zza((zzvn) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(int i) {
            zzh();
            ((zzvn) this.zza).zzf = 0;
            return this;
        }

        private zza() {
            super(zzvn.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzvn zze() {
        return zzc;
    }

    public static zzvn zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzvn) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzaip zzf() {
        return this.zzh;
    }

    public static zzalp<zzvn> d_() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzvp.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzvn();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvn> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzvn.class) {
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

    static /* synthetic */ void zza(zzvn zzvnVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzvnVar.zzg = zzvhVar;
        zzvnVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzvn zzvnVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzvnVar.zzh = zzaipVar;
    }

    static {
        zzvn zzvnVar = new zzvn();
        zzc = zzvnVar;
        zzajy.zza((Class<zzvn>) zzvn.class, zzvnVar);
    }

    private zzvn() {
    }
}
