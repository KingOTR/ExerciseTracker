package org.mapsforge.map.layer.download.tilesource;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.google.common.base.Ascii;
import io.grpc.internal.GrpcUtil;
import java.net.MalformedURLException;
import java.net.URL;
import org.mapsforge.core.model.Tile;

/* loaded from: classes5.dex */
public class OpenStreetMapMapnik extends AbstractTileSource {
    public static final OpenStreetMapMapnik INSTANCE = new OpenStreetMapMapnik(new String[]{"tile.openstreetmap.org"}, GrpcUtil.DEFAULT_PORT_SSL);
    private static final int PARALLEL_REQUESTS_LIMIT = 8;
    private static final String PROTOCOL = "https";
    private static final int ZOOM_LEVEL_MAX = 18;
    private static final int ZOOM_LEVEL_MIN = 0;

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public int getParallelRequestsLimit() {
        return 8;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public byte getZoomLevelMax() {
        return Ascii.DC2;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public byte getZoomLevelMin() {
        return (byte) 0;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public boolean hasAlpha() {
        return false;
    }

    public OpenStreetMapMapnik(String[] strArr, int i) {
        super(strArr, i);
        this.defaultTimeToLive = 8279000L;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public URL getTileUrl(Tile tile) throws MalformedURLException {
        return new URL("https", getHostName(), this.port, DomExceptionUtils.SEPARATOR + ((int) tile.zoomLevel) + '/' + tile.tileX + '/' + tile.tileY + ".png");
    }
}
