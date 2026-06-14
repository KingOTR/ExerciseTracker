package org.mapsforge.map.controller;

import org.mapsforge.map.model.Model;
import org.mapsforge.map.model.common.Observer;
import org.mapsforge.map.view.MapView;

/* loaded from: classes5.dex */
public final class MapViewController implements Observer {
    private final MapView mapView;

    public static MapViewController create(MapView mapView, Model model) {
        MapViewController mapViewController = new MapViewController(mapView);
        model.mapViewPosition.addObserver(mapViewController);
        return mapViewController;
    }

    private MapViewController(MapView mapView) {
        this.mapView = mapView;
    }

    @Override // org.mapsforge.map.model.common.Observer
    public void onChange() {
        this.mapView.repaint();
    }
}
