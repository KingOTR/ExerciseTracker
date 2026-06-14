package org.mapsforge.core.model;

import java.io.Serializable;
import org.mapsforge.core.util.Utils;

/* loaded from: classes5.dex */
public class Tag implements Comparable<Tag>, Serializable {
    public static final char KEY_VALUE_SEPARATOR = '=';
    private static final long serialVersionUID = 1;
    public final String key;
    public final int keyCode;
    public final String value;
    public final int valueCode;

    public Tag(String str) {
        this(str, str.indexOf(61));
    }

    public Tag(String str, String str2) {
        this.key = str;
        this.keyCode = str == null ? 0 : Utils.hashTagParameter(str);
        this.value = str2;
        this.valueCode = str2 != null ? Utils.hashTagParameter(str2) : 0;
    }

    private Tag(String str, int i) {
        this(str.substring(0, i), str.substring(i + 1));
    }

    @Override // java.lang.Comparable
    public int compareTo(Tag tag) {
        int compareTo = this.key.compareTo(tag.key);
        return compareTo != 0 ? compareTo : this.value.compareTo(tag.value);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        Tag tag = (Tag) obj;
        String str = this.key;
        if (str == null) {
            if (tag.key != null) {
                return false;
            }
        } else {
            if (!str.equals(tag.key)) {
                return false;
            }
            String str2 = this.value;
            if (str2 == null) {
                if (tag.value != null) {
                    return false;
                }
            } else if (!str2.equals(tag.value)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((this.keyCode + 31) * 31) + this.valueCode;
    }

    public String toString() {
        return "key=" + this.key + ", value=" + this.value;
    }
}
