package org.mapsforge.map.android.graphics;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import org.mapsforge.core.graphics.Bitmap;
import org.mapsforge.core.graphics.Canvas;
import org.mapsforge.core.graphics.Filter;
import org.mapsforge.core.graphics.Matrix;
import org.mapsforge.core.graphics.Path;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Dimension;
import org.mapsforge.core.model.Rectangle;

/* loaded from: classes5.dex */
class AndroidCanvas implements Canvas {
    private static final float[] INVERT_MATRIX = {-1.0f, 0.0f, 0.0f, 0.0f, 255.0f, 0.0f, -1.0f, 0.0f, 0.0f, 255.0f, 0.0f, 0.0f, -1.0f, 0.0f, 255.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f};
    private final Paint bitmapPaint;
    android.graphics.Canvas canvas;
    private ColorFilter grayscaleFilter;
    private ColorFilter grayscaleInvertFilter;
    private HilshadingTemps hillshadingTemps;
    private ColorFilter invertFilter;

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void resetClip() {
    }

    AndroidCanvas() {
        Paint paint = new Paint();
        this.bitmapPaint = paint;
        this.hillshadingTemps = null;
        this.canvas = new android.graphics.Canvas();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        createFilters();
    }

    AndroidCanvas(android.graphics.Canvas canvas) {
        this.bitmapPaint = new Paint();
        this.hillshadingTemps = null;
        this.canvas = canvas;
        createFilters();
    }

    private void applyFilter(Filter filter) {
        if (filter == Filter.NONE) {
            return;
        }
        int i = AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$Filter[filter.ordinal()];
        if (i == 1) {
            this.bitmapPaint.setColorFilter(this.grayscaleFilter);
        } else if (i == 2) {
            this.bitmapPaint.setColorFilter(this.grayscaleInvertFilter);
        } else {
            if (i != 3) {
                return;
            }
            this.bitmapPaint.setColorFilter(this.invertFilter);
        }
    }

