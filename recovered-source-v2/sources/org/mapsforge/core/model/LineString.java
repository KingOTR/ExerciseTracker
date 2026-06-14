package org.mapsforge.core.model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes5.dex */
public class LineString {
    public final List<LineSegment> segments = new ArrayList();

    public void LineString() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineString)) {
            return false;
        }
        LineString lineString = (LineString) obj;
        if (lineString.segments.size() != this.segments.size()) {
            return false;
        }
        for (int i = 0; i < this.segments.size(); i++) {
            if (!this.segments.get(i).equals(lineString.segments.get(i))) {
                return false;
            }
        }
        return true;
    }

    public LineString extractPart(double d, double d2) {
        LineString lineString = new LineString();
        for (int i = 0; i < this.segments.size(); i++) {
            LineSegment lineSegment = this.segments.get(i);
            double length = lineSegment.length();
            if (length >= d) {
                Point pointAlongLineSegment = d >= 0.0d ? lineSegment.pointAlongLineSegment(d) : null;
                Point pointAlongLineSegment2 = d2 < length ? lineSegment.pointAlongLineSegment(d2) : null;
                if (pointAlongLineSegment != null && pointAlongLineSegment2 == null) {
                    lineString.segments.add(new LineSegment(pointAlongLineSegment, lineSegment.end));
                } else if (pointAlongLineSegment == null && pointAlongLineSegment2 == null) {
                    lineString.segments.add(lineSegment);
                } else if (pointAlongLineSegment == null && pointAlongLineSegment2 != null) {
                    lineString.segments.add(new LineSegment(lineSegment.start, pointAlongLineSegment2));
                } else if (pointAlongLineSegment != null && pointAlongLineSegment2 != null) {
                    lineString.segments.add(new LineSegment(pointAlongLineSegment, pointAlongLineSegment2));
                }
                if (pointAlongLineSegment2 != null) {
                    break;
                }
            }
            d -= this.segments.get(i).length();
            d2 -= this.segments.get(i).length();
        }
        return lineString;
    }

    public Rectangle getBounds() {
        double d = Double.MAX_VALUE;
        double d2 = Double.MAX_VALUE;
        double d3 = Double.MIN_VALUE;
        double d4 = Double.MIN_VALUE;
        for (LineSegment lineSegment : this.segments) {
            d = Math.min(d, Math.min(lineSegment.start.x, lineSegment.end.x));
            d2 = Math.min(d2, Math.min(lineSegment.start.y, lineSegment.end.y));
            d3 = Math.max(d3, Math.max(lineSegment.start.x, lineSegment.end.x));
            d4 = Math.max(d4, Math.max(lineSegment.start.y, lineSegment.end.y));
        }
        return new Rectangle(d, d2, d3, d4);
    }

    public Point interpolate(double d) {
        if (d < 0.0d) {
            return null;
        }
        for (LineSegment lineSegment : this.segments) {
            double length = lineSegment.length();
            if (d <= length) {
                return lineSegment.pointAlongLineSegment(d);
            }
            d -= length;
        }
        return null;
    }

    public double length() {
        Iterator<LineSegment> it = this.segments.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            d += it.next().length();
        }
        return d;
    }
}
