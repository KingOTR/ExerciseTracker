package org.maplibre.android.offline;

import android.os.Handler;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import org.maplibre.android.offline.OfflineRegion;
import org.maplibre.android.storage.FileSource;

/* compiled from: OfflineRegion.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016¨\u0006\t"}, d2 = {"org/maplibre/android/offline/OfflineRegion$getStatus$1", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;", "onStatus", "", NotificationCompat.CATEGORY_STATUS, "Lorg/maplibre/android/offline/OfflineRegionStatus;", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineRegion$getStatus$1 implements OfflineRegion.OfflineRegionStatusCallback {
    final /* synthetic */ OfflineRegion.OfflineRegionStatusCallback $callback;
    final /* synthetic */ OfflineRegion this$0;

    OfflineRegion$getStatus$1(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionStatusCallback offlineRegionStatusCallback) {
        this.this$0 = offlineRegion;
        this.$callback = offlineRegionStatusCallback;
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionStatusCallback
    public void onStatus(final OfflineRegionStatus status) {
        Handler handler;
        handler = this.this$0.handler;
        final OfflineRegion offlineRegion = this.this$0;
        final OfflineRegion.OfflineRegionStatusCallback offlineRegionStatusCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$getStatus$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfflineRegion$getStatus$1.onStatus$lambda$0(OfflineRegion.this, offlineRegionStatusCallback, status);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStatus$lambda$0(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionStatusCallback offlineRegionStatusCallback, OfflineRegionStatus offlineRegionStatus) {
        FileSource fileSource;
        fileSource = offlineRegion.fileSource;
        fileSource.deactivate();
        offlineRegionStatusCallback.onStatus(offlineRegionStatus);
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionStatusCallback
    public void onError(final String error) {
        Handler handler;
        handler = this.this$0.handler;
        final OfflineRegion offlineRegion = this.this$0;
        final OfflineRegion.OfflineRegionStatusCallback offlineRegionStatusCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$getStatus$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineRegion$getStatus$1.onError$lambda$1(OfflineRegion.this, offlineRegionStatusCallback, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionStatusCallback offlineRegionStatusCallback, String str) {
        FileSource fileSource;
        fileSource = offlineRegion.fileSource;
        fileSource.deactivate();
        offlineRegionStatusCallback.onError(str);
    }
}
