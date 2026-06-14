package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzfa;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzfb {
    private static final zzzc zza;
    private static final zzon<zzfa, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzey, zzpc> zzd;
    private static final zzms<zzpc> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzey zzb(zzpc zzpcVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseKey");
        }
        try {
            zzwm zza2 = zzwm.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() == 0) {
                return zzey.zza(zza(zza2.zzd(), zzpcVar.zzb()), zzpcVar.zze());
            }
            throw new GeneralSecurityException("KmsEnvelopeAeadKeys are only accepted with version 0, got " + String.valueOf(zza2));
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKey failed: ", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfa zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
            throw new IllegalArgumentException("Wrong type URL in call to LegacyKmsEnvelopeAeadProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            return zza(zzwp.zza(zzpfVar.zza().zze(), zzajk.zza()), zzpfVar.zza().zzd());
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzfa zza(zzwp zzwpVar, zzws zzwsVar) throws GeneralSecurityException {
        zzfa.zzc zzcVar;
        zzfa.zzb zzbVar;
        zzch zza2 = zzcp.zza(((zzvu) ((zzajy) zzvu.zza().zza(zzwpVar.zza().zzf()).zza(zzwpVar.zza().zze()).zza(zzws.RAW).zze())).zzk());
        if (zza2 instanceof zzdv) {
            zzcVar = zzfa.zzc.zza;
        } else if (zza2 instanceof zzei) {
            zzcVar = zzfa.zzc.zzc;
        } else if (zza2 instanceof zzga) {
            zzcVar = zzfa.zzc.zzb;
        } else if (zza2 instanceof zzdg) {
            zzcVar = zzfa.zzc.zzd;
        } else if (zza2 instanceof zzdm) {
            zzcVar = zzfa.zzc.zze;
        } else if (zza2 instanceof zzec) {
            zzcVar = zzfa.zzc.zzf;
        } else {
            throw new GeneralSecurityException("Unsupported DEK parameters when parsing " + String.valueOf(zza2));
        }
        zzfa.zza zzaVar = new zzfa.zza();
        int i = zzfi.zza[zzwsVar.ordinal()];
        if (i == 1) {
            zzbVar = zzfa.zzb.zza;
        } else if (i == 2) {
            zzbVar = zzfa.zzb.zzb;
        } else {
            throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
        }
        return zzaVar.zza(zzbVar).zza(zzwpVar.zze()).zza((zzcw) zza2).zza(zzcVar).zza();
    }

    private static zzwp zzb(zzfa zzfaVar) throws GeneralSecurityException {
        try {
            return (zzwp) ((zzajy) zzwp.zzb().zza(zzfaVar.zzd()).zza(zzvu.zza(zzcp.zza(zzfaVar.zzb()), zzajk.zza())).zze());
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing KmsEnvelopeAeadKeyFormat failed: ", e);
        }
    }

    private static zzws zza(zzfa.zzb zzbVar) throws GeneralSecurityException {
        if (zzfa.zzb.zza.equals(zzbVar)) {
            return zzws.TINK;
        }
        if (zzfa.zzb.zzb.equals(zzbVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzbVar));
    }

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfe
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey").zza(zzfb.zzb(r1).a_()).zza(zzfb.zza(((zzfa) zzchVar).zzc())).zze()));
                return zzb3;
            }
        }, zzfa.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfd
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzfa zzb3;
                zzb3 = zzfb.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzfg
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey", ((zzwm) ((zzajy) zzwm.zzb().zza(zzfb.zzb(r1.zzb())).zze())).a_(), zzvq.zzb.REMOTE, zzfb.zza(r1.zzb().zzc()), ((zzey) zzbpVar).zza());
                return zza2;
            }
        }, zzey.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzff
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzey zzb3;
                zzb3 = zzfb.zzb((zzpc) zzpjVar, zzcnVar);
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
