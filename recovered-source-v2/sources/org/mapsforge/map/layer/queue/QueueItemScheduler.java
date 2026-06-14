package org.mapsforge.map.layer.queue;

import java.util.Collection;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.MapPosition;
import org.mapsforge.core.model.Tile;
import org.mapsforge.core.util.MercatorProjection;

/* loaded from: classes5.dex */
final class QueueItemScheduler {
    static final double PENALTY_PER_ZOOM_LEVEL = 10.0d;

    static <T extends Job> void schedule(Collection<QueueItem<T>> collection, MapPosition mapPosition, int i) {
        for (QueueItem<T> queueItem : collection) {
            queueItem.setPriority(calculatePriority(queueItem.object.tile, mapPosition, i));
        }
    }

    private static double calculatePriority(Tile tile, MapPosition mapPosition, int i) {
        double tileYToLatitude = MercatorProjection.tileYToLatitude(tile.tileY, tile.zoomLevel);
        double tileXToLongitude = MercatorProjection.tileXToLongitude(tile.tileX, tile.zoomLevel);
        long mapSize = MercatorProjection.getMapSize(mapPosition.zoomLevel, i);
        double d = i / 2;
        double longitudeToPixelX = MercatorProjection.longitudeToPixelX(tileXToLongitude, mapSize) + d;
        double latitudeToPixelY = MercatorProjection.latitudeToPixelY(tileYToLatitude, mapSize) + d;
        LatLong latLong = mapPosition.latLong;
        return Math.hypot(longitudeToPixelX - MercatorProjection.longitudeToPixelX(latLong.longitude, mapSize), latitudeToPixelY - MercatorProjection.latitudeToPixelY(latLong.latitude, mapSize)) + (i * PENALTY_PER_ZOOM_LEVEL * Math.abs(tile.zoomLevel - mapPosition.zoomLevel));
    }

    private QueueItemScheduler() {
        throw new IllegalStateException();
    }
}
