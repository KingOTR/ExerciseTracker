package org.osmdroid.views.overlay.mylocation;

import android.location.Location;

/* loaded from: classes5.dex */
public interface IMyLocationProvider {
    void destroy();

    Location getLastKnownLocation();

    boolean startLocationProvider(IMyLocationConsumer iMyLocationConsumer);

    void stopLocationProvider();
}
