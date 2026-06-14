package com.example.rungps.data;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Entities.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\t\u0010%\u001a\u00020\bHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0016J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u008c\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020\b2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\nHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0019R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u001f\u0010\u0016R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001b¨\u00063"}, d2 = {"Lcom/example/rungps/data/SpotifyTimelineEntity;", "", "id", "", "timeMs", "runId", "gymSessionId", "isPlaying", "", "itemType", "", "itemId", "title", "subtitle", "progressMs", "artUrl", "<init>", "(JJLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)V", "getId", "()J", "getTimeMs", "getRunId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGymSessionId", "()Z", "getItemType", "()Ljava/lang/String;", "getItemId", "getTitle", "getSubtitle", "getProgressMs", "getArtUrl", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "(JJLjava/lang/Long;Ljava/lang/Long;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/String;)Lcom/example/rungps/data/SpotifyTimelineEntity;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "", "toString", "data_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SpotifyTimelineEntity {
    private final String artUrl;
    private final Long gymSessionId;
    private final long id;
    private final boolean isPlaying;
    private final String itemId;
    private final String itemType;
    private final Long progressMs;
    private final Long runId;
    private final String subtitle;
    private final long timeMs;
    private final String title;

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* renamed from: component10, reason: from getter */
    public final Long getProgressMs() {
        return this.progressMs;
    }

    /* renamed from: component11, reason: from getter */
    public final String getArtUrl() {
        return this.artUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final long getTimeMs() {
        return this.timeMs;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getRunId() {
        return this.runId;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getGymSessionId() {
        return this.gymSessionId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: component6, reason: from getter */
    public final String getItemType() {
        return this.itemType;
    }

    /* renamed from: component7, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final SpotifyTimelineEntity copy(long id, long timeMs, Long runId, Long gymSessionId, boolean isPlaying, String itemType, String itemId, String title, String subtitle, Long progressMs, String artUrl) {
        return new SpotifyTimelineEntity(id, timeMs, runId, gymSessionId, isPlaying, itemType, itemId, title, subtitle, progressMs, artUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyTimelineEntity)) {
            return false;
        }
        SpotifyTimelineEntity spotifyTimelineEntity = (SpotifyTimelineEntity) other;
        return this.id == spotifyTimelineEntity.id && this.timeMs == spotifyTimelineEntity.timeMs && Intrinsics.areEqual(this.runId, spotifyTimelineEntity.runId) && Intrinsics.areEqual(this.gymSessionId, spotifyTimelineEntity.gymSessionId) && this.isPlaying == spotifyTimelineEntity.isPlaying && Intrinsics.areEqual(this.itemType, spotifyTimelineEntity.itemType) && Intrinsics.areEqual(this.itemId, spotifyTimelineEntity.itemId) && Intrinsics.areEqual(this.title, spotifyTimelineEntity.title) && Intrinsics.areEqual(this.subtitle, spotifyTimelineEntity.subtitle) && Intrinsics.areEqual(this.progressMs, spotifyTimelineEntity.progressMs) && Intrinsics.areEqual(this.artUrl, spotifyTimelineEntity.artUrl);
    }

    public int hashCode() {
        int hashCode = ((Long.hashCode(this.id) * 31) + Long.hashCode(this.timeMs)) * 31;
        Long l = this.runId;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.gymSessionId;
        int hashCode3 = (((hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31) + Boolean.hashCode(this.isPlaying)) * 31;
        String str = this.itemType;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.itemId;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.title;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.subtitle;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l3 = this.progressMs;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str5 = this.artUrl;
        return hashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "SpotifyTimelineEntity(id=" + this.id + ", timeMs=" + this.timeMs + ", runId=" + this.runId + ", gymSessionId=" + this.gymSessionId + ", isPlaying=" + this.isPlaying + ", itemType=" + this.itemType + ", itemId=" + this.itemId + ", title=" + this.title + ", subtitle=" + this.subtitle + ", progressMs=" + this.progressMs + ", artUrl=" + this.artUrl + ")";
    }

    public SpotifyTimelineEntity(long j, long j2, Long l, Long l2, boolean z, String str, String str2, String str3, String str4, Long l3, String str5) {
        this.id = j;
        this.timeMs = j2;
        this.runId = l;
        this.gymSessionId = l2;
        this.isPlaying = z;
        this.itemType = str;
        this.itemId = str2;
        this.title = str3;
        this.subtitle = str4;
        this.progressMs = l3;
        this.artUrl = str5;
    }

    public /* synthetic */ SpotifyTimelineEntity(long j, long j2, Long l, Long l2, boolean z, String str, String str2, String str3, String str4, Long l3, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 0L : j, j2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : l2, (i & 16) != 0 ? false : z, (i & 32) != 0 ? null : str, (i & 64) != 0 ? null : str2, (i & 128) != 0 ? null : str3, (i & 256) != 0 ? null : str4, (i & 512) != 0 ? null : l3, (i & 1024) != 0 ? null : str5);
    }

    public final long getId() {
        return this.id;
    }

    public final long getTimeMs() {
        return this.timeMs;
    }

    public final Long getRunId() {
        return this.runId;
    }

    public final Long getGymSessionId() {
        return this.gymSessionId;
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final String getItemType() {
        return this.itemType;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final Long getProgressMs() {
        return this.progressMs;
    }

    public final String getArtUrl() {
        return this.artUrl;
    }
}
