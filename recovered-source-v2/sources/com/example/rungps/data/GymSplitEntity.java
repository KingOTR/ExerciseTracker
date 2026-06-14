package com.example.rungps.data;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/data/GymSplitEntity;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "createdAtMs", "<init>", "(JLjava/lang/String;J)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getCreatedAtMs", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymSplitEntity {
    private final long createdAtMs;
    private final long id;
    private final String name;

    public static /* synthetic */ GymSplitEntity copy$default(GymSplitEntity gymSplitEntity, long j, String str, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            j = gymSplitEntity.id;
        }
        long j3 = j;
        if ((i & 2) != 0) {
            str = gymSplitEntity.name;
        }
        String str2 = str;
        if ((i & 4) != 0) {
            j2 = gymSplitEntity.createdAtMs;
        }
        return gymSplitEntity.copy(j3, str2, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    public final GymSplitEntity copy(long id, String name, long createdAtMs) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new GymSplitEntity(id, name, createdAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymSplitEntity)) {
            return false;
        }
        GymSplitEntity gymSplitEntity = (GymSplitEntity) other;
        return this.id == gymSplitEntity.id && Intrinsics.areEqual(this.name, gymSplitEntity.name) && this.createdAtMs == gymSplitEntity.createdAtMs;
    }

    public int hashCode() {
        return (((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.createdAtMs);
    }

    public String toString() {
        return "GymSplitEntity(id=" + this.id + ", name=" + this.name + ", createdAtMs=" + this.createdAtMs + ")";
    }

    public GymSplitEntity(long j, String name, long j2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.name = name;
        this.createdAtMs = j2;
    }

    public /* synthetic */ GymSplitEntity(long j, String str, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2);
    }

    public final long getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }
}
