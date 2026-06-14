package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Objects;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzpn {
    private final Class<?> zza;
    private final Class<? extends zzpj> zzb;

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return this.zza.getSimpleName() + " with serialization type: " + this.zzb.getSimpleName();
    }

    private zzpn(Class<?> cls, Class<? extends zzpj> cls2) {
        this.zza = cls;
        this.zzb = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzpn)) {
            return false;
        }
        zzpn zzpnVar = (zzpn) obj;
        return zzpnVar.zza.equals(this.zza) && zzpnVar.zzb.equals(this.zzb);
    }
}
