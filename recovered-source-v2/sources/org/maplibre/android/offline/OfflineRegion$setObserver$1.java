package org.maplibre.android.offline;

import android.os.Handler;
import androidx.core.app.NotificationCompat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineRegion;

/* compiled from: OfflineRegion.kt */
@Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"org/maplibre/android/offline/OfflineRegion$setObserver$1", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;", "onStatusChanged", "", NotificationCompat.CATEGORY_STATUS, "Lorg/maplibre/android/offline/OfflineRegionStatus;", "onError", "error", "Lorg/maplibre/android/offline/OfflineRegionError;", "mapboxTileCountLimitExceeded", "limit", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineRegion$setObserver$1 implements OfflineRegion.OfflineRegionObserver {
    final /* synthetic */ OfflineRegion.OfflineRegionObserver $observer;
    final /* synthetic */ OfflineRegion this$0;

    OfflineRegion$setObserver$1(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionObserver offlineRegionObserver) {
        this.this$0 = offlineRegion;
        this.$observer = offlineRegionObserver;
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionObserver
    public void onStatusChanged(final OfflineRegionStatus status) {
        boolean deliverMessages;
        Handler handler;
        Intrinsics.checkNotNullParameter(status, "status");
        deliverMessages = this.this$0.deliverMessages();
        if (deliverMessages) {
            handler = this.this$0.handler;
            final OfflineRegion.OfflineRegionObserver offlineRegionObserver = this.$observer;
            handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$setObserver$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineRegion$setObserver$1.onStatusChanged$lambda$0(OfflineRegion.OfflineRegionObserver.this, status);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onStatusChanged$lambda$0(OfflineRegion.OfflineRegionObserver offlineRegionObserver, OfflineRegionStatus offlineRegionStatus) {
        if (offlineRegionObserver != null) {
            offlineRegionObserver.onStatusChanged(offlineRegionStatus);
        }
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionObserver
    public void onError(final OfflineRegionError error) {
        boolean deliverMessages;
        Handler handler;
        Intrinsics.checkNotNullParameter(error, "error");
        deliverMessages = this.this$0.deliverMessages();
        if (deliverMessages) {
            handler = this.this$0.handler;
            final OfflineRegion.OfflineRegionObserver offlineRegionObserver = this.$observer;
            handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$setObserver$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineRegion$setObserver$1.onError$lambda$1(OfflineRegion.OfflineRegionObserver.this, error);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(OfflineRegion.OfflineRegionObserver offlineRegionObserver, OfflineRegionError offlineRegionError) {
        if (offlineRegionObserver != null) {
            offlineRegionObserver.onError(offlineRegionError);
        }
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionObserver
    public void mapboxTileCountLimitExceeded(final long limit) {
        boolean deliverMessages;
        Handler handler;
        deliverMessages = this.this$0.deliverMessages();
        if (deliverMessages) {
            handler = this.this$0.handler;
            final OfflineRegion.OfflineRegionObserver offlineRegionObserver = this.$observer;
            handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$setObserver$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineRegion$setObserver$1.mapboxTileCountLimitExceeded$lambda$2(OfflineRegion.OfflineRegionObserver.this, limit);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mapboxTileCountLimitExceeded$lambda$2(OfflineRegion.OfflineRegionObserver offlineRegionObserver, long j) {
        if (offlineRegionObserver != null) {
            offlineRegionObserver.mapboxTileCountLimitExceeded(j);
        }
    }
}
