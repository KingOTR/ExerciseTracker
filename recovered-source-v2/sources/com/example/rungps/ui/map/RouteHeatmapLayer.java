package com.example.rungps.ui.map;

import android.graphics.Color;
import androidx.health.connect.client.records.CervicalMucusRecord;
import com.example.rungps.data.PointEntity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Overlay;
import org.osmdroid.views.overlay.Polyline;

/* compiled from: RouteHeatmapLayer.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u001e\u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\t0\n0\t2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/ui/map/RouteHeatmapLayer;", "", "<init>", "()V", "apply", "", "map", "Lorg/osmdroid/views/MapView;", "runs", "", "Lkotlin/Pair;", "", "Lcom/example/rungps/data/PointEntity;", "maxRuns", "", CervicalMucusRecord.Appearance.CLEAR, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RouteHeatmapLayer {
    public static final int $stable = 0;
    public static final RouteHeatmapLayer INSTANCE = new RouteHeatmapLayer();

    private RouteHeatmapLayer() {
    }

    public static /* synthetic */ void apply$default(RouteHeatmapLayer routeHeatmapLayer, MapView mapView, List list, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = 24;
        }
        routeHeatmapLayer.apply(mapView, list, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean apply$lambda$0(Overlay overlay) {
        return (overlay instanceof Polyline) && Intrinsics.areEqual(((Polyline) overlay).getTitle(), "route_heat");
    }

    public final void apply(MapView map, List<? extends Pair<Long, ? extends List<PointEntity>>> runs, int maxRuns) {
        Intrinsics.checkNotNullParameter(map, "map");
        Intrinsics.checkNotNullParameter(runs, "runs");
        List<Overlay> overlays = map.getOverlays();
        Intrinsics.checkNotNullExpressionValue(overlays, "getOverlays(...)");
        CollectionsKt.removeAll((List) overlays, new Function1() { // from class: com.example.rungps.ui.map.RouteHeatmapLayer$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean apply$lambda$0;
                apply$lambda$0 = RouteHeatmapLayer.apply$lambda$0((Overlay) obj);
                return Boolean.valueOf(apply$lambda$0);
            }
        });
        List<Pair> take = CollectionsKt.take(CollectionsKt.sortedWith(runs, new Comparator() { // from class: com.example.rungps.ui.map.RouteHeatmapLayer$apply$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Long) ((Pair) t2).getFirst(), (Long) ((Pair) t).getFirst());
            }
        }), maxRuns);
        Pair pair = (Pair) CollectionsKt.firstOrNull(take);
        long longValue = pair != null ? ((Number) pair.getFirst()).longValue() : System.currentTimeMillis();
        for (Pair pair2 : take) {
            long longValue2 = ((Number) pair2.component1()).longValue();
            List list = (List) pair2.component2();
            if (list.size() >= 2) {
                int coerceIn = RangesKt.coerceIn((int) (180 * (1.0d - (RangesKt.coerceIn((longValue - longValue2) / 8.64E7d, 0.0d, 30.0d) / 30.0d))), 40, 180);
                Polyline polyline = new Polyline(map);
                polyline.setTitle("route_heat");
                polyline.getOutlinePaint().setColor(Color.argb(coerceIn, 79, 70, 229));
                polyline.getOutlinePaint().setStrokeWidth(6.0f);
                List<PointEntity> list2 = list;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                for (PointEntity pointEntity : list2) {
                    arrayList.add(new GeoPoint(pointEntity.getLat(), pointEntity.getLon()));
                }
                polyline.setPoints(arrayList);
                map.getOverlays().add(0, polyline);
            }
        }
        map.invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean clear$lambda$5(Overlay overlay) {
        return (overlay instanceof Polyline) && Intrinsics.areEqual(((Polyline) overlay).getTitle(), "route_heat");
    }

    public final void clear(MapView map) {
        Intrinsics.checkNotNullParameter(map, "map");
        List<Overlay> overlays = map.getOverlays();
        Intrinsics.checkNotNullExpressionValue(overlays, "getOverlays(...)");
        CollectionsKt.removeAll((List) overlays, new Function1() { // from class: com.example.rungps.ui.map.RouteHeatmapLayer$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean clear$lambda$5;
                clear$lambda$5 = RouteHeatmapLayer.clear$lambda$5((Overlay) obj);
                return Boolean.valueOf(clear$lambda$5);
            }
        });
        map.invalidate();
    }
}
