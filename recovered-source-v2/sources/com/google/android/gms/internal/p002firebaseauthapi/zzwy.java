package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwy extends zzajy<zzwy, zza> implements zzale {
    private static final zzwy zzc;
    private static volatile zzalp<zzwy> zzd;
    private int zze;
    private int zzf;
    private zzxe zzg;
    private zzaip zzh = zzaip.zza;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzwy, zza> implements zzale {
        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzwy.zza((zzwy) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzxe zzxeVar) {
            zzh();
            zzwy.zza((zzwy) this.zza, zzxeVar);
            return this;
        }

        private zza() {
            super(zzwy.zzc);
        }
    }

    public static zzwy zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzwy) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzxe zzd() {
        zzxe zzxeVar = this.zzg;
        return zzxeVar == null ? zzxe.zzd() : zzxeVar;
    }

    public final zzaip zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzwx.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzwy();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwy> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwy.class) {
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

    static /* synthetic */ void zza(zzwy zzwyVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzwyVar.zzh = zzaipVar;
    }

    static /* synthetic */ void zza(zzwy zzwyVar, zzxe zzxeVar) {
        zzxeVar.getClass();
        zzwyVar.zzg = zzxeVar;
        zzwyVar.zze |= 1;
    }

    static {
        zzwy zzwyVar = new zzwy();
        zzc = zzwyVar;
        zzajy.zza((Class<zzwy>) zzwy.class, zzwyVar);
    }

    private zzwy() {
    }
}
