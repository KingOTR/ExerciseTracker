package org.mapsforge.core.util;

import java.util.List;

/* loaded from: classes5.dex */
public final class Utils {
    public static boolean equals(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private Utils() {
        throw new IllegalStateException();
    }

    public static int hashTagParameter(String str) {
        return str.hashCode();
    }

    public static int[] convertListString(List<String> list) {
        int[] iArr = new int[list.size()];
        int size = list.size();
        for (int i = 0; i < size; i++) {
            iArr[i] = hashTagParameter(list.get(i));
        }
        return iArr;
    }

    public static boolean contains(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
