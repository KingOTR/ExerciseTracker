package org.mapsforge.map.model;

import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.map.model.common.Observable;

/* loaded from: classes5.dex */
public class FrameBufferModel extends Observable {
    private Dimension dimension;
    private MapPosition mapPosition;
    private double overdrawFactor = 1.2d;

    public synchronized Dimension getDimension() {
        return this.dimension;
    }

    public synchronized MapPosition getMapPosition() {
        return this.mapPosition;
    }

    public synchronized double getOverdrawFactor() {
        return this.overdrawFactor;
    }

    public void setDimension(Dimension dimension) {
        synchronized (this) {
            this.dimension = dimension;
        }
        notifyObservers();
    }

    public void setMapPosition(MapPosition mapPosition) {
        synchronized (this) {
            this.mapPosition = mapPosition;
        }
        notifyObservers();
    }

    public void setOverdrawFactor(double d) {
        if (d <= 0.0d) {
            throw new IllegalArgumentException("overdrawFactor must be > 0: " + d);
        }
        synchronized (this) {
            this.overdrawFactor = d;
        }
        notifyObservers();
    }
}
