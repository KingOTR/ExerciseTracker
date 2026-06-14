package com.example.rungps.ui.main;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Polyline;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

/* compiled from: MapOsMapKit.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/ui/main/OsMapKit;", "", "mapView", "Lorg/osmdroid/views/MapView;", "locationOverlay", "Lorg/osmdroid/views/overlay/mylocation/MyLocationNewOverlay;", "planLine", "Lorg/osmdroid/views/overlay/Polyline;", "liveLine", "<init>", "(Lorg/osmdroid/views/MapView;Lorg/osmdroid/views/overlay/mylocation/MyLocationNewOverlay;Lorg/osmdroid/views/overlay/Polyline;Lorg/osmdroid/views/overlay/Polyline;)V", "getMapView", "()Lorg/osmdroid/views/MapView;", "getLocationOverlay", "()Lorg/osmdroid/views/overlay/mylocation/MyLocationNewOverlay;", "getPlanLine", "()Lorg/osmdroid/views/overlay/Polyline;", "getLiveLine", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OsMapKit {
    public static final int $stable = 8;
    private final Polyline liveLine;
    private final MyLocationNewOverlay locationOverlay;
    private final MapView mapView;
    private final Polyline planLine;

    public static /* synthetic */ OsMapKit copy$default(OsMapKit osMapKit, MapView mapView, MyLocationNewOverlay myLocationNewOverlay, Polyline polyline, Polyline polyline2, int i, Object obj) {
        if ((i & 1) != 0) {
            mapView = osMapKit.mapView;
        }
        if ((i & 2) != 0) {
            myLocationNewOverlay = osMapKit.locationOverlay;
        }
        if ((i & 4) != 0) {
            polyline = osMapKit.planLine;
        }
        if ((i & 8) != 0) {
            polyline2 = osMapKit.liveLine;
        }
        return osMapKit.copy(mapView, myLocationNewOverlay, polyline, polyline2);
    }

    /* renamed from: component1, reason: from getter */
    public final MapView getMapView() {
        return this.mapView;
    }

    /* renamed from: component2, reason: from getter */
    public final MyLocationNewOverlay getLocationOverlay() {
        return this.locationOverlay;
    }

    /* renamed from: component3, reason: from getter */
    public final Polyline getPlanLine() {
        return this.planLine;
    }

    /* renamed from: component4, reason: from getter */
    public final Polyline getLiveLine() {
        return this.liveLine;
    }

    public final OsMapKit copy(MapView mapView, MyLocationNewOverlay locationOverlay, Polyline planLine, Polyline liveLine) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(locationOverlay, "locationOverlay");
        Intrinsics.checkNotNullParameter(planLine, "planLine");
        Intrinsics.checkNotNullParameter(liveLine, "liveLine");
        return new OsMapKit(mapView, locationOverlay, planLine, liveLine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OsMapKit)) {
            return false;
        }
        OsMapKit osMapKit = (OsMapKit) other;
        return Intrinsics.areEqual(this.mapView, osMapKit.mapView) && Intrinsics.areEqual(this.locationOverlay, osMapKit.locationOverlay) && Intrinsics.areEqual(this.planLine, osMapKit.planLine) && Intrinsics.areEqual(this.liveLine, osMapKit.liveLine);
    }

    public int hashCode() {
        return (((((this.mapView.hashCode() * 31) + this.locationOverlay.hashCode()) * 31) + this.planLine.hashCode()) * 31) + this.liveLine.hashCode();
    }

    public String toString() {
        return "OsMapKit(mapView=" + this.mapView + ", locationOverlay=" + this.locationOverlay + ", planLine=" + this.planLine + ", liveLine=" + this.liveLine + ")";
    }

    public OsMapKit(MapView mapView, MyLocationNewOverlay locationOverlay, Polyline planLine, Polyline liveLine) {
        Intrinsics.checkNotNullParameter(mapView, "mapView");
        Intrinsics.checkNotNullParameter(locationOverlay, "locationOverlay");
        Intrinsics.checkNotNullParameter(planLine, "planLine");
        Intrinsics.checkNotNullParameter(liveLine, "liveLine");
        this.mapView = mapView;
        this.locationOverlay = locationOverlay;
        this.planLine = planLine;
        this.liveLine = liveLine;
    }

    public final MapView getMapView() {
        return this.mapView;
    }

    public final MyLocationNewOverlay getLocationOverlay() {
        return this.locationOverlay;
    }

    public final Polyline getPlanLine() {
        return this.planLine;
    }

    public final Polyline getLiveLine() {
        return this.liveLine;
    }
}
