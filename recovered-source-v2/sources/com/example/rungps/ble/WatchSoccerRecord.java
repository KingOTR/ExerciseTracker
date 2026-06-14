package com.example.rungps.ble;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: WatchSoccerRecord.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0001&B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0013JN\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0006HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0016\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0010¨\u0006'"}, d2 = {"Lcom/example/rungps/ble/WatchSoccerRecord;", "", "watchSessionId", "", "startTimeMs", "durationSec", "", "intensity", "hrAvgBpm", "hrMaxBpm", "<init>", "(JJIILjava/lang/Integer;Ljava/lang/Integer;)V", "getWatchSessionId", "()J", "getStartTimeMs", "getDurationSec", "()I", "getIntensity", "getHrAvgBpm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHrMaxBpm", "durationMin", "getDurationMin", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(JJIILjava/lang/Integer;Ljava/lang/Integer;)Lcom/example/rungps/ble/WatchSoccerRecord;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WatchSoccerRecord {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int durationSec;
    private final Integer hrAvgBpm;
    private final Integer hrMaxBpm;
    private final int intensity;
    private final long startTimeMs;
    private final long watchSessionId;

    /* renamed from: component1, reason: from getter */
    public final long getWatchSessionId() {
        return this.watchSessionId;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final int getDurationSec() {
        return this.durationSec;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIntensity() {
        return this.intensity;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getHrAvgBpm() {
        return this.hrAvgBpm;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getHrMaxBpm() {
        return this.hrMaxBpm;
    }

    public final WatchSoccerRecord copy(long watchSessionId, long startTimeMs, int durationSec, int intensity, Integer hrAvgBpm, Integer hrMaxBpm) {
        return new WatchSoccerRecord(watchSessionId, startTimeMs, durationSec, intensity, hrAvgBpm, hrMaxBpm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WatchSoccerRecord)) {
            return false;
        }
        WatchSoccerRecord watchSoccerRecord = (WatchSoccerRecord) other;
        return this.watchSessionId == watchSoccerRecord.watchSessionId && this.startTimeMs == watchSoccerRecord.startTimeMs && this.durationSec == watchSoccerRecord.durationSec && this.intensity == watchSoccerRecord.intensity && Intrinsics.areEqual(this.hrAvgBpm, watchSoccerRecord.hrAvgBpm) && Intrinsics.areEqual(this.hrMaxBpm, watchSoccerRecord.hrMaxBpm);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.watchSessionId) * 31) + Long.hashCode(this.startTimeMs)) * 31) + Integer.hashCode(this.durationSec)) * 31) + Integer.hashCode(this.intensity)) * 31;
        Integer num = this.hrAvgBpm;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hrMaxBpm;
        return hashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        return "WatchSoccerRecord(watchSessionId=" + this.watchSessionId + ", startTimeMs=" + this.startTimeMs + ", durationSec=" + this.durationSec + ", intensity=" + this.intensity + ", hrAvgBpm=" + this.hrAvgBpm + ", hrMaxBpm=" + this.hrMaxBpm + ")";
    }

    public WatchSoccerRecord(long j, long j2, int i, int i2, Integer num, Integer num2) {
        this.watchSessionId = j;
        this.startTimeMs = j2;
        this.durationSec = i;
        this.intensity = i2;
        this.hrAvgBpm = num;
        this.hrMaxBpm = num2;
    }

    public final long getWatchSessionId() {
        return this.watchSessionId;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final int getDurationSec() {
        return this.durationSec;
    }

    public final int getIntensity() {
        return this.intensity;
    }

    public final Integer getHrAvgBpm() {
        return this.hrAvgBpm;
    }

    public final Integer getHrMaxBpm() {
        return this.hrMaxBpm;
    }

    public final int getDurationMin() {
        return RangesKt.coerceAtLeast(this.durationSec / 60, 1);
    }

    /* compiled from: WatchSoccerRecord.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\f"}, d2 = {"Lcom/example/rungps/ble/WatchSoccerRecord$Companion;", "", "<init>", "()V", "parseAll", "", "Lcom/example/rungps/ble/WatchSoccerRecord;", "payload", "", "parseOne", "offset", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<WatchSoccerRecord> parseAll(byte[] payload) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.length == 0) {
                return CollectionsKt.emptyList();
            }
            int i = 0;
            int i2 = payload[0] & 255;
            if (i2 == 0) {
                return CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(i2);
            int i3 = 1;
            while (i < i2) {
                int i4 = i3 + 14;
                if (i4 > payload.length) {
                    return arrayList;
                }
                WatchSoccerRecord parseOne = WatchSoccerRecord.INSTANCE.parseOne(payload, i3);
                if (parseOne != null) {
                    arrayList.add(parseOne);
                }
                i++;
                i3 = i4;
            }
            return arrayList;
        }

        public final WatchSoccerRecord parseOne(byte[] payload, int offset) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (offset + 14 > payload.length) {
                return null;
            }
            ByteBuffer order = ByteBuffer.wrap(payload, offset, 14).order(ByteOrder.LITTLE_ENDIAN);
            long j = order.getInt() & 4294967295L;
            long j2 = order.getInt() & 4294967295L;
            int i = order.getShort() & UShort.MAX_VALUE;
            int i2 = order.get() & 255;
            int i3 = order.get() & 255;
            int i4 = order.get() & 255;
            order.get();
            if (j == 0 || i <= 0) {
                return null;
            }
            long j3 = j2 * 1000;
            Integer valueOf = Integer.valueOf(i3);
            int intValue = valueOf.intValue();
            Integer num = (40 > intValue || intValue >= 221) ? null : valueOf;
            Integer valueOf2 = Integer.valueOf(i4);
            int intValue2 = valueOf2.intValue();
            return new WatchSoccerRecord(j, j3, i, i2, num, (40 > intValue2 || intValue2 >= 221) ? null : valueOf2);
        }
    }
}
