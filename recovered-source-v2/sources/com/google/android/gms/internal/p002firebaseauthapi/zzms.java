package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzpj;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzms<SerializationT extends zzpj> {
    private final zzzc zza;
    private final Class<SerializationT> zzb;

    public static <SerializationT extends zzpj> zzms<SerializationT> zza(zzmu<SerializationT> zzmuVar, zzzc zzzcVar, Class<SerializationT> cls) {
        return new zzmv(zzzcVar, cls, zzmuVar);
    }

    public abstract zzbp zza(SerializationT serializationt, @Nullable zzcn zzcnVar) throws GeneralSecurityException;

    public final zzzc zza() {
        return this.zza;
    }

    public final Class<SerializationT> zzb() {
        return this.zzb;
    }

    private zzms(zzzc zzzcVar, Class<SerializationT> cls) {
        this.zza = zzzcVar;
        this.zzb = cls;
    }
}
