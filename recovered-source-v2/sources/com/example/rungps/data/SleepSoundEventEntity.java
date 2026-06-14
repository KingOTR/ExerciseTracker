package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\b\u0002\u0010\r\u001a\u00020\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003JY\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u00072\b\b\u0002\u0010\r\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020\u0007HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0015R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0011¨\u0006*"}, d2 = {"Lcom/example/rungps/data/SleepSoundEventEntity;", "", "id", "", "nightStartTimeMs", "eventTimeMs", "kind", "", "intensity", "", "durationMs", "", "encryptedFileName", "createdAtMs", "<init>", "(JJJLjava/lang/String;FILjava/lang/String;J)V", "getId", "()J", "getNightStartTimeMs", "getEventTimeMs", "getKind", "()Ljava/lang/String;", "getIntensity", "()F", "getDurationMs", "()I", "getEncryptedFileName", "getCreatedAtMs", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SleepSoundEventEntity {
    private final long createdAtMs;
    private final int durationMs;
    private final String encryptedFileName;
    private final long eventTimeMs;
    private final long id;
    private final float intensity;
    private final String kind;
    private final long nightStartTimeMs;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getNightStartTimeMs() {
        return this.nightStartTimeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final long getEventTimeMs() {
        return this.eventTimeMs;
    }

    /* renamed from: component4, reason: from getter */
    public final String getKind() {
        return this.kind;
    }

    /* renamed from: component5, reason: from getter */
    public final float getIntensity() {
        return this.intensity;
    }

    /* renamed from: component6, reason: from getter */
    public final int getDurationMs() {
        return this.durationMs;
    }

    /* renamed from: component7, reason: from getter */
    public final String getEncryptedFileName() {
        return this.encryptedFileName;
    }

    /* renamed from: component8, reason: from getter */
    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }

    public final SleepSoundEventEntity copy(long id, long nightStartTimeMs, long eventTimeMs, String kind, float intensity, int durationMs, String encryptedFileName, long createdAtMs) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(encryptedFileName, "encryptedFileName");
        return new SleepSoundEventEntity(id, nightStartTimeMs, eventTimeMs, kind, intensity, durationMs, encryptedFileName, createdAtMs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SleepSoundEventEntity)) {
            return false;
        }
        SleepSoundEventEntity sleepSoundEventEntity = (SleepSoundEventEntity) other;
        return this.id == sleepSoundEventEntity.id && this.nightStartTimeMs == sleepSoundEventEntity.nightStartTimeMs && this.eventTimeMs == sleepSoundEventEntity.eventTimeMs && Intrinsics.areEqual(this.kind, sleepSoundEventEntity.kind) && Float.compare(this.intensity, sleepSoundEventEntity.intensity) == 0 && this.durationMs == sleepSoundEventEntity.durationMs && Intrinsics.areEqual(this.encryptedFileName, sleepSoundEventEntity.encryptedFileName) && this.createdAtMs == sleepSoundEventEntity.createdAtMs;
    }

    public int hashCode() {
        return (((((((((((((Long.hashCode(this.id) * 31) + Long.hashCode(this.nightStartTimeMs)) * 31) + Long.hashCode(this.eventTimeMs)) * 31) + this.kind.hashCode()) * 31) + Float.hashCode(this.intensity)) * 31) + Integer.hashCode(this.durationMs)) * 31) + this.encryptedFileName.hashCode()) * 31) + Long.hashCode(this.createdAtMs);
    }

    public String toString() {
        return "SleepSoundEventEntity(id=" + this.id + ", nightStartTimeMs=" + this.nightStartTimeMs + ", eventTimeMs=" + this.eventTimeMs + ", kind=" + this.kind + ", intensity=" + this.intensity + ", durationMs=" + this.durationMs + ", encryptedFileName=" + this.encryptedFileName + ", createdAtMs=" + this.createdAtMs + ")";
    }

    public SleepSoundEventEntity(long j, long j2, long j3, String kind, float f, int i, String encryptedFileName, long j4) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        Intrinsics.checkNotNullParameter(encryptedFileName, "encryptedFileName");
        this.id = j;
        this.nightStartTimeMs = j2;
        this.eventTimeMs = j3;
        this.kind = kind;
        this.intensity = f;
        this.durationMs = i;
        this.encryptedFileName = encryptedFileName;
        this.createdAtMs = j4;
    }

    public final long getId() {
        return this.id;
    }

    public final long getNightStartTimeMs() {
        return this.nightStartTimeMs;
    }

    public final long getEventTimeMs() {
        return this.eventTimeMs;
    }

    public final String getKind() {
        return this.kind;
    }

    public final float getIntensity() {
        return this.intensity;
    }

    public final int getDurationMs() {
        return this.durationMs;
    }

    public final String getEncryptedFileName() {
        return this.encryptedFileName;
    }

    public /* synthetic */ SleepSoundEventEntity(long j, long j2, long j3, String str, float f, int i, String str2, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, j2, j3, str, (i2 & 16) != 0 ? 0.0f : f, (i2 & 32) != 0 ? 0 : i, str2, (i2 & 128) != 0 ? System.currentTimeMillis() : j4);
    }

    public final long getCreatedAtMs() {
        return this.createdAtMs;
    }
}
