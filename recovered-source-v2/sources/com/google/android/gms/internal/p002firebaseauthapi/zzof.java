package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzof {
    private static final zzof zza = (zzof) zzpp.zza(new zzpo() { // from class: com.google.android.gms.internal.firebase-auth-api.zzoe
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpo
        public final Object zza() {
            zzof zzofVar = new zzof();
            zzofVar.zza(zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzoh
                @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
                public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                    return ((zznc) zzbpVar).zza(zzcnVar);
                }
            }, zznc.class, zzpc.class));
            return zzofVar;
        }
    });
    private final AtomicReference<zzpi> zzb = new AtomicReference<>(new zzpl().zza());

    public final <SerializationT extends zzpj> zzbp zza(SerializationT serializationt, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        return this.zzb.get().zza((zzpi) serializationt, zzcnVar);
    }

    public final <SerializationT extends zzpj> zzch zza(SerializationT serializationt) throws GeneralSecurityException {
        return this.zzb.get().zza((zzpi) serializationt);
    }

    public static zzof zza() {
        return zza;
    }

    public final <KeyT extends zzbp, SerializationT extends zzpj> SerializationT zza(KeyT keyt, Class<SerializationT> cls, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        return (SerializationT) this.zzb.get().zza(keyt, cls, zzcnVar);
    }

    public final <ParametersT extends zzch, SerializationT extends zzpj> SerializationT zza(ParametersT parameterst, Class<SerializationT> cls) throws GeneralSecurityException {
        return (SerializationT) this.zzb.get().zza((zzpi) parameterst, (Class) cls);
    }

    public final synchronized <SerializationT extends zzpj> void zza(zzms<SerializationT> zzmsVar) throws GeneralSecurityException {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzmsVar).zza());
    }

    public final synchronized <KeyT extends zzbp, SerializationT extends zzpj> void zza(zzmw<KeyT, SerializationT> zzmwVar) throws GeneralSecurityException {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzmwVar).zza());
    }

    public final synchronized <SerializationT extends zzpj> void zza(zzoj<SerializationT> zzojVar) throws GeneralSecurityException {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzojVar).zza());
    }

    public final synchronized <ParametersT extends zzch, SerializationT extends zzpj> void zza(zzon<ParametersT, SerializationT> zzonVar) throws GeneralSecurityException {
        this.zzb.set(new zzpl(this.zzb.get()).zza(zzonVar).zza());
    }

    public final <SerializationT extends zzpj> boolean zzb(SerializationT serializationt) {
        return this.zzb.get().zzb((zzpi) serializationt);
    }

    public final <SerializationT extends zzpj> boolean zzc(SerializationT serializationt) {
        return this.zzb.get().zzc((zzpi) serializationt);
    }
}
