package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzny {
    private static final zzny zza = new zzny();
    private static final zzob zzb = new zzob();
    private final AtomicReference<zznl> zzc = new AtomicReference<>();

    public final zznl zza() {
        zznl zznlVar = this.zzc.get();
        return zznlVar == null ? zzb : zznlVar;
    }

    public static zzny zzb() {
        return zza;
    }
}
