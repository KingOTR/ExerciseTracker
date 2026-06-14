package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import java.security.GeneralSecurityException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzmt {
    private static final Logger zza = Logger.getLogger(zzmt.class.getName());
    private static final zzmt zzb = new zzmt();
    private ConcurrentMap<String, zzbs<?>> zzc = new ConcurrentHashMap();
    private ConcurrentMap<String, Boolean> zzd = new ConcurrentHashMap();

    public final <P> zzbs<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzbs<P> zzbsVar = (zzbs<P>) zzc(str);
        if (zzbsVar.zza().equals(cls)) {
            return zzbsVar;
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + String.valueOf(zzbsVar.getClass()) + ", which only supports: " + String.valueOf(zzbsVar.zza()));
    }

    private final synchronized zzbs<?> zzc(String str) throws GeneralSecurityException {
        if (!this.zzc.containsKey(str)) {
            throw new GeneralSecurityException("No key manager found for key type " + str);
        }
        return this.zzc.get(str);
    }

    public final zzbs<?> zza(String str) throws GeneralSecurityException {
        return zzc(str);
    }

    public static zzmt zza() {
        return zzb;
    }

    private final synchronized void zza(zzbs<?> zzbsVar, boolean z, boolean z2) throws GeneralSecurityException {
        String zzb2 = zzbsVar.zzb();
        if (z2 && this.zzd.containsKey(zzb2) && !this.zzd.get(zzb2).booleanValue()) {
            throw new GeneralSecurityException("New keys are already disallowed for key type " + zzb2);
        }
        zzbs<?> zzbsVar2 = this.zzc.get(zzb2);
        if (zzbsVar2 != null && !zzbsVar2.getClass().equals(zzbsVar.getClass())) {
            zza.logp(Level.WARNING, "com.google.crypto.tink.internal.KeyManagerRegistry", "insertKeyManager", "Attempted overwrite of a registered key manager for key type " + zzb2);
            throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", zzb2, zzbsVar2.getClass().getName(), zzbsVar.getClass().getName()));
        }
        this.zzc.putIfAbsent(zzb2, zzbsVar);
        this.zzd.put(zzb2, Boolean.valueOf(z2));
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, boolean z) throws GeneralSecurityException {
        zza(zzbsVar, zzil.zza.zza, z);
    }

    public final synchronized <P> void zza(zzbs<P> zzbsVar, zzil.zza zzaVar, boolean z) throws GeneralSecurityException {
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Cannot register key manager: FIPS compatibility insufficient");
        }
        zza((zzbs<?>) zzbsVar, false, z);
    }

    public final boolean zzb(String str) {
        return this.zzd.get(str).booleanValue();
    }
}
