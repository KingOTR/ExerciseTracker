package org.mapsforge.core.graphics;

/* loaded from: classes5.dex */
public interface TileBitmap extends Bitmap {
    long getTimestamp();

    boolean isExpired();

    void setExpiration(long j);

    void setTimestamp(long j);
}
