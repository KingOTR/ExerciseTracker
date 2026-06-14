package com.example.rungps.recovery;

import com.example.rungps.data.SoccerSessionEntity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SoccerSessionDedup.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/recovery/SoccerSessionDedup;", "", "<init>", "()V", "keptSessionIds", "", "", "sessions", "", "Lcom/example/rungps/data/SoccerSessionEntity;", "dedupe", "totalMin", "", "s", "isDuplicate", "", "a", "b", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SoccerSessionDedup {
    public static final int $stable = 0;
    public static final SoccerSessionDedup INSTANCE = new SoccerSessionDedup();

    private SoccerSessionDedup() {
    }

    public final Set<Long> keptSessionIds(List<SoccerSessionEntity> sessions) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        List<SoccerSessionEntity> dedupe = dedupe(sessions);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(dedupe, 10));
        Iterator<T> it = dedupe.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf(((SoccerSessionEntity) it.next()).getId()));
        }
        return CollectionsKt.toSet(arrayList);
    }

    public final List<SoccerSessionEntity> dedupe(List<SoccerSessionEntity> sessions) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        if (sessions.size() <= 1) {
            return sessions;
        }
        List<SoccerSessionEntity> sortedWith = CollectionsKt.sortedWith(sessions, new Comparator() { // from class: com.example.rungps.recovery.SoccerSessionDedup$dedupe$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int i;
                int i2;
                i = SoccerSessionDedup.INSTANCE.totalMin((SoccerSessionEntity) t2);
                Integer valueOf = Integer.valueOf(i);
                i2 = SoccerSessionDedup.INSTANCE.totalMin((SoccerSessionEntity) t);
                return ComparisonsKt.compareValues(valueOf, Integer.valueOf(i2));
            }
        });
        ArrayList arrayList = new ArrayList();
        for (SoccerSessionEntity soccerSessionEntity : sortedWith) {
            ArrayList arrayList2 = arrayList;
            if (!(arrayList2 instanceof Collection) || !arrayList2.isEmpty()) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    if (INSTANCE.isDuplicate((SoccerSessionEntity) it.next(), soccerSessionEntity)) {
                        break;
                    }
                }
            }
            arrayList.add(soccerSessionEntity);
        }
        return CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.recovery.SoccerSessionDedup$dedupe$$inlined$sortedByDescending$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SoccerSessionEntity) t2).getStartTimeMs()), Long.valueOf(((SoccerSessionEntity) t).getStartTimeMs()));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int totalMin(SoccerSessionEntity s) {
        return RangesKt.coerceAtLeast(s.getWarmupMin() + s.getPlayMin(), 0);
    }

    private final boolean isDuplicate(SoccerSessionEntity a, SoccerSessionEntity b) {
        Long watchSessionId = a.getWatchSessionId();
        Long watchSessionId2 = b.getWatchSessionId();
        if ((watchSessionId != null && watchSessionId2 != null && watchSessionId.longValue() > 0 && Intrinsics.areEqual(watchSessionId, watchSessionId2)) || Math.abs(a.getStartTimeMs() - b.getStartTimeMs()) <= 300000) {
            return true;
        }
        return a.getStartTimeMs() <= (b.getStartTimeMs() + (((long) totalMin(b)) * 60000)) + 60000 && b.getStartTimeMs() <= (a.getStartTimeMs() + (((long) totalMin(a)) * 60000)) + 60000;
    }
}
