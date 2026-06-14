package org.mapsforge.map.rendertheme.renderinstruction;

import java.io.IOException;
import java.util.Locale;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.graphics.TextTransform;
import org.mapsforge.core.model.Rectangle;
import org.mapsforge.core.util.Parameters;
import org.mapsforge.map.datastore.PointOfInterest;
import org.mapsforge.map.layer.renderer.PolylineContainer;
import org.mapsforge.map.model.DisplayModel;
import org.mapsforge.map.rendertheme.RenderCallback;
import org.mapsforge.map.rendertheme.RenderContext;
import org.mapsforge.map.rendertheme.XmlThemeResourceProvider;
import org.mapsforge.map.rendertheme.XmlUtils;

/* loaded from: classes5.dex */
public abstract class RenderInstruction {
    static final String ALIGN_CENTER = "align-center";
    static final String ALL = "all";
    static final String CAT = "cat";
    static final String CURVE = "curve";
    static final String DISPLAY = "display";
    static final String DY = "dy";
    static final String FILL = "fill";
    static final String FONT_FAMILY = "font-family";
    static final String FONT_SIZE = "font-size";
    static final String FONT_STYLE = "font-style";
    static final String ID = "id";
    static final String K = "k";
    static final String NONE = "none";
    static final String POSITION = "position";
    static final String PRIORITY = "priority";
    static final String R = "r";
    static final String RADIUS = "radius";
    static final String REPEAT = "repeat";
    static final String REPEAT_GAP = "repeat-gap";
    static final String REPEAT_START = "repeat-start";

    @Deprecated
    static final String ROTATE = "rotate";
    static final String SCALE = "scale";
    static final String SCALE_RADIUS = "scale-radius";
    static final String SRC = "src";
    static final String STROKE = "stroke";
    static final String STROKE_DASHARRAY = "stroke-dasharray";
    static final String STROKE_LINECAP = "stroke-linecap";
    static final String STROKE_LINEJOIN = "stroke-linejoin";
    static final String STROKE_WIDTH = "stroke-width";
    static final String SYMBOL_HEIGHT = "symbol-height";
    static final String SYMBOL_ID = "symbol-id";
    static final String SYMBOL_ORIENTATION = "symbol-orientation";
    static final String SYMBOL_PERCENT = "symbol-percent";
    static final String SYMBOL_SCALING = "symbol-scaling";
    static final String SYMBOL_WIDTH = "symbol-width";
    static final String TEXT_ORIENTATION = "text-orientation";
    static final String TEXT_TRANSFORM = "text-transform";
    static final String TEXT_WRAP_WIDTH = "text-wrap-width";
    protected String category;
    public final DisplayModel displayModel;
    public final GraphicFactory graphicFactory;
    protected float height;
    protected int percent = 100;
    protected float width;

    enum Scale {
        ALL,
        NONE,
        STROKE
    }

    public abstract void destroy();

    public abstract void renderNode(RenderCallback renderCallback, RenderContext renderContext, PointOfInterest pointOfInterest);

    public abstract void renderWay(RenderCallback renderCallback, RenderContext renderContext, PolylineContainer polylineContainer);

    public abstract void scaleStrokeWidth(float f, byte b);

    public abstract void scaleTextSize(float f, byte b);

    protected RenderInstruction(GraphicFactory graphicFactory, DisplayModel displayModel) {
        this.displayModel = displayModel;
        this.graphicFactory = graphicFactory;
    }

    protected Rectangle computeBoundary(int i, int i2, Position position) {
        double d;
        int i3;
        double d2 = 0.0d;
        if (position == Position.ABOVE_LEFT || position == Position.LEFT || position == Position.BELOW_LEFT) {
            d = -1.0d;
        } else {
            d = (position == Position.ABOVE_RIGHT || position == Position.RIGHT || position == Position.BELOW_RIGHT) ? 0.0d : -0.5d;
        }
        if (position == Position.ABOVE_LEFT || position == Position.ABOVE || position == Position.ABOVE_RIGHT) {
            i3 = i;
            d2 = -1.0d;
        } else if (position == Position.BELOW_LEFT || position == Position.BELOW || position == Position.BELOW_RIGHT) {
            i3 = i;
        } else {
            i3 = i;
            d2 = -0.5d;
        }
        double d3 = i3;
        double d4 = d * d3;
        double d5 = d2 * d3;
        return new Rectangle(d4, d5, d4 + d3, d5 + i2);
    }

    protected Bitmap createBitmap(String str, String str2, XmlThemeResourceProvider xmlThemeResourceProvider) throws IOException {
        float f;
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$core$util$Parameters$SymbolScaling[Parameters.SYMBOL_SCALING.ordinal()];
        if (i == 1) {
            if ((this instanceof Symbol) || (this instanceof LineSymbol)) {
                f = DisplayModel.symbolScale;
            }
            f = 1.0f;
        } else {
            if (i == 2 && (this instanceof Symbol)) {
                f = DisplayModel.symbolScale;
            }
            f = 1.0f;
        }
        return XmlUtils.createBitmap(this.graphicFactory, this.displayModel, str, str2, xmlThemeResourceProvider, (int) this.width, (int) this.height, (int) (this.percent * f));
    }

    /* renamed from: org.mapsforge.map.rendertheme.renderinstruction.RenderInstruction$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$util$Parameters$SymbolScaling;

        static {
            int[] iArr = new int[Parameters.SymbolScaling.values().length];
            $SwitchMap$org$mapsforge$core$util$Parameters$SymbolScaling = iArr;
            try {
                iArr[Parameters.SymbolScaling.ALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$util$Parameters$SymbolScaling[Parameters.SymbolScaling.POI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public String getCategory() {
        return this.category;
    }

    protected Scale scaleFromValue(String str) {
        if (str.equals("all")) {
            return Scale.ALL;
        }
        if (str.equals("none")) {
            return Scale.NONE;
        }
        return Scale.STROKE;
    }

    protected String transformText(String str, TextTransform textTransform) {
        if (str.length() == 0) {
            return str;
        }
        if (textTransform == TextTransform.UPPERCASE) {
            return str.toUpperCase(Locale.ROOT);
        }
        if (textTransform == TextTransform.LOWERCASE) {
            return str.toLowerCase(Locale.ROOT);
        }
        return textTransform == TextTransform.CAPITALIZE ? str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1) : str;
    }
}
