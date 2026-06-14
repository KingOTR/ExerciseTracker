package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Repository.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/example/rungps/data/GymXlsxImportResult;", "", "sessionsImported", "", "summaryMessage", "", "warnings", "", "<init>", "(ILjava/lang/String;Ljava/util/List;)V", "getSessionsImported", "()I", "getSummaryMessage", "()Ljava/lang/String;", "getWarnings", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymXlsxImportResult {
    public static final int $stable = 8;
    private final int sessionsImported;
    private final String summaryMessage;
    private final List<String> warnings;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GymXlsxImportResult copy$default(GymXlsxImportResult gymXlsxImportResult, int i, String str, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = gymXlsxImportResult.sessionsImported;
        }
        if ((i2 & 2) != 0) {
            str = gymXlsxImportResult.summaryMessage;
        }
        if ((i2 & 4) != 0) {
            list = gymXlsxImportResult.warnings;
        }
        return gymXlsxImportResult.copy(i, str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSessionsImported() {
        return this.sessionsImported;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSummaryMessage() {
        return this.summaryMessage;
    }

    public final List<String> component3() {
        return this.warnings;
    }

    public final GymXlsxImportResult copy(int sessionsImported, String summaryMessage, List<String> warnings) {
        Intrinsics.checkNotNullParameter(summaryMessage, "summaryMessage");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        return new GymXlsxImportResult(sessionsImported, summaryMessage, warnings);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymXlsxImportResult)) {
            return false;
        }
        GymXlsxImportResult gymXlsxImportResult = (GymXlsxImportResult) other;
        return this.sessionsImported == gymXlsxImportResult.sessionsImported && Intrinsics.areEqual(this.summaryMessage, gymXlsxImportResult.summaryMessage) && Intrinsics.areEqual(this.warnings, gymXlsxImportResult.warnings);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.sessionsImported) * 31) + this.summaryMessage.hashCode()) * 31) + this.warnings.hashCode();
    }

    public String toString() {
        return "GymXlsxImportResult(sessionsImported=" + this.sessionsImported + ", summaryMessage=" + this.summaryMessage + ", warnings=" + this.warnings + ")";
    }

    public GymXlsxImportResult(int i, String summaryMessage, List<String> warnings) {
        Intrinsics.checkNotNullParameter(summaryMessage, "summaryMessage");
        Intrinsics.checkNotNullParameter(warnings, "warnings");
        this.sessionsImported = i;
        this.summaryMessage = summaryMessage;
        this.warnings = warnings;
    }

    public final int getSessionsImported() {
        return this.sessionsImported;
    }

    public final String getSummaryMessage() {
        return this.summaryMessage;
    }

    public final List<String> getWarnings() {
        return this.warnings;
    }
}
