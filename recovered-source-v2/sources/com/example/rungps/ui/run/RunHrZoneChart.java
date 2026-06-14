package com.example.rungps.ui.run;

import com.example.rungps.analytics.HeartRateZones;
import com.example.rungps.data.RunHrSampleEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: RunHrZoneChart.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0002\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/ui/run/RunHrZoneChart;", "", "<init>", "()V", "slices", "", "Lcom/example/rungps/ui/run/HrZoneSlice;", "samples", "Lcom/example/rungps/data/RunHrSampleEntity;", "ageYears", "", "(Ljava/util/List;Ljava/lang/Integer;)Ljava/util/List;", "avgBpm", "(Ljava/util/List;)Ljava/lang/Integer;", "maxBpm", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunHrZoneChart {
    public static final int $stable = 0;
    public static final RunHrZoneChart INSTANCE = new RunHrZoneChart();

    private RunHrZoneChart() {
    }

    public final List<HrZoneSlice> slices(List<RunHrSampleEntity> samples, Integer ageYears) {
        int i;
        Intrinsics.checkNotNullParameter(samples, "samples");
        if (samples.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<HeartRateZones.Zone> zones = HeartRateZones.INSTANCE.zones(ageYears);
        int[] iArr = new int[zones.size()];
        Iterator<RunHrSampleEntity> it = samples.iterator();
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            HeartRateZones.Zone zoneForBpm = HeartRateZones.INSTANCE.zoneForBpm(it.next().getBpm(), ageYears);
            if (zoneForBpm != null) {
                Iterator<HeartRateZones.Zone> it2 = zones.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        i = -1;
                        break;
                    }
                    if (it2.next().getNumber() == zoneForBpm.getNumber()) {
                        break;
                    }
                    i++;
                }
                if (i >= 0) {
                    iArr[i] = iArr[i] + 1;
                }
            }
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(ArraysKt.sum(iArr), 1);
        List<HeartRateZones.Zone> list = zones;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            int i3 = iArr[i];
            arrayList.add(new HrZoneSlice((HeartRateZones.Zone) obj, i3, i3 / coerceAtLeast));
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((HrZoneSlice) obj2).getSampleCount() > 0) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final Integer avgBpm(List<RunHrSampleEntity> samples) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        List<RunHrSampleEntity> list = samples;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((RunHrSampleEntity) it.next()).getBpm()));
        }
        Double valueOf = Double.valueOf(CollectionsKt.averageOfInt(arrayList));
        if (Double.isNaN(valueOf.doubleValue())) {
            valueOf = null;
        }
        if (valueOf != null) {
            return Integer.valueOf(MathKt.roundToInt(valueOf.doubleValue()));
        }
        return null;
    }

    public final Integer maxBpm(List<RunHrSampleEntity> samples) {
        Integer num;
        Intrinsics.checkNotNullParameter(samples, "samples");
        Iterator<T> it = samples.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((RunHrSampleEntity) it.next()).getBpm());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((RunHrSampleEntity) it.next()).getBpm());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        return num;
    }
}
