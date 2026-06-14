package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.analytics.TrainingWeekPlanner;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RunEntity;
import com.example.rungps.health.HealthConnectManager;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.TemporalAdjuster;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.math.MathKt;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;

/* compiled from: TrainingWeekPlanner.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003Jd\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/analytics/TrainingWeekPlanner;", "", "<init>", "()V", "build", "Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "runs", "", "Lcom/example/rungps/data/RunEntity;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "gymTonnageBySession", "", "", "", "sleepWindows", "Lcom/example/rungps/health/HealthConnectManager$SleepWindow;", "zone", "Ljava/time/ZoneId;", "today", "Ljava/time/LocalDate;", "weekStartMonday", "EventKind", "WeekEvent", "WeekDay", "TrainingWeekView", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainingWeekPlanner {
    public static final int $stable = 0;
    public static final TrainingWeekPlanner INSTANCE = new TrainingWeekPlanner();

    private TrainingWeekPlanner() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TrainingWeekPlanner.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/example/rungps/analytics/TrainingWeekPlanner$EventKind;", "", "<init>", "(Ljava/lang/String;I)V", "RUN", "GYM", "SLEEP", "REST_HINT", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class EventKind {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventKind[] $VALUES;
        public static final EventKind RUN = new EventKind("RUN", 0);
        public static final EventKind GYM = new EventKind("GYM", 1);
        public static final EventKind SLEEP = new EventKind("SLEEP", 2);
        public static final EventKind REST_HINT = new EventKind("REST_HINT", 3);

        private static final /* synthetic */ EventKind[] $values() {
            return new EventKind[]{RUN, GYM, SLEEP, REST_HINT};
        }

        public static EnumEntries<EventKind> getEntries() {
            return $ENTRIES;
        }

        static {
            EventKind[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private EventKind(String str, int i) {
        }

        public static EventKind valueOf(String str) {
            return (EventKind) Enum.valueOf(EventKind.class, str);
        }

        public static EventKind[] values() {
            return (EventKind[]) $VALUES.clone();
        }
    }

    /* compiled from: TrainingWeekPlanner.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/analytics/TrainingWeekPlanner$WeekEvent;", "", "kind", "Lcom/example/rungps/analytics/TrainingWeekPlanner$EventKind;", "title", "", "subtitle", "timeMs", "", "<init>", "(Lcom/example/rungps/analytics/TrainingWeekPlanner$EventKind;Ljava/lang/String;Ljava/lang/String;J)V", "getKind", "()Lcom/example/rungps/analytics/TrainingWeekPlanner$EventKind;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "getTimeMs", "()J", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeekEvent {
        public static final int $stable = 0;
        private final EventKind kind;
        private final String subtitle;
        private final long timeMs;
        private final String title;

        public static /* synthetic */ WeekEvent copy$default(WeekEvent weekEvent, EventKind eventKind, String str, String str2, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                eventKind = weekEvent.kind;
            }
            if ((i & 2) != 0) {
                str = weekEvent.title;
            }
            String str3 = str;
            if ((i & 4) != 0) {
                str2 = weekEvent.subtitle;
            }
            String str4 = str2;
            if ((i & 8) != 0) {
                j = weekEvent.timeMs;
            }
            return weekEvent.copy(eventKind, str3, str4, j);
        }

        /* renamed from: component1, reason: from getter */
        public final EventKind getKind() {
            return this.kind;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        /* renamed from: component4, reason: from getter */
        public final long getTimeMs() {
            return this.timeMs;
        }

        public final WeekEvent copy(EventKind kind, String title, String subtitle, long timeMs) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(title, "title");
            return new WeekEvent(kind, title, subtitle, timeMs);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeekEvent)) {
                return false;
            }
            WeekEvent weekEvent = (WeekEvent) other;
            return this.kind == weekEvent.kind && Intrinsics.areEqual(this.title, weekEvent.title) && Intrinsics.areEqual(this.subtitle, weekEvent.subtitle) && this.timeMs == weekEvent.timeMs;
        }

        public int hashCode() {
            int hashCode = ((this.kind.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Long.hashCode(this.timeMs);
        }

        public String toString() {
            return "WeekEvent(kind=" + this.kind + ", title=" + this.title + ", subtitle=" + this.subtitle + ", timeMs=" + this.timeMs + ")";
        }

        public WeekEvent(EventKind kind, String title, String str, long j) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(title, "title");
            this.kind = kind;
            this.title = title;
            this.subtitle = str;
            this.timeMs = j;
        }

        public final EventKind getKind() {
            return this.kind;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final long getTimeMs() {
            return this.timeMs;
        }
    }

    /* compiled from: TrainingWeekPlanner.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010\u001e\u001a\u00020\fHÆ\u0003J\t\u0010\u001f\u001a\u00020\fHÆ\u0003JK\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\fHÆ\u0001J\u0013\u0010!\u001a\u00020\u00072\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0014R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018¨\u0006&"}, d2 = {"Lcom/example/rungps/analytics/TrainingWeekPlanner$WeekDay;", "", "date", "Ljava/time/LocalDate;", "dayLabel", "", "isToday", "", "events", "", "Lcom/example/rungps/analytics/TrainingWeekPlanner$WeekEvent;", "runKm", "", "gymTonnageKg", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;ZLjava/util/List;DD)V", "getDate", "()Ljava/time/LocalDate;", "getDayLabel", "()Ljava/lang/String;", "()Z", "getEvents", "()Ljava/util/List;", "getRunKm", "()D", "getGymTonnageKg", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeekDay {
        public static final int $stable = 8;
        private final LocalDate date;
        private final String dayLabel;
        private final List<WeekEvent> events;
        private final double gymTonnageKg;
        private final boolean isToday;
        private final double runKm;

        /* renamed from: component1, reason: from getter */
        public final LocalDate getDate() {
            return this.date;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDayLabel() {
            return this.dayLabel;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsToday() {
            return this.isToday;
        }

        public final List<WeekEvent> component4() {
            return this.events;
        }

        /* renamed from: component5, reason: from getter */
        public final double getRunKm() {
            return this.runKm;
        }

        /* renamed from: component6, reason: from getter */
        public final double getGymTonnageKg() {
            return this.gymTonnageKg;
        }

        public final WeekDay copy(LocalDate date, String dayLabel, boolean isToday, List<WeekEvent> events, double runKm, double gymTonnageKg) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(dayLabel, "dayLabel");
            Intrinsics.checkNotNullParameter(events, "events");
            return new WeekDay(date, dayLabel, isToday, events, runKm, gymTonnageKg);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeekDay)) {
                return false;
            }
            WeekDay weekDay = (WeekDay) other;
            return Intrinsics.areEqual(this.date, weekDay.date) && Intrinsics.areEqual(this.dayLabel, weekDay.dayLabel) && this.isToday == weekDay.isToday && Intrinsics.areEqual(this.events, weekDay.events) && Double.compare(this.runKm, weekDay.runKm) == 0 && Double.compare(this.gymTonnageKg, weekDay.gymTonnageKg) == 0;
        }

        public int hashCode() {
            return (((((((((this.date.hashCode() * 31) + this.dayLabel.hashCode()) * 31) + Boolean.hashCode(this.isToday)) * 31) + this.events.hashCode()) * 31) + Double.hashCode(this.runKm)) * 31) + Double.hashCode(this.gymTonnageKg);
        }

        public String toString() {
            return "WeekDay(date=" + this.date + ", dayLabel=" + this.dayLabel + ", isToday=" + this.isToday + ", events=" + this.events + ", runKm=" + this.runKm + ", gymTonnageKg=" + this.gymTonnageKg + ")";
        }

        public WeekDay(LocalDate date, String dayLabel, boolean z, List<WeekEvent> events, double d, double d2) {
            Intrinsics.checkNotNullParameter(date, "date");
            Intrinsics.checkNotNullParameter(dayLabel, "dayLabel");
            Intrinsics.checkNotNullParameter(events, "events");
            this.date = date;
            this.dayLabel = dayLabel;
            this.isToday = z;
            this.events = events;
            this.runKm = d;
            this.gymTonnageKg = d2;
        }

        public final LocalDate getDate() {
            return this.date;
        }

        public final String getDayLabel() {
            return this.dayLabel;
        }

        public final boolean isToday() {
            return this.isToday;
        }

        public final List<WeekEvent> getEvents() {
            return this.events;
        }

        public final double getRunKm() {
            return this.runKm;
        }

        public final double getGymTonnageKg() {
            return this.gymTonnageKg;
        }
    }

    /* compiled from: TrainingWeekPlanner.kt */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\fHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u001bJ\\\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\fHÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\r\u001a\u0004\u0018\u00010\t¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001b¨\u0006,"}, d2 = {"Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "", "weekStart", "Ljava/time/LocalDate;", "weekEnd", "days", "", "Lcom/example/rungps/analytics/TrainingWeekPlanner$WeekDay;", "totalRunKm", "", "totalGymKg", "sleepNights", "", "avgSleepHours", "<init>", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;DDILjava/lang/Double;)V", "getWeekStart", "()Ljava/time/LocalDate;", "getWeekEnd", "getDays", "()Ljava/util/List;", "getTotalRunKm", "()D", "getTotalGymKg", "getSleepNights", "()I", "getAvgSleepHours", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/util/List;DDILjava/lang/Double;)Lcom/example/rungps/analytics/TrainingWeekPlanner$TrainingWeekView;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrainingWeekView {
        public static final int $stable = 8;
        private final Double avgSleepHours;
        private final List<WeekDay> days;
        private final int sleepNights;
        private final double totalGymKg;
        private final double totalRunKm;
        private final LocalDate weekEnd;
        private final LocalDate weekStart;

        /* renamed from: component1, reason: from getter */
        public final LocalDate getWeekStart() {
            return this.weekStart;
        }

        /* renamed from: component2, reason: from getter */
        public final LocalDate getWeekEnd() {
            return this.weekEnd;
        }

        public final List<WeekDay> component3() {
            return this.days;
        }

        /* renamed from: component4, reason: from getter */
        public final double getTotalRunKm() {
            return this.totalRunKm;
        }

        /* renamed from: component5, reason: from getter */
        public final double getTotalGymKg() {
            return this.totalGymKg;
        }

        /* renamed from: component6, reason: from getter */
        public final int getSleepNights() {
            return this.sleepNights;
        }

        /* renamed from: component7, reason: from getter */
        public final Double getAvgSleepHours() {
            return this.avgSleepHours;
        }

        public final TrainingWeekView copy(LocalDate weekStart, LocalDate weekEnd, List<WeekDay> days, double totalRunKm, double totalGymKg, int sleepNights, Double avgSleepHours) {
            Intrinsics.checkNotNullParameter(weekStart, "weekStart");
            Intrinsics.checkNotNullParameter(weekEnd, "weekEnd");
            Intrinsics.checkNotNullParameter(days, "days");
            return new TrainingWeekView(weekStart, weekEnd, days, totalRunKm, totalGymKg, sleepNights, avgSleepHours);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrainingWeekView)) {
                return false;
            }
            TrainingWeekView trainingWeekView = (TrainingWeekView) other;
            return Intrinsics.areEqual(this.weekStart, trainingWeekView.weekStart) && Intrinsics.areEqual(this.weekEnd, trainingWeekView.weekEnd) && Intrinsics.areEqual(this.days, trainingWeekView.days) && Double.compare(this.totalRunKm, trainingWeekView.totalRunKm) == 0 && Double.compare(this.totalGymKg, trainingWeekView.totalGymKg) == 0 && this.sleepNights == trainingWeekView.sleepNights && Intrinsics.areEqual((Object) this.avgSleepHours, (Object) trainingWeekView.avgSleepHours);
        }

        public int hashCode() {
            int hashCode = ((((((((((this.weekStart.hashCode() * 31) + this.weekEnd.hashCode()) * 31) + this.days.hashCode()) * 31) + Double.hashCode(this.totalRunKm)) * 31) + Double.hashCode(this.totalGymKg)) * 31) + Integer.hashCode(this.sleepNights)) * 31;
            Double d = this.avgSleepHours;
            return hashCode + (d == null ? 0 : d.hashCode());
        }

        public String toString() {
            return "TrainingWeekView(weekStart=" + this.weekStart + ", weekEnd=" + this.weekEnd + ", days=" + this.days + ", totalRunKm=" + this.totalRunKm + ", totalGymKg=" + this.totalGymKg + ", sleepNights=" + this.sleepNights + ", avgSleepHours=" + this.avgSleepHours + ")";
        }

        public TrainingWeekView(LocalDate weekStart, LocalDate weekEnd, List<WeekDay> days, double d, double d2, int i, Double d3) {
            Intrinsics.checkNotNullParameter(weekStart, "weekStart");
            Intrinsics.checkNotNullParameter(weekEnd, "weekEnd");
            Intrinsics.checkNotNullParameter(days, "days");
            this.weekStart = weekStart;
            this.weekEnd = weekEnd;
            this.days = days;
            this.totalRunKm = d;
            this.totalGymKg = d2;
            this.sleepNights = i;
            this.avgSleepHours = d3;
        }

        public final LocalDate getWeekStart() {
            return this.weekStart;
        }

        public final LocalDate getWeekEnd() {
            return this.weekEnd;
        }

        public final List<WeekDay> getDays() {
            return this.days;
        }

        public final double getTotalRunKm() {
            return this.totalRunKm;
        }

        public final double getTotalGymKg() {
            return this.totalGymKg;
        }

        public final int getSleepNights() {
            return this.sleepNights;
        }

        public final Double getAvgSleepHours() {
            return this.avgSleepHours;
        }
    }

    public static /* synthetic */ TrainingWeekView build$default(TrainingWeekPlanner trainingWeekPlanner, List list, List list2, Map map, List list3, ZoneId zoneId, LocalDate localDate, LocalDate localDate2, int i, Object obj) {
        ZoneId systemDefault = (i & 16) != 0 ? ZoneId.systemDefault() : zoneId;
        return trainingWeekPlanner.build(list, list2, map, list3, systemDefault, (i & 32) != 0 ? LocalDate.now(systemDefault) : localDate, (i & 64) != 0 ? null : localDate2);
    }

    public final TrainingWeekView build(List<RunEntity> runs, List<GymSessionEntity> gymSessions, Map<Long, Double> gymTonnageBySession, List<HealthConnectManager.SleepWindow> sleepWindows, ZoneId zone, LocalDate today, LocalDate weekStartMonday) {
        Double d;
        Iterator<Integer> it;
        ArrayList arrayList;
        Object next;
        Iterator it2;
        String str;
        ZoneId zone2 = zone;
        Intrinsics.checkNotNullParameter(runs, "runs");
        Intrinsics.checkNotNullParameter(gymSessions, "gymSessions");
        Intrinsics.checkNotNullParameter(gymTonnageBySession, "gymTonnageBySession");
        Intrinsics.checkNotNullParameter(sleepWindows, "sleepWindows");
        Intrinsics.checkNotNullParameter(zone2, "zone");
        Intrinsics.checkNotNullParameter(today, "today");
        LocalDate with = weekStartMonday == null ? today.with((TemporalAdjuster) DayOfWeek.MONDAY) : weekStartMonday;
        LocalDate plusDays = with.plusDays(6L);
        long epochMilli = with.atStartOfDay(zone2).toInstant().toEpochMilli();
        long j = 1;
        long epochMilli2 = plusDays.plusDays(1L).atStartOfDay(zone2).toInstant().toEpochMilli();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : runs) {
            long startedAtMs = ((RunEntity) obj).getStartedAtMs();
            if (epochMilli <= startedAtMs && startedAtMs < epochMilli2) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : gymSessions) {
            GymSessionEntity gymSessionEntity = (GymSessionEntity) obj2;
            Long endedAtMs = gymSessionEntity.getEndedAtMs();
            long longValue = endedAtMs != null ? endedAtMs.longValue() : gymSessionEntity.getStartedAtMs();
            if (epochMilli <= longValue && longValue < epochMilli2) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = arrayList4;
        IntRange intRange = new IntRange(0, 6);
        ArrayList arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRange, 10));
        Iterator<Integer> it3 = intRange.iterator();
        while (true) {
            ArrayList arrayList7 = arrayList3;
            if (!it3.hasNext()) {
                break;
            }
            LocalDate plusDays2 = with.plusDays(((IntIterator) it3).nextInt());
            long epochMilli3 = plusDays2.atStartOfDay(zone2).toInstant().toEpochMilli();
            long epochMilli4 = plusDays2.plusDays(j).atStartOfDay(zone2).toInstant().toEpochMilli();
            ArrayList arrayList8 = new ArrayList();
            for (Object obj3 : arrayList7) {
                long startedAtMs2 = ((RunEntity) obj3).getStartedAtMs();
                if (epochMilli3 <= startedAtMs2 && startedAtMs2 < epochMilli4) {
                    arrayList8.add(obj3);
                }
            }
            ArrayList arrayList9 = arrayList8;
            ArrayList arrayList10 = new ArrayList();
            for (Object obj4 : arrayList5) {
                GymSessionEntity gymSessionEntity2 = (GymSessionEntity) obj4;
                Long endedAtMs2 = gymSessionEntity2.getEndedAtMs();
                long longValue2 = endedAtMs2 != null ? endedAtMs2.longValue() : gymSessionEntity2.getStartedAtMs();
                if (epochMilli3 <= longValue2 && longValue2 < epochMilli4) {
                    arrayList10.add(obj4);
                }
            }
            ArrayList arrayList11 = arrayList10;
            ArrayList arrayList12 = new ArrayList();
            for (Object obj5 : sleepWindows) {
                if (Intrinsics.areEqual(((HealthConnectManager.SleepWindow) obj5).getEndTime().atZone(zone2).toLocalDate(), plusDays2)) {
                    arrayList12.add(obj5);
                }
            }
            ArrayList arrayList13 = arrayList12;
            ArrayList arrayList14 = new ArrayList();
            ArrayList arrayList15 = arrayList9;
            Iterator it4 = CollectionsKt.sortedWith(arrayList15, new Comparator() { // from class: com.example.rungps.analytics.TrainingWeekPlanner$build$lambda$15$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((RunEntity) t2).getStartedAtMs()), Long.valueOf(((RunEntity) t).getStartedAtMs()));
                }
            }).iterator();
            while (true) {
                it = it3;
                arrayList = arrayList5;
                if (!it4.hasNext()) {
                    break;
                }
                RunEntity runEntity = (RunEntity) it4.next();
                double totalDistanceM = runEntity.getTotalDistanceM() / 1000.0d;
                int roundToInt = MathKt.roundToInt(runEntity.getTotalDurationMs() / 60000.0d);
                ArrayList arrayList16 = arrayList14;
                Iterator it5 = it4;
                EventKind eventKind = EventKind.RUN;
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                LocalDate localDate = plusDays;
                LocalDate localDate2 = with;
                String format = String.format(Locale.US, "%.2f km run", Arrays.copyOf(new Object[]{Double.valueOf(totalDistanceM)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                arrayList16.add(new WeekEvent(eventKind, format, roundToInt > 0 ? roundToInt + " min" : null, runEntity.getStartedAtMs()));
                it3 = it;
                arrayList5 = arrayList;
                it4 = it5;
                plusDays = localDate;
                with = localDate2;
            }
            LocalDate localDate3 = with;
            LocalDate localDate4 = plusDays;
            ArrayList arrayList17 = arrayList11;
            Iterator it6 = CollectionsKt.sortedWith(arrayList17, new Comparator() { // from class: com.example.rungps.analytics.TrainingWeekPlanner$build$lambda$15$$inlined$sortedByDescending$2
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((GymSessionEntity) t2).getStartedAtMs()), Long.valueOf(((GymSessionEntity) t).getStartedAtMs()));
                }
            }).iterator();
            while (it6.hasNext()) {
                GymSessionEntity gymSessionEntity3 = (GymSessionEntity) it6.next();
                Double d2 = gymTonnageBySession.get(Long.valueOf(gymSessionEntity3.getId()));
                double doubleValue = d2 != null ? d2.doubleValue() : 0.0d;
                ArrayList arrayList18 = arrayList14;
                EventKind eventKind2 = EventKind.GYM;
                String str2 = gymSessionEntity3.getFreeDay() ? "Gym · free day" : "Gym session";
                if (doubleValue > 0.0d) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    it2 = it6;
                    String format2 = String.format(Locale.US, "%.0f kg volume", Arrays.copyOf(new Object[]{Double.valueOf(doubleValue)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                    str = format2;
                } else {
                    it2 = it6;
                    str = null;
                }
                arrayList18.add(new WeekEvent(eventKind2, str2, str, gymSessionEntity3.getStartedAtMs()));
                it6 = it2;
            }
            Iterator it7 = arrayList13.iterator();
            if (it7.hasNext()) {
                next = it7.next();
                if (it7.hasNext()) {
                    Instant endTime = ((HealthConnectManager.SleepWindow) next).getEndTime();
                    do {
                        Object next2 = it7.next();
                        Instant endTime2 = ((HealthConnectManager.SleepWindow) next2).getEndTime();
                        if (endTime.compareTo(endTime2) < 0) {
                            next = next2;
                            endTime = endTime2;
                        }
                    } while (it7.hasNext());
                }
            } else {
                next = null;
            }
            HealthConnectManager.SleepWindow sleepWindow = (HealthConnectManager.SleepWindow) next;
            if (sleepWindow != null) {
                ArrayList arrayList19 = arrayList14;
                EventKind eventKind3 = EventKind.SLEEP;
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String format3 = String.format(Locale.US, "%.1f h sleep", Arrays.copyOf(new Object[]{Double.valueOf(sleepWindow.getAsleepMin() / 60.0d)}, 1));
                Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                Integer efficiencyPercent = sleepWindow.getEfficiencyPercent();
                arrayList19.add(new WeekEvent(eventKind3, format3, efficiencyPercent != null ? efficiencyPercent.intValue() + "% efficiency" : null, sleepWindow.getEndTime().toEpochMilli()));
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            if (arrayList14.isEmpty() && plusDays2.isBefore(today)) {
                arrayList14.add(new WeekEvent(EventKind.REST_HINT, "Rest day", null, epochMilli3));
            }
            Iterator it8 = arrayList15.iterator();
            double d3 = 0.0d;
            while (it8.hasNext()) {
                d3 += RangesKt.coerceAtLeast(((RunEntity) it8.next()).getTotalDistanceM() / 1000.0d, 0.0d);
            }
            Iterator it9 = arrayList17.iterator();
            double d4 = 0.0d;
            while (it9.hasNext()) {
                Double d5 = gymTonnageBySession.get(Long.valueOf(((GymSessionEntity) it9.next()).getId()));
                d4 += d5 != null ? d5.doubleValue() : 0.0d;
            }
            Intrinsics.checkNotNull(plusDays2);
            String displayName = plusDays2.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.getDefault());
            Intrinsics.checkNotNullExpressionValue(displayName, "getDisplayName(...)");
            arrayList6.add(new WeekDay(plusDays2, displayName, Intrinsics.areEqual(plusDays2, today), CollectionsKt.sortedWith(arrayList14, new Comparator() { // from class: com.example.rungps.analytics.TrainingWeekPlanner$build$lambda$15$$inlined$sortedByDescending$3
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Long.valueOf(((TrainingWeekPlanner.WeekEvent) t2).getTimeMs()), Long.valueOf(((TrainingWeekPlanner.WeekEvent) t).getTimeMs()));
                }
            }), d3, d4));
            arrayList3 = arrayList7;
            zone2 = zone;
            it3 = it;
            arrayList5 = arrayList;
            plusDays = localDate4;
            with = localDate3;
            j = 1;
        }
        LocalDate localDate5 = with;
        LocalDate localDate6 = plusDays;
        ArrayList arrayList20 = arrayList6;
        ArrayList arrayList21 = new ArrayList();
        for (Object obj6 : sleepWindows) {
            LocalDate localDate7 = ((HealthConnectManager.SleepWindow) obj6).getEndTime().atZone(zone).toLocalDate();
            if (!localDate7.isBefore(localDate5) && !localDate7.isAfter(localDate6)) {
                arrayList21.add(obj6);
            }
        }
        ArrayList arrayList22 = arrayList21;
        ArrayList arrayList23 = !arrayList22.isEmpty() ? arrayList22 : null;
        if (arrayList23 != null) {
            ArrayList arrayList24 = arrayList23;
            ArrayList arrayList25 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList24, 10));
            Iterator it10 = arrayList24.iterator();
            while (it10.hasNext()) {
                arrayList25.add(Double.valueOf(((HealthConnectManager.SleepWindow) it10.next()).getAsleepMin() / 60.0d));
            }
            d = Double.valueOf(CollectionsKt.averageOfDouble(arrayList25));
        } else {
            d = null;
        }
        Intrinsics.checkNotNull(localDate5);
        Intrinsics.checkNotNull(localDate6);
        ArrayList arrayList26 = arrayList20;
        Iterator it11 = arrayList26.iterator();
        double d6 = 0.0d;
        while (it11.hasNext()) {
            d6 += ((WeekDay) it11.next()).getRunKm();
        }
        Iterator it12 = arrayList26.iterator();
        double d7 = 0.0d;
        while (it12.hasNext()) {
            d7 += ((WeekDay) it12.next()).getGymTonnageKg();
        }
        return new TrainingWeekView(localDate5, localDate6, arrayList20, d6, d7, arrayList22.size(), d);
    }
}
