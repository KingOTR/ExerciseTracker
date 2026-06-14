package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006&"}, d2 = {"Lcom/example/rungps/data/RecoveryEventEntity;", "", "id", "", "kind", "", "sourceId", "startedAtMs", "endsAtMs", "loadScore", "", "notes", "<init>", "(JLjava/lang/String;JJJDLjava/lang/String;)V", "getId", "()J", "getKind", "()Ljava/lang/String;", "getSourceId", "getStartedAtMs", "getEndsAtMs", "getLoadScore", "()D", "getNotes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RecoveryEventEntity {
    private final long endsAtMs;
    private final long id;
    private final String kind;
    private final double loadScore;
    private final String notes;
    private final long sourceId;
    private final long startedAtMs;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSourceId() {
        return this.sourceId;
    }

    /* renamed from: component4, reason: from getter */
    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    /* renamed from: component5, reason: from getter */
    public final long getEndsAtMs() {
        return this.endsAtMs;
    }

    /* renamed from: component6, reason: from getter */
    public final double getLoadScore() {
        return this.loadScore;
    }

    /* renamed from: component7, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    public final RecoveryEventEntity copy(long id, String kind, long sourceId, long startedAtMs, long endsAtMs, double loadScore, String notes) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        return new RecoveryEventEntity(id, kind, sourceId, startedAtMs, endsAtMs, loadScore, notes);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecoveryEventEntity)) {
            return false;
        }
        RecoveryEventEntity recoveryEventEntity = (RecoveryEventEntity) other;
        return this.id == recoveryEventEntity.id && Intrinsics.areEqual(this.kind, recoveryEventEntity.kind) && this.sourceId == recoveryEventEntity.sourceId && this.startedAtMs == recoveryEventEntity.startedAtMs && this.endsAtMs == recoveryEventEntity.endsAtMs && Double.compare(this.loadScore, recoveryEventEntity.loadScore) == 0 && Intrinsics.areEqual(this.notes, recoveryEventEntity.notes);
    }

    public int hashCode() {
        int hashCode = ((((((((((Long.hashCode(this.id) * 31) + this.kind.hashCode()) * 31) + Long.hashCode(this.sourceId)) * 31) + Long.hashCode(this.startedAtMs)) * 31) + Long.hashCode(this.endsAtMs)) * 31) + Double.hashCode(this.loadScore)) * 31;
        String str = this.notes;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "RecoveryEventEntity(id=" + this.id + ", kind=" + this.kind + ", sourceId=" + this.sourceId + ", startedAtMs=" + this.startedAtMs + ", endsAtMs=" + this.endsAtMs + ", loadScore=" + this.loadScore + ", notes=" + this.notes + ")";
    }

    public RecoveryEventEntity(long j, String kind, long j2, long j3, long j4, double d, String str) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.id = j;
        this.kind = kind;
        this.sourceId = j2;
        this.startedAtMs = j3;
        this.endsAtMs = j4;
        this.loadScore = d;
        this.notes = str;
    }

    public /* synthetic */ RecoveryEventEntity(long j, String str, long j2, long j3, long j4, double d, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2, j3, j4, d, (i & 64) != 0 ? null : str2);
    }

    public final long getId() {
        return this.id;
    }

    public final String getKind() {
        return this.kind;
    }

    public final long getSourceId() {
        return this.sourceId;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final long getEndsAtMs() {
        return this.endsAtMs;
    }

    public final double getLoadScore() {
        return this.loadScore;
    }

    public final String getNotes() {
        return this.notes;
    }
}
