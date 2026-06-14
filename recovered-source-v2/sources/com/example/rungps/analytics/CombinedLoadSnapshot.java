package com.example.rungps.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CombinedLoadScore.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b#\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\r\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\t\u0010.\u001a\u00020\nHÆ\u0003J\t\u0010/\u001a\u00020\rHÆ\u0003J\t\u00100\u001a\u00020\rHÆ\u0003J\t\u00101\u001a\u00020\rHÆ\u0003J\t\u00102\u001a\u00020\rHÆ\u0003J\t\u00103\u001a\u00020\rHÆ\u0003J\t\u00104\u001a\u00020\u0013HÆ\u0003J\u008b\u0001\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\r2\b\b\u0002\u0010\u0011\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00109\u001a\u00020\u0003HÖ\u0001J\t\u0010:\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0011\u0010\u0010\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0011\u0010\u0011\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006;"}, d2 = {"Lcom/example/rungps/analytics/CombinedLoadSnapshot;", "", "score", "", "runKm7d", "", "rideKm7d", "gymTonnage7d", "soccerMin7d", "label", "", "detail", "runShare", "", "rideShare", "gymShare", "soccerShare", "stepShare", "steps7d", "", "<init>", "(IDDDILjava/lang/String;Ljava/lang/String;FFFFFJ)V", "getScore", "()I", "getRunKm7d", "()D", "getRideKm7d", "getGymTonnage7d", "getSoccerMin7d", "getLabel", "()Ljava/lang/String;", "getDetail", "getRunShare", "()F", "getRideShare", "getGymShare", "getSoccerShare", "getStepShare", "getSteps7d", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CombinedLoadSnapshot {
    public static final int $stable = 0;
    private final String detail;
    private final float gymShare;
    private final double gymTonnage7d;
    private final String label;
    private final double rideKm7d;
    private final float rideShare;
    private final double runKm7d;
    private final float runShare;
    private final int score;
    private final int soccerMin7d;
    private final float soccerShare;
    private final float stepShare;
    private final long steps7d;

    /* renamed from: component1, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: component10, reason: from getter */
    public final float getGymShare() {
        return this.gymShare;
    }

    /* renamed from: component11, reason: from getter */
    public final float getSoccerShare() {
        return this.soccerShare;
    }

    /* renamed from: component12, reason: from getter */
    public final float getStepShare() {
        return this.stepShare;
    }

    /* renamed from: component13, reason: from getter */
    public final long getSteps7d() {
        return this.steps7d;
    }

    /* renamed from: component2, reason: from getter */
    public final double getRunKm7d() {
        return this.runKm7d;
    }

    /* renamed from: component3, reason: from getter */
    public final double getRideKm7d() {
        return this.rideKm7d;
    }

    /* renamed from: component4, reason: from getter */
    public final double getGymTonnage7d() {
        return this.gymTonnage7d;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSoccerMin7d() {
        return this.soccerMin7d;
    }

    /* renamed from: component6, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component7, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    /* renamed from: component8, reason: from getter */
    public final float getRunShare() {
        return this.runShare;
    }

    /* renamed from: component9, reason: from getter */
    public final float getRideShare() {
        return this.rideShare;
    }

    public final CombinedLoadSnapshot copy(int score, double runKm7d, double rideKm7d, double gymTonnage7d, int soccerMin7d, String label, String detail, float runShare, float rideShare, float gymShare, float soccerShare, float stepShare, long steps7d) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new CombinedLoadSnapshot(score, runKm7d, rideKm7d, gymTonnage7d, soccerMin7d, label, detail, runShare, rideShare, gymShare, soccerShare, stepShare, steps7d);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CombinedLoadSnapshot)) {
            return false;
        }
        CombinedLoadSnapshot combinedLoadSnapshot = (CombinedLoadSnapshot) other;
        return this.score == combinedLoadSnapshot.score && Double.compare(this.runKm7d, combinedLoadSnapshot.runKm7d) == 0 && Double.compare(this.rideKm7d, combinedLoadSnapshot.rideKm7d) == 0 && Double.compare(this.gymTonnage7d, combinedLoadSnapshot.gymTonnage7d) == 0 && this.soccerMin7d == combinedLoadSnapshot.soccerMin7d && Intrinsics.areEqual(this.label, combinedLoadSnapshot.label) && Intrinsics.areEqual(this.detail, combinedLoadSnapshot.detail) && Float.compare(this.runShare, combinedLoadSnapshot.runShare) == 0 && Float.compare(this.rideShare, combinedLoadSnapshot.rideShare) == 0 && Float.compare(this.gymShare, combinedLoadSnapshot.gymShare) == 0 && Float.compare(this.soccerShare, combinedLoadSnapshot.soccerShare) == 0 && Float.compare(this.stepShare, combinedLoadSnapshot.stepShare) == 0 && this.steps7d == combinedLoadSnapshot.steps7d;
    }

    public int hashCode() {
        return (((((((((((((((((((((((Integer.hashCode(this.score) * 31) + Double.hashCode(this.runKm7d)) * 31) + Double.hashCode(this.rideKm7d)) * 31) + Double.hashCode(this.gymTonnage7d)) * 31) + Integer.hashCode(this.soccerMin7d)) * 31) + this.label.hashCode()) * 31) + this.detail.hashCode()) * 31) + Float.hashCode(this.runShare)) * 31) + Float.hashCode(this.rideShare)) * 31) + Float.hashCode(this.gymShare)) * 31) + Float.hashCode(this.soccerShare)) * 31) + Float.hashCode(this.stepShare)) * 31) + Long.hashCode(this.steps7d);
    }

    public String toString() {
        return "CombinedLoadSnapshot(score=" + this.score + ", runKm7d=" + this.runKm7d + ", rideKm7d=" + this.rideKm7d + ", gymTonnage7d=" + this.gymTonnage7d + ", soccerMin7d=" + this.soccerMin7d + ", label=" + this.label + ", detail=" + this.detail + ", runShare=" + this.runShare + ", rideShare=" + this.rideShare + ", gymShare=" + this.gymShare + ", soccerShare=" + this.soccerShare + ", stepShare=" + this.stepShare + ", steps7d=" + this.steps7d + ")";
    }

    public CombinedLoadSnapshot(int i, double d, double d2, double d3, int i2, String label, String detail, float f, float f2, float f3, float f4, float f5, long j) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.score = i;
        this.runKm7d = d;
        this.rideKm7d = d2;
        this.gymTonnage7d = d3;
        this.soccerMin7d = i2;
        this.label = label;
        this.detail = detail;
        this.runShare = f;
        this.rideShare = f2;
        this.gymShare = f3;
        this.soccerShare = f4;
        this.stepShare = f5;
        this.steps7d = j;
    }

    public /* synthetic */ CombinedLoadSnapshot(int i, double d, double d2, double d3, int i2, String str, String str2, float f, float f2, float f3, float f4, float f5, long j, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, d, (i3 & 4) != 0 ? 0.0d : d2, d3, i2, str, str2, (i3 & 128) != 0 ? 0.0f : f, (i3 & 256) != 0 ? 0.0f : f2, (i3 & 512) != 0 ? 0.0f : f3, (i3 & 1024) != 0 ? 0.0f : f4, (i3 & 2048) != 0 ? 0.0f : f5, (i3 & 4096) != 0 ? 0L : j);
    }

    public final int getScore() {
        return this.score;
    }

    public final double getRunKm7d() {
        return this.runKm7d;
    }

    public final double getRideKm7d() {
        return this.rideKm7d;
    }

    public final double getGymTonnage7d() {
        return this.gymTonnage7d;
    }

    public final int getSoccerMin7d() {
        return this.soccerMin7d;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getDetail() {
        return this.detail;
    }

    public final float getRunShare() {
        return this.runShare;
    }

    public final float getRideShare() {
        return this.rideShare;
    }

    public final float getGymShare() {
        return this.gymShare;
    }

    public final float getSoccerShare() {
        return this.soccerShare;
    }

    public final float getStepShare() {
        return this.stepShare;
    }

    public final long getSteps7d() {
        return this.steps7d;
    }
}
