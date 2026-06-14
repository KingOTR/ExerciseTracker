package org.mapsforge.core.graphics;

/* loaded from: classes5.dex */
public final class GraphicUtils {
    public static int getAlpha(int i) {
        return (i >> 24) & 255;
    }

    public static int filterColor(int i, Filter filter) {
        if (filter == Filter.NONE) {
            return i;
        }
        int i2 = i >>> 24;
        int i3 = (i >> 16) & 255;
        int i4 = (i >> 8) & 255;
        int i5 = i & 255;
        int i6 = AnonymousClass1.$SwitchMap$org$mapsforge$core$graphics$Filter[filter.ordinal()];
        if (i6 == 1) {
            i3 = (int) ((i3 * 0.213f) + (i4 * 0.715f) + (i5 * 0.072f));
        } else {
            if (i6 != 2) {
                if (i6 == 3) {
                    i3 = 255 - i3;
                    i4 = 255 - i4;
                    i5 = 255 - i5;
                }
                return i5 | (i2 << 24) | (i3 << 16) | (i4 << 8);
            }
            i3 = 255 - ((int) (((i3 * 0.213f) + (i4 * 0.715f)) + (i5 * 0.072f)));
        }
        i5 = i3;
        i4 = i5;
        return i5 | (i2 << 24) | (i3 << 16) | (i4 << 8);
    }

    /* renamed from: org.mapsforge.core.graphics.GraphicUtils$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$org$mapsforge$core$graphics$Filter;

        static {
            int[] iArr = new int[Filter.values().length];
            $SwitchMap$org$mapsforge$core$graphics$Filter = iArr;
            try {
                iArr[Filter.GRAYSCALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Filter[Filter.GRAYSCALE_INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$mapsforge$core$graphics$Filter[Filter.INVERT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static float[] imageSize(float f, float f2, float f3, int i, int i2, int i3) {
        float f4 = f * f3;
        float f5 = f3 * f2;
        float f6 = f / f2;
        if (i != 0 && i2 != 0) {
            f4 = i;
            f5 = i2;
        } else if (i == 0 && i2 != 0) {
            f5 = i2;
            f4 = f5 * f6;
        } else if (i != 0 && i2 == 0) {
            f4 = i;
            f5 = f4 / f6;
        }
        if (i3 != 100) {
            float f7 = i3 / 100.0f;
            f4 *= f7;
            f5 *= f7;
        }
        return new float[]{f4, f5};
    }

    private GraphicUtils() {
    }
}
