package org.mapsforge.map.layer.hills;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.logging.Logger;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.mapsforge.core.util.MercatorProjection;
import org.mapsforge.map.layer.hills.HgtCache;

/* loaded from: classes5.dex */
public class DiffuseLightShadingAlgorithm extends AbsShadingAlgorithmDefaults {
    private static final Logger LOGGER = Logger.getLogger(DiffuseLightShadingAlgorithm.class.getName());
    private static final double halfPi = 1.5707963267948966d;
    private double a;
    private final double ast2;
    private final float heightAngle;
    private final double neutral;

    public DiffuseLightShadingAlgorithm() {
        this(50.0f);
    }

    public DiffuseLightShadingAlgorithm(float f) {
        this.heightAngle = f;
        double heightAngleToRelativeHeight = heightAngleToRelativeHeight(f);
        this.a = heightAngleToRelativeHeight;
        this.ast2 = Math.sqrt((heightAngleToRelativeHeight * heightAngleToRelativeHeight) + 2.0d);
        this.neutral = calculateRaw(0.0d, 0.0d);
    }

    static double heightAngleToRelativeHeight(float f) {
        return Math.tan((f / 180.0d) * 3.141592653589793d) * Math.sqrt(2.0d);
    }

    private static short readNext(ByteBuffer byteBuffer, short s) throws IOException {
        short s2 = byteBuffer.getShort();
        return s2 == Short.MIN_VALUE ? s : s2;
    }

    public double getLightHeight() {
        return this.a;
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
        ByteBuffer byteBuffer2 = byteBuffer;
        int i4 = i;
        int i5 = i2;
        short[] sArr = new short[i5];
        int i6 = i3 * 2;
        int i7 = i4 + i6;
        byte[] bArr = new byte[i7 * i7];
        int i8 = (i7 * i3) + i3;
        int i9 = 0;
        short s = 0;
        int i10 = 0;
        while (i9 < i5) {
            s = readNext(byteBuffer2, s);
            sArr[i10] = s;
            i9++;
            i10++;
        }
        long j = i4 * 170;
        double d = i4 * 2;
        double calculateGroundResolution = MercatorProjection.calculateGroundResolution(hgtFileInfo.southLat(), j) / d;
        double calculateGroundResolution2 = MercatorProjection.calculateGroundResolution(hgtFileInfo.northLat(), j) / d;
        int i11 = 1;
        while (i11 <= i4) {
            if (i10 >= i5) {
                i10 = 0;
            }
            short s2 = sArr[i10];
            short readNext = readNext(byteBuffer2, s2);
            int i12 = i10 + 1;
            sArr[i10] = readNext;
            int i13 = i6;
            double d2 = calculateGroundResolution;
            double d3 = (i11 * calculateGroundResolution) + ((i4 - i11) * calculateGroundResolution2);
            int i14 = i8;
            int i15 = 1;
            while (i15 <= i4) {
                short s3 = sArr[i12];
                short readNext2 = readNext(byteBuffer2, s3);
                sArr[i12] = readNext2;
                bArr[i14] = (byte) (Math.min(255, Math.max(0, calculate((-((readNext2 - s3) + (readNext - s2))) / d3, (-((s3 - s2) + (readNext2 - readNext))) / d3) + 127)) & 255);
                i15++;
                byteBuffer2 = byteBuffer;
                i4 = i;
                i14++;
                s2 = s3;
                sArr = sArr;
                i12++;
                readNext = readNext2;
            }
            i8 = i14 + i13;
            i11++;
            byteBuffer2 = byteBuffer;
            i4 = i;
            i5 = i2;
            i6 = i13;
            i10 = i12;
            calculateGroundResolution = d2;
        }
        return bArr;
    }

    int calculate(double d, double d2) {
        long round;
        double calculateRaw = calculateRaw(d, d2);
        double d3 = this.neutral;
        double d4 = calculateRaw - d3;
        if (d4 < 0.0d) {
            round = Math.round((d4 / d3) * 128.0d);
        } else {
            if (d4 <= 0.0d) {
                return 0;
            }
            round = Math.round((d4 / (1.0d - d3)) * 127.0d);
        }
        return (int) round;
    }

    double calculateRaw(double d, double d2) {
        return Math.max(0.0d, ((d2 + d) + this.a) / (this.ast2 * Math.sqrt(((d * d) + (d2 * d2)) + 1.0d)));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && Double.compare(((DiffuseLightShadingAlgorithm) obj).a, this.a) == 0;
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.a);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public String toString() {
        return "DiffuseLightShadingAlgorithm{heightAngle=" + this.heightAngle + AbstractJsonLexerKt.END_OBJ;
    }
}
