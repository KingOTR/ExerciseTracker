package org.mapsforge.map.util;

import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.util.MercatorProjection;

/* loaded from: classes5.dex */
public final class MapPositionUtil {
    public static BoundingBox getBoundingBox(MapPosition mapPosition, Dimension dimension, int i) {
        long mapSize = MercatorProjection.getMapSize(mapPosition.zoomLevel, i);
        double longitudeToPixelX = MercatorProjection.longitudeToPixelX(mapPosition.latLong.longitude, mapSize);
        double latitudeToPixelY = MercatorProjection.latitudeToPixelY(mapPosition.latLong.latitude, mapSize);
        int i2 = dimension.width / 2;
        double d = i2;
        double d2 = dimension.height / 2;
        double d3 = mapSize;
        return new BoundingBox(MercatorProjection.pixelYToLatitude(Math.min(d3, latitudeToPixelY + d2), mapSize), MercatorProjection.pixelXToLongitude(Math.max(0.0d, longitudeToPixelX - d), mapSize), MercatorProjection.pixelYToLatitude(Math.max(0.0d, latitudeToPixelY - d2), mapSize), MercatorProjection.pixelXToLongitude(Math.min(d3, longitudeToPixelX + d), mapSize));
    }

    public static Point getTopLeftPoint(MapPosition mapPosition, Dimension dimension, int i) {
        LatLong latLong = mapPosition.latLong;
        int i2 = dimension.width / 2;
        int i3 = dimension.height / 2;
        long mapSize = MercatorProjection.getMapSize(mapPosition.zoomLevel, i);
        return new Point(Math.round(MercatorProjection.longitudeToPixelX(latLong.longitude, mapSize)) - i2, Math.round(MercatorProjection.latitudeToPixelY(latLong.latitude, mapSize)) - i3);
    }

    private MapPositionUtil() {
        throw new IllegalStateException();
    }
}
