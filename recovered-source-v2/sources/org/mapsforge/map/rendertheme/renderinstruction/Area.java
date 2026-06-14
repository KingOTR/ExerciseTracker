package org.mapsforge.map.rendertheme.renderinstruction;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Cap;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Style;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.layer.renderer.PolylineContainer;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.RenderCallback;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.rendertheme.XmlThemeResourceProvider;
import org.mapsforge.map.rendertheme.XmlUtils;
import org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class Area extends RenderInstruction {
    private boolean bitmapInvalid;
    private final Paint fill;
    private final int level;
    private final String relativePathPrefix;
    private final XmlThemeResourceProvider resourceProvider;
    private RenderInstruction.Scale scale;
    private Bitmap shaderBitmap;
    private String src;
    private final Paint stroke;
    private float strokeWidth;
    private final Map<Byte, Paint> strokes;

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void destroy() {
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderNode(RenderCallback renderCallback, RenderContext renderContext, PointOfInterest pointOfInterest) {
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleTextSize(float f, byte b) {
    }

    public Area(GraphicFactory graphicFactory, DisplayModel displayModel, String str, XmlPullParser xmlPullParser, int i, String str2, XmlThemeResourceProvider xmlThemeResourceProvider) throws IOException, XmlPullParserException {
        super(graphicFactory, displayModel);
        this.scale = RenderInstruction.Scale.STROKE;
        this.level = i;
        this.relativePathPrefix = str2;
        this.resourceProvider = xmlThemeResourceProvider;
        Paint createPaint = graphicFactory.createPaint();
        this.fill = createPaint;
        createPaint.setColor(Color.TRANSPARENT);
        createPaint.setStyle(Style.FILL);
        createPaint.setStrokeCap(Cap.ROUND);
        Paint createPaint2 = graphicFactory.createPaint();
        this.stroke = createPaint2;
        createPaint2.setColor(Color.TRANSPARENT);
        createPaint2.setStyle(Style.STROKE);
        createPaint2.setStrokeCap(Cap.ROUND);
        this.strokes = new HashMap();
        extractValues(str, xmlPullParser);
    }

    private void extractValues(String str, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if ("src".equals(attributeName)) {
                this.src = attributeValue;
            } else if ("cat".equals(attributeName)) {
                this.category = attributeValue;
            } else if ("fill".equals(attributeName)) {
                this.fill.setColor(XmlUtils.getColor(this.graphicFactory, attributeValue, this.displayModel.getThemeCallback(), this));
            } else if ("scale".equals(attributeName)) {
                this.scale = scaleFromValue(attributeValue);
            } else if ("stroke".equals(attributeName)) {
                this.stroke.setColor(XmlUtils.getColor(this.graphicFactory, attributeValue, this.displayModel.getThemeCallback(), this));
            } else if ("stroke-width".equals(attributeName)) {
                this.strokeWidth = XmlUtils.parseNonNegativeFloat(attributeName, attributeValue) * this.displayModel.getScaleFactor();
            } else if ("symbol-height".equals(attributeName)) {
                this.height = XmlUtils.parseNonNegativeInteger(attributeName, attributeValue) * this.displayModel.getScaleFactor();
            } else if ("symbol-percent".equals(attributeName)) {
                this.percent = XmlUtils.parseNonNegativeInteger(attributeName, attributeValue);
            } else if (!"symbol-scaling".equals(attributeName)) {
                if ("symbol-width".equals(attributeName)) {
                    this.width = XmlUtils.parseNonNegativeInteger(attributeName, attributeValue) * this.displayModel.getScaleFactor();
                } else {
                    XmlUtils.logUnknownAttribute(str, attributeName, attributeValue, i);
                }
            }
        }
    }

    private Paint getFillPaint() {
        return this.fill;
    }

    private Paint getStrokePaint(byte b) {
        Paint paint = this.strokes.get(Byte.valueOf(b));
        return paint == null ? this.stroke : paint;
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer) {
        synchronized (this) {
            Paint fillPaint = getFillPaint();
            if (this.shaderBitmap == null && !this.bitmapInvalid) {
                try {
                    Bitmap createBitmap = createBitmap(this.relativePathPrefix, this.src, this.resourceProvider);
                    this.shaderBitmap = createBitmap;
                    if (createBitmap != null) {
                        fillPaint.setBitmapShader(createBitmap);
                        this.shaderBitmap.decrementRefCount();
                    }
                } catch (IOException unused) {
                    this.bitmapInvalid = true;
                }
            }
            if (Parameters.NUMBER_OF_THREADS == 1) {
                fillPaint.setBitmapShaderShift(polylineContainer.getUpperLeft().getOrigin());
            }
            renderCallback.renderArea(renderContext, fillPaint, getStrokePaint(renderContext.rendererJob.tile.zoomLevel), this.level, polylineContainer);
        }
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleStrokeWidth(float f, byte b) {
        if (this.stroke != null) {
            if (this.scale == RenderInstruction.Scale.NONE) {
                f = 1.0f;
            }
            Paint createPaint = this.graphicFactory.createPaint(this.stroke);
            createPaint.setStrokeWidth(this.strokeWidth * f);
            this.strokes.put(Byte.valueOf(b), createPaint);
        }
    }
}
