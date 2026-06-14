package org.mapsforge.map.rendertheme.rule;

import org.mapsforge.core.model.Tag;

/* loaded from: classes5.dex */
final class AnyMatcher implements ElementMatcher, AttributeMatcher, ClosedMatcher {
    static final AnyMatcher INSTANCE = new AnyMatcher();

    @Override // org.mapsforge.map.rendertheme.rule.ClosedMatcher
    public boolean isCoveredBy(ClosedMatcher closedMatcher) {
        return closedMatcher == this;
    }

    @Override // org.mapsforge.map.rendertheme.rule.ElementMatcher
    public boolean isCoveredBy(ElementMatcher elementMatcher) {
        return elementMatcher == this;
    }

    @Override // org.mapsforge.map.rendertheme.rule.AttributeMatcher
    public boolean matches(Tag tag) {
        return true;
    }

    @Override // org.mapsforge.map.rendertheme.rule.ClosedMatcher
    public boolean matches(Closed closed) {
        return true;
    }

    @Override // org.mapsforge.map.rendertheme.rule.ElementMatcher
    public boolean matches(Element element) {
        return true;
    }

    private AnyMatcher() {
    }
}
