package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwa extends zzajy<zzwa, zza> implements zzale {
    private static final zzwa zzc;
    private static volatile zzalp<zzwa> zzd;
    private int zze;
    private zzakc<zzb> zzf = zzp();

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zzb extends zzajy<zzb, zza> implements zzale {
        private static final zzb zzc;
        private static volatile zzalp<zzb> zzd;
        private int zze;
        private zzvq zzf;
        private int zzg;
        private int zzh;
        private int zzi;

        public final int zza() {
            return this.zzh;
        }

        public final zzvq zzb() {
            zzvq zzvqVar = this.zzf;
            return zzvqVar == null ? zzvq.zzd() : zzvqVar;
        }

        /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
        public static final class zza extends zzajy.zza<zzb, zza> implements zzale {
            public final zza zza(zzvq.zza zzaVar) {
                zzh();
                zzb.zza((zzb) this.zza, (zzvq) ((zzajy) zzaVar.zze()));
                return this;
            }

            public final zza zza(zzvq zzvqVar) {
                zzh();
                zzb.zza((zzb) this.zza, zzvqVar);
                return this;
            }

            public final zza zza(int i) {
                zzh();
                ((zzb) this.zza).zzh = i;
                return this;
            }

            public final zza zza(zzws zzwsVar) {
                zzh();
                zzb.zza((zzb) this.zza, zzwsVar);
                return this;
            }

            public final zza zza(zzvv zzvvVar) {
                zzh();
                zzb.zza((zzb) this.zza, zzvvVar);
                return this;
            }

            private zza() {
                super(zzb.zzc);
            }
        }

        public final zzvv zzc() {
            zzvv zza2 = zzvv.zza(this.zzg);
            return zza2 == null ? zzvv.UNRECOGNIZED : zza2;
        }

        public static zza zzd() {
            return zzc.zzm();
        }

        public final zzws zzf() {
            zzws zza2 = zzws.zza(this.zzi);
            return zza2 == null ? zzws.UNRECOGNIZED : zza2;
        }

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
        protected final Object zza(int i, Object obj, Object obj2) {
            int i2 = zzwc.zza[i - 1];
            switch (i2) {
                case 1:
                    return new zzb();
                case 2:
                    return new zza();
                case 3:
                    return zza(zzc, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
                case 4:
                    return zzc;
                case 5:
                    zzalp<zzb> zzalpVar = zzd;
                    if (zzalpVar == null) {
                        synchronized (zzb.class) {
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

        static /* synthetic */ void zza(zzb zzbVar, zzvq zzvqVar) {
            zzvqVar.getClass();
            zzbVar.zzf = zzvqVar;
            zzbVar.zze |= 1;
        }

        static /* synthetic */ void zza(zzb zzbVar, zzws zzwsVar) {
            zzbVar.zzi = zzwsVar.zza();
        }

        static /* synthetic */ void zza(zzb zzbVar, zzvv zzvvVar) {
            zzbVar.zzg = zzvvVar.zza();
        }

        static {
            zzb zzbVar = new zzb();
            zzc = zzbVar;
            zzajy.zza((Class<zzb>) zzb.class, zzbVar);
        }

        private zzb() {
        }

        public final boolean e_() {
            return (this.zze & 1) != 0;
        }
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzwa, zza> implements zzale {
        public final zza zza(zzb zzbVar) {
            zzh();
            zzwa.zza((zzwa) this.zza, zzbVar);
            return this;
        }

        public final zza zza(int i) {
            zzh();
            ((zzwa) this.zza).zze = i;
            return this;
        }

        private zza() {
            super(zzwa.zzc);
        }
    }

    public static zza zzc() {
        return zzc.zzm();
    }

    public final zzb zza(int i) {
        return this.zzf.get(i);
    }

    public static zzwa zza(InputStream inputStream, zzajk zzajkVar) throws IOException {
        return (zzwa) zzajy.zza(zzc, inputStream, zzajkVar);
    }

    public static zzwa zza(byte[] bArr, zzajk zzajkVar) throws zzakf {
        return (zzwa) zzajy.zza(zzc, bArr, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzwc.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzwa();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzb.class});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwa> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwa.class) {
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

    public final List<zzb> zze() {
        return this.zzf;
    }

    static /* synthetic */ void zza(zzwa zzwaVar, zzb zzbVar) {
        zzbVar.getClass();
        zzakc<zzb> zzakcVar = zzwaVar.zzf;
        if (!zzakcVar.zzc()) {
            zzwaVar.zzf = zzajy.zza(zzakcVar);
        }
        zzwaVar.zzf.add(zzbVar);
    }

    static {
        zzwa zzwaVar = new zzwa();
        zzc = zzwaVar;
        zzajy.zza((Class<zzwa>) zzwa.class, zzwaVar);
    }

    private zzwa() {
    }
}
