package org.mapsforge.core.util;

/* loaded from: classes5.dex */
public final class Parameters {
    public static boolean ANTI_ALIASING = true;
    public static boolean LAYER_SCROLL_EVENT = false;
    public static int MAXIMUM_BUFFER_SIZE = 10000000;
    public static int NUMBER_OF_THREADS = 1;
    public static ParentTilesRendering PARENT_TILES_RENDERING = ParentTilesRendering.QUALITY;
    public static boolean SQUARE_FRAME_BUFFER = true;
    public static SymbolScaling SYMBOL_SCALING = SymbolScaling.POI;
    public static boolean VALIDATE_COORDINATES = true;

    public enum ParentTilesRendering {
        QUALITY,
        SPEED,
        OFF
    }

    public enum SymbolScaling {
        ALL,
        POI
    }

    private Parameters() {
        throw new IllegalStateException();
    }
}
