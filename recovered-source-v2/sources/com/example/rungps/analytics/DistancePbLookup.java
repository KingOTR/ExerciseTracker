package com.example.rungps.analytics;

import androidx.exifinterface.media.ExifInterface;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.StravaPbEntity;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: DistancePbLookup.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0002\u0010\u0011J$\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00052\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bJ\u000e\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0005J \u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/analytics/DistancePbLookup;", "", "<init>", "()V", "RIEGEL_EXP", "", "EXACT_KM_TOLERANCE", "normalizePbs", "", "", ImagesContract.LOCAL, "", "strava", "", "Lcom/example/rungps/data/StravaPbEntity;", "labelToKm", "label", "(Ljava/lang/String;)Ljava/lang/Double;", "bestTimeAt", "Lcom/example/rungps/analytics/DistancePbLookup$TimeAtDistance;", "distanceKm", "pbs", "formatKm", "km", "riegelPredict", "t1Ms", "d1Km", "d2Km", "TimeAtDistance", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DistancePbLookup {
    public static final int $stable = 0;
    private static final double EXACT_KM_TOLERANCE = 0.25d;
    public static final DistancePbLookup INSTANCE = new DistancePbLookup();
    private static final double RIEGEL_EXP = 1.06d;

    private DistancePbLookup() {
    }

    /* compiled from: DistancePbLookup.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JB\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/example/rungps/analytics/DistancePbLookup$TimeAtDistance;", "", "distanceKm", "", "timeMs", "", "interpolated", "", "anchorDistanceKm", "anchorLabel", "", "<init>", "(DJZLjava/lang/Double;Ljava/lang/String;)V", "getDistanceKm", "()D", "getTimeMs", "()J", "getInterpolated", "()Z", "getAnchorDistanceKm", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAnchorLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "(DJZLjava/lang/Double;Ljava/lang/String;)Lcom/example/rungps/analytics/DistancePbLookup$TimeAtDistance;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TimeAtDistance {
        public static final int $stable = 0;
        private final Double anchorDistanceKm;
        private final String anchorLabel;
        private final double distanceKm;
        private final boolean interpolated;
        private final long timeMs;

        /* renamed from: component1, reason: from getter */
        public final double getDistanceKm() {
            return this.distanceKm;
        }

        /* renamed from: component2, reason: from getter */
        public final long getTimeMs() {
            return this.timeMs;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getInterpolated() {
            return this.interpolated;
        }

        /* renamed from: component4, reason: from getter */
        public final Double getAnchorDistanceKm() {
            return this.anchorDistanceKm;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAnchorLabel() {
            return this.anchorLabel;
        }

        public final TimeAtDistance copy(double distanceKm, long timeMs, boolean interpolated, Double anchorDistanceKm, String anchorLabel) {
            Intrinsics.checkNotNullParameter(anchorLabel, "anchorLabel");
            return new TimeAtDistance(distanceKm, timeMs, interpolated, anchorDistanceKm, anchorLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TimeAtDistance)) {
                return false;
            }
            TimeAtDistance timeAtDistance = (TimeAtDistance) other;
            return Double.compare(this.distanceKm, timeAtDistance.distanceKm) == 0 && this.timeMs == timeAtDistance.timeMs && this.interpolated == timeAtDistance.interpolated && Intrinsics.areEqual((Object) this.anchorDistanceKm, (Object) timeAtDistance.anchorDistanceKm) && Intrinsics.areEqual(this.anchorLabel, timeAtDistance.anchorLabel);
        }

        public int hashCode() {
            int hashCode = ((((Double.hashCode(this.distanceKm) * 31) + Long.hashCode(this.timeMs)) * 31) + Boolean.hashCode(this.interpolated)) * 31;
            Double d = this.anchorDistanceKm;
            return ((hashCode + (d == null ? 0 : d.hashCode())) * 31) + this.anchorLabel.hashCode();
        }

        public String toString() {
            return "TimeAtDistance(distanceKm=" + this.distanceKm + ", timeMs=" + this.timeMs + ", interpolated=" + this.interpolated + ", anchorDistanceKm=" + this.anchorDistanceKm + ", anchorLabel=" + this.anchorLabel + ")";
        }

        public TimeAtDistance(double d, long j, boolean z, Double d2, String anchorLabel) {
            Intrinsics.checkNotNullParameter(anchorLabel, "anchorLabel");
            this.distanceKm = d;
            this.timeMs = j;
            this.interpolated = z;
            this.anchorDistanceKm = d2;
            this.anchorLabel = anchorLabel;
        }

        public final double getDistanceKm() {
            return this.distanceKm;
        }

        public final long getTimeMs() {
            return this.timeMs;
        }

        public final boolean getInterpolated() {
            return this.interpolated;
        }

        public final Double getAnchorDistanceKm() {
            return this.anchorDistanceKm;
        }

        public final String getAnchorLabel() {
            return this.anchorLabel;
        }
    }

    public final Map<Double, Long> normalizePbs(Map<String, Long> local, List<StravaPbEntity> strava) {
        Intrinsics.checkNotNullParameter(local, "local");
        Intrinsics.checkNotNullParameter(strava, "strava");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<Map.Entry<String, Long>> it = local.entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<String, Long> next = it.next();
            String key = next.getKey();
            long longValue = next.getValue().longValue();
            Double labelToKm = labelToKm(key);
            if (labelToKm != null) {
                double doubleValue = labelToKm.doubleValue();
                LinkedHashMap linkedHashMap2 = linkedHashMap;
                Double valueOf = Double.valueOf(doubleValue);
                Long l = (Long) linkedHashMap.get(Double.valueOf(doubleValue));
                linkedHashMap2.put(valueOf, Long.valueOf(Math.min(l != null ? l.longValue() : Long.MAX_VALUE, longValue)));
            }
        }
        for (StravaPbEntity stravaPbEntity : strava) {
            if (Intrinsics.areEqual(stravaPbEntity.getActivityKind(), "RUN")) {
                double targetDistanceM = stravaPbEntity.getTargetDistanceM() / 1000.0d;
                if (targetDistanceM > 0.5d) {
                    long bestMovingTimeSec = stravaPbEntity.getBestMovingTimeSec() * 1000;
                    LinkedHashMap linkedHashMap3 = linkedHashMap;
                    Double valueOf2 = Double.valueOf(targetDistanceM);
                    Long l2 = (Long) linkedHashMap.get(Double.valueOf(targetDistanceM));
                    linkedHashMap3.put(valueOf2, Long.valueOf(Math.min(l2 != null ? l2.longValue() : Long.MAX_VALUE, bestMovingTimeSec)));
                }
            }
        }
        return linkedHashMap;
    }

    public final Double labelToKm(String label) {
        List<String> groupValues;
        String str;
        Intrinsics.checkNotNullParameter(label, "label");
        String lowerCase = label.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = lowerCase;
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "marathon", false, 2, (Object) null) && !StringsKt.contains$default((CharSequence) str2, (CharSequence) "half", false, 2, (Object) null)) {
            return Double.valueOf(42.195d);
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "half", false, 2, (Object) null)) {
            return Double.valueOf(21.0975d);
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "12", false, 2, (Object) null)) {
            return Double.valueOf(12.0d);
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "10", false, 2, (Object) null)) {
            return Double.valueOf(10.0d);
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "5", false, 2, (Object) null)) {
            return Double.valueOf(5.0d);
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) ExifInterface.GPS_MEASUREMENT_3D, false, 2, (Object) null)) {
            return Double.valueOf(3.0d);
        }
        if (StringsKt.contains$default((CharSequence) str2, (CharSequence) "1 km", false, 2, (Object) null) || Intrinsics.areEqual(lowerCase, "1k")) {
            return Double.valueOf(1.0d);
        }
        MatchResult find$default = Regex.find$default(new Regex("(\\d+(?:\\.\\d+)?)"), str2, 0, 2, null);
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str = groupValues.get(1)) == null) {
            return null;
        }
        return StringsKt.toDoubleOrNull(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0213  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TimeAtDistance bestTimeAt(double distanceKm, Map<Double, Long> pbs) {
        Object obj;
        Object obj2;
        Triple triple;
        Triple triple2;
        Intrinsics.checkNotNullParameter(pbs, "pbs");
        Object obj3 = null;
        if (distanceKm <= 0.0d || pbs.isEmpty()) {
            return null;
        }
        List sortedWith = CollectionsKt.sortedWith(pbs.entrySet(), new Comparator() { // from class: com.example.rungps.analytics.DistancePbLookup$bestTimeAt$$inlined$sortedBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues((Double) ((Map.Entry) t).getKey(), (Double) ((Map.Entry) t2).getKey());
            }
        });
        List list = sortedWith;
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Math.abs(((Number) ((Map.Entry) obj).getKey()).doubleValue() - distanceKm) <= EXACT_KM_TOLERANCE) {
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry != null) {
            return new TimeAtDistance(distanceKm, ((Number) entry.getValue()).longValue(), false, (Double) entry.getKey(), INSTANCE.formatKm(((Number) entry.getKey()).doubleValue()) + " PB");
        }
        ListIterator listIterator = sortedWith.listIterator(sortedWith.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                obj2 = null;
                break;
            }
            obj2 = listIterator.previous();
            if (((Number) ((Map.Entry) obj2).getKey()).doubleValue() < distanceKm - EXACT_KM_TOLERANCE) {
                break;
            }
        }
        Map.Entry entry2 = (Map.Entry) obj2;
        Iterator it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            if (((Number) ((Map.Entry) next).getKey()).doubleValue() > distanceKm + EXACT_KM_TOLERANCE) {
                obj3 = next;
                break;
            }
        }
        Map.Entry entry3 = (Map.Entry) obj3;
        if (entry2 != null && entry3 != null) {
            long riegelPredict = riegelPredict(((Number) entry2.getValue()).longValue(), ((Number) entry2.getKey()).doubleValue(), distanceKm);
            long riegelPredict2 = riegelPredict(((Number) entry3.getValue()).longValue(), ((Number) entry3.getKey()).doubleValue(), distanceKm);
            if (Math.abs(((Number) entry2.getKey()).doubleValue() - distanceKm) <= Math.abs(((Number) entry3.getKey()).doubleValue() - distanceKm)) {
                triple2 = new Triple(entry2.getKey(), entry2.getValue(), Long.valueOf(riegelPredict));
                boolean z = Math.abs(((Number) triple2.getFirst()).doubleValue() - distanceKm) <= EXACT_KM_TOLERANCE;
                return new TimeAtDistance(distanceKm, ((Number) triple2.getThird()).longValue(), z, (Double) triple2.getFirst(), !z ? "Estimated from " + formatKm(((Number) triple2.getFirst()).doubleValue()) + " PB" : formatKm(((Number) triple2.getFirst()).doubleValue()) + " PB");
            }
            triple = new Triple(entry3.getKey(), entry3.getValue(), Long.valueOf(riegelPredict2));
        } else if (entry2 != null) {
            triple = new Triple(entry2.getKey(), entry2.getValue(), Long.valueOf(riegelPredict(((Number) entry2.getValue()).longValue(), ((Number) entry2.getKey()).doubleValue(), distanceKm)));
        } else if (entry3 != null) {
            triple = new Triple(entry3.getKey(), entry3.getValue(), Long.valueOf(riegelPredict(((Number) entry3.getValue()).longValue(), ((Number) entry3.getKey()).doubleValue(), distanceKm)));
        } else {
            Map.Entry entry4 = (Map.Entry) CollectionsKt.first(sortedWith);
            triple = new Triple(entry4.getKey(), entry4.getValue(), Long.valueOf(riegelPredict(((Number) entry4.getValue()).longValue(), ((Number) entry4.getKey()).doubleValue(), distanceKm)));
        }
        triple2 = triple;
        boolean z2 = Math.abs(((Number) triple2.getFirst()).doubleValue() - distanceKm) <= EXACT_KM_TOLERANCE;
        return new TimeAtDistance(distanceKm, ((Number) triple2.getThird()).longValue(), z2, (Double) triple2.getFirst(), !z2 ? "Estimated from " + formatKm(((Number) triple2.getFirst()).doubleValue()) + " PB" : formatKm(((Number) triple2.getFirst()).doubleValue()) + " PB");
    }

    public final String formatKm(double km) {
        if (Math.abs(km - 5.0d) < 0.1d) {
            return "5 km";
        }
        if (Math.abs(km - 10.0d) < 0.1d) {
            return "10 km";
        }
        if (Math.abs(km - 21.0975d) < 0.2d) {
            return "half marathon";
        }
        if (Math.abs(km - 42.195d) < 0.3d) {
            return "marathon";
        }
        if (km < 10.0d) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.1f km", Arrays.copyOf(new Object[]{Double.valueOf(km)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
        String format2 = String.format("%.0f km", Arrays.copyOf(new Object[]{Double.valueOf(km)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        return format2;
    }

    private final long riegelPredict(long t1Ms, double d1Km, double d2Km) {
        return RangesKt.coerceAtLeast((long) (t1Ms * Math.pow(d2Km / RangesKt.coerceAtLeast(d1Km, 0.001d), RIEGEL_EXP)), 1L);
    }
}
