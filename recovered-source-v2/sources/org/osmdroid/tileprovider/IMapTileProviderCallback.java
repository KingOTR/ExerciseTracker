package org.osmdroid.tileprovider;

import android.graphics.drawable.Drawable;

/* loaded from: classes5.dex */
public interface IMapTileProviderCallback {
    void mapTileRequestCompleted(MapTileRequestState mapTileRequestState, Drawable drawable);

    void mapTileRequestExpiredTile(MapTileRequestState mapTileRequestState, Drawable drawable);

    void mapTileRequestFailed(MapTileRequestState mapTileRequestState);

    void mapTileRequestFailedExceedsMaxQueueSize(MapTileRequestState mapTileRequestState);

    boolean useDataConnection();
}
