package com.example.rungps.importing;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepCycleCsvImporter.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/importing/SleepCycleImportResult;", "", "imported", "", "skipped", "message", "", "<init>", "(IILjava/lang/String;)V", "getImported", "()I", "getSkipped", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepCycleImportResult {
    public static final int $stable = 0;
    private final int imported;
    private final String message;
    private final int skipped;

    public static /* synthetic */ SleepCycleImportResult copy$default(SleepCycleImportResult sleepCycleImportResult, int i, int i2, String str, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sleepCycleImportResult.imported;
        }
        if ((i3 & 2) != 0) {
            i2 = sleepCycleImportResult.skipped;
        }
        if ((i3 & 4) != 0) {
            str = sleepCycleImportResult.message;
        }
        return sleepCycleImportResult.copy(i, i2, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getImported() {
        return this.imported;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSkipped() {
        return this.skipped;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final SleepCycleImportResult copy(int imported, int skipped, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new SleepCycleImportResult(imported, skipped, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepCycleImportResult)) {
            return false;
        }
        SleepCycleImportResult sleepCycleImportResult = (SleepCycleImportResult) other;
        return this.imported == sleepCycleImportResult.imported && this.skipped == sleepCycleImportResult.skipped && Intrinsics.areEqual(this.message, sleepCycleImportResult.message);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.imported) * 31) + Integer.hashCode(this.skipped)) * 31) + this.message.hashCode();
    }

    public String toString() {
        return "SleepCycleImportResult(imported=" + this.imported + ", skipped=" + this.skipped + ", message=" + this.message + ")";
    }

    public SleepCycleImportResult(int i, int i2, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.imported = i;
        this.skipped = i2;
        this.message = message;
    }

    public final int getImported() {
        return this.imported;
    }

    public final String getMessage() {
        return this.message;
    }

    public final int getSkipped() {
        return this.skipped;
    }
}
