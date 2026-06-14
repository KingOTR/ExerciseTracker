package org.mapsforge.map.layer.hills;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import org.mapsforge.core.util.IOUtils;

/* loaded from: classes5.dex */
public class DemFileFS implements DemFile {
    private static final Logger LOGGER = Logger.getLogger(AbsShadingAlgorithmDefaults.class.getName());
    private final File file;

    public DemFileFS(File file) {
        this.file = file;
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public String getName() {
        return this.file.getName();
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public InputStream openInputStream() throws FileNotFoundException {
        return new BufferedInputStream(new FileInputStream(this.file));
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public long getSize() {
        return this.file.length();
    }

    public static ByteBuffer tryZippedSingleHgt(String str, InputStream inputStream) throws IOException {
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        ZipInputStream zipInputStream2 = null;
        try {
            zipInputStream = new ZipInputStream(inputStream);
        } catch (Throwable th) {
            th = th;
        }
        try {
            String str2 = str.toLowerCase().substring(0, r6.length() - 4) + ".hgt";
            do {
                nextEntry = zipInputStream.getNextEntry();
                if (nextEntry == null) {
                    IOUtils.closeQuietly(zipInputStream);
                    return null;
                }
            } while (!str2.equals(nextEntry.getName().toLowerCase()));
            ByteBuffer streamAsByteBuffer = streamAsByteBuffer(str, zipInputStream, (int) nextEntry.getSize());
            IOUtils.closeQuietly(zipInputStream);
            return streamAsByteBuffer;
        } catch (Throwable th2) {
            th = th2;
            zipInputStream2 = zipInputStream;
            IOUtils.closeQuietly(zipInputStream2);
            throw th;
        }
    }

    public static ByteBuffer streamAsByteBuffer(String str, InputStream inputStream, int i) throws IOException {
        ByteBuffer allocate = ByteBuffer.allocate(i);
        int i2 = 0;
        while (i > 0) {
            int read = inputStream.read(allocate.array(), i2, i);
            if (read == 0) {
                LOGGER.log(Level.SEVERE, "failed to read entire .hgt in " + str + " " + i2 + " of " + i + " done");
                return null;
            }
            i2 += read;
            i -= read;
        }
        allocate.order(ByteOrder.BIG_ENDIAN);
        return allocate;
    }

    @Override // org.mapsforge.map.layer.hills.DemFile
    public ByteBuffer asByteBuffer() throws IOException {
        FileInputStream fileInputStream;
        FileChannel fileChannel = null;
        try {
            if (this.file.getName().toLowerCase().endsWith(".zip")) {
                ByteBuffer tryZippedSingleHgt = tryZippedSingleHgt(this.file.getName(), new FileInputStream(this.file));
                IOUtils.closeQuietly(null);
                IOUtils.closeQuietly(null);
                return tryZippedSingleHgt;
            }
            fileInputStream = new FileInputStream(this.file);
            fileChannel = fileInputStream.getChannel();
            try {
                MappedByteBuffer map = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, this.file.length());
                map.order(ByteOrder.BIG_ENDIAN);
                IOUtils.closeQuietly(fileChannel);
                IOUtils.closeQuietly(fileInputStream);
                return map;
            } catch (Throwable th) {
                th = th;
                IOUtils.closeQuietly(fileChannel);
                IOUtils.closeQuietly(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
    }
}
