package org.mapsforge.map.scalebar;

import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Cap;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.FontFamily;
import org.mapsforge.core.graphics.FontStyle;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.model.IMapViewPosition;
import org.mapsforge.map.model.MapViewDimension;
import org.mapsforge.map.scalebar.MapScaleBar;

/* loaded from: classes5.dex */
public class DefaultMapScaleBar extends MapScaleBar {
    public static int BITMAP_HEIGHT = 40;
    public static int BITMAP_WIDTH = 120;
    public static final int DEFAULT_HORIZONTAL_MARGIN = 5;
    public static final int DEFAULT_VERTICAL_MARGIN = 0;
    public static final int SCALE_BAR_MARGIN = 10;
    public static final float STROKE_EXTERNAL = 4.0f;
    public static final float STROKE_INTERNAL = 2.0f;
    public static final int TEXT_MARGIN = 1;
    protected final Paint paintScaleBar;
    protected final Paint paintScaleBarStroke;
    protected final Paint paintScaleText;
    protected final Paint paintScaleTextStroke;
    private ScaleBarMode scaleBarMode;
    private DistanceUnitAdapter secondaryDistanceUnitAdapter;

    public enum ScaleBarMode {
        BOTH,
        SINGLE
    }

    public DefaultMapScaleBar(IMapViewPosition iMapViewPosition, MapViewDimension mapViewDimension, GraphicFactory graphicFactory, DisplayModel displayModel) {
        this(iMapViewPosition, mapViewDimension, graphicFactory, displayModel, displayModel.getScaleFactor());
    }

    public DefaultMapScaleBar(IMapViewPosition iMapViewPosition, MapViewDimension mapViewDimension, GraphicFactory graphicFactory, DisplayModel displayModel, float f) {
        super(iMapViewPosition, mapViewDimension, displayModel, graphicFactory, (int) (BITMAP_WIDTH * f), (int) (BITMAP_HEIGHT * f), f);
        setMarginHorizontal((int) (5.0f * f));
        setMarginVertical((int) (f * 0.0f));
        this.scaleBarMode = ScaleBarMode.BOTH;
        this.secondaryDistanceUnitAdapter = ImperialUnitAdapter.INSTANCE;
        this.paintScaleBar = createScaleBarPaint(Color.BLACK, 2.0f, Style.FILL);
        this.paintScaleBarStroke = createScaleBarPaint(Color.WHITE, 4.0f, Style.STROKE);
        this.paintScaleText = createTextPaint(Color.BLACK, 0.0f, Style.FILL);
        this.paintScaleTextStroke = createTextPaint(Color.WHITE, 2.0f, Style.STROKE);
    }

    public void setColor(int i) {
        this.paintScaleBar.setColor(i);
        this.paintScaleText.setColor(i);
    }

    public DistanceUnitAdapter getSecondaryDistanceUnitAdapter() {
        return this.secondaryDistanceUnitAdapter;
    }

    public void setSecondaryDistanceUnitAdapter(DistanceUnitAdapter distanceUnitAdapter) {
        if (distanceUnitAdapter == null) {
            throw new IllegalArgumentException("adapter must not be null");
        }
        this.secondaryDistanceUnitAdapter = distanceUnitAdapter;
        this.redrawNeeded = true;
    }

    public ScaleBarMode getScaleBarMode() {
        return this.scaleBarMode;
    }

    public void setScaleBarMode(ScaleBarMode scaleBarMode) {
        this.scaleBarMode = scaleBarMode;
        this.redrawNeeded = true;
    }

    private Paint createScaleBarPaint(Color color, float f, Style style) {
        Paint createPaint = this.graphicFactory.createPaint();
        createPaint.setColor(color);
        createPaint.setStrokeWidth(f * this.scale);
        createPaint.setStyle(style);
        createPaint.setStrokeCap(Cap.ROUND);
        return createPaint;
    }

    private Paint createTextPaint(Color color, float f, Style style) {
        Paint createPaint = this.graphicFactory.createPaint();
        createPaint.setColor(color);
        createPaint.setStrokeWidth(f * this.scale);
        createPaint.setStyle(style);
        createPaint.setTypeface(FontFamily.DEFAULT, FontStyle.BOLD);
        createPaint.setTextSize(this.scale * 12.0f);
        return createPaint;
    }

