package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.RunEntity;
import com.example.rungps.recovery.StravaRecoveryDedup;
import com.example.rungps.tracking.ActivityTypes;
import java.time.Instant;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: WeeklyActivityKm.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007JV\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00142\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u0016¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/analytics/WeeklyActivityKm;", "", "<init>", "()V", "overlapsWeek", "", "startMs", "", "endMs", "weekStartMs", "weekEndMs", "compute", "Lkotlin/Pair;", "", "localRuns", "", "Lcom/example/rungps/data/RunEntity;", "stravaSessions", "Lcom/example/rungps/analytics/WeeklyActivityKm$StravaSession;", "linkedStravaIds", "", "zone", "Ljava/time/ZoneId;", "endEpochDay", "StravaSession", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WeeklyActivityKm {
    public static final int $stable = 0;
    public static final WeeklyActivityKm INSTANCE = new WeeklyActivityKm();

    public final boolean overlapsWeek(long startMs, long endMs, long weekStartMs, long weekEndMs) {
        return endMs >= weekStartMs && startMs <= weekEndMs;
    }

    private WeeklyActivityKm() {
    }

    /* compiled from: WeeklyActivityKm.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/analytics/WeeklyActivityKm$StravaSession;", "", "id", "", "startMs", "endMs", "distanceM", "", "isBike", "", "<init>", "(JJJDZ)V", "getId", "()J", "getStartMs", "getEndMs", "getDistanceM", "()D", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StravaSession {
        public static final int $stable = 0;
        private final double distanceM;
        private final long endMs;
        private final long id;
        private final boolean isBike;
        private final long startMs;

        /* renamed from: component1, reason: from getter */
        public final long getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* renamed from: component3, reason: from getter */
        public final long getEndMs() {
            return this.endMs;
        }

        /* renamed from: component4, reason: from getter */
        public final double getDistanceM() {
            return this.distanceM;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getIsBike() {
            return this.isBike;
        }

        public final StravaSession copy(long id, long startMs, long endMs, double distanceM, boolean isBike) {
            return new StravaSession(id, startMs, endMs, distanceM, isBike);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StravaSession)) {
                return false;
            }
            StravaSession stravaSession = (StravaSession) other;
            return this.id == stravaSession.id && this.startMs == stravaSession.startMs && this.endMs == stravaSession.endMs && Double.compare(this.distanceM, stravaSession.distanceM) == 0 && this.isBike == stravaSession.isBike;
        }

        public int hashCode() {
            return (((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.startMs)) * 31) + Long.hashCode(this.endMs)) * 31) + Double.hashCode(this.distanceM)) * 31) + Boolean.hashCode(this.isBike);
        }

        public String toString() {
            return "StravaSession(id=" + this.id + ", startMs=" + this.startMs + ", endMs=" + this.endMs + ", distanceM=" + this.distanceM + ", isBike=" + this.isBike + ")";
        }

        public StravaSession(long j, long j2, long j3, double d, boolean z) {
            this.id = j;
            this.startMs = j2;
            this.endMs = j3;
            this.distanceM = d;
            this.isBike = z;
        }

        public final long getId() {
            return this.id;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public final long getEndMs() {
            return this.endMs;
        }

        public final double getDistanceM() {
            return this.distanceM;
        }

        public final boolean isBike() {
            return this.isBike;
        }
    }

    public final Pair<Double, Double> compute(List<RunEntity> localRuns, List<StravaSession> stravaSessions, Set<Long> linkedStravaIds, long weekStartMs, long weekEndMs, ZoneId zone) {
        Intrinsics.checkNotNullParameter(localRuns, "localRuns");
        Intrinsics.checkNotNullParameter(stravaSessions, "stravaSessions");
        Intrinsics.checkNotNullParameter(linkedStravaIds, "linkedStravaIds");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ArrayList arrayList = new ArrayList();
        for (Object obj : localRuns) {
            if (((RunEntity) obj).getEndedAtMs() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<RunEntity> arrayList2 = arrayList;
        double d = 0.0d;
        double d2 = 0.0d;
        for (RunEntity runEntity : arrayList2) {
            Long endedAtMs = runEntity.getEndedAtMs();
            Intrinsics.checkNotNull(endedAtMs);
            if (overlapsWeek(runEntity.getStartedAtMs(), endedAtMs.longValue(), weekStartMs, weekEndMs)) {
                double coerceAtLeast = RangesKt.coerceAtLeast(runEntity.getTotalDistanceM() / 1000.0d, 0.0d);
                if (ActivityTypes.INSTANCE.isBike(runEntity.getActivityType())) {
                    d2 += coerceAtLeast;
                } else {
                    d += coerceAtLeast;
                }
            }
        }
        double d3 = d;
        double d4 = d2;
        for (StravaSession stravaSession : stravaSessions) {
            if (!linkedStravaIds.contains(Long.valueOf(stravaSession.getId())) && overlapsWeek(stravaSession.getStartMs(), stravaSession.getEndMs(), weekStartMs, weekEndMs) && !StravaRecoveryDedup.INSTANCE.matchesLocalRun(stravaSession.getStartMs(), stravaSession.getEndMs(), stravaSession.getDistanceM(), stravaSession.isBike(), arrayList2, zone)) {
                double coerceAtLeast2 = RangesKt.coerceAtLeast(stravaSession.getDistanceM() / 1000.0d, 0.0d);
                if (stravaSession.isBike()) {
                    d4 += coerceAtLeast2;
                } else {
                    d3 += coerceAtLeast2;
                }
            }
        }
        return TuplesKt.to(Double.valueOf(d3), Double.valueOf(d4));
    }

    public static /* synthetic */ long endEpochDay$default(WeeklyActivityKm weeklyActivityKm, long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return weeklyActivityKm.endEpochDay(j, zoneId);
    }

    public final long endEpochDay(long endMs, ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        return Instant.ofEpochMilli(endMs).atZone(zone).toLocalDate().toEpochDay();
    }
}
