package org.mapsforge.map.reader;

import org.mapsforge.core.model.Tile;
import org.mapsforge.map.reader.header.SubFileParameter;

/* loaded from: classes5.dex */
class QueryParameters {
    long fromBaseTileX;
    long fromBaseTileY;
    long fromBlockX;
    long fromBlockY;
    int queryTileBitmask;
    int queryZoomLevel;
    long toBaseTileX;
    long toBaseTileY;
    long toBlockX;
    long toBlockY;
    boolean useTileBitmask;

    QueryParameters() {
    }

    public void calculateBaseTiles(Tile tile, SubFileParameter subFileParameter) {
        if (tile.zoomLevel < subFileParameter.baseZoomLevel) {
            int i = subFileParameter.baseZoomLevel - tile.zoomLevel;
            this.fromBaseTileX = tile.tileX << i;
            long j = tile.tileY << i;
            this.fromBaseTileY = j;
            long j2 = 1 << i;
            this.toBaseTileX = (this.fromBaseTileX + j2) - 1;
            this.toBaseTileY = (j + j2) - 1;
            this.useTileBitmask = false;
            return;
        }
        if (tile.zoomLevel > subFileParameter.baseZoomLevel) {
            int i2 = tile.zoomLevel - subFileParameter.baseZoomLevel;
            this.fromBaseTileX = tile.tileX >>> i2;
            long j3 = tile.tileY >>> i2;
            this.fromBaseTileY = j3;
            this.toBaseTileX = this.fromBaseTileX;
            this.toBaseTileY = j3;
            this.useTileBitmask = true;
            this.queryTileBitmask = QueryCalculations.calculateTileBitmask(tile, i2);
            return;
        }
        this.fromBaseTileX = tile.tileX;
        long j4 = tile.tileY;
        this.fromBaseTileY = j4;
        this.toBaseTileX = this.fromBaseTileX;
        this.toBaseTileY = j4;
        this.useTileBitmask = false;
    }

    public void calculateBaseTiles(Tile tile, Tile tile2, SubFileParameter subFileParameter) {
        if (tile.zoomLevel < subFileParameter.baseZoomLevel) {
            int i = subFileParameter.baseZoomLevel - tile.zoomLevel;
            this.fromBaseTileX = tile.tileX << i;
            this.fromBaseTileY = tile.tileY << i;
            int i2 = 1 << i;
            this.toBaseTileX = ((tile2.tileX << i) + i2) - 1;
            this.toBaseTileY = ((tile2.tileY << i) + i2) - 1;
            this.useTileBitmask = false;
            return;
        }
        if (tile.zoomLevel > subFileParameter.baseZoomLevel) {
            int i3 = tile.zoomLevel - subFileParameter.baseZoomLevel;
            this.fromBaseTileX = tile.tileX >>> i3;
            this.fromBaseTileY = tile.tileY >>> i3;
            this.toBaseTileX = tile2.tileX >>> i3;
            this.toBaseTileY = tile2.tileY >>> i3;
            this.useTileBitmask = true;
            this.queryTileBitmask = QueryCalculations.calculateTileBitmask(tile, tile2, i3);
            return;
        }
        this.fromBaseTileX = tile.tileX;
        this.fromBaseTileY = tile.tileY;
        this.toBaseTileX = tile2.tileX;
        this.toBaseTileY = tile2.tileY;
        this.useTileBitmask = false;
    }

    public void calculateBlocks(SubFileParameter subFileParameter) {
        this.fromBlockX = Math.max(this.fromBaseTileX - subFileParameter.boundaryTileLeft, 0L);
        this.fromBlockY = Math.max(this.fromBaseTileY - subFileParameter.boundaryTileTop, 0L);
        this.toBlockX = Math.min(this.toBaseTileX - subFileParameter.boundaryTileLeft, subFileParameter.blocksWidth - 1);
        this.toBlockY = Math.min(this.toBaseTileY - subFileParameter.boundaryTileTop, subFileParameter.blocksHeight - 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QueryParameters)) {
            return false;
        }
        QueryParameters queryParameters = (QueryParameters) obj;
        return this.fromBaseTileX == queryParameters.fromBaseTileX && this.fromBlockX == queryParameters.fromBlockX && this.fromBaseTileY == queryParameters.fromBaseTileY && this.fromBlockY == queryParameters.fromBlockY && this.queryTileBitmask == queryParameters.queryTileBitmask && this.queryZoomLevel == queryParameters.queryZoomLevel && this.toBaseTileX == queryParameters.toBaseTileX && this.toBaseTileY == queryParameters.toBaseTileY && this.toBlockX == queryParameters.toBlockX && this.toBlockY == queryParameters.toBlockY && this.useTileBitmask == queryParameters.useTileBitmask;
    }

    public int hashCode() {
        long j = this.fromBaseTileX;
        long j2 = this.fromBaseTileY;
        int i = (((217 + ((int) (j ^ (j >>> 16)))) * 31) + ((int) (j2 ^ (j2 >>> 16)))) * 31;
        long j3 = this.toBaseTileX;
        int i2 = (i + ((int) (j3 ^ (j3 >>> 16)))) * 31;
        long j4 = this.toBaseTileY;
        int i3 = (i2 + ((int) (j4 ^ (j4 >>> 16)))) * 31;
        long j5 = this.fromBlockX;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 16)))) * 31;
        long j6 = this.fromBlockY;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 16)))) * 31;
        long j7 = this.toBlockX;
        int i6 = (i5 + ((int) (j7 ^ (j7 >>> 16)))) * 31;
        long j8 = this.toBlockY;
        return ((((i6 + ((int) (j8 ^ (j8 >>> 16)))) * 31) + this.queryZoomLevel) * 31) + this.queryTileBitmask;
    }
}
