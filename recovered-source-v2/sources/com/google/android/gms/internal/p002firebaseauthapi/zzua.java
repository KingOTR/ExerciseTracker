package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzua extends zzajy<zzua, zza> implements zzale {
    private static final zzua zzc;
    private static volatile zzalp<zzua> zzd;
    private int zze;
    private zzud zzf;

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzua zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzua) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzua, zza> implements zzale {
        public final zza zza(zzud zzudVar) {
            zzh();
            zzua.zza((zzua) this.zza, zzudVar);
            return this;
        }

        private zza() {
            super(zzua.zzc);
        }
    }

    public final zzud zzc() {
        zzud zzudVar = this.zzf;
        return zzudVar == null ? zzud.zze() : zzudVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zztz.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzua();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"zze", "zzf"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzua> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzua.class) {
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

    static /* synthetic */ void zza(zzua zzuaVar, zzud zzudVar) {
        zzudVar.getClass();
        zzuaVar.zzf = zzudVar;
        zzuaVar.zze |= 1;
    }

    static {
        zzua zzuaVar = new zzua();
        zzc = zzuaVar;
        zzajy.zza((Class<zzua>) zzua.class, zzuaVar);
    }

    private zzua() {
    }
}
