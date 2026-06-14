package com.example.rungps.widget;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymWidgetSessionSnapshot.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/widget/GymWidgetSessionSnapshot;", "", "sessionName", "", "exerciseName", "setsLeft", "", "suggestionLine", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getSessionName", "()Ljava/lang/String;", "getExerciseName", "getSetsLeft", "()I", "getSuggestionLine", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymWidgetSessionSnapshot {
    public static final int $stable = 0;
    private final String exerciseName;
    private final String sessionName;
    private final int setsLeft;
    private final String suggestionLine;

    public static /* synthetic */ GymWidgetSessionSnapshot copy$default(GymWidgetSessionSnapshot gymWidgetSessionSnapshot, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gymWidgetSessionSnapshot.sessionName;
        }
        if ((i2 & 2) != 0) {
            str2 = gymWidgetSessionSnapshot.exerciseName;
        }
        if ((i2 & 4) != 0) {
            i = gymWidgetSessionSnapshot.setsLeft;
        }
        if ((i2 & 8) != 0) {
            str3 = gymWidgetSessionSnapshot.suggestionLine;
        }
        return gymWidgetSessionSnapshot.copy(str, str2, i, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getSessionName() {
        return this.sessionName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExerciseName() {
        return this.exerciseName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSetsLeft() {
        return this.setsLeft;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSuggestionLine() {
        return this.suggestionLine;
    }

    public final GymWidgetSessionSnapshot copy(String sessionName, String exerciseName, int setsLeft, String suggestionLine) {
        Intrinsics.checkNotNullParameter(sessionName, "sessionName");
        return new GymWidgetSessionSnapshot(sessionName, exerciseName, setsLeft, suggestionLine);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymWidgetSessionSnapshot)) {
            return false;
        }
        GymWidgetSessionSnapshot gymWidgetSessionSnapshot = (GymWidgetSessionSnapshot) other;
        return Intrinsics.areEqual(this.sessionName, gymWidgetSessionSnapshot.sessionName) && Intrinsics.areEqual(this.exerciseName, gymWidgetSessionSnapshot.exerciseName) && this.setsLeft == gymWidgetSessionSnapshot.setsLeft && Intrinsics.areEqual(this.suggestionLine, gymWidgetSessionSnapshot.suggestionLine);
    }

    public int hashCode() {
        int hashCode = this.sessionName.hashCode() * 31;
        String str = this.exerciseName;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.setsLeft)) * 31;
        String str2 = this.suggestionLine;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "GymWidgetSessionSnapshot(sessionName=" + this.sessionName + ", exerciseName=" + this.exerciseName + ", setsLeft=" + this.setsLeft + ", suggestionLine=" + this.suggestionLine + ")";
    }

    public GymWidgetSessionSnapshot(String sessionName, String str, int i, String str2) {
        Intrinsics.checkNotNullParameter(sessionName, "sessionName");
        this.sessionName = sessionName;
        this.exerciseName = str;
        this.setsLeft = i;
        this.suggestionLine = str2;
    }

    public final String getSessionName() {
        return this.sessionName;
    }

    public final String getExerciseName() {
        return this.exerciseName;
    }

    public final int getSetsLeft() {
        return this.setsLeft;
    }

    public final String getSuggestionLine() {
        return this.suggestionLine;
    }
}
