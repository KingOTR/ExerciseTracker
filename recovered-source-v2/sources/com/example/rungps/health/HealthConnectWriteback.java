package com.example.rungps.health;

import android.content.Context;
import com.example.rungps.data.SleepEntryEntity;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: HealthConnectWriteback.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001e\u0010\b\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0086@¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/example/rungps/health/HealthConnectWriteback;", "", "<init>", "()V", "autoBackupEnabled", "", "context", "Landroid/content/Context;", "maybePushSleep", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "(Landroid/content/Context;Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HealthConnectWriteback {
    public static final int $stable = 0;
    public static final HealthConnectWriteback INSTANCE = new HealthConnectWriteback();

    private HealthConnectWriteback() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean autoBackupEnabled(Context context) {
        return context.getSharedPreferences("settings", 0).getBoolean("healthConnectAutoBackup", false);
    }

    public final Object maybePushSleep(Context context, SleepEntryEntity sleepEntryEntity, Continuation<Object> continuation) {
        return BuildersKt.withContext(Dispatchers.getIO(), new HealthConnectWriteback$maybePushSleep$2(context, sleepEntryEntity, null), continuation);
    }
}
