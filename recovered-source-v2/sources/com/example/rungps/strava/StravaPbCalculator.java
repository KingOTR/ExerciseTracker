package com.example.rungps.strava;

import com.example.rungps.data.StravaPbEntity;
import com.example.rungps.data.StravaPbKind;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: StravaActivitiesApi.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\"\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0011\u001a\u00020\u0012J\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0011\u001a\u00020\u0012JZ\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00052\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00072\u0018\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u00052\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00190\u0018H\u0002R#\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/strava/StravaPbCalculator;", "", "<init>", "()V", "runStandards", "", "Lkotlin/Pair;", "", "", "getRunStandards", "()Ljava/util/List;", "rideStandards", "getRideStandards", "computeRuns", "Lcom/example/rungps/data/StravaPbEntity;", "activities", "Lcom/example/rungps/strava/StravaActivityJson;", "syncedAtMs", "", "computeRides", "compute", "activityKind", "standards", "include", "Lkotlin/Function1;", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaPbCalculator {
    public static final int $stable;
    public static final StravaPbCalculator INSTANCE = new StravaPbCalculator();
    private static final List<Pair<String, Double>> rideStandards;
    private static final List<Pair<String, Double>> runStandards;

    private StravaPbCalculator() {
    }

    public final List<Pair<String, Double>> getRunStandards() {
        return runStandards;
    }

    static {
        Double valueOf = Double.valueOf(10000.0d);
        runStandards = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("1 km", Double.valueOf(1000.0d)), TuplesKt.to("3 km", Double.valueOf(3000.0d)), TuplesKt.to("5 km", Double.valueOf(5000.0d)), TuplesKt.to("10 km", valueOf), TuplesKt.to("12 km", Double.valueOf(12000.0d)), TuplesKt.to("Half marathon", Double.valueOf(21097.5d)), TuplesKt.to("Marathon", Double.valueOf(42195.0d))});
        rideStandards = CollectionsKt.listOf((Object[]) new Pair[]{TuplesKt.to("10 km", valueOf), TuplesKt.to("20 km", Double.valueOf(20000.0d)), TuplesKt.to("40 km", Double.valueOf(40000.0d)), TuplesKt.to("50 km", Double.valueOf(50000.0d)), TuplesKt.to("100 km", Double.valueOf(100000.0d))});
        $stable = 8;
    }

    public final List<Pair<String, Double>> getRideStandards() {
        return rideStandards;
    }

    public final List<StravaPbEntity> computeRuns(List<StravaActivityJson> activities, long syncedAtMs) {
        Intrinsics.checkNotNullParameter(activities, "activities");
        return compute(activities, syncedAtMs, "RUN", runStandards, new Function1() { // from class: com.example.rungps.strava.StravaPbCalculator$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean computeRuns$lambda$0;
                computeRuns$lambda$0 = StravaPbCalculator.computeRuns$lambda$0((StravaActivityJson) obj);
                return Boolean.valueOf(computeRuns$lambda$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeRuns$lambda$0(StravaActivityJson it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StravaActivityTypes.INSTANCE.isStravaRun(it.getType(), it.getSportType());
    }

    public final List<StravaPbEntity> computeRides(List<StravaActivityJson> activities, long syncedAtMs) {
        Intrinsics.checkNotNullParameter(activities, "activities");
        return compute(activities, syncedAtMs, StravaPbKind.RIDE, rideStandards, new Function1() { // from class: com.example.rungps.strava.StravaPbCalculator$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                boolean computeRides$lambda$1;
                computeRides$lambda$1 = StravaPbCalculator.computeRides$lambda$1((StravaActivityJson) obj);
                return Boolean.valueOf(computeRides$lambda$1);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeRides$lambda$1(StravaActivityJson it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return StravaActivityTypes.INSTANCE.isStravaBike(it.getType(), it.getSportType());
    }

    public final List<StravaPbEntity> compute(List<StravaActivityJson> activities, long syncedAtMs) {
        Intrinsics.checkNotNullParameter(activities, "activities");
        return computeRuns(activities, syncedAtMs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v9 */
    private final List<StravaPbEntity> compute(List<StravaActivityJson> activities, long syncedAtMs, String activityKind, List<Pair<String, Double>> standards, Function1<? super StravaActivityJson, Boolean> include) {
        Object next;
        ArrayList arrayList;
        Iterator<Pair<String, Double>> it;
        double d;
        double d2;
        StravaActivityJson next2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : activities) {
            if (include.invoke(obj).booleanValue()) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList();
        Iterator<Pair<String, Double>> it2 = standards.iterator();
        while (it2.hasNext()) {
            Pair<String, Double> next3 = it2.next();
            String component1 = next3.component1();
            double doubleValue = next3.component2().doubleValue();
            double d3 = 0.98d * doubleValue;
            double d4 = 1.12d * doubleValue;
            ArrayList arrayList5 = arrayList3;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj2 : arrayList5) {
                StravaActivityJson stravaActivityJson = (StravaActivityJson) obj2;
                int effectiveMovingSec = StravaActivitiesApi.INSTANCE.effectiveMovingSec(stravaActivityJson);
                double distance = stravaActivityJson.getDistance();
                if (d3 <= distance && distance <= d4 && effectiveMovingSec > 0) {
                    arrayList6.add(obj2);
                }
            }
            Iterator it3 = arrayList6.iterator();
            if (it3.hasNext()) {
                next = it3.next();
                if (it3.hasNext()) {
                    int effectiveMovingSec2 = StravaActivitiesApi.INSTANCE.effectiveMovingSec((StravaActivityJson) next);
                    while (true) {
                        Object next4 = it3.next();
                        arrayList = arrayList3;
                        int effectiveMovingSec3 = StravaActivitiesApi.INSTANCE.effectiveMovingSec((StravaActivityJson) next4);
                        if (effectiveMovingSec2 > effectiveMovingSec3) {
                            effectiveMovingSec2 = effectiveMovingSec3;
                            next = next4;
                        }
                        if (!it3.hasNext()) {
                            break;
                        }
                        arrayList3 = arrayList;
                    }
                } else {
                    arrayList = arrayList3;
                }
            } else {
                arrayList = arrayList3;
                next = null;
            }
            StravaActivityJson stravaActivityJson2 = (StravaActivityJson) next;
            if (stravaActivityJson2 == null) {
                ArrayList arrayList7 = new ArrayList();
                for (Object obj3 : arrayList5) {
                    StravaActivityJson stravaActivityJson3 = (StravaActivityJson) obj3;
                    int effectiveMovingSec4 = StravaActivitiesApi.INSTANCE.effectiveMovingSec(stravaActivityJson3);
                    if (stravaActivityJson3.getDistance() >= d3 && effectiveMovingSec4 > 0) {
                        arrayList7.add(obj3);
                    }
                }
                Iterator it4 = arrayList7.iterator();
                if (it4.hasNext()) {
                    next2 = it4.next();
                    if (it4.hasNext()) {
                        d2 = d4;
                        long effectiveMovingSec5 = (long) (StravaActivitiesApi.INSTANCE.effectiveMovingSec(r11) * (doubleValue / RangesKt.coerceAtLeast(((StravaActivityJson) next2).getDistance(), 1.0d)));
                        Object obj4 = next2;
                        while (true) {
                            Object next5 = it4.next();
                            Object obj5 = obj4;
                            it = it2;
                            d = d3;
                            long effectiveMovingSec6 = (long) (StravaActivitiesApi.INSTANCE.effectiveMovingSec(r12) * (doubleValue / RangesKt.coerceAtLeast(((StravaActivityJson) next5).getDistance(), 1.0d)));
                            if (effectiveMovingSec5 > effectiveMovingSec6) {
                                effectiveMovingSec5 = effectiveMovingSec6;
                                next2 = next5;
                            } else {
                                next2 = obj5;
                            }
                            if (!it4.hasNext()) {
                                break;
                            }
                            it2 = it;
                            d3 = d;
                            obj4 = next2;
                        }
                    } else {
                        it = it2;
                        d = d3;
                        d2 = d4;
                    }
                } else {
                    it = it2;
                    d = d3;
                    d2 = d4;
                    next2 = 0;
                }
                stravaActivityJson2 = next2;
                if (stravaActivityJson2 == null) {
                    arrayList3 = arrayList;
                    it2 = it;
                }
            } else {
                it = it2;
                d = d3;
                d2 = d4;
            }
            int effectiveMovingSec7 = StravaActivitiesApi.INSTANCE.effectiveMovingSec(stravaActivityJson2);
            double distance2 = stravaActivityJson2.getDistance();
            arrayList4.add(new StravaPbEntity(activityKind, component1, doubleValue, RangesKt.coerceAtLeast((d > distance2 || distance2 > d2) ? (long) (effectiveMovingSec7 * (doubleValue / RangesKt.coerceAtLeast(stravaActivityJson2.getDistance(), 1.0d))) : effectiveMovingSec7, 1L), stravaActivityJson2.getId(), stravaActivityJson2.getName(), stravaActivityJson2.getStartDate(), syncedAtMs));
            arrayList3 = arrayList;
            it2 = it;
        }
        return arrayList4;
    }
}
