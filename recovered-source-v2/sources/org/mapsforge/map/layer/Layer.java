package org.mapsforge.map.layer;

import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.model.DisplayModel;

/* loaded from: classes5.dex */
public abstract class Layer {
    private Redrawer assignedRedrawer;
    protected DisplayModel displayModel;
    private boolean visible = true;

    public abstract void draw(BoundingBox boundingBox, byte b, Canvas canvas, Point point);

    public LatLong getPosition() {
        return null;
    }

    protected void onAdd() {
    }

    public void onDestroy() {
    }

    public boolean onLongPress(LatLong latLong, Point point, Point point2) {
        return false;
    }

    protected void onRemove() {
    }

    public boolean onScroll(float f, float f2, float f3, float f4) {
        return false;
    }

    public boolean onTap(LatLong latLong, Point point, Point point2) {
        return false;
    }

    public final boolean isVisible() {
        return this.visible;
    }

    public final synchronized void requestRedraw() {
        Redrawer redrawer = this.assignedRedrawer;
        if (redrawer != null) {
            redrawer.redrawLayers();
        }
    }

    public synchronized DisplayModel getDisplayModel() {
        return this.displayModel;
    }

    public synchronized void setDisplayModel(DisplayModel displayModel) {
        this.displayModel = displayModel;
    }

    public final void setVisible(boolean z) {
        setVisible(z, true);
    }

    public void setVisible(boolean z, boolean z2) {
        this.visible = z;
        if (z2) {
            requestRedraw();
        }
    }

    final synchronized void assign(Redrawer redrawer) {
        if (this.assignedRedrawer != null) {
            throw new IllegalStateException("layer already assigned");
        }
        this.assignedRedrawer = redrawer;
        onAdd();
    }

    final synchronized void unassign() {
        if (this.assignedRedrawer == null) {
            throw new IllegalStateException("layer is not assigned");
        }
        this.assignedRedrawer = null;
        onRemove();
    }
}
