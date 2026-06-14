package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zznn {
    private final zzng zza;
    private final List<zznp> zzb;

    @Nullable
    private final Integer zzc;

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String toString() {
        return String.format("(annotations=%s, entries=%s, primaryKeyId=%s)", this.zza, this.zzb, this.zzc);
    }

    private zznn(zzng zzngVar, List<zznp> list, Integer num) {
        this.zza = zzngVar;
        this.zzb = list;
        this.zzc = num;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zznn)) {
            return false;
        }
        zznn zznnVar = (zznn) obj;
        return this.zza.equals(zznnVar.zza) && this.zzb.equals(zznnVar.zzb) && Objects.equals(this.zzc, zznnVar.zzc);
    }
}
