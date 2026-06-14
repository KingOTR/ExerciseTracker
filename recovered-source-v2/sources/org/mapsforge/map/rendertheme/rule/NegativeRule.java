package org.mapsforge.map.rendertheme.rule;

import java.util.List;
import org.mapsforge.core.model.Tag;

/* loaded from: classes5.dex */
class NegativeRule extends Rule {
    final NegativeMatcher attributeMatcher;

    NegativeRule(RuleBuilder ruleBuilder, NegativeMatcher negativeMatcher) {
        super(ruleBuilder);
        this.attributeMatcher = negativeMatcher;
    }

    @Override // org.mapsforge.map.rendertheme.rule.Rule
    boolean matchesNode(List<Tag> list, byte b) {
        return this.zoomMin <= b && this.zoomMax >= b && this.elementMatcher.matches(Element.NODE) && matchesTags(list);
    }

    @Override // org.mapsforge.map.rendertheme.rule.Rule
    boolean matchesWay(List<Tag> list, byte b, Closed closed) {
        return this.zoomMin <= b && this.zoomMax >= b && this.elementMatcher.matches(Element.WAY) && this.closedMatcher.matches(closed) && matchesTags(list);
    }

    private boolean matchesTags(List<Tag> list) {
        if (this.attributeMatcher.keyListDoesNotContainKeys(list)) {
            return true;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (this.attributeMatcher.matches(list.get(i))) {
                return true;
            }
        }
        return false;
    }
}
