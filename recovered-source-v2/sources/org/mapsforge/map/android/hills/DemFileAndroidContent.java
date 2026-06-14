package org.mapsforge.map.android.hills;

import android.content.ContentResolver;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.mapsforge.core.util.IOUtils;
import org.mapsforge.map.android.hills.DemFolderAndroidContent;
import org.mapsforge.map.layer.hills.DemFile;
import org.mapsforge.map.layer.hills.DemFileFS;

/* loaded from: classes5.dex */
public class DemFileAndroidContent implements DemFile {
    private final ContentResolver contentResolver;
    private final DemFolderAndroidContent.Entry entry;

    public DemFileAndroidContent(DemFolderAndroidContent.Entry entry, ContentResolver contentResolver) {
        this.entry = entry;
        this.contentResolver = contentResolver;
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public String getName() {
        return this.entry.name;
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public InputStream openInputStream() throws FileNotFoundException {
        return this.contentResolver.openInputStream(this.entry.uri);
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public long getSize() {
        return this.entry.size;
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public ByteBuffer asByteBuffer() throws IOException {
        try {
            String lowerCase = this.entry.name.toLowerCase();
            InputStream openInputStream = this.contentResolver.openInputStream(this.entry.uri);
            if (lowerCase.endsWith(".zip")) {
                ByteBuffer tryZippedSingleHgt = DemFileFS.tryZippedSingleHgt(this.entry.name, openInputStream);
                IOUtils.closeQuietly(openInputStream);
                return tryZippedSingleHgt;
            }
            ByteBuffer streamAsByteBuffer = DemFileFS.streamAsByteBuffer(this.entry.name, openInputStream, (int) this.entry.size);
            IOUtils.closeQuietly(openInputStream);
            return streamAsByteBuffer;
        } catch (Throwable th) {
            IOUtils.closeQuietly(null);
            throw th;
        }
    }
}
