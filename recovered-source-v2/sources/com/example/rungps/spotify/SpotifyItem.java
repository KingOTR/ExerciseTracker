package com.example.rungps.spotify;

import androidx.autofill.HintConstants;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SpotifyWebApi.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 =2\u00020\u0001:\u0002<=Bg\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\u0004\b\u0010\u0010\u0011Bm\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0010\u0010\u0016J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001dJ\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\rHÆ\u0003J\u0011\u0010,\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bHÆ\u0003Jn\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0010\b\u0002\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010.J\u0013\u0010/\u001a\u0002002\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u00020\u0013HÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001J%\u00104\u001a\u0002052\u0006\u00106\u001a\u00020\u00002\u0006\u00107\u001a\u0002082\u0006\u00109\u001a\u00020:H\u0001¢\u0006\u0002\b;R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001e\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010 ¨\u0006>"}, d2 = {"Lcom/example/rungps/spotify/SpotifyItem;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "durationMs", "", "artists", "", "Lcom/example/rungps/spotify/SpotifyArtist;", "album", "Lcom/example/rungps/spotify/SpotifyAlbum;", "show", "Lcom/example/rungps/spotify/SpotifyShow;", "images", "Lcom/example/rungps/spotify/SpotifyImage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/example/rungps/spotify/SpotifyAlbum;Lcom/example/rungps/spotify/SpotifyShow;Ljava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/example/rungps/spotify/SpotifyAlbum;Lcom/example/rungps/spotify/SpotifyShow;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "getDurationMs$annotations", "()V", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getArtists", "()Ljava/util/List;", "getAlbum", "()Lcom/example/rungps/spotify/SpotifyAlbum;", "getShow", "()Lcom/example/rungps/spotify/SpotifyShow;", "getImages", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/example/rungps/spotify/SpotifyAlbum;Lcom/example/rungps/spotify/SpotifyShow;Ljava/util/List;)Lcom/example/rungps/spotify/SpotifyItem;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class SpotifyItem {
    private final SpotifyAlbum album;
    private final List<SpotifyArtist> artists;
    private final Long durationMs;
    private final String id;
    private final List<SpotifyImage> images;
    private final String name;
    private final SpotifyShow show;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(SpotifyArtist$$serializer.INSTANCE), null, null, new ArrayListSerializer(SpotifyImage$$serializer.INSTANCE)};

    public SpotifyItem() {
        this((String) null, (String) null, (Long) null, (List) null, (SpotifyAlbum) null, (SpotifyShow) null, (List) null, 127, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SpotifyItem copy$default(SpotifyItem spotifyItem, String str, String str2, Long l, List list, SpotifyAlbum spotifyAlbum, SpotifyShow spotifyShow, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotifyItem.id;
        }
        if ((i & 2) != 0) {
            str2 = spotifyItem.name;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            l = spotifyItem.durationMs;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            list = spotifyItem.artists;
        }
        List list3 = list;
        if ((i & 16) != 0) {
            spotifyAlbum = spotifyItem.album;
        }
        SpotifyAlbum spotifyAlbum2 = spotifyAlbum;
        if ((i & 32) != 0) {
            spotifyShow = spotifyItem.show;
        }
        SpotifyShow spotifyShow2 = spotifyShow;
        if ((i & 64) != 0) {
            list2 = spotifyItem.images;
        }
        return spotifyItem.copy(str, str3, l2, list3, spotifyAlbum2, spotifyShow2, list2);
    }

    @SerialName("duration_ms")
    public static /* synthetic */ void getDurationMs$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final List<SpotifyArtist> component4() {
        return this.artists;
    }

    /* renamed from: component5, reason: from getter */
    public final SpotifyAlbum getAlbum() {
        return this.album;
    }

    /* renamed from: component6, reason: from getter */
    public final SpotifyShow getShow() {
        return this.show;
    }

    public final List<SpotifyImage> component7() {
        return this.images;
    }

    public final SpotifyItem copy(String id, String name, Long durationMs, List<SpotifyArtist> artists, SpotifyAlbum album, SpotifyShow show, List<SpotifyImage> images) {
        return new SpotifyItem(id, name, durationMs, artists, album, show, images);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyItem)) {
            return false;
        }
        SpotifyItem spotifyItem = (SpotifyItem) other;
        return Intrinsics.areEqual(this.id, spotifyItem.id) && Intrinsics.areEqual(this.name, spotifyItem.name) && Intrinsics.areEqual(this.durationMs, spotifyItem.durationMs) && Intrinsics.areEqual(this.artists, spotifyItem.artists) && Intrinsics.areEqual(this.album, spotifyItem.album) && Intrinsics.areEqual(this.show, spotifyItem.show) && Intrinsics.areEqual(this.images, spotifyItem.images);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.durationMs;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<SpotifyArtist> list = this.artists;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SpotifyAlbum spotifyAlbum = this.album;
        int hashCode5 = (hashCode4 + (spotifyAlbum == null ? 0 : spotifyAlbum.hashCode())) * 31;
        SpotifyShow spotifyShow = this.show;
        int hashCode6 = (hashCode5 + (spotifyShow == null ? 0 : spotifyShow.hashCode())) * 31;
        List<SpotifyImage> list2 = this.images;
        return hashCode6 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "SpotifyItem(id=" + this.id + ", name=" + this.name + ", durationMs=" + this.durationMs + ", artists=" + this.artists + ", album=" + this.album + ", show=" + this.show + ", images=" + this.images + ")";
    }

    /* compiled from: SpotifyWebApi.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/spotify/SpotifyItem$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/spotify/SpotifyItem;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotifyItem> serializer() {
            return SpotifyItem$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotifyItem(int i, String str, String str2, Long l, List list, SpotifyAlbum spotifyAlbum, SpotifyShow spotifyShow, List list2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.id = null;
        } else {
            this.id = str;
        }
        if ((i & 2) == 0) {
            this.name = null;
        } else {
            this.name = str2;
        }
        if ((i & 4) == 0) {
            this.durationMs = null;
        } else {
            this.durationMs = l;
        }
        if ((i & 8) == 0) {
            this.artists = null;
        } else {
            this.artists = list;
        }
        if ((i & 16) == 0) {
            this.album = null;
        } else {
            this.album = spotifyAlbum;
        }
        if ((i & 32) == 0) {
            this.show = null;
        } else {
            this.show = spotifyShow;
        }
        if ((i & 64) == 0) {
            this.images = null;
        } else {
            this.images = list2;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(SpotifyItem self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        if (output.shouldEncodeElementDefault(serialDesc, 0) || self.id != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, StringSerializer.INSTANCE, self.id);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.name != null) {
            output.encodeNullableSerializableElement(serialDesc, 1, StringSerializer.INSTANCE, self.name);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.durationMs != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, LongSerializer.INSTANCE, self.durationMs);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.artists != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.artists);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 4) || self.album != null) {
            output.encodeNullableSerializableElement(serialDesc, 4, SpotifyAlbum$$serializer.INSTANCE, self.album);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.show != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, SpotifyShow$$serializer.INSTANCE, self.show);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 6) && self.images == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 6, kSerializerArr[6], self.images);
    }

    public SpotifyItem(String str, String str2, Long l, List<SpotifyArtist> list, SpotifyAlbum spotifyAlbum, SpotifyShow spotifyShow, List<SpotifyImage> list2) {
        this.id = str;
        this.name = str2;
        this.durationMs = l;
        this.artists = list;
        this.album = spotifyAlbum;
        this.show = spotifyShow;
        this.images = list2;
    }

    public /* synthetic */ SpotifyItem(String str, String str2, Long l, List list, SpotifyAlbum spotifyAlbum, SpotifyShow spotifyShow, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : spotifyAlbum, (i & 32) != 0 ? null : spotifyShow, (i & 64) != 0 ? null : list2);
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getDurationMs() {
        return this.durationMs;
    }

    public final List<SpotifyArtist> getArtists() {
        return this.artists;
    }

    public final SpotifyAlbum getAlbum() {
        return this.album;
    }

    public final SpotifyShow getShow() {
        return this.show;
    }

    public final List<SpotifyImage> getImages() {
        return this.images;
    }
}
