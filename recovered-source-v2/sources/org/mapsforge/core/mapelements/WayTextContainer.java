package org.mapsforge.core.mapelements;

import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.Filter;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.GraphicUtils;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Path;
import org.mapsforge.core.graphics.TextOrientation;
import org.mapsforge.core.model.LineSegment;
import org.mapsforge.core.model.LineString;
import org.mapsforge.core.model.Point;

/* loaded from: classes5.dex */
public class WayTextContainer extends MapElementContainer {
    private final GraphicFactory graphicFactory;
    private final LineString lineString;
    private final Paint paintBack;
    private final Paint paintFront;
    private final String text;
    private final TextOrientation textOrientation;

    public WayTextContainer(GraphicFactory graphicFactory, LineString lineString, Display display, int i, String str, Paint paint, Paint paint2, double d, TextOrientation textOrientation) {
        super(lineString.segments.get(0).start, display, i);
        this.graphicFactory = graphicFactory;
        this.lineString = lineString;
        this.text = str;
        this.paintFront = paint;
        this.paintBack = paint2;
        this.boundary = null;
        double d2 = d / 2.0d;
        this.boundaryAbsolute = lineString.getBounds().enlarge(d2, d2, d2, d2);
        this.textOrientation = textOrientation;
    }

    @Override // org.mapsforge.core.mapelements.MapElementContainer
    public void draw(Canvas canvas, Point point, Matrix matrix, Filter filter) {
        Path generatePath = generatePath(point);
        Paint paint = this.paintBack;
        if (paint != null) {
            int color = paint.getColor();
            if (filter != Filter.NONE) {
                this.paintBack.setColor(GraphicUtils.filterColor(color, filter));
            }
            canvas.drawPathText(this.text, generatePath, this.paintBack);
            if (filter != Filter.NONE) {
                this.paintBack.setColor(color);
            }
        }
        int color2 = this.paintFront.getColor();
        if (filter != Filter.NONE) {
            this.paintFront.setColor(GraphicUtils.filterColor(color2, filter));
        }
        canvas.drawPathText(this.text, generatePath, this.paintFront);
        if (filter != Filter.NONE) {
            this.paintFront.setColor(color2);
        }
    }

    private Path generatePath(Point point) {
        LineSegment lineSegment = this.lineString.segments.get(0);
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$TextOrientation[this.textOrientation.ordinal()];
        boolean z = i == 1 ? lineSegment.end.x > lineSegment.start.x : !(i == 2 || (i != 3 && lineSegment.end.x > lineSegment.start.x));
        Path createPath = this.graphicFactory.createPath();
        if (!z) {
            Point offset = lineSegment.start.offset(-point.x, -point.y);
            createPath.moveTo((float) offset.x, (float) offset.y);
            for (int i2 = 0; i2 < this.lineString.segments.size(); i2++) {
                Point offset2 = this.lineString.segments.get(i2).end.offset(-point.x, -point.y);
                createPath.lineTo((float) offset2.x, (float) offset2.y);
            }
        } else {
            Point offset3 = this.lineString.segments.get(this.lineString.segments.size() - 1).end.offset(-point.x, -point.y);
            createPath.moveTo((float) offset3.x, (float) offset3.y);
            for (int size = this.lineString.segments.size() - 1; size >= 0; size--) {
                Point offset4 = this.lineString.segments.get(size).start.offset(-point.x, -point.y);
                createPath.lineTo((float) offset4.x, (float) offset4.y);
            }
        }
        return createPath;
    }

    /* renamed from: org.mapsforge.core.mapelements.WayTextContainer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$graphics$TextOrientation;

        static {
            int[] iArr = new int[TextOrientation.values().length];
            $SwitchMap$org$mapsforge$core$graphics$TextOrientation = iArr;
            try {
                iArr[TextOrientation.AUTO_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$TextOrientation[TextOrientation.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$TextOrientation[TextOrientation.LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // org.mapsforge.core.mapelements.MapElementContainer
    public String toString() {
        return super.toString() + ", text=" + this.text;
    }
}
