package com.example.rungps.ui.main;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Polyline;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

/* compiled from: MapOsMapKit.kt */
@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a(\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000bH\u0000\u001a\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0000\u001a0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u0015H\u0000\u001a$\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00070\u00112\u0006\u0010\u0017\u001a\u00020\u000bH\u0000\u001a\u0010\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002\u001a\u0016\u0010\u001f\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u0007H\u0080@¢\u0006\u0002\u0010 \"*\u0010\u0018\u001a\u001e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019j\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b`\u001cX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"createOsMapKit", "Lcom/example/rungps/ui/main/OsMapKit;", "ctx", "Landroid/content/Context;", "bearingDegrees", "", "a", "Lorg/osmdroid/util/GeoPoint;", "b", "lookAheadPoint", "lat", "", "lon", "bearingDeg", "aheadM", "geoDistanceM", "simplifyPoints", "", "points", "minStepM", "maxPoints", "", "sampleAlong", "stepM", "parkBeachCache", "Ljava/util/LinkedHashMap;", "", "", "Lkotlin/collections/LinkedHashMap;", "cacheKey", "p", "isLikelyParkOrBeach", "(Lorg/osmdroid/util/GeoPoint;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MapOsMapKitKt {
    private static final LinkedHashMap<Long, Boolean> parkBeachCache = new LinkedHashMap<>(512, 0.75f, true);

    public static final OsMapKit createOsMapKit(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        MapView mapView = new MapView(ctx);
        mapView.setTileSource(TileSourceFactory.MAPNIK);
        mapView.setUseDataConnection(true);
        mapView.setMultiTouchControls(true);
        mapView.setBuiltInZoomControls(false);
        mapView.getController().setZoom(16.0d);
        mapView.getController().setCenter(new GeoPoint(-31.95d, 115.85d));
        MyLocationNewOverlay myLocationNewOverlay = new MyLocationNewOverlay(new GpsMyLocationProvider(ctx), mapView);
        myLocationNewOverlay.enableMyLocation();
        myLocationNewOverlay.disableFollowLocation();
        Polyline polyline = new Polyline();
        polyline.getOutlinePaint().setColor(Color.parseColor("#2196F3"));
        polyline.getOutlinePaint().setStrokeWidth(10.0f);
        Polyline polyline2 = new Polyline();
        polyline2.getOutlinePaint().setColor(Color.parseColor("#E53935"));
        polyline2.getOutlinePaint().setStrokeWidth(7.0f);
        mapView.getOverlays().add(myLocationNewOverlay);
        mapView.getOverlays().add(polyline);
        mapView.getOverlays().add(polyline2);
        return new OsMapKit(mapView, myLocationNewOverlay, polyline, polyline2);
    }

    public static final float bearingDegrees(GeoPoint a, GeoPoint b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        float[] fArr = new float[3];
        Location.distanceBetween(a.getLatitude(), a.getLongitude(), b.getLatitude(), b.getLongitude(), fArr);
        return fArr[1];
    }

    public static final GeoPoint lookAheadPoint(double d, double d2, float f, double d3) {
        double d4 = d3 / 6371000.0d;
        double radians = Math.toRadians(f);
        double radians2 = Math.toRadians(d);
        double radians3 = Math.toRadians(d2);
        double asin = Math.asin((Math.sin(radians2) * Math.cos(d4)) + (Math.cos(radians2) * Math.sin(d4) * Math.cos(radians)));
        return new GeoPoint(Math.toDegrees(asin), Math.toDegrees(radians3 + Math.atan2(Math.sin(radians) * Math.sin(d4) * Math.cos(radians2), Math.cos(d4) - (Math.sin(radians2) * Math.sin(asin)))));
    }

    public static final double geoDistanceM(GeoPoint a, GeoPoint b) {
        Intrinsics.checkNotNullParameter(a, "a");
        Intrinsics.checkNotNullParameter(b, "b");
        Location location = new Location("a");
        location.setLatitude(a.getLatitude());
        location.setLongitude(a.getLongitude());
        Location location2 = new Location("b");
        location2.setLatitude(b.getLatitude());
        location2.setLongitude(b.getLongitude());
        return location.distanceTo(location2);
    }

    public static /* synthetic */ List simplifyPoints$default(List list, double d, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            d = 4.0d;
        }
        if ((i2 & 4) != 0) {
            i = 900;
        }
        return simplifyPoints(list, d, i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<GeoPoint> simplifyPoints(List<? extends GeoPoint> points, double d, int i) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (points.size() <= 2) {
            return points;
        }
        ArrayList arrayList = new ArrayList(RangesKt.coerceAtMost(points.size(), i));
        arrayList.add(CollectionsKt.first((List) points));
        GeoPoint geoPoint = (GeoPoint) CollectionsKt.first((List) points);
        int lastIndex = CollectionsKt.getLastIndex(points);
        for (int i2 = 1; i2 < lastIndex; i2++) {
            GeoPoint geoPoint2 = (GeoPoint) points.get(i2);
            if (geoDistanceM(geoPoint, geoPoint2) >= d) {
                arrayList.add(geoPoint2);
                if (arrayList.size() >= i - 1) {
                    break;
                }
                geoPoint = geoPoint2;
            }
        }
        arrayList.add(CollectionsKt.last((List) points));
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List<GeoPoint> sampleAlong(List<? extends GeoPoint> points, double d) {
        Intrinsics.checkNotNullParameter(points, "points");
        if (points.size() < 2) {
            return points;
        }
        ArrayList arrayList = new ArrayList(points.size() * 2);
        arrayList.add(CollectionsKt.first((List) points));
        int size = points.size();
        double d2 = 0.0d;
        double d3 = 0.0d;
        for (int i = 1; i < size; i++) {
            GeoPoint geoPoint = (GeoPoint) points.get(i - 1);
            GeoPoint geoPoint2 = (GeoPoint) points.get(i);
            double geoDistanceM = geoDistanceM(geoPoint, geoPoint2);
            if (geoDistanceM > d2) {
                while (true) {
                    d3 += d;
                    if (d3 >= geoDistanceM) {
                        break;
                    }
                    double d4 = d3 / geoDistanceM;
                    arrayList.add(new GeoPoint(geoPoint.getLatitude() + ((geoPoint2.getLatitude() - geoPoint.getLatitude()) * d4), geoPoint.getLongitude() + ((geoPoint2.getLongitude() - geoPoint.getLongitude()) * d4)));
                }
                d2 = 0.0d;
                d3 = RangesKt.coerceAtLeast(d3 - geoDistanceM, 0.0d);
                arrayList.add(geoPoint2);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long cacheKey(GeoPoint geoPoint) {
        return (((int) (geoPoint.getLatitude() * 10000.0d)) << 32) ^ (((int) (geoPoint.getLongitude() * 10000.0d)) & 4294967295L);
    }

    public static final Object isLikelyParkOrBeach(GeoPoint geoPoint, Continuation<? super Boolean> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new MapOsMapKitKt$isLikelyParkOrBeach$2(geoPoint, null), continuation);
    }
}
