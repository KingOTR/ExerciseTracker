package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
import javax.crypto.Cipher;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzhb extends ThreadLocal<Cipher> {
    @Override // java.lang.ThreadLocal
    @Nullable
    protected final /* synthetic */ Cipher initialValue() {
        return zza();
    }

    @Nullable
    private static Cipher zza() {
        boolean zzb;
        try {
            Cipher zza = zzyf.zza.zza("ChaCha20-Poly1305");
            zzb = zzhc.zzb(zza);
            if (zzb) {
                return zza;
            }
            return null;
        } catch (GeneralSecurityException unused) {
            return null;
        }
    }

    zzhb() {
    }
}
