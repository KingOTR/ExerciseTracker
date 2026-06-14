package org.mapsforge.map.rendertheme.rule;

import java.util.List;
import org.mapsforge.core.model.Tag;
import org.mapsforge.core.util.Utils;

/* loaded from: classes5.dex */
class KeyMatcher implements AttributeMatcher {
    private final int[] keys;

    KeyMatcher(List<String> list) {
        this.keys = Utils.convertListString(list);
    }

    @Override // org.mapsforge.map.rendertheme.rule.AttributeMatcher
    public boolean matches(Tag tag) {
        return Utils.contains(this.keys, tag.keyCode);
    }
}
