package com.google.android.gms.internal.p002firebaseauthapi;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakq implements zzalu {
    private static final zzald zza = new zzakt();
    private final zzald zzb;

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzalu
    public final <T> zzalv<T> zza(Class<T> cls) {
        zzalx.zza((Class<?>) cls);
        zzala zza2 = this.zzb.zza(cls);
        if (zza2.zzc()) {
            return zzali.zza(zzalx.zza(), zzajo.zza(), zza2.zza());
        }
        return zzalg.zza(cls, zza2, zzalm.zza(), zzako.zza(), zzalx.zza(), zzaks.zza[zza2.zzb().ordinal()] != 1 ? zzajo.zza() : null, zzalb.zza());
    }

    public zzakq() {
        this(new zzakv(zzajw.zza(), zza));
    }

    private zzakq(zzald zzaldVar) {
        this.zzb = (zzald) zzakb.zza(zzaldVar, "messageInfoFactory");
    }
}
