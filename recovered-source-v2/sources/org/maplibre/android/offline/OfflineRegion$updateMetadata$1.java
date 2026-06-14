package org.maplibre.android.offline;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineRegion;

/* compiled from: OfflineRegion.kt */
@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016¨\u0006\t"}, d2 = {"org/maplibre/android/offline/OfflineRegion$updateMetadata$1", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;", "onUpdate", "", "metadata", "", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineRegion$updateMetadata$1 implements OfflineRegion.OfflineRegionUpdateMetadataCallback {
    final /* synthetic */ OfflineRegion.OfflineRegionUpdateMetadataCallback $callback;
    final /* synthetic */ OfflineRegion this$0;

    OfflineRegion$updateMetadata$1(OfflineRegion offlineRegion, OfflineRegion.OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback) {
        this.this$0 = offlineRegion;
        this.$callback = offlineRegionUpdateMetadataCallback;
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionUpdateMetadataCallback
    public void onUpdate(final byte[] metadata) {
        Handler handler;
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        handler = this.this$0.handler;
        final OfflineRegion offlineRegion = this.this$0;
        final OfflineRegion.OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$updateMetadata$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineRegion$updateMetadata$1.onUpdate$lambda$0(OfflineRegion.this, metadata, offlineRegionUpdateMetadataCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onUpdate$lambda$0(OfflineRegion offlineRegion, byte[] bArr, OfflineRegion.OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback) {
        offlineRegion.metadata = bArr;
        offlineRegionUpdateMetadataCallback.onUpdate(bArr);
    }

    @Override // org.maplibre.android.offline.OfflineRegion.OfflineRegionUpdateMetadataCallback
    public void onError(final String error) {
        Handler handler;
        Intrinsics.checkNotNullParameter(error, "error");
        handler = this.this$0.handler;
        final OfflineRegion.OfflineRegionUpdateMetadataCallback offlineRegionUpdateMetadataCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineRegion$updateMetadata$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfflineRegion.OfflineRegionUpdateMetadataCallback.this.onError(error);
            }
        });
    }
}
