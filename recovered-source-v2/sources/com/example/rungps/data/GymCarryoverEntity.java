package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003JO\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000e¨\u0006$"}, d2 = {"Lcom/example/rungps/data/GymCarryoverEntity;", "", "id", "", "splitId", "templateDayId", "exerciseName", "", "owedSetIndices", "fromSessionId", "createdAtMs", "<init>", "(JJJLjava/lang/String;Ljava/lang/String;JJ)V", "getId", "()J", "getSplitId", "getTemplateDayId", "getExerciseName", "()Ljava/lang/String;", "getOwedSetIndices", "getFromSessionId", "getCreatedAtMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymCarryoverEntity {
    private final long createdAtMs;
    private final String exerciseName;
    private final long fromSessionId;
    private final long id;
    private final String owedSetIndices;
    private final long splitId;
    private final long templateDayId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSplitId() {
        return this.splitId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTemplateDayId() {
        return this.templateDayId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* renamed from: component5, reason: from getter */
    public final String getOwedSetIndices() {
        return this.owedSetIndices;
    }

    /* renamed from: component6, reason: from getter */
    public final long getFromSessionId() {
        return this.fromSessionId;
    }

    /* renamed from: component7, reason: from getter */
    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    public final GymCarryoverEntity copy(long id, long splitId, long templateDayId, String exerciseName, String owedSetIndices, long fromSessionId, long createdAtMs) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(owedSetIndices, "owedSetIndices");
        return new GymCarryoverEntity(id, splitId, templateDayId, exerciseName, owedSetIndices, fromSessionId, createdAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymCarryoverEntity)) {
            return false;
        }
        GymCarryoverEntity gymCarryoverEntity = (GymCarryoverEntity) other;
        return this.id == gymCarryoverEntity.id && this.splitId == gymCarryoverEntity.splitId && this.templateDayId == gymCarryoverEntity.templateDayId && Intrinsics.areEqual(this.exerciseName, gymCarryoverEntity.exerciseName) && Intrinsics.areEqual(this.owedSetIndices, gymCarryoverEntity.owedSetIndices) && this.fromSessionId == gymCarryoverEntity.fromSessionId && this.createdAtMs == gymCarryoverEntity.createdAtMs;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.splitId)) * 31) + Long.hashCode(this.templateDayId)) * 31) + this.exerciseName.hashCode()) * 31) + this.owedSetIndices.hashCode()) * 31) + Long.hashCode(this.fromSessionId)) * 31) + Long.hashCode(this.createdAtMs);
    }

    public String toString() {
        return "GymCarryoverEntity(id=" + this.id + ", splitId=" + this.splitId + ", templateDayId=" + this.templateDayId + ", exerciseName=" + this.exerciseName + ", owedSetIndices=" + this.owedSetIndices + ", fromSessionId=" + this.fromSessionId + ", createdAtMs=" + this.createdAtMs + ")";
    }

    public GymCarryoverEntity(long j, long j2, long j3, String exerciseName, String owedSetIndices, long j4, long j5) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(owedSetIndices, "owedSetIndices");
        this.id = j;
        this.splitId = j2;
        this.templateDayId = j3;
        this.exerciseName = exerciseName;
        this.owedSetIndices = owedSetIndices;
        this.fromSessionId = j4;
        this.createdAtMs = j5;
    }

    public /* synthetic */ GymCarryoverEntity(long j, long j2, long j3, String str, String str2, long j4, long j5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, j3, str, str2, j4, j5);
    }

    public final long getId() {
        return this.id;
    }

    public final long getSplitId() {
        return this.splitId;
    }

    public final long getTemplateDayId() {
        return this.templateDayId;
    }

    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final String getOwedSetIndices() {
        return this.owedSetIndices;
    }

    public final long getFromSessionId() {
        return this.fromSessionId;
    }

    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }
}
