package com.example.rungps.sleep;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepTrackSample.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u000eHÆ\u0003Jw\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006/"}, d2 = {"Lcom/example/rungps/sleep/OvernightAnalysis;", "", "totalSleepMin", "", "deepSleepMin", "lightSleepMin", "remSleepMin", "awakeSleepMin", "snoreEvents", "restlessnessIndex", "timeToFallAsleepMin", "efficiency", "sleepCycles", "qualityHint", "", "<init>", "(IIIIIIIIIILjava/lang/String;)V", "getTotalSleepMin", "()I", "getDeepSleepMin", "getLightSleepMin", "getRemSleepMin", "getAwakeSleepMin", "getSnoreEvents", "getRestlessnessIndex", "getTimeToFallAsleepMin", "getEfficiency", "getSleepCycles", "getQualityHint", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class OvernightAnalysis {
    public static final int $stable = 0;
    private final int awakeSleepMin;
    private final int deepSleepMin;
    private final int efficiency;
    private final int lightSleepMin;
    private final String qualityHint;
    private final int remSleepMin;
    private final int restlessnessIndex;
    private final int sleepCycles;
    private final int snoreEvents;
    private final int timeToFallAsleepMin;
    private final int totalSleepMin;

    /* renamed from: component1, reason: from getter */
    public final int getTotalSleepMin() {
        return this.totalSleepMin;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSleepCycles() {
        return this.sleepCycles;
    }

    /* renamed from: component11, reason: from getter */
    public final String getQualityHint() {
        return this.qualityHint;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDeepSleepMin() {
        return this.deepSleepMin;
    }

    /* renamed from: component3, reason: from getter */
    public final int getLightSleepMin() {
        return this.lightSleepMin;
    }

    /* renamed from: component4, reason: from getter */
    public final int getRemSleepMin() {
        return this.remSleepMin;
    }

    /* renamed from: component5, reason: from getter */
    public final int getAwakeSleepMin() {
        return this.awakeSleepMin;
    }

    /* renamed from: component6, reason: from getter */
    public final int getSnoreEvents() {
        return this.snoreEvents;
    }

    /* renamed from: component7, reason: from getter */
    public final int getRestlessnessIndex() {
        return this.restlessnessIndex;
    }

    /* renamed from: component8, reason: from getter */
    public final int getTimeToFallAsleepMin() {
        return this.timeToFallAsleepMin;
    }

    /* renamed from: component9, reason: from getter */
    public final int getEfficiency() {
        return this.efficiency;
    }

    public final OvernightAnalysis copy(int totalSleepMin, int deepSleepMin, int lightSleepMin, int remSleepMin, int awakeSleepMin, int snoreEvents, int restlessnessIndex, int timeToFallAsleepMin, int efficiency, int sleepCycles, String qualityHint) {
        Intrinsics.checkNotNullParameter(qualityHint, "qualityHint");
        return new OvernightAnalysis(totalSleepMin, deepSleepMin, lightSleepMin, remSleepMin, awakeSleepMin, snoreEvents, restlessnessIndex, timeToFallAsleepMin, efficiency, sleepCycles, qualityHint);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OvernightAnalysis)) {
            return false;
        }
        OvernightAnalysis overnightAnalysis = (OvernightAnalysis) other;
        return this.totalSleepMin == overnightAnalysis.totalSleepMin && this.deepSleepMin == overnightAnalysis.deepSleepMin && this.lightSleepMin == overnightAnalysis.lightSleepMin && this.remSleepMin == overnightAnalysis.remSleepMin && this.awakeSleepMin == overnightAnalysis.awakeSleepMin && this.snoreEvents == overnightAnalysis.snoreEvents && this.restlessnessIndex == overnightAnalysis.restlessnessIndex && this.timeToFallAsleepMin == overnightAnalysis.timeToFallAsleepMin && this.efficiency == overnightAnalysis.efficiency && this.sleepCycles == overnightAnalysis.sleepCycles && Intrinsics.areEqual(this.qualityHint, overnightAnalysis.qualityHint);
    }

    public int hashCode() {
        return (((((((((((((((((((Integer.hashCode(this.totalSleepMin) * 31) + Integer.hashCode(this.deepSleepMin)) * 31) + Integer.hashCode(this.lightSleepMin)) * 31) + Integer.hashCode(this.remSleepMin)) * 31) + Integer.hashCode(this.awakeSleepMin)) * 31) + Integer.hashCode(this.snoreEvents)) * 31) + Integer.hashCode(this.restlessnessIndex)) * 31) + Integer.hashCode(this.timeToFallAsleepMin)) * 31) + Integer.hashCode(this.efficiency)) * 31) + Integer.hashCode(this.sleepCycles)) * 31) + this.qualityHint.hashCode();
    }

    public String toString() {
        return "OvernightAnalysis(totalSleepMin=" + this.totalSleepMin + ", deepSleepMin=" + this.deepSleepMin + ", lightSleepMin=" + this.lightSleepMin + ", remSleepMin=" + this.remSleepMin + ", awakeSleepMin=" + this.awakeSleepMin + ", snoreEvents=" + this.snoreEvents + ", restlessnessIndex=" + this.restlessnessIndex + ", timeToFallAsleepMin=" + this.timeToFallAsleepMin + ", efficiency=" + this.efficiency + ", sleepCycles=" + this.sleepCycles + ", qualityHint=" + this.qualityHint + ")";
    }

    public OvernightAnalysis(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String qualityHint) {
        Intrinsics.checkNotNullParameter(qualityHint, "qualityHint");
        this.totalSleepMin = i;
        this.deepSleepMin = i2;
        this.lightSleepMin = i3;
        this.remSleepMin = i4;
        this.awakeSleepMin = i5;
        this.snoreEvents = i6;
        this.restlessnessIndex = i7;
        this.timeToFallAsleepMin = i8;
        this.efficiency = i9;
        this.sleepCycles = i10;
        this.qualityHint = qualityHint;
    }

    public final int getTotalSleepMin() {
        return this.totalSleepMin;
    }

    public final int getDeepSleepMin() {
        return this.deepSleepMin;
    }

    public final int getLightSleepMin() {
        return this.lightSleepMin;
    }

    public final int getRemSleepMin() {
        return this.remSleepMin;
    }

    public final int getAwakeSleepMin() {
        return this.awakeSleepMin;
    }

    public final int getSnoreEvents() {
        return this.snoreEvents;
    }

    public final int getRestlessnessIndex() {
        return this.restlessnessIndex;
    }

    public final int getTimeToFallAsleepMin() {
        return this.timeToFallAsleepMin;
    }

    public final int getEfficiency() {
        return this.efficiency;
    }

    public final int getSleepCycles() {
        return this.sleepCycles;
    }

    public /* synthetic */ OvernightAnalysis(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, String str, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3, i4, i5, i6, i7, i8, i9, (i11 & 512) != 0 ? 0 : i10, (i11 & 1024) != 0 ? "" : str);
    }

    public final String getQualityHint() {
        return this.qualityHint;
    }
}
