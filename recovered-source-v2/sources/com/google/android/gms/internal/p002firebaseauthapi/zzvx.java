package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
@Deprecated
/* loaded from: classes3.dex */
public final class zzvx extends zzajy<zzvx, zza> implements zzale {
    private static final zzvx zzc;
    private static volatile zzalp<zzvx> zzd;
    private int zzg;
    private boolean zzh;
    private String zze = "";
    private String zzf = "";
    private String zzi = "";

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzvx, zza> implements zzale {
        private zza() {
            super(zzvx.zzc);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzvz.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzvx();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzvx> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzvx.class) {
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
        zzvx zzvxVar = new zzvx();
        zzc = zzvxVar;
        zzajy.zza((Class<zzvx>) zzvx.class, zzvxVar);
    }

    private zzvx() {
    }
}
