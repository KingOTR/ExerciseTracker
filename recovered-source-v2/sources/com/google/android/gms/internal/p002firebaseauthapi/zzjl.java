package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdg;
import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzjp;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzjl {
    private static final zzor<zzjs, zzbo> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjo
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxx.zza((zzjs) zzbpVar);
        }
    }, zzjs.class, zzbo.class);
    private static final zzor<zzjv, zzbn> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjn
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzxw.zza((zzjv) zzbpVar);
        }
    }, zzjv.class, zzbn.class);
    private static final zzcj<zzbo> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey", zzbo.class, zzug.zzf());
    private static final zzbs<zzbn> zzd = zzna.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey", zzbn.class, zzvq.zzb.ASYMMETRIC_PUBLIC, zzuj.zzh());
    private static final zznx<zzjp> zze = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjq
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzjl.zza((zzjp) zzchVar, num);
        }
    };

    public static /* synthetic */ zzjs zza(zzjp zzjpVar, Integer num) {
        ECParameterSpec eCParameterSpec;
        zzjp.zzc zzd2 = zzjpVar.zzd();
        if (zzd2 == zzjp.zzc.zza) {
            eCParameterSpec = zzmk.zza;
        } else if (zzd2 == zzjp.zzc.zzb) {
            eCParameterSpec = zzmk.zzb;
        } else {
            if (zzd2 != zzjp.zzc.zzc) {
                throw new GeneralSecurityException("Unsupported curve type: " + String.valueOf(zzd2));
            }
            eCParameterSpec = zzmk.zzc;
        }
        KeyPair zza2 = zzyb.zza(eCParameterSpec);
        return zzjs.zza(zzjv.zza(zzjpVar, ((ECPublicKey) zza2.getPublic()).getW(), num), zzzf.zza(((ECPrivateKey) zza2.getPrivate()).getS(), zzbq.zza()));
    }

    static String zza() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        if (!zzil.zza.zza.zza()) {
            throw new GeneralSecurityException("Registering ECIES Hybrid Encryption is not supported in FIPS mode");
        }
        zzkz.zza();
        zzod zza2 = zzod.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zzb).zza(zzjp.zzd.zza).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzdv.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zzb).zza(zzjp.zzd.zzc).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzdv.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zza).zza(zzjp.zzd.zza).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzdv.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zza).zza(zzjp.zzd.zzc).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzdv.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zza).zza(zzjp.zzd.zzc).zza(zzdv.zze().zza(12).zzb(16).zzc(16).zza(zzdv.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zzb).zza(zzjp.zzd.zza).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zzb).zza(zzjp.zzd.zzc).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zza).zza(zzjp.zzd.zza).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza()).zza());
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzjp.zzc().zza(zzjp.zzc.zza).zza(zzjp.zzb.zzc).zza(zzjp.zze.zza).zza(zzjp.zzd.zzc).zza(zzdg.zzf().zza(16).zzb(32).zzd(16).zzc(16).zza(zzdg.zzc.zzc).zza(zzdg.zzb.zzc).zza()).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
        zznv.zza().zza(zze, zzjp.class);
        zzmt.zza().zza((zzbs) zzc, true);
        zzmt.zza().zza((zzbs) zzd, false);
    }
}
