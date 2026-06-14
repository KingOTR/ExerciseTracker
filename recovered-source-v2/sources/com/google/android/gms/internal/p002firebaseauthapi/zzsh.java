package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzsh extends zzajy<zzsh, zza> implements zzale {
    private static final zzsh zzc;
    private static volatile zzalp<zzsh> zzd;
    private int zze;
    private zzsk zzf;
    private int zzg;

    public final int zza() {
        return this.zzg;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzsh, zza> implements zzale {
        public final zza zza(int i) {
            zzh();
            ((zzsh) this.zza).zzg = i;
            return this;
        }

        public final zza zza(zzsk zzskVar) {
            zzh();
            zzsh.zza((zzsh) this.zza, zzskVar);
            return this;
        }

        private zza() {
            super(zzsh.zzc);
        }
    }

    public static zzsh zzd() {
        return zzc;
    }

    public final zzsk zze() {
        zzsk zzskVar = this.zzf;
        return zzskVar == null ? zzsk.zzd() : zzskVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzsj.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzsh();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzsh> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzsh.class) {
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

    static /* synthetic */ void zza(zzsh zzshVar, zzsk zzskVar) {
        zzskVar.getClass();
        zzshVar.zzf = zzskVar;
        zzshVar.zze |= 1;
    }

    static {
        zzsh zzshVar = new zzsh();
        zzc = zzshVar;
        zzajy.zza((Class<zzsh>) zzsh.class, zzshVar);
    }

    private zzsh() {
    }
}
