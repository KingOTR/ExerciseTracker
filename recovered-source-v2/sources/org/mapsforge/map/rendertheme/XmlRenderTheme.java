package org.mapsforge.map.rendertheme;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public interface XmlRenderTheme {
    XmlRenderThemeMenuCallback getMenuCallback();

    String getRelativePathPrefix();

    InputStream getRenderThemeAsStream() throws IOException;

    XmlThemeResourceProvider getResourceProvider();

    void setMenuCallback(XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback);

    void setResourceProvider(XmlThemeResourceProvider xmlThemeResourceProvider);
}
