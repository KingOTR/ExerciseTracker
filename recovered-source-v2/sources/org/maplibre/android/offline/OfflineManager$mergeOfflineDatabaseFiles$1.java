package org.maplibre.android.offline;

import android.os.Handler;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;

/* compiled from: OfflineManager.kt */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0016¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"org/maplibre/android/offline/OfflineManager$mergeOfflineDatabaseFiles$1", "Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;", "onMerge", "", "offlineRegions", "", "Lorg/maplibre/android/offline/OfflineRegion;", "([Lorg/maplibre/android/offline/OfflineRegion;)V", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineManager$mergeOfflineDatabaseFiles$1 implements OfflineManager.MergeOfflineRegionsCallback {
    final /* synthetic */ OfflineManager.MergeOfflineRegionsCallback $callback;
    final /* synthetic */ File $file;
    final /* synthetic */ boolean $isTemporaryFile;
    final /* synthetic */ OfflineManager this$0;

    OfflineManager$mergeOfflineDatabaseFiles$1(boolean z, File file, OfflineManager offlineManager, OfflineManager.MergeOfflineRegionsCallback mergeOfflineRegionsCallback) {
        this.$isTemporaryFile = z;
        this.$file = file;
        this.this$0 = offlineManager;
        this.$callback = mergeOfflineRegionsCallback;
    }

    @Override // org.maplibre.android.offline.OfflineManager.MergeOfflineRegionsCallback
    public void onMerge(final OfflineRegion[] offlineRegions) {
        Handler handler;
        if (this.$isTemporaryFile) {
            this.$file.delete();
        }
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.MergeOfflineRegionsCallback mergeOfflineRegionsCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$mergeOfflineDatabaseFiles$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$mergeOfflineDatabaseFiles$1.onMerge$lambda$0(OfflineManager.this, mergeOfflineRegionsCallback, offlineRegions);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onMerge$lambda$0(OfflineManager offlineManager, OfflineManager.MergeOfflineRegionsCallback mergeOfflineRegionsCallback, OfflineRegion[] offlineRegionArr) {
        FileSource fileSource;
        fileSource = offlineManager.fileSource;
        fileSource.deactivate();
        mergeOfflineRegionsCallback.onMerge(offlineRegionArr);
    }

    @Override // org.maplibre.android.offline.OfflineManager.MergeOfflineRegionsCallback
    public void onError(final String error) {
        Handler handler;
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.$isTemporaryFile) {
            this.$file.delete();
        }
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.MergeOfflineRegionsCallback mergeOfflineRegionsCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$mergeOfflineDatabaseFiles$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$mergeOfflineDatabaseFiles$1.onError$lambda$1(OfflineManager.this, mergeOfflineRegionsCallback, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(OfflineManager offlineManager, OfflineManager.MergeOfflineRegionsCallback mergeOfflineRegionsCallback, String str) {
        FileSource fileSource;
        fileSource = offlineManager.fileSource;
        fileSource.deactivate();
        mergeOfflineRegionsCallback.onError(str);
    }
}
