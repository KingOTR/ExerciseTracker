package com.example.rungps.health;

import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.example.rungps.data.GymSessionEntity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.LongIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.LongRange;
import kotlin.ranges.RangesKt;

/* compiled from: GymAttendance.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fJ$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nJ\u001e\u0010\u0010\u001a\u00020\f2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nJ\u001e\u0010\u0011\u001a\u00020\u00122\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nJ\u000e\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u0005¨\u0006\u0015"}, d2 = {"Lcom/example/rungps/health/GymAttendance;", "", "<init>", "()V", "compute", "Lcom/example/rungps/health/GymAttendanceStats;", "sessions", "", "Lcom/example/rungps/data/GymSessionEntity;", "zone", "Ljava/time/ZoneId;", "maxWindowDays", "", "gymDates", "", "Ljava/time/LocalDate;", "computeStreak", "computeTrend", "", "daysToGoal", "stats", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymAttendance {
    public static final int $stable = 0;
    public static final GymAttendance INSTANCE = new GymAttendance();

    private GymAttendance() {
    }

    public static /* synthetic */ GymAttendanceStats compute$default(GymAttendance gymAttendance, List list, ZoneId zoneId, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        if ((i2 & 4) != 0) {
            i = 30;
        }
        return gymAttendance.compute(list, zoneId, i);
    }

    public final GymAttendanceStats compute(List<GymSessionEntity> sessions, ZoneId zone, int maxWindowDays) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sessions) {
            if (((GymSessionEntity) obj).getEndedAtMs() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return new GymAttendanceStats(0, 0, 0, "No finished sessions yet");
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            arrayList4.add(Instant.ofEpochMilli(((GymSessionEntity) it.next()).getStartedAtMs()).atZone(zone).toLocalDate());
        }
        Set set = CollectionsKt.toSet(arrayList4);
        LocalDate localDate = (LocalDate) CollectionsKt.minOrNull((Iterable) set);
        if (localDate == null) {
            localDate = LocalDate.now(zone);
        }
        LocalDate now = LocalDate.now(zone);
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ChronoUnit.DAYS.between(localDate, now), 0) + 1;
        int coerceAtLeast2 = RangesKt.coerceAtLeast(Math.min(maxWindowDays, coerceAtLeast), 1);
        long j = coerceAtLeast2;
        int i = 0;
        for (long j2 = 0; j2 < j; j2++) {
            if (set.contains(now.minusDays(j2))) {
                i++;
            }
        }
        int coerceIn = RangesKt.coerceIn((i * 100) / coerceAtLeast2, 0, 100);
        return new GymAttendanceStats(i, coerceAtLeast2, coerceIn, coerceAtLeast < 14 ? "Gym " + i + DomExceptionUtils.SEPARATOR + coerceAtLeast2 + " days (" + coerceIn + "%) · tracking " + coerceAtLeast + "d" : "Gym " + i + DomExceptionUtils.SEPARATOR + coerceAtLeast2 + " days (" + coerceIn + "%)");
    }

    public static /* synthetic */ Set gymDates$default(GymAttendance gymAttendance, List list, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return gymAttendance.gymDates(list, zoneId);
    }

    public final Set<LocalDate> gymDates(List<GymSessionEntity> sessions, ZoneId zone) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sessions) {
            if (((GymSessionEntity) obj).getEndedAtMs() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(Instant.ofEpochMilli(((GymSessionEntity) it.next()).getStartedAtMs()).atZone(zone).toLocalDate());
        }
        return CollectionsKt.toSet(arrayList3);
    }

    public static /* synthetic */ int computeStreak$default(GymAttendance gymAttendance, List list, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return gymAttendance.computeStreak(list, zoneId);
    }

    public final int computeStreak(List<GymSessionEntity> sessions, ZoneId zone) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(zone, "zone");
        Set<LocalDate> gymDates = gymDates(sessions, zone);
        int i = 0;
        if (gymDates.isEmpty()) {
            return 0;
        }
        LocalDate now = LocalDate.now(zone);
        if (!gymDates.contains(now)) {
            now = now.minusDays(1L);
        }
        while (gymDates.contains(now)) {
            i++;
            now = now.minusDays(1L);
        }
        return i;
    }

    public static /* synthetic */ String computeTrend$default(GymAttendance gymAttendance, List list, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return gymAttendance.computeTrend(list, zoneId);
    }

    public final String computeTrend(List<GymSessionEntity> sessions, ZoneId zone) {
        int i;
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(zone, "zone");
        Set<LocalDate> gymDates = gymDates(sessions, zone);
        if (gymDates.isEmpty()) {
            return "";
        }
        LocalDate now = LocalDate.now(zone);
        Iterable longRange = new LongRange(0L, 6L);
        int i2 = 0;
        if ((longRange instanceof Collection) && ((Collection) longRange).isEmpty()) {
            i = 0;
        } else {
            Iterator it = longRange.iterator();
            i = 0;
            while (it.hasNext()) {
                if (gymDates.contains(now.minusDays(((LongIterator) it).nextLong())) && (i = i + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        Iterable longRange2 = new LongRange(7L, 13L);
        if (!(longRange2 instanceof Collection) || !((Collection) longRange2).isEmpty()) {
            Iterator it2 = longRange2.iterator();
            while (it2.hasNext()) {
                if (gymDates.contains(now.minusDays(((LongIterator) it2).nextLong())) && (i2 = i2 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        if (i > i2) {
            return "↑ Improving";
        }
        if (i < i2) {
            return "↓ Slowing";
        }
        return "Steady";
    }

    public final String daysToGoal(GymAttendanceStats stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        if (stats.getWindowDays() == 0) {
            return "";
        }
        if (stats.getPct() >= 100) {
            return "On track";
        }
        return RangesKt.coerceAtLeast(stats.getWindowDays() - stats.getDaysHit(), 0) + " to goal";
    }
}
