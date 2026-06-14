package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzalr {
    private static final zzalr zza = new zzalr();
    private final ConcurrentMap<Class<?>, zzalv<?>> zzc = new ConcurrentHashMap();
    private final zzalu zzb = new zzakq();

    public static zzalr zza() {
        return zza;
    }

    public final <T> zzalv<T> zza(Class<T> cls) {
        zzakb.zza(cls, "messageType");
        zzalv<T> zzalvVar = (zzalv) this.zzc.get(cls);
        if (zzalvVar != null) {
            return zzalvVar;
        }
        zzalv<T> zza2 = this.zzb.zza(cls);
        zzakb.zza(cls, "messageType");
        zzakb.zza(zza2, "schema");
        zzalv<T> zzalvVar2 = (zzalv) this.zzc.putIfAbsent(cls, zza2);
        return zzalvVar2 != null ? zzalvVar2 : zza2;
    }

    public final <T> zzalv<T> zza(T t) {
        return zza((Class) t.getClass());
    }

    private zzalr() {
    }
}
