package com.example.rungps.analytics;

import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.GymSetEntity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.collections.MapsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

/* compiled from: GymWeeklyVolume.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007JH\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\u0018\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\t0\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0007¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/analytics/GymWeeklyVolume;", "", "<init>", "()V", "estimatedAverageWeeklyTonnage", "Lkotlin/Pair;", "", "", "bars", "", "Lcom/example/rungps/analytics/WeekVolumeBar;", "maxWeeks", "compute", "sessions", "Lcom/example/rungps/data/GymSessionEntity;", "setsBySessionId", "", "", "Lcom/example/rungps/data/GymSetEntity;", "zone", "Ljava/time/ZoneId;", "weeks", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymWeeklyVolume {
    public static final int $stable = 0;
    public static final GymWeeklyVolume INSTANCE = new GymWeeklyVolume();

    private GymWeeklyVolume() {
    }

    public static /* synthetic */ Pair estimatedAverageWeeklyTonnage$default(GymWeeklyVolume gymWeeklyVolume, List list, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 4;
        }
        return gymWeeklyVolume.estimatedAverageWeeklyTonnage(list, i);
    }

    public final Pair<Double, Integer> estimatedAverageWeeklyTonnage(List<WeekVolumeBar> bars, int maxWeeks) {
        Intrinsics.checkNotNullParameter(bars, "bars");
        ArrayList arrayList = new ArrayList();
        for (Object obj : bars) {
            if (((WeekVolumeBar) obj).getTonnage() > 0.0d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return null;
        }
        int min = Math.min(arrayList2.size(), RangesKt.coerceAtLeast(maxWeeks, 1));
        List takeLast = CollectionsKt.takeLast(arrayList2, min);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(takeLast, 10));
        Iterator it = takeLast.iterator();
        while (it.hasNext()) {
            arrayList3.add(Double.valueOf(((WeekVolumeBar) it.next()).getTonnage()));
        }
        return TuplesKt.to(Double.valueOf(CollectionsKt.averageOfDouble(arrayList3)), Integer.valueOf(min));
    }

    public static /* synthetic */ List compute$default(GymWeeklyVolume gymWeeklyVolume, List list, Map map, ZoneId zoneId, int i, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        if ((i2 & 8) != 0) {
            i = 8;
        }
        return gymWeeklyVolume.compute(list, map, zoneId, i);
    }

    public final List<WeekVolumeBar> compute(List<GymSessionEntity> sessions, Map<Long, ? extends List<GymSetEntity>> setsBySessionId, ZoneId zone, int weeks) {
        String format;
        List list;
        Intrinsics.checkNotNullParameter(sessions, "sessions");
        Intrinsics.checkNotNullParameter(setsBySessionId, "setsBySessionId");
        Intrinsics.checkNotNullParameter(zone, "zone");
        ArrayList arrayList = new ArrayList();
        for (Object obj : sessions) {
            if (((GymSessionEntity) obj).getEndedAtMs() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList<GymSessionEntity> arrayList2 = arrayList;
        if (arrayList2.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        WeekFields of = WeekFields.of(Locale.getDefault());
        LocalDate with = Instant.now().atZone(zone).toLocalDate().with(of.dayOfWeek(), 1L);
        IntProgression downTo = RangesKt.downTo(weeks - 1, 0);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(downTo, 10)), 16));
        Iterator<Integer> it = downTo.iterator();
        while (it.hasNext()) {
            Pair pair = TuplesKt.to(with.minusWeeks(((IntIterator) it).nextInt()), new ArrayList());
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        for (GymSessionEntity gymSessionEntity : arrayList2) {
            Long endedAtMs = gymSessionEntity.getEndedAtMs();
            if (endedAtMs != null && (list = (List) linkedHashMap.get(Instant.ofEpochMilli(endedAtMs.longValue()).atZone(zone).toLocalDate().with(of.dayOfWeek(), 1L))) != null) {
                list.add(gymSessionEntity);
            }
        }
        List<Map.Entry> sortedWith = CollectionsKt.sortedWith(linkedHashMap.entrySet(), new Comparator() { // from class: com.example.rungps.analytics.GymWeeklyVolume$compute$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((LocalDate) ((Map.Entry) t).getKey(), (LocalDate) ((Map.Entry) t2).getKey());
            }
        });
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        for (Map.Entry entry : sortedWith) {
            LocalDate localDate = (LocalDate) entry.getKey();
            List list2 = (List) entry.getValue();
            Iterator it2 = list2.iterator();
            double d = 0.0d;
            while (it2.hasNext()) {
                List<GymSetEntity> list3 = setsBySessionId.get(Long.valueOf(((GymSessionEntity) it2.next()).getId()));
                if (list3 == null) {
                    list3 = CollectionsKt.emptyList();
                }
                double d2 = 0.0d;
                for (GymSetEntity gymSetEntity : list3) {
                    d2 += gymSetEntity.getWeightKg() * RangesKt.coerceAtLeast(gymSetEntity.getReps() != null ? r15.intValue() : 1, 1);
                }
                d += d2;
            }
            if (Intrinsics.areEqual(localDate, with)) {
                format = "This wk";
            } else {
                format = localDate.format(DateTimeFormatter.ofPattern("M/d", Locale.US));
            }
            Intrinsics.checkNotNull(format);
            arrayList3.add(new WeekVolumeBar(format, d, list2.size()));
        }
        return arrayList3;
    }
}
