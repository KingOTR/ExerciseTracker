package org.mapsforge.map.layer.renderer;

import org.mapsforge.core.model.Point;

/* loaded from: classes5.dex */
class RendererUtils {
    private static final double ANGLE_LIMIT = 170.0d;
    private static final double ANGLE_LIMIT_COS = Math.cos(Math.toRadians(ANGLE_LIMIT));

    static Point[] parallelPath(Point[] pointArr, double d) {
        Point[] pointArr2 = pointArr;
        int length = pointArr2.length;
        int i = length - 1;
        Point[] pointArr3 = new Point[i];
        Point[] pointArr4 = new Point[pointArr2.length];
        int i2 = 0;
        while (i2 < i) {
            int i3 = i2 + 1;
            double d2 = pointArr2[i3].x - pointArr2[i2].x;
            double d3 = pointArr2[i3].y - pointArr2[i2].y;
            double sqrt = Math.sqrt((d2 * d2) + (d3 * d3));
            if (sqrt == 0.0d) {
                pointArr3[i2] = new Point(0.0d, 0.0d);
            } else {
                pointArr3[i2] = new Point(d2 / sqrt, d3 / sqrt);
            }
            if (i2 != 0) {
                int i4 = i2 - 1;
                if ((pointArr3[i2].x * pointArr3[i4].x) + (pointArr3[i2].y * pointArr3[i4].y) < ANGLE_LIMIT_COS) {
                    return pointArr2;
                }
            }
            i2 = i3;
        }
        pointArr4[0] = new Point(pointArr2[0].x - (pointArr3[0].y * d), pointArr2[0].y + (pointArr3[0].x * d));
        int i5 = 1;
        while (i5 < i) {
            int i6 = i5 - 1;
            double d4 = d / (((pointArr3[i5].x * pointArr3[i6].x) + 1.0d) + (pointArr3[i5].y * pointArr3[i6].y));
            pointArr4[i5] = new Point(pointArr2[i5].x - ((pointArr3[i5].y + pointArr3[i6].y) * d4), pointArr2[i5].y + (d4 * (pointArr3[i5].x + pointArr3[i6].x)));
            i5++;
            pointArr2 = pointArr;
            length = length;
        }
        int i7 = length - 2;
        pointArr4[i] = new Point(pointArr[i].x - (pointArr3[i7].y * d), pointArr[i].y + (pointArr3[i7].x * d));
        return pointArr4;
    }

    private RendererUtils() {
        throw new IllegalStateException();
    }
}
