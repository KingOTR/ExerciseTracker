package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymDao.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\fJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000fJJ\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u000fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000f¨\u0006\""}, d2 = {"Lcom/example/rungps/data/GymLoadStats;", "", "lastSessionAtMs", "", "lastTonnage", "", "lastMaxWeight", "avgTonnage10", "avgMaxWeight10", "<init>", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "getLastSessionAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastTonnage", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastMaxWeight", "getAvgTonnage10", "getAvgMaxWeight10", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Long;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)Lcom/example/rungps/data/GymLoadStats;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymLoadStats {
    public static final int $stable = 0;
    private final Double avgMaxWeight10;
    private final Double avgTonnage10;
    private final Double lastMaxWeight;
    private final Long lastSessionAtMs;
    private final Double lastTonnage;

    public static /* synthetic */ GymLoadStats copy$default(GymLoadStats gymLoadStats, Long l, Double d, Double d2, Double d3, Double d4, int i, Object obj) {
        if ((i & 1) != 0) {
            l = gymLoadStats.lastSessionAtMs;
        }
        if ((i & 2) != 0) {
            d = gymLoadStats.lastTonnage;
        }
        Double d5 = d;
        if ((i & 4) != 0) {
            d2 = gymLoadStats.lastMaxWeight;
        }
        Double d6 = d2;
        if ((i & 8) != 0) {
            d3 = gymLoadStats.avgTonnage10;
        }
        Double d7 = d3;
        if ((i & 16) != 0) {
            d4 = gymLoadStats.avgMaxWeight10;
        }
        return gymLoadStats.copy(l, d5, d6, d7, d4);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getLastSessionAtMs() {
        return this.lastSessionAtMs;
    }

    /* renamed from: component2, reason: from getter */
    public final Double getLastTonnage() {
        return this.lastTonnage;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getLastMaxWeight() {
        return this.lastMaxWeight;
    }

    /* renamed from: component4, reason: from getter */
    public final Double getAvgTonnage10() {
        return this.avgTonnage10;
    }

    /* renamed from: component5, reason: from getter */
    public final Double getAvgMaxWeight10() {
        return this.avgMaxWeight10;
    }

    public final GymLoadStats copy(Long lastSessionAtMs, Double lastTonnage, Double lastMaxWeight, Double avgTonnage10, Double avgMaxWeight10) {
        return new GymLoadStats(lastSessionAtMs, lastTonnage, lastMaxWeight, avgTonnage10, avgMaxWeight10);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymLoadStats)) {
            return false;
        }
        GymLoadStats gymLoadStats = (GymLoadStats) other;
        return Intrinsics.areEqual(this.lastSessionAtMs, gymLoadStats.lastSessionAtMs) && Intrinsics.areEqual((Object) this.lastTonnage, (Object) gymLoadStats.lastTonnage) && Intrinsics.areEqual((Object) this.lastMaxWeight, (Object) gymLoadStats.lastMaxWeight) && Intrinsics.areEqual((Object) this.avgTonnage10, (Object) gymLoadStats.avgTonnage10) && Intrinsics.areEqual((Object) this.avgMaxWeight10, (Object) gymLoadStats.avgMaxWeight10);
    }

    public int hashCode() {
        Long l = this.lastSessionAtMs;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Double d = this.lastTonnage;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.lastMaxWeight;
        int hashCode3 = (hashCode2 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.avgTonnage10;
        int hashCode4 = (hashCode3 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.avgMaxWeight10;
        return hashCode4 + (d4 != null ? d4.hashCode() : 0);
    }

    public String toString() {
        return "GymLoadStats(lastSessionAtMs=" + this.lastSessionAtMs + ", lastTonnage=" + this.lastTonnage + ", lastMaxWeight=" + this.lastMaxWeight + ", avgTonnage10=" + this.avgTonnage10 + ", avgMaxWeight10=" + this.avgMaxWeight10 + ")";
    }

    public GymLoadStats(Long l, Double d, Double d2, Double d3, Double d4) {
        this.lastSessionAtMs = l;
        this.lastTonnage = d;
        this.lastMaxWeight = d2;
        this.avgTonnage10 = d3;
        this.avgMaxWeight10 = d4;
    }

    public final Long getLastSessionAtMs() {
        return this.lastSessionAtMs;
    }

    public final Double getLastTonnage() {
        return this.lastTonnage;
    }

    public final Double getLastMaxWeight() {
        return this.lastMaxWeight;
    }

    public final Double getAvgTonnage10() {
        return this.avgTonnage10;
    }

    public final Double getAvgMaxWeight10() {
        return this.avgMaxWeight10;
    }
}
