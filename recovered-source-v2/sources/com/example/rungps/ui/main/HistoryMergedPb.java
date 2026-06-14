package com.example.rungps.ui.main;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryTabContent.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000eJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J8\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, d2 = {"Lcom/example/rungps/ui/main/HistoryMergedPb;", "", "distance", "", "timeStr", "sourceRunId", "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getDistance", "()Ljava/lang/String;", "getTimeStr", "getSourceRunId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getSubtitle", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/example/rungps/ui/main/HistoryMergedPb;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* data */ class HistoryMergedPb {
    private final String distance;
    private final Long sourceRunId;
    private final String subtitle;
    private final String timeStr;

    public static /* synthetic */ HistoryMergedPb copy$default(HistoryMergedPb historyMergedPb, String str, String str2, Long l, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = historyMergedPb.distance;
        }
        if ((i & 2) != 0) {
            str2 = historyMergedPb.timeStr;
        }
        if ((i & 4) != 0) {
            l = historyMergedPb.sourceRunId;
        }
        if ((i & 8) != 0) {
            str3 = historyMergedPb.subtitle;
        }
        return historyMergedPb.copy(str, str2, l, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTimeStr() {
        return this.timeStr;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getSourceRunId() {
        return this.sourceRunId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final HistoryMergedPb copy(String distance, String timeStr, Long sourceRunId, String subtitle) {
        Intrinsics.checkNotNullParameter(distance, "distance");
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        return new HistoryMergedPb(distance, timeStr, sourceRunId, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HistoryMergedPb)) {
            return false;
        }
        HistoryMergedPb historyMergedPb = (HistoryMergedPb) other;
        return Intrinsics.areEqual(this.distance, historyMergedPb.distance) && Intrinsics.areEqual(this.timeStr, historyMergedPb.timeStr) && Intrinsics.areEqual(this.sourceRunId, historyMergedPb.sourceRunId) && Intrinsics.areEqual(this.subtitle, historyMergedPb.subtitle);
    }

    public int hashCode() {
        int hashCode = ((this.distance.hashCode() * 31) + this.timeStr.hashCode()) * 31;
        Long l = this.sourceRunId;
        return ((hashCode + (l == null ? 0 : l.hashCode())) * 31) + this.subtitle.hashCode();
    }

    public String toString() {
        return "HistoryMergedPb(distance=" + this.distance + ", timeStr=" + this.timeStr + ", sourceRunId=" + this.sourceRunId + ", subtitle=" + this.subtitle + ")";
    }

    public HistoryMergedPb(String distance, String timeStr, Long l, String subtitle) {
        Intrinsics.checkNotNullParameter(distance, "distance");
        Intrinsics.checkNotNullParameter(timeStr, "timeStr");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.distance = distance;
        this.timeStr = timeStr;
        this.sourceRunId = l;
        this.subtitle = subtitle;
    }

    public final String getDistance() {
        return this.distance;
    }

    public final String getTimeStr() {
        return this.timeStr;
    }

    public final Long getSourceRunId() {
        return this.sourceRunId;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }
}
