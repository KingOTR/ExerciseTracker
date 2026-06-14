package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwm extends zzajy<zzwm, zza> implements zzale {
    private static final zzwm zzc;
    private static volatile zzalp<zzwm> zzd;
    private int zze;
    private int zzf;
    private zzwp zzg;

    public final int zza() {
        return this.zzf;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzwm, zza> implements zzale {
        public final zza zza(zzwp zzwpVar) {
            zzh();
            zzwm.zza((zzwm) this.zza, zzwpVar);
            return this;
        }

        private zza() {
            super(zzwm.zzc);
        }
    }

    public static zzwm zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzwm) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    public final zzwp zzd() {
        zzwp zzwpVar = this.zzg;
        return zzwpVar == null ? zzwp.zzd() : zzwpVar;
    }

    public static zzalp<zzwm> zze() {
        return (zzalp) zzc.zza(zzajy.zzf.zzg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzwo.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzwm();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwm> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwm.class) {
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

    static /* synthetic */ void zza(zzwm zzwmVar, zzwp zzwpVar) {
        zzwpVar.getClass();
        zzwmVar.zzg = zzwpVar;
        zzwmVar.zze |= 1;
    }

    static {
        zzwm zzwmVar = new zzwm();
        zzc = zzwmVar;
        zzajy.zza((Class<zzwm>) zzwm.class, zzwmVar);
    }

    private zzwm() {
    }
}
