package org.mapsforge.map.layer.renderer;

import org.mapsforge.core.model.Point;

/* loaded from: classes5.dex */
final class GeometryUtils {
    static Point calculateCenterOfBoundingBox(Point[] pointArr) {
        double d = pointArr[0].x;
        double d2 = pointArr[0].x;
        double d3 = pointArr[0].y;
        double d4 = pointArr[0].y;
        for (Point point : pointArr) {
            if (point.x < d) {
                d = point.x;
            } else if (point.x > d2) {
                d2 = point.x;
            }
            if (point.y < d3) {
                d3 = point.y;
            } else if (point.y > d4) {
                d4 = point.y;
            }
        }
        return new Point((d + d2) / 2.0d, (d4 + d3) / 2.0d);
    }

    private GeometryUtils() {
        throw new IllegalStateException();
    }
}
