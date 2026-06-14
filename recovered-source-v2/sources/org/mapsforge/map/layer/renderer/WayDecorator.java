package org.mapsforge.map.layer.renderer;

import java.util.List;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.SymbolOrientation;
import org.mapsforge.core.graphics.TextOrientation;
import org.mapsforge.core.mapelements.MapElementContainer;
import org.mapsforge.core.mapelements.SymbolContainer;
import org.mapsforge.core.mapelements.WayTextContainer;
import org.mapsforge.core.model.LineSegment;
import org.mapsforge.core.model.LineString;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.model.Tile;

/* loaded from: classes5.dex */
final class WayDecorator {
    private static final double MAX_LABEL_CORNER_ANGLE = 45.0d;

    static void renderSymbol(Bitmap bitmap, Display display, int i, float f, Rectangle rectangle, boolean z, float f2, float f3, SymbolOrientation symbolOrientation, Point[][] pointArr, List<MapElementContainer> list) {
        Point[] parallelPath;
        int i2;
        double atan2;
        float f4;
        int i3 = (int) f3;
        float f5 = 0.0f;
        if (f == 0.0f) {
            parallelPath = pointArr[0];
        } else {
            parallelPath = RendererUtils.parallelPath(pointArr[0], f);
        }
        double d = parallelPath[0].x;
        double d2 = parallelPath[0].y;
        int i4 = 1;
        while (i4 < parallelPath.length) {
            double d3 = parallelPath[i4].x;
            double d4 = parallelPath[i4].y;
            switch (AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$SymbolOrientation[symbolOrientation.ordinal()]) {
                case 1:
                    i2 = i4;
                    if (d3 <= d) {
                        atan2 = Math.atan2(d2 - d4, d - d3);
                    } else {
                        atan2 = Math.atan2(d4 - d2, d3 - d);
                    }
                    f4 = (float) atan2;
                    break;
                case 2:
                    i2 = i4;
                    if (d3 <= d) {
                        atan2 = Math.atan2(d4 - d2, d3 - d);
                    } else {
                        atan2 = Math.atan2(d2 - d4, d - d3);
                    }
                    f4 = (float) atan2;
                    break;
                case 3:
                    i2 = i4;
                    atan2 = Math.atan2(d2 - d4, d - d3);
                    f4 = (float) atan2;
                    break;
                case 4:
                    i2 = i4;
                    atan2 = Math.atan2(d4 - d2, d3 - d);
                    f4 = (float) atan2;
                    break;
                case 5:
                    f4 = f5;
                    i2 = i4;
                    break;
                case 6:
                    f4 = 3.1415927f;
                    i2 = i4;
                    break;
                default:
                    i2 = i4;
                    f4 = 0.0f;
                    break;
            }
            double d5 = d3 - d;
            double d6 = d4 - d2;
            double sqrt = Math.sqrt((d5 * d5) + (d6 * d6));
            double d7 = d5 / sqrt;
            double d8 = d6 / sqrt;
            while (true) {
                double d9 = i3;
                double d10 = d3;
                if ((bitmap.getWidth() * 0.75d) + d9 < sqrt) {
                    list.add(new SymbolContainer(new Point((d9 * d7) + d, (d9 * d8) + d2), display, i, rectangle, bitmap, f4));
                    i3 = (int) (i3 + bitmap.getWidth() + f2);
                    if (!z) {
                        return;
                    } else {
                        d3 = d10;
                    }
                } else {
                    i3 = (int) (d9 - sqrt);
                    if (i3 < 0) {
                        i3 = 0;
                    }
                    i4 = i2 + 1;
                    d2 = d4;
                    d = d10;
                    f5 = 0.0f;
                }
            }
        }
    }

    /* renamed from: org.mapsforge.map.layer.renderer.WayDecorator$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$graphics$SymbolOrientation;

        static {
            int[] iArr = new int[SymbolOrientation.values().length];
            $SwitchMap$org$mapsforge$core$graphics$SymbolOrientation = iArr;
            try {
                iArr[SymbolOrientation.AUTO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$SymbolOrientation[SymbolOrientation.AUTO_DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$SymbolOrientation[SymbolOrientation.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$SymbolOrientation[SymbolOrientation.LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$SymbolOrientation[SymbolOrientation.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$SymbolOrientation[SymbolOrientation.DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static void renderText(GraphicFactory graphicFactory, Tile tile, Tile tile2, String str, Display display, int i, float f, Paint paint, Paint paint2, boolean z, float f2, float f3, TextOrientation textOrientation, Point[][] pointArr, List<MapElementContainer> list) {
        Point[] parallelPath;
        float f4;
        int i2;
        float f5;
        int i3;
        if (pointArr.length == 0) {
            return;
        }
        if (f == 0.0f) {
            parallelPath = pointArr[0];
        } else {
            parallelPath = RendererUtils.parallelPath(pointArr[0], f);
        }
        if (parallelPath.length < 2) {
            return;
        }
        LineString lineString = new LineString();
        for (int i4 = 1; i4 < parallelPath.length; i4++) {
            lineString.segments.add(new LineSegment(parallelPath[i4 - 1], parallelPath[i4]));
        }
        int textWidth = paint2 == null ? paint.getTextWidth(str) : paint2.getTextWidth(str);
        int textHeight = paint2 == null ? paint.getTextHeight(str) : paint2.getTextHeight(str);
        double length = lineString.length();
        float f6 = f3;
        while (true) {
            float f7 = textWidth;
            double d = f6 + f7;
            if (d >= length) {
                return;
            }
            LineString extractPart = lineString.extractPart(f6, d);
            int i5 = 1;
            while (true) {
                if (i5 >= extractPart.segments.size()) {
                    f4 = f7;
                    i2 = textHeight;
                    f5 = f6;
                    i3 = textWidth;
                    list.add(new WayTextContainer(graphicFactory, extractPart, display, i, str, paint, paint2, textHeight, textOrientation));
                    break;
                }
                if (Math.abs(extractPart.segments.get(i5 - 1).angleTo(extractPart.segments.get(i5))) > MAX_LABEL_CORNER_ANGLE) {
                    f4 = f7;
                    i2 = textHeight;
                    f5 = f6;
                    i3 = textWidth;
                    break;
                }
                i5++;
            }
            f6 = f5 + f2 + f4;
            textWidth = i3;
            textHeight = i2;
        }
    }

    private WayDecorator() {
        throw new IllegalStateException();
    }
}
