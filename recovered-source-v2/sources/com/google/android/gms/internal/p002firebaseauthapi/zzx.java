package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public final class zzx {
    private final zzh zza;
    private final zzad zzb;
    private final int zzc;

    public static zzx zza(char c) {
        zzj zzjVar = new zzj(c);
        zzy.zza(zzjVar);
        return new zzx(new zzaa(zzjVar));
    }

    public static zzx zza(String str) {
        zzn zza = zzt.zza(str);
        if (zza.zza("").zzc()) {
            throw new IllegalArgumentException(zzag.zza("The pattern may not match the empty string: %s", zza));
        }
        return new zzx(new zzac(zza));
    }

    public final List<String> zza(CharSequence charSequence) {
        zzy.zza(charSequence);
        Iterator<String> zza = this.zzb.zza(this, charSequence);
        ArrayList arrayList = new ArrayList();
        while (zza.hasNext()) {
            arrayList.add(zza.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private zzx(zzad zzadVar) {
        this(zzadVar, false, zzl.zza, Integer.MAX_VALUE);
    }

    private zzx(zzad zzadVar, boolean z, zzh zzhVar, int i) {
        this.zzb = zzadVar;
        this.zza = zzhVar;
        this.zzc = Integer.MAX_VALUE;
    }
}
