package org.maplibre.android.geometry;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.DoubleCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import okhttp3.internal.http2.Http2Connection;
import org.maplibre.android.exceptions.InvalidLatLngBoundsException;
import org.maplibre.android.utils.ExtensionsKt;

/* compiled from: LatLngBounds.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 G2\u00020\u0001:\u0002FGB)\b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u0003J\u0006\u0010\u000e\u001a\u00020\u0003J\u0006\u0010\u000f\u001a\u00020\u0003J\u0006\u0010\u0010\u001a\u00020\u0003J\b\u0010%\u001a\u00020&H\u0016J\u0011\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0(¢\u0006\u0002\u0010)J\u000e\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020\nJ\u0013\u0010,\u001a\u00020#2\b\u0010-\u001a\u0004\u0018\u00010.H\u0096\u0002J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\u0003H\u0002J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u00020\u0003H\u0002J\u0011\u00103\u001a\u00020#2\u0006\u0010+\u001a\u00020\nH\u0086\u0002J\u0011\u00103\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0000H\u0086\u0002J\u000e\u00104\u001a\u00020\u00002\u0006\u00105\u001a\u00020\u0000J&\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003J(\u0010:\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0002J\u0010\u0010;\u001a\u0004\u0018\u00010\u00002\u0006\u0010<\u001a\u00020\u0000J&\u0010;\u001a\u00020\u00002\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003J*\u0010=\u001a\u0004\u0018\u00010\u00002\u0006\u00106\u001a\u00020\u00032\u0006\u00107\u001a\u00020\u00032\u0006\u00108\u001a\u00020\u00032\u0006\u00109\u001a\u00020\u0003H\u0002J\b\u0010>\u001a\u00020?H\u0016J\b\u0010@\u001a\u00020?H\u0016J\u0018\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020?H\u0016R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0011\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0011\u0010\u0013\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\fR\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\fR\u0011\u0010\u0017\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\fR\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b!\u0010\u001fR\u0011\u0010\"\u001a\u00020#8F¢\u0006\u0006\u001a\u0004\b\"\u0010$¨\u0006H"}, d2 = {"Lorg/maplibre/android/geometry/LatLngBounds;", "Landroid/os/Parcelable;", "latitudeNorth", "", "longitudeEast", "latitudeSouth", "longitudeWest", "<init>", "(DDDD)V", "center", "Lorg/maplibre/android/geometry/LatLng;", "getCenter", "()Lorg/maplibre/android/geometry/LatLng;", "getLatNorth", "getLatSouth", "getLonEast", "getLonWest", "southWest", "getSouthWest", "northEast", "getNorthEast", "southEast", "getSouthEast", "northWest", "getNorthWest", "span", "Lorg/maplibre/android/geometry/LatLngSpan;", "getSpan", "()Lorg/maplibre/android/geometry/LatLngSpan;", "latitudeSpan", "getLatitudeSpan", "()D", "longitudeSpan", "getLongitudeSpan", "isEmptySpan", "", "()Z", "toString", "", "toLatLngs", "", "()[Lorg/maplibre/android/geometry/LatLng;", "include", "latLng", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "", "containsLatitude", "latitude", "containsLongitude", "longitude", "contains", "union", "bounds", "northLat", "eastLon", "southLat", "westLon", "unionNoParamCheck", "intersect", "box", "intersectNoParamCheck", "hashCode", "", "describeContents", "writeToParcel", "", "out", "Landroid/os/Parcel;", "flags", "Builder", "Companion", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class LatLngBounds implements Parcelable {
    public final double latitudeNorth;
    public final double latitudeSouth;
    public final double longitudeEast;
    public final double longitudeWest;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new Parcelable.Creator<LatLngBounds>() { // from class: org.maplibre.android.geometry.LatLngBounds$Companion$CREATOR$1
        @Override // android.os.Parcelable.Creator
        public LatLngBounds createFromParcel(Parcel parcel) {
            LatLngBounds readFromParcel;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            readFromParcel = LatLngBounds.INSTANCE.readFromParcel(parcel);
            return readFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        public LatLngBounds[] newArray(int size) {
            return new LatLngBounds[size];
        }
    };

    @JvmStatic
    public static final LatLngBounds from(double d, double d2, double d3, double d4) {
        return INSTANCE.from(d, d2, d3, d4);
    }

    @JvmStatic
    public static final LatLngBounds from(int i, int i2, int i3) {
        return INSTANCE.from(i, i2, i3);
    }

    @JvmStatic
    public static final LatLngBounds world() {
        return INSTANCE.world();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public LatLngBounds(double d, double d2, double d3, double d4) {
        this.latitudeNorth = d;
        this.longitudeEast = d2;
        this.latitudeSouth = d3;
        this.longitudeWest = d4;
    }

    public final LatLng getCenter() {
        return new LatLng((this.latitudeNorth + this.latitudeSouth) / 2.0d, (this.longitudeEast + this.longitudeWest) / 2.0d);
    }

    /* renamed from: getLatNorth, reason: from getter */
    public final double getLatitudeNorth() {
        return this.latitudeNorth;
    }

    /* renamed from: getLatSouth, reason: from getter */
    public final double getLatitudeSouth() {
        return this.latitudeSouth;
    }

    /* renamed from: getLonEast, reason: from getter */
    public final double getLongitudeEast() {
        return this.longitudeEast;
    }

    /* renamed from: getLonWest, reason: from getter */
    public final double getLongitudeWest() {
        return this.longitudeWest;
    }

    public final LatLng getSouthWest() {
        return new LatLng(this.latitudeSouth, this.longitudeWest);
    }

    public final LatLng getNorthEast() {
        return new LatLng(this.latitudeNorth, this.longitudeEast);
    }

    public final LatLng getSouthEast() {
        return new LatLng(this.latitudeSouth, this.longitudeEast);
    }

    public final LatLng getNorthWest() {
        return new LatLng(this.latitudeNorth, this.longitudeWest);
    }

    public final LatLngSpan getSpan() {
        return new LatLngSpan(getLatitudeSpan(), getLongitudeSpan());
    }

    public final double getLatitudeSpan() {
        return Math.abs(this.latitudeNorth - this.latitudeSouth);
    }

    public final double getLongitudeSpan() {
        return Math.abs(this.longitudeEast - this.longitudeWest);
    }

    public final boolean isEmptySpan() {
        return getLongitudeSpan() == 0.0d || getLatitudeSpan() == 0.0d;
    }

    public String toString() {
        return "N:" + this.latitudeNorth + "; E:" + this.longitudeEast + "; S:" + this.latitudeSouth + "; W:" + this.longitudeWest;
    }

    public final LatLng[] toLatLngs() {
        return new LatLng[]{getNorthEast(), getSouthWest()};
    }

    public final LatLngBounds include(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return new Builder().include(getNorthEast()).include(getSouthWest()).include(latLng).build();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) other;
        return this.latitudeNorth == latLngBounds.latitudeNorth && this.latitudeSouth == latLngBounds.latitudeSouth && this.longitudeEast == latLngBounds.longitudeEast && this.longitudeWest == latLngBounds.longitudeWest;
    }

    private final boolean containsLatitude(double latitude) {
        return latitude <= this.latitudeNorth && latitude >= this.latitudeSouth;
    }

    private final boolean containsLongitude(double longitude) {
        return longitude <= this.longitudeEast && longitude >= this.longitudeWest;
    }

    public final boolean contains(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        return containsLatitude(latLng.getLatitude()) && containsLongitude(latLng.getLongitude());
    }

    public final boolean contains(LatLngBounds other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return contains(other.getNorthEast()) && contains(other.getSouthWest());
    }

    public final LatLngBounds union(LatLngBounds bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        return unionNoParamCheck(bounds.latitudeNorth, bounds.longitudeEast, bounds.latitudeSouth, bounds.longitudeWest);
    }

    public final LatLngBounds union(double northLat, double eastLon, double southLat, double westLon) {
        INSTANCE.checkParams(northLat, eastLon, southLat, westLon);
        return unionNoParamCheck(northLat, eastLon, southLat, westLon);
    }

    private final LatLngBounds unionNoParamCheck(double northLat, double eastLon, double southLat, double westLon) {
        double d = this.latitudeNorth;
        if (d >= northLat) {
            northLat = d;
        }
        double d2 = this.longitudeEast;
        if (d2 >= eastLon) {
            eastLon = d2;
        }
        double d3 = this.latitudeSouth;
        if (d3 <= southLat) {
            southLat = d3;
        }
        double d4 = this.longitudeWest;
        if (d4 <= westLon) {
            westLon = d4;
        }
        return new LatLngBounds(northLat, eastLon, southLat, westLon);
    }

    public final LatLngBounds intersect(LatLngBounds box) {
        Intrinsics.checkNotNullParameter(box, "box");
        return intersectNoParamCheck(box.latitudeNorth, box.longitudeEast, box.latitudeSouth, box.longitudeWest);
    }

    public final LatLngBounds intersect(double northLat, double eastLon, double southLat, double westLon) {
        INSTANCE.checkParams(northLat, eastLon, southLat, westLon);
        LatLngBounds intersectNoParamCheck = intersectNoParamCheck(northLat, eastLon, southLat, westLon);
        Intrinsics.checkNotNull(intersectNoParamCheck);
        return intersectNoParamCheck;
    }

    private final LatLngBounds intersectNoParamCheck(double northLat, double eastLon, double southLat, double westLon) {
        double max = Math.max(this.longitudeWest, westLon);
        double min = Math.min(this.longitudeEast, eastLon);
        if (min < max) {
            return null;
        }
        double max2 = Math.max(this.latitudeSouth, southLat);
        double min2 = Math.min(this.latitudeNorth, northLat);
        if (min2 >= max2) {
            return new LatLngBounds(min2, min, max2, max);
        }
        return null;
    }

    public int hashCode() {
        double d = 90;
        double d2 = 180;
        return (int) (this.latitudeNorth + d + ((this.latitudeSouth + d) * 1000) + ((this.longitudeEast + d2) * DurationKt.NANOS_IN_MILLIS) + ((this.longitudeWest + d2) * Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel out, int flags) {
        Intrinsics.checkNotNullParameter(out, "out");
        out.writeDouble(this.latitudeNorth);
        out.writeDouble(this.longitudeEast);
        out.writeDouble(this.latitudeSouth);
        out.writeDouble(this.longitudeWest);
    }

    /* compiled from: LatLngBounds.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0007\u001a\u00020\bJ\u0014\u0010\t\u001a\u00020\u00002\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bJ\u000e\u0010\f\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lorg/maplibre/android/geometry/LatLngBounds$Builder;", "", "<init>", "()V", "latLngList", "", "Lorg/maplibre/android/geometry/LatLng;", "build", "Lorg/maplibre/android/geometry/LatLngBounds;", "includes", "latLngs", "", "include", "latLng", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Builder {
        private final List<LatLng> latLngList = new ArrayList();

        public final LatLngBounds build() {
            if (this.latLngList.size() < 2) {
                throw new InvalidLatLngBoundsException(this.latLngList.size());
            }
            return LatLngBounds.INSTANCE.fromLatLngs(this.latLngList);
        }

        public final Builder includes(List<LatLng> latLngs) {
            Intrinsics.checkNotNullParameter(latLngs, "latLngs");
            this.latLngList.addAll(latLngs);
            return this;
        }

        public final Builder include(LatLng latLng) {
            Intrinsics.checkNotNullParameter(latLng, "latLng");
            this.latLngList.add(latLng);
            return this;
        }
    }

    /* compiled from: LatLngBounds.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0014\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ,\u0010\n\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0007J,\u0010\u0010\u001a\u00020\u00112\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\fH\u0002J\u0018\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\u0018\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0002J \u0010\n\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0014H\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u001cH\u0002R\u0018\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00198\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lorg/maplibre/android/geometry/LatLngBounds$Companion;", "", "<init>", "()V", "world", "Lorg/maplibre/android/geometry/LatLngBounds;", "fromLatLngs", "latLngs", "", "Lorg/maplibre/android/geometry/LatLng;", "from", "latNorth", "", "lonEast", "latSouth", "lonWest", "checkParams", "", "lat_", "z", "", "y", "lon_", "x", "CREATOR", "Landroid/os/Parcelable$Creator;", "readFromParcel", "parcel", "Landroid/os/Parcel;", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LatLngBounds world() {
            return from(90.0d, 180.0d, -90.0d, -180.0d);
        }

        public final LatLngBounds fromLatLngs(List<LatLng> latLngs) {
            Intrinsics.checkNotNullParameter(latLngs, "latLngs");
            double d = Double.MAX_VALUE;
            double d2 = 90.0d;
            double d3 = -90.0d;
            double d4 = -1.7976931348623157E308d;
            for (LatLng latLng : latLngs) {
                double latitude = latLng.getLatitude();
                double longitude = latLng.getLongitude();
                d2 = Math.min(d2, latitude);
                d = Math.min(d, longitude);
                d3 = Math.max(d3, latitude);
                d4 = Math.max(d4, longitude);
            }
            return new LatLngBounds(d3, d4, d2, d);
        }

        @JvmStatic
        public final LatLngBounds from(double latNorth, double lonEast, double latSouth, double lonWest) {
            checkParams(latNorth, lonEast, latSouth, lonWest);
            return new LatLngBounds(latNorth, lonEast, latSouth, lonWest);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkParams(double latNorth, double lonEast, double latSouth, double lonWest) {
            if (ExtensionsKt.isNaN(DoubleCompanionObject.INSTANCE, latNorth) || ExtensionsKt.isNaN(DoubleCompanionObject.INSTANCE, latSouth)) {
                throw new IllegalArgumentException("latitude must not be NaN".toString());
            }
            if (ExtensionsKt.isNaN(DoubleCompanionObject.INSTANCE, lonEast) || ExtensionsKt.isNaN(DoubleCompanionObject.INSTANCE, lonWest)) {
                throw new IllegalArgumentException("longitude must not be NaN".toString());
            }
            if (ExtensionsKt.isInfinite(DoubleCompanionObject.INSTANCE, lonEast) || ExtensionsKt.isInfinite(DoubleCompanionObject.INSTANCE, lonWest)) {
                throw new IllegalArgumentException("longitude must not be infinite".toString());
            }
            if (latNorth > 90.0d || latNorth < -90.0d || latSouth > 90.0d || latSouth < -90.0d) {
                throw new IllegalArgumentException("latitude must be between -90 and 90".toString());
            }
            if (latNorth < latSouth) {
                throw new IllegalArgumentException("latNorth cannot be less than latSouth".toString());
            }
            if (lonEast < lonWest) {
                throw new IllegalArgumentException("lonEast cannot be less than lonWest".toString());
            }
        }

        private final double lat_(int z, int y) {
            double pow = 3.141592653589793d - ((y * 6.283185307179586d) / Math.pow(2.0d, z));
            return Math.toDegrees(Math.atan((Math.exp(pow) - Math.exp(-pow)) * 0.5d));
        }

        private final double lon_(int z, int x) {
            return ((x / Math.pow(2.0d, z)) * 360.0d) - 180.0d;
        }

        @JvmStatic
        public final LatLngBounds from(int z, int x, int y) {
            return new LatLngBounds(lat_(z, y), lon_(z, x + 1), lat_(z, y + 1), lon_(z, x));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final LatLngBounds readFromParcel(Parcel parcel) {
            return new LatLngBounds(parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble());
        }
    }
}
