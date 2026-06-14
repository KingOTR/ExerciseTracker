package com.example.rungps.spotify;

import androidx.health.connect.client.records.Vo2MaxRecord;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SpotifyRecentlyPlayed.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 )2\u00020\u0001:\u0002()B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\b\u0010\u000eJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001J%\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00002\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&H\u0001¢\u0006\u0002\b'R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006*"}, d2 = {"Lcom/example/rungps/spotify/SpotifyRecentlyPlayedItem;", "", "playedAt", "", "track", "Lcom/example/rungps/spotify/SpotifyItem;", "episode", "Lcom/example/rungps/spotify/SpotifyEpisode;", "<init>", "(Ljava/lang/String;Lcom/example/rungps/spotify/SpotifyItem;Lcom/example/rungps/spotify/SpotifyEpisode;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/example/rungps/spotify/SpotifyItem;Lcom/example/rungps/spotify/SpotifyEpisode;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getPlayedAt$annotations", "()V", "getPlayedAt", "()Ljava/lang/String;", "getTrack", "()Lcom/example/rungps/spotify/SpotifyItem;", "getEpisode", "()Lcom/example/rungps/spotify/SpotifyEpisode;", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
final /* data */ class SpotifyRecentlyPlayedItem {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final SpotifyEpisode episode;
    private final String playedAt;
    private final SpotifyItem track;

    public SpotifyRecentlyPlayedItem() {
        this((String) null, (SpotifyItem) null, (SpotifyEpisode) null, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SpotifyRecentlyPlayedItem copy$default(SpotifyRecentlyPlayedItem spotifyRecentlyPlayedItem, String str, SpotifyItem spotifyItem, SpotifyEpisode spotifyEpisode, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotifyRecentlyPlayedItem.playedAt;
        }
        if ((i & 2) != 0) {
            spotifyItem = spotifyRecentlyPlayedItem.track;
        }
        if ((i & 4) != 0) {
            spotifyEpisode = spotifyRecentlyPlayedItem.episode;
        }
        return spotifyRecentlyPlayedItem.copy(str, spotifyItem, spotifyEpisode);
    }

    @SerialName("played_at")
    public static /* synthetic */ void getPlayedAt$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getPlayedAt() {
        return this.playedAt;
    }

    /* renamed from: component2, reason: from getter */
    public final SpotifyItem getTrack() {
        return this.track;
    }

    /* renamed from: component3, reason: from getter */
    public final SpotifyEpisode getEpisode() {
        return this.episode;
    }

    public final SpotifyRecentlyPlayedItem copy(String playedAt, SpotifyItem track, SpotifyEpisode episode) {
        return new SpotifyRecentlyPlayedItem(playedAt, track, episode);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyRecentlyPlayedItem)) {
            return false;
        }
        SpotifyRecentlyPlayedItem spotifyRecentlyPlayedItem = (SpotifyRecentlyPlayedItem) other;
        return Intrinsics.areEqual(this.playedAt, spotifyRecentlyPlayedItem.playedAt) && Intrinsics.areEqual(this.track, spotifyRecentlyPlayedItem.track) && Intrinsics.areEqual(this.episode, spotifyRecentlyPlayedItem.episode);
    }

    public int hashCode() {
        String str = this.playedAt;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        SpotifyItem spotifyItem = this.track;
        int hashCode2 = (hashCode + (spotifyItem == null ? 0 : spotifyItem.hashCode())) * 31;
        SpotifyEpisode spotifyEpisode = this.episode;
        return hashCode2 + (spotifyEpisode != null ? spotifyEpisode.hashCode() : 0);
    }

    public String toString() {
        return "SpotifyRecentlyPlayedItem(playedAt=" + this.playedAt + ", track=" + this.track + ", episode=" + this.episode + ")";
    }

    /* compiled from: SpotifyRecentlyPlayed.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/spotify/SpotifyRecentlyPlayedItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/spotify/SpotifyRecentlyPlayedItem;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotifyRecentlyPlayedItem> serializer() {
            return SpotifyRecentlyPlayedItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotifyRecentlyPlayedItem(int i, String str, SpotifyItem spotifyItem, SpotifyEpisode spotifyEpisode, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.playedAt = null;
        } else {
            this.playedAt = str;
        }
        if ((i & 2) == 0) {
            this.track = null;
        } else {
            this.track = spotifyItem;
        }
        if ((i & 4) == 0) {
            this.episode = null;
        } else {
            this.episode = spotifyEpisode;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(SpotifyRecentlyPlayedItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.playedAt != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.playedAt);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.track != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, SpotifyItem$$serializer.INSTANCE, self.track);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.episode == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 2, SpotifyEpisode$$serializer.INSTANCE, self.episode);
    }

    public SpotifyRecentlyPlayedItem(String str, SpotifyItem spotifyItem, SpotifyEpisode spotifyEpisode) {
        this.playedAt = str;
        this.track = spotifyItem;
        this.episode = spotifyEpisode;
    }

    public /* synthetic */ SpotifyRecentlyPlayedItem(String str, SpotifyItem spotifyItem, SpotifyEpisode spotifyEpisode, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : spotifyItem, (i & 4) != 0 ? null : spotifyEpisode);
    }

    public final String getPlayedAt() {
        return this.playedAt;
    }

    public final SpotifyItem getTrack() {
        return this.track;
    }

    public final SpotifyEpisode getEpisode() {
        return this.episode;
    }
}
