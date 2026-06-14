package org.mapsforge.map.layer.hills;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mapsforge.map.layer.hills.HgtCache;

/* loaded from: classes5.dex */
public class SimpleShadingAlgorithm extends AbsShadingAlgorithmDefaults {
    private static final Logger LOGGER = Logger.getLogger(SimpleShadingAlgorithm.class.getName());
    public final double linearity;
    private byte[] lookup;
    private int lookupOffset;
    public final double scale;

    public SimpleShadingAlgorithm() {
        this(0.1d, 0.666d);
    }

    public SimpleShadingAlgorithm(double d, double d2) {
        this.linearity = Math.min(1.0d, Math.max(0.0d, d));
        this.scale = Math.max(0.0d, d2);
    }

    private static short readNext(ByteBuffer byteBuffer, short s) throws IOException {
        short s2 = byteBuffer.getShort();
        return s2 == Short.MIN_VALUE ? s : s2;
    }

    protected double exaggerate(double d) {
        double max = Math.max(-128.0d, Math.min(127.0d, d * this.scale));
        double sin = Math.sin(Math.sin(Math.sin((max * 1.5707963267948966d) / 128.0d) * 1.5707963267948966d) * 1.5707963267948966d) * 128.0d;
        double d2 = this.linearity;
        return (sin * (1.0d - d2)) + (max * d2);
    }

    @Override // org.mapsforge.map.layer.hills.ShadingAlgorithm
    public int getAxisLenght(HgtCache.HgtFileInfo hgtFileInfo) {
        long size = hgtFileInfo.getSize();
        int ceil = (int) Math.ceil(Math.sqrt(size / 2));
        if (ceil * ceil * 2 != size) {
            return 0;
        }
        return ceil - 1;
    }

    @Override // org.mapsforge.map.layer.hills.AbsShadingAlgorithmDefaults
    protected byte[] convert(ByteBuffer byteBuffer, int i, int i2, int i3, HgtCache.HgtFileInfo hgtFileInfo) throws IOException {
        short[] sArr = new short[i2];
        int i4 = i3 * 2;
        int i5 = i + i4;
        byte[] bArr = new byte[i5 * i5];
        byte[] bArr2 = this.lookup;
        if (bArr2 == null) {
            fillLookup();
            bArr2 = this.lookup;
        }
        int i6 = (i5 * i3) + i3;
        int i7 = 0;
        short s = 0;
        int i8 = 0;
        while (i7 < i2) {
            s = readNext(byteBuffer, s);
            sArr[i8] = s;
            i7++;
            i8++;
        }
        for (int i9 = 1; i9 <= i; i9++) {
            if (i8 >= i2) {
                i8 = 0;
            }
            short s2 = sArr[i8];
            short readNext = readNext(byteBuffer, s2);
            sArr[i8] = readNext;
            i8++;
            int i10 = 1;
            while (i10 <= i) {
                short s3 = sArr[i8];
                short readNext2 = readNext(byteBuffer, s3);
                sArr[i8] = readNext2;
                bArr[i6] = (byte) (Math.min(255, Math.max(0, exaggerate(bArr2, -((readNext2 - s3) + (readNext - s2))) + exaggerate(bArr2, -((s3 - s2) + (readNext2 - readNext))) + 127)) & 255);
                i10++;
                i6++;
                readNext = readNext2;
                i8++;
                s2 = s3;
            }
            i6 += i4;
        }
        return bArr;
    }

    private byte exaggerate(byte[] bArr, int i) {
        return bArr[Math.max(0, Math.min(bArr.length - 1, i + this.lookupOffset))];
    }

    private void fillLookup() {
        int i = 0;
        while (i > -1024) {
            double round = Math.round(exaggerate(i));
            if (round <= -128.0d || round >= 127.0d) {
                break;
            } else {
                i--;
            }
        }
        int i2 = 0;
        while (i2 < 1024) {
            double round2 = Math.round(exaggerate(i2));
            if (round2 <= -128.0d || round2 >= 127.0d) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = (i2 + 1) - i;
        byte[] bArr = new byte[i3];
        int i4 = i;
        for (int i5 = 0; i5 < i3; i5++) {
            bArr[i5] = (byte) Math.round(exaggerate(i4));
            i4++;
        }
        this.lookup = bArr;
        this.lookupOffset = -i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SimpleShadingAlgorithm simpleShadingAlgorithm = (SimpleShadingAlgorithm) obj;
        return Double.compare(simpleShadingAlgorithm.linearity, this.linearity) == 0 && Double.compare(simpleShadingAlgorithm.scale, this.scale) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.linearity);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.scale);
        return (i * 31) + ((int) ((doubleToLongBits2 >>> 32) ^ doubleToLongBits2));
    }

    public String toString() {
        return "SimpleShadingAlgorithm{linearity=" + this.linearity + ", scale=" + this.scale + AbstractJsonLexerKt.END_OBJ;
    }
}
