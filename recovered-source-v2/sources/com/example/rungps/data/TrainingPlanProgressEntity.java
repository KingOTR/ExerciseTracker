package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\t\u0010!\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013¨\u0006\""}, d2 = {"Lcom/example/rungps/data/TrainingPlanProgressEntity;", "", "id", "", "planSlug", "", "title", "startEpochDay", "", "nextWorkoutIndex", "updatedAtMs", "<init>", "(ILjava/lang/String;Ljava/lang/String;JIJ)V", "getId", "()I", "getPlanSlug", "()Ljava/lang/String;", "getTitle", "getStartEpochDay", "()J", "getNextWorkoutIndex", "getUpdatedAtMs", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TrainingPlanProgressEntity {
    private final int id;
    private final int nextWorkoutIndex;
    private final String planSlug;
    private final long startEpochDay;
    private final String title;
    private final long updatedAtMs;

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPlanSlug() {
        return this.planSlug;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartEpochDay() {
        return this.startEpochDay;
    }

    /* renamed from: component5, reason: from getter */
    public final int getNextWorkoutIndex() {
        return this.nextWorkoutIndex;
    }

    /* renamed from: component6, reason: from getter */
    public final long getUpdatedAtMs() {
        return this.updatedAtMs;
    }

    public final TrainingPlanProgressEntity copy(int id, String planSlug, String title, long startEpochDay, int nextWorkoutIndex, long updatedAtMs) {
        Intrinsics.checkNotNullParameter(planSlug, "planSlug");
        Intrinsics.checkNotNullParameter(title, "title");
        return new TrainingPlanProgressEntity(id, planSlug, title, startEpochDay, nextWorkoutIndex, updatedAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingPlanProgressEntity)) {
            return false;
        }
        TrainingPlanProgressEntity trainingPlanProgressEntity = (TrainingPlanProgressEntity) other;
        return this.id == trainingPlanProgressEntity.id && Intrinsics.areEqual(this.planSlug, trainingPlanProgressEntity.planSlug) && Intrinsics.areEqual(this.title, trainingPlanProgressEntity.title) && this.startEpochDay == trainingPlanProgressEntity.startEpochDay && this.nextWorkoutIndex == trainingPlanProgressEntity.nextWorkoutIndex && this.updatedAtMs == trainingPlanProgressEntity.updatedAtMs;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.id) * 31) + this.planSlug.hashCode()) * 31) + this.title.hashCode()) * 31) + Long.hashCode(this.startEpochDay)) * 31) + Integer.hashCode(this.nextWorkoutIndex)) * 31) + Long.hashCode(this.updatedAtMs);
    }

    public String toString() {
        return "TrainingPlanProgressEntity(id=" + this.id + ", planSlug=" + this.planSlug + ", title=" + this.title + ", startEpochDay=" + this.startEpochDay + ", nextWorkoutIndex=" + this.nextWorkoutIndex + ", updatedAtMs=" + this.updatedAtMs + ")";
    }

    public TrainingPlanProgressEntity(int i, String planSlug, String title, long j, int i2, long j2) {
        Intrinsics.checkNotNullParameter(planSlug, "planSlug");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = i;
        this.planSlug = planSlug;
        this.title = title;
        this.startEpochDay = j;
        this.nextWorkoutIndex = i2;
        this.updatedAtMs = j2;
    }

    public final int getId() {
        return this.id;
    }

    public final String getPlanSlug() {
        return this.planSlug;
    }

    public final String getTitle() {
        return this.title;
    }

    public final long getStartEpochDay() {
        return this.startEpochDay;
    }

    public final int getNextWorkoutIndex() {
        return this.nextWorkoutIndex;
    }

    public /* synthetic */ TrainingPlanProgressEntity(int i, String str, String str2, long j, int i2, long j2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 1 : i, str, str2, j, (i3 & 16) != 0 ? 0 : i2, (i3 & 32) != 0 ? System.currentTimeMillis() : j2);
    }

    public final long getUpdatedAtMs() {
        return this.updatedAtMs;
    }
}
