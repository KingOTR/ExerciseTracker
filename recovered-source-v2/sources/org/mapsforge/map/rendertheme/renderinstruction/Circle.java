package org.mapsforge.map.rendertheme.renderinstruction;

import java.util.HashMap;
import java.util.Map;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.layer.renderer.PolylineContainer;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.RenderCallback;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.rendertheme.XmlUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class Circle extends RenderInstruction {
    private final Paint fill;
    private final Map<Byte, Paint> fills;
    private final int level;
    private float radius;
    private float renderRadius;
    private final Map<Byte, Float> renderRadiusScaled;
    private boolean scaleRadius;
    private final Paint stroke;
    private float strokeWidth;
    private final Map<Byte, Paint> strokes;

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void destroy() {
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer) {
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleTextSize(float f, byte b) {
    }

    public Circle(GraphicFactory graphicFactory, DisplayModel displayModel, String str, XmlPullParser xmlPullParser, int i) throws XmlPullParserException {
        super(graphicFactory, displayModel);
        this.level = i;
        Paint createPaint = graphicFactory.createPaint();
        this.fill = createPaint;
        createPaint.setColor(Color.TRANSPARENT);
        createPaint.setStyle(Style.FILL);
        this.fills = new HashMap();
        Paint createPaint2 = graphicFactory.createPaint();
        this.stroke = createPaint2;
        createPaint2.setColor(Color.TRANSPARENT);
        createPaint2.setStyle(Style.STROKE);
        this.strokes = new HashMap();
        this.renderRadiusScaled = new HashMap();
        extractValues(graphicFactory, displayModel, str, xmlPullParser);
        if (this.scaleRadius) {
            return;
        }
        this.renderRadius = this.radius;
        createPaint2.setStrokeWidth(this.strokeWidth);
    }

    private void extractValues(GraphicFactory graphicFactory, DisplayModel displayModel, String str, XmlPullParser xmlPullParser) throws XmlPullParserException {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if ("radius".equals(attributeName) || "r".equals(attributeName)) {
                this.radius = XmlUtils.parseNonNegativeFloat(attributeName, attributeValue) * displayModel.getScaleFactor();
            } else if ("cat".equals(attributeName)) {
                this.category = attributeValue;
            } else if ("fill".equals(attributeName)) {
                this.fill.setColor(XmlUtils.getColor(graphicFactory, attributeValue, displayModel.getThemeCallback(), this));
            } else if ("scale-radius".equals(attributeName)) {
                this.scaleRadius = Boolean.parseBoolean(attributeValue);
            } else if ("stroke".equals(attributeName)) {
                this.stroke.setColor(XmlUtils.getColor(graphicFactory, attributeValue, displayModel.getThemeCallback(), this));
            } else if ("stroke-width".equals(attributeName)) {
                this.strokeWidth = XmlUtils.parseNonNegativeFloat(attributeName, attributeValue) * displayModel.getScaleFactor();
            } else {
                XmlUtils.logUnknownAttribute(str, attributeName, attributeValue, i);
            }
        }
        XmlUtils.checkMandatoryAttribute(str, "radius", Float.valueOf(this.radius));
    }

    private Paint getFillPaint(byte b) {
        Paint paint = this.fills.get(Byte.valueOf(b));
        return paint == null ? this.fill : paint;
    }

    private float getRenderRadius(byte b) {
        Float f = this.renderRadiusScaled.get(Byte.valueOf(b));
        if (f == null) {
            f = Float.valueOf(this.renderRadius);
        }
        return f.floatValue();
    }

    private Paint getStrokePaint(byte b) {
        Paint paint = this.strokes.get(Byte.valueOf(b));
        return paint == null ? this.stroke : paint;
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderNode(RenderCallback renderCallback, RenderContext renderContext, PointOfInterest pointOfInterest) {
        renderCallback.renderPointOfInterestCircle(renderContext, getRenderRadius(renderContext.rendererJob.tile.zoomLevel), getFillPaint(renderContext.rendererJob.tile.zoomLevel), getStrokePaint(renderContext.rendererJob.tile.zoomLevel), this.level, pointOfInterest);
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleStrokeWidth(float f, byte b) {
        if (this.scaleRadius) {
            this.renderRadiusScaled.put(Byte.valueOf(b), Float.valueOf(this.radius * f));
            if (this.stroke != null) {
                Paint createPaint = this.graphicFactory.createPaint(this.stroke);
                createPaint.setStrokeWidth(this.strokeWidth * f);
                this.strokes.put(Byte.valueOf(b), createPaint);
            }
        }
    }
}
