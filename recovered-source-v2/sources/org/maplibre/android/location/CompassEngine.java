package org.maplibre.android.location;

/* loaded from: classes5.dex */
public interface CompassEngine {
    void addCompassListener(CompassListener compassListener);

    int getLastAccuracySensorStatus();

    float getLastHeading();

    void removeCompassListener(CompassListener compassListener);
}
