package com.google.android.gms.internal.p002firebaseauthapi;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mapsforge.core.model.Tag;

/* compiled from: com.google.firebase:firebase-auth@@23.1.0 */
/* loaded from: classes3.dex */
public abstract class zzap<K, V> implements Serializable, Map<K, V> {

    @CheckForNull
    private transient zzau<Map.Entry<K, V>> zza;

    @CheckForNull
    private transient zzau<K> zzb;

    @CheckForNull
    private transient zzak<V> zzc;

    @Override // java.util.Map
    @CheckForNull
    public abstract V get(@CheckForNull Object obj);

    @Override // java.util.Map
    public int hashCode() {
        return zzaz.zza((zzau) entrySet());
    }

    abstract zzak<V> zza();

    abstract zzau<Map.Entry<K, V>> zzb();

    abstract zzau<K> zzc();

    abstract boolean zzd();

    public static <K, V> zzap<K, V> zza(Map<? extends K, ? extends V> map) {
        if ((map instanceof zzap) && !(map instanceof SortedMap)) {
            zzap<K, V> zzapVar = (zzap) map;
            zzapVar.zzd();
            return zzapVar;
        }
        Set<Map.Entry<? extends K, ? extends V>> entrySet = map.entrySet();
        zzas zzasVar = new zzas(entrySet instanceof Collection ? entrySet.size() : 4);
        zzasVar.zza(entrySet);
        return zzasVar.zza();
    }

    @Override // java.util.Map
    @CheckForNull
    public final V getOrDefault(@CheckForNull Object obj, @CheckForNull V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CheckForNull
    @Deprecated
    public final V remove(@CheckForNull Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        int size = size();
        zzai.zza(size, "size");
        StringBuilder append = new StringBuilder((int) Math.min(size << 3, 1073741824L)).append(AbstractJsonLexerKt.BEGIN_OBJ);
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                append.append(", ");
            }
            append.append(entry.getKey()).append(Tag.KEY_VALUE_SEPARATOR).append(entry.getValue());
            z = false;
        }
        return append.append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        zzak<V> zzakVar = this.zzc;
        if (zzakVar != null) {
            return zzakVar;
        }
        zzak<V> zza = zza();
        this.zzc = zza;
        return zza;
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        zzau<Map.Entry<K, V>> zzauVar = this.zza;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<Map.Entry<K, V>> zzb = zzb();
        this.zza = zzb;
        return zzb;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        zzau<K> zzauVar = this.zzb;
        if (zzauVar != null) {
            return zzauVar;
        }
        zzau<K> zzc = zzc();
        this.zzb = zzc;
        return zzc;
    }

    zzap() {
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@CheckForNull Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@CheckForNull Object obj) {
        return ((zzak) values()).contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(@CheckForNull Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }
}
