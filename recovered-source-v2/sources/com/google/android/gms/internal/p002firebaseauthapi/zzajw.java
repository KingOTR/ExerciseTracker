package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.internal.p002firebaseauthapi.zzajy;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzajw implements zzald {
    private static final zzajw zza = new zzajw();

    public static zzajw zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final zzala zza(Class<?> cls) {
        if (!zzajy.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (zzala) zzajy.zza(cls.asSubclass(zzajy.class)).zza(zzajy.zzf.zzc, (Object) null, (Object) null);
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }

    private zzajw() {
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzald
    public final boolean zzb(Class<?> cls) {
        return zzajy.class.isAssignableFrom(cls);
    }
}
