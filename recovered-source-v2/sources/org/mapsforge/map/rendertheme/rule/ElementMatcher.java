package org.mapsforge.map.rendertheme.rule;

/* loaded from: classes5.dex */
interface ElementMatcher {
    boolean isCoveredBy(ElementMatcher elementMatcher);

    boolean matches(Element element);
}
