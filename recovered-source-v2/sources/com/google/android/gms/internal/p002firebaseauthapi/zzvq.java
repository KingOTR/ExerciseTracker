package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import kotlin.text.Typography;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzvq extends zzajy<zzvq, zza> implements zzale {
    private static final zzvq zzc;
    private static volatile zzalp<zzvq> zzd;
    private String zze = "";
    private zzaip zzf = zzaip.zza;
    private int zzg;

    public static zza zza() {
        return zzc.zzm();
    }

    public final zzb zzb() {
        zzb zza2 = zzb.zza(this.zzg);
        return zza2 == null ? zzb.UNRECOGNIZED : zza2;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzvq, zza> implements zzale {
        public final zza zza(zzb zzbVar) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzbVar);
            return this;
        }

        public final zza zza(String str) {
            zzh();
            zzvq.zza((zzvq) this.zza, str);
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzvq.zza((zzvq) this.zza, zzaipVar);
            return this;
        }

        private zza() {
            super(zzvq.zzc);
        }
    }

    public static zzvq zzd() {
        return zzc;
    }

    public final zzaip zze() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzvs.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzvq();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvq> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzvq.class) {
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

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public enum zzb implements zzaka {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);

        private final int zzh;

        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaka
        public final int zza() {
            if (this != UNRECOGNIZED) {
                return this.zzh;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zzb zza(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        @Override // java.lang.Enum
        public final String toString() {
            StringBuilder sb = new StringBuilder("<");
            sb.append(getClass().getName()).append('@').append(Integer.toHexString(System.identityHashCode(this)));
            if (this != UNRECOGNIZED) {
                sb.append(" number=").append(zza());
            }
            return sb.append(" name=").append(name()).append(Typography.greater).toString();
        }

        zzb(int i) {
            this.zzh = i;
        }
    }

    public final String zzf() {
        return this.zze;
    }

    static /* synthetic */ void zza(zzvq zzvqVar, zzb zzbVar) {
        zzvqVar.zzg = zzbVar.zza();
    }

    static /* synthetic */ void zza(zzvq zzvqVar, String str) {
        str.getClass();
        zzvqVar.zze = str;
    }

    static /* synthetic */ void zza(zzvq zzvqVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzvqVar.zzf = zzaipVar;
    }

    static {
        zzvq zzvqVar = new zzvq();
        zzc = zzvqVar;
        zzajy.zza((Class<zzvq>) zzvq.class, zzvqVar);
    }

    private zzvq() {
    }
}
