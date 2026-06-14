package org.osmdroid.tileprovider.tilesource;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import org.osmdroid.util.MapTileIndex;

/* loaded from: classes5.dex */
public class XYTileSource extends OnlineTileSourceBase {
    public XYTileSource(String str, int i, int i2, int i3, String str2, String[] strArr) {
        super(str, i, i2, i3, str2, strArr);
    }

    public XYTileSource(String str, int i, int i2, int i3, String str2, String[] strArr, String str3) {
        super(str, i, i2, i3, str2, strArr, str3);
    }

    public XYTileSource(String str, int i, int i2, int i3, String str2, String[] strArr, String str3, TileSourcePolicy tileSourcePolicy) {
        super(str, i, i2, i3, str2, strArr, str3, tileSourcePolicy);
    }

    @Override // org.osmdroid.tileprovider.tilesource.BitmapTileSourceBase
    public String toString() {
        return name();
    }

    @Override // org.osmdroid.tileprovider.tilesource.OnlineTileSourceBase
    public String getTileURLString(long j) {
        return getBaseUrl() + MapTileIndex.getZoom(j) + DomExceptionUtils.SEPARATOR + MapTileIndex.getX(j) + DomExceptionUtils.SEPARATOR + MapTileIndex.getY(j) + this.mImageFilenameEnding;
    }
}
