package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\t\u0010\"\u001a\u00020\u000bHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\rHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006*"}, d2 = {"Lcom/example/rungps/data/ArchivedTrainingWeekEntity;", "", "id", "", "weekStartEpochDay", "weekEndEpochDay", "archivedAtMs", "totalRunKm", "", "totalGymKg", "sleepNights", "", "snapshotJson", "", "<init>", "(JJJJDDILjava/lang/String;)V", "getId", "()J", "getWeekStartEpochDay", "getWeekEndEpochDay", "getArchivedAtMs", "getTotalRunKm", "()D", "getTotalGymKg", "getSleepNights", "()I", "getSnapshotJson", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ArchivedTrainingWeekEntity {
    private final long archivedAtMs;
    private final long id;
    private final int sleepNights;
    private final String snapshotJson;
    private final double totalGymKg;
    private final double totalRunKm;
    private final long weekEndEpochDay;
    private final long weekStartEpochDay;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getWeekStartEpochDay() {
        return this.weekStartEpochDay;
    }

    /* renamed from: component3, reason: from getter */
    public final long getWeekEndEpochDay() {
        return this.weekEndEpochDay;
    }

    /* renamed from: component4, reason: from getter */
    public final long getArchivedAtMs() {
        return this.archivedAtMs;
    }

    /* renamed from: component5, reason: from getter */
    public final double getTotalRunKm() {
        return this.totalRunKm;
    }

    /* renamed from: component6, reason: from getter */
    public final double getTotalGymKg() {
        return this.totalGymKg;
    }

    /* renamed from: component7, reason: from getter */
    public final int getSleepNights() {
        return this.sleepNights;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSnapshotJson() {
        return this.snapshotJson;
    }

    public final ArchivedTrainingWeekEntity copy(long id, long weekStartEpochDay, long weekEndEpochDay, long archivedAtMs, double totalRunKm, double totalGymKg, int sleepNights, String snapshotJson) {
        Intrinsics.checkNotNullParameter(snapshotJson, "snapshotJson");
        return new ArchivedTrainingWeekEntity(id, weekStartEpochDay, weekEndEpochDay, archivedAtMs, totalRunKm, totalGymKg, sleepNights, snapshotJson);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ArchivedTrainingWeekEntity)) {
            return false;
        }
        ArchivedTrainingWeekEntity archivedTrainingWeekEntity = (ArchivedTrainingWeekEntity) other;
        return this.id == archivedTrainingWeekEntity.id && this.weekStartEpochDay == archivedTrainingWeekEntity.weekStartEpochDay && this.weekEndEpochDay == archivedTrainingWeekEntity.weekEndEpochDay && this.archivedAtMs == archivedTrainingWeekEntity.archivedAtMs && Double.compare(this.totalRunKm, archivedTrainingWeekEntity.totalRunKm) == 0 && Double.compare(this.totalGymKg, archivedTrainingWeekEntity.totalGymKg) == 0 && this.sleepNights == archivedTrainingWeekEntity.sleepNights && Intrinsics.areEqual(this.snapshotJson, archivedTrainingWeekEntity.snapshotJson);
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.weekStartEpochDay)) * 31) + Long.hashCode(this.weekEndEpochDay)) * 31) + Long.hashCode(this.archivedAtMs)) * 31) + Double.hashCode(this.totalRunKm)) * 31) + Double.hashCode(this.totalGymKg)) * 31) + Integer.hashCode(this.sleepNights)) * 31) + this.snapshotJson.hashCode();
    }

    public String toString() {
        return "ArchivedTrainingWeekEntity(id=" + this.id + ", weekStartEpochDay=" + this.weekStartEpochDay + ", weekEndEpochDay=" + this.weekEndEpochDay + ", archivedAtMs=" + this.archivedAtMs + ", totalRunKm=" + this.totalRunKm + ", totalGymKg=" + this.totalGymKg + ", sleepNights=" + this.sleepNights + ", snapshotJson=" + this.snapshotJson + ")";
    }

    public ArchivedTrainingWeekEntity(long j, long j2, long j3, long j4, double d, double d2, int i, String snapshotJson) {
        Intrinsics.checkNotNullParameter(snapshotJson, "snapshotJson");
        this.id = j;
        this.weekStartEpochDay = j2;
        this.weekEndEpochDay = j3;
        this.archivedAtMs = j4;
        this.totalRunKm = d;
        this.totalGymKg = d2;
        this.sleepNights = i;
        this.snapshotJson = snapshotJson;
    }

    public /* synthetic */ ArchivedTrainingWeekEntity(long j, long j2, long j3, long j4, double d, double d2, int i, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, j3, j4, d, d2, i, str);
    }

    public final long getId() {
        return this.id;
    }

    public final long getWeekStartEpochDay() {
        return this.weekStartEpochDay;
    }

    public final long getWeekEndEpochDay() {
        return this.weekEndEpochDay;
    }

    public final long getArchivedAtMs() {
        return this.archivedAtMs;
    }

    public final double getTotalRunKm() {
        return this.totalRunKm;
    }

    public final double getTotalGymKg() {
        return this.totalGymKg;
    }

    public final int getSleepNights() {
        return this.sleepNights;
    }

    public final String getSnapshotJson() {
        return this.snapshotJson;
    }
}
