package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzxk extends zzajy<zzxk, zza> implements zzale {
    private static final zzxk zzc;
    private static volatile zzalp<zzxk> zzd;
    private int zze;

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzxk, zza> implements zzale {
        private zza() {
            super(zzxk.zzc);
        }
    }

    public final int zza() {
        return this.zze;
    }

    public static zzxk zzc() {
        return zzc;
    }

    public static zzxk zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzxk) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzxj.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzxk();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzxk> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzxk.class) {
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

    static {
        zzxk zzxkVar = new zzxk();
        zzc = zzxkVar;
        zzajy.zza((Class<zzxk>) zzxk.class, zzxkVar);
    }

    private zzxk() {
    }
}
