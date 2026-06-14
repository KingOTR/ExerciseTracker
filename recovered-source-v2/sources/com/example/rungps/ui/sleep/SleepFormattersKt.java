package com.example.rungps.ui.sleep;

import com.example.rungps.sleep.SleepEntryValidator;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;

/* compiled from: SleepFormatters.kt */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u001a\u000e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u000e\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0013\u001a\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u000b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0003\"\u0011\u0010\b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0003¨\u0006\u0019"}, d2 = {"sleepAmPmFmt", "Ljava/time/format/DateTimeFormatter;", "getSleepAmPmFmt", "()Ljava/time/format/DateTimeFormatter;", "sleepDayFmt", "sleepWeekdayFmt", "sleepAmPmParseFmt", "getSleepAmPmParseFmt", "sleepAmPmCompactParseFmt", "getSleepAmPmCompactParseFmt", "formatSleepRange", "", "startMs", "", "endMs", "zone", "Ljava/time/ZoneId;", "formatMinsSinceMidnightAmPm", "minsSinceMidnight", "", "formatDurationMinutes", "totalMin", "parseSleepClockTime", "Ljava/time/LocalTime;", "text", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepFormattersKt {
    private static final DateTimeFormatter sleepAmPmCompactParseFmt;
    private static final DateTimeFormatter sleepAmPmFmt;
    private static final DateTimeFormatter sleepAmPmParseFmt;
    private static final DateTimeFormatter sleepDayFmt;
    private static final DateTimeFormatter sleepWeekdayFmt;

    public static final DateTimeFormatter getSleepAmPmFmt() {
        return sleepAmPmFmt;
    }

    static {
        DateTimeFormatter ofPattern = DateTimeFormatter.ofPattern("h:mm a", Locale.US);
        Intrinsics.checkNotNullExpressionValue(ofPattern, "ofPattern(...)");
        sleepAmPmFmt = ofPattern;
        DateTimeFormatter ofPattern2 = DateTimeFormatter.ofPattern("EEE MMM d", Locale.US);
        Intrinsics.checkNotNullExpressionValue(ofPattern2, "ofPattern(...)");
        sleepDayFmt = ofPattern2;
        DateTimeFormatter ofPattern3 = DateTimeFormatter.ofPattern("EEE", Locale.US);
        Intrinsics.checkNotNullExpressionValue(ofPattern3, "ofPattern(...)");
        sleepWeekdayFmt = ofPattern3;
        DateTimeFormatter formatter = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("h:mm a").toFormatter(Locale.US);
        Intrinsics.checkNotNullExpressionValue(formatter, "toFormatter(...)");
        sleepAmPmParseFmt = formatter;
        DateTimeFormatter formatter2 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendPattern("h:mma").toFormatter(Locale.US);
        Intrinsics.checkNotNullExpressionValue(formatter2, "toFormatter(...)");
        sleepAmPmCompactParseFmt = formatter2;
    }

    public static final DateTimeFormatter getSleepAmPmParseFmt() {
        return sleepAmPmParseFmt;
    }

    public static final DateTimeFormatter getSleepAmPmCompactParseFmt() {
        return sleepAmPmCompactParseFmt;
    }

    public static /* synthetic */ String formatSleepRange$default(long j, long j2, ZoneId zoneId, int i, Object obj) {
        if ((i & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return formatSleepRange(j, j2, zoneId);
    }

    public static final String formatSleepRange(long j, long j2, ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        ZonedDateTime atZone = Instant.ofEpochMilli(j).atZone(zone);
        ZonedDateTime atZone2 = Instant.ofEpochMilli(j2).atZone(zone);
        if (Intrinsics.areEqual(atZone.toLocalDate(), atZone2.toLocalDate())) {
            String format = atZone.format(sleepDayFmt);
            DateTimeFormatter dateTimeFormatter = sleepAmPmFmt;
            return format + " · " + atZone.format(dateTimeFormatter) + " → " + atZone2.format(dateTimeFormatter);
        }
        DateTimeFormatter dateTimeFormatter2 = sleepWeekdayFmt;
        String format2 = atZone.format(dateTimeFormatter2);
        DateTimeFormatter dateTimeFormatter3 = sleepAmPmFmt;
        return format2 + " " + atZone.format(dateTimeFormatter3) + " → " + atZone2.format(dateTimeFormatter2) + " " + atZone2.format(dateTimeFormatter3);
    }

    public static final String formatMinsSinceMidnightAmPm(int i) {
        int i2 = ((i % SleepEntryValidator.MAX_SLEEP_MIN) + SleepEntryValidator.MAX_SLEEP_MIN) % SleepEntryValidator.MAX_SLEEP_MIN;
        String format = LocalTime.of(i2 / 60, i2 % 60).format(sleepAmPmFmt);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final String formatDurationMinutes(int i) {
        if (i <= 0) {
            return "0m";
        }
        int i2 = i / 60;
        int i3 = i % 60;
        if (i2 <= 0) {
            return i3 + "m";
        }
        if (i3 != 0) {
            return i2 + "h " + i3 + "m";
        }
        return i2 + "h";
    }

    public static final LocalTime parseSleepClockTime(String text) {
        int i;
        int i2;
        Intrinsics.checkNotNullParameter(text, "text");
        String replace = new Regex("\\s+").replace(StringsKt.trim((CharSequence) text).toString(), " ");
        LocalTime localTime = null;
        List split$default = StringsKt.split$default((CharSequence) replace, new String[]{":"}, false, 0, 6, (Object) null);
        if (split$default.size() == 2) {
            CharSequence charSequence = (CharSequence) split$default.get(0);
            for (0; i < charSequence.length(); i + 1) {
                i = Character.isDigit(charSequence.charAt(i)) ? i + 1 : 0;
            }
            CharSequence charSequence2 = (CharSequence) split$default.get(1);
            for (0; i2 < charSequence2.length(); i2 + 1) {
                i2 = Character.isDigit(charSequence2.charAt(i2)) ? i2 + 1 : 0;
            }
            Integer intOrNull = StringsKt.toIntOrNull((String) split$default.get(0));
            if (intOrNull != null) {
                int intValue = intOrNull.intValue();
                Integer intOrNull2 = StringsKt.toIntOrNull((String) split$default.get(1));
                if (intOrNull2 != null) {
                    int intValue2 = intOrNull2.intValue();
                    if (intValue >= 0 && intValue < 24 && intValue2 >= 0 && intValue2 < 60) {
                        return LocalTime.of(intValue, intValue2);
                    }
                }
            }
            return null;
        }
        try {
            try {
                return LocalTime.parse(replace, sleepAmPmParseFmt);
            } catch (Exception unused) {
                return localTime;
            }
        } catch (Exception unused2) {
            localTime = LocalTime.parse(StringsKt.replace$default(replace, " ", "", false, 4, (Object) null), sleepAmPmCompactParseFmt);
            return localTime;
        }
    }
}
