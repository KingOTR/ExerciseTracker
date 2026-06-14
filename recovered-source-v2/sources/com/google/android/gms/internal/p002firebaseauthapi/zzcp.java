package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcp {
    public static zzch zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzvu zza = zzvu.zza(bArr, zzajk.zza());
            zzof zza2 = zzof.zza();
            zzpf zza3 = zzpf.zza(zza);
            return !zza2.zzc(zza3) ? new zzne(zza3) : zza2.zza((zzof) zza3);
        } catch (IOException e) {
            throw new GeneralSecurityException("Failed to parse proto", e);
        }
    }

    public static byte[] zza(zzch zzchVar) throws GeneralSecurityException {
        if (zzchVar instanceof zzne) {
            return ((zzne) zzchVar).zzb().zza().zzk();
        }
        return ((zzpf) zzof.zza().zza((zzof) zzchVar, zzpf.class)).zza().zzk();
    }
}
