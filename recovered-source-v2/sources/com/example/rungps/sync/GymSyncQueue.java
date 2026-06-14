package com.example.rungps.sync;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: GymSyncQueue.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0086@¢\u0006\u0002\u0010\u0014J\u000e\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\fJ\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00192\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/sync/GymSyncQueue;", "", "<init>", "()V", "PREFS", "", "KEY_IDS", "KEY_LAST_FLUSH_MS", "KEY_LAST_CLOUD_SYNC_MS", "enqueue", "", "context", "Landroid/content/Context;", "sessionId", "", "pendingCount", "", "isOnline", "", "flush", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lastFlushMs", "recordCloudSync", "lastCloudSyncMs", "loadIds", "", "saveIds", "ids", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSyncQueue {
    public static final int $stable = 0;
    public static final GymSyncQueue INSTANCE = new GymSyncQueue();
    private static final String KEY_IDS = "pending_session_ids";
    private static final String KEY_LAST_CLOUD_SYNC_MS = "last_cloud_sync_ms";
    private static final String KEY_LAST_FLUSH_MS = "last_flush_ms";
    private static final String PREFS = "gym_sync_queue";

    private GymSyncQueue() {
    }

    public final void enqueue(Context context, long sessionId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Set<Long> mutableSet = CollectionsKt.toMutableSet(loadIds(context));
        mutableSet.add(Long.valueOf(sessionId));
        saveIds(context, mutableSet);
    }

    public final int pendingCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return loadIds(context).size();
    }

    public final boolean isOnline(Context context) {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        return (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) == null || !networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) ? false : true;
    }

    public final Object flush(Context context, Continuation<? super Integer> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new GymSyncQueue$flush$2(context, null), continuation);
    }

    public final long lastFlushMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getLong(KEY_LAST_FLUSH_MS, 0L);
    }

    public final void recordCloudSync(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putLong(KEY_LAST_CLOUD_SYNC_MS, System.currentTimeMillis()).apply();
    }

    public final long lastCloudSyncMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getLong(KEY_LAST_CLOUD_SYNC_MS, 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<Long> loadIds(Context context) {
        String string = context.getSharedPreferences(PREFS, 0).getString(KEY_IDS, "");
        String str = string != null ? string : "";
        if (StringsKt.isBlank(str)) {
            return SetsKt.emptySet();
        }
        List split$default = StringsKt.split$default((CharSequence) str, new char[]{AbstractJsonLexerKt.COMMA}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Long longOrNull = StringsKt.toLongOrNull(StringsKt.trim((CharSequence) it.next()).toString());
            if (longOrNull != null) {
                arrayList.add(longOrNull);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveIds(Context context, Set<Long> ids) {
        context.getSharedPreferences(PREFS, 0).edit().putString(KEY_IDS, CollectionsKt.joinToString$default(ids, ",", null, null, 0, null, null, 62, null)).apply();
    }
}
