package com.example.rungps.sync;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: RunDeleteTombstones.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/sync/RunDeleteTombstones;", "", "<init>", "()V", "PREFS", "", "KEY_ENTRIES", "START_TOLERANCE_MS", "", "entryKey", "startMs", "distanceM", "", "mark", "", "context", "Landroid/content/Context;", "isMarked", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunDeleteTombstones {
    public static final int $stable = 0;
    public static final RunDeleteTombstones INSTANCE = new RunDeleteTombstones();
    private static final String KEY_ENTRIES = "entries";
    private static final String PREFS = "deleted_run_tombstones";
    private static final long START_TOLERANCE_MS = 120000;

    private RunDeleteTombstones() {
    }

    private final String entryKey(long startMs, double distanceM) {
        return startMs + ":" + ((long) distanceM);
    }

    public final void mark(Context context, long startMs, double distanceM) {
        LinkedHashSet linkedHashSet;
        Intrinsics.checkNotNullParameter(context, "context");
        if (startMs <= 0 || distanceM < 1.0d) {
            return;
        }
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(PREFS, 0);
        Set<String> stringSet = sharedPreferences.getStringSet(KEY_ENTRIES, SetsKt.emptySet());
        if (stringSet == null || (linkedHashSet = CollectionsKt.toMutableSet(stringSet)) == null) {
            linkedHashSet = new LinkedHashSet();
        }
        linkedHashSet.add(entryKey(startMs, distanceM));
        sharedPreferences.edit().putStringSet(KEY_ENTRIES, linkedHashSet).apply();
    }

    public final boolean isMarked(Context context, long startMs, double distanceM) {
        Long longOrNull;
        Intrinsics.checkNotNullParameter(context, "context");
        Set<String> stringSet = context.getApplicationContext().getSharedPreferences(PREFS, 0).getStringSet(KEY_ENTRIES, SetsKt.emptySet());
        if (stringSet == null) {
            return false;
        }
        double coerceAtLeast = RangesKt.coerceAtLeast(0.08d * distanceM, 50.0d);
        for (String str : stringSet) {
            Intrinsics.checkNotNull(str);
            List split$default = StringsKt.split$default((CharSequence) str, new String[]{":"}, false, 2, 2, (Object) null);
            if (split$default.size() == 2 && (longOrNull = StringsKt.toLongOrNull((String) split$default.get(0))) != null) {
                long longValue = longOrNull.longValue();
                Double doubleOrNull = StringsKt.toDoubleOrNull((String) split$default.get(1));
                if (doubleOrNull != null) {
                    double doubleValue = doubleOrNull.doubleValue();
                    if (Math.abs(longValue - startMs) <= 120000 && Math.abs(doubleValue - distanceM) <= coerceAtLeast) {
                        return true;
                    }
                } else {
                    continue;
                }
            }
        }
        return false;
    }
}