    /* renamed from: org.mapsforge.map.android.graphics.AndroidCanvas$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$graphics$Filter;

        static {
            int[] iArr = new int[Filter.values().length];
            $SwitchMap$org$mapsforge$core$graphics$Filter = iArr;
            try {
                iArr[Filter.GRAYSCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Filter[Filter.GRAYSCALE_INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Filter[Filter.INVERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private void createFilters() {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorMatrix.setSaturation(0.0f);
        this.grayscaleFilter = new ColorMatrixColorFilter(colorMatrix);
        ColorMatrix colorMatrix2 = new ColorMatrix();
        colorMatrix2.setSaturation(0.0f);
        float[] fArr = INVERT_MATRIX;
        colorMatrix2.postConcat(new ColorMatrix(fArr));
        this.grayscaleInvertFilter = new ColorMatrixColorFilter(colorMatrix2);
        this.invertFilter = new ColorMatrixColorFilter(fArr);
    }

    @Override // org.mapsforge.core.graphics.Canvas
    public void destroy() {
        this.canvas = null;
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawBitmap(Bitmap bitmap, int i, int i2) {
        android.graphics.Bitmap bitmap2 = AndroidGraphicFactory.getBitmap(bitmap);
        if (AndroidGraphicFactory.MONO_ALPHA_BITMAP.equals(bitmap2.getConfig())) {
            this.canvas.drawColor(Color.argb(0, 0, 0, 0), PorterDuff.Mode.SRC);
        }
        this.canvas.drawBitmap(bitmap2, i, i2, this.bitmapPaint);
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawBitmap(Bitmap bitmap, int i, int i2, float f, Filter filter) {
        int alpha = this.bitmapPaint.getAlpha();
        if (f != 1.0f) {
            this.bitmapPaint.setAlpha((int) (f * 255.0f));
        }
        applyFilter(filter);
        this.canvas.drawBitmap(AndroidGraphicFactory.getBitmap(bitmap), i, i2, this.bitmapPaint);
        if (filter != Filter.NONE) {
            this.bitmapPaint.setColorFilter(null);
        }
        if (f != 1.0f) {
            this.bitmapPaint.setAlpha(alpha);
        }
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawBitmap(Bitmap bitmap, Matrix matrix) {
        this.canvas.drawBitmap(AndroidGraphicFactory.getBitmap(bitmap), AndroidGraphicFactory.getMatrix(matrix), this.bitmapPaint);
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawBitmap(Bitmap bitmap, Matrix matrix, float f, Filter filter) {
        int alpha = this.bitmapPaint.getAlpha();
        if (f != 1.0f) {
            this.bitmapPaint.setAlpha((int) (f * 255.0f));
        }
        applyFilter(filter);
        this.canvas.drawBitmap(AndroidGraphicFactory.getBitmap(bitmap), AndroidGraphicFactory.getMatrix(matrix), this.bitmapPaint);
        if (filter != Filter.NONE) {
            this.bitmapPaint.setColorFilter(null);
        }
        if (f != 1.0f) {
            this.bitmapPaint.setAlpha(alpha);
        }
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.canvas.drawBitmap(AndroidGraphicFactory.getBitmap(bitmap), new Rect(i, i2, i3, i4), new Rect(i5, i6, i7, i8), this.bitmapPaint);
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawBitmap(Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f, Filter filter) {
        int alpha = this.bitmapPaint.getAlpha();
        if (f != 1.0f) {
            this.bitmapPaint.setAlpha((int) (f * 255.0f));
        }
        applyFilter(filter);
        this.canvas.drawBitmap(AndroidGraphicFactory.getBitmap(bitmap), new Rect(i, i2, i3, i4), new Rect(i5, i6, i7, i8), this.bitmapPaint);
        if (filter != Filter.NONE) {
            this.bitmapPaint.setColorFilter(null);
        }
        if (f != 1.0f) {
            this.bitmapPaint.setAlpha(alpha);
        }
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawCircle(int i, int i2, int i3, org.mapsforge.core.graphics.Paint paint) {
        if (paint.isTransparent()) {
            return;
        }
        this.canvas.drawCircle(i, i2, i3, AndroidGraphicFactory.getPaint(paint));
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawLine(int i, int i2, int i3, int i4, org.mapsforge.core.graphics.Paint paint) {
        if (paint.isTransparent()) {
            return;
        }
        this.canvas.drawLine(i, i2, i3, i4, AndroidGraphicFactory.getPaint(paint));
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawPath(Path path, org.mapsforge.core.graphics.Paint paint) {
        if (paint.isTransparent()) {
            return;
        }
        this.canvas.drawPath(AndroidGraphicFactory.getPath(path), AndroidGraphicFactory.getPaint(paint));
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawPathText(String str, Path path, org.mapsforge.core.graphics.Paint paint) {
        if (str == null || str.trim().isEmpty() || paint.isTransparent()) {
            return;
        }
        Paint paint2 = AndroidGraphicFactory.getPaint(paint);
        this.canvas.drawTextOnPath(str, AndroidGraphicFactory.getPath(path), 0.0f, paint2.getTextSize() / 4.0f, paint2);
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawText(String str, int i, int i2, org.mapsforge.core.graphics.Paint paint) {
        if (str == null || str.trim().isEmpty() || paint.isTransparent()) {
            return;
        }
        this.canvas.drawText(str, i, i2, AndroidGraphicFactory.getPaint(paint));
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void drawTextRotated(String str, int i, int i2, int i3, int i4, org.mapsforge.core.graphics.Paint paint) {
        if (str == null || str.trim().isEmpty() || paint.isTransparent()) {
            return;
        }
        android.graphics.Path path = new android.graphics.Path();
        path.moveTo(i, i2);
        path.lineTo(i3, i4);
        this.canvas.drawTextOnPath(str, path, 0.0f, 3.0f, AndroidGraphicFactory.getPaint(paint));
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void fillColor(org.mapsforge.core.graphics.Color color) {
        fillColor(AndroidGraphicFactory.getColor(color));
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void fillColor(int i) {
        this.canvas.drawColor(i, ((i >> 24) & 255) == 0 ? PorterDuff.Mode.CLEAR : PorterDuff.Mode.SRC_OVER);
    }

    @Override // org.mapsforge.core.graphics.Canvas
    public Dimension getDimension() {
        return new Dimension(getWidth(), getHeight());
    }

    @Override // org.mapsforge.core.graphics.Canvas
    public int getHeight() {
        return this.canvas.getHeight();
    }

    @Override // org.mapsforge.core.graphics.Canvas
    public int getWidth() {
        return this.canvas.getWidth();
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public boolean isAntiAlias() {
        return this.bitmapPaint.isAntiAlias();
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public boolean isFilterBitmap() {
        return this.bitmapPaint.isFilterBitmap();
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void setAntiAlias(boolean z) {
        this.bitmapPaint.setAntiAlias(z);
    }

    @Override // org.mapsforge.core.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        this.canvas.setBitmap(AndroidGraphicFactory.getBitmap(bitmap));
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void setClip(int i, int i2, int i3, int i4) {
        setClip(i, i2, i3, i4, false);
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void setClip(int i, int i2, int i3, int i4, boolean z) {
        if (z) {
            this.canvas.clipRect(i, i2, i3 + i, i4 + i2);
        }
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void setClipDifference(int i, int i2, int i3, int i4) {
        this.canvas.clipOutRect(i, i2, i3 + i, i4 + i2);
    }

    private void setClipInternal(int i, int i2, int i3, int i4, Region.Op op) {
        this.canvas.clipRect(i, i2, i + i3, i2 + i4, op);
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void setFilterBitmap(boolean z) {
        this.bitmapPaint.setFilterBitmap(z);
    }

    @Override // org.mapsforge.core.graphics.GraphicContext
    public void shadeBitmap(Bitmap bitmap, Rectangle rectangle, Rectangle rectangle2, float f) {
        android.graphics.Bitmap bitmap2;
        android.graphics.Bitmap bitmap3;
        this.canvas.save();
        AnonymousClass1 anonymousClass1 = null;
        if (this.hillshadingTemps == null) {
            this.hillshadingTemps = new HilshadingTemps(anonymousClass1);
        }
        HilshadingTemps hilshadingTemps = this.hillshadingTemps;
        Paint useAlphaPaint = hilshadingTemps.useAlphaPaint((int) (255.0f * f));
        if (bitmap == null) {
            if (rectangle2 != null) {
                this.canvas.clipRect((float) rectangle2.left, (float) rectangle2.top, (float) rectangle2.right, (float) rectangle2.bottom);
            }
            this.canvas.drawBitmap(this.hillshadingTemps.useNeutralShadingPixel(), this.hillshadingTemps.useAsr(0, 0, 1, 1), this.hillshadingTemps.useAdr(0, 0, this.canvas.getWidth(), this.canvas.getHeight()), useAlphaPaint);
            this.canvas.restore();
            return;
        }
        android.graphics.Bitmap bitmap4 = AndroidGraphicFactory.getBitmap(bitmap);
        double width = rectangle2.getWidth() / rectangle.getWidth();
        double height = rectangle2.getHeight() / rectangle.getHeight();
        if (width < 1.0d && height < 1.0d) {
            this.canvas.clipRect((float) rectangle2.left, (float) rectangle2.top, (float) rectangle2.right, (float) rectangle2.bottom);
            android.graphics.Matrix useMatrix = hilshadingTemps.useMatrix();
            useMatrix.preTranslate((float) rectangle2.left, (float) rectangle2.top);
            useMatrix.preScale((float) width, (float) height);
            useMatrix.preTranslate((float) (-rectangle.left), (float) (-rectangle.top));
            this.canvas.drawBitmap(bitmap4, useMatrix, useAlphaPaint);
        } else {
            double min = Math.min(rectangle.left, (rectangle.left - Math.floor(rectangle.left)) + 1.0d);
            double min2 = Math.min(bitmap.getWidth() - rectangle.right, (Math.floor(rectangle.right) + 2.0d) - rectangle.right);
            int ceil = (int) Math.ceil((width * min2) + (width * min) + ((rectangle.right - rectangle.left) * width));
            double min3 = Math.min(rectangle.top, (rectangle.top - Math.floor(rectangle.top)) + 1.0d);
            double min4 = Math.min(bitmap.getHeight() - rectangle.bottom, (Math.floor(rectangle.bottom) + 2.0d) - rectangle.bottom);
            int ceil2 = (int) Math.ceil((height * min4) + (height * min3) + ((rectangle.bottom - rectangle.top) * height));
            int round = (int) Math.round(rectangle.left - min);
            int round2 = (int) Math.round(rectangle.top - min3);
            int round3 = (int) Math.round(rectangle.right + min2);
            int round4 = (int) Math.round(rectangle.bottom + min4);
            android.graphics.Canvas useCanvas = hilshadingTemps.useCanvas();
            if (round == 0 && round2 == 0) {
                round3++;
                bitmap3 = android.graphics.Bitmap.createBitmap(round3, round4, bitmap4.getConfig());
                useCanvas.setBitmap(bitmap3);
                bitmap2 = bitmap4;
                useCanvas.drawBitmap(bitmap2, 1.0f, 0.0f, (Paint) null);
                round++;
            } else {
                bitmap2 = bitmap4;
                bitmap3 = bitmap2;
            }
            Rect useAsr = hilshadingTemps.useAsr(round, round2, round3, round4);
            Rect useAdr = hilshadingTemps.useAdr(0, 0, ceil, ceil2);
            android.graphics.Bitmap useScaleBitmap = hilshadingTemps.useScaleBitmap(ceil, ceil2, bitmap2.getConfig());
            useCanvas.setBitmap(useScaleBitmap);
            useCanvas.drawBitmap(bitmap3, useAsr, useAdr, this.bitmapPaint);
            this.canvas.clipRect((float) rectangle2.left, (float) rectangle2.top, (float) rectangle2.right, (float) rectangle2.bottom);
            this.canvas.drawBitmap(useScaleBitmap, (int) Math.round(rectangle2.left - r14), (int) Math.round(rectangle2.top - r12), useAlphaPaint);
        }
        this.canvas.restore();
    }

    private static class HilshadingTemps {
        private final Rect adr;
        private final Rect asr;
        private android.graphics.Bitmap neutralShadingPixel;
        private android.graphics.Bitmap scaleTemp;
        private final Paint shadePaint;
        private android.graphics.Bitmap shiftTemp;
        private final android.graphics.Canvas tmpCanvas;
        private android.graphics.Matrix tmpMatrix;

        /* synthetic */ HilshadingTemps(AnonymousClass1 anonymousClass1) {
            this();
        }

