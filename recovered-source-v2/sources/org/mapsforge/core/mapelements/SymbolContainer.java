package org.mapsforge.core.mapelements;

import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.Filter;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;

/* loaded from: classes5.dex */
public class SymbolContainer extends MapElementContainer {
    public Bitmap symbol;
    public final float theta;

    public SymbolContainer(Point point, Display display, int i, Rectangle rectangle, Bitmap bitmap) {
        this(point, display, i, rectangle, bitmap, 0.0f);
    }

    public SymbolContainer(Point point, Display display, int i, Rectangle rectangle, Bitmap bitmap, float f) {
        super(point, display, i);
        this.symbol = bitmap;
        this.theta = f;
        this.boundary = rectangle;
        if (this.boundary == null) {
            double width = this.symbol.getWidth() / 2.0d;
            double height = this.symbol.getHeight() / 2.0d;
            this.boundary = new Rectangle(-width, -height, width, height);
        }
        this.symbol.incrementRefCount();
    }

    @Override // org.mapsforge.core.mapelements.MapElementContainer
    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof SymbolContainer) && this.symbol == ((SymbolContainer) obj).symbol;
    }

    @Override // org.mapsforge.core.mapelements.MapElementContainer
    public int hashCode() {
        return (super.hashCode() * 31) + this.symbol.hashCode();
    }

    @Override // org.mapsforge.core.mapelements.MapElementContainer
    public void draw(Canvas canvas, Point point, Matrix matrix, Filter filter) {
        matrix.reset();
        matrix.translate((int) ((this.xy.x - point.x) + this.boundary.left), (int) ((this.xy.y - point.y) + this.boundary.top));
        float f = this.theta;
        if (f != 0.0f) {
            matrix.rotate(f, (float) (-this.boundary.left), (float) (-this.boundary.top));
        }
        canvas.drawBitmap(this.symbol, matrix, 1.0f, filter);
    }
}
