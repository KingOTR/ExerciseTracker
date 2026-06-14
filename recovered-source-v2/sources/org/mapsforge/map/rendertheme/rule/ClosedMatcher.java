package org.mapsforge.map.rendertheme.rule;

/* loaded from: classes5.dex */
interface ClosedMatcher {
    boolean isCoveredBy(ClosedMatcher closedMatcher);

    boolean matches(Closed closed);
}
