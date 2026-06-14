package org.maplibre.android.offline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.core.app.NotificationCompat;
import com.google.firebase.firestore.model.Values;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.LibraryLoader;
import org.maplibre.android.MapLibre;
import org.maplibre.android.net.ConnectivityReceiver;
import org.maplibre.android.storage.FileSource;

/* compiled from: OfflineRegion.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u0000 A2\u00020\u0001:\u0007;<=>?@AB1\b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0014J\b\u0010#\u001a\u00020\u0014H\u0002J\u0010\u0010$\u001a\u00020!2\b\u0010%\u001a\u0004\u0018\u00010&J\u000e\u0010'\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010(\u001a\u00020!2\u0006\u0010)\u001a\u00020*J\u000e\u0010+\u001a\u00020!2\u0006\u0010)\u001a\u00020,J\u0010\u0010-\u001a\u00020!2\b\u0010)\u001a\u0004\u0018\u00010.J\u0016\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020\n2\u0006\u0010)\u001a\u000201J\u0019\u00102\u001a\u00020!2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0083 J\t\u00103\u001a\u00020!H\u0085 J\u0011\u00104\u001a\u00020!2\u0006\u0010)\u001a\u00020&H\u0083 J\u0011\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u001dH\u0083 J\u0011\u00107\u001a\u00020!2\u0006\u0010)\u001a\u00020*H\u0083 J\u0011\u00108\u001a\u00020!2\u0006\u0010)\u001a\u00020,H\u0083 J\u0019\u00109\u001a\u00020!2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010)\u001a\u000201H\u0083 J\u0011\u0010:\u001a\u00020!2\u0006\u0010)\u001a\u00020.H\u0083 R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00038\u0002X\u0083D¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001e\u0010\t\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\n@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006B"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion;", "", "offlineRegionPtr", "", "fileSource", "Lorg/maplibre/android/storage/FileSource;", "idParam", "definition", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "metadata", "", "<init>", "(JLorg/maplibre/android/storage/FileSource;JLorg/maplibre/android/offline/OfflineRegionDefinition;[B)V", "context", "Landroid/content/Context;", "nativePtr", "id", "getId", "()J", "isDeleted", "", "getDefinition", "()Lorg/maplibre/android/offline/OfflineRegionDefinition;", Values.VECTOR_MAP_VECTORS_KEY, "getMetadata", "()[B", "handler", "Landroid/os/Handler;", "state", "", "isDeliveringInactiveMessages", "()Z", "setDeliverInactiveMessages", "", "deliverInactiveMessages", "deliverMessages", "setObserver", "observer", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;", "setDownloadState", "getStatus", "callback", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;", "delete", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;", "invalidate", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;", "updateMetadata", "bytes", "Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;", "initialize", "finalize", "setOfflineRegionObserver", "setOfflineRegionDownloadState", "offlineRegionDownloadState", "getOfflineRegionStatus", "deleteOfflineRegion", "updateOfflineRegionMetadata", "invalidateOfflineRegion", "OfflineRegionObserver", "OfflineRegionStatusCallback", "OfflineRegionDeleteCallback", "OfflineRegionInvalidateCallback", "OfflineRegionUpdateMetadataCallback", "DownloadState", "Companion", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineRegion {
    public static final int STATE_ACTIVE = 1;
    public static final int STATE_INACTIVE = 0;
    private final OfflineRegionDefinition definition;
    private final FileSource fileSource;
    private final long id;
    private boolean isDeleted;
    private boolean isDeliveringInactiveMessages;
    private byte[] metadata;
    private final long nativePtr;
    private int state;
    private final Handler handler = new Handler(Looper.getMainLooper());
    private final Context context = MapLibre.getApplicationContext();

    /* compiled from: OfflineRegion.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0087\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$DownloadState;", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
    public @interface DownloadState {
    }

    /* compiled from: OfflineRegion.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionDeleteCallback;", "", "onDelete", "", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionDeleteCallback {
        void onDelete();

        void onError(String error);
    }

    /* compiled from: OfflineRegion.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionInvalidateCallback;", "", "onInvalidate", "", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionInvalidateCallback {
        void onError(String error);

        void onInvalidate();
    }

    /* compiled from: OfflineRegion.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionObserver;", "", "onStatusChanged", "", NotificationCompat.CATEGORY_STATUS, "Lorg/maplibre/android/offline/OfflineRegionStatus;", "onError", "error", "Lorg/maplibre/android/offline/OfflineRegionError;", "mapboxTileCountLimitExceeded", "limit", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionObserver {
        void mapboxTileCountLimitExceeded(long limit);

        void onError(OfflineRegionError error);

        void onStatusChanged(OfflineRegionStatus status);
    }

    /* compiled from: OfflineRegion.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionStatusCallback;", "", "onStatus", "", NotificationCompat.CATEGORY_STATUS, "Lorg/maplibre/android/offline/OfflineRegionStatus;", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionStatusCallback {
        void onError(String error);

        void onStatus(OfflineRegionStatus status);
    }

    /* compiled from: OfflineRegion.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineRegion$OfflineRegionUpdateMetadataCallback;", "", "onUpdate", "", "metadata", "", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OfflineRegionUpdateMetadataCallback {
        void onError(String error);

        void onUpdate(byte[] metadata);
    }

    private final native void deleteOfflineRegion(OfflineRegionDeleteCallback callback);

    private final native void getOfflineRegionStatus(OfflineRegionStatusCallback callback);

    private final native void initialize(long offlineRegionPtr, FileSource fileSource);

    private final native void invalidateOfflineRegion(OfflineRegionInvalidateCallback callback);

    private final native void setOfflineRegionDownloadState(int offlineRegionDownloadState);

    private final native void setOfflineRegionObserver(OfflineRegionObserver callback);

    private final native void updateOfflineRegionMetadata(byte[] metadata, OfflineRegionUpdateMetadataCallback callback);

    protected final native void finalize();

    private OfflineRegion(long j, FileSource fileSource, long j2, OfflineRegionDefinition offlineRegionDefinition, byte[] bArr) {
        this.fileSource = fileSource;
        this.id = j2;
        this.definition = offlineRegionDefinition;
        this.metadata = bArr;
        initialize(j, fileSource);
    }

    public final long getId() {
        return this.id;
    }

    public final OfflineRegionDefinition getDefinition() {
        return this.definition;
    }

    public final byte[] getMetadata() {
        return this.metadata;
    }

    /* renamed from: isDeliveringInactiveMessages, reason: from getter */
    public final boolean getIsDeliveringInactiveMessages() {
        return this.isDeliveringInactiveMessages;
    }

    public final void setDeliverInactiveMessages(boolean deliverInactiveMessages) {
        this.isDeliveringInactiveMessages = deliverInactiveMessages;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean deliverMessages() {
        if (this.state == 1) {
            return true;
        }
        return this.isDeliveringInactiveMessages;
    }

    public final void setObserver(OfflineRegionObserver observer) {
        setOfflineRegionObserver(new OfflineRegion$setObserver$1(this, observer));
    }

    public final void setDownloadState(int state) {
        if (this.state == state) {
            return;
        }
        if (state == 1) {
            ConnectivityReceiver.instance(this.context).activate();
            this.fileSource.activate();
        } else {
            this.fileSource.deactivate();
            ConnectivityReceiver.instance(this.context).deactivate();
        }
        this.state = state;
        setOfflineRegionDownloadState(state);
    }

    public final void getStatus(OfflineRegionStatusCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.fileSource.activate();
        getOfflineRegionStatus(new OfflineRegion$getStatus$1(this, callback));
    }

    public final void delete(OfflineRegionDeleteCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.isDeleted) {
            return;
        }
        this.isDeleted = true;
        this.fileSource.activate();
        deleteOfflineRegion(new OfflineRegion$delete$1(this, callback));
    }

    public final void invalidate(OfflineRegionInvalidateCallback callback) {
        this.fileSource.activate();
        invalidateOfflineRegion(new OfflineRegion$invalidate$1(this, callback));
    }

    public final void updateMetadata(byte[] bytes, OfflineRegionUpdateMetadataCallback callback) {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        Intrinsics.checkNotNullParameter(callback, "callback");
        updateOfflineRegionMetadata(bytes, new OfflineRegion$updateMetadata$1(this, callback));
    }

    static {
        LibraryLoader.load();
    }
}
