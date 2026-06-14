package org.mapsforge.map.android.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Picture;
import android.graphics.RectF;
import android.util.Pair;
import com.caverock.androidsvg.SVG;
import java.io.IOException;
import java.io.InputStream;
import org.mapsforge.core.graphics.GraphicUtils;

/* loaded from: classes5.dex */
public class AndroidSvgBitmap extends AndroidResourceBitmap {
    public static float DEFAULT_SIZE = 400.0f;

    public static Bitmap getResourceBitmap(InputStream inputStream, float f, float f2, int i, int i2, int i3) throws IOException {
        try {
            Picture renderToPicture = SVG.getFromInputStream(inputStream).renderToPicture();
            float[] imageSize = GraphicUtils.imageSize(renderToPicture.getWidth(), renderToPicture.getHeight(), (float) (f / Math.sqrt((renderToPicture.getHeight() * renderToPicture.getWidth()) / f2)), i, i2, i3);
            Bitmap createBitmap = Bitmap.createBitmap((int) Math.ceil(imageSize[0]), (int) Math.ceil(imageSize[1]), AndroidGraphicFactory.TRANSPARENT_BITMAP);
            new Canvas(createBitmap).drawPicture(renderToPicture, new RectF(0.0f, 0.0f, imageSize[0], imageSize[1]));
            return createBitmap;
        } catch (Exception e) {
            throw new IOException(e);
        }
    }

    private static Bitmap getResourceBitmapImpl(InputStream inputStream, int i, float f, int i2, int i3, int i4) throws IOException {
        synchronized (RESOURCE_BITMAPS) {
            Pair<Bitmap, Integer> pair = RESOURCE_BITMAPS.get(Integer.valueOf(i));
            if (pair != null) {
                RESOURCE_BITMAPS.put(Integer.valueOf(i), new Pair<>((Bitmap) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
                return (Bitmap) pair.first;
            }
            Bitmap bitmap = AndroidSvgBitmapStore.get(i);
            if (bitmap == null) {
                bitmap = getResourceBitmap(inputStream, f, DEFAULT_SIZE, i2, i3, i4);
                AndroidSvgBitmapStore.put(i, bitmap);
            }
            RESOURCE_BITMAPS.put(Integer.valueOf(i), new Pair<>(bitmap, 1));
            return bitmap;
        }
    }

    public AndroidSvgBitmap(InputStream inputStream, int i, float f, int i2, int i3, int i4) throws IOException {
        super(i);
        this.bitmap = getResourceBitmapImpl(inputStream, i, f, i2, i3, i4);
    }
}
