package org.mapsforge.core.model;

/* loaded from: classes5.dex */
public class MapPosition {
    public final LatLong latLong;
    public final byte zoomLevel;

    public MapPosition(LatLong latLong, byte b) {
        if (latLong == null) {
            throw new IllegalArgumentException("latLong must not be null");
        }
        if (b < 0) {
            throw new IllegalArgumentException("zoomLevel must not be negative: " + ((int) b));
        }
        this.latLong = latLong;
        this.zoomLevel = b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapPosition)) {
            return false;
        }
        MapPosition mapPosition = (MapPosition) obj;
        return this.latLong.equals(mapPosition.latLong) && this.zoomLevel == mapPosition.zoomLevel;
    }

    public int hashCode() {
        return ((this.latLong.hashCode() + 31) * 31) + this.zoomLevel;
    }

    public String toString() {
        return "latLong=" + this.latLong + ", zoomLevel=" + ((int) this.zoomLevel);
    }
}
