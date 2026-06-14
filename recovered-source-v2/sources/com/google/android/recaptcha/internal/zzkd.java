package com.google.android.recaptcha.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.recaptcha:recaptcha@@18.5.1 */
/* loaded from: classes3.dex */
public final class zzkd {
    static final zzkd zza = new zzkd(true);
    public static final /* synthetic */ int zzb = 0;
    private static volatile boolean zzc = false;
    private final Map zzd;

    zzkd() {
        this.zzd = new HashMap();
    }

    public final zzkq zza(zzlx zzlxVar, int i) {
        return (zzkq) this.zzd.get(new zzkc(zzlxVar, i));
    }

    zzkd(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
