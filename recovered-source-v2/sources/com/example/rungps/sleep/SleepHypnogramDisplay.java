package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepConfidenceStaging;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* compiled from: SleepHypnogramDisplay.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u001f\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0002\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/sleep/SleepHypnogramDisplay;", "", "<init>", "()V", "chartMeta", "Lcom/example/rungps/sleep/SleepHypnogramDisplay$ChartMeta;", "entry", "Lcom/example/rungps/data/SleepEntryEntity;", "inBedMinutes", "", "markerMinutesWithData", "parseTrackedMinutes", "notes", "", "inBedMin", "(Ljava/lang/String;I)Ljava/lang/Integer;", "ChartMeta", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepHypnogramDisplay {
    public static final int $stable = 0;
    public static final SleepHypnogramDisplay INSTANCE = new SleepHypnogramDisplay();

    private SleepHypnogramDisplay() {
    }

    /* compiled from: SleepHypnogramDisplay.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/sleep/SleepHypnogramDisplay$ChartMeta;", "", "isPartialTracking", "", "trackedMinutesEstimate", "", "message", "", "confidenceView", "Lcom/example/rungps/sleep/SleepConfidenceStaging$ViewMeta;", "<init>", "(ZLjava/lang/Integer;Ljava/lang/String;Lcom/example/rungps/sleep/SleepConfidenceStaging$ViewMeta;)V", "()Z", "getTrackedMinutesEstimate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMessage", "()Ljava/lang/String;", "getConfidenceView", "()Lcom/example/rungps/sleep/SleepConfidenceStaging$ViewMeta;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/Integer;Ljava/lang/String;Lcom/example/rungps/sleep/SleepConfidenceStaging$ViewMeta;)Lcom/example/rungps/sleep/SleepHypnogramDisplay$ChartMeta;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ChartMeta {
        public static final int $stable = 0;
        private final SleepConfidenceStaging.ViewMeta confidenceView;
        private final boolean isPartialTracking;
        private final String message;
        private final Integer trackedMinutesEstimate;

        public static /* synthetic */ ChartMeta copy$default(ChartMeta chartMeta, boolean z, Integer num, String str, SleepConfidenceStaging.ViewMeta viewMeta, int i, Object obj) {
            if ((i & 1) != 0) {
                z = chartMeta.isPartialTracking;
            }
            if ((i & 2) != 0) {
                num = chartMeta.trackedMinutesEstimate;
            }
            if ((i & 4) != 0) {
                str = chartMeta.message;
            }
            if ((i & 8) != 0) {
                viewMeta = chartMeta.confidenceView;
            }
            return chartMeta.copy(z, num, str, viewMeta);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsPartialTracking() {
            return this.isPartialTracking;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getTrackedMinutesEstimate() {
            return this.trackedMinutesEstimate;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component4, reason: from getter */
        public final SleepConfidenceStaging.ViewMeta getConfidenceView() {
            return this.confidenceView;
        }

        public final ChartMeta copy(boolean isPartialTracking, Integer trackedMinutesEstimate, String message, SleepConfidenceStaging.ViewMeta confidenceView) {
            return new ChartMeta(isPartialTracking, trackedMinutesEstimate, message, confidenceView);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChartMeta)) {
                return false;
            }
            ChartMeta chartMeta = (ChartMeta) other;
            return this.isPartialTracking == chartMeta.isPartialTracking && Intrinsics.areEqual(this.trackedMinutesEstimate, chartMeta.trackedMinutesEstimate) && Intrinsics.areEqual(this.message, chartMeta.message) && Intrinsics.areEqual(this.confidenceView, chartMeta.confidenceView);
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isPartialTracking) * 31;
            Integer num = this.trackedMinutesEstimate;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.message;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            SleepConfidenceStaging.ViewMeta viewMeta = this.confidenceView;
            return hashCode3 + (viewMeta != null ? viewMeta.hashCode() : 0);
        }

        public String toString() {
            return "ChartMeta(isPartialTracking=" + this.isPartialTracking + ", trackedMinutesEstimate=" + this.trackedMinutesEstimate + ", message=" + this.message + ", confidenceView=" + this.confidenceView + ")";
        }

        public ChartMeta(boolean z, Integer num, String str, SleepConfidenceStaging.ViewMeta viewMeta) {
            this.isPartialTracking = z;
            this.trackedMinutesEstimate = num;
            this.message = str;
            this.confidenceView = viewMeta;
        }

        public /* synthetic */ ChartMeta(boolean z, Integer num, String str, SleepConfidenceStaging.ViewMeta viewMeta, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(z, num, str, (i & 8) != 0 ? null : viewMeta);
        }

        public final boolean isPartialTracking() {
            return this.isPartialTracking;
        }

        public final Integer getTrackedMinutesEstimate() {
            return this.trackedMinutesEstimate;
        }

        public final String getMessage() {
            return this.message;
        }

        public final SleepConfidenceStaging.ViewMeta getConfidenceView() {
            return this.confidenceView;
        }
    }

    public final ChartMeta chartMeta(SleepEntryEntity entry) {
        Integer valueOf;
        Intrinsics.checkNotNullParameter(entry, "entry");
        int inBedMinutes = inBedMinutes(entry);
        List<SleepStageLabel> decode = SleepHypnogramEncoder.INSTANCE.decode(entry.getHypnogramCompact());
        if (decode.isEmpty()) {
            return new ChartMeta(false, null, null, null, 8, null);
        }
        String notes = entry.getNotes();
        if (notes == null) {
            notes = "";
        }
        int markerMinutesWithData = markerMinutesWithData(entry);
        double size = !decode.isEmpty() ? markerMinutesWithData / decode.size() : 0.0d;
        String str = notes;
        boolean z = StringsKt.contains((CharSequence) str, (CharSequence) "sensor tracked", true) || StringsKt.contains((CharSequence) str, (CharSequence) "auto-repaired", true) || StringsKt.contains((CharSequence) str, (CharSequence) "estimate from in-bed", true) || StringsKt.contains((CharSequence) str, (CharSequence) "adjusted (", true);
        boolean z2 = decode.size() < inBedMinutes / 3;
        boolean z3 = size < 0.2d && decode.size() >= 60;
        boolean z4 = z || z2 || z3;
        String str2 = null;
        if (z) {
            valueOf = parseTrackedMinutes(notes, inBedMinutes);
        } else {
            valueOf = z3 ? Integer.valueOf(RangesKt.coerceAtLeast(markerMinutesWithData, 1)) : null;
        }
        if (z4) {
            if (z && valueOf != null) {
                str2 = "Mic tracked ~" + valueOf + "m of " + inBedMinutes + "m in bed — dashed curve is an estimate from your stage totals (not full sensor coverage).";
            } else if (z3) {
                str2 = "Disturbances only recorded for ~" + markerMinutesWithData + "m — tracking stopped early or mic was off.";
            } else {
                str2 = "Stage timeline is estimated from in-bed time, not full sensor coverage.";
            }
        }
        return new ChartMeta(z4, valueOf, str2, SleepConfidenceStaging.INSTANCE.viewMeta(entry));
    }

    private final int inBedMinutes(SleepEntryEntity entry) {
        return RangesKt.coerceAtLeast((int) ((entry.getEndTimeMs() - entry.getStartTimeMs()) / 60000), 1);
    }

    private final int markerMinutesWithData(SleepEntryEntity entry) {
        List<SleepMinuteEvent> decode = SleepEventMarkersEncoder.INSTANCE.decode(entry.getEventMarkersCompact());
        int i = 0;
        if (!decode.isEmpty()) {
            List<SleepMinuteEvent> list = decode;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    if (((SleepMinuteEvent) it.next()).getHasMarker() && (i = i + 1) < 0) {
                        CollectionsKt.throwCountOverflow();
                    }
                }
            }
        }
        return i;
    }

    private final Integer parseTrackedMinutes(String notes, int inBedMin) {
        List<String> groupValues;
        String str;
        Integer intOrNull;
        String str2 = notes;
        MatchResult find$default = Regex.find$default(new Regex("sensor tracked (\\d+)m", RegexOption.IGNORE_CASE), str2, 0, 2, null);
        if (find$default == null) {
            find$default = Regex.find$default(new Regex("tracked (\\d+)m of", RegexOption.IGNORE_CASE), str2, 0, 2, null);
        }
        if (find$default == null || (groupValues = find$default.getGroupValues()) == null || (str = (String) CollectionsKt.getOrNull(groupValues, 1)) == null || (intOrNull = StringsKt.toIntOrNull(str)) == null) {
            return null;
        }
        return Integer.valueOf(RangesKt.coerceIn(intOrNull.intValue(), 1, inBedMin));
    }
}
