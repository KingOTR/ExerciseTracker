package com.example.rungps.data;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\bHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0006HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/example/rungps/data/ExerciseTemplateEntity;", "", "id", "", "dayTemplateId", HintConstants.AUTOFILL_HINT_NAME, "", "orderIdx", "", "defaultSets", "<init>", "(JJLjava/lang/String;II)V", "getId", "()J", "getDayTemplateId", "getName", "()Ljava/lang/String;", "getOrderIdx", "()I", "getDefaultSets", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExerciseTemplateEntity {
    private final long dayTemplateId;
    private final int defaultSets;
    private final long id;
    private final String name;
    private final int orderIdx;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDayTemplateId() {
        return this.dayTemplateId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component4, reason: from getter */
    public final int getOrderIdx() {
        return this.orderIdx;
    }

    /* renamed from: component5, reason: from getter */
    public final int getDefaultSets() {
        return this.defaultSets;
    }

    public final ExerciseTemplateEntity copy(long id, long dayTemplateId, String name, int orderIdx, int defaultSets) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new ExerciseTemplateEntity(id, dayTemplateId, name, orderIdx, defaultSets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExerciseTemplateEntity)) {
            return false;
        }
        ExerciseTemplateEntity exerciseTemplateEntity = (ExerciseTemplateEntity) other;
        return this.id == exerciseTemplateEntity.id && this.dayTemplateId == exerciseTemplateEntity.dayTemplateId && Intrinsics.areEqual(this.name, exerciseTemplateEntity.name) && this.orderIdx == exerciseTemplateEntity.orderIdx && this.defaultSets == exerciseTemplateEntity.defaultSets;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.dayTemplateId)) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.orderIdx)) * 31) + Integer.hashCode(this.defaultSets);
    }

    public String toString() {
        return "ExerciseTemplateEntity(id=" + this.id + ", dayTemplateId=" + this.dayTemplateId + ", name=" + this.name + ", orderIdx=" + this.orderIdx + ", defaultSets=" + this.defaultSets + ")";
    }

    public ExerciseTemplateEntity(long j, long j2, String name, int i, int i2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.dayTemplateId = j2;
        this.name = name;
        this.orderIdx = i;
        this.defaultSets = i2;
    }

    public /* synthetic */ ExerciseTemplateEntity(long j, long j2, String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0L : j, j2, str, i, (i3 & 16) != 0 ? 3 : i2);
    }

    public final long getId() {
        return this.id;
    }

    public final long getDayTemplateId() {
        return this.dayTemplateId;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrderIdx() {
        return this.orderIdx;
    }

    public final int getDefaultSets() {
        return this.defaultSets;
    }
}
