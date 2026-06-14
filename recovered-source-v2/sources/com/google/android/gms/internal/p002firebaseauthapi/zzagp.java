package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzagp {
    private final String zza;
    private final zzaia zzb;

    public final zzaia zza() {
        return this.zzb;
    }

    public final String zzb() {
        return this.zza;
    }

    public zzagp(String str, zzaia zzaiaVar) {
        this.zza = Preconditions.checkNotEmpty(str);
        this.zzb = (zzaia) Preconditions.checkNotNull(zzaiaVar);
    }
}
