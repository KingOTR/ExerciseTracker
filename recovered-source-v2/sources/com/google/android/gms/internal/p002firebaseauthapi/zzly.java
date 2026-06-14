package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzly implements zzlk {
    private final zzle zza;

    zzly(zzle zzleVar) {
        this.zza = zzleVar;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza(byte[] bArr, zzln zzlnVar) throws GeneralSecurityException {
        byte[] zza = zzza.zza(zzlnVar.zza().zzb(), bArr);
        byte[] zza2 = zzxv.zza(bArr, zzlnVar.zzb().zzb());
        byte[] zza3 = zzlq.zza(zzlq.zzb);
        zzle zzleVar = this.zza;
        return zzleVar.zza(null, zza, "eae_prk", zza2, "shared_secret", zza3, zzleVar.zza());
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzlk
    public final byte[] zza() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzb(), zzlq.zzf)) {
            return zzlq.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
