package org.mapsforge.map.layer.renderer;

import org.mapsforge.core.model.Point;

/* loaded from: classes5.dex */
class CircleContainer implements ShapeContainer {
    final Point point;
    final float radius;

    CircleContainer(Point point, float f) {
        this.point = point;
        this.radius = f;
    }

    @Override // org.mapsforge.map.layer.renderer.ShapeContainer
    public ShapeType getShapeType() {
        return ShapeType.CIRCLE;
    }
}
