package org.mapsforge.map.rendertheme;

import java.io.InputStream;
import org.mapsforge.core.util.Utils;

/* loaded from: classes5.dex */
public class StreamRenderTheme implements XmlRenderTheme {
    private final InputStream inputStream;
    private XmlRenderThemeMenuCallback menuCallback;
    private final String relativePathPrefix;
    private XmlThemeResourceProvider resourceProvider;

    public StreamRenderTheme(String str, InputStream inputStream) {
        this(str, inputStream, null);
    }

    public StreamRenderTheme(String str, InputStream inputStream, XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) {
        this.relativePathPrefix = str;
        this.inputStream = inputStream;
        this.menuCallback = xmlRenderThemeMenuCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamRenderTheme)) {
            return false;
        }
        StreamRenderTheme streamRenderTheme = (StreamRenderTheme) obj;
        return this.inputStream == streamRenderTheme.inputStream && Utils.equals(this.relativePathPrefix, streamRenderTheme.relativePathPrefix);
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlRenderThemeMenuCallback getMenuCallback() {
        return this.menuCallback;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public String getRelativePathPrefix() {
        return this.relativePathPrefix;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public InputStream getRenderThemeAsStream() {
        return this.inputStream;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlThemeResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    public int hashCode() {
        InputStream inputStream = this.inputStream;
        int hashCode = ((inputStream == null ? 0 : inputStream.hashCode()) + 31) * 31;
        String str = this.relativePathPrefix;
        return hashCode + (str != null ? str.hashCode() : 0);
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
