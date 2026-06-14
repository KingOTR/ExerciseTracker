package org.mapsforge.map.android.rendertheme;

import android.content.res.AssetManager;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import org.mapsforge.core.util.Utils;
import org.mapsforge.map.rendertheme.XmlRenderTheme;
import org.mapsforge.map.rendertheme.XmlRenderThemeMenuCallback;
import org.mapsforge.map.rendertheme.XmlThemeResourceProvider;

/* loaded from: classes5.dex */
public class AssetsRenderTheme implements XmlRenderTheme {
    private final AssetManager assetManager;
    private final String fileName;
    private XmlRenderThemeMenuCallback menuCallback;
    private final String relativePathPrefix;
    private XmlThemeResourceProvider resourceProvider;

    public AssetsRenderTheme(AssetManager assetManager, String str, String str2) {
        this(assetManager, str, str2, null);
    }

    public AssetsRenderTheme(AssetManager assetManager, String str, String str2, XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) {
        this.assetManager = assetManager;
        this.relativePathPrefix = str;
        this.fileName = str2;
        this.menuCallback = xmlRenderThemeMenuCallback;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AssetsRenderTheme)) {
            return false;
        }
        AssetsRenderTheme assetsRenderTheme = (AssetsRenderTheme) obj;
        try {
            return getRenderThemeAsStream() == assetsRenderTheme.getRenderThemeAsStream() && Utils.equals(this.relativePathPrefix, assetsRenderTheme.relativePathPrefix);
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
        return this.assetManager.open((TextUtils.isEmpty(this.relativePathPrefix) ? "" : this.relativePathPrefix) + this.fileName);
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
