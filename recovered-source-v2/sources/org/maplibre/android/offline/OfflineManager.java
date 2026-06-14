package org.maplibre.android.offline;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.internal.ImagesContract;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.maplibre.android.LibraryLoader;
import org.maplibre.android.R;
import org.maplibre.android.geometry.LatLngBounds;
import org.maplibre.android.net.ConnectivityReceiver;
import org.maplibre.android.offline.OfflineManager;
import org.maplibre.android.storage.FileSource;
import org.maplibre.android.utils.FileUtils;
import org.osmdroid.tileprovider.modules.SqlTileWriter;

/* compiled from: OfflineManager.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000 B2\u00020\u0001:\u0006=>?@ABB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0013J\u0016\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001a\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001b\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019J\u0010\u0010\u001c\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019J\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019J \u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000f\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020#H\u0002J\u001e\u0010$\u001a\u00020\r2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020)J\u0010\u0010*\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0002J\u0011\u0010+\u001a\u00020\r2\u0006\u0010,\u001a\u00020\u0007H\u0087 J\u0011\u0010-\u001a\u00020\r2\u0006\u0010.\u001a\u00020#H\u0087 J\u0011\u0010/\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\tH\u0083 J\t\u00100\u001a\u00020\rH\u0085 J\u0019\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0083 J!\u0010\u0011\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0013H\u0083 J)\u0010$\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020)H\u0083 J!\u0010\u0014\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u0017H\u0083 J\u0013\u00101\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019H\u0083 J\u0013\u00102\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019H\u0083 J\u0013\u00103\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019H\u0083 J\u0013\u00104\u001a\u00020\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019H\u0083 J\u001b\u00105\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0019H\u0083 J?\u00106\u001a\u00020\r2\b\u00107\u001a\u0004\u0018\u00010\u00162\b\u00108\u001a\u0004\u0018\u00010(2\u0006\u00109\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u00072\b\u0010;\u001a\u0004\u0018\u00010\u00162\u0006\u0010<\u001a\u00020#H\u0087 R\u0010\u0010\u0006\u001a\u00020\u00078\u0002X\u0083D¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006C"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "nativePtr", "", "fileSource", "Lorg/maplibre/android/storage/FileSource;", "handler", "Landroid/os/Handler;", "deleteAmbientDatabase", "", "listOfflineRegions", "callback", "Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;", "getOfflineRegion", "regionID", "Lorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;", "mergeOfflineRegions", "path", "", "Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;", "resetDatabase", "Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;", "packDatabase", "invalidateAmbientCache", "clearAmbientCache", "setMaximumAmbientCacheSize", "size", "mergeOfflineDatabaseFiles", "file", "Ljava/io/File;", "isTemporaryFile", "", "createOfflineRegion", "definition", "Lorg/maplibre/android/offline/OfflineRegionDefinition;", "metadata", "", "Lorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;", "isValidOfflineRegionDefinition", "setOfflineMapboxTileCountLimit", "limit", "runPackDatabaseAutomatically", "autopack", "initialize", "finalize", "nativeResetDatabase", "nativePackDatabase", "nativeInvalidateAmbientCache", "nativeClearAmbientCache", "nativeSetMaximumAmbientCacheSize", "putResourceWithUrl", ImagesContract.URL, "data", "modified", SqlTileWriter.COLUMN_EXPIRES, "etag", "mustRevalidate", "ListOfflineRegionsCallback", "GetOfflineRegionCallback", "CreateOfflineRegionCallback", "MergeOfflineRegionsCallback", "FileSourceCallback", "Companion", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OfflineManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TAG = "Mbgl - OfflineManager";
    private static OfflineManager instance;
    private final Context context;
    private final FileSource fileSource;
    private final Handler handler;
    private final long nativePtr;

    /* compiled from: OfflineManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$CreateOfflineRegionCallback;", "", "onCreate", "", "offlineRegion", "Lorg/maplibre/android/offline/OfflineRegion;", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CreateOfflineRegionCallback {
        void onCreate(OfflineRegion offlineRegion);

        void onError(String error);
    }

    /* compiled from: OfflineManager.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$FileSourceCallback;", "", "onSuccess", "", "onError", "message", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FileSourceCallback {
        void onError(String message);

        void onSuccess();
    }

    /* compiled from: OfflineManager.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$GetOfflineRegionCallback;", "", "onRegion", "", "offlineRegion", "Lorg/maplibre/android/offline/OfflineRegion;", "onRegionNotFound", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface GetOfflineRegionCallback {
        void onError(String error);

        void onRegion(OfflineRegion offlineRegion);

        void onRegionNotFound();
    }

    /* compiled from: OfflineManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$ListOfflineRegionsCallback;", "", "onList", "", "offlineRegions", "", "Lorg/maplibre/android/offline/OfflineRegion;", "([Lorg/maplibre/android/offline/OfflineRegion;)V", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ListOfflineRegionsCallback {
        void onError(String error);

        void onList(OfflineRegion[] offlineRegions);
    }

    /* compiled from: OfflineManager.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&¢\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$MergeOfflineRegionsCallback;", "", "onMerge", "", "offlineRegions", "", "Lorg/maplibre/android/offline/OfflineRegion;", "([Lorg/maplibre/android/offline/OfflineRegion;)V", "onError", "error", "", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface MergeOfflineRegionsCallback {
        void onError(String error);

        void onMerge(OfflineRegion[] offlineRegions);
    }

    public /* synthetic */ OfflineManager(Context context, DefaultConstructorMarker defaultConstructorMarker) {
        this(context);
    }

    private final native void createOfflineRegion(FileSource fileSource, OfflineRegionDefinition definition, byte[] metadata, CreateOfflineRegionCallback callback);

    private final native void getOfflineRegion(FileSource fileSource, long regionID, GetOfflineRegionCallback callback);

    private final native void initialize(FileSource fileSource);

    private final native void listOfflineRegions(FileSource fileSource, ListOfflineRegionsCallback callback);

    private final native void mergeOfflineRegions(FileSource fileSource, String path, MergeOfflineRegionsCallback callback);

    private final native void nativeClearAmbientCache(FileSourceCallback callback);

    private final native void nativeInvalidateAmbientCache(FileSourceCallback callback);

    private final native void nativePackDatabase(FileSourceCallback callback);

    private final native void nativeResetDatabase(FileSourceCallback callback);

    private final native void nativeSetMaximumAmbientCacheSize(long size, FileSourceCallback callback);

    protected final native void finalize() throws Throwable;

    public final native void putResourceWithUrl(String url, byte[] data, long modified, long expires, String etag, boolean mustRevalidate);

    public final native void runPackDatabaseAutomatically(boolean autopack);

    public final native void setOfflineMapboxTileCountLimit(long limit);

    private OfflineManager(Context context) {
        this.handler = new Handler(Looper.getMainLooper());
        Context applicationContext = context.getApplicationContext();
        this.context = applicationContext;
        FileSource fileSource = FileSource.getInstance(applicationContext);
        this.fileSource = fileSource;
        initialize(fileSource);
        deleteAmbientDatabase(applicationContext);
    }

    private final void deleteAmbientDatabase(Context context) {
        FileUtils.deleteFile(FileSource.getInternalCachePath(context) + File.separator + "mbgl-cache.db");
    }

    public final void listOfflineRegions(ListOfflineRegionsCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.fileSource.activate();
        listOfflineRegions(this.fileSource, new OfflineManager$listOfflineRegions$1(this, callback));
    }

    public final void getOfflineRegion(long regionID, GetOfflineRegionCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.fileSource.activate();
        getOfflineRegion(this.fileSource, regionID, new OfflineManager$getOfflineRegion$1(this, callback));
    }

    public final void mergeOfflineRegions(String path, final MergeOfflineRegionsCallback callback) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(callback, "callback");
        final File file = new File(path);
        new Thread(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                OfflineManager.mergeOfflineRegions$lambda$3(file, this, callback);
            }
        }).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:6:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void mergeOfflineRegions$lambda$3(final File file, final OfflineManager offlineManager, final MergeOfflineRegionsCallback mergeOfflineRegionsCallback) {
        final String str;
        if (file.canWrite()) {
            offlineManager.handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    OfflineManager.this.mergeOfflineDatabaseFiles(file, mergeOfflineRegionsCallback, false);
                }
            });
        } else {
            if (file.canRead()) {
                final File file2 = new File(FileSource.getInternalCachePath(offlineManager.context), file.getName());
                try {
                    INSTANCE.copyTempDatabaseFile(file, file2);
                    Boolean.valueOf(offlineManager.handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$$ExternalSyntheticLambda2
                        @Override // java.lang.Runnable
                        public final void run() {
                            OfflineManager.this.mergeOfflineDatabaseFiles(file2, mergeOfflineRegionsCallback, true);
                        }
                    }));
                } catch (IOException e) {
                    e.printStackTrace();
                    str = e.getMessage();
                    Unit unit = Unit.INSTANCE;
                }
            } else {
                str = "Secondary database needs to be located in a readable path.";
            }
            if (str == null) {
                offlineManager.handler.post(new Runnable() { // from class: org.maplibre.android.offline.OfflineManager$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        OfflineManager.MergeOfflineRegionsCallback.this.onError(str);
                    }
                });
                return;
            }
            return;
        }
        str = null;
        if (str == null) {
        }
    }

    public final void resetDatabase(FileSourceCallback callback) {
        this.fileSource.activate();
        nativeResetDatabase(new OfflineManager$resetDatabase$1(this, callback));
    }

    public final void packDatabase(FileSourceCallback callback) {
        this.fileSource.activate();
        nativePackDatabase(new OfflineManager$packDatabase$1(this, callback));
    }

    public final void invalidateAmbientCache(FileSourceCallback callback) {
        this.fileSource.activate();
        nativeInvalidateAmbientCache(new OfflineManager$invalidateAmbientCache$1(this, callback));
    }

    public final void clearAmbientCache(FileSourceCallback callback) {
        this.fileSource.activate();
        nativeClearAmbientCache(new OfflineManager$clearAmbientCache$1(this, callback));
    }

    public final void setMaximumAmbientCacheSize(long size, FileSourceCallback callback) {
        this.fileSource.activate();
        nativeSetMaximumAmbientCacheSize(size, new OfflineManager$setMaximumAmbientCacheSize$1(this, callback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void mergeOfflineDatabaseFiles(File file, MergeOfflineRegionsCallback callback, boolean isTemporaryFile) {
        this.fileSource.activate();
        FileSource fileSource = this.fileSource;
        String absolutePath = file.getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        mergeOfflineRegions(fileSource, absolutePath, new OfflineManager$mergeOfflineDatabaseFiles$1(isTemporaryFile, file, this, callback));
    }

    public final void createOfflineRegion(OfflineRegionDefinition definition, byte[] metadata, CreateOfflineRegionCallback callback) {
        Intrinsics.checkNotNullParameter(definition, "definition");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!isValidOfflineRegionDefinition(definition)) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String string = this.context.getString(R.string.maplibre_offline_error_region_definition_invalid);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String format = String.format(string, Arrays.copyOf(new Object[]{definition.getBounds()}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            callback.onError(format);
            return;
        }
        ConnectivityReceiver.instance(this.context).activate();
        FileSource.getInstance(this.context).activate();
        createOfflineRegion(this.fileSource, definition, metadata, new OfflineManager$createOfflineRegion$1(this, callback));
    }

    private final boolean isValidOfflineRegionDefinition(OfflineRegionDefinition definition) {
        LatLngBounds world = LatLngBounds.INSTANCE.world();
        LatLngBounds bounds = definition.getBounds();
        Intrinsics.checkNotNull(bounds);
        return world.contains(bounds);
    }

    /* compiled from: OfflineManager.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lorg/maplibre/android/offline/OfflineManager$Companion;", "", "<init>", "()V", "TAG", "", "instance", "Lorg/maplibre/android/offline/OfflineManager;", "getInstance", "context", "Landroid/content/Context;", "copyTempDatabaseFile", "", "sourceFile", "Ljava/io/File;", "destFile", "MapLibreAndroid_drawableRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final synchronized OfflineManager getInstance(Context context) {
            OfflineManager offlineManager;
            Intrinsics.checkNotNullParameter(context, "context");
            if (OfflineManager.instance == null) {
                OfflineManager.instance = new OfflineManager(context, null);
            }
            offlineManager = OfflineManager.instance;
            Intrinsics.checkNotNull(offlineManager);
            return offlineManager;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0077  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void copyTempDatabaseFile(File sourceFile, File destFile) throws IOException {
            FileChannel fileChannel;
            if (!destFile.exists() && !destFile.createNewFile()) {
                throw new IOException("Unable to copy database file for merge.");
            }
            FileChannel fileChannel2 = null;
            try {
                FileChannel channel = new FileInputStream(sourceFile).getChannel();
                try {
                    fileChannel2 = new FileOutputStream(destFile).getChannel();
                    fileChannel2.transferFrom(channel, 0L, channel.size());
                    if (channel != null) {
                        channel.close();
                    }
                    if (fileChannel2 != null) {
                        fileChannel2.close();
                    }
                } catch (IOException e) {
                    e = e;
                    fileChannel = fileChannel2;
                    fileChannel2 = channel;
                    try {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        String format = String.format("Unable to copy database file for merge. %s", Arrays.copyOf(new Object[]{e.getMessage()}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        throw new IOException(format);
                    } catch (Throwable th) {
                        th = th;
                        if (fileChannel2 != null) {
                            fileChannel2.close();
                        }
                        if (fileChannel != null) {
                            fileChannel.close();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileChannel = fileChannel2;
                    fileChannel2 = channel;
                    if (fileChannel2 != null) {
                    }
                    if (fileChannel != null) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                fileChannel = null;
            } catch (Throwable th3) {
                th = th3;
                fileChannel = null;
            }
        }
    }

    static {
        LibraryLoader.load();
    }

    @JvmStatic
    public static final synchronized OfflineManager getInstance(Context context) {
        OfflineManager companion;
        synchronized (OfflineManager.class) {
            companion = INSTANCE.getInstance(context);
        }
        return companion;
    }
}
