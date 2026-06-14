package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzuo extends zzajy<zzuo, zza> implements zzale {
    private static final zzuo zzc;
    private static volatile zzalp<zzuo> zzd;
    private int zze;
    private zzaip zzf = zzaip.zza;
    private zzwd zzg;

    public static zza zza() {
        return zzc.zzm();
    }

    public static zzuo zza(InputStream inputStream, zzajk zzajkVar) throws IOException {
        return (zzuo) zzajy.zza(zzc, inputStream, zzajkVar);
    }

    /* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
    public static final class zza extends zzajy.zza<zzuo, zza> implements zzale {
        public final zza zza() {
            zzh();
            zzuo.zza((zzuo) this.zza);
            return this;
        }

        public final zza zza(zzaip zzaipVar) {
            zzh();
            zzuo.zza((zzuo) this.zza, zzaipVar);
            return this;
        }

        public final zza zza(zzwd zzwdVar) {
            zzh();
            zzuo.zza((zzuo) this.zza, zzwdVar);
            return this;
        }

        private zza() {
            super(zzuo.zzc);
        }
    }

    public final zzaip zzc() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzajy
    protected final Object zza(int i, Object obj, Object obj2) {
        int i2 = zzuq.zza[i - 1];
        switch (i2) {
            case 1:
                return new zzuo();
            case 2:
                return new zza();
            case 3:
                return zza(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                zzalp<zzuo> zzalpVar = zzd;
                if (zzalpVar == null) {
                    synchronized (zzuo.class) {
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

    static /* synthetic */ void zza(zzuo zzuoVar) {
        zzuoVar.zzg = null;
        zzuoVar.zze &= -2;
    }

    static /* synthetic */ void zza(zzuo zzuoVar, zzaip zzaipVar) {
        zzaipVar.getClass();
        zzuoVar.zzf = zzaipVar;
    }

    static /* synthetic */ void zza(zzuo zzuoVar, zzwd zzwdVar) {
        zzwdVar.getClass();
        zzuoVar.zzg = zzwdVar;
        zzuoVar.zze |= 1;
    }

    static {
        zzuo zzuoVar = new zzuo();
        zzc = zzuoVar;
        zzajy.zza((Class<zzuo>) zzuo.class, zzuoVar);
    }

    private zzuo() {
    }
}
