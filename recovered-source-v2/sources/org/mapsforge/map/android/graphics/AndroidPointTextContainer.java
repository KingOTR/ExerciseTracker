package org.mapsforge.map.android.graphics;

import android.graphics.Paint;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.Filter;
import org.mapsforge.core.graphics.GraphicUtils;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.graphics.Paint;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.mapelements.PointTextContainer;
import org.mapsforge.core.mapelements.SymbolContainer;
import org.mapsforge.core.model.Point;
import org.mapsforge.core.model.Rectangle;

/* loaded from: classes5.dex */
public class AndroidPointTextContainer extends PointTextContainer {
    private StaticLayout backLayout;
    private StaticLayout frontLayout;

    AndroidPointTextContainer(Point point, Display display, int i, String str, Paint paint, Paint paint2, SymbolContainer symbolContainer, Position position, int i2) {
        super(point, display, i, str, paint, paint2, symbolContainer, position, i2);
        float f;
        int i3;
        if (this.textWidth > this.maxTextWidth) {
            TextPaint textPaint = new TextPaint(AndroidGraphicFactory.getPaint(this.paintFront));
            TextPaint textPaint2 = this.paintBack != null ? new TextPaint(AndroidGraphicFactory.getPaint(this.paintBack)) : null;
            Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
            if (Position.LEFT == this.position || Position.BELOW_LEFT == this.position || Position.ABOVE_LEFT == this.position) {
                alignment = Layout.Alignment.ALIGN_OPPOSITE;
            } else if (Position.RIGHT == this.position || Position.BELOW_RIGHT == this.position || Position.ABOVE_RIGHT == this.position) {
                alignment = Layout.Alignment.ALIGN_NORMAL;
            }
            textPaint.setTextAlign(Paint.Align.LEFT);
            if (this.paintBack != null) {
                textPaint2.setTextAlign(Paint.Align.LEFT);
            }
            this.frontLayout = createTextLayout(textPaint, alignment);
            this.backLayout = null;
            if (this.paintBack != null) {
                this.backLayout = createTextLayout(textPaint2, alignment);
            }
            f = this.frontLayout.getWidth();
            i3 = this.frontLayout.getHeight();
        } else {
            f = this.textWidth;
            i3 = this.textHeight;
        }
        float f2 = i3;
        switch (AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$Position[this.position.ordinal()]) {
            case 1:
                this.boundary = new Rectangle((-f) / 2.0f, (-f2) / 2.0f, f / 2.0f, f2 / 2.0f);
                break;
            case 2:
                this.boundary = new Rectangle((-f) / 2.0f, 0.0d, f / 2.0f, f2);
                break;
            case 3:
                this.boundary = new Rectangle(-f, 0.0d, 0.0d, f2);
                break;
            case 4:
                this.boundary = new Rectangle(0.0d, 0.0d, f, f2);
                break;
            case 5:
                this.boundary = new Rectangle((-f) / 2.0f, -f2, f / 2.0f, 0.0d);
                break;
            case 6:
                this.boundary = new Rectangle(-f, -f2, 0.0d, 0.0d);
                break;
            case 7:
                this.boundary = new Rectangle(0.0d, -f2, f, 0.0d);
                break;
            case 8:
                this.boundary = new Rectangle(-f, (-f2) / 2.0f, 0.0d, f2 / 2.0f);
                break;
            case 9:
                this.boundary = new Rectangle(0.0d, (-f2) / 2.0f, f, f2 / 2.0f);
                break;
        }
    }

    /* renamed from: org.mapsforge.map.android.graphics.AndroidPointTextContainer$1, reason: invalid class name */
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
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.BELOW_LEFT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.BELOW_RIGHT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.ABOVE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.ABOVE_LEFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.ABOVE_RIGHT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.LEFT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Position[Position.RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    private StaticLayout createTextLayout(TextPaint textPaint, Layout.Alignment alignment) {
        return StaticLayout.Builder.obtain(this.text, 0, this.text.length(), textPaint, this.maxTextWidth).setBreakStrategy(1).setAlignment(alignment).setIncludePad(false).build();
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    @Override // org.mapsforge.core.mapelements.MapElementContainer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void draw(Canvas canvas, Point point, Matrix matrix, Filter filter) {
        float f;
        if (!this.isVisible) {
            return;
        }
        android.graphics.Canvas canvas2 = AndroidGraphicFactory.getCanvas(canvas);
        if (this.textWidth > this.maxTextWidth) {
            canvas2.save();
            canvas2.translate((float) ((this.xy.x - point.x) + this.boundary.left), (float) ((this.xy.y - point.y) + this.boundary.top));
            StaticLayout staticLayout = this.backLayout;
            if (staticLayout != null) {
                int color = staticLayout.getPaint().getColor();
                if (filter != Filter.NONE) {
                    this.backLayout.getPaint().setColor(GraphicUtils.filterColor(color, filter));
                }
                this.backLayout.draw(canvas2);
                if (filter != Filter.NONE) {
                    this.backLayout.getPaint().setColor(color);
                }
            }
            int color2 = this.frontLayout.getPaint().getColor();
            if (filter != Filter.NONE) {
                this.frontLayout.getPaint().setColor(GraphicUtils.filterColor(color2, filter));
            }
            this.frontLayout.draw(canvas2);
            if (filter != Filter.NONE) {
                this.frontLayout.getPaint().setColor(color2);
            }
            canvas2.restore();
            return;
        }
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$Position[this.position.ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3 || i == 4) {
                f = this.textHeight;
            } else if (i != 8 && i != 9) {
                f = 0.0f;
            }
            float f2 = (float) (this.xy.x - point.x);
            float f3 = ((float) (this.xy.y - point.y)) + f;
            if (this.paintBack != null) {
                int color3 = this.paintBack.getColor();
                if (filter != Filter.NONE) {
                    this.paintBack.setColor(GraphicUtils.filterColor(color3, filter));
                }
                canvas2.drawText(this.text, f2, f3, AndroidGraphicFactory.getPaint(this.paintBack));
                if (filter != Filter.NONE) {
                    this.paintBack.setColor(color3);
                }
            }
            int color4 = this.paintFront.getColor();
            if (filter != Filter.NONE) {
                this.paintFront.setColor(GraphicUtils.filterColor(color4, filter));
            }
            canvas2.drawText(this.text, f2, f3, AndroidGraphicFactory.getPaint(this.paintFront));
            if (filter == Filter.NONE) {
                this.paintFront.setColor(color4);
                return;
            }
            return;
        }
        f = this.textHeight / 2.0f;
        float f22 = (float) (this.xy.x - point.x);
        float f32 = ((float) (this.xy.y - point.y)) + f;
        if (this.paintBack != null) {
        }
        int color42 = this.paintFront.getColor();
        if (filter != Filter.NONE) {
        }
        canvas2.drawText(this.text, f22, f32, AndroidGraphicFactory.getPaint(this.paintFront));
        if (filter == Filter.NONE) {
        }
    }
}
