package com.example.rungps.data;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010¨\u0006#"}, d2 = {"Lcom/example/rungps/data/RouteEntity;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "", "createdAtMs", "distanceM", "", "remoteId", "dedupeKey", "<init>", "(JLjava/lang/String;JDLjava/lang/String;Ljava/lang/String;)V", "getId", "()J", "getName", "()Ljava/lang/String;", "getCreatedAtMs", "getDistanceM", "()D", "getRemoteId", "getDedupeKey", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RouteEntity {
    private final long createdAtMs;
    private final String dedupeKey;
    private final double distanceM;
    private final long id;
    private final String name;
    private final String remoteId;

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

    /* renamed from: component4, reason: from getter */
    public final double getDistanceM() {
        return this.distanceM;
    }

    /* renamed from: component5, reason: from getter */
    public final String getRemoteId() {
        return this.remoteId;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDedupeKey() {
        return this.dedupeKey;
    }

    public final RouteEntity copy(long id, String name, long createdAtMs, double distanceM, String remoteId, String dedupeKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new RouteEntity(id, name, createdAtMs, distanceM, remoteId, dedupeKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RouteEntity)) {
            return false;
        }
        RouteEntity routeEntity = (RouteEntity) other;
        return this.id == routeEntity.id && Intrinsics.areEqual(this.name, routeEntity.name) && this.createdAtMs == routeEntity.createdAtMs && Double.compare(this.distanceM, routeEntity.distanceM) == 0 && Intrinsics.areEqual(this.remoteId, routeEntity.remoteId) && Intrinsics.areEqual(this.dedupeKey, routeEntity.dedupeKey);
    }

    public int hashCode() {
        int hashCode = ((((((Long.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.createdAtMs)) * 31) + Double.hashCode(this.distanceM)) * 31;
        String str = this.remoteId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.dedupeKey;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "RouteEntity(id=" + this.id + ", name=" + this.name + ", createdAtMs=" + this.createdAtMs + ", distanceM=" + this.distanceM + ", remoteId=" + this.remoteId + ", dedupeKey=" + this.dedupeKey + ")";
    }

    public RouteEntity(long j, String name, long j2, double d, String str, String str2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.id = j;
        this.name = name;
        this.createdAtMs = j2;
        this.distanceM = d;
        this.remoteId = str;
        this.dedupeKey = str2;
    }

    public /* synthetic */ RouteEntity(long j, String str, long j2, double d, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, str, j2, d, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3);
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

    public final double getDistanceM() {
        return this.distanceM;
    }

    public final String getRemoteId() {
        return this.remoteId;
    }

    public final String getDedupeKey() {
        return this.dedupeKey;
    }
}
