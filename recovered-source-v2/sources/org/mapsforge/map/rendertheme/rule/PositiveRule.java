package org.mapsforge.map.rendertheme.rule;

import java.util.List;
import org.mapsforge.core.model.Tag;

/* loaded from: classes5.dex */
class PositiveRule extends Rule {
    final AttributeMatcher keyMatcher;
    final AttributeMatcher valueMatcher;

    PositiveRule(RuleBuilder ruleBuilder, AttributeMatcher attributeMatcher, AttributeMatcher attributeMatcher2) {
        super(ruleBuilder);
        this.keyMatcher = attributeMatcher;
        this.valueMatcher = attributeMatcher2;
    }

    @Override // org.mapsforge.map.rendertheme.rule.Rule
    boolean matchesNode(List<Tag> list, byte b) {
        return this.zoomMin <= b && this.zoomMax >= b && this.elementMatcher.matches(Element.NODE) && matchesAnyTag(list);
    }

    @Override // org.mapsforge.map.rendertheme.rule.Rule
    boolean matchesWay(List<Tag> list, byte b, Closed closed) {
        return this.zoomMin <= b && this.zoomMax >= b && this.elementMatcher.matches(Element.WAY) && this.closedMatcher.matches(closed) && matchesAnyTag(list);
    }

    private boolean matchesAnyTag(List<Tag> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Tag tag = list.get(i);
            if (this.keyMatcher.matches(tag) && this.valueMatcher.matches(tag)) {
                return true;
            }
        }
        return false;
    }
}
