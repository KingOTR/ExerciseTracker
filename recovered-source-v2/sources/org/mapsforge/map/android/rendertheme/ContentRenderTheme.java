package org.mapsforge.map.android.rendertheme;

import android.content.ContentResolver;
import android.net.Uri;
import java.io.IOException;
import java.io.InputStream;
import org.mapsforge.map.rendertheme.XmlRenderTheme;
import org.mapsforge.map.rendertheme.XmlRenderThemeMenuCallback;
import org.mapsforge.map.rendertheme.XmlThemeResourceProvider;

/* loaded from: classes5.dex */
public class ContentRenderTheme implements XmlRenderTheme {
    private final ContentResolver contentResolver;
    private XmlRenderThemeMenuCallback menuCallback;
    private XmlThemeResourceProvider resourceProvider;
    private final Uri uri;

    public ContentRenderTheme(ContentResolver contentResolver, Uri uri) {
        this(contentResolver, uri, null);
    }

    public ContentRenderTheme(ContentResolver contentResolver, Uri uri, XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) {
        this.contentResolver = contentResolver;
        this.uri = uri;
        this.menuCallback = xmlRenderThemeMenuCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ContentRenderTheme)) {
            return false;
        }
        try {
            return getRenderThemeAsStream() == ((ContentRenderTheme) obj).getRenderThemeAsStream();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlRenderThemeMenuCallback getMenuCallback() {
        return this.menuCallback;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public String getRelativePathPrefix() {
        return "";
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public InputStream getRenderThemeAsStream() throws IOException {
        return this.contentResolver.openInputStream(this.uri);
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlThemeResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    public int hashCode() {
        InputStream inputStream;
        try {
            inputStream = getRenderThemeAsStream();
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        return 31 + (inputStream == null ? 0 : inputStream.hashCode());
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public void setMenuCallback(XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) {
        this.menuCallback = xmlRenderThemeMenuCallback;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public void setResourceProvider(XmlThemeResourceProvider xmlThemeResourceProvider) {
        this.resourceProvider = xmlThemeResourceProvider;
    }
}
