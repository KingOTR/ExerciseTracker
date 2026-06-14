package org.mapsforge.map.controller;

import org.mapsforge.map.layer.LayerManager;
import org.mapsforge.map.model.Model;
import org.mapsforge.map.model.common.Observer;

/* loaded from: classes5.dex */
public final class LayerManagerController implements Observer {
    private final LayerManager layerManager;

    public static LayerManagerController create(LayerManager layerManager, Model model) {
        LayerManagerController layerManagerController = new LayerManagerController(layerManager);
        model.mapViewDimension.addObserver(layerManagerController);
        model.mapViewPosition.addObserver(layerManagerController);
        return layerManagerController;
    }

    private LayerManagerController(LayerManager layerManager) {
        this.layerManager = layerManager;
    }

    @Override // org.mapsforge.map.model.common.Observer
    public void onChange() {
        this.layerManager.redrawLayers();
    }
}
