package org.maplibre.android.location;

import org.maplibre.geojson.Feature;
import org.maplibre.geojson.Point;

/* loaded from: classes5.dex */
class LayerFeatureProvider {
    LayerFeatureProvider() {
    }

    Feature generateLocationFeature(Feature feature, boolean z) {
        if (feature != null) {
            return feature;
        }
        Feature fromGeometry = Feature.fromGeometry(Point.fromLngLat(0.0d, 0.0d));
        fromGeometry.addNumberProperty("mapbox-property-gps-bearing", Float.valueOf(0.0f));
        fromGeometry.addNumberProperty("mapbox-property-compass-bearing", Float.valueOf(0.0f));
        fromGeometry.addBooleanProperty("mapbox-property-location-stale", Boolean.valueOf(z));
        return fromGeometry;
    }
}
