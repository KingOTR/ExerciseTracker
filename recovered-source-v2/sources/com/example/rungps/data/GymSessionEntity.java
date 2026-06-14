package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\"\u001a\u00020\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003Jt\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010(J\u0013\u0010)\u001a\u00020\b2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001a¨\u0006."}, d2 = {"Lcom/example/rungps/data/GymSessionEntity;", "", "id", "", "startedAtMs", "endedAtMs", "templateDayId", "freeDay", "", "notes", "", "ambientTag", "ambientTagCustom", "remoteId", "<init>", "(JJLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getStartedAtMs", "getEndedAtMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getTemplateDayId", "getFreeDay", "()Z", "getNotes", "()Ljava/lang/String;", "getAmbientTag", "getAmbientTagCustom", "getRemoteId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(JJLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/rungps/data/GymSessionEntity;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GymSessionEntity {
    private final String ambientTag;
    private final String ambientTagCustom;
    private final Long endedAtMs;
    private final boolean freeDay;
    private final long id;
    private final String notes;
    private final String remoteId;
    private final long startedAtMs;
    private final Long templateDayId;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getEndedAtMs() {
        return this.endedAtMs;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getTemplateDayId() {
        return this.templateDayId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getFreeDay() {
        return this.freeDay;
    }

    /* renamed from: component6, reason: from getter */
    public final String getNotes() {
        return this.notes;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAmbientTag() {
        return this.ambientTag;
    }

    /* renamed from: component8, reason: from getter */
    public final String getAmbientTagCustom() {
        return this.ambientTagCustom;
    }

    /* renamed from: component9, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    public final GymSessionEntity copy(long id, long startedAtMs, Long endedAtMs, Long templateDayId, boolean freeDay, String notes, String ambientTag, String ambientTagCustom, String remoteId) {
        return new GymSessionEntity(id, startedAtMs, endedAtMs, templateDayId, freeDay, notes, ambientTag, ambientTagCustom, remoteId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GymSessionEntity)) {
            return false;
        }
        GymSessionEntity gymSessionEntity = (GymSessionEntity) other;
        return this.id == gymSessionEntity.id && this.startedAtMs == gymSessionEntity.startedAtMs && Intrinsics.areEqual(this.endedAtMs, gymSessionEntity.endedAtMs) && Intrinsics.areEqual(this.templateDayId, gymSessionEntity.templateDayId) && this.freeDay == gymSessionEntity.freeDay && Intrinsics.areEqual(this.notes, gymSessionEntity.notes) && Intrinsics.areEqual(this.ambientTag, gymSessionEntity.ambientTag) && Intrinsics.areEqual(this.ambientTagCustom, gymSessionEntity.ambientTagCustom) && Intrinsics.areEqual(this.remoteId, gymSessionEntity.remoteId);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.startedAtMs)) * 31;
        Long l = this.endedAtMs;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.templateDayId;
        int hashCode3 = (((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + Boolean.hashCode(this.freeDay)) * 31;
        String str = this.notes;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.ambientTag;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.ambientTagCustom;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.remoteId;
        return hashCode6 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "GymSessionEntity(id=" + this.id + ", startedAtMs=" + this.startedAtMs + ", endedAtMs=" + this.endedAtMs + ", templateDayId=" + this.templateDayId + ", freeDay=" + this.freeDay + ", notes=" + this.notes + ", ambientTag=" + this.ambientTag + ", ambientTagCustom=" + this.ambientTagCustom + ", remoteId=" + this.remoteId + ")";
    }

    public GymSessionEntity(long j, long j2, Long l, Long l2, boolean z, String str, String str2, String str3, String str4) {
        this.id = j;
        this.startedAtMs = j2;
        this.endedAtMs = l;
        this.templateDayId = l2;
        this.freeDay = z;
        this.notes = str;
        this.ambientTag = str2;
        this.ambientTagCustom = str3;
        this.remoteId = str4;
    }

    public /* synthetic */ GymSessionEntity(long j, long j2, Long l, Long l2, boolean z, String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4);
    }

    public final long getId() {
        return this.id;
    }

    public final long getStartedAtMs() {
        return this.startedAtMs;
    }

    public final Long getEndedAtMs() {
        return this.endedAtMs;
    }

    public final Long getTemplateDayId() {
        return this.templateDayId;
    }

    public final boolean getFreeDay() {
        return this.freeDay;
    }

    public final String getNotes() {
        return this.notes;
    }

    public final String getAmbientTag() {
        return this.ambientTag;
    }

    public final String getAmbientTagCustom() {
        return this.ambientTagCustom;
    }

    public final String getRemoteId() {
        return this.remoteId;
    }
}
