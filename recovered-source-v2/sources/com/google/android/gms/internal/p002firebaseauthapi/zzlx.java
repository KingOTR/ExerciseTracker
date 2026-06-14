package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzlx implements zzlk {
    private final zzya zza;
    private final zzle zzb;

    static zzlx zza(zzya zzyaVar) throws GeneralSecurityException {
        int i = zzlw.zza[zzyaVar.ordinal()];
        if (i == 1) {
            return new zzlx(new zzle("HmacSha256"), zzya.NIST_P256);
        }
        if (i == 2) {
            return new zzlx(new zzle("HmacSha384"), zzya.NIST_P384);
        }
        if (i == 3) {
            return new zzlx(new zzle("HmacSha512"), zzya.NIST_P521);
        }
        throw new GeneralSecurityException("invalid curve type: " + String.valueOf(zzyaVar));
    }

    private zzlx(zzle zzleVar, zzya zzyaVar) {
        this.zzb = zzleVar;
        this.zza = zzyaVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza(byte[] bArr, zzln zzlnVar) throws GeneralSecurityException {
        byte[] zza = zzyb.zza(zzyb.zza(this.zza, zzlnVar.zza().zzb()), zzyb.zza(this.zza, zzyd.UNCOMPRESSED, bArr));
        byte[] zza2 = zzxv.zza(bArr, zzlnVar.zzb().zzb());
        byte[] zza3 = zzlq.zza(zza());
        zzle zzleVar = this.zzb;
        return zzleVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzleVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza() throws GeneralSecurityException {
        int i = zzlw.zza[this.zza.ordinal()];
        if (i == 1) {
            return zzlq.zzc;
        }
        if (i == 2) {
            return zzlq.zzd;
        }
        if (i == 3) {
            return zzlq.zze;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