    @Override // org.mapsforge.map.scalebar.MapScaleBar
    protected void redraw(Canvas canvas) {
        MapScaleBar.ScaleBarLengthAndValue scaleBarLengthAndValue;
        canvas.fillColor(Color.TRANSPARENT);
        MapScaleBar.ScaleBarLengthAndValue calculateScaleBarLengthAndValue = calculateScaleBarLengthAndValue();
        if (this.scaleBarMode == ScaleBarMode.BOTH) {
            scaleBarLengthAndValue = calculateScaleBarLengthAndValue(this.secondaryDistanceUnitAdapter);
        } else {
            scaleBarLengthAndValue = new MapScaleBar.ScaleBarLengthAndValue(0, 0);
        }
        drawScaleBar(canvas, calculateScaleBarLengthAndValue.scaleBarLength, scaleBarLengthAndValue.scaleBarLength, this.paintScaleBarStroke, this.scale);
        drawScaleBar(canvas, calculateScaleBarLengthAndValue.scaleBarLength, scaleBarLengthAndValue.scaleBarLength, this.paintScaleBar, this.scale);
        String scaleText = this.distanceUnitAdapter.getScaleText(calculateScaleBarLengthAndValue.scaleBarValue);
        String scaleText2 = this.scaleBarMode == ScaleBarMode.BOTH ? this.secondaryDistanceUnitAdapter.getScaleText(scaleBarLengthAndValue.scaleBarValue) : "";
        drawScaleText(canvas, scaleText, scaleText2, this.paintScaleTextStroke, this.scale);
        drawScaleText(canvas, scaleText, scaleText2, this.paintScaleText, this.scale);
    }

