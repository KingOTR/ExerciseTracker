package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzagd {
    private List<zzage> zza;

    public final List<zzage> zza() {
        return this.zza;
    }

    public zzagd() {
        this.zza = new ArrayList();
    }

    public zzagd(List<zzage> list) {
        this.zza = Collections.unmodifiableList(list);
    }
}
