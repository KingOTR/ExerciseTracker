package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzve extends zzajy<zzve, zza> implements zzale {
    private static final zzve zzc;
    private static volatile zzalp<zzve> zzd;
    private int zze;
    private zzvh zzf;

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzve zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzve) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzve, zza> implements zzale {
        public final zza zza(zzvh zzvhVar) {
            zzh();
            zzve.zza((zzve) this.zza, zzvhVar);
            return this;
        }

        private zza() {
            super(zzve.zzc);
        }
    }

    public final zzvh zzc() {
        zzvh zzvhVar = this.zzf;
        return zzvhVar == null ? zzvh.zzf() : zzvhVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzvg.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzve();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzve> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzve.class) {
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

    static /* synthetic */ void zza(zzve zzveVar, zzvh zzvhVar) {
        zzvhVar.getClass();
        zzveVar.zzf = zzvhVar;
        zzveVar.zze |= 1;
    }

    static {
        zzve zzveVar = new zzve();
        zzc = zzveVar;
        zzajy.zza((Class<zzve>) zzve.class, zzveVar);
    }

    private zzve() {
    }
}
