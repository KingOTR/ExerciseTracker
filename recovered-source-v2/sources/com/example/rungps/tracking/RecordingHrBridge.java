package com.example.rungps.tracking;

import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;

/* compiled from: RecordingHrBridge.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\tJ\u0006\u0010\u0018\u001a\u00020\u0014J\u0018\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00112\b\b\u0002\u0010\u001b\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000e\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u000f\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0012¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/tracking/RecordingHrBridge;", "", "<init>", "()V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "appContext", "Landroid/content/Context;", "activeRunId", "", "getActiveRunId", "()Ljava/lang/Long;", "setActiveRunId", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "lastSavedMs", "lastBpm", "", "Ljava/lang/Integer;", "init", "", "context", "onRunStarted", "runId", "onRunStopped", "offerSample", "bpm", "timeMs", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecordingHrBridge {
    private static volatile Long activeRunId;
    private static volatile Context appContext;
    private static Integer lastBpm;
    private static long lastSavedMs;
    public static final RecordingHrBridge INSTANCE = new RecordingHrBridge();
    private static final CoroutineScope scope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getIO()));
    public static final int $stable = 8;

    private RecordingHrBridge() {
    }

    public final Long getActiveRunId() {
        return activeRunId;
    }

    public final void setActiveRunId(Long l) {
        activeRunId = l;
    }

    public final void init(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        appContext = context.getApplicationContext();
    }

    public final void onRunStarted(long runId) {
        activeRunId = Long.valueOf(runId);
        lastSavedMs = 0L;
        lastBpm = null;
    }

    public final void onRunStopped() {
        activeRunId = null;
        lastSavedMs = 0L;
        lastBpm = null;
    }

    public static /* synthetic */ void offerSample$default(RecordingHrBridge recordingHrBridge, int i, long j, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = System.currentTimeMillis();
        }
        recordingHrBridge.offerSample(i, j);
    }

    public final void offerSample(int bpm, long timeMs) {
        Long l;
        if (40 > bpm || bpm >= 221 || (l = activeRunId) == null) {
            return;
        }
        long longValue = l.longValue();
        Context context = appContext;
        if (context == null) {
            return;
        }
        Integer num = lastBpm;
        if (num != null) {
            Intrinsics.checkNotNull(num);
            if (Math.abs(bpm - num.intValue()) < 3 && timeMs - lastSavedMs < 4500) {
                return;
            }
        }
        lastSavedMs = timeMs;
        lastBpm = Integer.valueOf(bpm);
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new RecordingHrBridge$offerSample$1(context, longValue, timeMs, bpm, null), 3, null);
    }
}
