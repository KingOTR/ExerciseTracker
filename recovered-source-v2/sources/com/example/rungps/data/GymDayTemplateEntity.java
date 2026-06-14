package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J1\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/example/rungps/data/GymDayTemplateEntity;", "", "id", "", "splitId", "dayName", "", "orderIdx", "", "<init>", "(JJLjava/lang/String;I)V", "getId", "()J", "getSplitId", "getDayName", "()Ljava/lang/String;", "getOrderIdx", "()I", "component1", "component2", "component3", "component4", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymDayTemplateEntity {
    private final String dayName;
    private final long id;
    private final int orderIdx;
    private final long splitId;

    public static /* synthetic */ GymDayTemplateEntity copy$default(GymDayTemplateEntity gymDayTemplateEntity, long j, long j2, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = gymDayTemplateEntity.id;
        }
        long j3 = j;
        if ((i2 & 2) != 0) {
            j2 = gymDayTemplateEntity.splitId;
        }
        long j4 = j2;
        if ((i2 & 4) != 0) {
            str = gymDayTemplateEntity.dayName;
        }
        String str2 = str;
        if ((i2 & 8) != 0) {
            i = gymDayTemplateEntity.orderIdx;
        }
        return gymDayTemplateEntity.copy(j3, j4, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getSplitId() {
        return this.splitId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDayName() {
        return this.dayName;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrderIdx() {
        return this.orderIdx;
    }

    public final GymDayTemplateEntity copy(long id, long splitId, String dayName, int orderIdx) {
        Intrinsics.checkNotNullParameter(dayName, "dayName");
        return new GymDayTemplateEntity(id, splitId, dayName, orderIdx);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymDayTemplateEntity)) {
            return false;
        }
        GymDayTemplateEntity gymDayTemplateEntity = (GymDayTemplateEntity) other;
        return this.id == gymDayTemplateEntity.id && this.splitId == gymDayTemplateEntity.splitId && Intrinsics.areEqual(this.dayName, gymDayTemplateEntity.dayName) && this.orderIdx == gymDayTemplateEntity.orderIdx;
    }

    public int hashCode() {
        return (((((Long.hashCode(this.id) * 31) + Long.hashCode(this.splitId)) * 31) + this.dayName.hashCode()) * 31) + Integer.hashCode(this.orderIdx);
    }

    public String toString() {
        return "GymDayTemplateEntity(id=" + this.id + ", splitId=" + this.splitId + ", dayName=" + this.dayName + ", orderIdx=" + this.orderIdx + ")";
    }

    public GymDayTemplateEntity(long j, long j2, String dayName, int i) {
        Intrinsics.checkNotNullParameter(dayName, "dayName");
        this.id = j;
        this.splitId = j2;
        this.dayName = dayName;
        this.orderIdx = i;
    }

    public /* synthetic */ GymDayTemplateEntity(long j, long j2, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, str, i);
    }

    public final long getId() {
        return this.id;
    }

    public final long getSplitId() {
        return this.splitId;
    }

    public final String getDayName() {
        return this.dayName;
    }

    public final int getOrderIdx() {
        return this.orderIdx;
    }
}
