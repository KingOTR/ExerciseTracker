package com.example.rungps.core.domain.analytics;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeAnalyticsPort.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/core/domain/analytics/DailyReadinessSnapshot;", "", "score", "", "headline", "", "detail", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getScore", "()I", "getHeadline", "()Ljava/lang/String;", "getDetail", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DailyReadinessSnapshot {
    private final String detail;
    private final String headline;
    private final int score;

    public static /* synthetic */ DailyReadinessSnapshot copy$default(DailyReadinessSnapshot dailyReadinessSnapshot, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = dailyReadinessSnapshot.score;
        }
        if ((i2 & 2) != 0) {
            str = dailyReadinessSnapshot.headline;
        }
        if ((i2 & 4) != 0) {
            str2 = dailyReadinessSnapshot.detail;
        }
        return dailyReadinessSnapshot.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getScore() {
        return this.score;
    }

    /* renamed from: component2, reason: from getter */
    public final String getHeadline() {
        return this.headline;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDetail() {
        return this.detail;
    }

    public final DailyReadinessSnapshot copy(int score, String headline, String detail) {
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detail, "detail");
        return new DailyReadinessSnapshot(score, headline, detail);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyReadinessSnapshot)) {
            return false;
        }
        DailyReadinessSnapshot dailyReadinessSnapshot = (DailyReadinessSnapshot) other;
        return this.score == dailyReadinessSnapshot.score && Intrinsics.areEqual(this.headline, dailyReadinessSnapshot.headline) && Intrinsics.areEqual(this.detail, dailyReadinessSnapshot.detail);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.score) * 31) + this.headline.hashCode()) * 31) + this.detail.hashCode();
    }

    public String toString() {
        return "DailyReadinessSnapshot(score=" + this.score + ", headline=" + this.headline + ", detail=" + this.detail + ")";
    }

    public DailyReadinessSnapshot(int i, String headline, String detail) {
        Intrinsics.checkNotNullParameter(headline, "headline");
        Intrinsics.checkNotNullParameter(detail, "detail");
        this.score = i;
        this.headline = headline;
        this.detail = detail;
    }

    public final int getScore() {
        return this.score;
    }

    public final String getHeadline() {
        return this.headline;
    }

    public final String getDetail() {
        return this.detail;
    }
}
