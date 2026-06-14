package org.mapsforge.map.android.graphics;

import org.mapsforge.core.graphics.Matrix;

/* loaded from: classes5.dex */
class AndroidMatrix implements Matrix {
    final android.graphics.Matrix matrix = new android.graphics.Matrix();

    AndroidMatrix() {
    }

    @Override // org.mapsforge.core.graphics.Matrix
    public void reset() {
        this.matrix.reset();
    }

    @Override // org.mapsforge.core.graphics.Matrix
    public void rotate(float f) {
        this.matrix.preRotate((float) Math.toDegrees(f));
    }

    @Override // org.mapsforge.core.graphics.Matrix
    public void rotate(float f, float f2, float f3) {
        this.matrix.preRotate((float) Math.toDegrees(f), f2, f3);
    }

    @Override // org.mapsforge.core.graphics.Matrix
    public void scale(float f, float f2) {
        this.matrix.preScale(f, f2);
    }

    @Override // org.mapsforge.core.graphics.Matrix
    public void scale(float f, float f2, float f3, float f4) {
        this.matrix.preScale(f, f2, f3, f4);
    }

    @Override // org.mapsforge.core.graphics.Matrix
    public void translate(float f, float f2) {
        this.matrix.preTranslate(f, f2);
    }
}
