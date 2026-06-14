package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepScience;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepTrendAnalysis.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u000f\u0010\u0011B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002¨\u0006\u0012"}, d2 = {"Lcom/example/rungps/sleep/SleepTrendAnalysis;", "", "<init>", "()V", "summarize", "Lcom/example/rungps/sleep/SleepTrendAnalysis$TrendSummary;", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "window", "Lcom/example/rungps/sleep/SleepTrendAnalysis$Window;", "shortNightLabel", "", "startMs", "", "Window", "NightPoint", "TrendSummary", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTrendAnalysis {
    public static final int $stable = 0;
    public static final SleepTrendAnalysis INSTANCE = new SleepTrendAnalysis();

    private SleepTrendAnalysis() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SleepTrendAnalysis.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/sleep/SleepTrendAnalysis$Window;", "", "nights", "", "label", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getNights", "()I", "getLabel", "()Ljava/lang/String;", "Week", "TwoWeeks", "Month", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Window {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Window[] $VALUES;
        private final String label;
        private final int nights;
        public static final Window Week = new Window("Week", 0, 7, "7 nights");
        public static final Window TwoWeeks = new Window("TwoWeeks", 1, 14, "14 nights");
        public static final Window Month = new Window("Month", 2, 30, "30 nights");

        private static final /* synthetic */ Window[] $values() {
            return new Window[]{Week, TwoWeeks, Month};
        }

        public static EnumEntries<Window> getEntries() {
            return $ENTRIES;
        }

        private Window(String str, int i, int i2, String str2) {
            this.nights = i2;
            this.label = str2;
        }

        public final String getLabel() {
            return this.label;
        }

        public final int getNights() {
            return this.nights;
        }

        static {
            Window[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Window valueOf(String str) {
            return (Window) Enum.valueOf(Window.class, str);
        }

        public static Window[] values() {
            return (Window[]) $VALUES.clone();
        }
    }

    /* compiled from: SleepTrendAnalysis.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J8\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/sleep/SleepTrendAnalysis$NightPoint;", "", "label", "", "totalSleepHours", "", "quality", "", "snoreEvents", "<init>", "(Ljava/lang/String;FLjava/lang/Integer;I)V", "getLabel", "()Ljava/lang/String;", "getTotalSleepHours", "()F", "getQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSnoreEvents", "()I", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;FLjava/lang/Integer;I)Lcom/example/rungps/sleep/SleepTrendAnalysis$NightPoint;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class NightPoint {
        public static final int $stable = 0;
        private final String label;
        private final Integer quality;
        private final int snoreEvents;
        private final float totalSleepHours;

        public static /* synthetic */ NightPoint copy$default(NightPoint nightPoint, String str, float f, Integer num, int i, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = nightPoint.label;
            }
            if ((i2 & 2) != 0) {
                f = nightPoint.totalSleepHours;
            }
            if ((i2 & 4) != 0) {
                num = nightPoint.quality;
            }
            if ((i2 & 8) != 0) {
                i = nightPoint.snoreEvents;
            }
            return nightPoint.copy(str, f, num, i);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final float getTotalSleepHours() {
            return this.totalSleepHours;
        }

        /* renamed from: component3, reason: from getter */
        public final Integer getQuality() {
            return this.quality;
        }

        /* renamed from: component4, reason: from getter */
        public final int getSnoreEvents() {
            return this.snoreEvents;
        }

        public final NightPoint copy(String label, float totalSleepHours, Integer quality, int snoreEvents) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new NightPoint(label, totalSleepHours, quality, snoreEvents);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NightPoint)) {
                return false;
            }
            NightPoint nightPoint = (NightPoint) other;
            return Intrinsics.areEqual(this.label, nightPoint.label) && Float.compare(this.totalSleepHours, nightPoint.totalSleepHours) == 0 && Intrinsics.areEqual(this.quality, nightPoint.quality) && this.snoreEvents == nightPoint.snoreEvents;
        }

        public int hashCode() {
            int hashCode = ((this.label.hashCode() * 31) + Float.hashCode(this.totalSleepHours)) * 31;
            Integer num = this.quality;
            return ((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.snoreEvents);
        }

        public String toString() {
            return "NightPoint(label=" + this.label + ", totalSleepHours=" + this.totalSleepHours + ", quality=" + this.quality + ", snoreEvents=" + this.snoreEvents + ")";
        }

        public NightPoint(String label, float f, Integer num, int i) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.totalSleepHours = f;
            this.quality = num;
            this.snoreEvents = i;
        }

        public final String getLabel() {
            return this.label;
        }

        public final float getTotalSleepHours() {
            return this.totalSleepHours;
        }

        public final Integer getQuality() {
            return this.quality;
        }

        public final int getSnoreEvents() {
            return this.snoreEvents;
        }
    }

    /* compiled from: SleepTrendAnalysis.kt */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\t\u0010-\u001a\u00020\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00101\u001a\u00020\u0007HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00104\u001a\u00020\rHÆ\u0003J\t\u00105\u001a\u00020\u0007HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\t\u00107\u001a\u00020\u0005HÆ\u0003J\t\u00108\u001a\u00020\u0012HÆ\u0003J\u000f\u00109\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0003J\u009c\u0001\u0010:\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00122\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014HÆ\u0001¢\u0006\u0002\u0010;J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010?\u001a\u00020\u0005HÖ\u0001J\t\u0010@\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\"\u0010\u001fR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b#\u0010\u001fR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u000e\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001dR\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006A"}, d2 = {"Lcom/example/rungps/sleep/SleepTrendAnalysis$TrendSummary;", "", "window", "Lcom/example/rungps/sleep/SleepTrendAnalysis$Window;", "nightsLogged", "", "avgSleepHours", "", "avgQuality", "avgSnoreEvents", "avgDeepMin", "avgRemMin", "durationBand", "Lcom/example/rungps/sleep/SleepScience$DurationBand;", "avgEstimatedCycles", "nightsInRecoveryBand", "nightsWithAllStages", "coachInsight", "", "points", "", "Lcom/example/rungps/sleep/SleepTrendAnalysis$NightPoint;", "<init>", "(Lcom/example/rungps/sleep/SleepTrendAnalysis$Window;IFLjava/lang/Integer;FLjava/lang/Integer;Ljava/lang/Integer;Lcom/example/rungps/sleep/SleepScience$DurationBand;FIILjava/lang/String;Ljava/util/List;)V", "getWindow", "()Lcom/example/rungps/sleep/SleepTrendAnalysis$Window;", "getNightsLogged", "()I", "getAvgSleepHours", "()F", "getAvgQuality", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAvgSnoreEvents", "getAvgDeepMin", "getAvgRemMin", "getDurationBand", "()Lcom/example/rungps/sleep/SleepScience$DurationBand;", "getAvgEstimatedCycles", "getNightsInRecoveryBand", "getNightsWithAllStages", "getCoachInsight", "()Ljava/lang/String;", "getPoints", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "(Lcom/example/rungps/sleep/SleepTrendAnalysis$Window;IFLjava/lang/Integer;FLjava/lang/Integer;Ljava/lang/Integer;Lcom/example/rungps/sleep/SleepScience$DurationBand;FIILjava/lang/String;Ljava/util/List;)Lcom/example/rungps/sleep/SleepTrendAnalysis$TrendSummary;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrendSummary {
        public static final int $stable = 8;
        private final Integer avgDeepMin;
        private final float avgEstimatedCycles;
        private final Integer avgQuality;
        private final Integer avgRemMin;
        private final float avgSleepHours;
        private final float avgSnoreEvents;
        private final String coachInsight;
        private final SleepScience.DurationBand durationBand;
        private final int nightsInRecoveryBand;
        private final int nightsLogged;
        private final int nightsWithAllStages;
        private final List<NightPoint> points;
        private final Window window;

        /* renamed from: component1, reason: from getter */
        public final Window getWindow() {
            return this.window;
        }

        /* renamed from: component10, reason: from getter */
        public final int getNightsInRecoveryBand() {
            return this.nightsInRecoveryBand;
        }

        /* renamed from: component11, reason: from getter */
        public final int getNightsWithAllStages() {
            return this.nightsWithAllStages;
        }

        /* renamed from: component12, reason: from getter */
        public final String getCoachInsight() {
            return this.coachInsight;
        }

        public final List<NightPoint> component13() {
            return this.points;
        }

        /* renamed from: component2, reason: from getter */
        public final int getNightsLogged() {
            return this.nightsLogged;
        }

        /* renamed from: component3, reason: from getter */
        public final float getAvgSleepHours() {
            return this.avgSleepHours;
        }

        /* renamed from: component4, reason: from getter */
        public final Integer getAvgQuality() {
            return this.avgQuality;
        }

        /* renamed from: component5, reason: from getter */
        public final float getAvgSnoreEvents() {
            return this.avgSnoreEvents;
        }

        /* renamed from: component6, reason: from getter */
        public final Integer getAvgDeepMin() {
            return this.avgDeepMin;
        }

        /* renamed from: component7, reason: from getter */
        public final Integer getAvgRemMin() {
            return this.avgRemMin;
        }

        /* renamed from: component8, reason: from getter */
        public final SleepScience.DurationBand getDurationBand() {
            return this.durationBand;
        }

        /* renamed from: component9, reason: from getter */
        public final float getAvgEstimatedCycles() {
            return this.avgEstimatedCycles;
        }

        public final TrendSummary copy(Window window, int nightsLogged, float avgSleepHours, Integer avgQuality, float avgSnoreEvents, Integer avgDeepMin, Integer avgRemMin, SleepScience.DurationBand durationBand, float avgEstimatedCycles, int nightsInRecoveryBand, int nightsWithAllStages, String coachInsight, List<NightPoint> points) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(durationBand, "durationBand");
            Intrinsics.checkNotNullParameter(coachInsight, "coachInsight");
            Intrinsics.checkNotNullParameter(points, "points");
            return new TrendSummary(window, nightsLogged, avgSleepHours, avgQuality, avgSnoreEvents, avgDeepMin, avgRemMin, durationBand, avgEstimatedCycles, nightsInRecoveryBand, nightsWithAllStages, coachInsight, points);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrendSummary)) {
                return false;
            }
            TrendSummary trendSummary = (TrendSummary) other;
            return this.window == trendSummary.window && this.nightsLogged == trendSummary.nightsLogged && Float.compare(this.avgSleepHours, trendSummary.avgSleepHours) == 0 && Intrinsics.areEqual(this.avgQuality, trendSummary.avgQuality) && Float.compare(this.avgSnoreEvents, trendSummary.avgSnoreEvents) == 0 && Intrinsics.areEqual(this.avgDeepMin, trendSummary.avgDeepMin) && Intrinsics.areEqual(this.avgRemMin, trendSummary.avgRemMin) && this.durationBand == trendSummary.durationBand && Float.compare(this.avgEstimatedCycles, trendSummary.avgEstimatedCycles) == 0 && this.nightsInRecoveryBand == trendSummary.nightsInRecoveryBand && this.nightsWithAllStages == trendSummary.nightsWithAllStages && Intrinsics.areEqual(this.coachInsight, trendSummary.coachInsight) && Intrinsics.areEqual(this.points, trendSummary.points);
        }

        public int hashCode() {
            int hashCode = ((((this.window.hashCode() * 31) + Integer.hashCode(this.nightsLogged)) * 31) + Float.hashCode(this.avgSleepHours)) * 31;
            Integer num = this.avgQuality;
            int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Float.hashCode(this.avgSnoreEvents)) * 31;
            Integer num2 = this.avgDeepMin;
            int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
            Integer num3 = this.avgRemMin;
            return ((((((((((((hashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31) + this.durationBand.hashCode()) * 31) + Float.hashCode(this.avgEstimatedCycles)) * 31) + Integer.hashCode(this.nightsInRecoveryBand)) * 31) + Integer.hashCode(this.nightsWithAllStages)) * 31) + this.coachInsight.hashCode()) * 31) + this.points.hashCode();
        }

        public String toString() {
            return "TrendSummary(window=" + this.window + ", nightsLogged=" + this.nightsLogged + ", avgSleepHours=" + this.avgSleepHours + ", avgQuality=" + this.avgQuality + ", avgSnoreEvents=" + this.avgSnoreEvents + ", avgDeepMin=" + this.avgDeepMin + ", avgRemMin=" + this.avgRemMin + ", durationBand=" + this.durationBand + ", avgEstimatedCycles=" + this.avgEstimatedCycles + ", nightsInRecoveryBand=" + this.nightsInRecoveryBand + ", nightsWithAllStages=" + this.nightsWithAllStages + ", coachInsight=" + this.coachInsight + ", points=" + this.points + ")";
        }

        public TrendSummary(Window window, int i, float f, Integer num, float f2, Integer num2, Integer num3, SleepScience.DurationBand durationBand, float f3, int i2, int i3, String coachInsight, List<NightPoint> points) {
            Intrinsics.checkNotNullParameter(window, "window");
            Intrinsics.checkNotNullParameter(durationBand, "durationBand");
            Intrinsics.checkNotNullParameter(coachInsight, "coachInsight");
            Intrinsics.checkNotNullParameter(points, "points");
            this.window = window;
            this.nightsLogged = i;
            this.avgSleepHours = f;
            this.avgQuality = num;
            this.avgSnoreEvents = f2;
            this.avgDeepMin = num2;
            this.avgRemMin = num3;
            this.durationBand = durationBand;
            this.avgEstimatedCycles = f3;
            this.nightsInRecoveryBand = i2;
            this.nightsWithAllStages = i3;
            this.coachInsight = coachInsight;
            this.points = points;
        }

        public final Window getWindow() {
            return this.window;
        }

        public final int getNightsLogged() {
            return this.nightsLogged;
        }

        public final float getAvgSleepHours() {
            return this.avgSleepHours;
        }

        public final Integer getAvgQuality() {
            return this.avgQuality;
        }

        public final float getAvgSnoreEvents() {
            return this.avgSnoreEvents;
        }

        public final Integer getAvgDeepMin() {
            return this.avgDeepMin;
        }

        public final Integer getAvgRemMin() {
            return this.avgRemMin;
        }

        public final SleepScience.DurationBand getDurationBand() {
            return this.durationBand;
        }

        public final float getAvgEstimatedCycles() {
            return this.avgEstimatedCycles;
        }

        public final int getNightsInRecoveryBand() {
            return this.nightsInRecoveryBand;
        }

        public final int getNightsWithAllStages() {
            return this.nightsWithAllStages;
        }

        public final String getCoachInsight() {
            return this.coachInsight;
        }

        public final List<NightPoint> getPoints() {
            return this.points;
        }
    }

    public final TrendSummary summarize(List<SleepEntryEntity> entries, Window window) {
        int i;
        int i2;
        boolean z;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(window, "window");
        List take = CollectionsKt.take(CollectionsKt.sortedWith(entries, new Comparator() { // from class: com.example.rungps.sleep.SleepTrendAnalysis$summarize$$inlined$sortedByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Long.valueOf(((SleepEntryEntity) t2).getEndTimeMs()), Long.valueOf(((SleepEntryEntity) t).getEndTimeMs()));
            }
        }), window.getNights());
        if (take.isEmpty()) {
            return new TrendSummary(window, 0, 0.0f, null, 0.0f, null, null, SleepScience.DurationBand.WellBelowTypical, 0.0f, 0, 0, "", CollectionsKt.emptyList());
        }
        List<SleepEntryEntity> list = take;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(((SleepEntryEntity) it.next()).getTotalSleepMin() / 60.0f));
        }
        ArrayList arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Integer sleepQuality = ((SleepEntryEntity) it2.next()).getSleepQuality();
            if (sleepQuality != null) {
                arrayList3.add(sleepQuality);
            }
        }
        ArrayList arrayList4 = arrayList3;
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it3 = list.iterator();
        while (true) {
            int i3 = 0;
            if (!it3.hasNext()) {
                break;
            }
            Integer snoreEvents = ((SleepEntryEntity) it3.next()).getSnoreEvents();
            if (snoreEvents != null) {
                i3 = snoreEvents.intValue();
            }
            arrayList5.add(Integer.valueOf(i3));
        }
        ArrayList arrayList6 = arrayList5;
        ArrayList arrayList7 = new ArrayList();
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            Integer deepSleepMin = ((SleepEntryEntity) it4.next()).getDeepSleepMin();
            if (deepSleepMin != null) {
                arrayList7.add(deepSleepMin);
            }
        }
        ArrayList arrayList8 = arrayList7;
        ArrayList arrayList9 = new ArrayList();
        Iterator it5 = list.iterator();
        while (it5.hasNext()) {
            Integer remSleepMin = ((SleepEntryEntity) it5.next()).getRemSleepMin();
            if (remSleepMin != null) {
                arrayList9.add(remSleepMin);
            }
        }
        ArrayList arrayList10 = arrayList9;
        boolean z2 = list instanceof Collection;
        if (z2 && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it6 = list.iterator();
            int i4 = 0;
            while (it6.hasNext()) {
                int totalSleepMin = ((SleepEntryEntity) it6.next()).getTotalSleepMin();
                if (480 <= totalSleepMin && totalSleepMin < 601 && (i4 = i4 + 1) < 0) {
                    CollectionsKt.throwCountOverflow();
                }
            }
            i = i4;
        }
        if (z2 && list.isEmpty()) {
            i2 = 0;
        } else {
            i2 = 0;
            for (SleepEntryEntity sleepEntryEntity : list) {
                Integer deepSleepMin2 = sleepEntryEntity.getDeepSleepMin();
                if ((deepSleepMin2 != null ? deepSleepMin2.intValue() : 0) > 0) {
                    Integer lightSleepMin = sleepEntryEntity.getLightSleepMin();
                    if ((lightSleepMin != null ? lightSleepMin.intValue() : 0) > 0) {
                        Integer remSleepMin2 = sleepEntryEntity.getRemSleepMin();
                        if ((remSleepMin2 != null ? remSleepMin2.intValue() : 0) > 0) {
                            z = true;
                            if (z && (i2 = i2 + 1) < 0) {
                                CollectionsKt.throwCountOverflow();
                            }
                        }
                    }
                }
                z = false;
                if (z) {
                    CollectionsKt.throwCountOverflow();
                }
            }
        }
        float averageOfFloat = (float) CollectionsKt.averageOfFloat(arrayList2);
        ArrayList arrayList11 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it7 = list.iterator();
        while (it7.hasNext()) {
            arrayList11.add(Integer.valueOf(SleepScience.estimateCycleCount$default(SleepScience.INSTANCE, ((SleepEntryEntity) it7.next()).getTotalSleepMin(), 0, 2, null)));
        }
        float averageOfInt = (float) CollectionsKt.averageOfInt(arrayList11);
        List<SleepEntryEntity> reversed = CollectionsKt.reversed(list);
        ArrayList arrayList12 = new ArrayList(CollectionsKt.collectionSizeOrDefault(reversed, 10));
        for (SleepEntryEntity sleepEntryEntity2 : reversed) {
            float f = averageOfFloat;
            String shortNightLabel = INSTANCE.shortNightLabel(sleepEntryEntity2.getStartTimeMs());
            float totalSleepMin2 = sleepEntryEntity2.getTotalSleepMin() / 60.0f;
            Integer sleepQuality2 = sleepEntryEntity2.getSleepQuality();
            Integer snoreEvents2 = sleepEntryEntity2.getSnoreEvents();
            arrayList12.add(new NightPoint(shortNightLabel, totalSleepMin2, sleepQuality2, snoreEvents2 != null ? snoreEvents2.intValue() : 0));
            averageOfFloat = f;
        }
        float f2 = averageOfFloat;
        ArrayList arrayList13 = arrayList12;
        int size = take.size();
        Double valueOf = Double.valueOf(CollectionsKt.averageOfInt(arrayList4));
        valueOf.doubleValue();
        if (arrayList4.isEmpty()) {
            valueOf = null;
        }
        Integer valueOf2 = valueOf != null ? Integer.valueOf((int) valueOf.doubleValue()) : null;
        float averageOfInt2 = (float) CollectionsKt.averageOfInt(arrayList6);
        Double valueOf3 = Double.valueOf(CollectionsKt.averageOfInt(arrayList8));
        valueOf3.doubleValue();
        if (arrayList8.isEmpty()) {
            valueOf3 = null;
        }
        Integer valueOf4 = valueOf3 != null ? Integer.valueOf((int) valueOf3.doubleValue()) : null;
        Double valueOf5 = Double.valueOf(CollectionsKt.averageOfInt(arrayList10));
        valueOf5.doubleValue();
        if (arrayList10.isEmpty()) {
            valueOf5 = null;
        }
        return new TrendSummary(window, size, f2, valueOf2, averageOfInt2, valueOf4, valueOf5 != null ? Integer.valueOf((int) valueOf5.doubleValue()) : null, SleepScience.INSTANCE.durationBand((int) (f2 * 60.0f)), averageOfInt, i, i2, SleepScience.INSTANCE.recoveryCoachLine(f2, i2, take.size()), arrayList13);
    }

    private final String shortNightLabel(long startMs) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(startMs);
        switch (calendar.get(7)) {
            case 2:
                return "Mon";
            case 3:
                return "Tue";
            case 4:
                return "Wed";
            case 5:
                return "Thu";
            case 6:
                return "Fri";
            case 7:
                return "Sat";
            default:
                return "Sun";
        }
    }
}
