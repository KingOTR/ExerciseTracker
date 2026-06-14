package org.mapsforge.map.rendertheme.renderinstruction;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.graphics.SymbolOrientation;
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
public class LineSymbol extends RenderInstruction {
    private static final float REPEAT_GAP_DEFAULT = 200.0f;
    private static final float REPEAT_START_DEFAULT = 30.0f;
    private Bitmap bitmap;
    private boolean bitmapInvalid;
    private Display display;
    private float dy;
    private final Map<Byte, Float> dyScaled;
    private Position position;
    private int priority;
    private final String relativePathPrefix;
    private boolean repeat;
    private float repeatGap;
    private float repeatStart;
    private final XmlThemeResourceProvider resourceProvider;
    private RenderInstruction.Scale scale;
    private String src;
    private SymbolOrientation symbolOrientation;

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderNode(RenderCallback renderCallback, RenderContext renderContext, PointOfInterest pointOfInterest) {
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleTextSize(float f, byte b) {
    }

    public LineSymbol(GraphicFactory graphicFactory, DisplayModel displayModel, String str, XmlPullParser xmlPullParser, String str2, XmlThemeResourceProvider xmlThemeResourceProvider) throws IOException, XmlPullParserException {
        super(graphicFactory, displayModel);
        this.scale = RenderInstruction.Scale.STROKE;
        this.display = Display.IFSPACE;
        this.relativePathPrefix = str2;
        this.resourceProvider = xmlThemeResourceProvider;
        this.dyScaled = new HashMap();
        this.position = Position.BELOW_RIGHT;
        this.symbolOrientation = SymbolOrientation.LEFT;
        extractValues(str, xmlPullParser);
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void destroy() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.decrementRefCount();
        }
    }

    private void extractValues(String str, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        this.repeatGap = this.displayModel.getScaleFactor() * 200.0f;
        this.repeatStart = this.displayModel.getScaleFactor() * 30.0f;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if ("src".equals(attributeName)) {
                this.src = attributeValue;
            } else if ("align-center".equals(attributeName)) {
                if (Boolean.parseBoolean(attributeValue)) {
                    this.position = Position.CENTER;
                }
            } else if ("cat".equals(attributeName)) {
                this.category = attributeValue;
            } else if ("display".equals(attributeName)) {
                this.display = Display.fromString(attributeValue);
            } else if ("dy".equals(attributeName)) {
                this.dy = Float.parseFloat(attributeValue) * this.displayModel.getScaleFactor();
            } else if ("priority".equals(attributeName)) {
                this.priority = Integer.parseInt(attributeValue);
            } else if ("repeat".equals(attributeName)) {
                this.repeat = Boolean.parseBoolean(attributeValue);
            } else if ("repeat-gap".equals(attributeName)) {
                this.repeatGap = Float.parseFloat(attributeValue) * this.displayModel.getScaleFactor();
            } else if ("repeat-start".equals(attributeName)) {
                this.repeatStart = Float.parseFloat(attributeValue) * this.displayModel.getScaleFactor();
            } else if ("rotate".equals(attributeName)) {
                if (!Boolean.parseBoolean(attributeValue)) {
                    this.symbolOrientation = SymbolOrientation.UP;
                }
            } else if ("scale".equals(attributeName)) {
                this.scale = scaleFromValue(attributeValue);
            } else if ("symbol-height".equals(attributeName)) {
                this.height = XmlUtils.parseNonNegativeInteger(attributeName, attributeValue) * this.displayModel.getScaleFactor();
            } else if ("symbol-orientation".equals(attributeName)) {
                this.symbolOrientation = SymbolOrientation.fromString(attributeValue);
            } else if ("symbol-percent".equals(attributeName)) {
                this.percent = XmlUtils.parseNonNegativeInteger(attributeName, attributeValue);
            } else if (!"symbol-scaling".equals(attributeName)) {
                if ("symbol-width".equals(attributeName)) {
                    this.width = XmlUtils.parseNonNegativeInteger(attributeName, attributeValue) * this.displayModel.getScaleFactor();
                } else if ("position".equals(attributeName)) {
                    this.position = Position.fromString(attributeValue);
                } else {
                    XmlUtils.logUnknownAttribute(str, attributeName, attributeValue, i);
                }
            }
        }
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer) {
        if (Display.NEVER == this.display) {
            return;
        }
        if (this.bitmap == null && !this.bitmapInvalid) {
            try {
                this.bitmap = createBitmap(this.relativePathPrefix, this.src, this.resourceProvider);
            } catch (IOException unused) {
                this.bitmapInvalid = true;
            }
        }
        Float f = this.dyScaled.get(Byte.valueOf(renderContext.rendererJob.tile.zoomLevel));
        if (f == null) {
            f = Float.valueOf(this.dy);
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            renderCallback.renderWaySymbol(renderContext, this.display, this.priority, this.bitmap, f.floatValue(), computeBoundary(bitmap.getWidth(), this.bitmap.getHeight(), this.position), this.repeat, this.repeatGap, this.repeatStart, this.symbolOrientation, polylineContainer);
        }
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleStrokeWidth(float f, byte b) {
        if (this.scale == RenderInstruction.Scale.NONE) {
            f = 1.0f;
        }
        this.dyScaled.put(Byte.valueOf(b), Float.valueOf(this.dy * f));
    }
}
