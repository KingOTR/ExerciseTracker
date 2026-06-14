package org.mapsforge.core.util;

import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class LRUCache<K, V> extends LinkedHashMap<K, V> {
    private static final float LOAD_FACTOR = 0.6f;
    private static final long serialVersionUID = 1;
    public final int capacity;

    private static int calculateInitialCapacity(int i) {
        if (i >= 0) {
            return ((int) (i / LOAD_FACTOR)) + 2;
        }
        throw new IllegalArgumentException("capacity must not be negative: " + i);
    }

    public LRUCache(int i) {
        super(calculateInitialCapacity(i), LOAD_FACTOR, true);
        this.capacity = i;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> entry) {
        return size() > this.capacity;
    }
}
