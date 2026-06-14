package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwp extends zzajy<zzwp, zza> implements zzale {
    private static final zzwp zzc;
    private static volatile zzalp<zzwp> zzd;
    private int zze;
    private String zzf = "";
    private zzvu zzg;

    public final zzvu zza() {
        zzvu zzvuVar = this.zzg;
        return zzvuVar == null ? zzvu.zzc() : zzvuVar;
    }

    public static zza zzb() {
        return zzc.zzm();
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzwp, zza> implements zzale {
        public final zza zza(zzvu zzvuVar) {
            zzh();
            zzwp.zza((zzwp) this.zza, zzvuVar);
            return this;
        }

        public final zza zza(String str) {
            zzh();
            zzwp.zza((zzwp) this.zza, str);
            return this;
        }

        private zza() {
            super(zzwp.zzc);
        }
    }

    public static zzwp zzd() {
        return zzc;
    }

    public static zzwp zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzwp) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzwr.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzwp();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwp> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwp.class) {
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

    public final String zze() {
        return this.zzf;
    }

    static /* synthetic */ void zza(zzwp zzwpVar, zzvu zzvuVar) {
        zzvuVar.getClass();
        zzwpVar.zzg = zzvuVar;
        zzwpVar.zze |= 1;
    }

    static /* synthetic */ void zza(zzwp zzwpVar, String str) {
        str.getClass();
        zzwpVar.zzf = str;
    }

    static {
        zzwp zzwpVar = new zzwp();
        zzc = zzwpVar;
        zzajy.zza((Class<zzwp>) zzwp.class, zzwpVar);
    }

    private zzwp() {
    }
}
