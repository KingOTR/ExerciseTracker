package org.maplibre.android.maps;

import android.graphics.PointF;
import java.util.ArrayList;
import java.util.Iterator;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.geometry.ProjectedMeters;
import org.maplibre.android.geometry.VisibleRegion;

/* loaded from: classes5.dex */
public class Projection {
    private final MapView mapView;
    private final NativeMap nativeMapView;

    static double degreesToRadians(double d) {
        return ((d % 360.0d) * 3.141592653589793d) / 180.0d;
    }

    static double radiansToDegrees(double d) {
        return ((d % 6.283185307179586d) * 180.0d) / 3.141592653589793d;
    }

    @Deprecated
    public void invalidateContentPadding() {
    }

    Projection(NativeMap nativeMap, MapView mapView) {
        this.nativeMapView = nativeMap;
        this.mapView = mapView;
    }

    void setContentPadding(int[] iArr) {
        double[] dArr = new double[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            dArr[i] = iArr[i];
        }
        this.nativeMapView.setContentPadding(dArr);
    }

    int[] getContentPadding() {
        double[] dArr = this.nativeMapView.getCameraPosition().padding;
        return new int[]{(int) dArr[0], (int) dArr[1], (int) dArr[2], (int) dArr[3]};
    }

    public ProjectedMeters getProjectedMetersForLatLng(LatLng latLng) {
        return this.nativeMapView.projectedMetersForLatLng(latLng);
    }

    public LatLng getLatLngForProjectedMeters(ProjectedMeters projectedMeters) {
        return this.nativeMapView.latLngForProjectedMeters(projectedMeters);
    }

    public double getMetersPerPixelAtLatitude(double d) {
        return this.nativeMapView.getMetersPerPixelAtLatitude(d);
    }

    public LatLng fromScreenLocation(PointF pointF) {
        return this.nativeMapView.latLngForPixel(pointF);
    }

    public void fromScreenLocations(double[] dArr, double[] dArr2) {
        this.nativeMapView.latLngsForPixels(dArr, dArr2);
    }

    public VisibleRegion getVisibleRegion() {
        return getVisibleRegion(true);
    }

    public VisibleRegion getVisibleRegion(boolean z) {
        float f;
        float f2;
        float height;
        float f3;
        LatLng latLng;
        LatLng latLng2;
        if (z) {
            f3 = this.mapView.getWidth();
            height = this.mapView.getHeight();
            f = 0.0f;
            f2 = 0.0f;
        } else {
            int[] contentPadding = getContentPadding();
            f = contentPadding[0];
            float width = this.mapView.getWidth() - contentPadding[2];
            f2 = contentPadding[1];
            height = this.mapView.getHeight() - contentPadding[3];
            f3 = width;
        }
        LatLng fromScreenLocation = fromScreenLocation(new PointF(((f3 - f) / 2.0f) + f, ((height - f2) / 2.0f) + f2));
        LatLng fromScreenLocation2 = fromScreenLocation(new PointF(f, f2));
        LatLng fromScreenLocation3 = fromScreenLocation(new PointF(f3, f2));
        LatLng fromScreenLocation4 = fromScreenLocation(new PointF(f3, height));
        LatLng fromScreenLocation5 = fromScreenLocation(new PointF(f, height));
        ArrayList arrayList = new ArrayList();
        arrayList.add(fromScreenLocation3);
        arrayList.add(fromScreenLocation4);
        arrayList.add(fromScreenLocation5);
        arrayList.add(fromScreenLocation2);
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = -90.0d;
        double d5 = 90.0d;
        double d6 = 0.0d;
        double d7 = 0.0d;
        while (it.hasNext()) {
            Iterator it2 = it;
            LatLng latLng3 = (LatLng) it.next();
            if (bearing(fromScreenLocation, latLng3) >= d) {
                latLng = fromScreenLocation5;
                latLng2 = fromScreenLocation4;
                double longitudeSpan = getLongitudeSpan(latLng3.getLongitude(), fromScreenLocation.getLongitude());
                if (longitudeSpan > d7) {
                    d2 = latLng3.getLongitude();
                    d7 = longitudeSpan;
                }
            } else {
                latLng = fromScreenLocation5;
                latLng2 = fromScreenLocation4;
                double longitudeSpan2 = getLongitudeSpan(fromScreenLocation.getLongitude(), latLng3.getLongitude());
                if (longitudeSpan2 > d6) {
                    d3 = latLng3.getLongitude();
                    d6 = longitudeSpan2;
                }
            }
            if (d4 < latLng3.getLatitude()) {
                d4 = latLng3.getLatitude();
            }
            if (d5 > latLng3.getLatitude()) {
                d5 = latLng3.getLatitude();
            }
            it = it2;
            fromScreenLocation4 = latLng2;
            fromScreenLocation5 = latLng;
            d = 0.0d;
        }
        LatLng latLng4 = fromScreenLocation5;
        LatLng latLng5 = fromScreenLocation4;
        if (d2 < d3) {
            return new VisibleRegion(fromScreenLocation2, fromScreenLocation3, latLng4, latLng5, LatLngBounds.from(d4, d2 + 360.0d, d5, d3));
        }
        return new VisibleRegion(fromScreenLocation2, fromScreenLocation3, latLng4, latLng5, LatLngBounds.from(d4, d2, d5, d3));
    }

    public void getVisibleCoordinateBounds(double[] dArr) {
        this.nativeMapView.getVisibleCoordinateBounds(dArr);
    }

    static double bearing(LatLng latLng, LatLng latLng2) {
        double degreesToRadians = degreesToRadians(latLng.getLongitude());
        double degreesToRadians2 = degreesToRadians(latLng2.getLongitude());
        double degreesToRadians3 = degreesToRadians(latLng.getLatitude());
        double degreesToRadians4 = degreesToRadians(latLng2.getLatitude());
        double d = degreesToRadians2 - degreesToRadians;
        return radiansToDegrees(Math.atan2(Math.sin(d) * Math.cos(degreesToRadians4), (Math.cos(degreesToRadians3) * Math.sin(degreesToRadians4)) - ((Math.sin(degreesToRadians3) * Math.cos(degreesToRadians4)) * Math.cos(d))));
    }

    static double getLongitudeSpan(double d, double d2) {
        double abs = Math.abs(d - d2);
        return d > d2 ? abs : 360.0d - abs;
    }

    public PointF toScreenLocation(LatLng latLng) {
        return this.nativeMapView.pixelForLatLng(latLng);
    }

    public void toScreenLocations(double[] dArr, double[] dArr2) {
        this.nativeMapView.pixelsForLatLngs(dArr, dArr2);
    }

    float getHeight() {
        return this.mapView.getHeight();
    }

    float getWidth() {
        return this.mapView.getWidth();
    }

    public double calculateZoom(float f) {
        return this.nativeMapView.getZoom() + (Math.log(f) / Math.log(2.0d));
    }
}
