package org.maplibre.android.offline;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;

/* compiled from: OfflineManager.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"org/maplibre/android/offline/OfflineManager$getOfflineRegion$1", "Lorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;", "onRegion", "", "offlineRegion", "Lorg/maplibre/android/offline/OfflineRegion;", "onRegionNotFound", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineManager$getOfflineRegion$1 implements OfflineManager.GetOfflineRegionCallback {
    final /* synthetic */ OfflineManager.GetOfflineRegionCallback $callback;
    final /* synthetic */ OfflineManager this$0;

    OfflineManager$getOfflineRegion$1(OfflineManager offlineManager, OfflineManager.GetOfflineRegionCallback getOfflineRegionCallback) {
        this.this$0 = offlineManager;
        this.$callback = getOfflineRegionCallback;
    }

    @Override // org.maplibre.android.offline.OfflineManager.GetOfflineRegionCallback
    public void onRegion(final OfflineRegion offlineRegion) {
        Handler handler;
        Intrinsics.checkNotNullParameter(offlineRegion, "offlineRegion");
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.GetOfflineRegionCallback getOfflineRegionCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$getOfflineRegion$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$getOfflineRegion$1.onRegion$lambda$0(OfflineManager.this, getOfflineRegionCallback, offlineRegion);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRegion$lambda$0(OfflineManager offlineManager, OfflineManager.GetOfflineRegionCallback getOfflineRegionCallback, OfflineRegion offlineRegion) {
        FileSource fileSource;
        fileSource = offlineManager.fileSource;
        fileSource.deactivate();
        getOfflineRegionCallback.onRegion(offlineRegion);
    }

    @Override // org.maplibre.android.offline.OfflineManager.GetOfflineRegionCallback
    public void onRegionNotFound() {
        Handler handler;
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.GetOfflineRegionCallback getOfflineRegionCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$getOfflineRegion$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$getOfflineRegion$1.onRegionNotFound$lambda$1(OfflineManager.this, getOfflineRegionCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRegionNotFound$lambda$1(OfflineManager offlineManager, OfflineManager.GetOfflineRegionCallback getOfflineRegionCallback) {
        FileSource fileSource;
        fileSource = offlineManager.fileSource;
        fileSource.deactivate();
        getOfflineRegionCallback.onRegionNotFound();
    }

    @Override // org.maplibre.android.offline.OfflineManager.GetOfflineRegionCallback
    public void onError(final String error) {
        Handler handler;
        Intrinsics.checkNotNullParameter(error, "error");
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.GetOfflineRegionCallback getOfflineRegionCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$getOfflineRegion$1$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$getOfflineRegion$1.onError$lambda$2(OfflineManager.this, getOfflineRegionCallback, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$2(OfflineManager offlineManager, OfflineManager.GetOfflineRegionCallback getOfflineRegionCallback, String str) {
        FileSource fileSource;
        fileSource = offlineManager.fileSource;
        fileSource.deactivate();
        getOfflineRegionCallback.onError(str);
    }
}
