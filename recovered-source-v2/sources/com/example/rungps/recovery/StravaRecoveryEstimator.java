package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.recovery.RecoveryModel;
import com.example.rungps.strava.StravaActivitiesApi;
import com.example.rungps.strava.StravaActivityJson;
import com.example.rungps.strava.StravaActivityTypes;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: StravaRecoveryEstimator.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t¨\u0006\u000b"}, d2 = {"Lcom/example/rungps/recovery/StravaRecoveryEstimator;", "", "<init>", "()V", "planFromActivity", "Lcom/example/rungps/recovery/StravaRecoveryEstimator$StravaRecoveryPlan;", "activity", "Lcom/example/rungps/strava/StravaActivityJson;", "demographics", "Lcom/example/rungps/recovery/RecoveryModel$RecoveryDemographics;", "StravaRecoveryPlan", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StravaRecoveryEstimator {
    public static final int $stable = 0;
    public static final StravaRecoveryEstimator INSTANCE = new StravaRecoveryEstimator();

    private StravaRecoveryEstimator() {
    }

    /* compiled from: StravaRecoveryEstimator.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\t\u0010&\u001a\u00020\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u000fHÆ\u0003Jc\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u001bR\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006."}, d2 = {"Lcom/example/rungps/recovery/StravaRecoveryEstimator$StravaRecoveryPlan;", "", "stravaActivityId", "", "recoveryKind", "", "startMs", "endMs", "distanceM", "", "durationMs", "isBike", "", "title", "estimate", "Lcom/example/rungps/recovery/RecoveryModel$RecoveryEstimate;", "<init>", "(JLjava/lang/String;JJDJZLjava/lang/String;Lcom/example/rungps/recovery/RecoveryModel$RecoveryEstimate;)V", "getStravaActivityId", "()J", "getRecoveryKind", "()Ljava/lang/String;", "getStartMs", "getEndMs", "getDistanceM", "()D", "getDurationMs", "()Z", "getTitle", "getEstimate", "()Lcom/example/rungps/recovery/RecoveryModel$RecoveryEstimate;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class StravaRecoveryPlan {
        public static final int $stable = 0;
        private final double distanceM;
        private final long durationMs;
        private final long endMs;
        private final RecoveryModel.RecoveryEstimate estimate;
        private final boolean isBike;
        private final String recoveryKind;
        private final long startMs;
        private final long stravaActivityId;
        private final String title;

        /* renamed from: component1, reason: from getter */
        public final long getStravaActivityId() {
            return this.stravaActivityId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getRecoveryKind() {
            return this.recoveryKind;
        }

        /* renamed from: component3, reason: from getter */
        public final long getStartMs() {
            return this.startMs;
        }

        /* renamed from: component4, reason: from getter */
        public final long getEndMs() {
            return this.endMs;
        }

        /* renamed from: component5, reason: from getter */
        public final double getDistanceM() {
            return this.distanceM;
        }

        /* renamed from: component6, reason: from getter */
        public final long getDurationMs() {
            return this.durationMs;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getIsBike() {
            return this.isBike;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component9, reason: from getter */
        public final RecoveryModel.RecoveryEstimate getEstimate() {
            return this.estimate;
        }

        public final StravaRecoveryPlan copy(long stravaActivityId, String recoveryKind, long startMs, long endMs, double distanceM, long durationMs, boolean isBike, String title, RecoveryModel.RecoveryEstimate estimate) {
            Intrinsics.checkNotNullParameter(recoveryKind, "recoveryKind");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(estimate, "estimate");
            return new StravaRecoveryPlan(stravaActivityId, recoveryKind, startMs, endMs, distanceM, durationMs, isBike, title, estimate);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof StravaRecoveryPlan)) {
                return false;
            }
            StravaRecoveryPlan stravaRecoveryPlan = (StravaRecoveryPlan) other;
            return this.stravaActivityId == stravaRecoveryPlan.stravaActivityId && Intrinsics.areEqual(this.recoveryKind, stravaRecoveryPlan.recoveryKind) && this.startMs == stravaRecoveryPlan.startMs && this.endMs == stravaRecoveryPlan.endMs && Double.compare(this.distanceM, stravaRecoveryPlan.distanceM) == 0 && this.durationMs == stravaRecoveryPlan.durationMs && this.isBike == stravaRecoveryPlan.isBike && Intrinsics.areEqual(this.title, stravaRecoveryPlan.title) && Intrinsics.areEqual(this.estimate, stravaRecoveryPlan.estimate);
        }

        public int hashCode() {
            return (((((((((((((((Long.hashCode(this.stravaActivityId) * 31) + this.recoveryKind.hashCode()) * 31) + Long.hashCode(this.startMs)) * 31) + Long.hashCode(this.endMs)) * 31) + Double.hashCode(this.distanceM)) * 31) + Long.hashCode(this.durationMs)) * 31) + Boolean.hashCode(this.isBike)) * 31) + this.title.hashCode()) * 31) + this.estimate.hashCode();
        }

        public String toString() {
            return "StravaRecoveryPlan(stravaActivityId=" + this.stravaActivityId + ", recoveryKind=" + this.recoveryKind + ", startMs=" + this.startMs + ", endMs=" + this.endMs + ", distanceM=" + this.distanceM + ", durationMs=" + this.durationMs + ", isBike=" + this.isBike + ", title=" + this.title + ", estimate=" + this.estimate + ")";
        }

        public StravaRecoveryPlan(long j, String recoveryKind, long j2, long j3, double d, long j4, boolean z, String title, RecoveryModel.RecoveryEstimate estimate) {
            Intrinsics.checkNotNullParameter(recoveryKind, "recoveryKind");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(estimate, "estimate");
            this.stravaActivityId = j;
            this.recoveryKind = recoveryKind;
            this.startMs = j2;
            this.endMs = j3;
            this.distanceM = d;
            this.durationMs = j4;
            this.isBike = z;
            this.title = title;
            this.estimate = estimate;
        }

        public final long getStravaActivityId() {
            return this.stravaActivityId;
        }

        public final String getRecoveryKind() {
            return this.recoveryKind;
        }

        public final long getStartMs() {
            return this.startMs;
        }

        public final long getEndMs() {
            return this.endMs;
        }

        public final double getDistanceM() {
            return this.distanceM;
        }

        public final long getDurationMs() {
            return this.durationMs;
        }

        public final boolean isBike() {
            return this.isBike;
        }

        public final String getTitle() {
            return this.title;
        }

        public final RecoveryModel.RecoveryEstimate getEstimate() {
            return this.estimate;
        }
    }

    public final StravaRecoveryPlan planFromActivity(StravaActivityJson activity, RecoveryModel.RecoveryDemographics demographics) {
        RecoveryModel.RecoveryEstimate estimateRun;
        long j;
        Intrinsics.checkNotNullParameter(activity, "activity");
        StravaActivityTypes.Kind classify = StravaActivityTypes.INSTANCE.classify(activity.getType(), activity.getSportType());
        if (classify == StravaActivityTypes.Kind.OTHER) {
            return null;
        }
        boolean z = classify == StravaActivityTypes.Kind.BIKE;
        Long parseStartMs = StravaActivitiesApi.INSTANCE.parseStartMs(activity.getStartDate(), activity.getStartDateLocal());
        if (parseStartMs == null) {
            return null;
        }
        long longValue = parseStartMs.longValue();
        int coerceAtLeast = RangesKt.coerceAtLeast(StravaActivitiesApi.INSTANCE.effectiveMovingSec(activity), 0);
        if (coerceAtLeast < 45) {
            return null;
        }
        double coerceAtLeast2 = RangesKt.coerceAtLeast(activity.getDistance(), 0.0d);
        if (coerceAtLeast2 < 80.0d) {
            return null;
        }
        long j2 = 1000 * coerceAtLeast;
        long j3 = longValue + j2;
        if (z) {
            estimateRun = RecoveryModel.INSTANCE.estimateBike(coerceAtLeast2, j2, demographics);
        } else {
            estimateRun = RecoveryModel.INSTANCE.estimateRun(coerceAtLeast2, j2, demographics);
        }
        RecoveryModel.RecoveryEstimate recoveryEstimate = estimateRun;
        String name = activity.getName();
        String obj = name != null ? StringsKt.trim((CharSequence) name).toString() : null;
        String str = "";
        if (obj == null) {
            obj = "";
        }
        String str2 = obj;
        if (str2.length() == 0) {
            str2 = z ? "Strava ride" : "Strava run";
        }
        String str3 = str2;
        double d = coerceAtLeast2 / 1000.0d;
        if (z || coerceAtLeast2 < 10.0d) {
            j = j2;
        } else {
            double d2 = (j2 / 1000.0d) / d;
            j = j2;
            str = " · pace " + ((int) (d2 / 60.0d)) + ":" + StringsKt.padStart(String.valueOf(MathKt.roundToInt(d2 % 60.0d)), 2, '0') + "/km";
        }
        String notes = recoveryEstimate.getNotes();
        String format = String.format("%.2f", Arrays.copyOf(new Object[]{Double.valueOf(d)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return new StravaRecoveryPlan(activity.getId(), StravaRecoveryDedup.INSTANCE.stravaKindForBike(z), longValue, j3, coerceAtLeast2, j, z, str3, RecoveryModel.RecoveryEstimate.copy$default(recoveryEstimate, 0.0d, 0.0d, notes + " · " + str3 + " · " + format + " km" + str, 3, null));
    }
}
