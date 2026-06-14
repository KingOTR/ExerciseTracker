package org.mapsforge.map.reader;

import com.google.common.base.Ascii;

/* loaded from: classes5.dex */
final class Deserializer {
    static long getFiveBytesLong(byte[] bArr, int i) {
        return (bArr[i + 4] & 255) | ((bArr[i] & 255) << 32) | ((bArr[i + 1] & 255) << 24) | ((bArr[i + 2] & 255) << 16) | ((bArr[i + 3] & 255) << 8);
    }

    static int getInt(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | (bArr[i] << Ascii.CAN) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    static long getLong(byte[] bArr, int i) {
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    static int getShort(byte[] bArr, int i) {
        return (bArr[i + 1] & 255) | (bArr[i] << 8);
    }

    private Deserializer() {
        throw new IllegalStateException();
    }
}
