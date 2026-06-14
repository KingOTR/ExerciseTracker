package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\fHÆ\u0003JO\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\bHÖ\u0001J\t\u0010&\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lcom/example/rungps/data/RunSplitEntity;", "", "id", "", "runId", "kind", "", "idx", "", "elapsedEndMs", "durationMs", "distanceM", "", "<init>", "(JJLjava/lang/String;IJJD)V", "getId", "()J", "getRunId", "getKind", "()Ljava/lang/String;", "getIdx", "()I", "getElapsedEndMs", "getDurationMs", "getDistanceM", "()D", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RunSplitEntity {
    private final double distanceM;
    private final long durationMs;
    private final long elapsedEndMs;
    private final long id;
    private final int idx;
    private final String kind;
    private final long runId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRunId() {
        return this.runId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component4, reason: from getter */
    public final int getIdx() {
        return this.idx;
    }

    /* renamed from: component5, reason: from getter */
    public final long getElapsedEndMs() {
        return this.elapsedEndMs;
    }

    /* renamed from: component6, reason: from getter */
    public final long getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component7, reason: from getter */
    public final double getDistanceM() {
        return this.distanceM;
    }

    public final RunSplitEntity copy(long id, long runId, String kind, int idx, long elapsedEndMs, long durationMs, double distanceM) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new RunSplitEntity(id, runId, kind, idx, elapsedEndMs, durationMs, distanceM);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunSplitEntity)) {
            return false;
        }
        RunSplitEntity runSplitEntity = (RunSplitEntity) other;
        return this.id == runSplitEntity.id && this.runId == runSplitEntity.runId && Intrinsics.areEqual(this.kind, runSplitEntity.kind) && this.idx == runSplitEntity.idx && this.elapsedEndMs == runSplitEntity.elapsedEndMs && this.durationMs == runSplitEntity.durationMs && Double.compare(this.distanceM, runSplitEntity.distanceM) == 0;
    }

    public int hashCode() {
        return (((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.runId)) * 31) + this.kind.hashCode()) * 31) + Integer.hashCode(this.idx)) * 31) + Long.hashCode(this.elapsedEndMs)) * 31) + Long.hashCode(this.durationMs)) * 31) + Double.hashCode(this.distanceM);
    }

    public String toString() {
        return "RunSplitEntity(id=" + this.id + ", runId=" + this.runId + ", kind=" + this.kind + ", idx=" + this.idx + ", elapsedEndMs=" + this.elapsedEndMs + ", durationMs=" + this.durationMs + ", distanceM=" + this.distanceM + ")";
    }

    public RunSplitEntity(long j, long j2, String kind, int i, long j3, long j4, double d) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.id = j;
        this.runId = j2;
        this.kind = kind;
        this.idx = i;
        this.elapsedEndMs = j3;
        this.durationMs = j4;
        this.distanceM = d;
    }

    public /* synthetic */ RunSplitEntity(long j, long j2, String str, int i, long j3, long j4, double d, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, str, i, j3, j4, d);
    }

    public final long getId() {
        return this.id;
    }

    public final long getRunId() {
        return this.runId;
    }

    public final String getKind() {
        return this.kind;
    }

    public final int getIdx() {
        return this.idx;
    }

    public final long getElapsedEndMs() {
        return this.elapsedEndMs;
    }

    public final long getDurationMs() {
        return this.durationMs;
    }

    public final double getDistanceM() {
        return this.distanceM;
    }
}
