package org.mapsforge.map.layer.queue;

import org.mapsforge.map.layer.queue.Job;

/* loaded from: classes5.dex */
class QueueItem<T extends Job> {
    final T object;
    private double priority;

    QueueItem(T t) {
        this.object = t;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof QueueItem) {
            return this.object.equals(((QueueItem) obj).object);
        }
        return false;
    }

    public int hashCode() {
        return this.object.hashCode();
    }

    double getPriority() {
        return this.priority;
    }

    void setPriority(double d) {
        if (d < 0.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("invalid priority: " + d);
        }
        this.priority = d;
    }
}
