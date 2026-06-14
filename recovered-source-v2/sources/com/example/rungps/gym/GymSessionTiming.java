package com.example.rungps.gym;

import android.content.SharedPreferences;
import com.example.rungps.data.GymSetEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: GymSessionTiming.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0005J \u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0005J$\u0010\u000f\u001a\u00020\u00052\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/gym/GymSessionTiming;", "", "<init>", "()V", "REST_AFTER_LAST_SET_MS", "", "IDLE_TRIM_THRESHOLD_MS", "MAX_END_AFTER_LAST_SET_MS", "lastSetEntryMs", "prefs", "Landroid/content/SharedPreferences;", "sessionId", "suggestedEndMs", "startedAtMs", "nowMs", "activeWorkDurationMs", "sets", "", "Lcom/example/rungps/data/GymSetEntity;", "sessionStartMs", "sessionEndMs", "MAX_COUNTED_REST_MS", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSessionTiming {
    public static final int $stable = 0;
    public static final long IDLE_TRIM_THRESHOLD_MS = 1200000;
    public static final GymSessionTiming INSTANCE = new GymSessionTiming();
    private static final long MAX_COUNTED_REST_MS = 300000;
    public static final long MAX_END_AFTER_LAST_SET_MS = 2700000;
    public static final long REST_AFTER_LAST_SET_MS = 900000;

    private GymSessionTiming() {
    }

    public final long lastSetEntryMs(SharedPreferences prefs, long sessionId) {
        Intrinsics.checkNotNullParameter(prefs, "prefs");
        return prefs.getLong("gym_last_set_entry_ms_" + sessionId, 0L);
    }

    public static /* synthetic */ long suggestedEndMs$default(GymSessionTiming gymSessionTiming, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j3 = System.currentTimeMillis();
        }
        return gymSessionTiming.suggestedEndMs(j, j2, j3);
    }

    public final long suggestedEndMs(long startedAtMs, long lastSetEntryMs, long nowMs) {
        long min;
        if (lastSetEntryMs >= startedAtMs) {
            long j = 900000 + lastSetEntryMs;
            if (nowMs - lastSetEntryMs >= IDLE_TRIM_THRESHOLD_MS) {
                min = Math.min(nowMs, lastSetEntryMs + MAX_END_AFTER_LAST_SET_MS);
            } else {
                min = Math.min(nowMs, j);
            }
            return RangesKt.coerceIn(min, startedAtMs, nowMs);
        }
        return RangesKt.coerceAtLeast(nowMs, startedAtMs);
    }

    public final long activeWorkDurationMs(List<GymSetEntity> sets, long sessionStartMs, long sessionEndMs) {
        Intrinsics.checkNotNullParameter(sets, "sets");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sets.iterator();
        while (it.hasNext()) {
            Long loggedAtMs = ((GymSetEntity) it.next()).getLoggedAtMs();
            if (loggedAtMs != null) {
                arrayList.add(loggedAtMs);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((Number) obj).longValue() > 0) {
                arrayList2.add(obj);
            }
        }
        List sorted = CollectionsKt.sorted(arrayList2);
        if (sorted.isEmpty()) {
            return RangesKt.coerceIn(sessionEndMs - sessionStartMs, 60000L, 14400000L);
        }
        long coerceAtLeast = RangesKt.coerceAtLeast(RangesKt.coerceAtMost(((Number) CollectionsKt.last(sorted)).longValue(), sessionEndMs) - RangesKt.coerceAtLeast(((Number) CollectionsKt.first(sorted)).longValue(), sessionStartMs), 0L);
        int size = sorted.size();
        long j = coerceAtLeast;
        for (int i = 1; i < size; i++) {
            j += RangesKt.coerceAtMost(((Number) sorted.get(i)).longValue() - ((Number) sorted.get(i - 1)).longValue(), 300000L);
        }
        return RangesKt.coerceIn(j, 60000L, 14400000L);
    }
}
