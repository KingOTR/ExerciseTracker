package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzil;
import com.google.android.gms.internal.p002firebaseauthapi.zzqk;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzqe {
    private static final zzor<zzqd, zzqa> zza = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqh
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return new zzri((zzqd) zzbpVar);
        }
    }, zzqd.class, zzqa.class);
    private static final zzor<zzqd, zzci> zzb = zzor.zza(new zzot() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqg
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zzot
        public final Object zza(zzbp zzbpVar) {
            return zzyz.zza((zzqd) zzbpVar);
        }
    }, zzqd.class, zzci.class);
    private static final zzbs<zzci> zzc = zzna.zza("type.googleapis.com/google.crypto.tink.HmacKey", zzci.class, zzvq.zzb.SYMMETRIC, zzuu.c_());
    private static final zznz<zzqk> zzd = new zznz() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqj
    };
    private static final zznx<zzqk> zze = new zznx() { // from class: com.google.android.gms.internal.firebase-auth-api.zzqi
        @Override // com.google.android.gms.internal.p002firebaseauthapi.zznx
        public final zzbp zza(zzch zzchVar, Integer num) {
            return zzqe.zza((zzqk) zzchVar, num);
        }
    };
    private static final zzil.zza zzf = zzil.zza.zzb;

    static zzqd zza(zzqk zzqkVar, @Nullable Integer num) throws GeneralSecurityException {
        return zzqd.zzb().zza(zzqkVar).zza(zzze.zza(zzqkVar.zzc())).zza(num).zza();
    }

    public static void zza(boolean z) throws GeneralSecurityException {
        zzil.zza zzaVar = zzf;
        if (!zzaVar.zza()) {
            throw new GeneralSecurityException("Can not use HMAC in FIPS-mode, as BoringCrypto module is not available.");
        }
        zzrh.zza();
        zzoc.zza().zza(zza);
        zzoc.zza().zza(zzb);
        zzod zza2 = zzod.zza();
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzqu.zza);
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzqk.zzd().zza(32).zzb(16).zza(zzqk.zzb.zzd).zza(zzqk.zzc.zzc).zza());
        hashMap.put("HMAC_SHA256_256BITTAG", zzqk.zzd().zza(32).zzb(32).zza(zzqk.zzb.zza).zza(zzqk.zzc.zzc).zza());
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzqk.zzd().zza(32).zzb(32).zza(zzqk.zzb.zzd).zza(zzqk.zzc.zzc).zza());
        hashMap.put("HMAC_SHA512_128BITTAG", zzqk.zzd().zza(64).zzb(16).zza(zzqk.zzb.zza).zza(zzqk.zzc.zze).zza());
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzqk.zzd().zza(64).zzb(16).zza(zzqk.zzb.zzd).zza(zzqk.zzc.zze).zza());
        hashMap.put("HMAC_SHA512_256BITTAG", zzqk.zzd().zza(64).zzb(32).zza(zzqk.zzb.zza).zza(zzqk.zzc.zze).zza());
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzqk.zzd().zza(64).zzb(32).zza(zzqk.zzb.zzd).zza(zzqk.zzc.zze).zza());
        hashMap.put("HMAC_SHA512_512BITTAG", zzqu.zzb);
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzqk.zzd().zza(64).zzb(64).zza(zzqk.zzb.zzd).zza(zzqk.zzc.zze).zza());
        zza2.zza(Collections.unmodifiableMap(hashMap));
        zznv.zza().zza(zze, zzqk.class);
        zznw.zza().zza(zzd, zzqk.class);
        zzmt.zza().zza((zzbs) zzc, zzaVar, true);
    }
}
