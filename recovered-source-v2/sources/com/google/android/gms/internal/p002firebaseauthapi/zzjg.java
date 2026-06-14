package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zziv;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzjg {
    private static final zzzc zza;
    private static final zzon<zziv, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzio, zzpc> zzd;
    private static final zzms<zzpc> zze;
    private static final Map<zziv.zzb, zzws> zzf;
    private static final Map<zzws, zziv.zzb> zzg;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzio zzb(zzpc zzpcVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters");
        }
        try {
            zzti zza2 = zzti.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zzio.zzb().zza(zziv.zzc().zza(zza2.zzd().zzb()).zza(zza(zzpcVar.zzb())).zza()).zza(zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar))).zza(zzpcVar.zze()).zza();
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing AesSivKey failed");
        }
    }

    private static zziv.zzb zza(zzws zzwsVar) throws GeneralSecurityException {
        Map<zzws, zziv.zzb> map = zzg;
        if (map.containsKey(zzwsVar)) {
            return map.get(zzwsVar);
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zziv zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.AesSivKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to AesSivParameters.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            zztl zza2 = zztl.zza(zzpfVar.zza().zze(), zzajk.zza());
            if (zza2.zzb() != 0) {
                throw new GeneralSecurityException("Only version 0 keys are accepted");
            }
            return zziv.zzc().zza(zza2.zza()).zza(zza(zzpfVar.zza().zzd())).zza();
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing AesSivParameters failed: ", e);
        }
    }

    private static zzws zza(zziv.zzb zzbVar) throws GeneralSecurityException {
        Map<zziv.zzb, zzws> map = zzf;
        if (map.containsKey(zzbVar)) {
            return map.get(zzbVar);
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.AesSivKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjf
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.AesSivKey").zza(((zztl) ((zzajy) zztl.zzc().zza(r1.zzb()).zze())).a_()).zza(zzjg.zza(((zziv) zzchVar).zzd())).zze()));
                return zzb3;
            }
        }, zziv.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzji
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zziv zzb3;
                zzb3 = zzjg.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjh
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.AesSivKey", ((zzti) ((zzajy) zzti.zzb().zza(zzaip.zza(r1.zze().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzjg.zza(r1.zzc().zzd()), ((zzio) zzbpVar).zza());
                return zza2;
            }
        }, zzio.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzjk
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzio zzb3;
                zzb3 = zzjg.zzb((zzpc) zzpjVar, zzcnVar);
                return zzb3;
            }
        }, zzb2, zzpc.class);
        HashMap hashMap = new HashMap();
        hashMap.put(zziv.zzb.zzc, zzws.RAW);
        hashMap.put(zziv.zzb.zza, zzws.TINK);
        hashMap.put(zziv.zzb.zzb, zzws.CRUNCHY);
        zzf = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(zzws.class);
        enumMap.put((EnumMap) zzws.RAW, (zzws) zziv.zzb.zzc);
        enumMap.put((EnumMap) zzws.TINK, (zzws) zziv.zzb.zza);
        enumMap.put((EnumMap) zzws.CRUNCHY, (zzws) zziv.zzb.zzb);
        enumMap.put((EnumMap) zzws.LEGACY, (zzws) zziv.zzb.zzb);
        zzg = Collections.unmodifiableMap(enumMap);
    }

    public static void zza() throws GeneralSecurityException {
        zzof zza2 = zzof.zza();
        zza2.zza(zzb);
        zza2.zza(zzc);
        zza2.zza(zzd);
        zza2.zza(zze);
    }
}
