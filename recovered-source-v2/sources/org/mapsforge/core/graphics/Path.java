package org.mapsforge.core.graphics;

/* loaded from: classes5.dex */
public interface Path {
    void clear();

    void close();

    boolean isEmpty();

    void lineTo(float f, float f2);

    void moveTo(float f, float f2);

    void quadTo(float f, float f2, float f3, float f4);

    void setFillRule(FillRule fillRule);
}
