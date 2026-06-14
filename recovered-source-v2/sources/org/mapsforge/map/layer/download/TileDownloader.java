package org.mapsforge.map.layer.download;

import com.google.common.net.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.zip.GZIPInputStream;
import org.mapsforge.core.graphics.CorruptedInputStreamException;
import org.mapsforge.core.graphics.GraphicFactory;
import org.mapsforge.core.graphics.TileBitmap;
import org.mapsforge.core.util.IOUtils;

/* loaded from: classes5.dex */
class TileDownloader {
    private final DownloadJob downloadJob;
    private final GraphicFactory graphicFactory;

    private static InputStream getInputStream(URLConnection uRLConnection) throws IOException {
        InputStream inputStream = uRLConnection.getInputStream();
        return "gzip".equals(uRLConnection.getContentEncoding()) ? new GZIPInputStream(inputStream) : inputStream;
    }

    TileDownloader(DownloadJob downloadJob, GraphicFactory graphicFactory) {
        if (downloadJob == null) {
            throw new IllegalArgumentException("downloadJob must not be null");
        }
        if (graphicFactory == null) {
            throw new IllegalArgumentException("graphicFactory must not be null");
        }
        this.downloadJob = downloadJob;
        this.graphicFactory = graphicFactory;
    }

    TileBitmap downloadImage() throws IOException {
        URLConnection openConnection = this.downloadJob.tileSource.getTileUrl(this.downloadJob.tile).openConnection();
        openConnection.setConnectTimeout(this.downloadJob.tileSource.getTimeoutConnect());
        openConnection.setReadTimeout(this.downloadJob.tileSource.getTimeoutRead());
        if (this.downloadJob.tileSource.getUserAgent() != null) {
            openConnection.setRequestProperty(HttpHeaders.USER_AGENT, this.downloadJob.tileSource.getUserAgent());
        }
        if (this.downloadJob.tileSource.getReferer() != null) {
            openConnection.setRequestProperty(HttpHeaders.REFERER, this.downloadJob.tileSource.getReferer());
        }
        if (this.downloadJob.tileSource.getAuthorization() != null) {
            openConnection.setRequestProperty(HttpHeaders.AUTHORIZATION, this.downloadJob.tileSource.getAuthorization());
        }
        if (openConnection instanceof HttpURLConnection) {
            ((HttpURLConnection) openConnection).setInstanceFollowRedirects(this.downloadJob.tileSource.isFollowRedirects());
        }
        InputStream inputStream = getInputStream(openConnection);
        try {
            TileBitmap createTileBitmap = this.graphicFactory.createTileBitmap(inputStream, this.downloadJob.tile.tileSize, this.downloadJob.hasAlpha);
            createTileBitmap.setExpiration(openConnection.getExpiration());
            IOUtils.closeQuietly(inputStream);
            return createTileBitmap;
        } catch (CorruptedInputStreamException unused) {
            IOUtils.closeQuietly(inputStream);
            return null;
        } catch (Throwable th) {
            IOUtils.closeQuietly(inputStream);
            throw th;
        }
    }
}
