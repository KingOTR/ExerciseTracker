package org.mapsforge.map.layer.renderer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.Curve;
import org.mapsforge.core.graphics.Filter;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.GraphicUtils;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.graphics.Path;
import org.mapsforge.core.mapelements.MapElementContainer;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.model.Tile;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.rendertheme.RenderContext;

/* loaded from: classes5.dex */
public class CanvasRasterer {
    private final Canvas canvas;
    private final Path path;
    private final Matrix symbolMatrix;

    public CanvasRasterer(GraphicFactory graphicFactory) {
        this.canvas = graphicFactory.createCanvas();
        this.path = graphicFactory.createPath();
        this.symbolMatrix = graphicFactory.createMatrix();
    }

    public void destroy() {
        this.canvas.destroy();
    }

    void drawWays(RenderContext renderContext) {
        int size = renderContext.ways.get(0).size();
        int size2 = renderContext.ways.size();
        for (int i = 0; i < size2; i++) {
            List<List<ShapePaintContainer>> list = renderContext.ways.get(i);
            for (int i2 = 0; i2 < size; i2++) {
                List<ShapePaintContainer> list2 = list.get(i2);
                for (int size3 = list2.size() - 1; size3 >= 0; size3--) {
                    drawShapePaintContainer(renderContext, list2.get(size3));
                }
            }
        }
    }

    void drawMapElements(Set<MapElementContainer> set, Tile tile) {
        ArrayList arrayList = new ArrayList(set);
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((MapElementContainer) it.next()).draw(this.canvas, tile.getOrigin(), this.symbolMatrix, Filter.NONE);
        }
    }

    void fill(int i) {
        if (GraphicUtils.getAlpha(i) > 0) {
            this.canvas.fillColor(i);
        }
    }

    void fillOutsideAreas(Color color, Rectangle rectangle) {
        this.canvas.setClipDifference((int) rectangle.left, (int) rectangle.top, (int) rectangle.getWidth(), (int) rectangle.getHeight());
        this.canvas.fillColor(color);
        this.canvas.resetClip();
    }

    void fillOutsideAreas(int i, Rectangle rectangle) {
        this.canvas.setClipDifference((int) rectangle.left, (int) rectangle.top, (int) rectangle.getWidth(), (int) rectangle.getHeight());
        this.canvas.fillColor(i);
        this.canvas.resetClip();
    }

    void setCanvasBitmap(Bitmap bitmap) {
        this.canvas.setBitmap(bitmap);
    }

    private void drawCircleContainer(ShapePaintContainer shapePaintContainer) {
        CircleContainer circleContainer = (CircleContainer) shapePaintContainer.shapeContainer;
        Point point = circleContainer.point;
        this.canvas.drawCircle((int) point.x, (int) point.y, (int) circleContainer.radius, shapePaintContainer.paint);
    }

    private void drawHillshading(HillshadingContainer hillshadingContainer) {
        this.canvas.shadeBitmap(hillshadingContainer.bitmap, hillshadingContainer.hillsRect, hillshadingContainer.tileRect, hillshadingContainer.magnitude);
    }

    private void drawPath(RenderContext renderContext, ShapePaintContainer shapePaintContainer, Point[][] pointArr, float f) {
        Point[][] pointArr2 = pointArr;
        float f2 = f;
        this.path.clear();
        int length = pointArr2.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Point[] pointArr3 = pointArr2[i];
            if (f2 != 0.0f) {
                pointArr3 = RendererUtils.parallelPath(pointArr3, f2);
            }
            if (pointArr3.length >= 2) {
                if (shapePaintContainer.curveStyle == Curve.CUBIC) {
                    float[] fArr = {(float) pointArr3[0].x, (float) pointArr3[0].y};
                    float[] fArr2 = {0.0f, 0.0f};
                    float[] fArr3 = {0.0f, 0.0f};
                    this.path.moveTo(fArr[0], fArr[1]);
                    for (int i2 = 1; i2 < pointArr3.length; i2++) {
                        fArr3[0] = (float) pointArr3[i2].x;
                        float f3 = (float) pointArr3[i2].y;
                        fArr3[1] = f3;
                        float f4 = (fArr[0] + fArr3[0]) / 2.0f;
                        fArr2[0] = f4;
                        float f5 = (fArr[1] + f3) / 2.0f;
                        fArr2[1] = f5;
                        this.path.quadTo(fArr[0], fArr[1], f4, f5);
                        fArr[0] = fArr3[0];
                        fArr[1] = fArr3[1];
                    }
                    this.path.quadTo(fArr2[0], fArr2[1], fArr3[0], fArr3[1]);
                } else {
                    this.path.moveTo((float) pointArr3[0].x, (float) pointArr3[0].y);
                    for (int i3 = 1; i3 < pointArr3.length; i3++) {
                        this.path.lineTo((int) pointArr3[i3].x, (int) pointArr3[i3].y);
                    }
                }
            }
            i++;
            pointArr2 = pointArr;
            f2 = f;
        }
        if (Parameters.NUMBER_OF_THREADS > 1) {
            synchronized (shapePaintContainer.paint) {
                shapePaintContainer.paint.setBitmapShaderShift(renderContext.rendererJob.tile.getOrigin());
                this.canvas.drawPath(this.path, shapePaintContainer.paint);
            }
            return;
        }
        this.canvas.drawPath(this.path, shapePaintContainer.paint);
    }

    private void drawShapePaintContainer(RenderContext renderContext, ShapePaintContainer shapePaintContainer) {
        ShapeContainer shapeContainer = shapePaintContainer.shapeContainer;
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$map$layer$renderer$ShapeType[shapeContainer.getShapeType().ordinal()];
        if (i == 1) {
            drawCircleContainer(shapePaintContainer);
        } else if (i == 2) {
            drawHillshading((HillshadingContainer) shapeContainer);
        } else {
            if (i != 3) {
                return;
            }
            drawPath(renderContext, shapePaintContainer, ((PolylineContainer) shapeContainer).getCoordinatesRelativeToOrigin(), shapePaintContainer.dy);
        }
    }

    /* renamed from: org.mapsforge.map.layer.renderer.CanvasRasterer$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$map$layer$renderer$ShapeType;

        static {
            int[] iArr = new int[ShapeType.values().length];
            $SwitchMap$org$mapsforge$map$layer$renderer$ShapeType = iArr;
            try {
                iArr[ShapeType.CIRCLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$map$layer$renderer$ShapeType[ShapeType.HILLSHADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$map$layer$renderer$ShapeType[ShapeType.POLYLINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }
}
