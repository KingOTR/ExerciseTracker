package org.maplibre.android.maps;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.maplibre.android.annotations.Annotation;
import org.maplibre.android.annotations.Polyline;
import org.maplibre.android.annotations.PolylineOptions;

/* loaded from: classes5.dex */
class PolylineContainer implements Polylines {
    private final LongSparseArray<Annotation> annotations;
    private final NativeMap nativeMap;

    PolylineContainer(NativeMap nativeMap, LongSparseArray<Annotation> longSparseArray) {
        this.nativeMap = nativeMap;
        this.annotations = longSparseArray;
    }

    @Override // org.maplibre.android.maps.Polylines
    public Polyline addBy(PolylineOptions polylineOptions, MapLibreMap mapLibreMap) {
        Polyline polyline = polylineOptions.getPolyline();
        NativeMap nativeMap = this.nativeMap;
        long addPolyline = nativeMap != null ? nativeMap.addPolyline(polyline) : 0L;
        polyline.setMapLibreMap(mapLibreMap);
        polyline.setId(addPolyline);
        this.annotations.put(addPolyline, polyline);
        return polyline;
    }

    @Override // org.maplibre.android.maps.Polylines
    public List<Polyline> addBy(List<PolylineOptions> list, MapLibreMap mapLibreMap) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        if (this.nativeMap != null && size > 0) {
            Iterator<PolylineOptions> it = list.iterator();
            while (it.hasNext()) {
                Polyline polyline = it.next().getPolyline();
                if (!polyline.getPoints().isEmpty()) {
                    arrayList.add(polyline);
                }
            }
            long[] addPolylines = this.nativeMap.addPolylines(arrayList);
            for (int i = 0; i < addPolylines.length; i++) {
                Polyline polyline2 = (Polyline) arrayList.get(i);
                polyline2.setMapLibreMap(mapLibreMap);
                polyline2.setId(addPolylines[i]);
                this.annotations.put(addPolylines[i], polyline2);
            }
        }
        return arrayList;
    }

    @Override // org.maplibre.android.maps.Polylines
    public void update(Polyline polyline) {
        this.nativeMap.updatePolyline(polyline);
        LongSparseArray<Annotation> longSparseArray = this.annotations;
        longSparseArray.setValueAt(longSparseArray.indexOfKey(polyline.getId()), polyline);
    }

    @Override // org.maplibre.android.maps.Polylines
    public List<Polyline> obtainAll() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < this.annotations.size(); i++) {
            LongSparseArray<Annotation> longSparseArray = this.annotations;
            Annotation annotation = longSparseArray.get(longSparseArray.keyAt(i));
            if (annotation instanceof Polyline) {
                arrayList.add((Polyline) annotation);
            }
        }
        return arrayList;
    }
}
