package org.mapsforge.core.graphics;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes5.dex */
public interface Bitmap {
    void compress(OutputStream outputStream) throws IOException;

    void decrementRefCount();

    int getHeight();

    int getWidth();

    void incrementRefCount();

    boolean isDestroyed();

    void scaleTo(int i, int i2);

    void setBackgroundColor(int i);
}
