package com.google.android.gms.internal.p002firebaseauthapi;

import java.security.GeneralSecurityException;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzpf implements zzpj {
    private final zzzc zza;
    private final zzvu zzb;

    public static zzpf zza(zzvu zzvuVar) throws GeneralSecurityException {
        return new zzpf(zzvuVar, zzpr.zza(zzvuVar.zzf()));
    }

    public static zzpf zzb(zzvu zzvuVar) {
        return new zzpf(zzvuVar, zzpr.zzb(zzvuVar.zzf()));
    }

    public final zzvu zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzpj
    public final zzzc zzc() {
        return this.zza;
    }

    private zzpf(zzvu zzvuVar, zzzc zzzcVar) {
        this.zzb = zzvuVar;
        this.zza = zzzcVar;
    }
}
