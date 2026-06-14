package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\"\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010*\u001a\u0004\u0018\u00010\u0006HÆ\u0003Jp\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0015\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u001f\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015¨\u00062"}, d2 = {"Lcom/example/rungps/data/GymSetEntity;", "", "id", "", "sessionId", "exerciseName", "", "setIndex", "", "reps", "weightKg", "", "loggedAtMs", "rpeBorg", "romNote", "<init>", "(JJLjava/lang/String;ILjava/lang/Integer;DLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)V", "getId", "()J", "getSessionId", "getExerciseName", "()Ljava/lang/String;", "getSetIndex", "()I", "getReps", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getWeightKg", "()D", "getLoggedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getRpeBorg", "getRomNote", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/String;ILjava/lang/Integer;DLjava/lang/Long;Ljava/lang/Integer;Ljava/lang/String;)Lcom/example/rungps/data/GymSetEntity;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymSetEntity {
    private final String exerciseName;
    private final long id;
    private final Long loggedAtMs;
    private final Integer reps;
    private final String romNote;
    private final Integer rpeBorg;
    private final long sessionId;
    private final int setIndex;
    private final double weightKg;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSessionId() {
        return this.sessionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSetIndex() {
        return this.setIndex;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getReps() {
        return this.reps;
    }

    /* renamed from: component6, reason: from getter */
    public final double getWeightKg() {
        return this.weightKg;
    }

    /* renamed from: component7, reason: from getter */
    public final Long getLoggedAtMs() {
        return this.loggedAtMs;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getRpeBorg() {
        return this.rpeBorg;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRomNote() {
        return this.romNote;
    }

    public final GymSetEntity copy(long id, long sessionId, String exerciseName, int setIndex, Integer reps, double weightKg, Long loggedAtMs, Integer rpeBorg, String romNote) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        return new GymSetEntity(id, sessionId, exerciseName, setIndex, reps, weightKg, loggedAtMs, rpeBorg, romNote);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymSetEntity)) {
            return false;
        }
        GymSetEntity gymSetEntity = (GymSetEntity) other;
        return this.id == gymSetEntity.id && this.sessionId == gymSetEntity.sessionId && Intrinsics.areEqual(this.exerciseName, gymSetEntity.exerciseName) && this.setIndex == gymSetEntity.setIndex && Intrinsics.areEqual(this.reps, gymSetEntity.reps) && Double.compare(this.weightKg, gymSetEntity.weightKg) == 0 && Intrinsics.areEqual(this.loggedAtMs, gymSetEntity.loggedAtMs) && Intrinsics.areEqual(this.rpeBorg, gymSetEntity.rpeBorg) && Intrinsics.areEqual(this.romNote, gymSetEntity.romNote);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.sessionId)) * 31) + this.exerciseName.hashCode()) * 31) + Integer.hashCode(this.setIndex)) * 31;
        Integer num = this.reps;
        int hashCode2 = (((hashCode + (num == null ? 0 : num.hashCode())) * 31) + Double.hashCode(this.weightKg)) * 31;
        Long l = this.loggedAtMs;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num2 = this.rpeBorg;
        int hashCode4 = (hashCode3 + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.romNote;
        return hashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "GymSetEntity(id=" + this.id + ", sessionId=" + this.sessionId + ", exerciseName=" + this.exerciseName + ", setIndex=" + this.setIndex + ", reps=" + this.reps + ", weightKg=" + this.weightKg + ", loggedAtMs=" + this.loggedAtMs + ", rpeBorg=" + this.rpeBorg + ", romNote=" + this.romNote + ")";
    }

    public GymSetEntity(long j, long j2, String exerciseName, int i, Integer num, double d, Long l, Integer num2, String str) {
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        this.id = j;
        this.sessionId = j2;
        this.exerciseName = exerciseName;
        this.setIndex = i;
        this.reps = num;
        this.weightKg = d;
        this.loggedAtMs = l;
        this.rpeBorg = num2;
        this.romNote = str;
    }

    public /* synthetic */ GymSetEntity(long j, long j2, String str, int i, Integer num, double d, Long l, Integer num2, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, str, i, (i2 & 16) != 0 ? null : num, d, (i2 & 64) != 0 ? null : l, (i2 & 128) != 0 ? null : num2, (i2 & 256) != 0 ? null : str2);
    }

    public final long getId() {
        return this.id;
    }

    public final long getSessionId() {
        return this.sessionId;
    }

    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final int getSetIndex() {
        return this.setIndex;
    }

    public final Integer getReps() {
        return this.reps;
    }

    public final double getWeightKg() {
        return this.weightKg;
    }

    public final Long getLoggedAtMs() {
        return this.loggedAtMs;
    }

    public final Integer getRpeBorg() {
        return this.rpeBorg;
    }

    public final String getRomNote() {
        return this.romNote;
    }
}
