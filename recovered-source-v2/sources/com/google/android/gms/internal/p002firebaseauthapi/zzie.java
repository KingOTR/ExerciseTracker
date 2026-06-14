package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzga;
import com.google.android.gms.internal.p002firebaseauthapi.zzvq;
import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzie {
    private static final zzzc zza;
    private static final zzon<zzga, zzpf> zzb;
    private static final zzoj<zzpf> zzc;
    private static final zzmw<zzfv, zzpc> zzd;
    private static final zzms<zzpc> zze;

    /* JADX INFO: Access modifiers changed from: private */
    public static zzfv zzb(zzpc zzpcVar, @Nullable zzcn zzcnVar) throws GeneralSecurityException {
        if (!zzpcVar.zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseKey");
        }
        try {
            zzxh zza2 = zzxh.zza(zzpcVar.zzd(), zzajk.zza());
            if (zza2.zza() == 0) {
                return zzfv.zza(zza(zzpcVar.zzb()), zzze.zza(zza2.zzd().zzd(), zzcn.zza(zzcnVar)), zzpcVar.zze());
            }
            throw new GeneralSecurityException("Only version 0 keys are accepted");
        } catch (zzakf unused) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Key failed");
        }
    }

    private static zzga.zza zza(zzws zzwsVar) throws GeneralSecurityException {
        int i = zzih.zza[zzwsVar.ordinal()];
        if (i == 1) {
            return zzga.zza.zza;
        }
        if (i == 2 || i == 3) {
            return zzga.zza.zzb;
        }
        if (i == 4) {
            return zzga.zza.zzc;
        }
        throw new GeneralSecurityException("Unable to parse OutputPrefixType: " + zzwsVar.zza());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzga zzb(zzpf zzpfVar) throws GeneralSecurityException {
        if (!zzpfVar.zza().zzf().equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
            throw new IllegalArgumentException("Wrong type URL in call to XChaCha20Poly1305ProtoSerialization.parseParameters: " + zzpfVar.zza().zzf());
        }
        try {
            if (zzxk.zza(zzpfVar.zza().zze(), zzajk.zza()).zza() != 0) {
                throw new GeneralSecurityException("Only version 0 parameters are accepted");
            }
            return zzga.zza(zza(zzpfVar.zza().zzd()));
        } catch (zzakf e) {
            throw new GeneralSecurityException("Parsing XChaCha20Poly1305Parameters failed: ", e);
        }
    }

    private static zzws zza(zzga.zza zzaVar) throws GeneralSecurityException {
        if (zzga.zza.zza.equals(zzaVar)) {
            return zzws.TINK;
        }
        if (zzga.zza.zzb.equals(zzaVar)) {
            return zzws.CRUNCHY;
        }
        if (zzga.zza.zzc.equals(zzaVar)) {
            return zzws.RAW;
        }
        throw new GeneralSecurityException("Unable to serialize variant: " + String.valueOf(zzaVar));
    }

    static {
        zzzc zzb2 = zzpr.zzb("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza = zzb2;
        zzb = zzon.zza(new zzop() { // from class: com.google.android.gms.internal.firebase-auth-api.zzid
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzop
            public final zzpj zza(zzch zzchVar) {
                zzpf zzb3;
                zzb3 = zzpf.zzb((zzvu) ((zzajy) zzvu.zza().zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key").zza(zzxk.zzc().a_()).zza(zzie.zza(((zzga) zzchVar).zzb())).zze()));
                return zzb3;
            }
        }, zzga.class, zzpf.class);
        zzc = zzoj.zza(new zzol() { // from class: com.google.android.gms.internal.firebase-auth-api.zzig
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzol
            public final zzch zza(zzpj zzpjVar) {
                zzga zzb3;
                zzb3 = zzie.zzb((zzpf) zzpjVar);
                return zzb3;
            }
        }, zzb2, zzpf.class);
        zzd = zzmw.zza(new zzmy() { // from class: com.google.android.gms.internal.firebase-auth-api.zzif
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmy
            public final zzpj zza(zzbp zzbpVar, zzcn zzcnVar) {
                zzpc zza2;
                zza2 = zzpc.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key", ((zzxh) ((zzajy) zzxh.zzb().zza(zzaip.zza(r1.zzd().zza(zzcn.zza(zzcnVar)))).zze())).a_(), zzvq.zzb.SYMMETRIC, zzie.zza(r1.zzb().zzb()), ((zzfv) zzbpVar).zza());
                return zza2;
            }
        }, zzfv.class, zzpc.class);
        zze = zzms.zza(new zzmu() { // from class: com.google.android.gms.internal.firebase-auth-api.zzii
            @Override // com.google.android.gms.internal.p002firebaseauthapi.zzmu
            public final zzbp zza(zzpj zzpjVar, zzcn zzcnVar) {
                zzfv zzb3;
                zzb3 = zzie.zzb((zzpc) zzpjVar, zzcnVar);
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
