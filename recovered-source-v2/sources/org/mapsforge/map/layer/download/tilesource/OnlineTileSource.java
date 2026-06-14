package org.mapsforge.map.layer.download.tilesource;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.webkit.ProxyConfig;
import com.google.common.base.Ascii;
import java.net.MalformedURLException;
import java.net.URL;
import org.mapsforge.core.model.Tile;

/* loaded from: classes5.dex */
public class OnlineTileSource extends AbstractTileSource {
    private boolean alpha;
    private float alphaValue;
    private String baseUrl;
    private String extension;
    private String name;
    private int parallelRequestsLimit;
    private String protocol;
    private int tileSize;
    private byte zoomLevelMax;
    private byte zoomLevelMin;

    public OnlineTileSource(String[] strArr, int i) {
        super(strArr, i);
        this.alpha = false;
        this.alphaValue = 1.0f;
        this.baseUrl = DomExceptionUtils.SEPARATOR;
        this.extension = "png";
        this.parallelRequestsLimit = 8;
        this.protocol = ProxyConfig.MATCH_HTTP;
        this.tileSize = 256;
        this.zoomLevelMax = Ascii.DC2;
        this.zoomLevelMin = (byte) 0;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.AbstractTileSource
    public boolean equals(Object obj) {
        return super.equals(obj) && (obj instanceof OnlineTileSource) && this.baseUrl.equals(((OnlineTileSource) obj).baseUrl);
    }

    public float getAlphaValue() {
        return this.alphaValue;
    }

    public String getBaseUrl() {
        return this.baseUrl;
    }

    public String getExtension() {
        return this.extension;
    }

    public String getName() {
        return this.name;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public int getParallelRequestsLimit() {
        return this.parallelRequestsLimit;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public int getTileSize() {
        return this.tileSize;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public URL getTileUrl(Tile tile) throws MalformedURLException {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.baseUrl);
        sb.append((int) tile.zoomLevel);
        sb.append('/');
        sb.append(tile.tileX);
        sb.append('/');
        sb.append(tile.tileY);
        sb.append('.').append(this.extension);
        if (this.apiKey != null) {
            sb.append('?').append(this.keyName).append("=").append(this.apiKey);
        }
        return new URL(this.protocol, getHostName(), this.port, sb.toString());
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public byte getZoomLevelMax() {
        return this.zoomLevelMax;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public byte getZoomLevelMin() {
        return this.zoomLevelMin;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.TileSource
    public boolean hasAlpha() {
        return this.alpha;
    }

    @Override // org.mapsforge.map.layer.download.tilesource.AbstractTileSource
    public int hashCode() {
        return (super.hashCode() * 31) + this.baseUrl.hashCode();
    }

    public OnlineTileSource setAlpha(boolean z) {
        this.alpha = z;
        return this;
    }

    public OnlineTileSource setAlphaValue(float f) {
        this.alphaValue = Math.max(0.0f, Math.min(1.0f, f));
        return this;
    }

    public OnlineTileSource setBaseUrl(String str) {
        this.baseUrl = str;
        return this;
    }

    public OnlineTileSource setExtension(String str) {
        this.extension = str;
        return this;
    }

    public OnlineTileSource setName(String str) {
        this.name = str;
        return this;
    }

    public OnlineTileSource setParallelRequestsLimit(int i) {
        this.parallelRequestsLimit = i;
        return this;
    }

    public OnlineTileSource setProtocol(String str) {
        this.protocol = str;
        return this;
    }

    public OnlineTileSource setTileSize(int i) {
        this.tileSize = i;
        return this;
    }

    public OnlineTileSource setZoomLevelMax(byte b) {
        this.zoomLevelMax = b;
        return this;
    }

    public OnlineTileSource setZoomLevelMin(byte b) {
        this.zoomLevelMin = b;
        return this;
    }
}
