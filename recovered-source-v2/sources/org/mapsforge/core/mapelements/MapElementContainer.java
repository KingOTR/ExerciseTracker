package org.mapsforge.core.mapelements;

import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.Filter;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;

/* loaded from: classes5.dex */
public abstract class MapElementContainer implements Comparable<MapElementContainer> {
    protected Rectangle boundary;
    protected Rectangle boundaryAbsolute;
    protected Display display;
    protected final int priority;
    protected final Point xy;

    public abstract void draw(Canvas canvas, Point point, Matrix matrix, Filter filter);

    protected MapElementContainer(Point point, Display display, int i) {
        this.xy = point;
        this.display = display;
        this.priority = i;
    }

    @Override // java.lang.Comparable
    public int compareTo(MapElementContainer mapElementContainer) {
        int i = this.priority;
        int i2 = mapElementContainer.priority;
        if (i < i2) {
            return -1;
        }
        return i > i2 ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapElementContainer)) {
            return false;
        }
        MapElementContainer mapElementContainer = (MapElementContainer) obj;
        return this.priority == mapElementContainer.priority && this.xy.equals(mapElementContainer.xy);
    }

    protected Rectangle getBoundaryAbsolute() {
        if (this.boundaryAbsolute == null) {
            this.boundaryAbsolute = this.boundary.shift(this.xy);
        }
        return this.boundaryAbsolute;
    }

    public boolean intersects(Rectangle rectangle) {
        return getBoundaryAbsolute().intersects(rectangle);
    }

    public boolean clashesWith(MapElementContainer mapElementContainer) {
        if (Display.ALWAYS == this.display || Display.ALWAYS == mapElementContainer.display) {
            return false;
        }
        return getBoundaryAbsolute().intersects(mapElementContainer.getBoundaryAbsolute());
    }

    public int hashCode() {
        return ((217 + this.xy.hashCode()) * 31) + this.priority;
    }

    public Point getPoint() {
        return this.xy;
    }

    public int getPriority() {
        return this.priority;
    }

    public String toString() {
        return "xy=" + this.xy + ", priority=" + this.priority;
    }
}
