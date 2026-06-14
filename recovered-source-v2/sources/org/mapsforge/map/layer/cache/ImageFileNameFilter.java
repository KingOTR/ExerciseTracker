package org.mapsforge.map.layer.cache;

import java.io.File;
import java.io.FilenameFilter;
import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;

/* loaded from: classes5.dex */
final class ImageFileNameFilter implements FilenameFilter {
    static final FilenameFilter INSTANCE = new ImageFileNameFilter();

    private ImageFileNameFilter() {
    }

    @Override // java.io.FilenameFilter
    public boolean accept(File file, String str) {
        return str.endsWith(OpenStreetMapTileProviderConstants.TILE_PATH_EXTENSION);
    }
}
