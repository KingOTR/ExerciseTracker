package com.example.rungps.core.domain.analytics;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.WeekFields;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CalendarWeekBounds.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bJ.\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b¨\u0006\r"}, d2 = {"Lcom/example/rungps/core/domain/analytics/CalendarWeekBounds;", "", "<init>", "()V", "weekStartMs", "", "nowMs", "zone", "Ljava/time/ZoneId;", "weekBoundsForOffset", "Lkotlin/Pair;", "weekOffset", "", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CalendarWeekBounds {
    public static final CalendarWeekBounds INSTANCE = new CalendarWeekBounds();

    private CalendarWeekBounds() {
    }

    public static /* synthetic */ long weekStartMs$default(CalendarWeekBounds calendarWeekBounds, long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 1) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return calendarWeekBounds.weekStartMs(j, zoneId);
    }

    public final long weekStartMs(long nowMs, ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        return Instant.ofEpochMilli(nowMs).atZone(zone).toLocalDate().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1L).atStartOfDay(zone).toInstant().toEpochMilli();
    }

    public static /* synthetic */ Pair weekBoundsForOffset$default(CalendarWeekBounds calendarWeekBounds, int i, long j, ZoneId zoneId, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            j = System.currentTimeMillis();
        }
        if ((i2 & 4) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return calendarWeekBounds.weekBoundsForOffset(i, j, zoneId);
    }

    public final Pair<Long, Long> weekBoundsForOffset(int weekOffset, long nowMs, ZoneId zone) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        LocalDate minusWeeks = Instant.ofEpochMilli(nowMs).atZone(zone).toLocalDate().with(WeekFields.of(Locale.getDefault()).dayOfWeek(), 1L).minusWeeks(weekOffset);
        long epochMilli = minusWeeks.atStartOfDay(zone).toInstant().toEpochMilli();
        if (weekOffset != 0) {
            nowMs = minusWeeks.plusWeeks(1L).atStartOfDay(zone).toInstant().toEpochMilli() - 1;
        }
        return TuplesKt.to(Long.valueOf(epochMilli), Long.valueOf(nowMs));
    }
}
