package org.mapsforge.map.android.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Pair;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.GraphicUtils;
import org.mapsforge.core.graphics.ResourceBitmap;

/* loaded from: classes5.dex */
public class AndroidResourceBitmap extends AndroidBitmap implements ResourceBitmap {
    protected static final Logger LOGGER = Logger.getLogger(AndroidResourceBitmap.class.getName());
    protected static final Map<Integer, Pair<Bitmap, Integer>> RESOURCE_BITMAPS = new HashMap();
    protected static Set<Integer> rBitmaps;
    protected static AtomicInteger rInstances;
    private final int hash;

    private static boolean removeBitmap(int i) {
        return false;
    }

    public static void clearResourceBitmaps() {
        Map<Integer, Pair<Bitmap, Integer>> map = RESOURCE_BITMAPS;
        synchronized (map) {
            Iterator<Pair<Bitmap, Integer>> it = map.values().iterator();
            while (it.hasNext()) {
                ((Bitmap) it.next().first).recycle();
            }
            RESOURCE_BITMAPS.clear();
        }
    }

    private static Bitmap getResourceBitmap(InputStream inputStream, float f, int i, int i2, int i3, int i4) throws IOException {
        Map<Integer, Pair<Bitmap, Integer>> map = RESOURCE_BITMAPS;
        synchronized (map) {
            Pair<Bitmap, Integer> pair = map.get(Integer.valueOf(i4));
            if (pair != null) {
                map.put(Integer.valueOf(i4), new Pair<>((Bitmap) pair.first, Integer.valueOf(((Integer) pair.second).intValue() + 1)));
                return (Bitmap) pair.first;
            }
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, createBitmapFactoryOptions(AndroidGraphicFactory.TRANSPARENT_BITMAP));
            if (decodeStream == null) {
                throw new IOException("BitmapFactory failed to decodeStream");
            }
            float[] imageSize = GraphicUtils.imageSize(decodeStream.getWidth(), decodeStream.getHeight(), f, i, i2, i3);
            if (((int) imageSize[0]) != decodeStream.getWidth() || ((int) imageSize[1]) != decodeStream.getHeight()) {
                decodeStream = Bitmap.createScaledBitmap(decodeStream, (int) imageSize[0], (int) imageSize[1], true);
            }
            map.put(Integer.valueOf(i4), new Pair<>(decodeStream, 1));
            return decodeStream;
        }
    }

    protected AndroidResourceBitmap(int i) {
        this.hash = i;
    }

    AndroidResourceBitmap(InputStream inputStream, float f, int i, int i2, int i3, int i4) throws IOException {
        this(i4);
        this.bitmap = getResourceBitmap(inputStream, f, i, i2, i3, i4);
    }

    @Override // org.mapsforge.map.android.graphics.AndroidBitmap
    protected void destroyBitmap() {
        if (this.bitmap != null) {
            if (removeBitmap(this.hash)) {
                this.bitmap.recycle();
            }
            this.bitmap = null;
        }
    }
}
