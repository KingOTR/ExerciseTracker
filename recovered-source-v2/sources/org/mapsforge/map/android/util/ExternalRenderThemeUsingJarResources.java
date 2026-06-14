package org.mapsforge.map.android.util;

import java.io.File;
import java.io.FileNotFoundException;
import org.mapsforge.map.rendertheme.ExternalRenderTheme;

/* loaded from: classes5.dex */
public class ExternalRenderThemeUsingJarResources extends ExternalRenderTheme {
    public ExternalRenderThemeUsingJarResources(File file) throws FileNotFoundException {
        super(file);
    }

    @Override // org.mapsforge.map.rendertheme.ExternalRenderTheme, org.mapsforge.map.rendertheme.XmlRenderTheme
    public String getRelativePathPrefix() {
        return "/assets/";
    }
}
