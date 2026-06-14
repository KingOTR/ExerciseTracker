package org.mapsforge.map.android.graphics;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.SoftReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import org.mapsforge.core.graphics.Bitmap;

/* loaded from: classes5.dex */
public class AndroidBitmap implements Bitmap {
    protected android.graphics.Bitmap bitmap;
    private AtomicInteger refCount;
    private static final Logger LOGGER = Logger.getLogger(AndroidBitmap.class.getName());
    private static final Set<SoftReference<android.graphics.Bitmap>> REUSABLE_BITMAPS = new HashSet();
    private static final List<AndroidBitmap> BITMAP_LIST = null;
    private static final AtomicInteger BITMAP_INSTANCES = null;

    protected static android.graphics.Bitmap createAndroidBitmap(int i, int i2, Bitmap.Config config) {
        return android.graphics.Bitmap.createBitmap(i, i2, config);
    }

    protected static final BitmapFactory.Options createBitmapFactoryOptions(Bitmap.Config config) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = config;
        return options;
    }

    protected AndroidBitmap() {
        this.refCount = new AtomicInteger();
    }

    public AndroidBitmap(android.graphics.Bitmap bitmap) {
        this();
        if (bitmap.isRecycled()) {
            throw new IllegalArgumentException("bitmap is already recycled");
        }
        this.bitmap = bitmap;
    }

    AndroidBitmap(int i, int i2, Bitmap.Config config) {
        this();
        android.graphics.Bitmap bitmapFromReusableSet = getBitmapFromReusableSet(i, i2, config);
        this.bitmap = bitmapFromReusableSet;
        if (bitmapFromReusableSet == null) {
            this.bitmap = createAndroidBitmap(i, i2, config);
        }
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public void compress(OutputStream outputStream) throws IOException {
        if (!this.bitmap.compress(Bitmap.CompressFormat.PNG, 0, outputStream)) {
            throw new IOException("Failed to write bitmap to output stream");
        }
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public void decrementRefCount() {
        if (this.refCount.decrementAndGet() < 0) {
            destroy();
        }
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public int getWidth() {
        return this.bitmap.getWidth();
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public void incrementRefCount() {
        this.refCount.incrementAndGet();
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public boolean isDestroyed() {
        return this.bitmap == null;
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public void scaleTo(int i, int i2) {
        if (getWidth() == i && getHeight() == i2) {
            return;
        }
        android.graphics.Bitmap createScaledBitmap = android.graphics.Bitmap.createScaledBitmap(this.bitmap, i, i2, true);
        destroy();
        this.bitmap = createScaledBitmap;
    }

    @Override // org.mapsforge.core.graphics.Bitmap
    public void setBackgroundColor(int i) {
        this.bitmap.eraseColor(i);
    }

    public String toString() {
        String str;
        android.graphics.Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            if (bitmap.hasAlpha()) {
                str = " has alpha";
            } else {
                str = " no alpha";
            }
        } else {
            str = " is recycled";
        }
        return super.toString() + " rC " + Integer.toString(this.refCount.get()) + str;
    }

    protected final boolean canUseBitmap(android.graphics.Bitmap bitmap, int i, int i2) {
        return bitmap.getWidth() == i && bitmap.getHeight() == i2;
    }

    protected void destroy() {
        destroyBitmap();
    }

    protected void destroyBitmap() {
        if (this.bitmap != null) {
            Set<SoftReference<android.graphics.Bitmap>> set = REUSABLE_BITMAPS;
            synchronized (set) {
                set.add(new SoftReference<>(this.bitmap));
            }
            this.bitmap = null;
        }
    }

    protected final android.graphics.Bitmap getBitmapFromReusableSet(int i, int i2, Bitmap.Config config) {
        Set<SoftReference<android.graphics.Bitmap>> set = REUSABLE_BITMAPS;
        android.graphics.Bitmap bitmap = null;
        if (set != null && !set.isEmpty()) {
            synchronized (set) {
                Iterator<SoftReference<android.graphics.Bitmap>> it = set.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    android.graphics.Bitmap bitmap2 = it.next().get();
                    if (bitmap2 != null && bitmap2.isMutable()) {
                        if (canUseBitmap(bitmap2, i, i2)) {
                            it.remove();
                            bitmap = bitmap2;
                            break;
                        }
                    } else {
                        it.remove();
                    }
                }
            }
        }
        return bitmap;
    }
}
