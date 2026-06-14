package com.example.rungps.recovery;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ReadyToTrain.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/recovery/ReadyToTrainAssessment;", "", "readiness", "Lcom/example/rungps/recovery/TrainReadiness;", "headline", "", "detail", "<init>", "(Lcom/example/rungps/recovery/TrainReadiness;Ljava/lang/String;Ljava/lang/String;)V", "getReadiness", "()Lcom/example/rungps/recovery/TrainReadiness;", "getHeadline", "()Ljava/lang/String;", "getDetail", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReadyToTrainAssessment {
    public static final int $stable = 0;
    private final String detail;
    private final String headline;
    private final TrainReadiness readiness;

    public static /* synthetic */ ReadyToTrainAssessment copy$default(ReadyToTrainAssessment readyToTrainAssessment, TrainReadiness trainReadiness, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            trainReadiness = readyToTrainAssessment.readiness;
        }
        if ((i & 2) != 0) {
            str = readyToTrainAssessment.headline;
        }
        if ((i & 4) != 0) {
            str2 = readyToTrainAssessment.detail;
        }
        return readyToTrainAssessment.copy(trainReadiness, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final TrainReadiness getReadiness() {
        return this.readiness;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    public final ReadyToTrainAssessment copy(TrainReadiness readiness, String headline, String detail) {
        Intrinsics.checkNotNullParameter(readiness, "readiness");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new ReadyToTrainAssessment(readiness, headline, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReadyToTrainAssessment)) {
            return false;
        }
        ReadyToTrainAssessment readyToTrainAssessment = (ReadyToTrainAssessment) other;
        return this.readiness == readyToTrainAssessment.readiness && Intrinsics.areEqual(this.headline, readyToTrainAssessment.headline) && Intrinsics.areEqual(this.detail, readyToTrainAssessment.detail);
    }

    public int hashCode() {
        return (((this.readiness.hashCode() * 31) + this.headline.hashCode()) * 31) + this.detail.hashCode();
    }

    public String toString() {
        return "ReadyToTrainAssessment(readiness=" + this.readiness + ", headline=" + this.headline + ", detail=" + this.detail + ")";
    }

    public ReadyToTrainAssessment(TrainReadiness readiness, String headline, String detail) {
        Intrinsics.checkNotNullParameter(readiness, "readiness");
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.readiness = readiness;
        this.headline = headline;
        this.detail = detail;
    }

    public final TrainReadiness getReadiness() {
        return this.readiness;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final String getDetail() {
        return this.detail;
    }
}
