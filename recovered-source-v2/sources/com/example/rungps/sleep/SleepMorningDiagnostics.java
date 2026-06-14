package com.example.rungps.sleep;

import android.content.Context;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.sleep.SleepMicCoverage;
import com.example.rungps.sleep.SleepMlPipelineStatus;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepMorningDiagnostics.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/sleep/SleepMorningDiagnostics;", "", "<init>", "()V", "load", "Lcom/example/rungps/sleep/SleepMorningDiagnostics$Snapshot;", "context", "Landroid/content/Context;", "shouldShowCard", "", "Snapshot", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMorningDiagnostics {
    public static final int $stable = 0;
    public static final SleepMorningDiagnostics INSTANCE = new SleepMorningDiagnostics();

    private SleepMorningDiagnostics() {
    }

    /* compiled from: SleepMorningDiagnostics.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0013J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\rHÆ\u0003Jr\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\r2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006-"}, d2 = {"Lcom/example/rungps/sleep/SleepMorningDiagnostics$Snapshot;", "", "pipelineLine", "", "micCoveragePercent", "", "micCoverageLabel", "batteryLine", "alarmLine", "trackingHealthLine", "smartAlarmUnavailable", "sampleCount", "serviceRunning", "", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getPipelineLine", "()Ljava/lang/String;", "getMicCoveragePercent", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMicCoverageLabel", "getBatteryLine", "getAlarmLine", "getTrackingHealthLine", "getSmartAlarmUnavailable", "getSampleCount", "()I", "getServiceRunning", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/example/rungps/sleep/SleepMorningDiagnostics$Snapshot;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 0;
        private final String alarmLine;
        private final String batteryLine;
        private final String micCoverageLabel;
        private final Integer micCoveragePercent;
        private final String pipelineLine;
        private final int sampleCount;
        private final boolean serviceRunning;
        private final String smartAlarmUnavailable;
        private final String trackingHealthLine;

        /* renamed from: component1, reason: from getter */
        public final String getPipelineLine() {
            return this.pipelineLine;
        }

        /* renamed from: component2, reason: from getter */
        public final Integer getMicCoveragePercent() {
            return this.micCoveragePercent;
        }

        /* renamed from: component3, reason: from getter */
        public final String getMicCoverageLabel() {
            return this.micCoverageLabel;
        }

        /* renamed from: component4, reason: from getter */
        public final String getBatteryLine() {
            return this.batteryLine;
        }

        /* renamed from: component5, reason: from getter */
        public final String getAlarmLine() {
            return this.alarmLine;
        }

        /* renamed from: component6, reason: from getter */
        public final String getTrackingHealthLine() {
            return this.trackingHealthLine;
        }

        /* renamed from: component7, reason: from getter */
        public final String getSmartAlarmUnavailable() {
            return this.smartAlarmUnavailable;
        }

        /* renamed from: component8, reason: from getter */
        public final int getSampleCount() {
            return this.sampleCount;
        }

        /* renamed from: component9, reason: from getter */
        public final boolean getServiceRunning() {
            return this.serviceRunning;
        }

        public final Snapshot copy(String pipelineLine, Integer micCoveragePercent, String micCoverageLabel, String batteryLine, String alarmLine, String trackingHealthLine, String smartAlarmUnavailable, int sampleCount, boolean serviceRunning) {
            Intrinsics.checkNotNullParameter(pipelineLine, "pipelineLine");
            Intrinsics.checkNotNullParameter(trackingHealthLine, "trackingHealthLine");
            return new Snapshot(pipelineLine, micCoveragePercent, micCoverageLabel, batteryLine, alarmLine, trackingHealthLine, smartAlarmUnavailable, sampleCount, serviceRunning);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return Intrinsics.areEqual(this.pipelineLine, snapshot.pipelineLine) && Intrinsics.areEqual(this.micCoveragePercent, snapshot.micCoveragePercent) && Intrinsics.areEqual(this.micCoverageLabel, snapshot.micCoverageLabel) && Intrinsics.areEqual(this.batteryLine, snapshot.batteryLine) && Intrinsics.areEqual(this.alarmLine, snapshot.alarmLine) && Intrinsics.areEqual(this.trackingHealthLine, snapshot.trackingHealthLine) && Intrinsics.areEqual(this.smartAlarmUnavailable, snapshot.smartAlarmUnavailable) && this.sampleCount == snapshot.sampleCount && this.serviceRunning == snapshot.serviceRunning;
        }

        public int hashCode() {
            int hashCode = this.pipelineLine.hashCode() * 31;
            Integer num = this.micCoveragePercent;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.micCoverageLabel;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.batteryLine;
            int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.alarmLine;
            int hashCode5 = (((hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.trackingHealthLine.hashCode()) * 31;
            String str4 = this.smartAlarmUnavailable;
            return ((((hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.sampleCount)) * 31) + Boolean.hashCode(this.serviceRunning);
        }

        public String toString() {
            return "Snapshot(pipelineLine=" + this.pipelineLine + ", micCoveragePercent=" + this.micCoveragePercent + ", micCoverageLabel=" + this.micCoverageLabel + ", batteryLine=" + this.batteryLine + ", alarmLine=" + this.alarmLine + ", trackingHealthLine=" + this.trackingHealthLine + ", smartAlarmUnavailable=" + this.smartAlarmUnavailable + ", sampleCount=" + this.sampleCount + ", serviceRunning=" + this.serviceRunning + ")";
        }

        public Snapshot(String pipelineLine, Integer num, String str, String str2, String str3, String trackingHealthLine, String str4, int i, boolean z) {
            Intrinsics.checkNotNullParameter(pipelineLine, "pipelineLine");
            Intrinsics.checkNotNullParameter(trackingHealthLine, "trackingHealthLine");
            this.pipelineLine = pipelineLine;
            this.micCoveragePercent = num;
            this.micCoverageLabel = str;
            this.batteryLine = str2;
            this.alarmLine = str3;
            this.trackingHealthLine = trackingHealthLine;
            this.smartAlarmUnavailable = str4;
            this.sampleCount = i;
            this.serviceRunning = z;
        }

        public final String getPipelineLine() {
            return this.pipelineLine;
        }

        public final Integer getMicCoveragePercent() {
            return this.micCoveragePercent;
        }

        public final String getMicCoverageLabel() {
            return this.micCoverageLabel;
        }

        public final String getBatteryLine() {
            return this.batteryLine;
        }

        public final String getAlarmLine() {
            return this.alarmLine;
        }

        public final String getTrackingHealthLine() {
            return this.trackingHealthLine;
        }

        public final String getSmartAlarmUnavailable() {
            return this.smartAlarmUnavailable;
        }

        public final int getSampleCount() {
            return this.sampleCount;
        }

        public final boolean getServiceRunning() {
            return this.serviceRunning;
        }
    }

    public final Snapshot load(Context context) {
        List<SleepTrackSample> emptyList;
        Intrinsics.checkNotNullParameter(context, "context");
        SleepMlPipelineStatus.Status load = SleepMlPipelineStatus.INSTANCE.load(context);
        long startedAtMs = SleepOvernightStore.INSTANCE.startedAtMs(context);
        int coerceAtLeast = startedAtMs > 0 ? RangesKt.coerceAtLeast((int) ((System.currentTimeMillis() - startedAtMs) / 60000), 1) : 0;
        if (SleepOvernightStore.INSTANCE.isActive(context)) {
            emptyList = SleepOvernightStore.INSTANCE.loadRecentSamples(context, SleepScience.TYPICAL_MIN_MIN);
        } else {
            emptyList = CollectionsKt.emptyList();
        }
        List<SleepTrackSample> list = emptyList;
        SleepMicCoverage.Snapshot fromSamples = (list.isEmpty() || coerceAtLeast <= 0) ? null : SleepMicCoverage.INSTANCE.fromSamples(list, coerceAtLeast, SleepOvernightStore.INSTANCE.micGapMs(context), SleepOvernightStore.INSTANCE.micGapCount(context));
        String formatWakeLine = SleepAlarmAudit.INSTANCE.formatWakeLine(context);
        String lastStopReason = SleepOvernightStore.INSTANCE.lastStopReason(context);
        String lastHealthNote = SleepOvernightStore.INSTANCE.lastHealthNote(context);
        StringBuilder sb = new StringBuilder();
        if (SleepListenService.INSTANCE.isRunningInProcess()) {
            sb.append("Service running");
        } else if (SleepOvernightStore.INSTANCE.isActive(context)) {
            sb.append("Service stopped — backup alarms armed");
        } else {
            sb.append("No active session");
        }
        if (lastStopReason != null) {
            if (StringsKt.isBlank(lastStopReason)) {
                lastStopReason = null;
            }
            if (lastStopReason != null) {
                sb.append(" · " + lastStopReason);
            }
        }
        if (lastHealthNote != null) {
            if (StringsKt.isBlank(lastHealthNote)) {
                lastHealthNote = null;
            }
            if (lastHealthNote != null) {
                sb.append(" · " + lastHealthNote);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return new Snapshot(SleepMlPipelineStatus.INSTANCE.summaryLine(load), fromSamples != null ? Integer.valueOf((int) (fromSamples.getCoverageRatio() * 100.0f)) : null, fromSamples != null ? fromSamples.getLabel() : null, SleepOvernightBattery.INSTANCE.summaryLine(context), formatWakeLine, sb2, SleepAlarmAudit.INSTANCE.smartAlarmUnavailableMessage(context), SleepOvernightStore.INSTANCE.sampleCount(context), SleepListenService.INSTANCE.isRunningInProcess());
    }

    public final boolean shouldShowCard(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SleepOvernightStore.INSTANCE.isActive(context) || SleepOvernightStore.INSTANCE.alarmFired(context) || SleepOvernightStore.INSTANCE.isRecoverableStale(context) || SleepAlarmAudit.INSTANCE.firedAtMs(context) > 0;
    }
}