    protected void drawScaleBar(Canvas canvas, int i, int i2, Paint paint, float f) {
        int max = Math.max(i, i2);
        switch (AnonymousClass1.$SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[this.scaleBarPosition.ordinal()]) {
            case 1:
                if (i2 == 0) {
                    float f2 = f * 10.0f;
                    canvas.drawLine(Math.round((canvas.getWidth() - max) * 0.5f), Math.round(canvas.getHeight() - f2), Math.round((canvas.getWidth() + max) * 0.5f), Math.round(canvas.getHeight() - f2), paint);
                    canvas.drawLine(Math.round((canvas.getWidth() - max) * 0.5f), Math.round(canvas.getHeight() * 0.5f), Math.round((canvas.getWidth() - max) * 0.5f), Math.round(canvas.getHeight() - f2), paint);
                    canvas.drawLine(Math.round((canvas.getWidth() + max) * 0.5f), Math.round(canvas.getHeight() * 0.5f), Math.round((canvas.getWidth() + max) * 0.5f), Math.round(canvas.getHeight() - f2), paint);
                    break;
                } else {
                    float f3 = f * 4.0f * 0.5f;
                    canvas.drawLine(Math.round(f3), Math.round(canvas.getHeight() * 0.5f), Math.round(max + f3), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f4 = f * 10.0f;
                    canvas.drawLine(Math.round(f3), Math.round(f4), Math.round(f3), Math.round(canvas.getHeight() - f4), paint);
                    float f5 = i + f3;
                    canvas.drawLine(Math.round(f5), Math.round(f4), Math.round(f5), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f6 = f3 + i2;
                    canvas.drawLine(Math.round(f6), Math.round(canvas.getHeight() * 0.5f), Math.round(f6), Math.round(canvas.getHeight() - f4), paint);
                    break;
                }
            case 2:
                if (i2 == 0) {
                    float f7 = f * 4.0f * 0.5f;
                    float f8 = f * 10.0f;
                    float f9 = max + f7;
                    canvas.drawLine(Math.round(f7), Math.round(canvas.getHeight() - f8), Math.round(f9), Math.round(canvas.getHeight() - f8), paint);
                    canvas.drawLine(Math.round(f7), Math.round(canvas.getHeight() * 0.5f), Math.round(f7), Math.round(canvas.getHeight() - f8), paint);
                    canvas.drawLine(Math.round(f9), Math.round(canvas.getHeight() * 0.5f), Math.round(f9), Math.round(canvas.getHeight() - f8), paint);
                    break;
                } else {
                    float f10 = f * 4.0f * 0.5f;
                    canvas.drawLine(Math.round(f10), Math.round(canvas.getHeight() * 0.5f), Math.round(max + f10), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f11 = f * 10.0f;
                    canvas.drawLine(Math.round(f10), Math.round(f11), Math.round(f10), Math.round(canvas.getHeight() - f11), paint);
                    float f12 = i + f10;
                    canvas.drawLine(Math.round(f12), Math.round(f11), Math.round(f12), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f13 = f10 + i2;
                    canvas.drawLine(Math.round(f13), Math.round(canvas.getHeight() * 0.5f), Math.round(f13), Math.round(canvas.getHeight() - f11), paint);
                    break;
                }
            case 3:
                if (i2 == 0) {
                    float f14 = f * 4.0f * 0.5f;
                    float f15 = max;
                    float f16 = f * 10.0f;
                    canvas.drawLine(Math.round((canvas.getWidth() - f14) - f15), Math.round(canvas.getHeight() - f16), Math.round(canvas.getWidth() - f14), Math.round(canvas.getHeight() - f16), paint);
                    canvas.drawLine(Math.round(canvas.getWidth() - f14), Math.round(canvas.getHeight() * 0.5f), Math.round(canvas.getWidth() - f14), Math.round(canvas.getHeight() - f16), paint);
                    canvas.drawLine(Math.round((canvas.getWidth() - f14) - f15), Math.round(canvas.getHeight() * 0.5f), Math.round((canvas.getWidth() - f14) - f15), Math.round(canvas.getHeight() - f16), paint);
                    break;
                } else {
                    float f17 = 4.0f * f * 0.5f;
                    canvas.drawLine(Math.round(canvas.getWidth() - f17), Math.round(canvas.getHeight() * 0.5f), Math.round((canvas.getWidth() - f17) - max), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f18 = f * 10.0f;
                    canvas.drawLine(Math.round(canvas.getWidth() - f17), Math.round(f18), Math.round(canvas.getWidth() - f17), Math.round(canvas.getHeight() - f18), paint);
                    float f19 = i;
                    canvas.drawLine(Math.round((canvas.getWidth() - f17) - f19), Math.round(f18), Math.round((canvas.getWidth() - f17) - f19), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f20 = i2;
                    canvas.drawLine(Math.round((canvas.getWidth() - f17) - f20), Math.round(canvas.getHeight() * 0.5f), Math.round((canvas.getWidth() - f17) - f20), Math.round(canvas.getHeight() - f18), paint);
                    break;
                }
            case 4:
                if (i2 == 0) {
                    float f21 = f * 10.0f;
                    canvas.drawLine(Math.round((canvas.getWidth() - max) * 0.5f), Math.round(f21), Math.round((canvas.getWidth() + max) * 0.5f), Math.round(f21), paint);
                    canvas.drawLine(Math.round((canvas.getWidth() - max) * 0.5f), Math.round(f21), Math.round((canvas.getWidth() - max) * 0.5f), Math.round(canvas.getHeight() * 0.5f), paint);
                    canvas.drawLine(Math.round((canvas.getWidth() + max) * 0.5f), Math.round(f21), Math.round((canvas.getWidth() + max) * 0.5f), Math.round(canvas.getHeight() * 0.5f), paint);
                    break;
                } else {
                    float f22 = f * 4.0f * 0.5f;
                    canvas.drawLine(Math.round(f22), Math.round(canvas.getHeight() * 0.5f), Math.round(max + f22), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f23 = f * 10.0f;
                    canvas.drawLine(Math.round(f22), Math.round(f23), Math.round(f22), Math.round(canvas.getHeight() - f23), paint);
                    float f24 = i + f22;
                    canvas.drawLine(Math.round(f24), Math.round(f23), Math.round(f24), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f25 = f22 + i2;
                    canvas.drawLine(Math.round(f25), Math.round(canvas.getHeight() * 0.5f), Math.round(f25), Math.round(canvas.getHeight() - f23), paint);
                    break;
                }
            case 5:
                if (i2 == 0) {
                    float f26 = f * 4.0f * 0.5f;
                    float f27 = f * 10.0f;
                    float f28 = max + f26;
                    canvas.drawLine(Math.round(f26), Math.round(f27), Math.round(f28), Math.round(f27), paint);
                    canvas.drawLine(Math.round(f26), Math.round(f27), Math.round(f26), Math.round(canvas.getHeight() * 0.5f), paint);
                    canvas.drawLine(Math.round(f28), Math.round(f27), Math.round(f28), Math.round(canvas.getHeight() * 0.5f), paint);
                    break;
                } else {
                    float f29 = f * 4.0f * 0.5f;
                    canvas.drawLine(Math.round(f29), Math.round(canvas.getHeight() * 0.5f), Math.round(max + f29), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f30 = f * 10.0f;
                    canvas.drawLine(Math.round(f29), Math.round(f30), Math.round(f29), Math.round(canvas.getHeight() - f30), paint);
                    float f31 = i + f29;
                    canvas.drawLine(Math.round(f31), Math.round(f30), Math.round(f31), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f32 = f29 + i2;
                    canvas.drawLine(Math.round(f32), Math.round(canvas.getHeight() * 0.5f), Math.round(f32), Math.round(canvas.getHeight() - f30), paint);
                    break;
                }
            case 6:
                if (i2 == 0) {
                    float f33 = f * 4.0f * 0.5f;
                    float f34 = max;
                    float f35 = f * 10.0f;
                    canvas.drawLine(Math.round((canvas.getWidth() - f33) - f34), Math.round(f35), Math.round(canvas.getWidth() - f33), Math.round(f35), paint);
                    canvas.drawLine(Math.round(canvas.getWidth() - f33), Math.round(f35), Math.round(canvas.getWidth() - f33), Math.round(canvas.getHeight() * 0.5f), paint);
                    canvas.drawLine(Math.round((canvas.getWidth() - f33) - f34), Math.round(f35), Math.round((canvas.getWidth() - f33) - f34), Math.round(canvas.getHeight() * 0.5f), paint);
                    break;
                } else {
                    float f36 = 4.0f * f * 0.5f;
                    canvas.drawLine(Math.round(canvas.getWidth() - f36), Math.round(canvas.getHeight() * 0.5f), Math.round((canvas.getWidth() - f36) - max), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f37 = f * 10.0f;
                    canvas.drawLine(Math.round(canvas.getWidth() - f36), Math.round(f37), Math.round(canvas.getWidth() - f36), Math.round(canvas.getHeight() - f37), paint);
                    float f38 = i;
                    canvas.drawLine(Math.round((canvas.getWidth() - f36) - f38), Math.round(f37), Math.round((canvas.getWidth() - f36) - f38), Math.round(canvas.getHeight() * 0.5f), paint);
                    float f39 = i2;
                    canvas.drawLine(Math.round((canvas.getWidth() - f36) - f39), Math.round(canvas.getHeight() * 0.5f), Math.round((canvas.getWidth() - f36) - f39), Math.round(canvas.getHeight() - f37), paint);
                    break;
                }
        }
    }

    /* renamed from: org.mapsforge.map.scalebar.DefaultMapScaleBar$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition;

        static {
            int[] iArr = new int[MapScaleBar.ScaleBarPosition.values().length];
            $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition = iArr;
            try {
                iArr[MapScaleBar.ScaleBarPosition.BOTTOM_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[MapScaleBar.ScaleBarPosition.BOTTOM_LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[MapScaleBar.ScaleBarPosition.BOTTOM_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[MapScaleBar.ScaleBarPosition.TOP_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[MapScaleBar.ScaleBarPosition.TOP_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[MapScaleBar.ScaleBarPosition.TOP_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected void drawScaleText(Canvas canvas, String str, String str2, Paint paint, float f) {
        switch (AnonymousClass1.$SwitchMap$org$mapsforge$map$scalebar$MapScaleBar$ScaleBarPosition[this.scaleBarPosition.ordinal()]) {
            case 1:
                if (str2.length() == 0) {
                    canvas.drawText(str, Math.round((canvas.getWidth() - this.paintScaleTextStroke.getTextWidth(str)) * 0.5f), Math.round(((canvas.getHeight() - (10.0f * f)) - ((4.0f * f) * 0.5f)) - (f * 1.0f)), paint);
                    break;
                } else {
                    float f2 = 4.0f * f;
                    float f3 = f * 1.0f;
                    float f4 = f2 + f3;
                    float f5 = f2 * 0.5f;
                    canvas.drawText(str, Math.round(f4), Math.round(((canvas.getHeight() * 0.5f) - f5) - f3), paint);
                    canvas.drawText(str2, Math.round(f4), Math.round((canvas.getHeight() * 0.5f) + f5 + f3 + this.paintScaleTextStroke.getTextHeight(str2)), paint);
                    break;
                }
            case 2:
                if (str2.length() == 0) {
                    float f6 = 4.0f * f;
                    float f7 = 1.0f * f;
                    canvas.drawText(str, Math.round(f6 + f7), Math.round(((canvas.getHeight() - (f * 10.0f)) - (f6 * 0.5f)) - f7), paint);
                    break;
                } else {
                    float f8 = 4.0f * f;
                    float f9 = f * 1.0f;
                    float f10 = f8 + f9;
                    float f11 = f8 * 0.5f;
                    canvas.drawText(str, Math.round(f10), Math.round(((canvas.getHeight() * 0.5f) - f11) - f9), paint);
                    canvas.drawText(str2, Math.round(f10), Math.round((canvas.getHeight() * 0.5f) + f11 + f9 + this.paintScaleTextStroke.getTextHeight(str2)), paint);
                    break;
                }
            case 3:
                if (str2.length() == 0) {
                    float f12 = 4.0f * f;
                    float f13 = 1.0f * f;
                    canvas.drawText(str, Math.round(((canvas.getWidth() - f12) - f13) - this.paintScaleTextStroke.getTextWidth(str)), Math.round(((canvas.getHeight() - (f * 10.0f)) - (f12 * 0.5f)) - f13), paint);
                    break;
                } else {
                    float f14 = 4.0f * f;
                    float f15 = f * 1.0f;
                    float f16 = f14 * 0.5f;
                    canvas.drawText(str, Math.round(((canvas.getWidth() - f14) - f15) - this.paintScaleTextStroke.getTextWidth(str)), Math.round(((canvas.getHeight() * 0.5f) - f16) - f15), paint);
                    canvas.drawText(str2, Math.round(((canvas.getWidth() - f14) - f15) - this.paintScaleTextStroke.getTextWidth(str2)), Math.round((canvas.getHeight() * 0.5f) + f16 + f15 + this.paintScaleTextStroke.getTextHeight(str2)), paint);
                    break;
                }
            case 4:
                if (str2.length() == 0) {
                    canvas.drawText(str, Math.round((canvas.getWidth() - this.paintScaleTextStroke.getTextWidth(str)) * 0.5f), Math.round((10.0f * f) + (4.0f * f * 0.5f) + (f * 1.0f) + this.paintScaleTextStroke.getTextHeight(str)), paint);
                    break;
                } else {
                    float f17 = 4.0f * f;
                    float f18 = f * 1.0f;
                    float f19 = f17 + f18;
                    float f20 = f17 * 0.5f;
                    canvas.drawText(str, Math.round(f19), Math.round(((canvas.getHeight() * 0.5f) - f20) - f18), paint);
                    canvas.drawText(str2, Math.round(f19), Math.round((canvas.getHeight() * 0.5f) + f20 + f18 + this.paintScaleTextStroke.getTextHeight(str2)), paint);
                    break;
                }
            case 5:
                if (str2.length() == 0) {
                    float f21 = 4.0f * f;
                    float f22 = 1.0f * f;
                    canvas.drawText(str, Math.round(f21 + f22), Math.round((f * 10.0f) + (f21 * 0.5f) + f22 + this.paintScaleTextStroke.getTextHeight(str)), paint);
                    break;
                } else {
                    float f23 = 4.0f * f;
                    float f24 = f * 1.0f;
                    float f25 = f23 + f24;
                    float f26 = f23 * 0.5f;
                    canvas.drawText(str, Math.round(f25), Math.round(((canvas.getHeight() * 0.5f) - f26) - f24), paint);
                    canvas.drawText(str2, Math.round(f25), Math.round((canvas.getHeight() * 0.5f) + f26 + f24 + this.paintScaleTextStroke.getTextHeight(str2)), paint);
                    break;
                }
            case 6:
                if (str2.length() == 0) {
                    float f27 = 4.0f * f;
                    float f28 = 1.0f * f;
                    canvas.drawText(str, Math.round(((canvas.getWidth() - f27) - f28) - this.paintScaleTextStroke.getTextWidth(str)), Math.round((f * 10.0f) + (f27 * 0.5f) + f28 + this.paintScaleTextStroke.getTextHeight(str)), paint);
                    break;
                } else {
                    float f29 = 4.0f * f;
                    float f30 = f * 1.0f;
                    float f31 = f29 * 0.5f;
                    canvas.drawText(str, Math.round(((canvas.getWidth() - f29) - f30) - this.paintScaleTextStroke.getTextWidth(str)), Math.round(((canvas.getHeight() * 0.5f) - f31) - f30), paint);
                    canvas.drawText(str2, Math.round(((canvas.getWidth() - f29) - f30) - this.paintScaleTextStroke.getTextWidth(str2)), Math.round((canvas.getHeight() * 0.5f) + f31 + f30 + this.paintScaleTextStroke.getTextHeight(str2)), paint);
                    break;
                }
        }
    }
}
