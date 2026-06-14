package org.mapsforge.map.rendertheme;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.io.IOException;
import java.io.InputStream;
import org.mapsforge.core.util.Utils;

/* loaded from: classes5.dex */
public class ZipRenderTheme implements XmlRenderTheme {
    private XmlRenderThemeMenuCallback menuCallback;
    private final String relativePathPrefix;
    private XmlThemeResourceProvider resourceProvider;
    protected final String xmlTheme;

    public ZipRenderTheme(String str, XmlThemeResourceProvider xmlThemeResourceProvider) {
        this(str, xmlThemeResourceProvider, null);
    }

    public ZipRenderTheme(String str, XmlThemeResourceProvider xmlThemeResourceProvider, XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) {
        this.xmlTheme = str;
        this.resourceProvider = xmlThemeResourceProvider;
        this.menuCallback = xmlRenderThemeMenuCallback;
        this.relativePathPrefix = str.substring(0, str.lastIndexOf(DomExceptionUtils.SEPARATOR) + 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ZipRenderTheme)) {
            return false;
        }
        ZipRenderTheme zipRenderTheme = (ZipRenderTheme) obj;
        try {
            return getRenderThemeAsStream() == zipRenderTheme.getRenderThemeAsStream() && Utils.equals(this.relativePathPrefix, zipRenderTheme.relativePathPrefix);
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
        return this.relativePathPrefix;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public InputStream getRenderThemeAsStream() throws IOException {
        XmlThemeResourceProvider xmlThemeResourceProvider = this.resourceProvider;
        String str = this.relativePathPrefix;
        String str2 = this.xmlTheme;
        return xmlThemeResourceProvider.createInputStream(str, str2.substring(str2.lastIndexOf(DomExceptionUtils.SEPARATOR) + 1));
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
