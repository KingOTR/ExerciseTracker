package org.mapsforge.map.reader;

import com.google.common.primitives.SignedBytes;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.Utf8;
import org.mapsforge.core.model.Tag;
import org.mapsforge.core.util.Parameters;

/* loaded from: classes5.dex */
public class ReadBuffer {
    private static final String CHARSET_UTF8 = "UTF-8";
    private static final Logger LOGGER = Logger.getLogger(ReadBuffer.class.getName());
    private byte[] bufferData;
    private int bufferPosition;
    private ByteBuffer bufferWrapper;
    private final FileChannel inputChannel;
    private final List<Integer> tagIds = new ArrayList();

    ReadBuffer(FileChannel fileChannel) {
        this.inputChannel = fileChannel;
    }

    public byte readByte() {
        byte[] bArr = this.bufferData;
        int i = this.bufferPosition;
        this.bufferPosition = i + 1;
        return bArr[i];
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public boolean readFromFile(int i) throws IOException {
        byte[] bArr = this.bufferData;
        if (bArr == null || bArr.length < i) {
            if (i > Parameters.MAXIMUM_BUFFER_SIZE) {
                LOGGER.warning("invalid read length: " + i);
                return false;
            }
            try {
                byte[] bArr2 = new byte[i];
                this.bufferData = bArr2;
                this.bufferWrapper = ByteBuffer.wrap(bArr2, 0, i);
            } catch (Throwable th) {
                LOGGER.log(Level.SEVERE, th.getMessage(), th);
                return false;
            }
        }
        this.bufferPosition = 0;
        this.bufferWrapper.clear();
        return this.inputChannel.read(this.bufferWrapper) == i;
    }

    public boolean readFromFile(long j, int i) throws IOException {
        boolean z;
        byte[] bArr = this.bufferData;
        if (bArr == null || bArr.length < i) {
            if (i > Parameters.MAXIMUM_BUFFER_SIZE) {
                LOGGER.warning("invalid read length: " + i);
                return false;
            }
            try {
                byte[] bArr2 = new byte[i];
                this.bufferData = bArr2;
                this.bufferWrapper = ByteBuffer.wrap(bArr2, 0, i);
            } catch (Throwable th) {
                LOGGER.log(Level.SEVERE, th.getMessage(), th);
                return false;
            }
        }
        this.bufferPosition = 0;
        this.bufferWrapper.clear();
        synchronized (this.inputChannel) {
            this.inputChannel.position(j);
            z = this.inputChannel.read(this.bufferWrapper) == i;
        }
        return z;
    }

    public int readInt() {
        int i = this.bufferPosition;
        this.bufferPosition = i + 4;
        return Deserializer.getInt(this.bufferData, i);
    }

    public long readLong() {
        int i = this.bufferPosition;
        this.bufferPosition = i + 8;
        return Deserializer.getLong(this.bufferData, i);
    }

    public int readShort() {
        int i = this.bufferPosition;
        this.bufferPosition = i + 2;
        return Deserializer.getShort(this.bufferData, i);
    }

    public int readSignedInt() {
        int i;
        byte b;
        int i2 = 0;
        byte b2 = 0;
        while (true) {
            byte[] bArr = this.bufferData;
            i = this.bufferPosition;
            b = bArr[i];
            if ((b & 128) == 0) {
                break;
            }
            this.bufferPosition = i + 1;
            i2 |= (b & Byte.MAX_VALUE) << b2;
            b2 = (byte) (b2 + 7);
        }
        if ((b & SignedBytes.MAX_POWER_OF_TWO) != 0) {
            this.bufferPosition = i + 1;
            return -(((b & Utf8.REPLACEMENT_BYTE) << b2) | i2);
        }
        this.bufferPosition = i + 1;
        return ((b & Utf8.REPLACEMENT_BYTE) << b2) | i2;
    }

    List<Tag> readTags(Tag[] tagArr, byte b) {
        this.tagIds.clear();
        int length = tagArr.length;
        while (b != 0) {
            int readUnsignedInt = readUnsignedInt();
            if (readUnsignedInt < 0 || readUnsignedInt >= length) {
                LOGGER.warning("invalid tag ID: " + readUnsignedInt);
                return null;
            }
            this.tagIds.add(Integer.valueOf(readUnsignedInt));
            b = (byte) (b - 1);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Integer> it = this.tagIds.iterator();
        while (it.hasNext()) {
            Tag tag = tagArr[it.next().intValue()];
            if (tag.value.length() == 2 && tag.value.charAt(0) == '%') {
                String str = tag.value;
                if (str.charAt(1) == 'b') {
                    str = String.valueOf((int) readByte());
                } else if (str.charAt(1) == 'i') {
                    if (tag.key.contains(":colour")) {
                        str = "#" + Integer.toHexString(readInt());
                    } else {
                        str = String.valueOf(readInt());
                    }
                } else if (str.charAt(1) == 'f') {
                    str = String.valueOf(readFloat());
                } else if (str.charAt(1) == 'h') {
                    str = String.valueOf(readShort());
                } else if (str.charAt(1) == 's') {
                    str = readUTF8EncodedString();
                }
                tag = new Tag(tag.key, str);
            }
            arrayList.add(tag);
        }
        return arrayList;
    }

    public int readUnsignedInt() {
        int i = 0;
        byte b = 0;
        while (true) {
            byte[] bArr = this.bufferData;
            int i2 = this.bufferPosition;
            byte b2 = bArr[i2];
            if ((b2 & 128) != 0) {
                this.bufferPosition = i2 + 1;
                i |= (b2 & Byte.MAX_VALUE) << b;
                b = (byte) (b + 7);
            } else {
                this.bufferPosition = i2 + 1;
                return (b2 << b) | i;
            }
        }
    }

    public String readUTF8EncodedString() {
        return readUTF8EncodedString(readUnsignedInt());
    }

    public String readUTF8EncodedString(int i) {
        if (i > 0) {
            int i2 = this.bufferPosition;
            if (i2 + i <= this.bufferData.length) {
                this.bufferPosition = i2 + i;
                try {
                    return new String(this.bufferData, this.bufferPosition - i, i, CHARSET_UTF8);
                } catch (UnsupportedEncodingException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
        LOGGER.warning("invalid string length: " + i);
        return null;
    }

    int getBufferPosition() {
        return this.bufferPosition;
    }

    int getBufferSize() {
        return this.bufferData.length;
    }

    void setBufferPosition(int i) {
        this.bufferPosition = i;
    }

    void skipBytes(int i) {
        this.bufferPosition += i;
    }
}
