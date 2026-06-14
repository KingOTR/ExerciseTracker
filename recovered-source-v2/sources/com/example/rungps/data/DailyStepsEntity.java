package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.maplibre.android.style.layers.Property;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/data/DailyStepsEntity;", "", "id", "", "epochDay", "steps", Property.SYMBOL_Z_ORDER_SOURCE, "", "syncedAtMs", "<init>", "(JJJLjava/lang/String;J)V", "getId", "()J", "getEpochDay", "getSteps", "getSource", "()Ljava/lang/String;", "getSyncedAtMs", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class DailyStepsEntity {
    private final long epochDay;
    private final long id;
    private final String source;
    private final long steps;
    private final long syncedAtMs;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getEpochDay() {
        return this.epochDay;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSteps() {
        return this.steps;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component5, reason: from getter */
    public final long getSyncedAtMs() {
        return this.syncedAtMs;
    }

    public final DailyStepsEntity copy(long id, long epochDay, long steps, String source, long syncedAtMs) {
        Intrinsics.checkNotNullParameter(source, "source");
        return new DailyStepsEntity(id, epochDay, steps, source, syncedAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DailyStepsEntity)) {
            return false;
        }
        DailyStepsEntity dailyStepsEntity = (DailyStepsEntity) other;
        return this.id == dailyStepsEntity.id && this.epochDay == dailyStepsEntity.epochDay && this.steps == dailyStepsEntity.steps && Intrinsics.areEqual(this.source, dailyStepsEntity.source) && this.syncedAtMs == dailyStepsEntity.syncedAtMs;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.epochDay)) * 31) + Long.hashCode(this.steps)) * 31) + this.source.hashCode()) * 31) + Long.hashCode(this.syncedAtMs);
    }

    public String toString() {
        return "DailyStepsEntity(id=" + this.id + ", epochDay=" + this.epochDay + ", steps=" + this.steps + ", source=" + this.source + ", syncedAtMs=" + this.syncedAtMs + ")";
    }

    public DailyStepsEntity(long j, long j2, long j3, String source, long j4) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.id = j;
        this.epochDay = j2;
        this.steps = j3;
        this.source = source;
        this.syncedAtMs = j4;
    }

    public /* synthetic */ DailyStepsEntity(long j, long j2, long j3, String str, long j4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, j3, str, j4);
    }

    public final long getId() {
        return this.id;
    }

    public final long getEpochDay() {
        return this.epochDay;
    }

    public final long getSteps() {
        return this.steps;
    }

    public final String getSource() {
        return this.source;
    }

    public final long getSyncedAtMs() {
        return this.syncedAtMs;
    }
}
