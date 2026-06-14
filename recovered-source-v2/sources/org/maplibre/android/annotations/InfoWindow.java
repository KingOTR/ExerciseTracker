package org.maplibre.android.annotations;

import android.content.res.Resources;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import org.maplibre.android.R;
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;
import org.maplibre.android.maps.MapView;

@Deprecated
/* loaded from: classes5.dex */
public class InfoWindow {
    private WeakReference<Marker> boundMarker;
    private final ViewTreeObserver.OnGlobalLayoutListener contentUpdateListener = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: org.maplibre.android.annotations.InfoWindow.3
        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            View view = InfoWindow.this.view.get();
            if (view != null) {
                view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                InfoWindow.this.viewHeightOffset = (-view.getMeasuredHeight()) + InfoWindow.this.markerHeightOffset;
                InfoWindow.this.update();
            }
        }
    };
    private PointF coordinates;
    private boolean isVisible;
    private int layoutRes;
    private WeakReference<MapLibreMap> maplibreMap;
    private float markerHeightOffset;
    private float markerWidthOffset;
    protected WeakReference<View> view;
    private float viewHeightOffset;
    private float viewWidthOffset;

    InfoWindow(MapView mapView, int i, MapLibreMap mapLibreMap) {
        this.layoutRes = i;
        initialize(LayoutInflater.from(mapView.getContext()).inflate(i, (ViewGroup) mapView, false), mapLibreMap);
    }

    InfoWindow(View view, MapLibreMap mapLibreMap) {
        initialize(view, mapLibreMap);
    }

    private void initialize(View view, MapLibreMap mapLibreMap) {
        this.maplibreMap = new WeakReference<>(mapLibreMap);
        this.isVisible = false;
        this.view = new WeakReference<>(view);
        view.setOnClickListener(new View.OnClickListener() { // from class: org.maplibre.android.annotations.InfoWindow.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view2) {
                MapLibreMap mapLibreMap2 = (MapLibreMap) InfoWindow.this.maplibreMap.get();
                if (mapLibreMap2 != null) {
                    MapLibreMap.OnInfoWindowClickListener onInfoWindowClickListener = mapLibreMap2.getOnInfoWindowClickListener();
                    if (onInfoWindowClickListener != null ? onInfoWindowClickListener.onInfoWindowClick(InfoWindow.this.getBoundMarker()) : false) {
                        return;
                    }
                    InfoWindow.this.closeInfoWindow();
                }
            }
        });
        view.setOnLongClickListener(new View.OnLongClickListener() { // from class: org.maplibre.android.annotations.InfoWindow.2
            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view2) {
                MapLibreMap.OnInfoWindowLongClickListener onInfoWindowLongClickListener;
                MapLibreMap mapLibreMap2 = (MapLibreMap) InfoWindow.this.maplibreMap.get();
                if (mapLibreMap2 == null || (onInfoWindowLongClickListener = mapLibreMap2.getOnInfoWindowLongClickListener()) == null) {
                    return true;
                }
                onInfoWindowLongClickListener.onInfoWindowLongClick(InfoWindow.this.getBoundMarker());
                return true;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void closeInfoWindow() {
        MapLibreMap mapLibreMap = this.maplibreMap.get();
        Marker marker = this.boundMarker.get();
        if (marker != null && mapLibreMap != null) {
            mapLibreMap.deselectMarker(marker);
        }
        close();
    }

    InfoWindow open(MapView mapView, Marker marker, LatLng latLng, int i, int i2) {
        float f;
        boolean z;
        float f2;
        boolean z2;
        setBoundMarker(marker);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        MapLibreMap mapLibreMap = this.maplibreMap.get();
        View view = this.view.get();
        if (view != null && mapLibreMap != null) {
            view.measure(0, 0);
            float f3 = i2;
            this.markerHeightOffset = f3;
            this.markerWidthOffset = -i;
            PointF screenLocation = mapLibreMap.getProjection().toScreenLocation(latLng);
            this.coordinates = screenLocation;
            float f4 = i;
            float measuredWidth = (screenLocation.x - (view.getMeasuredWidth() / 2)) + f4;
            float measuredHeight = (this.coordinates.y - view.getMeasuredHeight()) + f3;
            if (view instanceof BubbleLayout) {
                Resources resources = mapView.getContext().getResources();
                float measuredWidth2 = view.getMeasuredWidth() + measuredWidth;
                float right = mapView.getRight();
                float left = mapView.getLeft();
                float dimension = resources.getDimension(R.dimen.maplibre_infowindow_margin);
                float dimension2 = resources.getDimension(R.dimen.maplibre_infowindow_tipview_width) / 2.0f;
                float measuredWidth3 = (view.getMeasuredWidth() / 2) - dimension2;
                if (this.coordinates.x >= 0.0f && this.coordinates.x <= mapView.getWidth() && this.coordinates.y >= 0.0f && this.coordinates.y <= mapView.getHeight()) {
                    if (measuredWidth2 > right) {
                        float f5 = measuredWidth2 - right;
                        f = measuredWidth - f5;
                        measuredWidth3 += f5 + dimension2;
                        measuredWidth2 = view.getMeasuredWidth() + f;
                        z = true;
                    } else {
                        f = measuredWidth;
                        z = false;
                    }
                    if (measuredWidth < left) {
                        float f6 = left - measuredWidth;
                        f += f6;
                        float f7 = measuredWidth3 - (f6 + dimension2);
                        measuredWidth = f;
                        f2 = f7;
                        z2 = true;
                    } else {
                        f2 = measuredWidth3;
                        z2 = false;
                    }
                    if (z) {
                        float f8 = right - measuredWidth2;
                        if (f8 < dimension) {
                            float f9 = dimension - f8;
                            f -= f9;
                            f2 += f9 - dimension2;
                            measuredWidth = f;
                        }
                    }
                    if (z2) {
                        float f10 = measuredWidth - left;
                        if (f10 < dimension) {
                            float f11 = dimension - f10;
                            measuredWidth3 = f2 - (f11 - dimension2);
                            measuredWidth = f + f11;
                        }
                    }
                    measuredWidth = f;
                    measuredWidth3 = f2;
                }
                ((BubbleLayout) view).setArrowPosition(measuredWidth3);
            }
            view.setX(measuredWidth);
            view.setY(measuredHeight);
            this.viewWidthOffset = (measuredWidth - this.coordinates.x) - f4;
            this.viewHeightOffset = (-view.getMeasuredHeight()) + i2;
            close();
            mapView.addView(view, layoutParams);
            this.isVisible = true;
        }
        return this;
    }

    InfoWindow close() {
        MapLibreMap mapLibreMap = this.maplibreMap.get();
        if (this.isVisible && mapLibreMap != null) {
            this.isVisible = false;
            View view = this.view.get();
            if (view != null && view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            Marker boundMarker = getBoundMarker();
            MapLibreMap.OnInfoWindowCloseListener onInfoWindowCloseListener = mapLibreMap.getOnInfoWindowCloseListener();
            if (onInfoWindowCloseListener != null) {
                onInfoWindowCloseListener.onInfoWindowClose(boundMarker);
            }
            setBoundMarker(null);
        }
        return this;
    }

    void adaptDefaultMarker(Marker marker, MapLibreMap mapLibreMap, MapView mapView) {
        View view = this.view.get();
        if (view == null) {
            view = LayoutInflater.from(mapView.getContext()).inflate(this.layoutRes, (ViewGroup) mapView, false);
            initialize(view, mapLibreMap);
        }
        this.maplibreMap = new WeakReference<>(mapLibreMap);
        String title = marker.getTitle();
        TextView textView = (TextView) view.findViewById(R.id.infowindow_title);
        if (!TextUtils.isEmpty(title)) {
            textView.setText(title);
            textView.setVisibility(0);
        } else {
            textView.setVisibility(8);
        }
        String snippet = marker.getSnippet();
        TextView textView2 = (TextView) view.findViewById(R.id.infowindow_description);
        if (!TextUtils.isEmpty(snippet)) {
            textView2.setText(snippet);
            textView2.setVisibility(0);
        } else {
            textView2.setVisibility(8);
        }
    }

    InfoWindow setBoundMarker(Marker marker) {
        this.boundMarker = new WeakReference<>(marker);
        return this;
    }

    Marker getBoundMarker() {
        WeakReference<Marker> weakReference = this.boundMarker;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public void update() {
        MapLibreMap mapLibreMap = this.maplibreMap.get();
        Marker marker = this.boundMarker.get();
        View view = this.view.get();
        if (mapLibreMap == null || marker == null || view == null) {
            return;
        }
        PointF screenLocation = mapLibreMap.getProjection().toScreenLocation(marker.getPosition());
        this.coordinates = screenLocation;
        if (view instanceof BubbleLayout) {
            view.setX((screenLocation.x + this.viewWidthOffset) - this.markerWidthOffset);
        } else {
            view.setX((screenLocation.x - (view.getMeasuredWidth() / 2)) - this.markerWidthOffset);
        }
        view.setY(this.coordinates.y + this.viewHeightOffset);
    }

    void onContentUpdate() {
        View view = this.view.get();
        if (view != null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.addOnGlobalLayoutListener(this.contentUpdateListener);
            }
        }
    }

    public View getView() {
        WeakReference<View> weakReference = this.view;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    boolean isVisible() {
        return this.isVisible;
    }
}
