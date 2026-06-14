package com.example.rungps.sleep;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepOrphanCleanup.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t¨\u0006\n"}, d2 = {"Lcom/example/rungps/sleep/SleepOrphanCleanup;", "", "<init>", "()V", "deleteForNight", "", "context", "Landroid/content/Context;", "nightStartMs", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepOrphanCleanup {
    public static final int $stable = 0;
    public static final SleepOrphanCleanup INSTANCE = new SleepOrphanCleanup();

    private SleepOrphanCleanup() {
    }

    public final void deleteForNight(Context context, long nightStartMs) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (nightStartMs <= 0) {
            return;
        }
        BuildersKt.runBlocking(Dispatchers.getIO(), new SleepOrphanCleanup$deleteForNight$1(context, nightStartMs, null));
    }
}
