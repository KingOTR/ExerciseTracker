package org.mapsforge.map.rendertheme.renderinstruction;

import java.io.IOException;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.layer.renderer.PolylineContainer;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.RenderCallback;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.rendertheme.XmlThemeResourceProvider;
import org.mapsforge.map.rendertheme.XmlUtils;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes5.dex */
public class Symbol extends RenderInstruction {
    private Bitmap bitmap;
    private boolean bitmapInvalid;
    private Rectangle boundary;
    private Display display;
    private String id;
    private Position position;
    private int priority;
    private final String relativePathPrefix;
    private final XmlThemeResourceProvider resourceProvider;
    private String src;

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleStrokeWidth(float f, byte b) {
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void scaleTextSize(float f, byte b) {
    }

    public Symbol(GraphicFactory graphicFactory, DisplayModel displayModel, String str, XmlPullParser xmlPullParser, String str2, XmlThemeResourceProvider xmlThemeResourceProvider) throws IOException, XmlPullParserException {
        super(graphicFactory, displayModel);
        this.relativePathPrefix = str2;
        this.resourceProvider = xmlThemeResourceProvider;
        this.display = Display.IFSPACE;
        this.position = Position.CENTER;
        extractValues(str, xmlPullParser);
        Bitmap bitmap = getBitmap();
        if (bitmap != null) {
            this.boundary = computeBoundary(bitmap.getWidth(), bitmap.getHeight(), this.position);
        }
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void destroy() {
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            bitmap.decrementRefCount();
        }
    }

    private void extractValues(String str, XmlPullParser xmlPullParser) throws IOException, XmlPullParserException {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            String attributeValue = xmlPullParser.getAttributeValue(i);
            if ("src".equals(attributeName)) {
                this.src = attributeValue;
            } else if ("cat".equals(attributeName)) {
                this.category = attributeValue;
            } else if ("display".equals(attributeName)) {
                this.display = Display.fromString(attributeValue);
            } else if ("id".equals(attributeName)) {
                this.id = attributeValue;
            } else if ("priority".equals(attributeName)) {
                this.priority = Integer.parseInt(attributeValue);
            } else if ("symbol-height".equals(attributeName)) {
                this.height = XmlUtils.parseNonNegativeInteger(attributeName, attributeValue) * this.displayModel.getScaleFactor();
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

    public Bitmap getBitmap() {
        if (this.bitmap == null && !this.bitmapInvalid) {
            try {
                this.bitmap = createBitmap(this.relativePathPrefix, this.src, this.resourceProvider);
            } catch (IOException unused) {
                this.bitmapInvalid = true;
            }
        }
        return this.bitmap;
    }

    public Rectangle getBoundary() {
        return this.boundary;
    }

    public String getId() {
        return this.id;
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderNode(RenderCallback renderCallback, RenderContext renderContext, PointOfInterest pointOfInterest) {
        if (Display.NEVER == this.display || getBitmap() == null) {
            return;
        }
        renderCallback.renderPointOfInterestSymbol(renderContext, this.display, this.priority, this.boundary, this.bitmap, pointOfInterest);
    }

    @Override // org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction
    public void renderWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer) {
        if (Display.NEVER == this.display || getBitmap() == null) {
            return;
        }
        renderCallback.renderAreaSymbol(renderContext, this.display, this.priority, this.bitmap, polylineContainer);
    }
}
