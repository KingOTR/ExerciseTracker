package com.example.rungps.health;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HealthReadinessSignals.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b \b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u0010\u0010#\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0015J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010&\u001a\u00020\fHÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\n0\u000eHÆ\u0003Jd\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000eHÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u0005HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u001a\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006."}, d2 = {"Lcom/example/rungps/health/HealthReadinessSignals;", "", "stepsToday", "", "restingHeartRateBpm", "", "lastNightSleepHours", "", "lastNightSleepQuality", "sleepSource", "", "hcConnected", "", "detailLines", "", "<init>", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;)V", "getStepsToday", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRestingHeartRateBpm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLastNightSleepHours", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getLastNightSleepQuality", "getSleepSource", "()Ljava/lang/String;", "getHcConnected", "()Z", "getDetailLines", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;Ljava/lang/String;ZLjava/util/List;)Lcom/example/rungps/health/HealthReadinessSignals;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HealthReadinessSignals {
    public static final int $stable = 8;
    private final List<String> detailLines;
    private final boolean hcConnected;
    private final Double lastNightSleepHours;
    private final Integer lastNightSleepQuality;
    private final Integer restingHeartRateBpm;
    private final String sleepSource;
    private final Long stepsToday;

    public static /* synthetic */ HealthReadinessSignals copy$default(HealthReadinessSignals healthReadinessSignals, Long l, Integer num, Double d, Integer num2, String str, boolean z, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            l = healthReadinessSignals.stepsToday;
        }
        if ((i & 2) != 0) {
            num = healthReadinessSignals.restingHeartRateBpm;
        }
        Integer num3 = num;
        if ((i & 4) != 0) {
            d = healthReadinessSignals.lastNightSleepHours;
        }
        Double d2 = d;
        if ((i & 8) != 0) {
            num2 = healthReadinessSignals.lastNightSleepQuality;
        }
        Integer num4 = num2;
        if ((i & 16) != 0) {
            str = healthReadinessSignals.sleepSource;
        }
        String str2 = str;
        if ((i & 32) != 0) {
            z = healthReadinessSignals.hcConnected;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            list = healthReadinessSignals.detailLines;
        }
        return healthReadinessSignals.copy(l, num3, d2, num4, str2, z2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getStepsToday() {
        return this.stepsToday;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getRestingHeartRateBpm() {
        return this.restingHeartRateBpm;
    }

    /* renamed from: component3, reason: from getter */
    public final Double getLastNightSleepHours() {
        return this.lastNightSleepHours;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLastNightSleepQuality() {
        return this.lastNightSleepQuality;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSleepSource() {
        return this.sleepSource;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHcConnected() {
        return this.hcConnected;
    }

    public final List<String> component7() {
        return this.detailLines;
    }

    public final HealthReadinessSignals copy(Long stepsToday, Integer restingHeartRateBpm, Double lastNightSleepHours, Integer lastNightSleepQuality, String sleepSource, boolean hcConnected, List<String> detailLines) {
        Intrinsics.checkNotNullParameter(detailLines, "detailLines");
        return new HealthReadinessSignals(stepsToday, restingHeartRateBpm, lastNightSleepHours, lastNightSleepQuality, sleepSource, hcConnected, detailLines);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HealthReadinessSignals)) {
            return false;
        }
        HealthReadinessSignals healthReadinessSignals = (HealthReadinessSignals) other;
        return Intrinsics.areEqual(this.stepsToday, healthReadinessSignals.stepsToday) && Intrinsics.areEqual(this.restingHeartRateBpm, healthReadinessSignals.restingHeartRateBpm) && Intrinsics.areEqual((Object) this.lastNightSleepHours, (Object) healthReadinessSignals.lastNightSleepHours) && Intrinsics.areEqual(this.lastNightSleepQuality, healthReadinessSignals.lastNightSleepQuality) && Intrinsics.areEqual(this.sleepSource, healthReadinessSignals.sleepSource) && this.hcConnected == healthReadinessSignals.hcConnected && Intrinsics.areEqual(this.detailLines, healthReadinessSignals.detailLines);
    }

    public int hashCode() {
        Long l = this.stepsToday;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.restingHeartRateBpm;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Double d = this.lastNightSleepHours;
        int hashCode3 = (hashCode2 + (d == null ? 0 : d.hashCode())) * 31;
        Integer num2 = this.lastNightSleepQuality;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.sleepSource;
        return ((((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.hcConnected)) * 31) + this.detailLines.hashCode();
    }

    public String toString() {
        return "HealthReadinessSignals(stepsToday=" + this.stepsToday + ", restingHeartRateBpm=" + this.restingHeartRateBpm + ", lastNightSleepHours=" + this.lastNightSleepHours + ", lastNightSleepQuality=" + this.lastNightSleepQuality + ", sleepSource=" + this.sleepSource + ", hcConnected=" + this.hcConnected + ", detailLines=" + this.detailLines + ")";
    }

    public HealthReadinessSignals(Long l, Integer num, Double d, Integer num2, String str, boolean z, List<String> detailLines) {
        Intrinsics.checkNotNullParameter(detailLines, "detailLines");
        this.stepsToday = l;
        this.restingHeartRateBpm = num;
        this.lastNightSleepHours = d;
        this.lastNightSleepQuality = num2;
        this.sleepSource = str;
        this.hcConnected = z;
        this.detailLines = detailLines;
    }

    public final Long getStepsToday() {
        return this.stepsToday;
    }

    public final Integer getRestingHeartRateBpm() {
        return this.restingHeartRateBpm;
    }

    public final Double getLastNightSleepHours() {
        return this.lastNightSleepHours;
    }

    public final Integer getLastNightSleepQuality() {
        return this.lastNightSleepQuality;
    }

    public final String getSleepSource() {
        return this.sleepSource;
    }

    public final boolean getHcConnected() {
        return this.hcConnected;
    }

    public final List<String> getDetailLines() {
        return this.detailLines;
    }
}
