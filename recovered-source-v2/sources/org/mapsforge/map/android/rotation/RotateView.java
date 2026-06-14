package org.mapsforge.map.android.rotation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.google.common.primitives.Ints;

/* loaded from: classes5.dex */
public class RotateView extends ViewGroup {
    private float heading;
    private final Matrix matrix;
    private final float[] points;
    private int saveCount;
    private final SmoothCanvas smoothCanvas;

    public RotateView(Context context) {
        this(context, null);
    }

    public RotateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.heading = 0.0f;
        this.matrix = new Matrix();
        this.points = new float[2];
        this.saveCount = -1;
        this.smoothCanvas = new SmoothCanvas();
        setLayerType(1, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        if (this.heading == 0.0f) {
            super.dispatchDraw(canvas);
            return;
        }
        this.saveCount = canvas.save();
        canvas.rotate(-this.heading, getWidth() * 0.5f, getHeight() * 0.5f);
        this.smoothCanvas.delegate = canvas;
        super.dispatchDraw(this.smoothCanvas);
        int i = this.saveCount;
        if (i != -1) {
            canvas.restoreToCount(i);
            this.saveCount = -1;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        float f = this.heading;
        if (f == 0.0f) {
            return super.dispatchTouchEvent(motionEvent);
        }
        MotionEvent rotateEvent = rotateEvent(motionEvent, f, getWidth() * 0.5f, getHeight() * 0.5f);
        try {
            return super.dispatchTouchEvent(rotateEvent);
        } finally {
            if (rotateEvent != motionEvent) {
                rotateEvent.recycle();
            }
        }
    }

    public float getHeading() {
        return this.heading;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int width = getWidth();
        int height = getHeight();
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i6 = (width - measuredWidth) / 2;
            int i7 = (height - measuredHeight) / 2;
            childAt.layout(i6, i7, measuredWidth + i6, measuredHeight + i7);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) Math.hypot(getDefaultSize(getSuggestedMinimumWidth(), i), getDefaultSize(getSuggestedMinimumHeight(), i2)), Ints.MAX_POWER_OF_TWO);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            getChildAt(i3).measure(makeMeasureSpec, makeMeasureSpec);
        }
        super.onMeasure(i, i2);
    }

    private MotionEvent rotateEvent(MotionEvent motionEvent, float f, float f2, float f3) {
        if (f == 0.0f) {
            return motionEvent;
        }
        this.matrix.setRotate(f, f2, f3);
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        obtain.transform(this.matrix);
        return obtain;
    }

    public void setHeading(float f) {
        this.heading = f;
    }
}
