package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RunEntity;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Triple;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;

/* compiled from: RaceTrendCalculator.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003 !\"B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005H\u0002J \u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u0004\u0018\u00010\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0086@¢\u0006\u0002\u0010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/example/rungps/analytics/RaceTrendCalculator;", "", "<init>", "()V", "RIEGEL_EXP", "", "millisToPaceString", "", "timeMs", "", "distanceKm", "riegelPredict", "t1Ms", "d1Km", "d2Km", "weekBucketKey", "", "epochMs", "zoneId", "Ljava/time/ZoneId;", "weeklyVolumeTrend", "Lcom/example/rungps/analytics/RaceTrendCalculator$WeeklyTrend;", "runs", "", "Lcom/example/rungps/data/RunEntity;", "buildSnapshot", "Lcom/example/rungps/analytics/RaceTrendCalculator$Snapshot;", "repo", "Lcom/example/rungps/data/Repository;", "(Lcom/example/rungps/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatRaceTime", "ms", "Projection", "Snapshot", "WeeklyTrend", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RaceTrendCalculator {
    public static final int $stable = 0;
    public static final RaceTrendCalculator INSTANCE = new RaceTrendCalculator();
    private static final double RIEGEL_EXP = 1.06d;

    private RaceTrendCalculator() {
    }

    /* compiled from: RaceTrendCalculator.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/analytics/RaceTrendCalculator$Projection;", "", "label", "", "distanceKm", "", "predictedMillis", "", "formattedPacePerKm", "<init>", "(Ljava/lang/String;DLjava/lang/Long;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getDistanceKm", "()D", "getPredictedMillis", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFormattedPacePerKm", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;DLjava/lang/Long;Ljava/lang/String;)Lcom/example/rungps/analytics/RaceTrendCalculator$Projection;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Projection {
        public static final int $stable = 0;
        private final double distanceKm;
        private final String formattedPacePerKm;
        private final String label;
        private final Long predictedMillis;

        public static /* synthetic */ Projection copy$default(Projection projection, String str, double d, Long l, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = projection.label;
            }
            if ((i & 2) != 0) {
                d = projection.distanceKm;
            }
            double d2 = d;
            if ((i & 4) != 0) {
                l = projection.predictedMillis;
            }
            Long l2 = l;
            if ((i & 8) != 0) {
                str2 = projection.formattedPacePerKm;
            }
            return projection.copy(str, d2, l2, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        /* renamed from: component2, reason: from getter */
        public final double getDistanceKm() {
            return this.distanceKm;
        }

        /* renamed from: component3, reason: from getter */
        public final Long getPredictedMillis() {
            return this.predictedMillis;
        }

        /* renamed from: component4, reason: from getter */
        public final String getFormattedPacePerKm() {
            return this.formattedPacePerKm;
        }

        public final Projection copy(String label, double distanceKm, Long predictedMillis, String formattedPacePerKm) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Projection(label, distanceKm, predictedMillis, formattedPacePerKm);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Projection)) {
                return false;
            }
            Projection projection = (Projection) other;
            return Intrinsics.areEqual(this.label, projection.label) && Double.compare(this.distanceKm, projection.distanceKm) == 0 && Intrinsics.areEqual(this.predictedMillis, projection.predictedMillis) && Intrinsics.areEqual(this.formattedPacePerKm, projection.formattedPacePerKm);
        }

        public int hashCode() {
            int hashCode = ((this.label.hashCode() * 31) + Double.hashCode(this.distanceKm)) * 31;
            Long l = this.predictedMillis;
            int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
            String str = this.formattedPacePerKm;
            return hashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Projection(label=" + this.label + ", distanceKm=" + this.distanceKm + ", predictedMillis=" + this.predictedMillis + ", formattedPacePerKm=" + this.formattedPacePerKm + ")";
        }

        public Projection(String label, double d, Long l, String str) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.label = label;
            this.distanceKm = d;
            this.predictedMillis = l;
            this.formattedPacePerKm = str;
        }

        public final String getLabel() {
            return this.label;
        }

        public final double getDistanceKm() {
            return this.distanceKm;
        }

        public final Long getPredictedMillis() {
            return this.predictedMillis;
        }

        public final String getFormattedPacePerKm() {
            return this.formattedPacePerKm;
        }
    }

    /* compiled from: RaceTrendCalculator.kt */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001aJ\t\u0010&\u001a\u00020\u0003HÆ\u0003Jj\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020-HÖ\u0001J\t\u0010.\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0012¨\u0006/"}, d2 = {"Lcom/example/rungps/analytics/RaceTrendCalculator$Snapshot;", "", "anchorLabel", "", "anchorDistanceKm", "", "anchorTimeMs", "", "projections", "", "Lcom/example/rungps/analytics/RaceTrendCalculator$Projection;", "avgKmLatest4Weeks", "avgKmPrior4Weeks", "trendPct", "trendSentence", "<init>", "(Ljava/lang/String;DJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)V", "getAnchorLabel", "()Ljava/lang/String;", "getAnchorDistanceKm", "()D", "getAnchorTimeMs", "()J", "getProjections", "()Ljava/util/List;", "getAvgKmLatest4Weeks", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getAvgKmPrior4Weeks", "getTrendPct", "getTrendSentence", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;DJLjava/util/List;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Lcom/example/rungps/analytics/RaceTrendCalculator$Snapshot;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 8;
        private final double anchorDistanceKm;
        private final String anchorLabel;
        private final long anchorTimeMs;
        private final Double avgKmLatest4Weeks;
        private final Double avgKmPrior4Weeks;
        private final List<Projection> projections;
        private final Double trendPct;
        private final String trendSentence;

        /* renamed from: component1, reason: from getter */
        public final String getAnchorLabel() {
            return this.anchorLabel;
        }

        /* renamed from: component2, reason: from getter */
        public final double getAnchorDistanceKm() {
            return this.anchorDistanceKm;
        }

        /* renamed from: component3, reason: from getter */
        public final long getAnchorTimeMs() {
            return this.anchorTimeMs;
        }

        public final List<Projection> component4() {
            return this.projections;
        }

        /* renamed from: component5, reason: from getter */
        public final Double getAvgKmLatest4Weeks() {
            return this.avgKmLatest4Weeks;
        }

        /* renamed from: component6, reason: from getter */
        public final Double getAvgKmPrior4Weeks() {
            return this.avgKmPrior4Weeks;
        }

        /* renamed from: component7, reason: from getter */
        public final Double getTrendPct() {
            return this.trendPct;
        }

        /* renamed from: component8, reason: from getter */
        public final String getTrendSentence() {
            return this.trendSentence;
        }

        public final Snapshot copy(String anchorLabel, double anchorDistanceKm, long anchorTimeMs, List<Projection> projections, Double avgKmLatest4Weeks, Double avgKmPrior4Weeks, Double trendPct, String trendSentence) {
            Intrinsics.checkNotNullParameter(anchorLabel, "anchorLabel");
            Intrinsics.checkNotNullParameter(projections, "projections");
            Intrinsics.checkNotNullParameter(trendSentence, "trendSentence");
            return new Snapshot(anchorLabel, anchorDistanceKm, anchorTimeMs, projections, avgKmLatest4Weeks, avgKmPrior4Weeks, trendPct, trendSentence);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return Intrinsics.areEqual(this.anchorLabel, snapshot.anchorLabel) && Double.compare(this.anchorDistanceKm, snapshot.anchorDistanceKm) == 0 && this.anchorTimeMs == snapshot.anchorTimeMs && Intrinsics.areEqual(this.projections, snapshot.projections) && Intrinsics.areEqual((Object) this.avgKmLatest4Weeks, (Object) snapshot.avgKmLatest4Weeks) && Intrinsics.areEqual((Object) this.avgKmPrior4Weeks, (Object) snapshot.avgKmPrior4Weeks) && Intrinsics.areEqual((Object) this.trendPct, (Object) snapshot.trendPct) && Intrinsics.areEqual(this.trendSentence, snapshot.trendSentence);
        }

        public int hashCode() {
            int hashCode = ((((((this.anchorLabel.hashCode() * 31) + Double.hashCode(this.anchorDistanceKm)) * 31) + Long.hashCode(this.anchorTimeMs)) * 31) + this.projections.hashCode()) * 31;
            Double d = this.avgKmLatest4Weeks;
            int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
            Double d2 = this.avgKmPrior4Weeks;
            int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
            Double d3 = this.trendPct;
            return ((hashCode3 + (d3 != null ? d3.hashCode() : 0)) * 31) + this.trendSentence.hashCode();
        }

        public String toString() {
            return "Snapshot(anchorLabel=" + this.anchorLabel + ", anchorDistanceKm=" + this.anchorDistanceKm + ", anchorTimeMs=" + this.anchorTimeMs + ", projections=" + this.projections + ", avgKmLatest4Weeks=" + this.avgKmLatest4Weeks + ", avgKmPrior4Weeks=" + this.avgKmPrior4Weeks + ", trendPct=" + this.trendPct + ", trendSentence=" + this.trendSentence + ")";
        }

        public Snapshot(String anchorLabel, double d, long j, List<Projection> projections, Double d2, Double d3, Double d4, String trendSentence) {
            Intrinsics.checkNotNullParameter(anchorLabel, "anchorLabel");
            Intrinsics.checkNotNullParameter(projections, "projections");
            Intrinsics.checkNotNullParameter(trendSentence, "trendSentence");
            this.anchorLabel = anchorLabel;
            this.anchorDistanceKm = d;
            this.anchorTimeMs = j;
            this.projections = projections;
            this.avgKmLatest4Weeks = d2;
            this.avgKmPrior4Weeks = d3;
            this.trendPct = d4;
            this.trendSentence = trendSentence;
        }

        public final String getAnchorLabel() {
            return this.anchorLabel;
        }

        public final double getAnchorDistanceKm() {
            return this.anchorDistanceKm;
        }

        public final long getAnchorTimeMs() {
            return this.anchorTimeMs;
        }

        public final List<Projection> getProjections() {
            return this.projections;
        }

        public final Double getAvgKmLatest4Weeks() {
            return this.avgKmLatest4Weeks;
        }

        public final Double getAvgKmPrior4Weeks() {
            return this.avgKmPrior4Weeks;
        }

        public final Double getTrendPct() {
            return this.trendPct;
        }

        public final String getTrendSentence() {
            return this.trendSentence;
        }
    }

    /* compiled from: RaceTrendCalculator.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ.\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\f¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/analytics/RaceTrendCalculator$WeeklyTrend;", "", "latestAvgKmWeek", "", "priorAvgKmWeek", "pctDelta", "<init>", "(DDLjava/lang/Double;)V", "getLatestAvgKmWeek", "()D", "getPriorAvgKmWeek", "getPctDelta", "()Ljava/lang/Double;", "Ljava/lang/Double;", "component1", "component2", "component3", "copy", "(DDLjava/lang/Double;)Lcom/example/rungps/analytics/RaceTrendCalculator$WeeklyTrend;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class WeeklyTrend {
        public static final int $stable = 0;
        private final double latestAvgKmWeek;
        private final Double pctDelta;
        private final double priorAvgKmWeek;

        public static /* synthetic */ WeeklyTrend copy$default(WeeklyTrend weeklyTrend, double d, double d2, Double d3, int i, Object obj) {
            if ((i & 1) != 0) {
                d = weeklyTrend.latestAvgKmWeek;
            }
            double d4 = d;
            if ((i & 2) != 0) {
                d2 = weeklyTrend.priorAvgKmWeek;
            }
            double d5 = d2;
            if ((i & 4) != 0) {
                d3 = weeklyTrend.pctDelta;
            }
            return weeklyTrend.copy(d4, d5, d3);
        }

        /* renamed from: component1, reason: from getter */
        public final double getLatestAvgKmWeek() {
            return this.latestAvgKmWeek;
        }

        /* renamed from: component2, reason: from getter */
        public final double getPriorAvgKmWeek() {
            return this.priorAvgKmWeek;
        }

        /* renamed from: component3, reason: from getter */
        public final Double getPctDelta() {
            return this.pctDelta;
        }

        public final WeeklyTrend copy(double latestAvgKmWeek, double priorAvgKmWeek, Double pctDelta) {
            return new WeeklyTrend(latestAvgKmWeek, priorAvgKmWeek, pctDelta);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WeeklyTrend)) {
                return false;
            }
            WeeklyTrend weeklyTrend = (WeeklyTrend) other;
            return Double.compare(this.latestAvgKmWeek, weeklyTrend.latestAvgKmWeek) == 0 && Double.compare(this.priorAvgKmWeek, weeklyTrend.priorAvgKmWeek) == 0 && Intrinsics.areEqual((Object) this.pctDelta, (Object) weeklyTrend.pctDelta);
        }

        public int hashCode() {
            int hashCode = ((Double.hashCode(this.latestAvgKmWeek) * 31) + Double.hashCode(this.priorAvgKmWeek)) * 31;
            Double d = this.pctDelta;
            return hashCode + (d == null ? 0 : d.hashCode());
        }

        public String toString() {
            return "WeeklyTrend(latestAvgKmWeek=" + this.latestAvgKmWeek + ", priorAvgKmWeek=" + this.priorAvgKmWeek + ", pctDelta=" + this.pctDelta + ")";
        }

        public WeeklyTrend(double d, double d2, Double d3) {
            this.latestAvgKmWeek = d;
            this.priorAvgKmWeek = d2;
            this.pctDelta = d3;
        }

        public final double getLatestAvgKmWeek() {
            return this.latestAvgKmWeek;
        }

        public final Double getPctDelta() {
            return this.pctDelta;
        }

        public final double getPriorAvgKmWeek() {
            return this.priorAvgKmWeek;
        }
    }

    private final String millisToPaceString(long timeMs, double distanceKm) {
        if (distanceKm <= 0.0d) {
            return "—";
        }
        double d = (timeMs / 1000.0d) / distanceKm;
        int i = (int) (d / 60.0d);
        int coerceIn = RangesKt.coerceIn((int) (d % 60.0d), 0, 59);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        String format = String.format("%d:%02d/km", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(coerceIn)}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    private final long riegelPredict(double t1Ms, double d1Km, double d2Km) {
        return RangesKt.coerceAtLeast((long) (t1Ms * Math.pow(d2Km / RangesKt.coerceAtLeast(d1Km, 0.001d), RIEGEL_EXP)), 1L);
    }

    public static /* synthetic */ int weekBucketKey$default(RaceTrendCalculator raceTrendCalculator, long j, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return raceTrendCalculator.weekBucketKey(j, zoneId);
    }

    public final int weekBucketKey(long epochMs, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        LocalDate localDate = Instant.ofEpochMilli(epochMs).atZone(zoneId).toLocalDate();
        return (localDate.get(WeekFields.ISO.weekBasedYear()) * 100) + localDate.get(WeekFields.ISO.weekOfWeekBasedYear());
    }

    public static /* synthetic */ WeeklyTrend weeklyVolumeTrend$default(RaceTrendCalculator raceTrendCalculator, List list, ZoneId zoneId, int i, Object obj) {
        if ((i & 2) != 0) {
            zoneId = ZoneId.systemDefault();
        }
        return raceTrendCalculator.weeklyVolumeTrend(list, zoneId);
    }

    public final WeeklyTrend weeklyVolumeTrend(List<RunEntity> runs, ZoneId zoneId) {
        Intrinsics.checkNotNullParameter(runs, "runs");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        ArrayList arrayList = new ArrayList();
        for (Object obj : runs) {
            RunEntity runEntity = (RunEntity) obj;
            if (runEntity.getEndedAtMs() != null && runEntity.getTotalDistanceM() > 200.0d) {
                arrayList.add(obj);
            }
        }
        ArrayList<RunEntity> arrayList2 = arrayList;
        if (arrayList2.size() < 2) {
            return null;
        }
        ArrayList<Pair> arrayList3 = new ArrayList();
        for (RunEntity runEntity2 : arrayList2) {
            Long endedAtMs = runEntity2.getEndedAtMs();
            Pair pair = endedAtMs != null ? TuplesKt.to(Integer.valueOf(INSTANCE.weekBucketKey(endedAtMs.longValue(), zoneId)), Double.valueOf(runEntity2.getTotalDistanceM() / 1000.0d)) : null;
            if (pair != null) {
                arrayList3.add(pair);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Pair pair2 : arrayList3) {
            Integer valueOf = Integer.valueOf(((Number) pair2.getFirst()).intValue());
            Object obj2 = linkedHashMap.get(valueOf);
            if (obj2 == null) {
                obj2 = (List) new ArrayList();
                linkedHashMap.put(valueOf, obj2);
            }
            ((List) obj2).add(Double.valueOf(((Number) pair2.getSecond()).doubleValue()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(MapsKt.mapCapacity(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry.getKey(), Double.valueOf(CollectionsKt.sumOfDouble((List) entry.getValue())));
        }
        List sorted = CollectionsKt.sorted(linkedHashMap2.keySet());
        if (sorted.size() < 2) {
            return new WeeklyTrend(CollectionsKt.sumOfDouble(linkedHashMap2.values()) / RangesKt.coerceAtLeast(sorted.size(), 1), 0.0d, null);
        }
        List takeLast = CollectionsKt.takeLast(sorted, 4);
        List takeLast2 = CollectionsKt.takeLast(CollectionsKt.dropLast(sorted, 4), 4);
        Iterator it = takeLast.iterator();
        double d = 0.0d;
        while (it.hasNext()) {
            Double d2 = (Double) linkedHashMap2.get(Integer.valueOf(((Number) it.next()).intValue()));
            d += d2 != null ? d2.doubleValue() : 0.0d;
        }
        double coerceAtLeast = d / RangesKt.coerceAtLeast(takeLast.size(), 1);
        Iterator it2 = takeLast2.iterator();
        double d3 = 0.0d;
        while (it2.hasNext()) {
            Double d4 = (Double) linkedHashMap2.get(Integer.valueOf(((Number) it2.next()).intValue()));
            d3 += d4 != null ? d4.doubleValue() : 0.0d;
        }
        double size = takeLast2.isEmpty() ? 0.0d : d3 / takeLast2.size();
        return new WeeklyTrend(coerceAtLeast, size, size > 0.5d ? Double.valueOf(((coerceAtLeast - size) / size) * 100.0d) : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object buildSnapshot(Repository repository, Continuation<? super Snapshot> continuation) {
        RaceTrendCalculator$buildSnapshot$1 raceTrendCalculator$buildSnapshot$1;
        Object coroutine_suspended;
        int i;
        Object allRuns;
        RaceTrendCalculator raceTrendCalculator;
        Map map;
        Iterator it;
        Object next;
        Triple triple;
        Iterator it2;
        Object next2;
        Triple triple2;
        double doubleValue;
        long longValue;
        List createListBuilder;
        WeeklyTrend weeklyVolumeTrend$default;
        String str;
        String str2;
        String str3;
        Double d;
        Double boxDouble;
        RaceTrendCalculator raceTrendCalculator2 = this;
        Repository repository2 = repository;
        if (continuation instanceof RaceTrendCalculator$buildSnapshot$1) {
            raceTrendCalculator$buildSnapshot$1 = (RaceTrendCalculator$buildSnapshot$1) continuation;
            if ((raceTrendCalculator$buildSnapshot$1.label & Integer.MIN_VALUE) != 0) {
                raceTrendCalculator$buildSnapshot$1.label -= Integer.MIN_VALUE;
                Object obj = raceTrendCalculator$buildSnapshot$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = raceTrendCalculator$buildSnapshot$1.label;
                char c = 2;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    raceTrendCalculator$buildSnapshot$1.L$0 = raceTrendCalculator2;
                    raceTrendCalculator$buildSnapshot$1.L$1 = repository2;
                    raceTrendCalculator$buildSnapshot$1.label = 1;
                    obj = repository2.localPbsFromSplits(raceTrendCalculator$buildSnapshot$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        map = (Map) raceTrendCalculator$buildSnapshot$1.L$1;
                        raceTrendCalculator = (RaceTrendCalculator) raceTrendCalculator$buildSnapshot$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        List list = (List) obj;
                        Set<Map.Entry> entrySet = map.entrySet();
                        ArrayList arrayList = new ArrayList();
                        for (Map.Entry entry : entrySet) {
                            String str4 = (String) entry.getKey();
                            long longValue2 = ((Number) entry.getValue()).longValue();
                            String str5 = str4;
                            if (StringsKt.contains((CharSequence) str5, (CharSequence) "1 km", true)) {
                                boxDouble = Boxing.boxDouble(1.0d);
                            } else if (StringsKt.contains((CharSequence) str5, (CharSequence) "3 km", true)) {
                                boxDouble = Boxing.boxDouble(3.0d);
                            } else if (StringsKt.contains((CharSequence) str5, (CharSequence) "5 km", true)) {
                                boxDouble = Boxing.boxDouble(5.0d);
                            } else if (StringsKt.contains((CharSequence) str5, (CharSequence) "10 km", true)) {
                                boxDouble = Boxing.boxDouble(10.0d);
                            } else {
                                boxDouble = StringsKt.contains((CharSequence) str5, (CharSequence) "12 km", true) ? Boxing.boxDouble(12.0d) : null;
                            }
                            Triple triple3 = (boxDouble == null || longValue2 <= 0) ? null : new Triple(str4, boxDouble, Boxing.boxLong(longValue2));
                            if (triple3 != null) {
                                arrayList.add(triple3);
                            }
                        }
                        it = arrayList.iterator();
                        if (it.hasNext()) {
                            next = null;
                        } else {
                            next = it.next();
                            if (it.hasNext()) {
                                double longValue3 = ((Number) r4.component3()).longValue() / ((Number) ((Triple) next).component2()).doubleValue();
                                while (true) {
                                    Object next3 = it.next();
                                    double longValue4 = ((Number) r12.component3()).longValue() / ((Number) ((Triple) next3).component2()).doubleValue();
                                    if (Double.compare(longValue3, longValue4) > 0) {
                                        next = next3;
                                        longValue3 = longValue4;
                                    }
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    c = c;
                                }
                            }
                        }
                        triple = (Triple) next;
                        it2 = SequencesKt.filter(CollectionsKt.asSequence(list), new Function1() { // from class: com.example.rungps.analytics.RaceTrendCalculator$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                boolean buildSnapshot$lambda$9;
                                buildSnapshot$lambda$9 = RaceTrendCalculator.buildSnapshot$lambda$9((RunEntity) obj2);
                                return Boolean.valueOf(buildSnapshot$lambda$9);
                            }
                        }).iterator();
                        if (it2.hasNext()) {
                            next2 = null;
                        } else {
                            next2 = it2.next();
                            if (it2.hasNext()) {
                                double totalDurationMs = r3.getTotalDurationMs() / (((RunEntity) next2).getTotalDistanceM() / 1000.0d);
                                do {
                                    Object next4 = it2.next();
                                    double totalDurationMs2 = r13.getTotalDurationMs() / (((RunEntity) next4).getTotalDistanceM() / 1000.0d);
                                    if (Double.compare(totalDurationMs, totalDurationMs2) > 0) {
                                        next2 = next4;
                                        totalDurationMs = totalDurationMs2;
                                    }
                                } while (it2.hasNext());
                            }
                        }
                        RunEntity runEntity = (RunEntity) next2;
                        if (triple == null) {
                            triple2 = new Triple(triple.getFirst(), triple.getSecond(), triple.getThird());
                        } else if (runEntity != null) {
                            triple2 = new Triple("Recent strongest pace session", Boxing.boxDouble(runEntity.getTotalDistanceM() / 1000.0d), Boxing.boxLong(runEntity.getTotalDurationMs()));
                        } else {
                            triple2 = new Triple("", Boxing.boxDouble(0.0d), Boxing.boxLong(0L));
                        }
                        String str6 = (String) triple2.component1();
                        doubleValue = ((Number) triple2.component2()).doubleValue();
                        longValue = ((Number) triple2.component3()).longValue();
                        createListBuilder = CollectionsKt.createListBuilder();
                        if (doubleValue > 0.0d && longValue > 0) {
                            buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "5 km", 5.0d);
                            buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "10 km", 10.0d);
                            buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "Half marathon", 21.0975d);
                            buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "Marathon", 42.195d);
                        }
                        List build = CollectionsKt.build(createListBuilder);
                        weeklyVolumeTrend$default = weeklyVolumeTrend$default(raceTrendCalculator, list, null, 2, null);
                        if (weeklyVolumeTrend$default != null) {
                            str2 = "Log a few finished runs to unlock projections and trends.";
                        } else if (weeklyVolumeTrend$default.getPriorAvgKmWeek() <= 0.0d) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String format = String.format("%.1f", Arrays.copyOf(new Object[]{Boxing.boxDouble(weeklyVolumeTrend$default.getLatestAvgKmWeek())}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            str2 = "Recent block averages about " + format + " km/week.";
                        } else if (weeklyVolumeTrend$default.getPctDelta() == null) {
                            str2 = "Need more weeks of history to compare blocks.";
                        } else {
                            if (weeklyVolumeTrend$default.getPctDelta().doubleValue() > 8.0d) {
                                str = "up sharply from";
                            } else if (weeklyVolumeTrend$default.getPctDelta().doubleValue() < -8.0d) {
                                str = "down from";
                            } else if (weeklyVolumeTrend$default.getPctDelta().doubleValue() > 3.0d) {
                                str = "up slightly vs";
                            } else {
                                str = weeklyVolumeTrend$default.getPctDelta().doubleValue() < -3.0d ? "a little below" : "similar to";
                            }
                            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                            String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Boxing.boxDouble(weeklyVolumeTrend$default.getLatestAvgKmWeek())}, 1));
                            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            String format3 = String.format("%.1f", Arrays.copyOf(new Object[]{Boxing.boxDouble(weeklyVolumeTrend$default.getPriorAvgKmWeek())}, 1));
                            Intrinsics.checkNotNullExpressionValue(format3, "format(...)");
                            str2 = "Last four ISO weeks are " + str + " the prior four (~" + format2 + " vs " + format3 + " km/week).";
                        }
                        String str7 = str2;
                        str3 = str6;
                        if (str3.length() == 0) {
                            str3 = "Not enough pacing data yet";
                        }
                        String str8 = str3;
                        Double boxDouble2 = weeklyVolumeTrend$default == null ? Boxing.boxDouble(weeklyVolumeTrend$default.getLatestAvgKmWeek()) : null;
                        if (weeklyVolumeTrend$default != null) {
                            Double boxDouble3 = Boxing.boxDouble(weeklyVolumeTrend$default.getPriorAvgKmWeek());
                            if (boxDouble3.doubleValue() > 0.0d) {
                                d = boxDouble3;
                                return new Snapshot(str8, doubleValue, longValue, build, boxDouble2, d, weeklyVolumeTrend$default != null ? weeklyVolumeTrend$default.getPctDelta() : null, str7);
                            }
                        }
                        d = null;
                        return new Snapshot(str8, doubleValue, longValue, build, boxDouble2, d, weeklyVolumeTrend$default != null ? weeklyVolumeTrend$default.getPctDelta() : null, str7);
                    }
                    Repository repository3 = (Repository) raceTrendCalculator$buildSnapshot$1.L$1;
                    RaceTrendCalculator raceTrendCalculator3 = (RaceTrendCalculator) raceTrendCalculator$buildSnapshot$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    repository2 = repository3;
                    raceTrendCalculator2 = raceTrendCalculator3;
                }
                Map map2 = (Map) obj;
                raceTrendCalculator$buildSnapshot$1.L$0 = raceTrendCalculator2;
                raceTrendCalculator$buildSnapshot$1.L$1 = map2;
                raceTrendCalculator$buildSnapshot$1.label = 2;
                allRuns = repository2.allRuns(raceTrendCalculator$buildSnapshot$1);
                if (allRuns != coroutine_suspended) {
                    return coroutine_suspended;
                }
                raceTrendCalculator = raceTrendCalculator2;
                map = map2;
                obj = allRuns;
                List list2 = (List) obj;
                Set<Map.Entry> entrySet2 = map.entrySet();
                ArrayList arrayList2 = new ArrayList();
                while (r0.hasNext()) {
                }
                it = arrayList2.iterator();
                if (it.hasNext()) {
                }
                triple = (Triple) next;
                it2 = SequencesKt.filter(CollectionsKt.asSequence(list2), new Function1() { // from class: com.example.rungps.analytics.RaceTrendCalculator$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        boolean buildSnapshot$lambda$9;
                        buildSnapshot$lambda$9 = RaceTrendCalculator.buildSnapshot$lambda$9((RunEntity) obj2);
                        return Boolean.valueOf(buildSnapshot$lambda$9);
                    }
                }).iterator();
                if (it2.hasNext()) {
                }
                RunEntity runEntity2 = (RunEntity) next2;
                if (triple == null) {
                }
                String str62 = (String) triple2.component1();
                doubleValue = ((Number) triple2.component2()).doubleValue();
                longValue = ((Number) triple2.component3()).longValue();
                createListBuilder = CollectionsKt.createListBuilder();
                if (doubleValue > 0.0d) {
                    buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "5 km", 5.0d);
                    buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "10 km", 10.0d);
                    buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "Half marathon", 21.0975d);
                    buildSnapshot$lambda$11$addProj(longValue, doubleValue, createListBuilder, "Marathon", 42.195d);
                }
                List build2 = CollectionsKt.build(createListBuilder);
                weeklyVolumeTrend$default = weeklyVolumeTrend$default(raceTrendCalculator, list2, null, 2, null);
                if (weeklyVolumeTrend$default != null) {
                }
                String str72 = str2;
                str3 = str62;
                if (str3.length() == 0) {
                }
                String str82 = str3;
                if (weeklyVolumeTrend$default == null) {
                }
                if (weeklyVolumeTrend$default != null) {
                }
                d = null;
                return new Snapshot(str82, doubleValue, longValue, build2, boxDouble2, d, weeklyVolumeTrend$default != null ? weeklyVolumeTrend$default.getPctDelta() : null, str72);
            }
        }
        raceTrendCalculator$buildSnapshot$1 = new RaceTrendCalculator$buildSnapshot$1(raceTrendCalculator2, continuation);
        Object obj2 = raceTrendCalculator$buildSnapshot$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = raceTrendCalculator$buildSnapshot$1.label;
        char c2 = 2;
        if (i != 0) {
        }
        Map map22 = (Map) obj2;
        raceTrendCalculator$buildSnapshot$1.L$0 = raceTrendCalculator2;
        raceTrendCalculator$buildSnapshot$1.L$1 = map22;
        raceTrendCalculator$buildSnapshot$1.label = 2;
        allRuns = repository2.allRuns(raceTrendCalculator$buildSnapshot$1);
        if (allRuns != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean buildSnapshot$lambda$9(RunEntity it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getEndedAtMs() != null && it.getTotalDistanceM() >= 1600.0d && it.getTotalDurationMs() >= 240000;
    }

    private static final void buildSnapshot$lambda$11$addProj(long j, double d, List<Projection> list, String str, double d2) {
        RaceTrendCalculator raceTrendCalculator = INSTANCE;
        long riegelPredict = raceTrendCalculator.riegelPredict(j, d, d2);
        list.add(new Projection(str, d2, Long.valueOf(riegelPredict), raceTrendCalculator.millisToPaceString(riegelPredict, d2)));
    }

    public final String formatRaceTime(long ms) {
        String format;
        long j = ms / 1000;
        long j2 = 3600;
        long j3 = j / j2;
        long j4 = 60;
        long j5 = (j % j2) / j4;
        long j6 = j % j4;
        if (j3 > 0) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            format = String.format("%d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3), Long.valueOf(j5), Long.valueOf(j6)}, 3));
        } else {
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            format = String.format("%d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j5), Long.valueOf(j6)}, 2));
        }
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }
}
