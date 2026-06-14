package org.mapsforge.core.util;

import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class WorkingSetCache<K, V> extends LRUCache<K, V> {
    private static final long serialVersionUID = 1;

    public WorkingSetCache(int i) {
        super(i);
    }

    public void setWorkingSet(Set<K> set) {
        synchronized (set) {
            Iterator<K> it = set.iterator();
            while (it.hasNext()) {
                get(it.next());
            }
        }
    }
}
