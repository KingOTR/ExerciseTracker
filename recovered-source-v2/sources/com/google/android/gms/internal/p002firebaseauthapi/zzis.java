package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzis {
    private static final zzor<zzio, zzbl> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzir
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzis.zza((zzio) zzbpVar);
        }
    }, zzio.class, zzbl.class);
    private static final zzbs<zzbl> zzb = zzna.zza("type.googleapis.com/google.crypto.tink.AesSivKey", zzbl.class, zzvq.zzb.SYMMETRIC, zzti.zze());
    private static final zznz<zziv> zzc = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zziu
    };
    private static final zznx<zziv> zzd = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzit
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzis.zza((zziv) zzchVar, num);
        }
    };

    public static /* synthetic */ zzbl zza(zzio zzioVar) {
        zza(zzioVar.zzc());
        return zzxt.zza(zzioVar);
    }

    static zzio zza(zziv zzivVar, @Nullable Integer num) throws GeneralSecurityException {
        zza(zzivVar);
        return zzio.zzb().zza(zzivVar).zza(num).zza(zzze.zza(zzivVar.zzb())).zza();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering AES SIV is not supported in FIPS mode");
        }
        zzjg.zza();
        zzoc.zza().zza(zza);
        zzod zza2 = zzod.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("AES256_SIV", zzje.zza);
        hashMap.put("AES256_SIV_RAW", zziv.zzc().zza(64).zza(zziv.zzb.zzc).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznw.zza().zza(zzc, zziv.class);
        zznv.zza().zza(zzd, zziv.class);
        zzmt.zza().zza((zzbs) zzb, true);
    }

    private static void zza(zziv zzivVar) throws GeneralSecurityException {
        if (zzivVar.zzb() == 64) {
            return;
        }
        throw new InvalidAlgorithmParameterException("invalid key size: " + zzivVar.zzb() + ". Valid keys must have 64 bytes.");
    }
}
