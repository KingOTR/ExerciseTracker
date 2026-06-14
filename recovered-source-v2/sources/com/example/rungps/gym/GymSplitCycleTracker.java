package com.example.rungps.gym;

import android.content.Context;
import android.content.SharedPreferences;
import com.example.rungps.data.GymDayTemplateEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: GymSplitCycleTracker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bJ,\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J*\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/gym/GymSplitCycleTracker;", "", "<init>", "()V", "PREFS", "", "completedDayIds", "", "", "context", "Landroid/content/Context;", "splitId", "markDayCompleted", "", "dayId", "allDays", "", "Lcom/example/rungps/data/GymDayTemplateEntity;", "pendingDays", "completedDays", "completedKey", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymSplitCycleTracker {
    public static final int $stable = 0;
    public static final GymSplitCycleTracker INSTANCE = new GymSplitCycleTracker();
    private static final String PREFS = "gym_split_cycle";

    private GymSplitCycleTracker() {
    }

    public final Set<Long> completedDayIds(Context context, long splitId) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getSharedPreferences(PREFS, 0).getString(completedKey(splitId), null);
        if (string == null) {
            return SetsKt.emptySet();
        }
        List split$default = StringsKt.split$default((CharSequence) string, new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList();
        Iterator it = split$default.iterator();
        while (it.hasNext()) {
            Long longOrNull = StringsKt.toLongOrNull((String) it.next());
            if (longOrNull != null) {
                arrayList.add(longOrNull);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public final void markDayCompleted(Context context, long splitId, long dayId, List<GymDayTemplateEntity> allDays) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(allDays, "allDays");
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFS, 0);
        Set mutableSet = CollectionsKt.toMutableSet(completedDayIds(context, splitId));
        mutableSet.add(Long.valueOf(dayId));
        if (!allDays.isEmpty() && mutableSet.size() >= allDays.size()) {
            sharedPreferences.edit().remove(completedKey(splitId)).apply();
        } else {
            sharedPreferences.edit().putString(completedKey(splitId), CollectionsKt.joinToString$default(mutableSet, ",", null, null, 0, null, null, 62, null)).apply();
        }
    }

    public final List<GymDayTemplateEntity> pendingDays(Context context, long splitId, List<GymDayTemplateEntity> allDays) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(allDays, "allDays");
        if (allDays.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        Set<Long> completedDayIds = completedDayIds(context, splitId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : allDays) {
            if (!completedDayIds.contains(Long.valueOf(((GymDayTemplateEntity) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<GymDayTemplateEntity> completedDays(Context context, long splitId, List<GymDayTemplateEntity> allDays) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(allDays, "allDays");
        Set<Long> completedDayIds = completedDayIds(context, splitId);
        ArrayList arrayList = new ArrayList();
        for (Object obj : allDays) {
            if (completedDayIds.contains(Long.valueOf(((GymDayTemplateEntity) obj).getId()))) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final String completedKey(long splitId) {
        return "completed_" + splitId;
    }
}
