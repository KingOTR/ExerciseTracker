package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzwa;
import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzcc {
    private final zzwa.zza zza;

    public final synchronized zzbt zza() throws GeneralSecurityException {
        return zzbt.zza((zzwa) ((zzajy) this.zza.zze()));
    }

    public static zzcc zza(zzbt zzbtVar) {
        return new zzcc(zzbtVar.zzb().zzn());
    }

    private zzcc(zzwa.zza zzaVar) {
        this.zza = zzaVar;
    }
}