        private HilshadingTemps() {
            this.asr = new Rect(0, 0, 0, 0);
            this.adr = new Rect(0, 0, 0, 0);
            this.tmpCanvas = new android.graphics.Canvas();
            this.neutralShadingPixel = AndroidGraphicFactory.INSTANCE.createMonoBitmap(1, 1, new byte[]{Byte.MAX_VALUE}, 0, (BoundingBox) null).bitmap;
            Paint paint = new Paint();
            this.shadePaint = paint;
            paint.setAntiAlias(true);
            paint.setFilterBitmap(true);
        }

        Rect useAsr(int i, int i2, int i3, int i4) {
            this.asr.left = i;
            this.asr.top = i2;
            this.asr.right = i3;
            this.asr.bottom = i4;
            return this.asr;
        }

        Rect useAdr(int i, int i2, int i3, int i4) {
            this.adr.left = i;
            this.adr.top = i2;
            this.adr.right = i3;
            this.adr.bottom = i4;
            return this.adr;
        }

        android.graphics.Canvas useCanvas() {
            return this.tmpCanvas;
        }

        android.graphics.Bitmap useScaleBitmap(int i, int i2, Bitmap.Config config) {
            android.graphics.Bitmap internalUseBitmap = internalUseBitmap(this.scaleTemp, i, i2, config);
            this.scaleTemp = internalUseBitmap;
            return internalUseBitmap;
        }

