package org.mapsforge.map.rendertheme;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes5.dex */
public class ExternalRenderTheme implements XmlRenderTheme {
    private final long lastModifiedTime;
    private XmlRenderThemeMenuCallback menuCallback;
    private final File renderThemeFile;
    private XmlThemeResourceProvider resourceProvider;

    public ExternalRenderTheme(File file) throws FileNotFoundException {
        this(file, (XmlRenderThemeMenuCallback) null);
    }

    public ExternalRenderTheme(File file, XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) throws FileNotFoundException {
        if (!file.exists()) {
            throw new FileNotFoundException("file does not exist: " + file.getAbsolutePath());
        }
        if (!file.isFile()) {
            throw new FileNotFoundException("not a file: " + file.getAbsolutePath());
        }
        if (!file.canRead()) {
            throw new FileNotFoundException("cannot read file: " + file.getAbsolutePath());
        }
        long lastModified = file.lastModified();
        this.lastModifiedTime = lastModified;
        if (lastModified == 0) {
            throw new FileNotFoundException("cannot read last modified time: " + file.getAbsolutePath());
        }
        this.renderThemeFile = file;
        this.menuCallback = xmlRenderThemeMenuCallback;
    }

    public ExternalRenderTheme(String str) throws FileNotFoundException {
        this(str, (XmlRenderThemeMenuCallback) null);
    }

    public ExternalRenderTheme(String str, XmlRenderThemeMenuCallback xmlRenderThemeMenuCallback) throws FileNotFoundException {
        this(new File(str), xmlRenderThemeMenuCallback);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExternalRenderTheme)) {
            return false;
        }
        ExternalRenderTheme externalRenderTheme = (ExternalRenderTheme) obj;
        if (this.lastModifiedTime != externalRenderTheme.lastModifiedTime) {
            return false;
        }
        File file = this.renderThemeFile;
        if (file == null) {
            if (externalRenderTheme.renderThemeFile != null) {
                return false;
            }
        } else if (!file.equals(externalRenderTheme.renderThemeFile)) {
            return false;
        }
        return true;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlRenderThemeMenuCallback getMenuCallback() {
        return this.menuCallback;
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public String getRelativePathPrefix() {
        return this.renderThemeFile.getParent();
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public InputStream getRenderThemeAsStream() throws IOException {
        return new FileInputStream(this.renderThemeFile);
    }

    @Override // org.mapsforge.map.rendertheme.XmlRenderTheme
    public XmlThemeResourceProvider getResourceProvider() {
        return this.resourceProvider;
    }

    public int hashCode() {
        long j = this.lastModifiedTime;
        int i = (((int) (j ^ (j >>> 32))) + 31) * 31;
        File file = this.renderThemeFile;
        return i + (file == null ? 0 : file.hashCode());
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
