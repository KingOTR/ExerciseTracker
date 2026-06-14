package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcn {
    private static final zzcn zza = new zzcn();

    static zzcn zza() {
        return zza;
    }

    public static zzcn zza(@Nullable zzcn zzcnVar) throws GeneralSecurityException {
        if (zzcnVar != null) {
            return zzcnVar;
        }
        throw new GeneralSecurityException("SecretKeyAccess is required");
    }

    private zzcn() {
    }
}
