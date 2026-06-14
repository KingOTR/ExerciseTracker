package org.mapsforge.map.datastore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.LatLong;
import org.mapsforge.core.model.Tile;

/* loaded from: classes5.dex */
public class MultiMapDataStore extends MapDataStore {
    private BoundingBox boundingBox;
    private final DataPolicy dataPolicy;
    private final List<MapDataStore> mapDatabases = new ArrayList();
    private LatLong startPosition;
    private byte startZoomLevel;

    public enum DataPolicy {
        RETURN_FIRST,
        RETURN_ALL,
        DEDUPLICATE
    }

    public MultiMapDataStore(DataPolicy dataPolicy) {
        this.dataPolicy = dataPolicy;
    }

    public void addMapDataStore(MapDataStore mapDataStore, boolean z, boolean z2) {
        if (this.mapDatabases.contains(mapDataStore)) {
            throw new IllegalArgumentException("Duplicate map database");
        }
        this.mapDatabases.add(mapDataStore);
        if (z) {
            this.startZoomLevel = mapDataStore.startZoomLevel().byteValue();
        }
        if (z2) {
            this.startPosition = mapDataStore.startPosition();
        }
        BoundingBox boundingBox = this.boundingBox;
        if (boundingBox == null) {
            this.boundingBox = mapDataStore.boundingBox();
        } else {
            this.boundingBox = boundingBox.extendBoundingBox(mapDataStore.boundingBox());
        }
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public BoundingBox boundingBox() {
        return this.boundingBox;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public void close() {
        Iterator<MapDataStore> it = this.mapDatabases.iterator();
        while (it.hasNext()) {
            it.next().close();
        }
    }

    /* renamed from: org.mapsforge.map.datastore.MultiMapDataStore$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy;

        static {
            int[] iArr = new int[DataPolicy.values().length];
            $SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy = iArr;
            try {
                iArr[DataPolicy.RETURN_FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[DataPolicy.RETURN_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[DataPolicy.DEDUPLICATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public long getDataTimestamp(Tile tile) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[this.dataPolicy.ordinal()];
        long j = 0;
        if (i == 1) {
            for (MapDataStore mapDataStore : this.mapDatabases) {
                if (mapDataStore.supportsTile(tile)) {
                    return mapDataStore.getDataTimestamp(tile);
                }
            }
            return 0L;
        }
        if (i == 2 || i == 3) {
            for (MapDataStore mapDataStore2 : this.mapDatabases) {
                if (mapDataStore2.supportsTile(tile)) {
                    j = Math.max(j, mapDataStore2.getDataTimestamp(tile));
                }
            }
            return j;
        }
        throw new IllegalStateException("Invalid data policy for multi map database");
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readLabels(Tile tile) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[this.dataPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return readLabels(tile, false);
            }
            if (i == 3) {
                return readLabels(tile, true);
            }
            throw new IllegalStateException("Invalid data policy for multi map database");
        }
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile)) {
                return mapDataStore.readLabels(tile);
            }
        }
        return null;
    }

    private MapReadResult readLabels(Tile tile, boolean z) {
        MapReadResult readLabels;
        MapReadResult mapReadResult = new MapReadResult();
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile) && (readLabels = mapDataStore.readLabels(tile)) != null) {
                mapReadResult.isWater &= readLabels.isWater;
                mapReadResult.add(readLabels, z);
            }
        }
        return mapReadResult;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readLabels(Tile tile, Tile tile2) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[this.dataPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return readLabels(tile, tile2, false);
            }
            if (i == 3) {
                return readLabels(tile, tile2, true);
            }
            throw new IllegalStateException("Invalid data policy for multi map database");
        }
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile)) {
                return mapDataStore.readLabels(tile, tile2);
            }
        }
        return null;
    }

    private MapReadResult readLabels(Tile tile, Tile tile2, boolean z) {
        MapReadResult readLabels;
        MapReadResult mapReadResult = new MapReadResult();
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile) && (readLabels = mapDataStore.readLabels(tile, tile2)) != null) {
                mapReadResult.isWater &= readLabels.isWater;
                mapReadResult.add(readLabels, z);
            }
        }
        return mapReadResult;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readMapData(Tile tile) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[this.dataPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return readMapData(tile, false);
            }
            if (i == 3) {
                return readMapData(tile, true);
            }
            throw new IllegalStateException("Invalid data policy for multi map database");
        }
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile)) {
                return mapDataStore.readMapData(tile);
            }
        }
        return null;
    }

    private MapReadResult readMapData(Tile tile, boolean z) {
        MapReadResult readMapData;
        MapReadResult mapReadResult = new MapReadResult();
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile) && (readMapData = mapDataStore.readMapData(tile)) != null) {
                mapReadResult.isWater &= readMapData.isWater;
                mapReadResult.add(readMapData, z);
            }
        }
        return mapReadResult;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readMapData(Tile tile, Tile tile2) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[this.dataPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return readMapData(tile, tile2, false);
            }
            if (i == 3) {
                return readMapData(tile, tile2, true);
            }
            throw new IllegalStateException("Invalid data policy for multi map database");
        }
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile)) {
                return mapDataStore.readMapData(tile, tile2);
            }
        }
        return null;
    }

    private MapReadResult readMapData(Tile tile, Tile tile2, boolean z) {
        MapReadResult readMapData;
        MapReadResult mapReadResult = new MapReadResult();
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile) && (readMapData = mapDataStore.readMapData(tile, tile2)) != null) {
                mapReadResult.isWater &= readMapData.isWater;
                mapReadResult.add(readMapData, z);
            }
        }
        return mapReadResult;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readPoiData(Tile tile) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[this.dataPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return readPoiData(tile, false);
            }
            if (i == 3) {
                return readPoiData(tile, true);
            }
            throw new IllegalStateException("Invalid data policy for multi map database");
        }
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile)) {
                return mapDataStore.readPoiData(tile);
            }
        }
        return null;
    }

    private MapReadResult readPoiData(Tile tile, boolean z) {
        MapReadResult readPoiData;
        MapReadResult mapReadResult = new MapReadResult();
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile) && (readPoiData = mapDataStore.readPoiData(tile)) != null) {
                mapReadResult.isWater &= readPoiData.isWater;
                mapReadResult.add(readPoiData, z);
            }
        }
        return mapReadResult;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public MapReadResult readPoiData(Tile tile, Tile tile2) {
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$datastore$MultiMapDataStore$DataPolicy[this.dataPolicy.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return readPoiData(tile, tile2, false);
            }
            if (i == 3) {
                return readPoiData(tile, tile2, true);
            }
            throw new IllegalStateException("Invalid data policy for multi map database");
        }
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile)) {
                return mapDataStore.readPoiData(tile, tile2);
            }
        }
        return null;
    }

    private MapReadResult readPoiData(Tile tile, Tile tile2, boolean z) {
        MapReadResult readPoiData;
        MapReadResult mapReadResult = new MapReadResult();
        for (MapDataStore mapDataStore : this.mapDatabases) {
            if (mapDataStore.supportsTile(tile) && (readPoiData = mapDataStore.readPoiData(tile, tile2)) != null) {
                mapReadResult.isWater &= readPoiData.isWater;
                mapReadResult.add(readPoiData, z);
            }
        }
        return mapReadResult;
    }

    public void setStartPosition(LatLong latLong) {
        this.startPosition = latLong;
    }

    public void setStartZoomLevel(byte b) {
        this.startZoomLevel = b;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public LatLong startPosition() {
        LatLong latLong = this.startPosition;
        if (latLong != null) {
            return latLong;
        }
        BoundingBox boundingBox = this.boundingBox;
        if (boundingBox != null) {
            return boundingBox.getCenterPoint();
        }
        return null;
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public Byte startZoomLevel() {
        return Byte.valueOf(this.startZoomLevel);
    }

    @Override // org.mapsforge.map.datastore.MapDataStore
    public boolean supportsTile(Tile tile) {
        Iterator<MapDataStore> it = this.mapDatabases.iterator();
        while (it.hasNext()) {
            if (it.next().supportsTile(tile)) {
                return true;
            }
        }
        return false;
    }
}
