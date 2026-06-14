package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepDebtTracker.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0015B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/sleep/SleepDebtTracker;", "", "<init>", "()V", "DEFAULT_TARGET_HOURS", "", "LOOKBACK_NIGHTS", "", "analyze", "Lcom/example/rungps/sleep/SleepDebtTracker$Snapshot;", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "targetHoursPerNight", "typicalWakeHour", "typicalWakeMinute", "zone", "Ljava/time/ZoneId;", "fmtH", "", "h", "Snapshot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepDebtTracker {
    public static final int $stable = 0;
    public static final double DEFAULT_TARGET_HOURS = 8.0d;
    public static final SleepDebtTracker INSTANCE = new SleepDebtTracker();
    private static final int LOOKBACK_NIGHTS = 7;

    private SleepDebtTracker() {
    }

    /* compiled from: SleepDebtTracker.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0007HÖ\u0001J\t\u0010!\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lcom/example/rungps/sleep/SleepDebtTracker$Snapshot;", "", "targetHoursPerNight", "", "avgHours7d", "debtHours", "nightsInWindow", "", "suggestedBedtimeLabel", "", "summary", "<init>", "(DDDILjava/lang/String;Ljava/lang/String;)V", "getTargetHoursPerNight", "()D", "getAvgHours7d", "getDebtHours", "getNightsInWindow", "()I", "getSuggestedBedtimeLabel", "()Ljava/lang/String;", "getSummary", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 0;
        private final double avgHours7d;
        private final double debtHours;
        private final int nightsInWindow;
        private final String suggestedBedtimeLabel;
        private final String summary;
        private final double targetHoursPerNight;

        /* renamed from: component1, reason: from getter */
        public final double getTargetHoursPerNight() {
            return this.targetHoursPerNight;
        }

        /* renamed from: component2, reason: from getter */
        public final double getAvgHours7d() {
            return this.avgHours7d;
        }

        /* renamed from: component3, reason: from getter */
        public final double getDebtHours() {
            return this.debtHours;
        }

        /* renamed from: component4, reason: from getter */
        public final int getNightsInWindow() {
            return this.nightsInWindow;
        }

        /* renamed from: component5, reason: from getter */
        public final String getSuggestedBedtimeLabel() {
            return this.suggestedBedtimeLabel;
        }

        /* renamed from: component6, reason: from getter */
        public final String getSummary() {
            return this.summary;
        }

        public final Snapshot copy(double targetHoursPerNight, double avgHours7d, double debtHours, int nightsInWindow, String suggestedBedtimeLabel, String summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            return new Snapshot(targetHoursPerNight, avgHours7d, debtHours, nightsInWindow, suggestedBedtimeLabel, summary);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return Double.compare(this.targetHoursPerNight, snapshot.targetHoursPerNight) == 0 && Double.compare(this.avgHours7d, snapshot.avgHours7d) == 0 && Double.compare(this.debtHours, snapshot.debtHours) == 0 && this.nightsInWindow == snapshot.nightsInWindow && Intrinsics.areEqual(this.suggestedBedtimeLabel, snapshot.suggestedBedtimeLabel) && Intrinsics.areEqual(this.summary, snapshot.summary);
        }

        public int hashCode() {
            int hashCode = ((((((Double.hashCode(this.targetHoursPerNight) * 31) + Double.hashCode(this.avgHours7d)) * 31) + Double.hashCode(this.debtHours)) * 31) + Integer.hashCode(this.nightsInWindow)) * 31;
            String str = this.suggestedBedtimeLabel;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.summary.hashCode();
        }

        public String toString() {
            return "Snapshot(targetHoursPerNight=" + this.targetHoursPerNight + ", avgHours7d=" + this.avgHours7d + ", debtHours=" + this.debtHours + ", nightsInWindow=" + this.nightsInWindow + ", suggestedBedtimeLabel=" + this.suggestedBedtimeLabel + ", summary=" + this.summary + ")";
        }

        public Snapshot(double d, double d2, double d3, int i, String str, String summary) {
            Intrinsics.checkNotNullParameter(summary, "summary");
            this.targetHoursPerNight = d;
            this.avgHours7d = d2;
            this.debtHours = d3;
            this.nightsInWindow = i;
            this.suggestedBedtimeLabel = str;
            this.summary = summary;
        }

        public final double getTargetHoursPerNight() {
            return this.targetHoursPerNight;
        }

        public final double getAvgHours7d() {
            return this.avgHours7d;
        }

        public final double getDebtHours() {
            return this.debtHours;
        }

        public final int getNightsInWindow() {
            return this.nightsInWindow;
        }

        public final String getSuggestedBedtimeLabel() {
            return this.suggestedBedtimeLabel;
        }

        public final String getSummary() {
            return this.summary;
        }
    }

    public static /* synthetic */ Snapshot analyze$default(SleepDebtTracker sleepDebtTracker, List list, double d, int i, int i2, ZoneId zoneId, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            d = 8.0d;
        }
        double d2 = d;
        if ((i3 & 4) != 0) {
            i = 7;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = 0;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepDebtTracker.analyze(list, d2, i4, i5, zoneId);
    }

    public final Snapshot analyze(List<SleepEntryEntity> entries, double targetHoursPerNight, int typicalWakeHour, int typicalWakeMinute, ZoneId zone) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(zone, "zone");
        LocalDate now = LocalDate.now(zone);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : entries) {
            LocalDate localDate = Instant.ofEpochMilli(((SleepEntryEntity) obj).getEndTimeMs()).atZone(zone).toLocalDate();
            Object obj2 = linkedHashMap.get(localDate);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(localDate, obj2);
            }
            ((List) obj2).add(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (LocalDate minusDays = now.minusDays(6L); !minusDays.isAfter(now); minusDays = minusDays.plusDays(1L)) {
            List list = (List) linkedHashMap.get(minusDays);
            if (list != null) {
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    throw new NoSuchElementException();
                }
                SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) it.next();
                double effectiveAsleepMinutes = SleepScoring.INSTANCE.effectiveAsleepMinutes(sleepEntryEntity.getTotalSleepMin(), sleepEntryEntity.getStartTimeMs(), sleepEntryEntity.getEndTimeMs(), sleepEntryEntity.getSource()) / 60.0d;
                while (it.hasNext()) {
                    SleepEntryEntity sleepEntryEntity2 = (SleepEntryEntity) it.next();
                    effectiveAsleepMinutes = Math.max(effectiveAsleepMinutes, SleepScoring.INSTANCE.effectiveAsleepMinutes(sleepEntryEntity2.getTotalSleepMin(), sleepEntryEntity2.getStartTimeMs(), sleepEntryEntity2.getEndTimeMs(), sleepEntryEntity2.getSource()) / 60.0d);
                }
                arrayList.add(Double.valueOf(effectiveAsleepMinutes));
            }
        }
        int size = arrayList.size();
        double averageOfDouble = size == 0 ? 0.0d : CollectionsKt.averageOfDouble(arrayList);
        double coerceAtLeast = size != 0 ? RangesKt.coerceAtLeast((size * targetHoursPerNight) - CollectionsKt.sumOfDouble(arrayList), 0.0d) : 0.0d;
        if (coerceAtLeast <= 0.5d || size <= 0) {
            str = null;
        } else {
            double d = 60;
            str = LocalTime.of(typicalWakeHour, typicalWakeMinute).minusMinutes(MathKt.roundToInt(targetHoursPerNight * d) + RangesKt.coerceIn(MathKt.roundToInt((coerceAtLeast / size) * d), 15, 90)).format(DateTimeFormatter.ofPattern("h:mm a", Locale.getDefault()));
        }
        String str3 = str;
        if (size == 0) {
            str2 = "Log sleep nights to track debt vs " + ((int) targetHoursPerNight) + " h target.";
        } else if (coerceAtLeast < 0.5d) {
            str2 = "Averaging " + fmtH(averageOfDouble) + "/night over " + size + " logged night(s) — on target.";
        } else {
            str2 = fmtH(coerceAtLeast) + " below target over " + size + " logged night(s) (avg " + fmtH(averageOfDouble) + "/night).";
        }
        return new Snapshot(targetHoursPerNight, averageOfDouble, coerceAtLeast, size, str3, str2);
    }

    private final String fmtH(double h) {
        StringBuilder sb;
        StringBuilder append;
        String str;
        int roundToInt = MathKt.roundToInt(h * 60);
        int i = roundToInt / 60;
        int i2 = roundToInt % 60;
        if (i2 == 0) {
            sb = new StringBuilder();
            append = sb.append(i);
            str = "h";
        } else {
            sb = new StringBuilder();
            append = sb.append(i).append("h ").append(i2);
            str = "m";
        }
        return append.append(str).toString();
    }
}
