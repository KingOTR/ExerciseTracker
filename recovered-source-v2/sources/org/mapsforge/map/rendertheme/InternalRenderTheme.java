package org.mapsforge.map.rendertheme;

import java.io.InputStream;

/* loaded from: classes5.dex */
public enum InternalRenderTheme implements XmlRenderTheme {
    DEFAULT("/assets/mapsforge/default.xml"),
    OSMARENDER("/assets/mapsforge/osmarender.xml");

    private XmlRenderThemeMenuCallback menuCallback;
    private final String path;

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlThemeResourceProvider getResourceProvider() {
        return null;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public void setResourceProvider(XmlThemeResourceProvider xmlThemeResourceProvider) {
    }

    InternalRenderTheme(String str) {
        this.path = str;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlRenderThemeMenuCallback getMenuCallback() {
        return this.menuCallback;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public String getRelativePathPrefix() {
        return "/assets/";
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public InputStream getRenderThemeAsStream() {
        return getClass().getResourceAsStream(this.path);
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public void setMenuCallback(XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) {
        this.menuCallback = xmlRenderThemeMenuCallback;
    }
}
