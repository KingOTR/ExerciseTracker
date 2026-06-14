package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.SleepCalendarHelper;
import com.example.rungps.sleep.SleepDebtTracker;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;

/* compiled from: SleepWakePlanner.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eJ\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u0012H\u0002¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/sleep/SleepWakePlanner;", "", "<init>", "()V", "suggest", "Lcom/example/rungps/sleep/SleepWakePlanner$Suggestion;", "entries", "", "Lcom/example/rungps/data/SleepEntryEntity;", "calendarCommitment", "Lcom/example/rungps/sleep/SleepCalendarHelper$MorningCommitment;", "targetHoursPerNight", "", "zone", "Ljava/time/ZoneId;", "bedMinToTonightMs", "", "bedMin", "", "defaultBedTonightMs", "formatBedMin", "", "formatTime", "h", "m", "Suggestion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepWakePlanner {
    public static final int $stable = 0;
    public static final SleepWakePlanner INSTANCE = new SleepWakePlanner();

    private SleepWakePlanner() {
    }

    /* compiled from: SleepWakePlanner.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003JI\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011¨\u0006 "}, d2 = {"Lcom/example/rungps/sleep/SleepWakePlanner$Suggestion;", "", "alarmHour", "", "alarmMinute", "windowMin", "headline", "", "detail", "calendarNote", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlarmHour", "()I", "getAlarmMinute", "getWindowMin", "getHeadline", "()Ljava/lang/String;", "getDetail", "getCalendarNote", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Suggestion {
        public static final int $stable = 0;
        private final int alarmHour;
        private final int alarmMinute;
        private final String calendarNote;
        private final String detail;
        private final String headline;
        private final int windowMin;

        public static /* synthetic */ Suggestion copy$default(Suggestion suggestion, int i, int i2, int i3, String str, String str2, String str3, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                i = suggestion.alarmHour;
            }
            if ((i4 & 2) != 0) {
                i2 = suggestion.alarmMinute;
            }
            int i5 = i2;
            if ((i4 & 4) != 0) {
                i3 = suggestion.windowMin;
            }
            int i6 = i3;
            if ((i4 & 8) != 0) {
                str = suggestion.headline;
            }
            String str4 = str;
            if ((i4 & 16) != 0) {
                str2 = suggestion.detail;
            }
            String str5 = str2;
            if ((i4 & 32) != 0) {
                str3 = suggestion.calendarNote;
            }
            return suggestion.copy(i, i5, i6, str4, str5, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final int getAlarmHour() {
            return this.alarmHour;
        }

        /* renamed from: component2, reason: from getter */
        public final int getAlarmMinute() {
            return this.alarmMinute;
        }

        /* renamed from: component3, reason: from getter */
        public final int getWindowMin() {
            return this.windowMin;
        }

        /* renamed from: component4, reason: from getter */
        public final String getHeadline() {
            return this.headline;
        }

        /* renamed from: component5, reason: from getter */
        public final String getDetail() {
            return this.detail;
        }

        /* renamed from: component6, reason: from getter */
        public final String getCalendarNote() {
            return this.calendarNote;
        }

        public final Suggestion copy(int alarmHour, int alarmMinute, int windowMin, String headline, String detail, String calendarNote) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            return new Suggestion(alarmHour, alarmMinute, windowMin, headline, detail, calendarNote);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suggestion)) {
                return false;
            }
            Suggestion suggestion = (Suggestion) other;
            return this.alarmHour == suggestion.alarmHour && this.alarmMinute == suggestion.alarmMinute && this.windowMin == suggestion.windowMin && Intrinsics.areEqual(this.headline, suggestion.headline) && Intrinsics.areEqual(this.detail, suggestion.detail) && Intrinsics.areEqual(this.calendarNote, suggestion.calendarNote);
        }

        public int hashCode() {
            int hashCode = ((((((Integer.hashCode(this.alarmHour) * 31) + Integer.hashCode(this.alarmMinute)) * 31) + Integer.hashCode(this.windowMin)) * 31) + this.headline.hashCode()) * 31;
            String str = this.detail;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.calendarNote;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        public String toString() {
            return "Suggestion(alarmHour=" + this.alarmHour + ", alarmMinute=" + this.alarmMinute + ", windowMin=" + this.windowMin + ", headline=" + this.headline + ", detail=" + this.detail + ", calendarNote=" + this.calendarNote + ")";
        }

        public Suggestion(int i, int i2, int i3, String headline, String str, String str2) {
            Intrinsics.checkNotNullParameter(headline, "headline");
            this.alarmHour = i;
            this.alarmMinute = i2;
            this.windowMin = i3;
            this.headline = headline;
            this.detail = str;
            this.calendarNote = str2;
        }

        public final int getAlarmHour() {
            return this.alarmHour;
        }

        public final int getAlarmMinute() {
            return this.alarmMinute;
        }

        public final int getWindowMin() {
            return this.windowMin;
        }

        public final String getHeadline() {
            return this.headline;
        }

        public final String getDetail() {
            return this.detail;
        }

        public final String getCalendarNote() {
            return this.calendarNote;
        }
    }

    public static /* synthetic */ Suggestion suggest$default(SleepWakePlanner sleepWakePlanner, List list, SleepCalendarHelper.MorningCommitment morningCommitment, double d, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            morningCommitment = null;
        }
        SleepCalendarHelper.MorningCommitment morningCommitment2 = morningCommitment;
        if ((i & 4) != 0) {
            d = 8.0d;
        }
        double d2 = d;
        if ((i & 8) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return sleepWakePlanner.suggest(list, morningCommitment2, d2, zoneId);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0296  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Suggestion suggest(List<SleepEntryEntity> entries, SleepCalendarHelper.MorningCommitment calendarCommitment, double targetHoursPerNight, ZoneId zone) {
        long defaultBedTonightMs;
        int i;
        String str;
        String str2;
        String str3;
        String str4;
        int hour;
        Intrinsics.checkNotNullParameter(entries, "entries");
        Intrinsics.checkNotNullParameter(zone, "zone");
        SleepDebtTracker.Snapshot analyze$default = SleepDebtTracker.analyze$default(SleepDebtTracker.INSTANCE, entries, targetHoursPerNight, 0, 0, null, 28, null);
        double coerceIn = analyze$default.getNightsInWindow() > 0 ? RangesKt.coerceIn(analyze$default.getDebtHours() / analyze$default.getNightsInWindow(), 0.0d, 1.5d) : 0.0d;
        double d = 60;
        int roundToInt = MathKt.roundToInt((targetHoursPerNight + coerceIn) * d);
        List<SleepEntryEntity> list = entries;
        List take = CollectionsKt.take(list, 14);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(take, 10));
        Iterator it = take.iterator();
        while (it.hasNext()) {
            ZonedDateTime atZone = Instant.ofEpochMilli(((SleepEntryEntity) it.next()).getStartTimeMs()).atZone(zone);
            arrayList.add(Integer.valueOf((atZone.getHour() * 60) + atZone.getMinute()));
        }
        ArrayList arrayList2 = arrayList;
        List take2 = CollectionsKt.take(list, 14);
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(take2, 10));
        Iterator it2 = take2.iterator();
        while (it2.hasNext()) {
            ZonedDateTime atZone2 = Instant.ofEpochMilli(((SleepEntryEntity) it2.next()).getEndTimeMs()).atZone(zone);
            arrayList3.add(Integer.valueOf((atZone2.getHour() * 60) + atZone2.getMinute()));
        }
        SleepScoring.SleepRhythm sleepRhythm = SleepScoring.INSTANCE.sleepRhythm(arrayList2, arrayList3);
        if (sleepRhythm != null) {
            defaultBedTonightMs = INSTANCE.bedMinToTonightMs(sleepRhythm.getIdealBedMin(), zone);
        } else {
            defaultBedTonightMs = defaultBedTonightMs(zone);
        }
        long j = defaultBedTonightMs + (roundToInt * 60000);
        Long valueOf = (calendarCommitment == null || 5 > (hour = Instant.ofEpochMilli(calendarCommitment.getStartMs()).atZone(zone).getHour()) || hour >= 14) ? null : Long.valueOf(SleepCalendarHelper.MorningCommitment.wakeByMs$default(calendarCommitment, 0, 1, null));
        long min = valueOf != null ? Math.min(j, valueOf.longValue()) : j;
        ZonedDateTime atZone3 = Instant.ofEpochMilli(min).atZone(zone);
        int hour2 = atZone3.getHour();
        int snapAlarmMinute = SleepAlarmPreferences.INSTANCE.snapAlarmMinute(atZone3.getMinute());
        int coerceAtLeast = RangesKt.coerceAtLeast((int) ((j - min) / 60000), 0);
        if (calendarCommitment != null && coerceAtLeast >= 45) {
            i = 12;
        } else if (calendarCommitment == null || coerceAtLeast < 20) {
            i = (sleepRhythm == null || sleepRhythm.getRegularityScore() < 75) ? 30 : 22;
        } else {
            i = 18;
        }
        int coerceIn2 = RangesKt.coerceIn(i, 10, 45);
        long j2 = min;
        double d2 = roundToInt / 60.0d;
        StringBuilder sb = new StringBuilder();
        SleepWakePlanner sleepWakePlanner = INSTANCE;
        sb.append("Wake " + sleepWakePlanner.formatTime(hour2, snapAlarmMinute));
        sb.append(" · " + coerceIn2 + " min window");
        if (coerceIn > 0.2d) {
            sb.append(" · +" + MathKt.roundToInt(coerceIn * d) + "m for debt");
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        if (sleepRhythm != null) {
            String formatBedMin = sleepWakePlanner.formatBedMin(sleepRhythm.getIdealBedMin());
            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            String str5 = "Bed ~" + formatBedMin + " · " + format + " h target";
            if (str5 != null) {
                str = str5;
                if (calendarCommitment == null) {
                    String formatCommitment = SleepCalendarHelper.INSTANCE.formatCommitment(calendarCommitment, zone);
                    if (valueOf != null && j2 <= valueOf.longValue() + 60000) {
                        str3 = "Calendar: " + formatCommitment;
                    } else if (calendarCommitment.getAllDayEvents().isEmpty() && calendarCommitment.getTravelDetail() == null) {
                        str4 = null;
                        str2 = str4;
                    } else {
                        str3 = "Tomorrow: " + formatCommitment;
                    }
                    str4 = str3;
                    str2 = str4;
                } else {
                    str2 = null;
                }
                return new Suggestion(hour2, snapAlarmMinute, coerceIn2, sb2, str, str2);
            }
        }
        String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(d2)}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        str = format2 + " h sleep target";
        if (calendarCommitment == null) {
        }
        return new Suggestion(hour2, snapAlarmMinute, coerceIn2, sb2, str, str2);
    }

    private final long bedMinToTonightMs(int bedMin, ZoneId zone) {
        ZonedDateTime now = ZonedDateTime.now(zone);
        ZonedDateTime withNano = now.withHour(bedMin / 60).withMinute(bedMin % 60).withSecond(0).withNano(0);
        if (withNano.isBefore(now.minusMinutes(30L))) {
            withNano = withNano.plusDays(1L);
        }
        return withNano.toInstant().toEpochMilli();
    }

    private final long defaultBedTonightMs(ZoneId zone) {
        ZonedDateTime now = ZonedDateTime.now(zone);
        ZonedDateTime withNano = now.withHour(23).withMinute(0).withSecond(0).withNano(0);
        if (!withNano.isAfter(now)) {
            withNano = withNano.plusDays(1L);
        }
        return withNano.toInstant().toEpochMilli();
    }

    private final String formatBedMin(int bedMin) {
        return formatTime(bedMin / 60, bedMin % 60);
    }

    private final String formatTime(int h, int m) {
        String format = LocalTime.of(RangesKt.coerceIn(h, 0, 23), RangesKt.coerceIn(m, 0, 59)).format(DateTimeFormatter.ofPattern("h:mm a"));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
