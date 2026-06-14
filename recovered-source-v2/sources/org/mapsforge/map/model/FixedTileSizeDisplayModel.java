package org.mapsforge.map.model;

/* loaded from: classes5.dex */
public class FixedTileSizeDisplayModel extends DisplayModel {
    private final int tileSize;

    public FixedTileSizeDisplayModel(int i) {
        this.tileSize = i;
    }

    @Override // org.mapsforge.map.model.DisplayModel
    public int getTileSize() {
        return this.tileSize;
    }
}
