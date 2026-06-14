package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/example/rungps/data/RunHrSampleEntity;", "", "id", "", "runId", "timeMs", "bpm", "", "<init>", "(JJJI)V", "getId", "()J", "getRunId", "getTimeMs", "getBpm", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RunHrSampleEntity {
    private final int bpm;
    private final long id;
    private final long runId;
    private final long timeMs;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getRunId() {
        return this.runId;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component4, reason: from getter */
    public final int getBpm() {
        return this.bpm;
    }

    public final RunHrSampleEntity copy(long id, long runId, long timeMs, int bpm) {
        return new RunHrSampleEntity(id, runId, timeMs, bpm);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RunHrSampleEntity)) {
            return false;
        }
        RunHrSampleEntity runHrSampleEntity = (RunHrSampleEntity) other;
        return this.id == runHrSampleEntity.id && this.runId == runHrSampleEntity.runId && this.timeMs == runHrSampleEntity.timeMs && this.bpm == runHrSampleEntity.bpm;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Long.hashCode(this.runId)) * 31) + Long.hashCode(this.timeMs)) * 31) + Integer.hashCode(this.bpm);
    }

    public String toString() {
        return "RunHrSampleEntity(id=" + this.id + ", runId=" + this.runId + ", timeMs=" + this.timeMs + ", bpm=" + this.bpm + ")";
    }

    public RunHrSampleEntity(long j, long j2, long j3, int i) {
        this.id = j;
        this.runId = j2;
        this.timeMs = j3;
        this.bpm = i;
    }

    public /* synthetic */ RunHrSampleEntity(long j, long j2, long j3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, j3, i);
    }

    public final long getId() {
        return this.id;
    }

    public final long getRunId() {
        return this.runId;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }

    public final int getBpm() {
        return this.bpm;
    }
}
