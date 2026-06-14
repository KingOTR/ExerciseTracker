package com.example.rungps.sync;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CloudSyncManager.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bJ\u0018\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\bH\u0002J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/sync/CloudSyncManager;", "", "<init>", "()V", "PREFS", "", "KEY_LAST_SYNC", "lastSyncMs", "", "context", "Landroid/content/Context;", "touchGymSession", "", "sessionId", "localGymUpdatedMs", "syncAll", "Lcom/example/rungps/sync/CloudSyncResult;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudSyncManager {
    public static final int $stable = 0;
    public static final CloudSyncManager INSTANCE = new CloudSyncManager();
    private static final String KEY_LAST_SYNC = "last_cloud_sync_ms";
    private static final String PREFS = "cloud_sync";

    private CloudSyncManager() {
    }

    public final long lastSyncMs(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getSharedPreferences(PREFS, 0).getLong(KEY_LAST_SYNC, 0L);
    }

    public final void touchGymSession(Context context, long sessionId) {
        Intrinsics.checkNotNullParameter(context, "context");
        context.getSharedPreferences(PREFS, 0).edit().putLong("gym_local_updated_" + sessionId, System.currentTimeMillis()).apply();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long localGymUpdatedMs(Context context, long sessionId) {
        return context.getSharedPreferences(PREFS, 0).getLong("gym_local_updated_" + sessionId, 0L);
    }

    public final Object syncAll(Context context, Continuation<? super CloudSyncResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CloudSyncManager$syncAll$2(context, null), continuation);
    }
}
