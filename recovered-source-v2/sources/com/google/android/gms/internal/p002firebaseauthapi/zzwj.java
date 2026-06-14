package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzwj extends zzajy<zzwj, zza> implements zzale {
    private static final zzwj zzc;
    private static volatile zzalp<zzwj> zzd;
    private String zze = "";

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzwj zzc() {
        return zzc;
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzwj, zza> implements zzale {
        public final zza zza(String str) {
            zzh();
            zzwj.zza((zzwj) this.zza, str);
            return this;
        }

        private zza() {
            super(zzwj.zzc);
        }
    }

    public static zzwj zza(zzaip zzaipVar, zzajk zzajkVar) throws zzakf {
        return (zzwj) zzajy.zza(zzc, zzaipVar, zzajkVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzwl.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzwj();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzwj> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzwj.class) {
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

    public final String zzd() {
        return this.zze;
    }

    static /* synthetic */ void zza(zzwj zzwjVar, String str) {
        str.getClass();
        zzwjVar.zze = str;
    }

    static {
        zzwj zzwjVar = new zzwj();
        zzc = zzwjVar;
        zzajy.zza((Class<zzwj>) zzwj.class, zzwjVar);
    }

    private zzwj() {
    }
}
