package org.maplibre.android.offline;

import android.os.Handler;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;

/* compiled from: OfflineManager.kt */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"org/maplibre/android/offline/OfflineManager$clearAmbientCache$1", "Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;", "onSuccess", "", "onError", "message", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineManager$clearAmbientCache$1 implements OfflineManager.FileSourceCallback {
    final /* synthetic */ OfflineManager.FileSourceCallback $callback;
    final /* synthetic */ OfflineManager this$0;

    OfflineManager$clearAmbientCache$1(OfflineManager offlineManager, OfflineManager.FileSourceCallback fileSourceCallback) {
        this.this$0 = offlineManager;
        this.$callback = fileSourceCallback;
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public void onSuccess() {
        Handler handler;
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.FileSourceCallback fileSourceCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$clearAmbientCache$1$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$clearAmbientCache$1.onSuccess$lambda$0(OfflineManager.this, fileSourceCallback);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSuccess$lambda$0(OfflineManager offlineManager, OfflineManager.FileSourceCallback fileSourceCallback) {
        FileSource fileSource;
        fileSource = offlineManager.fileSource;
        fileSource.deactivate();
        if (fileSourceCallback != null) {
            fileSourceCallback.onSuccess();
        }
    }

    @Override // org.maplibre.android.offline.OfflineManager.FileSourceCallback
    public void onError(final String message) {
        Handler handler;
        Intrinsics.checkNotNullParameter(message, "message");
        handler = this.this$0.handler;
        final OfflineManager offlineManager = this.this$0;
        final OfflineManager.FileSourceCallback fileSourceCallback = this.$callback;
        handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$clearAmbientCache$1$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager$clearAmbientCache$1.onError$lambda$1(OfflineManager.this, fileSourceCallback, message);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda$1(OfflineManager offlineManager, OfflineManager.FileSourceCallback fileSourceCallback, String str) {
        FileSource fileSource;
        fileSource = offlineManager.fileSource;
        fileSource.deactivate();
        if (fileSourceCallback != null) {
            fileSourceCallback.onError(str);
        }
    }
}
