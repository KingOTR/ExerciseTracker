package com.example.rungps.tracking;

import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrackingState.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b[\b\u0087\b\u0018\u00002\u00020\u0001BÅ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0012\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010!\u001a\u00020\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b#\u0010$J\t\u0010K\u001a\u00020\u0003HÆ\u0003J\u0010\u0010L\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\bHÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\u0010\u0010P\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010Q\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010R\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010S\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010T\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0010\u0010V\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010W\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010X\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010Z\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010[\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010@J\t\u0010]\u001a\u00020\u0003HÆ\u0003J\t\u0010^\u001a\u00020\u0003HÆ\u0003J\t\u0010_\u001a\u00020\u0005HÆ\u0003J\u0010\u0010`\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0002\u00108J\u0010\u0010a\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010/J\u0010\u0010b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\t\u0010c\u001a\u00020\u0012HÆ\u0003J\u0010\u0010d\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'J\t\u0010e\u001a\u00020\u0012HÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010'JÌ\u0002\u0010g\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001f\u001a\u00020\u00122\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010!\u001a\u00020\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010hJ\u0013\u0010i\u001a\u00020\u00032\b\u0010j\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010k\u001a\u00020\u0012HÖ\u0001J\t\u0010l\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010%R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010*R\u0015\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00100\u001a\u0004\b1\u0010/R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b2\u0010'R\u0015\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b3\u0010'R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b6\u00105R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00109\u001a\u0004\b7\u00108R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00109\u001a\u0004\b:\u00108R\u0015\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b;\u0010'R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\b<\u0010'R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00100\u001a\u0004\b=\u0010/R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00100\u001a\u0004\b>\u0010/R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010A\u001a\u0004\b?\u0010@R\u0011\u0010\u0019\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010%R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010%R\u0011\u0010\u001b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\bB\u0010*R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u0012¢\u0006\n\n\u0002\u00109\u001a\u0004\bC\u00108R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u00100\u001a\u0004\bD\u0010/R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\bE\u0010'R\u0011\u0010\u001f\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bF\u0010GR\u0015\u0010 \u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\bH\u0010'R\u0011\u0010!\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\bI\u0010GR\u0015\u0010\"\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010(\u001a\u0004\bJ\u0010'¨\u0006m"}, d2 = {"Lcom/example/rungps/tracking/TrackingUiState;", "", "isRecording", "", "startedAtMs", "", "elapsedMs", "distanceM", "", "steps", "lastLat", "lastLon", "lastFinishedRunId", "lastFinishedAtMs", TrackingService.EXTRA_PLAN_TYPE, "", "segmentLabel", "segmentIndex", "", "segmentCount", "segmentElapsedMs", "segmentRemainingMs", "segmentDistanceM", "segmentRemainingM", "workoutFinished", "isAutoPaused", "isPaused", "currentSplitElapsedMs", TrackingService.EXTRA_TARGET_PACE_SEC_PER_KM, TrackingService.EXTRA_GOAL_DISTANCE_M, TrackingService.EXTRA_GOAL_TIME_MS, "splitCount", "lastSplitMs", "lapCount", "lastLapMs", "<init>", "(ZLjava/lang/Long;JDJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;ZZJLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;ILjava/lang/Long;ILjava/lang/Long;)V", "()Z", "getStartedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getElapsedMs", "()J", "getDistanceM", "()D", "getSteps", "getLastLat", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastLon", "getLastFinishedRunId", "getLastFinishedAtMs", "getPlanType", "()Ljava/lang/String;", "getSegmentLabel", "getSegmentIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSegmentCount", "getSegmentElapsedMs", "getSegmentRemainingMs", "getSegmentDistanceM", "getSegmentRemainingM", "getWorkoutFinished", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCurrentSplitElapsedMs", "getTargetPaceSecPerKm", "getGoalDistanceM", "getGoalTimeMs", "getSplitCount", "()I", "getLastSplitMs", "getLapCount", "getLastLapMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "copy", "(ZLjava/lang/Long;JDJLjava/lang/Double;Ljava/lang/Double;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Boolean;ZZJLjava/lang/Integer;Ljava/lang/Double;Ljava/lang/Long;ILjava/lang/Long;ILjava/lang/Long;)Lcom/example/rungps/tracking/TrackingUiState;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrackingUiState {
    public static final int $stable = 0;
    private final long currentSplitElapsedMs;
    private final double distanceM;
    private final long elapsedMs;
    private final Double goalDistanceM;
    private final Long goalTimeMs;
    private final boolean isAutoPaused;
    private final boolean isPaused;
    private final boolean isRecording;
    private final int lapCount;
    private final Long lastFinishedAtMs;
    private final Long lastFinishedRunId;
    private final Long lastLapMs;
    private final Double lastLat;
    private final Double lastLon;
    private final Long lastSplitMs;
    private final String planType;
    private final Integer segmentCount;
    private final Double segmentDistanceM;
    private final Long segmentElapsedMs;
    private final Integer segmentIndex;
    private final String segmentLabel;
    private final Double segmentRemainingM;
    private final Long segmentRemainingMs;
    private final int splitCount;
    private final Long startedAtMs;
    private final long steps;
    private final Integer targetPaceSecPerKm;
    private final Boolean workoutFinished;

    public TrackingUiState() {
        this(false, null, 0L, 0.0d, 0L, null, null, null, null, null, null, null, null, null, null, null, null, null, false, false, 0L, null, null, null, 0, null, 0, null, 268435455, null);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRecording() {
        return this.isRecording;
    }

    /* renamed from: component10, reason: from getter */
    public final String getPlanType() {
        return this.planType;
    }

    /* renamed from: component11, reason: from getter */
    public final String getSegmentLabel() {
        return this.segmentLabel;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getSegmentIndex() {
        return this.segmentIndex;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getSegmentCount() {
        return this.segmentCount;
    }

    /* renamed from: component14, reason: from getter */
    public final Long getSegmentElapsedMs() {
        return this.segmentElapsedMs;
    }

    /* renamed from: component15, reason: from getter */
    public final Long getSegmentRemainingMs() {
        return this.segmentRemainingMs;
    }

    /* renamed from: component16, reason: from getter */
    public final Double getSegmentDistanceM() {
        return this.segmentDistanceM;
    }

    /* renamed from: component17, reason: from getter */
    public final Double getSegmentRemainingM() {
        return this.segmentRemainingM;
    }

    /* renamed from: component18, reason: from getter */
    public final Boolean getWorkoutFinished() {
        return this.workoutFinished;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsAutoPaused() {
        return this.isAutoPaused;
    }

    /* renamed from: component2, reason: from getter */
    public final Long getStartedAtMs() {
        return this.startedAtMs;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }

    /* renamed from: component21, reason: from getter */
    public final long getCurrentSplitElapsedMs() {
        return this.currentSplitElapsedMs;
    }

    /* renamed from: component22, reason: from getter */
    public final Integer getTargetPaceSecPerKm() {
        return this.targetPaceSecPerKm;
    }

    /* renamed from: component23, reason: from getter */
    public final Double getGoalDistanceM() {
        return this.goalDistanceM;
    }

    /* renamed from: component24, reason: from getter */
    public final Long getGoalTimeMs() {
        return this.goalTimeMs;
    }

    /* renamed from: component25, reason: from getter */
    public final int getSplitCount() {
        return this.splitCount;
    }

    /* renamed from: component26, reason: from getter */
    public final Long getLastSplitMs() {
        return this.lastSplitMs;
    }

    /* renamed from: component27, reason: from getter */
    public final int getLapCount() {
        return this.lapCount;
    }

    /* renamed from: component28, reason: from getter */
    public final Long getLastLapMs() {
        return this.lastLapMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getElapsedMs() {
        return this.elapsedMs;
    }

    /* renamed from: component4, reason: from getter */
    public final double getDistanceM() {
        return this.distanceM;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSteps() {
        return this.steps;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getLastLat() {
        return this.lastLat;
    }

    /* renamed from: component7, reason: from getter */
    public final Double getLastLon() {
        return this.lastLon;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getLastFinishedRunId() {
        return this.lastFinishedRunId;
    }

    /* renamed from: component9, reason: from getter */
    public final Long getLastFinishedAtMs() {
        return this.lastFinishedAtMs;
    }

    public final TrackingUiState copy(boolean isRecording, Long startedAtMs, long elapsedMs, double distanceM, long steps, Double lastLat, Double lastLon, Long lastFinishedRunId, Long lastFinishedAtMs, String planType, String segmentLabel, Integer segmentIndex, Integer segmentCount, Long segmentElapsedMs, Long segmentRemainingMs, Double segmentDistanceM, Double segmentRemainingM, Boolean workoutFinished, boolean isAutoPaused, boolean isPaused, long currentSplitElapsedMs, Integer targetPaceSecPerKm, Double goalDistanceM, Long goalTimeMs, int splitCount, Long lastSplitMs, int lapCount, Long lastLapMs) {
        return new TrackingUiState(isRecording, startedAtMs, elapsedMs, distanceM, steps, lastLat, lastLon, lastFinishedRunId, lastFinishedAtMs, planType, segmentLabel, segmentIndex, segmentCount, segmentElapsedMs, segmentRemainingMs, segmentDistanceM, segmentRemainingM, workoutFinished, isAutoPaused, isPaused, currentSplitElapsedMs, targetPaceSecPerKm, goalDistanceM, goalTimeMs, splitCount, lastSplitMs, lapCount, lastLapMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrackingUiState)) {
            return false;
        }
        TrackingUiState trackingUiState = (TrackingUiState) other;
        return this.isRecording == trackingUiState.isRecording && Intrinsics.areEqual(this.startedAtMs, trackingUiState.startedAtMs) && this.elapsedMs == trackingUiState.elapsedMs && Double.compare(this.distanceM, trackingUiState.distanceM) == 0 && this.steps == trackingUiState.steps && Intrinsics.areEqual((Object) this.lastLat, (Object) trackingUiState.lastLat) && Intrinsics.areEqual((Object) this.lastLon, (Object) trackingUiState.lastLon) && Intrinsics.areEqual(this.lastFinishedRunId, trackingUiState.lastFinishedRunId) && Intrinsics.areEqual(this.lastFinishedAtMs, trackingUiState.lastFinishedAtMs) && Intrinsics.areEqual(this.planType, trackingUiState.planType) && Intrinsics.areEqual(this.segmentLabel, trackingUiState.segmentLabel) && Intrinsics.areEqual(this.segmentIndex, trackingUiState.segmentIndex) && Intrinsics.areEqual(this.segmentCount, trackingUiState.segmentCount) && Intrinsics.areEqual(this.segmentElapsedMs, trackingUiState.segmentElapsedMs) && Intrinsics.areEqual(this.segmentRemainingMs, trackingUiState.segmentRemainingMs) && Intrinsics.areEqual((Object) this.segmentDistanceM, (Object) trackingUiState.segmentDistanceM) && Intrinsics.areEqual((Object) this.segmentRemainingM, (Object) trackingUiState.segmentRemainingM) && Intrinsics.areEqual(this.workoutFinished, trackingUiState.workoutFinished) && this.isAutoPaused == trackingUiState.isAutoPaused && this.isPaused == trackingUiState.isPaused && this.currentSplitElapsedMs == trackingUiState.currentSplitElapsedMs && Intrinsics.areEqual(this.targetPaceSecPerKm, trackingUiState.targetPaceSecPerKm) && Intrinsics.areEqual((Object) this.goalDistanceM, (Object) trackingUiState.goalDistanceM) && Intrinsics.areEqual(this.goalTimeMs, trackingUiState.goalTimeMs) && this.splitCount == trackingUiState.splitCount && Intrinsics.areEqual(this.lastSplitMs, trackingUiState.lastSplitMs) && this.lapCount == trackingUiState.lapCount && Intrinsics.areEqual(this.lastLapMs, trackingUiState.lastLapMs);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isRecording) * 31;
        Long l = this.startedAtMs;
        int hashCode2 = (((((((hashCode + (l == null ? 0 : l.hashCode())) * 31) + Long.hashCode(this.elapsedMs)) * 31) + Double.hashCode(this.distanceM)) * 31) + Long.hashCode(this.steps)) * 31;
        Double d = this.lastLat;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.lastLon;
        int hashCode4 = (hashCode3 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Long l2 = this.lastFinishedRunId;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.lastFinishedAtMs;
        int hashCode6 = (hashCode5 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str = this.planType;
        int hashCode7 = (hashCode6 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.segmentLabel;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.segmentIndex;
        int hashCode9 = (hashCode8 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.segmentCount;
        int hashCode10 = (hashCode9 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Long l4 = this.segmentElapsedMs;
        int hashCode11 = (hashCode10 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.segmentRemainingMs;
        int hashCode12 = (hashCode11 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Double d3 = this.segmentDistanceM;
        int hashCode13 = (hashCode12 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.segmentRemainingM;
        int hashCode14 = (hashCode13 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Boolean bool = this.workoutFinished;
        int hashCode15 = (((((((hashCode14 + (bool == null ? 0 : bool.hashCode())) * 31) + Boolean.hashCode(this.isAutoPaused)) * 31) + Boolean.hashCode(this.isPaused)) * 31) + Long.hashCode(this.currentSplitElapsedMs)) * 31;
        Integer num3 = this.targetPaceSecPerKm;
        int hashCode16 = (hashCode15 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Double d5 = this.goalDistanceM;
        int hashCode17 = (hashCode16 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Long l6 = this.goalTimeMs;
        int hashCode18 = (((hashCode17 + (l6 == null ? 0 : l6.hashCode())) * 31) + Integer.hashCode(this.splitCount)) * 31;
        Long l7 = this.lastSplitMs;
        int hashCode19 = (((hashCode18 + (l7 == null ? 0 : l7.hashCode())) * 31) + Integer.hashCode(this.lapCount)) * 31;
        Long l8 = this.lastLapMs;
        return hashCode19 + (l8 != null ? l8.hashCode() : 0);
    }

    public String toString() {
        return "TrackingUiState(isRecording=" + this.isRecording + ", startedAtMs=" + this.startedAtMs + ", elapsedMs=" + this.elapsedMs + ", distanceM=" + this.distanceM + ", steps=" + this.steps + ", lastLat=" + this.lastLat + ", lastLon=" + this.lastLon + ", lastFinishedRunId=" + this.lastFinishedRunId + ", lastFinishedAtMs=" + this.lastFinishedAtMs + ", planType=" + this.planType + ", segmentLabel=" + this.segmentLabel + ", segmentIndex=" + this.segmentIndex + ", segmentCount=" + this.segmentCount + ", segmentElapsedMs=" + this.segmentElapsedMs + ", segmentRemainingMs=" + this.segmentRemainingMs + ", segmentDistanceM=" + this.segmentDistanceM + ", segmentRemainingM=" + this.segmentRemainingM + ", workoutFinished=" + this.workoutFinished + ", isAutoPaused=" + this.isAutoPaused + ", isPaused=" + this.isPaused + ", currentSplitElapsedMs=" + this.currentSplitElapsedMs + ", targetPaceSecPerKm=" + this.targetPaceSecPerKm + ", goalDistanceM=" + this.goalDistanceM + ", goalTimeMs=" + this.goalTimeMs + ", splitCount=" + this.splitCount + ", lastSplitMs=" + this.lastSplitMs + ", lapCount=" + this.lapCount + ", lastLapMs=" + this.lastLapMs + ")";
    }

    public TrackingUiState(boolean z, Long l, long j, double d, long j2, Double d2, Double d3, Long l2, Long l3, String str, String str2, Integer num, Integer num2, Long l4, Long l5, Double d4, Double d5, Boolean bool, boolean z2, boolean z3, long j3, Integer num3, Double d6, Long l6, int i, Long l7, int i2, Long l8) {
        this.isRecording = z;
        this.startedAtMs = l;
        this.elapsedMs = j;
        this.distanceM = d;
        this.steps = j2;
        this.lastLat = d2;
        this.lastLon = d3;
        this.lastFinishedRunId = l2;
        this.lastFinishedAtMs = l3;
        this.planType = str;
        this.segmentLabel = str2;
        this.segmentIndex = num;
        this.segmentCount = num2;
        this.segmentElapsedMs = l4;
        this.segmentRemainingMs = l5;
        this.segmentDistanceM = d4;
        this.segmentRemainingM = d5;
        this.workoutFinished = bool;
        this.isAutoPaused = z2;
        this.isPaused = z3;
        this.currentSplitElapsedMs = j3;
        this.targetPaceSecPerKm = num3;
        this.goalDistanceM = d6;
        this.goalTimeMs = l6;
        this.splitCount = i;
        this.lastSplitMs = l7;
        this.lapCount = i2;
        this.lastLapMs = l8;
    }

    public /* synthetic */ TrackingUiState(boolean z, Long l, long j, double d, long j2, Double d2, Double d3, Long l2, Long l3, String str, String str2, Integer num, Integer num2, Long l4, Long l5, Double d4, Double d5, Boolean bool, boolean z2, boolean z3, long j3, Integer num3, Double d6, Long l6, int i, Long l7, int i2, Long l8, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? null : l, (i3 & 4) != 0 ? 0L : j, (i3 & 8) != 0 ? 0.0d : d, (i3 & 16) != 0 ? 0L : j2, (i3 & 32) != 0 ? null : d2, (i3 & 64) != 0 ? null : d3, (i3 & 128) != 0 ? null : l2, (i3 & 256) != 0 ? null : l3, (i3 & 512) != 0 ? null : str, (i3 & 1024) != 0 ? null : str2, (i3 & 2048) != 0 ? null : num, (i3 & 4096) != 0 ? null : num2, (i3 & 8192) != 0 ? null : l4, (i3 & 16384) != 0 ? null : l5, (i3 & 32768) != 0 ? null : d4, (i3 & 65536) != 0 ? null : d5, (i3 & 131072) != 0 ? null : bool, (i3 & 262144) != 0 ? false : z2, (i3 & 524288) != 0 ? false : z3, (i3 & 1048576) != 0 ? 0L : j3, (i3 & 2097152) != 0 ? null : num3, (i3 & 4194304) != 0 ? null : d6, (i3 & 8388608) != 0 ? null : l6, (i3 & 16777216) != 0 ? 0 : i, (i3 & 33554432) != 0 ? null : l7, (i3 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? 0 : i2, (i3 & 134217728) != 0 ? null : l8);
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    public final Long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final long getElapsedMs() {
        return this.elapsedMs;
    }

    public final double getDistanceM() {
        return this.distanceM;
    }

    public final long getSteps() {
        return this.steps;
    }

    public final Double getLastLat() {
        return this.lastLat;
    }

    public final Double getLastLon() {
        return this.lastLon;
    }

    public final Long getLastFinishedRunId() {
        return this.lastFinishedRunId;
    }

    public final Long getLastFinishedAtMs() {
        return this.lastFinishedAtMs;
    }

    public final String getPlanType() {
        return this.planType;
    }

    public final String getSegmentLabel() {
        return this.segmentLabel;
    }

    public final Integer getSegmentIndex() {
        return this.segmentIndex;
    }

    public final Integer getSegmentCount() {
        return this.segmentCount;
    }

    public final Long getSegmentElapsedMs() {
        return this.segmentElapsedMs;
    }

    public final Long getSegmentRemainingMs() {
        return this.segmentRemainingMs;
    }

    public final Double getSegmentDistanceM() {
        return this.segmentDistanceM;
    }

    public final Double getSegmentRemainingM() {
        return this.segmentRemainingM;
    }

    public final Boolean getWorkoutFinished() {
        return this.workoutFinished;
    }

    public final boolean isAutoPaused() {
        return this.isAutoPaused;
    }

    public final boolean isPaused() {
        return this.isPaused;
    }

    public final long getCurrentSplitElapsedMs() {
        return this.currentSplitElapsedMs;
    }

    public final Integer getTargetPaceSecPerKm() {
        return this.targetPaceSecPerKm;
    }

    public final Double getGoalDistanceM() {
        return this.goalDistanceM;
    }

    public final Long getGoalTimeMs() {
        return this.goalTimeMs;
    }

    public final int getSplitCount() {
        return this.splitCount;
    }

    public final Long getLastSplitMs() {
        return this.lastSplitMs;
    }

    public final int getLapCount() {
        return this.lapCount;
    }

    public final Long getLastLapMs() {
        return this.lastLapMs;
    }
}
