package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzva extends zzajy<zzva, zza> implements zzale {
    private static final zzva zzc;
    private static volatile zzalp<zzva> zzd;
    private int zze;
    private int zzf;

    public final int zza() {
        return this.zzf;
    }

    public final zzur zzb() {
        zzur zza2 = zzur.zza(this.zze);
        return zza2 == null ? zzur.UNRECOGNIZED : zza2;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzva, zza> implements zzale {
        public final zza zza(zzur zzurVar) {
            zzh();
            zzva.zza((zzva) this.zza, zzurVar);
            return this;
        }

        public final zza zza(int i) {
            zzh();
            ((zzva) this.zza).zzf = i;
            return this;
        }

        private zza() {
            super(zzva.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public static zzva zze() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzuz.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzva();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzva> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzva.class) {
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

    static /* synthetic */ void zza(zzva zzvaVar, zzur zzurVar) {
        zzvaVar.zze = zzurVar.zza();
    }

    static {
        zzva zzvaVar = new zzva();
        zzc = zzvaVar;
        zzajy.zza((Class<zzva>) zzva.class, zzvaVar);
    }

    private zzva() {
    }
}
