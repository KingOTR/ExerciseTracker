package com.example.rungps.recovery;

import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RecoveryEventEntity;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeloadPlanner.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/example/rungps/recovery/DeloadPlanner;", "", "<init>", "()V", "advise", "Lcom/example/rungps/recovery/DeloadAdvice;", "sessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "recoveryEvents", "Lcom/example/rungps/data/RecoveryEventEntity;", "nowMs", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeloadPlanner {
    public static final int $stable = 0;
    public static final DeloadPlanner INSTANCE = new DeloadPlanner();

    private DeloadPlanner() {
    }

    public static /* synthetic */ DeloadAdvice advise$default(DeloadPlanner deloadPlanner, List list, List list2, long j, int i, Object obj) {
        if ((i & 4) != 0) {
            j = System.currentTimeMillis();
        }
        return deloadPlanner.advise(list, list2, j);
    }

    public final DeloadAdvice advise(List<GymSessionEntity> sessions, List<RecoveryEventEntity> recoveryEvents, long nowMs) {
        int i;
        String str;
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(recoveryEvents, "recoveryEvents");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sessions) {
            if (((GymSessionEntity) obj).getEndedAtMs() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (nowMs - ((GymSessionEntity) obj2).getStartedAtMs() < 1209600000) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = arrayList2;
        if (arrayList3.size() < 4) {
            return new DeloadAdvice(false, "Keep building", "Log a few more sessions before a deload recommendation.", 0);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj3 : recoveryEvents) {
            if (((RecoveryEventEntity) obj3).getEndsAtMs() > nowMs) {
                arrayList4.add(obj3);
            }
        }
        ArrayList arrayList5 = arrayList4;
        if ((arrayList5 instanceof Collection) && arrayList5.isEmpty()) {
            i = 0;
        } else {
            Iterator it = arrayList5.iterator();
            i = 0;
            while (it.hasNext()) {
                if (((RecoveryEventEntity) it.next()).getLoadScore() > 70.0d && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        ArrayList arrayList6 = arrayList3;
        ArrayList arrayList7 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList6, 10));
        Iterator it2 = arrayList6.iterator();
        while (it2.hasNext()) {
            arrayList7.add(Instant.ofEpochMilli(((GymSessionEntity) it2.next()).getStartedAtMs()).atZone(ZoneId.systemDefault()).toLocalDate());
        }
        int size = CollectionsKt.distinct(arrayList7).size();
        boolean z = size >= 10;
        if (i >= 2 || z) {
            if (z) {
                str = "You trained " + size + " days in 14 — cut volume ~30% for 5–7 days.";
            } else {
                str = "Multiple high-load recovery windows — reduce sets/weight ~25% this week.";
            }
            return new DeloadAdvice(true, "Deload week suggested", str, z ? 30 : 25);
        }
        return new DeloadAdvice(false, "No deload needed", "Recovery load and frequency look manageable.", 0);
    }
}