        android.graphics.Bitmap useShiftBitmap(int i, int i2, Bitmap.Config config) {
            android.graphics.Bitmap internalUseBitmap = internalUseBitmap(this.shiftTemp, i, i2, config);
            this.shiftTemp = internalUseBitmap;
            return internalUseBitmap;
        }

        private android.graphics.Bitmap internalUseBitmap(android.graphics.Bitmap bitmap, int i, int i2, Bitmap.Config config) {
            if (bitmap == null) {
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(i, i2, config);
                this.tmpCanvas.setBitmap(createBitmap);
                return createBitmap;
            }
            if (bitmap.getWidth() < i || bitmap.getHeight() < i2 || !bitmap.getConfig().equals(config)) {
                bitmap.recycle();
                android.graphics.Bitmap createBitmap2 = android.graphics.Bitmap.createBitmap(i, i2, config);
                this.tmpCanvas.setBitmap(createBitmap2);
                return createBitmap2;
            }
            this.tmpCanvas.setBitmap(bitmap);
            this.tmpCanvas.drawColor(Color.argb(0, 0, 0, 0), PorterDuff.Mode.SRC);
            return bitmap;
        }

        Paint useAlphaPaint(int i) {
            this.shadePaint.setAlpha(i);
            return this.shadePaint;
        }

        android.graphics.Bitmap useNeutralShadingPixel() {
            return this.neutralShadingPixel;
        }

        android.graphics.Matrix useMatrix() {
            if (this.tmpMatrix == null) {
                this.tmpMatrix = new android.graphics.Matrix();
            }
            this.tmpMatrix.reset();
            return this.tmpMatrix;
        }
    }
}
