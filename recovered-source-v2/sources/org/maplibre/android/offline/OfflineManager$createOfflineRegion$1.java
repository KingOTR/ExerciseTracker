package org.maplibre.android.offline;

import android.content.Context;
import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.net.ConnectivityReceiver;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;

/* compiled from: OfflineManager.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"org/maplibre/android/offline/OfflineManager$createOfflineRegion$1", "Lorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;", "onCreate", "", "offlineRegion", "Lorg/maplibre/android/offline/OfflineRegion;", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineManager$createOfflineRegion$1 implements OfflineManager.CreateOfflineRegionCallback {
    final /* synthetic */ OfflineManager.CreateOfflineRegionCallback $callback;
    final /* synthetic */ OfflineManager this$0;

    OfflineManager$createOfflineRegion$1(OfflineManager offlineManager, OfflineManager.CreateOfflineRegionCallback createOfflineRegionCallback) {
        this.this$0 = offlineManager;
        this.$callback = createOfflineRegionCallback;
    }

    @Override // org.maplibre.android.offline.OfflineManager.CreateOfflineRegionCallback
    public void onCreate(final OfflineRegion offlineRegion) {
        Handler handler;
        Intrinsics.checkNotNullParameter(offlineRegion, "offlineRegion");
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.CreateOfflineRegionCallback createOfflineRegionCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$createOfflineRegion$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$createOfflineRegion$1.onCreate$lambda$0(OfflineManager.this, createOfflineRegionCallback, offlineRegion);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(OfflineManager offlineManager, OfflineManager.CreateOfflineRegionCallback createOfflineRegionCallback, OfflineRegion offlineRegion) {
        Context context;
        Context context2;
        context = offlineManager.context;
        ConnectivityReceiver.instance(context).deactivate();
        context2 = offlineManager.context;
        FileSource.getInstance(context2).deactivate();
        createOfflineRegionCallback.onCreate(offlineRegion);
    }

    @Override // org.maplibre.android.offline.OfflineManager.CreateOfflineRegionCallback
    public void onError(final String error) {
        Handler handler;
        Intrinsics.checkNotNullParameter(error, "error");
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.CreateOfflineRegionCallback createOfflineRegionCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$createOfflineRegion$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$createOfflineRegion$1.onError$lambda$1(OfflineManager.this, createOfflineRegionCallback, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(OfflineManager offlineManager, OfflineManager.CreateOfflineRegionCallback createOfflineRegionCallback, String str) {
        Context context;
        Context context2;
        context = offlineManager.context;
        ConnectivityReceiver.instance(context).deactivate();
        context2 = offlineManager.context;
        FileSource.getInstance(context2).deactivate();
        createOfflineRegionCallback.onError(str);
    }
}
