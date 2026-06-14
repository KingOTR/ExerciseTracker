package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.Map;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
final class zzakj<K> implements Map.Entry<K, Object> {
    private Map.Entry<K, zzakg> zza;

    public final zzakg zza() {
        return this.zza.getValue();
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.zza.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.zza.getValue() == null) {
            return null;
        }
        throw new NoSuchMethodError();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof zzalc)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        return this.zza.getValue().zza((zzalc) obj);
    }

    private zzakj(Map.Entry<K, zzakg> entry) {
        this.zza = entry;
    }
}
