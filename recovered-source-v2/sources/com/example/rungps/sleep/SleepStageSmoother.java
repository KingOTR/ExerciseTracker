package com.example.rungps.sleep;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.Grouping;
import kotlin.collections.GroupingKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* compiled from: SleepStageSmoother.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\b"}, d2 = {"Lcom/example/rungps/sleep/SleepStageSmoother;", "", "<init>", "()V", "smooth", "", "Lcom/example/rungps/sleep/SleepStageLabel;", "labels", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepStageSmoother {
    public static final int $stable = 0;
    public static final SleepStageSmoother INSTANCE = new SleepStageSmoother();

    private SleepStageSmoother() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final List<SleepStageLabel> smooth(List<? extends SleepStageLabel> labels) {
        List listOf;
        Intrinsics.checkNotNullParameter(labels, "labels");
        if (labels.size() <= 2) {
            return labels;
        }
        IntRange indices = CollectionsKt.getIndices(labels);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(indices, 10));
        Iterator<Integer> it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (nextInt == 0) {
                listOf = CollectionsKt.listOf((Object[]) new SleepStageLabel[]{labels.get(0), labels.get(1)});
            } else {
                listOf = nextInt == CollectionsKt.getLastIndex(labels) ? CollectionsKt.listOf((Object[]) new SleepStageLabel[]{labels.get(nextInt - 1), labels.get(nextInt)}) : CollectionsKt.listOf((Object[]) new SleepStageLabel[]{labels.get(nextInt - 1), labels.get(nextInt), labels.get(nextInt + 1)});
            }
            final List list = listOf;
            Iterator it2 = GroupingKt.eachCount(new Grouping<SleepStageLabel, SleepStageLabel>() { // from class: com.example.rungps.sleep.SleepStageSmoother$smooth$lambda$2$$inlined$groupingBy$1
                @Override // kotlin.collections.Grouping
                public Iterator<SleepStageLabel> sourceIterator() {
                    return list.iterator();
                }

                @Override // kotlin.collections.Grouping
                public SleepStageLabel keyOf(SleepStageLabel element) {
                    return element;
                }
            }).entrySet().iterator();
            if (!it2.hasNext()) {
                throw new NoSuchElementException();
            }
            Object next = it2.next();
            if (it2.hasNext()) {
                int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it2.next();
                    int intValue2 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue < intValue2) {
                        next = next2;
                        intValue = intValue2;
                    }
                } while (it2.hasNext());
            }
            arrayList.add((SleepStageLabel) ((Map.Entry) next).getKey());
        }
        return arrayList;
    }
}
