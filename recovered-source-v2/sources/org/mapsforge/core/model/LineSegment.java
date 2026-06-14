package org.mapsforge.core.model;

/* loaded from: classes5.dex */
public final class LineSegment {
    private static int BOTTOM = 4;
    private static int INSIDE = 0;
    private static int LEFT = 1;
    private static int RIGHT = 2;
    private static int TOP = 8;
    public final Point end;
    public final Point start;

    public LineSegment(Point point, Point point2) {
        this.start = point;
        this.end = point2;
    }

    public LineSegment(Point point, Point point2, double d) {
        this.start = point;
        this.end = new LineSegment(point, point2).pointAlongLineSegment(d);
    }

    public double angleTo(LineSegment lineSegment) {
        double degrees = Math.toDegrees(Math.atan2(this.start.y - this.end.y, this.start.x - this.end.x) - Math.atan2(lineSegment.start.y - lineSegment.end.y, lineSegment.start.x - lineSegment.end.x));
        if (degrees <= -180.0d) {
            degrees += 360.0d;
        }
        return degrees >= 180.0d ? degrees - 360.0d : degrees;
    }

    public LineSegment clipToRectangle(Rectangle rectangle) {
        double d;
        double d2;
        Point point = this.start;
        Point point2 = this.end;
        int code = code(rectangle, point);
        int code2 = code(rectangle, point2);
        while ((code | code2) != 0) {
            if ((code & code2) != 0) {
                return null;
            }
            int i = code != 0 ? code : code2;
            if ((TOP & i) != 0) {
                d2 = point.x + (((point2.x - point.x) * (rectangle.top - point.y)) / (point2.y - point.y));
                d = rectangle.top;
            } else if ((BOTTOM & i) != 0) {
                d2 = point.x + (((point2.x - point.x) * (rectangle.bottom - point.y)) / (point2.y - point.y));
                d = rectangle.bottom;
            } else if ((RIGHT & i) != 0) {
                d = (((point2.y - point.y) * (rectangle.right - point.x)) / (point2.x - point.x)) + point.y;
                d2 = rectangle.right;
            } else if ((LEFT & i) != 0) {
                d = (((point2.y - point.y) * (rectangle.left - point.x)) / (point2.x - point.x)) + point.y;
                d2 = rectangle.left;
            } else {
                throw new IllegalStateException("Should not get here");
            }
            if (i == code) {
                point = new Point(d2, d);
                code = code(rectangle, point);
            } else {
                point2 = new Point(d2, d);
                code2 = code(rectangle, point2);
            }
        }
        return new LineSegment(point, point2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineSegment)) {
            return false;
        }
        LineSegment lineSegment = (LineSegment) obj;
        return lineSegment.start.equals(this.start) && lineSegment.end.equals(this.end);
    }

    public int hashCode() {
        return ((this.start.hashCode() + 31) * 31) + this.end.hashCode();
    }

    public boolean intersectsRectangle(Rectangle rectangle, boolean z) {
        int code = code(rectangle, this.start);
        int code2 = code(rectangle, this.end);
        if ((code | code2) == 0) {
            return true;
        }
        if ((code2 & code) != 0) {
            return false;
        }
        return z;
    }

    public double length() {
        return this.start.distance(this.end);
    }

    public Point pointAlongLineSegment(double d) {
        if (this.start.x == this.end.x) {
            if (this.start.y > this.end.y) {
                return new Point(this.end.x, this.end.y + d);
            }
            return new Point(this.start.x, this.start.y + d);
        }
        double d2 = (this.end.y - this.start.y) / (this.end.x - this.start.x);
        double sqrt = Math.sqrt((d * d) / ((d2 * d2) + 1.0d));
        if (this.end.x < this.start.x) {
            sqrt *= -1.0d;
        }
        return new Point(this.start.x + sqrt, this.start.y + (d2 * sqrt));
    }

    public LineSegment reverse() {
        return new LineSegment(this.end, this.start);
    }

    public LineSegment subSegment(double d, double d2) {
        return new LineSegment(pointAlongLineSegment(d), pointAlongLineSegment(d + d2));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.start).append(" ").append(this.end);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int code(Rectangle rectangle, Point point) {
        int i;
        int i2;
        int i3 = INSIDE;
        if (point.x >= rectangle.left) {
            if (point.x > rectangle.right) {
                i = RIGHT;
            }
            if (point.y <= rectangle.bottom) {
                i2 = BOTTOM;
            } else {
                if (point.y >= rectangle.top) {
                    return i3;
                }
                i2 = TOP;
            }
            return i3 | i2;
        }
        i = LEFT;
        i3 |= i;
        if (point.y <= rectangle.bottom) {
        }
        return i3 | i2;
    }
}
