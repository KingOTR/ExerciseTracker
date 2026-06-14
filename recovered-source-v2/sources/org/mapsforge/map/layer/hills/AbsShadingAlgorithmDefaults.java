package org.mapsforge.map.layer.hills;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mapsforge.map.layer.hills.HgtCache;
import org.mapsforge.map.layer.hills.ShadingAlgorithm;

/* loaded from: classes5.dex */
public abstract class AbsShadingAlgorithmDefaults implements ShadingAlgorithm {
    private static final Logger LOGGER = Logger.getLogger(AbsShadingAlgorithmDefaults.class.getName());

    protected abstract byte[] convert(ByteBuffer byteBuffer, int i, int i2, int i3, HgtCache.HgtFileInfo hgtFileInfo) throws IOException;

    @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm
    public ShadingAlgorithm.RawShadingResult transformToByteBuffer(HgtCache.HgtFileInfo hgtFileInfo, int i) {
        int axisLenght = getAxisLenght(hgtFileInfo);
        try {
            return new ShadingAlgorithm.RawShadingResult(convert(hgtFileInfo.getFile().asByteBuffer(), axisLenght, axisLenght + 1, i, hgtFileInfo), axisLenght, axisLenght, i);
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, e.getMessage(), (Throwable) e);
            return null;
        }
    }
}
