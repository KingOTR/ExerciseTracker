package org.mapsforge.core.model;

import java.io.Serializable;

/* loaded from: classes5.dex */
public class Point implements Comparable<Point>, Serializable {
    private static final long serialVersionUID = 1;
    public final double x;
    public final double y;

    public Point(double d, double d2) {
        this.x = d;
        this.y = d2;
    }

    @Override // java.lang.Comparable
    public int compareTo(Point point) {
        double d = this.x;
        double d2 = point.x;
        if (d > d2) {
            return 1;
        }
        if (d < d2) {
            return -1;
        }
        double d3 = this.y;
        double d4 = point.y;
        if (d3 > d4) {
            return 1;
        }
        return d3 < d4 ? -1 : 0;
    }

    public double distance(Point point) {
        return Math.hypot(this.x - point.x, this.y - point.y);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return Double.doubleToLongBits(this.x) == Double.doubleToLongBits(point.x) && Double.doubleToLongBits(this.y) == Double.doubleToLongBits(point.y);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.x);
        int i = ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) + 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.y);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public Point offset(double d, double d2) {
        return (0.0d == d && 0.0d == d2) ? this : new Point(this.x + d, this.y + d2);
    }

    public String toString() {
        return "x=" + this.x + ", y=" + this.y;
    }
}
