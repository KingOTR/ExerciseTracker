package com.example.rungps.tracking;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: RunVoiceAnnouncer.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\t\u001a\u00020\u0005J\u0006\u0010\n\u001a\u00020\u0005J\u001e\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000fJ\u000e\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\r¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/tracking/RunVoiceAnnouncer;", "", "<init>", "()V", "activityStarted", "", "isBike", "", "activityStopped", "paused", "resumed", "kilometerSplit", "km", "", "splitDurationMs", "", "elapsedTime", "elapsedMs", "formatDuration", "ms", "formatPace", "secPerKm", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunVoiceAnnouncer {
    public static final int $stable = 0;
    public static final RunVoiceAnnouncer INSTANCE = new RunVoiceAnnouncer();

    private RunVoiceAnnouncer() {
    }

    public final String activityStarted(boolean isBike) {
        return isBike ? "Ride started" : "Run started";
    }

    public final String activityStopped(boolean isBike) {
        return isBike ? "Ride complete" : "Run complete";
    }

    public final String paused() {
        return "Paused";
    }

    public final String resumed() {
        return "Resumed";
    }

    public final String kilometerSplit(int km, long splitDurationMs, boolean isBike) {
        return km + " kilometer. Split " + formatDuration(splitDurationMs) + ".";
    }

    public final String elapsedTime(long elapsedMs, boolean isBike) {
        return formatDuration(elapsedMs) + " " + (isBike ? "riding" : "running") + ".";
    }

    public final String formatDuration(long ms) {
        long coerceAtLeast = RangesKt.coerceAtLeast(ms / 1000, 0L);
        long j = 3600;
        long j2 = coerceAtLeast / j;
        long j3 = 60;
        long j4 = (coerceAtLeast % j) / j3;
        long j5 = coerceAtLeast % j3;
        if (j2 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format(Locale.US, "%d hours %d minutes", Arrays.copyOf(new Object[]{Long.valueOf(j2), Long.valueOf(j4)}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            return format;
        }
        if (j4 > 0 && j5 > 0) {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format(Locale.US, "%d minutes %d seconds", Arrays.copyOf(new Object[]{Long.valueOf(j4), Long.valueOf(j5)}, 2));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            return format2;
        }
        if (j4 > 0) {
            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
            String format3 = String.format(Locale.US, "%d minutes", Arrays.copyOf(new Object[]{Long.valueOf(j4)}, 1));
            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
            return format3;
        }
        StringCompanionObject stringCompanionObject4 = StringCompanionObject.INSTANCE;
        String format4 = String.format(Locale.US, "%d seconds", Arrays.copyOf(new Object[]{Long.valueOf(j5)}, 1));
        Intrinsics.checkNotNullExpressionValue(format4, "format(...)");
        return format4;
    }

    public final String formatPace(int secPerKm) {
        if (secPerKm <= 0) {
            return "";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format(Locale.US, "Pace %d minutes %d seconds per kilometer", Arrays.copyOf(new Object[]{Integer.valueOf(secPerKm / 60), Integer.valueOf(secPerKm % 60)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
