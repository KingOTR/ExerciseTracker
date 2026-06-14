package org.mapsforge.map.layer.hills;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public interface DemFile {
    ByteBuffer asByteBuffer() throws IOException;

    String getName();

    long getSize();

    InputStream openInputStream() throws FileNotFoundException;
}
