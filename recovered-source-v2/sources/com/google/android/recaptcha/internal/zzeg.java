package com.google.android.recaptcha.internal;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzeg {
    private final zzhb zza;

    public zzeg() {
        this(1);
    }

    public final List zwk() {
        return zza();
    }

    public final List zza() {
        return CollectionsKt.toList(this.zza);
    }

    public final boolean zzb(List list) {
        this.zza.add(list);
        return true;
    }

    public zzeg(int i) {
        this.zza = zzhb.zza(i);
    }
}
