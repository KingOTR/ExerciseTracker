package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzdv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzgq {
    private static final zzzc zza;
    private static final zzon<zzdv, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzdo, zzpc> zzd;
    private static final zzms<zzpc> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdo zzb(zzpc zzpcVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseKey");
        }
        try {
            zzsw zza2 = zzsw.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzdo.zzb().zza(zzdv.zze().zzb(zza2.zzd().zzb()).zza(12).zzc(16).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesGcmKey failed");
        }
    }

    private static zzdv.zzb zza(zzws zzwsVar) throws GeneralSecurityException {
        int i = zzgt.zza[zzwsVar.ordinal()];
        if (i == 1) {
            return zzdv.zzb.zza;
        }
        if (i == 2 || i == 3) {
            return zzdv.zzb.zzb;
        }
        if (i == 4) {
            return zzdv.zzb.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzdv zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesGcmProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            zzsz zza2 = zzsz.zza(zzpfVar.zza().zze(), zzajk.zza());
            if (zza2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            return zzdv.zze().zzb(zza2.zza()).zza(12).zzc(16).zza(zza(zzpfVar.zza().zzd())).zza();
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing AesGcmParameters failed: ", e);
        }
    }

    public static /* synthetic */ zzpc zza(zzdo zzdoVar, zzcn zzcnVar) {
        zzb(zzdoVar.zzc());
        return zzpc.zza("type.googleapis.com/google.crypto.tink.AesGcmKey", ((zzsw) ((zzajy) zzsw.zzb().zza(zzaip.zza(zzdoVar.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zza(zzdoVar.zzc().zzf()), zzdoVar.zza());
    }

    public static /* synthetic */ zzpf zza(zzdv zzdvVar) {
        zzb(zzdvVar);
        return zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesGcmKey").zza(((zzsz) ((zzajy) zzsz.zzc().zza(zzdvVar.zzc()).zze())).a_()).zza(zza(zzdvVar.zzf())).zze()));
    }

    private static zzws zza(zzdv.zzb zzbVar) throws GeneralSecurityException {
        if (zzdv.zzb.zza.equals(zzbVar)) {
            return zzws.TINK;
        }
        if (zzdv.zzb.zzb.equals(zzbVar)) {
            return zzws.CRUNCHY;
        }
        if (zzdv.zzb.zzc.equals(zzbVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgp
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                return zzgq.zza((zzdv) zzchVar);
            }
        }, zzdv.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgs
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzdv zzb3;
                zzb3 = zzgq.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgr
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                return zzgq.zza((zzdo) zzbpVar, zzcnVar);
            }
        }, zzdo.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzgu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzdo zzb3;
                zzb3 = zzgq.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
    }

    public static void zza() throws GeneralSecurityException {
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }

    private static void zzb(zzdv zzdvVar) throws GeneralSecurityException {
        if (zzdvVar.zzd() != 16) {
            throw new GeneralSecurityException(String.format("Invalid tag size in bytes %d. Currently Tink only supports serialization of AES GCM keys with tag size equal to 16 bytes.", Integer.valueOf(zzdvVar.zzd())));
        }
        if (zzdvVar.zzb() != 12) {
            throw new GeneralSecurityException(String.format("Invalid IV size in bytes %d. Currently Tink only supports serialization of AES GCM keys with IV size equal to 12 bytes.", Integer.valueOf(zzdvVar.zzb())));
        }
    }
}
