package com.example.rungps.analytics;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.core.domain.analytics.CalendarWeekBounds;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.data.SoccerSessionEntity;
import com.example.rungps.recovery.SoccerSessionDedup;
import com.example.rungps.recovery.StepLoadScore;
import com.example.rungps.tracking.ActivityTypes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: CombinedLoadScore.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001+B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fJd\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u00052\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00152\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001a\u001a\u00020\fJl\u0010\u001b\u001a\u00020\u000f2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\t2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\t2\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\t0\u00152\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u001e\u001a\u00020\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u0005J2\u0010 \u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\b\b\u0002\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u0011\u001a\u00020\u0005Jd\u0010\"\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\u0006\u0010%\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u00052\u0006\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010\u001a\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/example/rungps/analytics/CombinedLoadScore;", "", "<init>", "()V", "GYM_KG_PER_POINT", "", "soccerEffectiveMinutes7d", "", "sessions", "", "Lcom/example/rungps/data/SoccerSessionEntity;", "weekStartMs", "", "nowMs", "computeFromWeeklyKm", "Lcom/example/rungps/analytics/CombinedLoadSnapshot;", "runKm7d", "rideKm7d", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "setsBySession", "", "Lcom/example/rungps/data/GymSetEntity;", "soccerMin7d", "sportLabel", "", "steps7d", "compute", "runs", "Lcom/example/rungps/data/RunEntity;", "stravaRunKm7d", "stravaRideKm7d", "fromTotals", "gymTonnage7d", "buildSnapshot", "runKm", "rideKm", "gymTon", "runPts", "ridePts", "gymPts", "soccerPts", "stepPts", "Quintuple", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CombinedLoadScore {
    public static final int $stable = 0;
    public static final double GYM_KG_PER_POINT = 250.0d;
    public static final CombinedLoadScore INSTANCE = new CombinedLoadScore();

    private CombinedLoadScore() {
    }

    public static /* synthetic */ int soccerEffectiveMinutes7d$default(CombinedLoadScore combinedLoadScore, List list, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = System.currentTimeMillis();
        }
        return combinedLoadScore.soccerEffectiveMinutes7d(list, j, j2);
    }

    public final int soccerEffectiveMinutes7d(List<SoccerSessionEntity> sessions, long weekStartMs, long nowMs) {
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        List<SoccerSessionEntity> dedupe = SoccerSessionDedup.INSTANCE.dedupe(sessions);
        ArrayList<SoccerSessionEntity> arrayList = new ArrayList();
        for (Object obj : dedupe) {
            long startTimeMs = ((SoccerSessionEntity) obj).getStartTimeMs();
            if (weekStartMs <= startTimeMs && startTimeMs <= nowMs) {
                arrayList.add(obj);
            }
        }
        int i = 0;
        for (SoccerSessionEntity soccerSessionEntity : arrayList) {
            int coerceAtLeast = RangesKt.coerceAtLeast(soccerSessionEntity.getWarmupMin() + soccerSessionEntity.getPlayMin(), 0);
            i += coerceAtLeast == 0 ? 0 : MathKt.roundToInt(coerceAtLeast * (RangesKt.coerceIn(soccerSessionEntity.getIntensity(), 1, 10) / 5.0d));
        }
        return i;
    }

    public final CombinedLoadSnapshot computeFromWeeklyKm(double runKm7d, double rideKm7d, List<GymSessionEntity> gymSessions, Map<Long, ? extends List<GymSetEntity>> setsBySession, int soccerMin7d, String sportLabel, long nowMs, long steps7d) {
        Intrinsics.checkNotNullParameter(gymSessions, "gymSessions");
        Intrinsics.checkNotNullParameter(setsBySession, "setsBySession");
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        long weekStartMs$default = CalendarWeekBounds.weekStartMs$default(CalendarWeekBounds.INSTANCE, nowMs, null, 2, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : gymSessions) {
            Long endedAtMs = ((GymSessionEntity) obj).getEndedAtMs();
            long longValue = endedAtMs != null ? endedAtMs.longValue() : 0L;
            if (weekStartMs$default <= longValue && longValue <= nowMs) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            List<GymSetEntity> list = setsBySession.get(Long.valueOf(((GymSessionEntity) it.next()).getId()));
            if (list == null) {
                list = CollectionsKt.emptyList();
            }
            double d2 = 0.0d;
            for (GymSetEntity gymSetEntity : list) {
                d2 += gymSetEntity.getWeightKg() * RangesKt.coerceAtLeast(gymSetEntity.getReps() != null ? r7.intValue() : 1, 1);
            }
            d += d2;
        }
        return buildSnapshot(runKm7d, rideKm7d, d, soccerMin7d, sportLabel, RangesKt.coerceAtMost(8.0d * runKm7d, 120.0d), RangesKt.coerceAtMost(6.0d * rideKm7d, 80.0d), RangesKt.coerceAtMost(d / 250.0d, 120.0d), RangesKt.coerceAtMost(soccerMin7d / 15.0d, 60.0d), StepLoadScore.INSTANCE.loadPoints(steps7d), steps7d);
    }

    public final CombinedLoadSnapshot compute(List<RunEntity> runs, List<GymSessionEntity> gymSessions, Map<Long, ? extends List<GymSetEntity>> setsBySession, int soccerMin7d, String sportLabel, long nowMs, double stravaRunKm7d, double stravaRideKm7d) {
        double d;
        Pair pair;
        ArrayList arrayList;
        double d2;
        Intrinsics.checkNotNullParameter(runs, "runs");
        Intrinsics.checkNotNullParameter(gymSessions, "gymSessions");
        Intrinsics.checkNotNullParameter(setsBySession, "setsBySession");
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        long weekStartMs$default = CalendarWeekBounds.weekStartMs$default(CalendarWeekBounds.INSTANCE, nowMs, null, 2, null);
        double d3 = 0.0d;
        if (stravaRunKm7d > 0.0d || stravaRideKm7d > 0.0d) {
            List<RunEntity> list = runs;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : list) {
                RunEntity runEntity = (RunEntity) obj;
                Long endedAtMs = runEntity.getEndedAtMs();
                if (endedAtMs != null) {
                    long longValue = endedAtMs.longValue();
                    if (!ActivityTypes.INSTANCE.isBike(runEntity.getActivityType())) {
                        arrayList = arrayList2;
                        d2 = d3;
                        if (WeeklyActivityKm.INSTANCE.overlapsWeek(runEntity.getStartedAtMs(), longValue, weekStartMs$default, nowMs)) {
                            arrayList.add(obj);
                        }
                        d3 = d2;
                        arrayList2 = arrayList;
                    }
                }
                arrayList = arrayList2;
                d2 = d3;
                d3 = d2;
                arrayList2 = arrayList;
            }
            double d4 = d3;
            Iterator it = arrayList2.iterator();
            double d5 = d4;
            while (it.hasNext()) {
                d5 += RangesKt.coerceAtLeast(((RunEntity) it.next()).getTotalDistanceM() / 1000.0d, d4);
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                RunEntity runEntity2 = (RunEntity) obj2;
                Long endedAtMs2 = runEntity2.getEndedAtMs();
                if (endedAtMs2 != null) {
                    long longValue2 = endedAtMs2.longValue();
                    if (ActivityTypes.INSTANCE.isBike(runEntity2.getActivityType()) && WeeklyActivityKm.INSTANCE.overlapsWeek(runEntity2.getStartedAtMs(), longValue2, weekStartMs$default, nowMs)) {
                        arrayList3.add(obj2);
                    }
                }
            }
            Iterator it2 = arrayList3.iterator();
            double d6 = 0.0d;
            while (it2.hasNext()) {
                d6 += RangesKt.coerceAtLeast(((RunEntity) it2.next()).getTotalDistanceM() / 1000.0d, 0.0d);
            }
            d = 0.0d;
            pair = TuplesKt.to(Double.valueOf(d5 + stravaRunKm7d), Double.valueOf(d6 + stravaRideKm7d));
        } else {
            List<RunEntity> list2 = runs;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : list2) {
                RunEntity runEntity3 = (RunEntity) obj3;
                Long endedAtMs3 = runEntity3.getEndedAtMs();
                if (endedAtMs3 != null) {
                    long longValue3 = endedAtMs3.longValue();
                    if (!ActivityTypes.INSTANCE.isBike(runEntity3.getActivityType()) && weekStartMs$default <= longValue3 && longValue3 <= nowMs) {
                        arrayList4.add(obj3);
                    }
                }
            }
            Iterator it3 = arrayList4.iterator();
            double d7 = 0.0d;
            while (it3.hasNext()) {
                d7 += RangesKt.coerceAtLeast(((RunEntity) it3.next()).getTotalDistanceM() / 1000.0d, 0.0d);
            }
            ArrayList arrayList5 = new ArrayList();
            for (Object obj4 : list2) {
                RunEntity runEntity4 = (RunEntity) obj4;
                Long endedAtMs4 = runEntity4.getEndedAtMs();
                if (endedAtMs4 != null) {
                    long longValue4 = endedAtMs4.longValue();
                    if (ActivityTypes.INSTANCE.isBike(runEntity4.getActivityType()) && weekStartMs$default <= longValue4 && longValue4 <= nowMs) {
                        arrayList5.add(obj4);
                    }
                }
            }
            Iterator it4 = arrayList5.iterator();
            double d8 = 0.0d;
            while (it4.hasNext()) {
                d8 += RangesKt.coerceAtLeast(((RunEntity) it4.next()).getTotalDistanceM() / 1000.0d, 0.0d);
            }
            pair = TuplesKt.to(Double.valueOf(d7), Double.valueOf(d8));
            d = 0.0d;
        }
        double doubleValue = ((Number) pair.component1()).doubleValue();
        double doubleValue2 = ((Number) pair.component2()).doubleValue();
        double d9 = d;
        ArrayList arrayList6 = new ArrayList();
        for (Object obj5 : gymSessions) {
            Long endedAtMs5 = ((GymSessionEntity) obj5).getEndedAtMs();
            long longValue5 = endedAtMs5 != null ? endedAtMs5.longValue() : 0L;
            if (weekStartMs$default <= longValue5 && longValue5 <= nowMs) {
                arrayList6.add(obj5);
            }
        }
        Iterator it5 = arrayList6.iterator();
        double d10 = d9;
        while (it5.hasNext()) {
            List<GymSetEntity> list3 = setsBySession.get(Long.valueOf(((GymSessionEntity) it5.next()).getId()));
            if (list3 == null) {
                list3 = CollectionsKt.emptyList();
            }
            double d11 = d9;
            for (GymSetEntity gymSetEntity : list3) {
                d11 += gymSetEntity.getWeightKg() * RangesKt.coerceAtLeast(gymSetEntity.getReps() != null ? r15.intValue() : 1, 1);
            }
            d10 += d11;
            d9 = 0.0d;
        }
        return buildSnapshot(doubleValue, doubleValue2, d10, soccerMin7d, sportLabel, RangesKt.coerceAtMost(8.0d * doubleValue, 120.0d), RangesKt.coerceAtMost(6.0d * doubleValue2, 80.0d), RangesKt.coerceAtMost(d10 / 250.0d, 120.0d), RangesKt.coerceAtMost(soccerMin7d / 15.0d, 60.0d), StepLoadScore.INSTANCE.loadPoints(0L), 0L);
    }

    public final CombinedLoadSnapshot fromTotals(double runKm7d, double gymTonnage7d, int soccerMin7d, String sportLabel, double rideKm7d) {
        Intrinsics.checkNotNullParameter(sportLabel, "sportLabel");
        return buildSnapshot(runKm7d, rideKm7d, gymTonnage7d, soccerMin7d, sportLabel, RangesKt.coerceAtMost(8.0d * runKm7d, 120.0d), RangesKt.coerceAtMost(6.0d * rideKm7d, 80.0d), RangesKt.coerceAtMost(gymTonnage7d / 250.0d, 120.0d), RangesKt.coerceAtMost(soccerMin7d / 15.0d, 60.0d), StepLoadScore.INSTANCE.loadPoints(0L), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CombinedLoadSnapshot buildSnapshot(double runKm, double rideKm, double gymTon, int soccerMin7d, String sportLabel, double runPts, double ridePts, double gymPts, double soccerPts, double stepPts, long steps7d) {
        String str;
        Quintuple quintuple;
        double d = runPts + ridePts + gymPts + soccerPts + stepPts;
        int coerceIn = RangesKt.coerceIn(MathKt.roundToInt(d), 0, 100);
        if (coerceIn >= 75) {
            str = "High load week";
        } else if (coerceIn >= 45) {
            str = "Moderate load";
        } else if (coerceIn >= 20) {
            str = "Light week";
        } else {
            str = "Recovery-friendly";
        }
        String str2 = str;
        StringBuilder sb = new StringBuilder();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "%.1f km run", Arrays.copyOf(new Object[]{Double.valueOf(runKm)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        sb.append(format);
        if (rideKm > 0.01d) {
            sb.append(" · ");
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.US, "%.1f km ride", Arrays.copyOf(new Object[]{Double.valueOf(rideKm)}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            sb.append(format2);
        }
        sb.append(" · ");
        StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
        String format3 = String.format(Locale.US, "%.0f kg gym volume", Arrays.copyOf(new Object[]{Double.valueOf(gymTon)}, 1));
        Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
        sb.append(format3);
        if (soccerMin7d > 0) {
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            String lowerCase = sportLabel.toLowerCase(US);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            sb.append(" · " + soccerMin7d + " min " + lowerCase + " (RPE-weighted)");
        }
        String detailLine = StepLoadScore.INSTANCE.detailLine(steps7d);
        if (detailLine != null) {
            sb.append(" · " + detailLine);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        if (d <= 0.0d) {
            quintuple = new Quintuple(Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f));
        } else {
            quintuple = new Quintuple(Float.valueOf((float) (runPts / d)), Float.valueOf((float) (ridePts / d)), Float.valueOf((float) (gymPts / d)), Float.valueOf((float) (soccerPts / d)), Float.valueOf((float) (stepPts / d)));
        }
        return new CombinedLoadSnapshot(coerceIn, runKm, rideKm, gymTon, soccerMin7d, str2, sb2, ((Number) quintuple.component1()).floatValue(), ((Number) quintuple.component2()).floatValue(), ((Number) quintuple.component3()).floatValue(), ((Number) quintuple.component4()).floatValue(), ((Number) quintuple.component5()).floatValue(), steps7d);
    }

    /* compiled from: CombinedLoadScore.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0004\b\u0003\u0010\u0004*\u0004\b\u0004\u0010\u00052\u00020\u0006B/\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001\u0012\u0006\u0010\t\u001a\u00028\u0002\u0012\u0006\u0010\n\u001a\u00028\u0003\u0012\u0006\u0010\u000b\u001a\u00028\u0004¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0015\u001a\u00028\u0000HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0016\u001a\u00028\u0001HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0017\u001a\u00028\u0002HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0018\u001a\u00028\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000e\u0010\u0019\u001a\u00028\u0004HÆ\u0003¢\u0006\u0002\u0010\u000fJ^\u0010\u001a\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040\u00002\b\b\u0002\u0010\u0007\u001a\u00028\u00002\b\b\u0002\u0010\b\u001a\u00028\u00012\b\b\u0002\u0010\t\u001a\u00028\u00022\b\b\u0002\u0010\n\u001a\u00028\u00032\b\b\u0002\u0010\u000b\u001a\u00028\u0004HÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\"HÖ\u0001R\u0013\u0010\u0007\u001a\u00028\u0000¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u00028\u0001¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\t\u001a\u00028\u0002¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0013\u0010\n\u001a\u00028\u0003¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0013\u0010\u000b\u001a\u00028\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f¨\u0006#"}, d2 = {"Lcom/example/rungps/analytics/CombinedLoadScore$Quintuple;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C", "D", ExifInterface.LONGITUDE_EAST, "", "first", "second", "third", "fourth", "fifth", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "getFirst", "()Ljava/lang/Object;", "Ljava/lang/Object;", "getSecond", "getThird", "getFourth", "getFifth", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Lcom/example/rungps/analytics/CombinedLoadScore$Quintuple;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class Quintuple<A, B, C, D, E> {
        private final E fifth;
        private final A first;
        private final D fourth;
        private final B second;
        private final C third;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Quintuple copy$default(Quintuple quintuple, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, Object obj6) {
            A a = obj;
            if ((i & 1) != 0) {
                a = quintuple.first;
            }
            B b = obj2;
            if ((i & 2) != 0) {
                b = quintuple.second;
            }
            B b2 = b;
            C c = obj3;
            if ((i & 4) != 0) {
                c = quintuple.third;
            }
            C c2 = c;
            D d = obj4;
            if ((i & 8) != 0) {
                d = quintuple.fourth;
            }
            D d2 = d;
            E e = obj5;
            if ((i & 16) != 0) {
                e = quintuple.fifth;
            }
            return quintuple.copy(a, b2, c2, d2, e);
        }

        public final A component1() {
            return this.first;
        }

        public final B component2() {
            return this.second;
        }

        public final C component3() {
            return this.third;
        }

        public final D component4() {
            return this.fourth;
        }

        public final E component5() {
            return this.fifth;
        }

        public final Quintuple<A, B, C, D, E> copy(A first, B second, C third, D fourth, E fifth) {
            return new Quintuple<>(first, second, third, fourth, fifth);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Quintuple)) {
                return false;
            }
            Quintuple quintuple = (Quintuple) other;
            return Intrinsics.areEqual(this.first, quintuple.first) && Intrinsics.areEqual(this.second, quintuple.second) && Intrinsics.areEqual(this.third, quintuple.third) && Intrinsics.areEqual(this.fourth, quintuple.fourth) && Intrinsics.areEqual(this.fifth, quintuple.fifth);
        }

        public int hashCode() {
            A a = this.first;
            int hashCode = (a == null ? 0 : a.hashCode()) * 31;
            B b = this.second;
            int hashCode2 = (hashCode + (b == null ? 0 : b.hashCode())) * 31;
            C c = this.third;
            int hashCode3 = (hashCode2 + (c == null ? 0 : c.hashCode())) * 31;
            D d = this.fourth;
            int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
            E e = this.fifth;
            return hashCode4 + (e != null ? e.hashCode() : 0);
        }

        public String toString() {
            return "Quintuple(first=" + this.first + ", second=" + this.second + ", third=" + this.third + ", fourth=" + this.fourth + ", fifth=" + this.fifth + ")";
        }

        public Quintuple(A a, B b, C c, D d, E e) {
            this.first = a;
            this.second = b;
            this.third = c;
            this.fourth = d;
            this.fifth = e;
        }

        public final E getFifth() {
            return this.fifth;
        }

        public final A getFirst() {
            return this.first;
        }

        public final D getFourth() {
            return this.fourth;
        }

        public final B getSecond() {
            return this.second;
        }

        public final C getThird() {
            return this.third;
        }
    }
}
