package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzud extends zzajy<zzud, zza> implements zzale {
    private static final zzud zzc;
    private static volatile zzalp<zzud> zzd;
    private int zze;
    private zzum zzf;
    private zztx zzg;
    private int zzh;

    public final zztu zza() {
        zztu zza2 = zztu.zza(this.zzh);
        return zza2 == null ? zztu.UNRECOGNIZED : zza2;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzud, zza> implements zzale {
        public final zza zza(zztx zztxVar) {
            zzh();
            zzud.zza((zzud) this.zza, zztxVar);
            return this;
        }

        public final zza zza(zztu zztuVar) {
            zzh();
            zzud.zza((zzud) this.zza, zztuVar);
            return this;
        }

        public final zza zza(zzum zzumVar) {
            zzh();
            zzud.zza((zzud) this.zza, zzumVar);
            return this;
        }

        private zza() {
            super(zzud.zzc);
        }
    }

    public final zztx zzb() {
        zztx zztxVar = this.zzg;
        return zztxVar == null ? zztx.zzc() : zztxVar;
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzud zze() {
        return zzc;
    }

    public final zzum zzf() {
        zzum zzumVar = this.zzf;
        return zzumVar == null ? zzum.zzc() : zzumVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzuc.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzud();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzud> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzud.class) {
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

    static /* synthetic */ void zza(zzud zzudVar, zztx zztxVar) {
        zztxVar.getClass();
        zzudVar.zzg = zztxVar;
        zzudVar.zze |= 2;
    }

    static /* synthetic */ void zza(zzud zzudVar, zztu zztuVar) {
        zzudVar.zzh = zztuVar.zza();
    }

    static /* synthetic */ void zza(zzud zzudVar, zzum zzumVar) {
        zzumVar.getClass();
        zzudVar.zzf = zzumVar;
        zzudVar.zze |= 1;
    }

    static {
        zzud zzudVar = new zzud();
        zzc = zzudVar;
        zzajy.zza((Class<zzud>) zzud.class, zzudVar);
    }

    private zzud() {
    }
}
