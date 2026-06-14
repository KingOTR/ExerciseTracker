package org.mapsforge.map.android.graphics;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.mapsforge.core.graphics.Color;
import org.mapsforge.core.graphics.Display;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.Position;
import org.mapsforge.core.graphics.ResourceBitmap;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.mapelements.PointTextContainer;
import org.mapsforge.core.mapelements.SymbolContainer;
import org.mapsforge.core.model.BoundingBox;
import org.mapsforge.core.model.Point;
import org.mapsforge.map.model.DisplayModel;

/* loaded from: classes5.dex */
public final class AndroidGraphicFactory implements GraphicFactory {
    public static final boolean DEBUG_BITMAPS = false;
    public static final boolean KEEP_RESOURCE_BITMAPS = true;
    private final Context context;
    private File svgCacheDir;
    public static AndroidGraphicFactory INSTANCE = new AndroidGraphicFactory(null);
    public static final Bitmap.Config NON_TRANSPARENT_BITMAP = Bitmap.Config.RGB_565;
    public static final Bitmap.Config TRANSPARENT_BITMAP = Bitmap.Config.ARGB_8888;
    public static final Bitmap.Config MONO_ALPHA_BITMAP = Bitmap.Config.ALPHA_8;

    public static Bitmap convertToAndroidBitmap(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        Bitmap createBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, TRANSPARENT_BITMAP);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        drawable.draw(canvas);
        drawable.setBounds(bounds);
        return createBitmap;
    }

    public static org.mapsforge.core.graphics.Bitmap convertToBitmap(Drawable drawable) {
        return new AndroidBitmap(convertToAndroidBitmap(drawable));
    }

    public static org.mapsforge.core.graphics.Bitmap convertToBitmap(Drawable drawable, Paint paint) {
        Bitmap copy = convertToAndroidBitmap(drawable).copy(TRANSPARENT_BITMAP, true);
        new Canvas(copy).drawBitmap(copy, 0.0f, 0.0f, paint);
        return new AndroidBitmap(copy);
    }

    public static org.mapsforge.core.graphics.Canvas createGraphicContext(Canvas canvas) {
        return new AndroidCanvas(canvas);
    }

    public static void createInstance(Context context) {
        INSTANCE = new AndroidGraphicFactory(context);
    }

    public static int getBytesPerPixel(Bitmap.Config config) {
        if (config == Bitmap.Config.ARGB_8888) {
            return 4;
        }
        if (config == Bitmap.Config.RGB_565 || config == Bitmap.Config.ARGB_4444) {
            return 2;
        }
        Bitmap.Config config2 = Bitmap.Config.ALPHA_8;
        return 1;
    }

    public static Canvas getCanvas(org.mapsforge.core.graphics.Canvas canvas) {
        return ((AndroidCanvas) canvas).canvas;
    }

    public static Paint getPaint(org.mapsforge.core.graphics.Paint paint) {
        return ((AndroidPaint) paint).paint;
    }

    public static Bitmap getBitmap(org.mapsforge.core.graphics.Bitmap bitmap) {
        return ((AndroidBitmap) bitmap).bitmap;
    }

    /* renamed from: org.mapsforge.map.android.graphics.AndroidGraphicFactory$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$graphics$Color;

        static {
            int[] iArr = new int[Color.values().length];
            $SwitchMap$org$mapsforge$core$graphics$Color = iArr;
            try {
                iArr[Color.BLACK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Color[Color.BLUE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Color[Color.GREEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Color[Color.RED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Color[Color.TRANSPARENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Color[Color.WHITE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static int getColor(Color color) {
        switch (AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$Color[color.ordinal()]) {
            case 1:
                return ViewCompat.MEASURED_STATE_MASK;
            case 2:
                return -16776961;
            case 3:
                return -16711936;
            case 4:
                return SupportMenu.CATEGORY_MASK;
            case 5:
                return 0;
            case 6:
                return -1;
            default:
                throw new IllegalArgumentException("unknown color: " + color);
        }
    }

    static Matrix getMatrix(org.mapsforge.core.graphics.Matrix matrix) {
        return ((AndroidMatrix) matrix).matrix;
    }

    static Path getPath(org.mapsforge.core.graphics.Path path) {
        return ((AndroidPath) path).path;
    }

    private AndroidGraphicFactory(Context context) {
        this.context = context;
        if (context != null) {
            DisplayModel.setDeviceScaleFactor(context.getResources().getDisplayMetrics().density);
        }
    }

    public static void clearResourceFileCache() {
        AndroidSvgBitmapStore.clear();
    }

    public static void clearResourceMemoryCache() {
        AndroidResourceBitmap.clearResourceBitmaps();
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public org.mapsforge.core.graphics.Bitmap createBitmap(int i, int i2) {
        return new AndroidBitmap(i, i2, TRANSPARENT_BITMAP);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public org.mapsforge.core.graphics.Bitmap createBitmap(int i, int i2, boolean z) {
        if (z) {
            return new AndroidBitmap(i, i2, TRANSPARENT_BITMAP);
        }
        return new AndroidBitmap(i, i2, NON_TRANSPARENT_BITMAP);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public org.mapsforge.core.graphics.Canvas createCanvas() {
        return new AndroidCanvas();
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public int createColor(Color color) {
        return getColor(color);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public int createColor(int i, int i2, int i3, int i4) {
        return android.graphics.Color.argb(i, i2, i3, i4);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public org.mapsforge.core.graphics.Matrix createMatrix() {
        return new AndroidMatrix();
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public AndroidHillshadingBitmap createMonoBitmap(int i, int i2, byte[] bArr, int i3, BoundingBox boundingBox) {
        int i4 = i3 * 2;
        AndroidHillshadingBitmap androidHillshadingBitmap = new AndroidHillshadingBitmap(i + i4, i2 + i4, i3, boundingBox);
        if (bArr != null) {
            androidHillshadingBitmap.bitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        }
        return androidHillshadingBitmap;
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public org.mapsforge.core.graphics.Paint createPaint() {
        return new AndroidPaint();
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public org.mapsforge.core.graphics.Paint createPaint(org.mapsforge.core.graphics.Paint paint) {
        return new AndroidPaint(paint);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public org.mapsforge.core.graphics.Path createPath() {
        return new AndroidPath();
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public PointTextContainer createPointTextContainer(Point point, Display display, int i, String str, org.mapsforge.core.graphics.Paint paint, org.mapsforge.core.graphics.Paint paint2, SymbolContainer symbolContainer, Position position, int i2) {
        return new AndroidPointTextContainer(point, display, i, str, paint, paint2, symbolContainer, position, i2);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public ResourceBitmap createResourceBitmap(InputStream inputStream, float f, int i, int i2, int i3, int i4) throws IOException {
        return new AndroidResourceBitmap(inputStream, f, i, i2, i3, i4);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public TileBitmap createTileBitmap(InputStream inputStream, int i, boolean z) {
        return new AndroidTileBitmap(inputStream, i, z);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public TileBitmap createTileBitmap(int i, boolean z) {
        return new AndroidTileBitmap(i, z);
    }

    public boolean deleteFile(String str) {
        if (this.svgCacheDir != null) {
            return new File(this.svgCacheDir, str).delete();
        }
        return this.context.deleteFile(str);
    }

    public String[] fileList() {
        File file = this.svgCacheDir;
        if (file != null) {
            return file.list();
        }
        return this.context.fileList();
    }

    public FileInputStream openFileInput(String str) throws FileNotFoundException {
        if (this.svgCacheDir != null) {
            return new FileInputStream(new File(this.svgCacheDir, str));
        }
        return this.context.openFileInput(str);
    }

    public FileOutputStream openFileOutput(String str, int i) throws FileNotFoundException {
        if (this.svgCacheDir != null) {
            return new FileOutputStream(new File(this.svgCacheDir, str), i == 32768);
        }
        return this.context.openFileOutput(str, i);
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public InputStream platformSpecificSources(String str, String str2) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        String sb2 = sb.append(str).append(str2).toString();
        try {
            return this.context.getAssets().open(sb2);
        } catch (IOException unused) {
            throw new FileNotFoundException("invalid resource: " + sb2);
        }
    }

    @Override // org.mapsforge.core.graphics.GraphicFactory
    public ResourceBitmap renderSvg(InputStream inputStream, float f, int i, int i2, int i3, int i4) throws IOException {
        return new AndroidSvgBitmap(inputStream, i4, f, i, i2, i3);
    }

    public void setSvgCacheDir(File file) {
        this.svgCacheDir = file;
    }
}
