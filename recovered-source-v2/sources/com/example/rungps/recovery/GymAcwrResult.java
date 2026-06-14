package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymAcwr.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/recovery/GymAcwrResult;", "", "acuteTonnage7d", "", "chronicAvgWeeklyTonnage28d", "ratio", "zoneLabel", "", "guidance", "<init>", "(DDDLjava/lang/String;Ljava/lang/String;)V", "getAcuteTonnage7d", "()D", "getChronicAvgWeeklyTonnage28d", "getRatio", "getZoneLabel", "()Ljava/lang/String;", "getGuidance", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymAcwrResult {
    public static final int $stable = 0;
    private final double acuteTonnage7d;
    private final double chronicAvgWeeklyTonnage28d;
    private final String guidance;
    private final double ratio;
    private final String zoneLabel;

    /* renamed from: component1, reason: from getter */
    public final double getAcuteTonnage7d() {
        return this.acuteTonnage7d;
    }

    /* renamed from: component2, reason: from getter */
    public final double getChronicAvgWeeklyTonnage28d() {
        return this.chronicAvgWeeklyTonnage28d;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRatio() {
        return this.ratio;
    }

    /* renamed from: component4, reason: from getter */
    public final String getZoneLabel() {
        return this.zoneLabel;
    }

    /* renamed from: component5, reason: from getter */
    public final String getGuidance() {
        return this.guidance;
    }

    public final GymAcwrResult copy(double acuteTonnage7d, double chronicAvgWeeklyTonnage28d, double ratio, String zoneLabel, String guidance) {
        Intrinsics.checkNotNullParameter(zoneLabel, "zoneLabel");
        Intrinsics.checkNotNullParameter(guidance, "guidance");
        return new GymAcwrResult(acuteTonnage7d, chronicAvgWeeklyTonnage28d, ratio, zoneLabel, guidance);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymAcwrResult)) {
            return false;
        }
        GymAcwrResult gymAcwrResult = (GymAcwrResult) other;
        return Double.compare(this.acuteTonnage7d, gymAcwrResult.acuteTonnage7d) == 0 && Double.compare(this.chronicAvgWeeklyTonnage28d, gymAcwrResult.chronicAvgWeeklyTonnage28d) == 0 && Double.compare(this.ratio, gymAcwrResult.ratio) == 0 && Intrinsics.areEqual(this.zoneLabel, gymAcwrResult.zoneLabel) && Intrinsics.areEqual(this.guidance, gymAcwrResult.guidance);
    }

    public int hashCode() {
        return (((((((Double.hashCode(this.acuteTonnage7d) * 31) + Double.hashCode(this.chronicAvgWeeklyTonnage28d)) * 31) + Double.hashCode(this.ratio)) * 31) + this.zoneLabel.hashCode()) * 31) + this.guidance.hashCode();
    }

    public String toString() {
        return "GymAcwrResult(acuteTonnage7d=" + this.acuteTonnage7d + ", chronicAvgWeeklyTonnage28d=" + this.chronicAvgWeeklyTonnage28d + ", ratio=" + this.ratio + ", zoneLabel=" + this.zoneLabel + ", guidance=" + this.guidance + ")";
    }

    public GymAcwrResult(double d, double d2, double d3, String zoneLabel, String guidance) {
        Intrinsics.checkNotNullParameter(zoneLabel, "zoneLabel");
        Intrinsics.checkNotNullParameter(guidance, "guidance");
        this.acuteTonnage7d = d;
        this.chronicAvgWeeklyTonnage28d = d2;
        this.ratio = d3;
        this.zoneLabel = zoneLabel;
        this.guidance = guidance;
    }

    public final double getAcuteTonnage7d() {
        return this.acuteTonnage7d;
    }

    public final double getChronicAvgWeeklyTonnage28d() {
        return this.chronicAvgWeeklyTonnage28d;
    }

    public final double getRatio() {
        return this.ratio;
    }

    public final String getZoneLabel() {
        return this.zoneLabel;
    }

    public final String getGuidance() {
        return this.guidance;
    }
}
