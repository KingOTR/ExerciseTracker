package org.maplibre.turf;

import java.util.ArrayList;
import java.util.List;
import org.maplibre.geojson.Feature;
import org.maplibre.geojson.FeatureCollection;
import org.maplibre.geojson.MultiPolygon;
import org.maplibre.geojson.Point;
import org.maplibre.geojson.Polygon;

/* loaded from: classes5.dex */
public final class TurfJoins {
    private TurfJoins() {
    }

    public static boolean inside(Point point, Polygon polygon) {
        List<List<Point>> coordinates = polygon.coordinates();
        ArrayList arrayList = new ArrayList();
        arrayList.add(coordinates);
        return inside(point, MultiPolygon.fromLngLats(arrayList));
    }

    public static boolean inside(Point point, MultiPolygon multiPolygon) {
        List<List<List<Point>>> coordinates = multiPolygon.coordinates();
        boolean z = false;
        for (int i = 0; i < coordinates.size() && !z; i++) {
            if (inRing(point, coordinates.get(i).get(0))) {
                boolean z2 = false;
                for (int i2 = 1; i2 < coordinates.get(i).size() && !z2; i2++) {
                    if (inRing(point, coordinates.get(i).get(i2))) {
                        z2 = true;
                    }
                }
                if (!z2) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static FeatureCollection pointsWithinPolygon(FeatureCollection featureCollection, FeatureCollection featureCollection2) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < featureCollection2.features().size(); i++) {
            for (int i2 = 0; i2 < featureCollection.features().size(); i2++) {
                Point point = (Point) featureCollection.features().get(i2).geometry();
                if (inside(point, (Polygon) featureCollection2.features().get(i).geometry())) {
                    arrayList.add(Feature.fromGeometry(point));
                }
            }
        }
        return FeatureCollection.fromFeatures(arrayList);
    }

    private static boolean inRing(Point point, List<Point> list) {
        int size = list.size() - 1;
        boolean z = false;
        for (int i = 0; i < list.size(); i++) {
            double longitude = list.get(i).longitude();
            double latitude = list.get(i).latitude();
            double longitude2 = list.get(size).longitude();
            double latitude2 = list.get(size).latitude();
            if ((latitude > point.latitude()) != (latitude2 > point.latitude()) && point.longitude() < (((longitude2 - longitude) * (point.latitude() - latitude)) / (latitude2 - latitude)) + longitude) {
                z = !z;
            }
            size = i;
        }
        return z;
    }
}
