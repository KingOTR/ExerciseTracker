package com.example.rungps.feature.run;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunTabUiState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\bHÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\bHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/feature/run/RunTabUiState;", "", "rows", "", "Lcom/example/rungps/feature/run/RunRow;", "isRecording", "", "message", "", "<init>", "(Ljava/util/List;ZLjava/lang/String;)V", "getRows", "()Ljava/util/List;", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "run_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RunTabUiState {
    private final boolean isRecording;
    private final String message;
    private final List<RunRow> rows;

    public RunTabUiState() {
        this(null, false, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RunTabUiState copy$default(RunTabUiState runTabUiState, List list, boolean z, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            list = runTabUiState.rows;
        }
        if ((i & 2) != 0) {
            z = runTabUiState.isRecording;
        }
        if ((i & 4) != 0) {
            str = runTabUiState.message;
        }
        return runTabUiState.copy(list, z, str);
    }

    public final List<RunRow> component1() {
        return this.rows;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsRecording() {
        return this.isRecording;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final RunTabUiState copy(List<RunRow> rows, boolean isRecording, String message) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new RunTabUiState(rows, isRecording, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunTabUiState)) {
            return false;
        }
        RunTabUiState runTabUiState = (RunTabUiState) other;
        return Intrinsics.areEqual(this.rows, runTabUiState.rows) && this.isRecording == runTabUiState.isRecording && Intrinsics.areEqual(this.message, runTabUiState.message);
    }

    public int hashCode() {
        int hashCode = ((this.rows.hashCode() * 31) + Boolean.hashCode(this.isRecording)) * 31;
        String str = this.message;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RunTabUiState(rows=" + this.rows + ", isRecording=" + this.isRecording + ", message=" + this.message + ")";
    }

    public RunTabUiState(List<RunRow> rows, boolean z, String str) {
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.rows = rows;
        this.isRecording = z;
        this.message = str;
    }

    public /* synthetic */ RunTabUiState(List list, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
    }

    public final List<RunRow> getRows() {
        return this.rows;
    }

    public final boolean isRecording() {
        return this.isRecording;
    }

    public final String getMessage() {
        return this.message;
    }
}
