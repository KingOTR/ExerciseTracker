package org.mapsforge.map.android.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.CorruptedInputStreamException;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.util.IOUtils;

/* loaded from: classes5.dex */
public class AndroidTileBitmap extends AndroidBitmap implements TileBitmap {
    private static final Logger LOGGER = Logger.getLogger(AndroidTileBitmap.class.getName());
    private static Map<Integer, Set<SoftReference<Bitmap>>> reusableTileBitmaps = new HashMap();
    private static AtomicInteger tileInstances;
    private long expiration = 0;
    private long timestamp = System.currentTimeMillis();

    private static int composeHash(int i, boolean z) {
        return z ? i + 268435456 : i;
    }

    private static Bitmap getTileBitmapFromReusableSet(int i, boolean z) {
        int composeHash = composeHash(i, z);
        synchronized (reusableTileBitmaps) {
            Set<SoftReference<Bitmap>> set = reusableTileBitmaps.get(Integer.valueOf(composeHash));
            Bitmap bitmap = null;
            if (set == null) {
                return null;
            }
            Iterator<SoftReference<Bitmap>> it = set.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Bitmap bitmap2 = it.next().get();
                if (bitmap2 != null && bitmap2.isMutable()) {
                    if (z) {
                        bitmap2.eraseColor(0);
                    }
                    it.remove();
                    bitmap = bitmap2;
                } else {
                    it.remove();
                }
            }
            return bitmap;
        }
    }

    AndroidTileBitmap(InputStream inputStream, int i, boolean z) {
        try {
            this.bitmap = BitmapFactory.decodeStream(inputStream, null, createTileBitmapFactoryOptions(i, z));
            this.bitmap.getWidth();
        } catch (Exception e) {
            LOGGER.info("TILEBITMAP ERROR " + e.toString());
            this.bitmap = null;
            IOUtils.closeQuietly(inputStream);
            destroy();
            throw new CorruptedInputStreamException("Corrupted bitmap input stream", e);
        }
    }

    AndroidTileBitmap(int i, boolean z) {
        Bitmap.Config config;
        this.bitmap = getTileBitmapFromReusableSet(i, z);
        if (this.bitmap == null) {
            if (z) {
                config = AndroidGraphicFactory.TRANSPARENT_BITMAP;
            } else {
                config = AndroidGraphicFactory.NON_TRANSPARENT_BITMAP;
            }
            this.bitmap = AndroidBitmap.createAndroidBitmap(i, i, config);
        }
    }

    @Override // org.mapsforge.core.graphics.TileBitmap
    public long getTimestamp() {
        return this.timestamp;
    }

    @Override // org.mapsforge.core.graphics.TileBitmap
    public boolean isExpired() {
        long j = this.expiration;
        return j != 0 && j <= System.currentTimeMillis();
    }

    @Override // org.mapsforge.core.graphics.TileBitmap
    public void setExpiration(long j) {
        this.expiration = j;
    }

    @Override // org.mapsforge.core.graphics.TileBitmap
    public void setTimestamp(long j) {
        this.timestamp = j;
    }

    @Override // org.mapsforge.map.android.graphics.AndroidBitmap
    protected void destroy() {
        super.destroy();
    }

    @Override // org.mapsforge.map.android.graphics.AndroidBitmap
    protected void destroyBitmap() {
        if (this.bitmap != null) {
            int height = getHeight();
            synchronized (reusableTileBitmaps) {
                int composeHash = composeHash(height, this.bitmap.hasAlpha());
                if (!reusableTileBitmaps.containsKey(Integer.valueOf(composeHash))) {
                    reusableTileBitmaps.put(Integer.valueOf(composeHash), new HashSet());
                }
                reusableTileBitmaps.get(Integer.valueOf(composeHash)).add(new SoftReference<>(this.bitmap));
            }
            this.bitmap = null;
        }
    }

    private BitmapFactory.Options createTileBitmapFactoryOptions(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = AndroidGraphicFactory.TRANSPARENT_BITMAP;
        } else {
            options.inPreferredConfig = AndroidGraphicFactory.NON_TRANSPARENT_BITMAP;
        }
        if (getTileBitmapFromReusableSet(i, z) != null) {
            options.inMutable = true;
            options.inSampleSize = 1;
            options.inBitmap = getTileBitmapFromReusableSet(i, z);
        }
        return options;
    }
}
