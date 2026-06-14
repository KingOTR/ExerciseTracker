package com.example.rungps.sync;

import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: CloudSyncScheduler.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/example/rungps/sync/CloudSyncScheduler;", "", "<init>", "()V", "PREFS", "", "KEY_LAST_RESUME_SYNC_MS", "MIN_RESUME_INTERVAL_MS", "", "syncIfDue", "Lcom/example/rungps/sync/CloudSyncResult;", "context", "Landroid/content/Context;", "force", "", "(Landroid/content/Context;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CloudSyncScheduler {
    public static final int $stable = 0;
    public static final CloudSyncScheduler INSTANCE = new CloudSyncScheduler();
    private static final String KEY_LAST_RESUME_SYNC_MS = "last_resume_sync_ms";
    private static final long MIN_RESUME_INTERVAL_MS = 180000;
    private static final String PREFS = "cloud_sync";

    private CloudSyncScheduler() {
    }

    public static /* synthetic */ Object syncIfDue$default(CloudSyncScheduler cloudSyncScheduler, Context context, boolean z, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return cloudSyncScheduler.syncIfDue(context, z, continuation);
    }

    public final Object syncIfDue(Context context, boolean z, Continuation<? super CloudSyncResult> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new CloudSyncScheduler$syncIfDue$2(context, z, null), continuation);
    }
}
