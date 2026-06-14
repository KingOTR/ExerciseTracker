package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J_\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012¨\u0006'"}, d2 = {"Lcom/example/rungps/data/ExerciseMuscleTagEntity;", "", "id", "", "exerciseNameLower", "", "displayName", "muscleGroup", "secondaryMuscleGroup", "tertiaryMuscleGroup", "isUnilateral", "", "setupNote", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "getId", "()J", "getExerciseNameLower", "()Ljava/lang/String;", "getDisplayName", "getMuscleGroup", "getSecondaryMuscleGroup", "getTertiaryMuscleGroup", "()Z", "getSetupNote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExerciseMuscleTagEntity {
    private final String displayName;
    private final String exerciseNameLower;
    private final long id;
    private final boolean isUnilateral;
    private final String muscleGroup;
    private final String secondaryMuscleGroup;
    private final String setupNote;
    private final String tertiaryMuscleGroup;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExerciseNameLower() {
        return this.exerciseNameLower;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getMuscleGroup() {
        return this.muscleGroup;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSecondaryMuscleGroup() {
        return this.secondaryMuscleGroup;
    }

    /* renamed from: component6, reason: from getter */
    public final String getTertiaryMuscleGroup() {
        return this.tertiaryMuscleGroup;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsUnilateral() {
        return this.isUnilateral;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSetupNote() {
        return this.setupNote;
    }

    public final ExerciseMuscleTagEntity copy(long id, String exerciseNameLower, String displayName, String muscleGroup, String secondaryMuscleGroup, String tertiaryMuscleGroup, boolean isUnilateral, String setupNote) {
        Intrinsics.checkNotNullParameter(exerciseNameLower, "exerciseNameLower");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(muscleGroup, "muscleGroup");
        return new ExerciseMuscleTagEntity(id, exerciseNameLower, displayName, muscleGroup, secondaryMuscleGroup, tertiaryMuscleGroup, isUnilateral, setupNote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseMuscleTagEntity)) {
            return false;
        }
        ExerciseMuscleTagEntity exerciseMuscleTagEntity = (ExerciseMuscleTagEntity) other;
        return this.id == exerciseMuscleTagEntity.id && Intrinsics.areEqual(this.exerciseNameLower, exerciseMuscleTagEntity.exerciseNameLower) && Intrinsics.areEqual(this.displayName, exerciseMuscleTagEntity.displayName) && Intrinsics.areEqual(this.muscleGroup, exerciseMuscleTagEntity.muscleGroup) && Intrinsics.areEqual(this.secondaryMuscleGroup, exerciseMuscleTagEntity.secondaryMuscleGroup) && Intrinsics.areEqual(this.tertiaryMuscleGroup, exerciseMuscleTagEntity.tertiaryMuscleGroup) && this.isUnilateral == exerciseMuscleTagEntity.isUnilateral && Intrinsics.areEqual(this.setupNote, exerciseMuscleTagEntity.setupNote);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + this.exerciseNameLower.hashCode()) * 31) + this.displayName.hashCode()) * 31) + this.muscleGroup.hashCode()) * 31;
        String str = this.secondaryMuscleGroup;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.tertiaryMuscleGroup;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Boolean.hashCode(this.isUnilateral)) * 31;
        String str3 = this.setupNote;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "ExerciseMuscleTagEntity(id=" + this.id + ", exerciseNameLower=" + this.exerciseNameLower + ", displayName=" + this.displayName + ", muscleGroup=" + this.muscleGroup + ", secondaryMuscleGroup=" + this.secondaryMuscleGroup + ", tertiaryMuscleGroup=" + this.tertiaryMuscleGroup + ", isUnilateral=" + this.isUnilateral + ", setupNote=" + this.setupNote + ")";
    }

    public ExerciseMuscleTagEntity(long j, String exerciseNameLower, String displayName, String muscleGroup, String str, String str2, boolean z, String str3) {
        Intrinsics.checkNotNullParameter(exerciseNameLower, "exerciseNameLower");
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(muscleGroup, "muscleGroup");
        this.id = j;
        this.exerciseNameLower = exerciseNameLower;
        this.displayName = displayName;
        this.muscleGroup = muscleGroup;
        this.secondaryMuscleGroup = str;
        this.tertiaryMuscleGroup = str2;
        this.isUnilateral = z;
        this.setupNote = str3;
    }

    public /* synthetic */ ExerciseMuscleTagEntity(long j, String str, String str2, String str3, String str4, String str5, boolean z, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, str2, str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : str6);
    }

    public final long getId() {
        return this.id;
    }

    public final String getExerciseNameLower() {
        return this.exerciseNameLower;
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getMuscleGroup() {
        return this.muscleGroup;
    }

    public final String getSecondaryMuscleGroup() {
        return this.secondaryMuscleGroup;
    }

    public final String getTertiaryMuscleGroup() {
        return this.tertiaryMuscleGroup;
    }

    public final boolean isUnilateral() {
        return this.isUnilateral;
    }

    public final String getSetupNote() {
        return this.setupNote;
    }
}
