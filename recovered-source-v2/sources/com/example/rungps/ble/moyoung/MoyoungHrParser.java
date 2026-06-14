package com.example.rungps.ble.moyoung;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: MoyoungHrParser.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u000bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0005¨\u0006\f"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungHrParser;", "", "<init>", "()V", "parse", "", "Lcom/example/rungps/ble/moyoung/MoyoungHrParser$HrPoint;", "payload", "", "merge", "chunks", "HrPoint", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungHrParser {
    public static final int $stable = 0;
    public static final MoyoungHrParser INSTANCE = new MoyoungHrParser();

    private MoyoungHrParser() {
    }

    /* compiled from: MoyoungHrParser.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungHrParser$HrPoint;", "", "offsetSec", "", "bpm", "<init>", "(II)V", "getOffsetSec", "()I", "getBpm", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HrPoint {
        public static final int $stable = 0;
        private final int bpm;
        private final int offsetSec;

        public static /* synthetic */ HrPoint copy$default(HrPoint hrPoint, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = hrPoint.offsetSec;
            }
            if ((i3 & 2) != 0) {
                i2 = hrPoint.bpm;
            }
            return hrPoint.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getOffsetSec() {
            return this.offsetSec;
        }

        /* renamed from: component2, reason: from getter */
        public final int getBpm() {
            return this.bpm;
        }

        public final HrPoint copy(int offsetSec, int bpm) {
            return new HrPoint(offsetSec, bpm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HrPoint)) {
                return false;
            }
            HrPoint hrPoint = (HrPoint) other;
            return this.offsetSec == hrPoint.offsetSec && this.bpm == hrPoint.bpm;
        }

        public int hashCode() {
            return (Integer.hashCode(this.offsetSec) * 31) + Integer.hashCode(this.bpm);
        }

        public String toString() {
            return "HrPoint(offsetSec=" + this.offsetSec + ", bpm=" + this.bpm + ")";
        }

        public HrPoint(int i, int i2) {
            this.offsetSec = i;
            this.bpm = i2;
        }

        public final int getBpm() {
            return this.bpm;
        }

        public final int getOffsetSec() {
            return this.offsetSec;
        }
    }

    public final List<HrPoint> parse(byte[] payload) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length == 0) {
            return CollectionsKt.emptyList();
        }
        int i3 = 0;
        if (payload[0] == 5) {
            payload = ArraysKt.copyOfRange(payload, 1, payload.length);
        }
        if (payload.length == 0) {
            return CollectionsKt.emptyList();
        }
        if (payload.length >= 3 && 1 <= (i2 = payload[1] & 255) && i2 < 301 && payload.length >= i2 + 2) {
            IntRange until = RangesKt.until(0, i2);
            ArrayList arrayList = new ArrayList();
            Iterator<Integer> it = until.iterator();
            while (it.hasNext()) {
                Integer valueOf = Integer.valueOf(payload[((IntIterator) it).nextInt() + 2] & 255);
                int intValue = valueOf.intValue();
                if (40 > intValue || intValue >= 221) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    arrayList.add(valueOf);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.size() >= Math.max(2, i2 / 3)) {
                ArrayList arrayList3 = arrayList2;
                ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
                for (Object obj : arrayList3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    arrayList4.add(new HrPoint(i3 * 60, ((Number) obj).intValue()));
                    i3 = i4;
                }
                return arrayList4;
            }
        }
        if (payload.length >= 4 && payload.length % 2 == 0) {
            ArrayList arrayList5 = new ArrayList();
            int i5 = 0;
            while (true) {
                int i6 = i5 + 1;
                if (i6 >= payload.length) {
                    break;
                }
                int i7 = payload[i5] & 255;
                int i8 = payload[i6] & 255;
                if (40 <= i8 && i8 < 221) {
                    arrayList5.add(new HrPoint(i7 * 60, i8));
                }
                i5 += 2;
            }
            if (arrayList5.size() >= 2) {
                return arrayList5;
            }
        }
        List<Byte> drop = ArraysKt.drop(payload, (payload.length <= 8 || (i = payload[0] & 255) < 0 || i >= 64) ? 0 : 1);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(drop, 10));
        Iterator<T> it2 = drop.iterator();
        while (it2.hasNext()) {
            arrayList6.add(Integer.valueOf(((Number) it2.next()).byteValue() & 255));
        }
        ArrayList arrayList7 = new ArrayList();
        for (Object obj2 : arrayList6) {
            int intValue2 = ((Number) obj2).intValue();
            if (40 <= intValue2 && intValue2 < 221) {
                arrayList7.add(obj2);
            }
        }
        ArrayList arrayList8 = arrayList7;
        if (arrayList8.size() >= 3) {
            ArrayList arrayList9 = arrayList8;
            ArrayList arrayList10 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList9, 10));
            for (Object obj3 : arrayList9) {
                int i9 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList10.add(new HrPoint(i3 * 60, ((Number) obj3).intValue()));
                i3 = i9;
            }
            return arrayList10;
        }
        return CollectionsKt.emptyList();
    }

    public final List<HrPoint> merge(List<? extends List<HrPoint>> chunks) {
        Intrinsics.checkNotNullParameter(chunks, "chunks");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends List<HrPoint>> it = chunks.iterator();
        while (it.hasNext()) {
            for (HrPoint hrPoint : it.next()) {
                linkedHashMap.put(Integer.valueOf(hrPoint.getOffsetSec()), Integer.valueOf(hrPoint.getBpm()));
            }
        }
        Set entrySet = linkedHashMap.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        List<Map.Entry> sortedWith = CollectionsKt.sortedWith(entrySet, new Comparator() { // from class: com.example.rungps.ble.moyoung.MoyoungHrParser$merge$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Integer) ((Map.Entry) t).getKey(), (Integer) ((Map.Entry) t2).getKey());
            }
        });
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(sortedWith, 10));
        for (Map.Entry entry : sortedWith) {
            Object key = entry.getKey();
            Intrinsics.checkNotNullExpressionValue(key, "<get-key>(...)");
            int intValue = ((Number) key).intValue();
            Object value = entry.getValue();
            Intrinsics.checkNotNullExpressionValue(value, "<get-value>(...)");
            arrayList.add(new HrPoint(intValue, ((Number) value).intValue()));
        }
        return arrayList;
    }
}
