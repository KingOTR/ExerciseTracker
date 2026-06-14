package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzco {
    @Deprecated
    static zzvq zza(String str, zzaip zzaipVar) throws GeneralSecurityException {
        zzbs<?> zza = zzmt.zza().zza(str);
        if (zza instanceof zzcj) {
            return ((zzcj) zza).zzc(zzaipVar);
        }
        throw new GeneralSecurityException("manager for key type " + str + " is not a PrivateKeyManager");
    }

    @Nullable
    public static Class<?> zza(Class<?> cls) {
        try {
            return zzoc.zza().zza(cls);
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    public static <P> P zza(zzvq zzvqVar, Class<P> cls) throws GeneralSecurityException {
        String zzf = zzvqVar.zzf();
        return zzmt.zza().zza(zzf, cls).zzb(zzvqVar.zze());
    }

    public static <B, P> P zza(zzoz<B> zzozVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zzoc.zza().zza(zzozVar, cls);
    }

    static {
        Logger.getLogger(zzco.class.getName());
        new ConcurrentHashMap();
        HashSet hashSet = new HashSet();
        hashSet.add(zzbg.class);
        hashSet.add(zzbl.class);
        hashSet.add(zzcq.class);
        hashSet.add(zzbn.class);
        hashSet.add(zzbo.class);
        hashSet.add(zzci.class);
        hashSet.add(zzrq.class);
        hashSet.add(zzcm.class);
        hashSet.add(zzcl.class);
        Collections.unmodifiableSet(hashSet);
    }

    private zzco() {
    }
}
