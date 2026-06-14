package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zznj {
    private HashMap<String, String> zza = new HashMap<>();

    public final zzng zza() {
        if (this.zza == null) {
            throw new IllegalStateException("cannot call build() twice");
        }
        zzng zzngVar = new zzng(Collections.unmodifiableMap(this.zza));
        this.zza = null;
        return zzngVar;
    }
}
