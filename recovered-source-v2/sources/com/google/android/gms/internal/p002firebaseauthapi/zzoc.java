package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzoc {
    private static zzoc zza = new zzoc();
    private final AtomicReference<zzov> zzb = new AtomicReference<>(new zzou().zza());

    public static zzoc zza() {
        return zza;
    }

    public final <WrapperPrimitiveT> Class<?> zza(Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return this.zzb.get().zza((Class<?>) cls);
    }

    public final <KeyT extends zzbp, PrimitiveT> PrimitiveT zza(KeyT keyt, Class<PrimitiveT> cls) throws GeneralSecurityException {
        return (PrimitiveT) this.zzb.get().zza((zzov) keyt, (Class) cls);
    }

    public final <InputPrimitiveT, WrapperPrimitiveT> WrapperPrimitiveT zza(zzoz<InputPrimitiveT> zzozVar, Class<WrapperPrimitiveT> cls) throws GeneralSecurityException {
        return (WrapperPrimitiveT) this.zzb.get().zza(zzozVar, cls);
    }

    zzoc() {
    }

    public final synchronized <KeyT extends zzbp, PrimitiveT> void zza(zzor<KeyT, PrimitiveT> zzorVar) throws GeneralSecurityException {
        this.zzb.set(zzov.zza(this.zzb.get()).zza(zzorVar).zza());
    }

    public final synchronized <InputPrimitiveT, WrapperPrimitiveT> void zza(zzpd<InputPrimitiveT, WrapperPrimitiveT> zzpdVar) throws GeneralSecurityException {
        this.zzb.set(zzov.zza(this.zzb.get()).zza(zzpdVar).zza());
    }
}
