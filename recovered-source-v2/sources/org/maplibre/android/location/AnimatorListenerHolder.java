package org.maplibre.android.location;

import org.maplibre.android.location.MapLibreAnimator;

/* loaded from: classes5.dex */
class AnimatorListenerHolder {
    private final int animatorType;
    private final MapLibreAnimator.AnimationsValueChangeListener listener;

    AnimatorListenerHolder(int i, MapLibreAnimator.AnimationsValueChangeListener animationsValueChangeListener) {
        this.animatorType = i;
        this.listener = animationsValueChangeListener;
    }

    public int getAnimatorType() {
        return this.animatorType;
    }

    public MapLibreAnimator.AnimationsValueChangeListener getListener() {
        return this.listener;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AnimatorListenerHolder animatorListenerHolder = (AnimatorListenerHolder) obj;
        if (this.animatorType != animatorListenerHolder.animatorType) {
            return false;
        }
        MapLibreAnimator.AnimationsValueChangeListener animationsValueChangeListener = this.listener;
        return animationsValueChangeListener != null ? animationsValueChangeListener.equals(animatorListenerHolder.listener) : animatorListenerHolder.listener == null;
    }

    public int hashCode() {
        int i = this.animatorType * 31;
        MapLibreAnimator.AnimationsValueChangeListener animationsValueChangeListener = this.listener;
        return i + (animationsValueChangeListener != null ? animationsValueChangeListener.hashCode() : 0);
    }
}
