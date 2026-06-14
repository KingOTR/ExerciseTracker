package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepConsistencyScorer.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\rB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/sleep/SleepConsistencyScorer;", "", "<init>", "()V", "analyze", "Lcom/example/rungps/sleep/SleepConsistencyScorer$Snapshot;", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "lookbackNights", "", "zone", "Ljava/time/ZoneId;", "Snapshot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepConsistencyScorer {
    public static final int $stable = 0;
    public static final SleepConsistencyScorer INSTANCE = new SleepConsistencyScorer();

    private SleepConsistencyScorer() {
    }

    /* compiled from: SleepConsistencyScorer.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/sleep/SleepConsistencyScorer$Snapshot;", "", "consistencyScore", "", "bedtimeStdMin", "nightsUsed", "summary", "", "<init>", "(IIILjava/lang/String;)V", "getConsistencyScore", "()I", "getBedtimeStdMin", "getNightsUsed", "getSummary", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 0;
        private final int bedtimeStdMin;
        private final int consistencyScore;
        private final int nightsUsed;
        private final String summary;

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, int i, int i2, int i3, String str, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = snapshot.consistencyScore;
            }
            if ((i4 & 2) != 0) {
                i2 = snapshot.bedtimeStdMin;
            }
            if ((i4 & 4) != 0) {
                i3 = snapshot.nightsUsed;
            }
            if ((i4 & 8) != 0) {
                str = snapshot.summary;
            }
            return snapshot.copy(i, i2, i3, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getConsistencyScore() {
            return this.consistencyScore;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBedtimeStdMin() {
            return this.bedtimeStdMin;
        }

        /* renamed from: component3, reason: from getter */
        public final int getNightsUsed() {
            return this.nightsUsed;
        }

        /* renamed from: component4, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        public final Snapshot copy(int consistencyScore, int bedtimeStdMin, int nightsUsed, String summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Snapshot(consistencyScore, bedtimeStdMin, nightsUsed, summary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return this.consistencyScore == snapshot.consistencyScore && this.bedtimeStdMin == snapshot.bedtimeStdMin && this.nightsUsed == snapshot.nightsUsed && Intrinsics.areEqual(this.summary, snapshot.summary);
        }

        public int hashCode() {
            return (((((Integer.hashCode(this.consistencyScore) * 31) + Integer.hashCode(this.bedtimeStdMin)) * 31) + Integer.hashCode(this.nightsUsed)) * 31) + this.summary.hashCode();
        }

        public String toString() {
            return "Snapshot(consistencyScore=" + this.consistencyScore + ", bedtimeStdMin=" + this.bedtimeStdMin + ", nightsUsed=" + this.nightsUsed + ", summary=" + this.summary + ")";
        }

        public Snapshot(int i, int i2, int i3, String summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.consistencyScore = i;
            this.bedtimeStdMin = i2;
            this.nightsUsed = i3;
            this.summary = summary;
        }

        public final int getConsistencyScore() {
            return this.consistencyScore;
        }

        public final int getBedtimeStdMin() {
            return this.bedtimeStdMin;
        }

        public final int getNightsUsed() {
            return this.nightsUsed;
        }

        public final String getSummary() {
            return this.summary;
        }
    }

    public static /* synthetic */ Snapshot analyze$default(SleepConsistencyScorer sleepConsistencyScorer, List list, int i, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 14;
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepConsistencyScorer.analyze(list, i, zoneId);
    }

    public final Snapshot analyze(List<SleepEntryEntity> entries, int lookbackNights, ZoneId zone) {
        String str;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(zone, "zone");
        List take = CollectionsKt.take(CollectionsKt.sortedWith(entries, new Comparator() { // from class: com.example.rungps.sleep.SleepConsistencyScorer$analyze$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t2).getEndTimeMs()), Long.valueOf(((SleepEntryEntity) t).getEndTimeMs()));
            }
        }), lookbackNights);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        Iterator it = take.iterator();
        while (it.hasNext()) {
            ZonedDateTime atZone = Instant.ofEpochMilli(((SleepEntryEntity) it.next()).getStartTimeMs()).atZone(zone);
            arrayList.add(Integer.valueOf((atZone.getHour() * 60) + atZone.getMinute()));
        }
        ArrayList arrayList2 = arrayList;
        if (arrayList2.size() < 3) {
            return new Snapshot(0, 0, arrayList2.size(), "Log more nights for consistency score");
        }
        ArrayList arrayList3 = arrayList2;
        double averageOfInt = CollectionsKt.averageOfInt(arrayList3);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            double intValue = ((Number) it2.next()).intValue() - averageOfInt;
            arrayList4.add(Double.valueOf(intValue * intValue));
        }
        int coerceAtLeast = RangesKt.coerceAtLeast(MathKt.roundToInt(Math.sqrt(CollectionsKt.averageOfDouble(arrayList4))), 0);
        int coerceIn = RangesKt.coerceIn(100 - (coerceAtLeast * 2), 0, 100);
        if (coerceIn >= 75) {
            str = "Consistent bedtime (±" + coerceAtLeast + " min over " + arrayList2.size() + " nights)";
        } else if (coerceIn >= 50) {
            str = "Moderate routine (±" + coerceAtLeast + " min bedtime spread)";
        } else {
            str = "Irregular bedtime (±" + coerceAtLeast + " min) — aim for a steadier schedule";
        }
        return new Snapshot(coerceIn, coerceAtLeast, arrayList2.size(), str);
    }
}
