package com.example.rungps.spotify;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.caverock.androidsvg.SVGParser;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SpotifyWebApi.kt */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\n\u0010\u0010J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J<\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010#J\u0013\u0010$\u001a\u00020\u00032\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\rHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0002\u0010\u0013R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0012\u001a\u0004\b\u001c\u0010\u001d¨\u00062"}, d2 = {"Lcom/example/rungps/spotify/SpotifyNowPlaying;", "", "isPlaying", "", SVGParser.XML_STYLESHEET_ATTR_TYPE, "", "progressMs", "", "item", "Lcom/example/rungps/spotify/SpotifyItem;", "<init>", "(ZLjava/lang/String;Ljava/lang/Long;Lcom/example/rungps/spotify/SpotifyItem;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;Ljava/lang/Long;Lcom/example/rungps/spotify/SpotifyItem;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "isPlaying$annotations", "()V", "()Z", "getType$annotations", "getType", "()Ljava/lang/String;", "getProgressMs$annotations", "getProgressMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getItem$annotations", "getItem", "()Lcom/example/rungps/spotify/SpotifyItem;", "component1", "component2", "component3", "component4", "copy", "(ZLjava/lang/String;Ljava/lang/Long;Lcom/example/rungps/spotify/SpotifyItem;)Lcom/example/rungps/spotify/SpotifyNowPlaying;", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class SpotifyNowPlaying {
    private final boolean isPlaying;
    private final SpotifyItem item;
    private final Long progressMs;
    private final String type;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public SpotifyNowPlaying() {
        this(false, (String) null, (Long) null, (SpotifyItem) null, 15, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SpotifyNowPlaying copy$default(SpotifyNowPlaying spotifyNowPlaying, boolean z, String str, Long l, SpotifyItem spotifyItem, int i, Object obj) {
        if ((i & 1) != 0) {
            z = spotifyNowPlaying.isPlaying;
        }
        if ((i & 2) != 0) {
            str = spotifyNowPlaying.type;
        }
        if ((i & 4) != 0) {
            l = spotifyNowPlaying.progressMs;
        }
        if ((i & 8) != 0) {
            spotifyItem = spotifyNowPlaying.item;
        }
        return spotifyNowPlaying.copy(z, str, l, spotifyItem);
    }

    @SerialName("item")
    public static /* synthetic */ void getItem$annotations() {
    }

    @SerialName("progress_ms")
    public static /* synthetic */ void getProgressMs$annotations() {
    }

    @SerialName("currently_playing_type")
    public static /* synthetic */ void getType$annotations() {
    }

    @SerialName("is_playing")
    public static /* synthetic */ void isPlaying$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsPlaying() {
        return this.isPlaying;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getProgressMs() {
        return this.progressMs;
    }

    /* renamed from: component4, reason: from getter */
    public final SpotifyItem getItem() {
        return this.item;
    }

    public final SpotifyNowPlaying copy(boolean isPlaying, String type, Long progressMs, SpotifyItem item) {
        return new SpotifyNowPlaying(isPlaying, type, progressMs, item);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyNowPlaying)) {
            return false;
        }
        SpotifyNowPlaying spotifyNowPlaying = (SpotifyNowPlaying) other;
        return this.isPlaying == spotifyNowPlaying.isPlaying && Intrinsics.areEqual(this.type, spotifyNowPlaying.type) && Intrinsics.areEqual(this.progressMs, spotifyNowPlaying.progressMs) && Intrinsics.areEqual(this.item, spotifyNowPlaying.item);
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.isPlaying) * 31;
        String str = this.type;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l = this.progressMs;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        SpotifyItem spotifyItem = this.item;
        return hashCode3 + (spotifyItem != null ? spotifyItem.hashCode() : 0);
    }

    public String toString() {
        return "SpotifyNowPlaying(isPlaying=" + this.isPlaying + ", type=" + this.type + ", progressMs=" + this.progressMs + ", item=" + this.item + ")";
    }

    /* compiled from: SpotifyWebApi.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/spotify/SpotifyNowPlaying$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/spotify/SpotifyNowPlaying;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotifyNowPlaying> serializer() {
            return SpotifyNowPlaying$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotifyNowPlaying(int i, boolean z, String str, Long l, SpotifyItem spotifyItem, SerializationConstructorMarker serializationConstructorMarker) {
        this.isPlaying = (i & 1) == 0 ? false : z;
        if ((i & 2) == 0) {
            this.type = null;
        } else {
            this.type = str;
        }
        if ((i & 4) == 0) {
            this.progressMs = null;
        } else {
            this.progressMs = l;
        }
        if ((i & 8) == 0) {
            this.item = null;
        } else {
            this.item = spotifyItem;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(SpotifyNowPlaying self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.isPlaying) {
            output.encodeBooleanElement(serialDesc, 0, self.isPlaying);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.type != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.type);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.progressMs != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.progressMs);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.item == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, SpotifyItem$$serializer.INSTANCE, self.item);
    }

    public SpotifyNowPlaying(boolean z, String str, Long l, SpotifyItem spotifyItem) {
        this.isPlaying = z;
        this.type = str;
        this.progressMs = l;
        this.item = spotifyItem;
    }

    public /* synthetic */ SpotifyNowPlaying(boolean z, String str, Long l, SpotifyItem spotifyItem, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : spotifyItem);
    }

    public final boolean isPlaying() {
        return this.isPlaying;
    }

    public final String getType() {
        return this.type;
    }

    public final Long getProgressMs() {
        return this.progressMs;
    }

    public final SpotifyItem getItem() {
        return this.item;
    }
}
