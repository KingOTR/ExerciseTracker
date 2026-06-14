package org.mapsforge.core.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.mapsforge.core.util.LatLongUtils;
import org.mapsforge.core.util.Parameters;

/* loaded from: classes5.dex */
public class LatLong implements Comparable<LatLong> {
    private static final Pattern WKT_POINT_PATTERN = Pattern.compile(".*POINT\\s?\\(([\\d\\.]+)\\s([\\d\\.]+)\\).*");
    public final double latitude;
    public final double longitude;

    public LatLong(double d, double d2) throws IllegalArgumentException {
        this.latitude = Parameters.VALIDATE_COORDINATES ? LatLongUtils.validateLatitude(d) : d;
        this.longitude = Parameters.VALIDATE_COORDINATES ? LatLongUtils.validateLongitude(d2) : d2;
    }

    public LatLong(String str) {
        Matcher matcher = WKT_POINT_PATTERN.matcher(str);
        matcher.matches();
        double parseDouble = Double.parseDouble(matcher.group(1));
        this.longitude = Parameters.VALIDATE_COORDINATES ? LatLongUtils.validateLongitude(parseDouble) : parseDouble;
        double parseDouble2 = Double.parseDouble(matcher.group(2));
        this.latitude = Parameters.VALIDATE_COORDINATES ? LatLongUtils.validateLatitude(parseDouble2) : parseDouble2;
    }

    @Override // java.lang.Comparable
    public int compareTo(LatLong latLong) {
        double d = this.latitude;
        double d2 = latLong.latitude;
        if (d > d2) {
            return 1;
        }
        double d3 = this.longitude;
        double d4 = latLong.longitude;
        if (d3 > d4) {
            return 1;
        }
        return (d < d2 || d3 < d4) ? -1 : 0;
    }

    public LatLong destinationPoint(double d, float f) {
        return LatLongUtils.destinationPoint(this, d, f);
    }

    public double distance(LatLong latLong) {
        return LatLongUtils.distance(this, latLong);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLong)) {
            return false;
        }
        LatLong latLong = (LatLong) obj;
        return this.latitude == latLong.latitude && this.longitude == latLong.longitude;
    }

    public static LatLong fromMicroDegrees(int i, int i2) {
        return new LatLong(LatLongUtils.microdegreesToDegrees(i), LatLongUtils.microdegreesToDegrees(i2));
    }

    public static LatLong fromString(String str) {
        String[] split = str.split("[,;:\\s]");
        if (split.length != 2) {
            throw new IllegalArgumentException("cannot read coordinate, not a valid format");
        }
        return new LatLong(Double.parseDouble(split[0]), Double.parseDouble(split[1]));
    }

    public double getLatitude() {
        return this.latitude;
    }

    public int getLatitudeE6() {
        return LatLongUtils.degreesToMicrodegrees(this.latitude);
    }

    public double getLongitude() {
        return this.longitude;
    }

    public int getLongitudeE6() {
        return LatLongUtils.degreesToMicrodegrees(this.longitude);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.latitude);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.longitude);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public double sphericalDistance(LatLong latLong) {
        return LatLongUtils.sphericalDistance(this, latLong);
    }

    public String toString() {
        return "latitude=" + this.latitude + ", longitude=" + this.longitude;
    }

    public double vincentyDistance(LatLong latLong) {
        return LatLongUtils.vincentyDistance(this, latLong);
    }
}
