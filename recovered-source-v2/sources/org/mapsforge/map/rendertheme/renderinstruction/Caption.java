package org.mapsforge.map.rendertheme.renderinstruction;

import java.util.HashMap;
import java.util.Map;
import org.mapsforge.core.graphics.Align;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.FontFamily;
import org.mapsforge.core.graphics.FontStyle;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.core.graphics.TextTransform;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.layer.renderer.PolylineContainer;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.RenderCallback;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.rendertheme.XmlUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class Caption extends RenderInstruction {
    public static final float DEFAULT_GAP = 5.0f;
    private Rectangle boundary;
    private Display display;
    private float dy;
    private final Map<Byte, Float> dyScaled;
    private final Paint fill;
    private final Map<Byte, Paint> fills;
    private float fontSize;
    private final float gap;
    private int maxTextWidth;
    private Position position;
    private int priority;
    private final Paint stroke;
    private final Map<Byte, Paint> strokes;
    private String symbolId;
    private TextKey textKey;
    private TextTransform textTransform;

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void destroy() {
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleStrokeWidth(float f, byte b) {
    }

    public Caption(GraphicFactory graphicFactory, DisplayModel displayModel, String str, XmlPullParser xmlPullParser, Map<String, Symbol> map) throws XmlPullParserException {
        super(graphicFactory, displayModel);
        Symbol symbol;
        Paint createPaint = graphicFactory.createPaint();
        this.fill = createPaint;
        createPaint.setColor(Color.BLACK);
        createPaint.setStyle(Style.FILL);
        this.fills = new HashMap();
        Paint createPaint2 = graphicFactory.createPaint();
        this.stroke = createPaint2;
        createPaint2.setColor(Color.BLACK);
        createPaint2.setStyle(Style.STROKE);
        this.strokes = new HashMap();
        this.dyScaled = new HashMap();
        this.display = Display.IFSPACE;
        this.gap = displayModel.getScaleFactor() * 5.0f;
        this.textTransform = TextTransform.NONE;
        this.maxTextWidth = displayModel.getMaxTextWidth();
        extractValues(graphicFactory, displayModel, str, xmlPullParser);
        String str2 = this.symbolId;
        if (str2 != null && (symbol = map.get(str2)) != null) {
            this.boundary = symbol.getBoundary();
        }
        if (this.position == null) {
            if (this.boundary == null) {
                this.position = Position.CENTER;
            } else {
                this.position = Position.BELOW;
            }
        }
        switch (AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$Position[this.position.ordinal()]) {
            case 1:
            case 2:
            case 3:
                createPaint2.setTextAlign(Align.CENTER);
                createPaint.setTextAlign(Align.CENTER);
                return;
            case 4:
            case 5:
            case 6:
                createPaint2.setTextAlign(Align.RIGHT);
                createPaint.setTextAlign(Align.RIGHT);
                return;
            case 7:
            case 8:
            case 9:
                createPaint2.setTextAlign(Align.LEFT);
                createPaint.setTextAlign(Align.LEFT);
                return;
            default:
                throw new IllegalArgumentException("Position invalid");
        }
    }

    /* renamed from: org.mapsforge.map.rendertheme.renderinstruction.Caption$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$graphics$Position;

        static {
            int[] iArr = new int[Position.values().length];
            $SwitchMap$org$mapsforge$core$graphics$Position = iArr;
            try {
                iArr[Position.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.BELOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.ABOVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.BELOW_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.ABOVE_LEFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.BELOW_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.ABOVE_RIGHT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private float computeHorizontalOffset() {
        double d;
        if (this.position.isOnRightSide()) {
            d = this.boundary.right + this.gap;
        } else if (this.position.isOnLeftSide()) {
            d = this.boundary.left - this.gap;
        } else {
            d = (this.boundary.right + this.boundary.left) / 2.0d;
        }
        return (float) d;
    }

    private float computeVerticalOffset(byte b) {
        double d;
        double d2;
        float floatValue = this.dyScaled.get(Byte.valueOf(b)).floatValue();
        if (this.position.isOnUpperSide()) {
            d = floatValue;
            d2 = this.boundary.top - this.gap;
        } else if (this.position.isOnLowerSide()) {
            d = floatValue;
            d2 = this.boundary.bottom + this.gap;
        } else {
            d = floatValue;
            d2 = (this.boundary.top + this.boundary.bottom) / 2.0d;
        }
        return (float) (d + d2);
    }

    private void extractValues(GraphicFactory graphicFactory, DisplayModel displayModel, String str, XmlPullParser xmlPullParser) throws XmlPullParserException {
        FontFamily fontFamily = FontFamily.DEFAULT;
        FontStyle fontStyle = FontStyle.NORMAL;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if ("k".equals(attributeName)) {
                this.textKey = TextKey.getInstance(attributeValue);
            } else if ("cat".equals(attributeName)) {
                this.category = attributeValue;
            } else if ("display".equals(attributeName)) {
                this.display = Display.fromString(attributeValue);
            } else if ("dy".equals(attributeName)) {
                this.dy = Float.parseFloat(attributeValue) * displayModel.getScaleFactor();
            } else if ("fill".equals(attributeName)) {
                this.fill.setColor(XmlUtils.getColor(graphicFactory, attributeValue, displayModel.getThemeCallback(), this));
            } else if ("font-family".equals(attributeName)) {
                fontFamily = FontFamily.fromString(attributeValue);
            } else if ("font-size".equals(attributeName)) {
                this.fontSize = XmlUtils.parseNonNegativeFloat(attributeName, attributeValue) * displayModel.getScaleFactor();
            } else if ("font-style".equals(attributeName)) {
                fontStyle = FontStyle.fromString(attributeValue);
            } else if ("position".equals(attributeName)) {
                this.position = Position.fromString(attributeValue);
            } else if ("priority".equals(attributeName)) {
                this.priority = Integer.parseInt(attributeValue);
            } else if ("stroke".equals(attributeName)) {
                this.stroke.setColor(XmlUtils.getColor(graphicFactory, attributeValue, displayModel.getThemeCallback(), this));
            } else if ("stroke-width".equals(attributeName)) {
                this.stroke.setStrokeWidth(XmlUtils.parseNonNegativeFloat(attributeName, attributeValue) * displayModel.getScaleFactor());
            } else if ("symbol-id".equals(attributeName)) {
                this.symbolId = attributeValue;
            } else if ("text-transform".equals(attributeName)) {
                this.textTransform = TextTransform.fromString(attributeValue);
            } else if ("text-wrap-width".equals(attributeName)) {
                int parseNonNegativeInteger = (int) (XmlUtils.parseNonNegativeInteger(attributeName, attributeValue) * displayModel.getScaleFactor());
                if (parseNonNegativeInteger == 0) {
                    this.maxTextWidth = Integer.MAX_VALUE;
                } else {
                    this.maxTextWidth = parseNonNegativeInteger;
                }
            } else {
                XmlUtils.logUnknownAttribute(str, attributeName, attributeValue, i);
            }
        }
        this.fill.setTypeface(fontFamily, fontStyle);
        this.stroke.setTypeface(fontFamily, fontStyle);
        XmlUtils.checkMandatoryAttribute(str, "k", this.textKey);
    }

    private Paint getFillPaint(byte b) {
        Paint paint = this.fills.get(Byte.valueOf(b));
        return paint == null ? this.fill : paint;
    }

    private Paint getStrokePaint(byte b) {
        Paint paint = this.strokes.get(Byte.valueOf(b));
        return paint == null ? this.stroke : paint;
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderNode(RenderCallback renderCallback, RenderContext renderContext, PointOfInterest pointOfInterest) {
        String value;
        float f;
        if (Display.NEVER == this.display || (value = this.textKey.getValue(pointOfInterest.tags)) == null) {
            return;
        }
        Float f2 = this.dyScaled.get(Byte.valueOf(renderContext.rendererJob.tile.zoomLevel));
        if (f2 == null) {
            f2 = Float.valueOf(this.dy);
        }
        if (this.boundary != null) {
            f = computeHorizontalOffset();
            f2 = Float.valueOf(computeVerticalOffset(renderContext.rendererJob.tile.zoomLevel));
        } else {
            f = 0.0f;
        }
        renderCallback.renderPointOfInterestCaption(renderContext, this.display, this.priority, transformText(value, this.textTransform), f, f2.floatValue(), getFillPaint(renderContext.rendererJob.tile.zoomLevel), getStrokePaint(renderContext.rendererJob.tile.zoomLevel), this.position, this.maxTextWidth, pointOfInterest);
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer) {
        String value;
        float f;
        if (Display.NEVER == this.display || (value = this.textKey.getValue(polylineContainer.getTags())) == null) {
            return;
        }
        Float f2 = this.dyScaled.get(Byte.valueOf(renderContext.rendererJob.tile.zoomLevel));
        if (f2 == null) {
            f2 = Float.valueOf(this.dy);
        }
        if (this.boundary != null) {
            f = computeHorizontalOffset();
            f2 = Float.valueOf(computeVerticalOffset(renderContext.rendererJob.tile.zoomLevel));
        } else {
            f = 0.0f;
        }
        renderCallback.renderAreaCaption(renderContext, this.display, this.priority, transformText(value, this.textTransform), f, f2.floatValue(), getFillPaint(renderContext.rendererJob.tile.zoomLevel), getStrokePaint(renderContext.rendererJob.tile.zoomLevel), this.position, this.maxTextWidth, polylineContainer);
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleTextSize(float f, byte b) {
        Paint createPaint = this.graphicFactory.createPaint(this.fill);
        createPaint.setTextSize(this.fontSize * f);
        this.fills.put(Byte.valueOf(b), createPaint);
        Paint createPaint2 = this.graphicFactory.createPaint(this.stroke);
        createPaint2.setTextSize(this.fontSize * f);
        this.strokes.put(Byte.valueOf(b), createPaint2);
        this.dyScaled.put(Byte.valueOf(b), Float.valueOf(this.dy * f));
    }
}
