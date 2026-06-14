package org.maplibre.android.maps.renderer;

/* loaded from: classes5.dex */
public interface MapRendererScheduler {
    void queueEvent(Runnable runnable);

    void requestRender();

    void waitForEmpty();
}
