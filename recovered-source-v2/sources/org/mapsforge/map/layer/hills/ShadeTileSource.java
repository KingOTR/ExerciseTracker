package org.mapsforge.map.layer.hills;

import java.util.concurrent.ExecutionException;
import org.mapsforge.core.graphics.HillshadingBitmap;

/* loaded from: classes5.dex */
public interface ShadeTileSource {
    void applyConfiguration(boolean z);

    HillshadingBitmap getHillshadingBitmap(int i, int i2, double d, double d2) throws ExecutionException, InterruptedException;

    void prepareOnThread();

    void setShadingAlgorithm(ShadingAlgorithm shadingAlgorithm);
}
