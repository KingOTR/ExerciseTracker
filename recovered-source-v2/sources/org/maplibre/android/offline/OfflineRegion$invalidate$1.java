package org.maplibre.android.offline;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineRegion;
import org.maplibre.android.storage.FileSource;

/* compiled from: OfflineRegion.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"org/maplibre/android/offline/OfflineRegion$invalidate$1", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;", "onInvalidate", "", "onError", "message", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineRegion$invalidate$1 implements OfflineRegion.OfflineRegionInvalidateCallback {
    final /* synthetic */ OfflineRegion.OfflineRegionInvalidateCallback $callback;
    final /* synthetic */ OfflineRegion this$0;

    OfflineRegion$invalidate$1(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionInvalidateCallback offlineRegionInvalidateCallback) {
        this.this$0 = offlineRegion;
        this.$callback = offlineRegionInvalidateCallback;
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionInvalidateCallback
    public void onInvalidate() {
        Handler handler;
        handler = this.this$0.handler;
        final OfflineRegion offlineRegion = this.this$0;
        final OfflineRegion.OfflineRegionInvalidateCallback offlineRegionInvalidateCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$invalidate$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfflineRegion$invalidate$1.onInvalidate$lambda$0(OfflineRegion.this, offlineRegionInvalidateCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onInvalidate$lambda$0(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionInvalidateCallback offlineRegionInvalidateCallback) {
        FileSource fileSource;
        fileSource = offlineRegion.fileSource;
        fileSource.deactivate();
        if (offlineRegionInvalidateCallback != null) {
            offlineRegionInvalidateCallback.onInvalidate();
        }
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionInvalidateCallback
    public void onError(final String message) {
        Handler handler;
        Intrinsics.checkNotNullParameter(message, "message");
        handler = this.this$0.handler;
        final OfflineRegion offlineRegion = this.this$0;
        final OfflineRegion.OfflineRegionInvalidateCallback offlineRegionInvalidateCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$invalidate$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineRegion$invalidate$1.onError$lambda$1(OfflineRegion.this, offlineRegionInvalidateCallback, message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionInvalidateCallback offlineRegionInvalidateCallback, String str) {
        FileSource fileSource;
        fileSource = offlineRegion.fileSource;
        fileSource.deactivate();
        if (offlineRegionInvalidateCallback != null) {
            offlineRegionInvalidateCallback.onError(str);
        }
    }
}
