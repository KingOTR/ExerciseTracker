package org.mapsforge.map.layer.hills;

import org.mapsforge.core.graphics.HillshadingBitmap;
import org.mapsforge.map.layer.hills.HgtCache;

/* loaded from: classes5.dex */
public interface ShadingAlgorithm {

    public interface RawHillTileSource {
        double eastLng();

        DemFile getFile();

        HillshadingBitmap getFinishedConverted();

        long getSize();

        double northLat();

        double southLat();

        double westLng();
    }

    int getAxisLenght(HgtCache.HgtFileInfo hgtFileInfo);

    RawShadingResult transformToByteBuffer(HgtCache.HgtFileInfo hgtFileInfo, int i);

    public static class RawShadingResult {
        public final byte[] bytes;
        public final int height;
        public final int padding;
        public final int width;

        public RawShadingResult(byte[] bArr, int i, int i2, int i3) {
            this.bytes = bArr;
            this.width = i;
            this.height = i2;
            this.padding = i3;
        }

        void fillPadding(HillshadingBitmap.Border border) {
            int i;
            int i2;
            int i3;
            int i4;
            int i5;
            int i6;
            int i7;
            int i8;
            int i9 = (this.padding * 2) + this.width;
            if (border.vertical) {
                i = this.padding;
                i3 = this.width + i;
                i2 = this.height;
                if (border == HillshadingBitmap.Border.WEST) {
                    int i10 = this.padding;
                    i6 = i10 * i9;
                    i7 = i10 + i6;
                } else {
                    int i11 = this.padding;
                    i6 = (i11 * i9) + i11 + this.width;
                    i7 = i6 - 1;
                }
                i8 = 0;
            } else {
                i = this.width;
                i2 = this.padding;
                i3 = i2 * 2;
                if (border == HillshadingBitmap.Border.NORTH) {
                    i4 = this.padding;
                    i5 = (i9 * i4) + i4;
                } else {
                    int i12 = this.height;
                    int i13 = this.padding;
                    i4 = ((i12 + i13) * i9) + i13;
                    i5 = i4 - i9;
                }
                i6 = i4;
                i7 = i5;
                i9 = -this.width;
                i8 = 1;
            }
            for (int i14 = 0; i14 < i2; i14++) {
                for (int i15 = 0; i15 < i; i15++) {
                    byte[] bArr = this.bytes;
                    bArr[i6] = bArr[i7];
                    i6++;
                    i7 += i8;
                }
                i6 += i3;
                i7 += i9;
            }
        }

        public void fillPadding() {
            if (this.padding < 1) {
                return;
            }
            fillPadding(HillshadingBitmap.Border.EAST);
            fillPadding(HillshadingBitmap.Border.WEST);
            fillPadding(HillshadingBitmap.Border.NORTH);
            fillPadding(HillshadingBitmap.Border.SOUTH);
            int i = this.padding;
            int i2 = this.width;
            int i3 = (i * 2) + i2;
            int i4 = i2 + i;
            int i5 = this.height + i;
            byte[] bArr = this.bytes;
            byte b = bArr[(i3 * i) + i];
            byte b2 = bArr[((i3 * i) + i4) - 1];
            int i6 = (i5 - 1) * i3;
            byte b3 = bArr[i + i6];
            byte b4 = bArr[i6 + (i4 - 1)];
            int i7 = i5 * i3;
            int i8 = i7 + i4;
            for (int i9 = 0; i9 < this.padding; i9++) {
                int i10 = i3 * i9;
                for (int i11 = 0; i11 < this.padding; i11++) {
                    byte[] bArr2 = this.bytes;
                    int i12 = i11 + i10;
                    bArr2[i12] = b;
                    bArr2[i12 + i4] = b2;
                    bArr2[i12 + i7] = b3;
                    bArr2[i12 + i8] = b4;
                }
            }
        }
    }
}
