package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzbj {
    public static final byte[] zza = new byte[0];

    public static byte[] zza(zzwa.zzb zzbVar) throws GeneralSecurityException {
        int i = zzbm.zza[zzbVar.zzf().ordinal()];
        if (i == 1 || i == 2) {
            return zzog.zza(zzbVar.zza()).zzb();
        }
        if (i == 3) {
            return zzog.zzb(zzbVar.zza()).zzb();
        }
        if (i == 4) {
            return zza;
        }
        throw new GeneralSecurityException("unknown output prefix type");
    }
}
