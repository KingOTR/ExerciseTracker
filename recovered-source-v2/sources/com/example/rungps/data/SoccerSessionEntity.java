package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0005HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\bHÆ\u0003J\t\u0010.\u001a\u00020\bHÆ\u0003J\t\u0010/\u001a\u00020\bHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010 J\u0010\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00103\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00104\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00105\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u0010\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010#J\u000b\u00107\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jª\u0001\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u00109J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010=\u001a\u00020\bHÖ\u0001J\t\u0010>\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b%\u0010#R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b&\u0010#R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b'\u0010#R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010$\u001a\u0004\b(\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u0018¨\u0006?"}, d2 = {"Lcom/example/rungps/data/SoccerSessionEntity;", "", "id", "", "kind", "", "startTimeMs", "warmupMin", "", "playMin", "intensity", "notes", "watchSessionId", "hrAvgBpm", "hrMaxBpm", "steps", "distanceM", "calories", "hrZonesJson", "<init>", "(JLjava/lang/String;JIIILjava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()J", "getKind", "()Ljava/lang/String;", "getStartTimeMs", "getWarmupMin", "()I", "getPlayMin", "getIntensity", "getNotes", "getWatchSessionId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getHrAvgBpm", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHrMaxBpm", "getSteps", "getDistanceM", "getCalories", "getHrZonesJson", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "(JLjava/lang/String;JIIILjava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/rungps/data/SoccerSessionEntity;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SoccerSessionEntity {
    private final Integer calories;
    private final Integer distanceM;
    private final Integer hrAvgBpm;
    private final Integer hrMaxBpm;
    private final String hrZonesJson;
    private final long id;
    private final int intensity;
    private final String kind;
    private final String notes;
    private final int playMin;
    private final long startTimeMs;
    private final Integer steps;
    private final int warmupMin;
    private final Long watchSessionId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Integer getHrMaxBpm() {
        return this.hrMaxBpm;
    }

    /* renamed from: component11, reason: from getter */
    public final Integer getSteps() {
        return this.steps;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getDistanceM() {
        return this.distanceM;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getCalories() {
        return this.calories;
    }

    /* renamed from: component14, reason: from getter */
    public final String getHrZonesJson() {
        return this.hrZonesJson;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    /* renamed from: component4, reason: from getter */
    public final int getWarmupMin() {
        return this.warmupMin;
    }

    /* renamed from: component5, reason: from getter */
    public final int getPlayMin() {
        return this.playMin;
    }

    /* renamed from: component6, reason: from getter */
    public final int getIntensity() {
        return this.intensity;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component8, reason: from getter */
    public final Long getWatchSessionId() {
        return this.watchSessionId;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getHrAvgBpm() {
        return this.hrAvgBpm;
    }

    public final SoccerSessionEntity copy(long id, String kind, long startTimeMs, int warmupMin, int playMin, int intensity, String notes, Long watchSessionId, Integer hrAvgBpm, Integer hrMaxBpm, Integer steps, Integer distanceM, Integer calories, String hrZonesJson) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new SoccerSessionEntity(id, kind, startTimeMs, warmupMin, playMin, intensity, notes, watchSessionId, hrAvgBpm, hrMaxBpm, steps, distanceM, calories, hrZonesJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SoccerSessionEntity)) {
            return false;
        }
        SoccerSessionEntity soccerSessionEntity = (SoccerSessionEntity) other;
        return this.id == soccerSessionEntity.id && Intrinsics.areEqual(this.kind, soccerSessionEntity.kind) && this.startTimeMs == soccerSessionEntity.startTimeMs && this.warmupMin == soccerSessionEntity.warmupMin && this.playMin == soccerSessionEntity.playMin && this.intensity == soccerSessionEntity.intensity && Intrinsics.areEqual(this.notes, soccerSessionEntity.notes) && Intrinsics.areEqual(this.watchSessionId, soccerSessionEntity.watchSessionId) && Intrinsics.areEqual(this.hrAvgBpm, soccerSessionEntity.hrAvgBpm) && Intrinsics.areEqual(this.hrMaxBpm, soccerSessionEntity.hrMaxBpm) && Intrinsics.areEqual(this.steps, soccerSessionEntity.steps) && Intrinsics.areEqual(this.distanceM, soccerSessionEntity.distanceM) && Intrinsics.areEqual(this.calories, soccerSessionEntity.calories) && Intrinsics.areEqual(this.hrZonesJson, soccerSessionEntity.hrZonesJson);
    }

    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.id) * 31) + this.kind.hashCode()) * 31) + Long.hashCode(this.startTimeMs)) * 31) + Integer.hashCode(this.warmupMin)) * 31) + Integer.hashCode(this.playMin)) * 31) + Integer.hashCode(this.intensity)) * 31;
        String str = this.notes;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.watchSessionId;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num = this.hrAvgBpm;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.hrMaxBpm;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.steps;
        int hashCode6 = (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.distanceM;
        int hashCode7 = (hashCode6 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.calories;
        int hashCode8 = (hashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str2 = this.hrZonesJson;
        return hashCode8 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "SoccerSessionEntity(id=" + this.id + ", kind=" + this.kind + ", startTimeMs=" + this.startTimeMs + ", warmupMin=" + this.warmupMin + ", playMin=" + this.playMin + ", intensity=" + this.intensity + ", notes=" + this.notes + ", watchSessionId=" + this.watchSessionId + ", hrAvgBpm=" + this.hrAvgBpm + ", hrMaxBpm=" + this.hrMaxBpm + ", steps=" + this.steps + ", distanceM=" + this.distanceM + ", calories=" + this.calories + ", hrZonesJson=" + this.hrZonesJson + ")";
    }

    public SoccerSessionEntity(long j, String kind, long j2, int i, int i2, int i3, String str, Long l, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str2) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.id = j;
        this.kind = kind;
        this.startTimeMs = j2;
        this.warmupMin = i;
        this.playMin = i2;
        this.intensity = i3;
        this.notes = str;
        this.watchSessionId = l;
        this.hrAvgBpm = num;
        this.hrMaxBpm = num2;
        this.steps = num3;
        this.distanceM = num4;
        this.calories = num5;
        this.hrZonesJson = str2;
    }

    public /* synthetic */ SoccerSessionEntity(long j, String str, long j2, int i, int i2, int i3, String str2, Long l, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, String str3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j, str, j2, i, i2, i3, (i4 & 64) != 0 ? null : str2, (i4 & 128) != 0 ? null : l, (i4 & 256) != 0 ? null : num, (i4 & 512) != 0 ? null : num2, (i4 & 1024) != 0 ? null : num3, (i4 & 2048) != 0 ? null : num4, (i4 & 4096) != 0 ? null : num5, (i4 & 8192) != 0 ? null : str3);
    }

    public final long getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final long getStartTimeMs() {
        return this.startTimeMs;
    }

    public final int getWarmupMin() {
        return this.warmupMin;
    }

    public final int getPlayMin() {
        return this.playMin;
    }

    public final int getIntensity() {
        return this.intensity;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final Long getWatchSessionId() {
        return this.watchSessionId;
    }

    public final Integer getHrAvgBpm() {
        return this.hrAvgBpm;
    }

    public final Integer getHrMaxBpm() {
        return this.hrMaxBpm;
    }

    public final Integer getSteps() {
        return this.steps;
    }

    public final Integer getDistanceM() {
        return this.distanceM;
    }

    public final Integer getCalories() {
        return this.calories;
    }

    public final String getHrZonesJson() {
        return this.hrZonesJson;
    }
}
