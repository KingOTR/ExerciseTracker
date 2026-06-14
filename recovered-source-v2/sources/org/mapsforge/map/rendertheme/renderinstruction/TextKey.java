package org.mapsforge.map.rendertheme.renderinstruction;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.mapsforge.core.model.Tag;
import org.mapsforge.core.util.Utils;

/* loaded from: classes5.dex */
final class TextKey {
    private static final Map<Integer, TextKey> TEXT_KEYS = new HashMap();
    private final int keyCode;

    static TextKey getInstance(String str) {
        int hashTagParameter = Utils.hashTagParameter(str);
        Map<Integer, TextKey> map = TEXT_KEYS;
        TextKey textKey = map.get(Integer.valueOf(hashTagParameter));
        if (textKey != null) {
            return textKey;
        }
        TextKey textKey2 = new TextKey(hashTagParameter);
        map.put(Integer.valueOf(hashTagParameter), textKey2);
        return textKey2;
    }

    private TextKey(int i) {
        this.keyCode = i;
    }

    String getValue(List<Tag> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (this.keyCode == list.get(i).keyCode) {
                return list.get(i).value;
            }
        }
        return null;
    }
}
