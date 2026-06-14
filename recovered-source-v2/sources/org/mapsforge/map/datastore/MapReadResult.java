package org.mapsforge.map.datastore;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes5.dex */
public class MapReadResult {
    public boolean isWater;
    private final Set<Integer> hashPois = new HashSet();
    private final Set<Integer> hashWays = new HashSet();
    public List<PointOfInterest> pointOfInterests = new ArrayList();
    public List<Way> ways = new ArrayList();

    public void add(PoiWayBundle poiWayBundle) {
        this.pointOfInterests.addAll(poiWayBundle.pois);
        this.ways.addAll(poiWayBundle.ways);
    }

    public void add(MapReadResult mapReadResult, boolean z) {
        if (z) {
            for (PointOfInterest pointOfInterest : mapReadResult.pointOfInterests) {
                if (this.hashPois.add(Integer.valueOf(pointOfInterest.hashCode()))) {
                    this.pointOfInterests.add(pointOfInterest);
                }
            }
            for (Way way : mapReadResult.ways) {
                if (this.hashWays.add(Integer.valueOf(way.hashCode()))) {
                    this.ways.add(way);
                }
            }
            return;
        }
        this.pointOfInterests.addAll(mapReadResult.pointOfInterests);
        this.ways.addAll(mapReadResult.ways);
    }
}
