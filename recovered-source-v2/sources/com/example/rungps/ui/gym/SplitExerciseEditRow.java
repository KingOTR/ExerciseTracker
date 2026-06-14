package com.example.rungps.ui.gym;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplitProgramEditorDialog.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\r\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0010¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/ui/gym/SplitExerciseEditRow;", "", "templateId", "", "dayName", "", HintConstants.AUTOFILL_HINT_NAME, "defaultSets", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getTemplateId", "()J", "getDayName", "()Ljava/lang/String;", "getName", "setName", "(Ljava/lang/String;)V", "getDefaultSets", "setDefaultSets", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SplitExerciseEditRow {
    public static final int $stable = 8;
    private final String dayName;
    private String defaultSets;
    private String name;
    private final long templateId;

    public static /* synthetic */ SplitExerciseEditRow copy$default(SplitExerciseEditRow splitExerciseEditRow, long j, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            j = splitExerciseEditRow.templateId;
        }
        long j2 = j;
        if ((i & 2) != 0) {
            str = splitExerciseEditRow.dayName;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            str2 = splitExerciseEditRow.name;
        }
        String str5 = str2;
        if ((i & 8) != 0) {
            str3 = splitExerciseEditRow.defaultSets;
        }
        return splitExerciseEditRow.copy(j2, str4, str5, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getTemplateId() {
        return this.templateId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDayName() {
        return this.dayName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDefaultSets() {
        return this.defaultSets;
    }

    public final SplitExerciseEditRow copy(long templateId, String dayName, String name, String defaultSets) {
        Intrinsics.checkNotNullParameter(dayName, "dayName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultSets, "defaultSets");
        return new SplitExerciseEditRow(templateId, dayName, name, defaultSets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SplitExerciseEditRow)) {
            return false;
        }
        SplitExerciseEditRow splitExerciseEditRow = (SplitExerciseEditRow) other;
        return this.templateId == splitExerciseEditRow.templateId && Intrinsics.areEqual(this.dayName, splitExerciseEditRow.dayName) && Intrinsics.areEqual(this.name, splitExerciseEditRow.name) && Intrinsics.areEqual(this.defaultSets, splitExerciseEditRow.defaultSets);
    }

    public int hashCode() {
        return (((((Long.hashCode(this.templateId) * 31) + this.dayName.hashCode()) * 31) + this.name.hashCode()) * 31) + this.defaultSets.hashCode();
    }

    public String toString() {
        return "SplitExerciseEditRow(templateId=" + this.templateId + ", dayName=" + this.dayName + ", name=" + this.name + ", defaultSets=" + this.defaultSets + ")";
    }

    public SplitExerciseEditRow(long j, String dayName, String name, String defaultSets) {
        Intrinsics.checkNotNullParameter(dayName, "dayName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(defaultSets, "defaultSets");
        this.templateId = j;
        this.dayName = dayName;
        this.name = name;
        this.defaultSets = defaultSets;
    }

    public final long getTemplateId() {
        return this.templateId;
    }

    public final String getDayName() {
        return this.dayName;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getDefaultSets() {
        return this.defaultSets;
    }

    public final void setDefaultSets(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.defaultSets = str;
    }
}
