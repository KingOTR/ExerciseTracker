package org.mapsforge.map.rendertheme.rule;

import java.util.List;
import org.mapsforge.core.model.Tag;
import org.mapsforge.core.util.Utils;

/* loaded from: classes5.dex */
class NegativeMatcher implements AttributeMatcher {
    private final int[] keyList;
    private final int[] valueList;

    NegativeMatcher(List<String> list, List<String> list2) {
        this.keyList = Utils.convertListString(list);
        this.valueList = Utils.convertListString(list2);
    }

    @Override // org.mapsforge.map.rendertheme.rule.AttributeMatcher
    public boolean matches(Tag tag) {
        return Utils.contains(this.valueList, tag.valueCode);
    }

    boolean keyListDoesNotContainKeys(List<Tag> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (Utils.contains(this.keyList, list.get(i).keyCode)) {
                return false;
            }
        }
        return true;
    }
}
