package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.style.layers.Property;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\bT\b\u0087\b\u0018\u00002\u00020\u0001BÝ\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b%\u0010&J\t\u0010M\u001a\u00020\u0003HÆ\u0003J\t\u0010N\u001a\u00020\u0003HÆ\u0003J\t\u0010O\u001a\u00020\u0003HÆ\u0003J\t\u0010P\u001a\u00020\u0007HÆ\u0003J\u0010\u0010Q\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010R\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010S\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010T\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010U\u001a\u00020\rHÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010Y\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010Z\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010[\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\t\u0010\\\u001a\u00020\u0015HÆ\u0003J\u0010\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010^\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010_\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u0010\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010a\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010b\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010c\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010d\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010DJ\u000b\u0010e\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010f\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010DJ\u000b\u0010g\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0010\u0010h\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0002\u0010DJ\u0010\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010.J\u000b\u0010j\u001a\u0004\u0018\u00010\rHÆ\u0003Jê\u0002\u0010k\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0014\u001a\u00020\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0002\u0010lJ\u0013\u0010m\u001a\u00020\u00152\b\u0010n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010o\u001a\u00020\u0007HÖ\u0001J\t\u0010p\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b-\u0010.R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b0\u0010.R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b1\u0010.R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b2\u0010.R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b5\u00104R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b6\u0010.R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b7\u0010.R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b8\u0010.R\u0015\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b9\u0010.R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b:\u0010.R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<R\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b=\u0010.R\u0015\u0010\u0017\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b>\u0010.R\u0015\u0010\u0018\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b?\u0010.R\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\b@\u0010.R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bA\u00104R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bB\u00104R\u0015\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010E\u001a\u0004\bF\u0010DR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bG\u00104R\u0015\u0010 \u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010E\u001a\u0004\bH\u0010DR\u0013\u0010!\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bI\u00104R\u0015\u0010\"\u001a\u0004\u0018\u00010\u001d¢\u0006\n\n\u0002\u0010E\u001a\u0004\bJ\u0010DR\u0015\u0010#\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010/\u001a\u0004\bK\u0010.R\u0013\u0010$\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\bL\u00104¨\u0006q"}, d2 = {"Lcom/example/rungps/data/SleepEntryEntity;", "", "id", "", "startTimeMs", "endTimeMs", "totalSleepMin", "", "deepSleepMin", "lightSleepMin", "sleepEfficiency", "sleepQuality", Property.SYMBOL_Z_ORDER_SOURCE, "", "notes", "wakeMood", "snoreEvents", "awakeSleepMin", "restlessnessIndex", "remSleepMin", "smartAlarmUsed", "", "timeToFallAsleepMin", "scoreRoutine", "scoreQualityPillar", "scoreDuration", "hypnogramCompact", "eventMarkersCompact", "stageConfidenceMean", "", "micCoverageRatio", "fusionSource", "breathRateMean", "osaRiskHint", "sleepDebtHours", "consistencyScore", "sleepAnalyticsJson", "<init>", "(JJJILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()J", "getStartTimeMs", "getEndTimeMs", "getTotalSleepMin", "()I", "getDeepSleepMin", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLightSleepMin", "getSleepEfficiency", "getSleepQuality", "getSource", "()Ljava/lang/String;", "getNotes", "getWakeMood", "getSnoreEvents", "getAwakeSleepMin", "getRestlessnessIndex", "getRemSleepMin", "getSmartAlarmUsed", "()Z", "getTimeToFallAsleepMin", "getScoreRoutine", "getScoreQualityPillar", "getScoreDuration", "getHypnogramCompact", "getEventMarkersCompact", "getStageConfidenceMean", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getMicCoverageRatio", "getFusionSource", "getBreathRateMean", "getOsaRiskHint", "getSleepDebtHours", "getConsistencyScore", "getSleepAnalyticsJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "copy", "(JJJILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;ZLjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/rungps/data/SleepEntryEntity;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepEntryEntity {
    private final Integer awakeSleepMin;
    private final Float breathRateMean;
    private final Integer consistencyScore;
    private final Integer deepSleepMin;
    private final long endTimeMs;
    private final String eventMarkersCompact;
    private final String fusionSource;
    private final String hypnogramCompact;
    private final long id;
    private final Integer lightSleepMin;
    private final Float micCoverageRatio;
    private final String notes;
    private final String osaRiskHint;
    private final Integer remSleepMin;
    private final Integer restlessnessIndex;
    private final Integer scoreDuration;
    private final Integer scoreQualityPillar;
    private final Integer scoreRoutine;
    private final String sleepAnalyticsJson;
    private final Float sleepDebtHours;
    private final Integer sleepEfficiency;
    private final Integer sleepQuality;
    private final boolean smartAlarmUsed;
    private final Integer snoreEvents;
    private final String source;
    private final Float stageConfidenceMean;
    private final long startTimeMs;
    private final Integer timeToFallAsleepMin;
    private final int totalSleepMin;
    private final Integer wakeMood;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getWakeMood() {
        return this.wakeMood;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getSnoreEvents() {
        return this.snoreEvents;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getAwakeSleepMin() {
        return this.awakeSleepMin;
    }

    /* renamed from: component14, reason: from getter */
    public final Integer getRestlessnessIndex() {
        return this.restlessnessIndex;
    }

    /* renamed from: component15, reason: from getter */
    public final Integer getRemSleepMin() {
        return this.remSleepMin;
    }

    /* renamed from: component16, reason: from getter */
    public final boolean getSmartAlarmUsed() {
        return this.smartAlarmUsed;
    }

    /* renamed from: component17, reason: from getter */
    public final Integer getTimeToFallAsleepMin() {
        return this.timeToFallAsleepMin;
    }

    /* renamed from: component18, reason: from getter */
    public final Integer getScoreRoutine() {
        return this.scoreRoutine;
    }

    /* renamed from: component19, reason: from getter */
    public final Integer getScoreQualityPillar() {
        return this.scoreQualityPillar;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* renamed from: component20, reason: from getter */
    public final Integer getScoreDuration() {
        return this.scoreDuration;
    }

    /* renamed from: component21, reason: from getter */
    public final String getHypnogramCompact() {
        return this.hypnogramCompact;
    }

    /* renamed from: component22, reason: from getter */
    public final String getEventMarkersCompact() {
        return this.eventMarkersCompact;
    }

    /* renamed from: component23, reason: from getter */
    public final Float getStageConfidenceMean() {
        return this.stageConfidenceMean;
    }

    /* renamed from: component24, reason: from getter */
    public final Float getMicCoverageRatio() {
        return this.micCoverageRatio;
    }

    /* renamed from: component25, reason: from getter */
    public final String getFusionSource() {
        return this.fusionSource;
    }

    /* renamed from: component26, reason: from getter */
    public final Float getBreathRateMean() {
        return this.breathRateMean;
    }

    /* renamed from: component27, reason: from getter */
    public final String getOsaRiskHint() {
        return this.osaRiskHint;
    }

    /* renamed from: component28, reason: from getter */
    public final Float getSleepDebtHours() {
        return this.sleepDebtHours;
    }

    /* renamed from: component29, reason: from getter */
    public final Integer getConsistencyScore() {
        return this.consistencyScore;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    /* renamed from: component30, reason: from getter */
    public final String getSleepAnalyticsJson() {
        return this.sleepAnalyticsJson;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTotalSleepMin() {
        return this.totalSleepMin;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getDeepSleepMin() {
        return this.deepSleepMin;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getLightSleepMin() {
        return this.lightSleepMin;
    }

    /* renamed from: component7, reason: from getter */
    public final Integer getSleepEfficiency() {
        return this.sleepEfficiency;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getSleepQuality() {
        return this.sleepQuality;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final SleepEntryEntity copy(long id, long startTimeMs, long endTimeMs, int totalSleepMin, Integer deepSleepMin, Integer lightSleepMin, Integer sleepEfficiency, Integer sleepQuality, String source, String notes, Integer wakeMood, Integer snoreEvents, Integer awakeSleepMin, Integer restlessnessIndex, Integer remSleepMin, boolean smartAlarmUsed, Integer timeToFallAsleepMin, Integer scoreRoutine, Integer scoreQualityPillar, Integer scoreDuration, String hypnogramCompact, String eventMarkersCompact, Float stageConfidenceMean, Float micCoverageRatio, String fusionSource, Float breathRateMean, String osaRiskHint, Float sleepDebtHours, Integer consistencyScore, String sleepAnalyticsJson) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new SleepEntryEntity(id, startTimeMs, endTimeMs, totalSleepMin, deepSleepMin, lightSleepMin, sleepEfficiency, sleepQuality, source, notes, wakeMood, snoreEvents, awakeSleepMin, restlessnessIndex, remSleepMin, smartAlarmUsed, timeToFallAsleepMin, scoreRoutine, scoreQualityPillar, scoreDuration, hypnogramCompact, eventMarkersCompact, stageConfidenceMean, micCoverageRatio, fusionSource, breathRateMean, osaRiskHint, sleepDebtHours, consistencyScore, sleepAnalyticsJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepEntryEntity)) {
            return false;
        }
        SleepEntryEntity sleepEntryEntity = (SleepEntryEntity) other;
        return this.id == sleepEntryEntity.id && this.startTimeMs == sleepEntryEntity.startTimeMs && this.endTimeMs == sleepEntryEntity.endTimeMs && this.totalSleepMin == sleepEntryEntity.totalSleepMin && Intrinsics.areEqual(this.deepSleepMin, sleepEntryEntity.deepSleepMin) && Intrinsics.areEqual(this.lightSleepMin, sleepEntryEntity.lightSleepMin) && Intrinsics.areEqual(this.sleepEfficiency, sleepEntryEntity.sleepEfficiency) && Intrinsics.areEqual(this.sleepQuality, sleepEntryEntity.sleepQuality) && Intrinsics.areEqual(this.source, sleepEntryEntity.source) && Intrinsics.areEqual(this.notes, sleepEntryEntity.notes) && Intrinsics.areEqual(this.wakeMood, sleepEntryEntity.wakeMood) && Intrinsics.areEqual(this.snoreEvents, sleepEntryEntity.snoreEvents) && Intrinsics.areEqual(this.awakeSleepMin, sleepEntryEntity.awakeSleepMin) && Intrinsics.areEqual(this.restlessnessIndex, sleepEntryEntity.restlessnessIndex) && Intrinsics.areEqual(this.remSleepMin, sleepEntryEntity.remSleepMin) && this.smartAlarmUsed == sleepEntryEntity.smartAlarmUsed && Intrinsics.areEqual(this.timeToFallAsleepMin, sleepEntryEntity.timeToFallAsleepMin) && Intrinsics.areEqual(this.scoreRoutine, sleepEntryEntity.scoreRoutine) && Intrinsics.areEqual(this.scoreQualityPillar, sleepEntryEntity.scoreQualityPillar) && Intrinsics.areEqual(this.scoreDuration, sleepEntryEntity.scoreDuration) && Intrinsics.areEqual(this.hypnogramCompact, sleepEntryEntity.hypnogramCompact) && Intrinsics.areEqual(this.eventMarkersCompact, sleepEntryEntity.eventMarkersCompact) && Intrinsics.areEqual((Object) this.stageConfidenceMean, (Object) sleepEntryEntity.stageConfidenceMean) && Intrinsics.areEqual((Object) this.micCoverageRatio, (Object) sleepEntryEntity.micCoverageRatio) && Intrinsics.areEqual(this.fusionSource, sleepEntryEntity.fusionSource) && Intrinsics.areEqual((Object) this.breathRateMean, (Object) sleepEntryEntity.breathRateMean) && Intrinsics.areEqual(this.osaRiskHint, sleepEntryEntity.osaRiskHint) && Intrinsics.areEqual((Object) this.sleepDebtHours, (Object) sleepEntryEntity.sleepDebtHours) && Intrinsics.areEqual(this.consistencyScore, sleepEntryEntity.consistencyScore) && Intrinsics.areEqual(this.sleepAnalyticsJson, sleepEntryEntity.sleepAnalyticsJson);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.startTimeMs)) * 31) + Long.hashCode(this.endTimeMs)) * 31) + Integer.hashCode(this.totalSleepMin)) * 31;
        Integer num = this.deepSleepMin;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.lightSleepMin;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.sleepEfficiency;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.sleepQuality;
        int hashCode5 = (((hashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31) + this.source.hashCode()) * 31;
        String str = this.notes;
        int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num5 = this.wakeMood;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.snoreEvents;
        int hashCode8 = (hashCode7 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.awakeSleepMin;
        int hashCode9 = (hashCode8 + (num7 == null ? 0 : num7.hashCode())) * 31;
        Integer num8 = this.restlessnessIndex;
        int hashCode10 = (hashCode9 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.remSleepMin;
        int hashCode11 = (((hashCode10 + (num9 == null ? 0 : num9.hashCode())) * 31) + Boolean.hashCode(this.smartAlarmUsed)) * 31;
        Integer num10 = this.timeToFallAsleepMin;
        int hashCode12 = (hashCode11 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.scoreRoutine;
        int hashCode13 = (hashCode12 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.scoreQualityPillar;
        int hashCode14 = (hashCode13 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.scoreDuration;
        int hashCode15 = (hashCode14 + (num13 == null ? 0 : num13.hashCode())) * 31;
        String str2 = this.hypnogramCompact;
        int hashCode16 = (hashCode15 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.eventMarkersCompact;
        int hashCode17 = (hashCode16 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Float f = this.stageConfidenceMean;
        int hashCode18 = (hashCode17 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.micCoverageRatio;
        int hashCode19 = (hashCode18 + (f2 == null ? 0 : f2.hashCode())) * 31;
        String str4 = this.fusionSource;
        int hashCode20 = (hashCode19 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Float f3 = this.breathRateMean;
        int hashCode21 = (hashCode20 + (f3 == null ? 0 : f3.hashCode())) * 31;
        String str5 = this.osaRiskHint;
        int hashCode22 = (hashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Float f4 = this.sleepDebtHours;
        int hashCode23 = (hashCode22 + (f4 == null ? 0 : f4.hashCode())) * 31;
        Integer num14 = this.consistencyScore;
        int hashCode24 = (hashCode23 + (num14 == null ? 0 : num14.hashCode())) * 31;
        String str6 = this.sleepAnalyticsJson;
        return hashCode24 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "SleepEntryEntity(id=" + this.id + ", startTimeMs=" + this.startTimeMs + ", endTimeMs=" + this.endTimeMs + ", totalSleepMin=" + this.totalSleepMin + ", deepSleepMin=" + this.deepSleepMin + ", lightSleepMin=" + this.lightSleepMin + ", sleepEfficiency=" + this.sleepEfficiency + ", sleepQuality=" + this.sleepQuality + ", source=" + this.source + ", notes=" + this.notes + ", wakeMood=" + this.wakeMood + ", snoreEvents=" + this.snoreEvents + ", awakeSleepMin=" + this.awakeSleepMin + ", restlessnessIndex=" + this.restlessnessIndex + ", remSleepMin=" + this.remSleepMin + ", smartAlarmUsed=" + this.smartAlarmUsed + ", timeToFallAsleepMin=" + this.timeToFallAsleepMin + ", scoreRoutine=" + this.scoreRoutine + ", scoreQualityPillar=" + this.scoreQualityPillar + ", scoreDuration=" + this.scoreDuration + ", hypnogramCompact=" + this.hypnogramCompact + ", eventMarkersCompact=" + this.eventMarkersCompact + ", stageConfidenceMean=" + this.stageConfidenceMean + ", micCoverageRatio=" + this.micCoverageRatio + ", fusionSource=" + this.fusionSource + ", breathRateMean=" + this.breathRateMean + ", osaRiskHint=" + this.osaRiskHint + ", sleepDebtHours=" + this.sleepDebtHours + ", consistencyScore=" + this.consistencyScore + ", sleepAnalyticsJson=" + this.sleepAnalyticsJson + ")";
    }

    public SleepEntryEntity(long j, long j2, long j3, int i, Integer num, Integer num2, Integer num3, Integer num4, String source, String str, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z, Integer num10, Integer num11, Integer num12, Integer num13, String str2, String str3, Float f, Float f2, String str4, Float f3, String str5, Float f4, Integer num14, String str6) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = j;
        this.startTimeMs = j2;
        this.endTimeMs = j3;
        this.totalSleepMin = i;
        this.deepSleepMin = num;
        this.lightSleepMin = num2;
        this.sleepEfficiency = num3;
        this.sleepQuality = num4;
        this.source = source;
        this.notes = str;
        this.wakeMood = num5;
        this.snoreEvents = num6;
        this.awakeSleepMin = num7;
        this.restlessnessIndex = num8;
        this.remSleepMin = num9;
        this.smartAlarmUsed = z;
        this.timeToFallAsleepMin = num10;
        this.scoreRoutine = num11;
        this.scoreQualityPillar = num12;
        this.scoreDuration = num13;
        this.hypnogramCompact = str2;
        this.eventMarkersCompact = str3;
        this.stageConfidenceMean = f;
        this.micCoverageRatio = f2;
        this.fusionSource = str4;
        this.breathRateMean = f3;
        this.osaRiskHint = str5;
        this.sleepDebtHours = f4;
        this.consistencyScore = num14;
        this.sleepAnalyticsJson = str6;
    }

    public final long getId() {
        return this.id;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final long getEndTimeMs() {
        return this.endTimeMs;
    }

    public final int getTotalSleepMin() {
        return this.totalSleepMin;
    }

    public final Integer getDeepSleepMin() {
        return this.deepSleepMin;
    }

    public final Integer getLightSleepMin() {
        return this.lightSleepMin;
    }

    public final Integer getSleepEfficiency() {
        return this.sleepEfficiency;
    }

    public final Integer getSleepQuality() {
        return this.sleepQuality;
    }

    public /* synthetic */ SleepEntryEntity(long j, long j2, long j3, int i, Integer num, Integer num2, Integer num3, Integer num4, String str, String str2, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, boolean z, Integer num10, Integer num11, Integer num12, Integer num13, String str3, String str4, Float f, Float f2, String str5, Float f3, String str6, Float f4, Integer num14, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, j3, i, (i2 & 16) != 0 ? null : num, (i2 & 32) != 0 ? null : num2, (i2 & 64) != 0 ? null : num3, (i2 & 128) != 0 ? null : num4, (i2 & 256) != 0 ? "manual" : str, (i2 & 512) != 0 ? null : str2, (i2 & 1024) != 0 ? null : num5, (i2 & 2048) != 0 ? null : num6, (i2 & 4096) != 0 ? null : num7, (i2 & 8192) != 0 ? null : num8, (i2 & 16384) != 0 ? null : num9, (32768 & i2) != 0 ? false : z, (65536 & i2) != 0 ? null : num10, (131072 & i2) != 0 ? null : num11, (262144 & i2) != 0 ? null : num12, (524288 & i2) != 0 ? null : num13, (1048576 & i2) != 0 ? null : str3, (2097152 & i2) != 0 ? null : str4, (4194304 & i2) != 0 ? null : f, (8388608 & i2) != 0 ? null : f2, (16777216 & i2) != 0 ? null : str5, (33554432 & i2) != 0 ? null : f3, (67108864 & i2) != 0 ? null : str6, (134217728 & i2) != 0 ? null : f4, (268435456 & i2) != 0 ? null : num14, (i2 & 536870912) != 0 ? null : str7);
    }

    public final String getSource() {
        return this.source;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Integer getWakeMood() {
        return this.wakeMood;
    }

    public final Integer getSnoreEvents() {
        return this.snoreEvents;
    }

    public final Integer getAwakeSleepMin() {
        return this.awakeSleepMin;
    }

    public final Integer getRestlessnessIndex() {
        return this.restlessnessIndex;
    }

    public final Integer getRemSleepMin() {
        return this.remSleepMin;
    }

    public final boolean getSmartAlarmUsed() {
        return this.smartAlarmUsed;
    }

    public final Integer getTimeToFallAsleepMin() {
        return this.timeToFallAsleepMin;
    }

    public final Integer getScoreRoutine() {
        return this.scoreRoutine;
    }

    public final Integer getScoreQualityPillar() {
        return this.scoreQualityPillar;
    }

    public final Integer getScoreDuration() {
        return this.scoreDuration;
    }

    public final String getHypnogramCompact() {
        return this.hypnogramCompact;
    }

    public final String getEventMarkersCompact() {
        return this.eventMarkersCompact;
    }

    public final Float getStageConfidenceMean() {
        return this.stageConfidenceMean;
    }

    public final Float getMicCoverageRatio() {
        return this.micCoverageRatio;
    }

    public final String getFusionSource() {
        return this.fusionSource;
    }

    public final Float getBreathRateMean() {
        return this.breathRateMean;
    }

    public final String getOsaRiskHint() {
        return this.osaRiskHint;
    }

    public final Float getSleepDebtHours() {
        return this.sleepDebtHours;
    }

    public final Integer getConsistencyScore() {
        return this.consistencyScore;
    }

    public final String getSleepAnalyticsJson() {
        return this.sleepAnalyticsJson;
    }
}
