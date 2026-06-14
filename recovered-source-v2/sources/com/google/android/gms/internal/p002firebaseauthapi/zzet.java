package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzer;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzet {
    private static final zzzc zza;
    private static final zzon<zzer, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzes, zzpc> zzd;
    private static final zzms<zzpc> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzes zzb(zzpc zzpcVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseKey");
        }
        try {
            zzwg zza2 = zzwg.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() == 0) {
                return zzes.zza(zzer.zza(zza2.zzd().zzd(), zza(zzpcVar.zzb())), zzpcVar.zze());
            }
            throw new GeneralSecurityException("KmsAeadKey are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing KmsAeadKey failed: ", e);
        }
    }

    private static zzer.zza zza(zzws zzwsVar) throws GeneralSecurityException {
        int i = zzez.zza[zzwsVar.ordinal()];
        if (i == 1) {
            return zzer.zza.zza;
        }
        if (i == 2) {
            return zzer.zza.zzb;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzer zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsAeadProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            return zzer.zza(zzwj.zza(zzpfVar.zza().zze(), zzajk.zza()).zzd(), zza(zzpfVar.zza().zzd()));
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing KmsAeadKeyFormat failed: ", e);
        }
    }

    private static zzws zza(zzer.zza zzaVar) throws GeneralSecurityException {
        if (zzer.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzer.zza.zzb.equals(zzaVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.KmsAeadKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzev
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.KmsAeadKey").zza(((zzwj) ((zzajy) zzwj.zza().zza(r1.zzc()).zze())).a_()).zza(zzet.zza(((zzer) zzchVar).zzb())).zze()));
                return zzb3;
            }
        }, zzer.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzeu
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzer zzb3;
                zzb3 = zzet.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzex
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.KmsAeadKey", ((zzwg) ((zzajy) zzwg.zzb().zza((zzwj) ((zzajy) zzwj.zza().zza(r1.zzb().zzc()).zze())).zze())).a_(), zzvq.zzb.REMOTE, zzet.zza(r1.zzb().zzb()), ((zzes) zzbpVar).zza());
                return zza2;
            }
        }, zzes.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzew
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzes zzb3;
                zzb3 = zzet.zzb((zzpc) zzpjVar, zzcnVar);
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
}
