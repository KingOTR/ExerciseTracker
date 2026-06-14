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

/* compiled from: SpotifyRecentlyPlayed.kt */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 42\u00020\u0001:\u000234BI\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rBS\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\f\u0010\u0012J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003JP\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010%J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020\u000fHÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J%\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00002\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u000201H\u0001¢\u0006\u0002\b2R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001a\u0012\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u00065"}, d2 = {"Lcom/example/rungps/spotify/SpotifyEpisode;", "", "id", "", HintConstants.AUTOFILL_HINT_NAME, "durationMs", "", "images", "", "Lcom/example/rungps/spotify/SpotifyImage;", "show", "Lcom/example/rungps/spotify/SpotifyShow;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/example/rungps/spotify/SpotifyShow;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/example/rungps/spotify/SpotifyShow;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getId", "()Ljava/lang/String;", "getName", "getDurationMs$annotations", "()V", "getDurationMs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getImages", "()Ljava/util/List;", "getShow", "()Lcom/example/rungps/spotify/SpotifyShow;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/example/rungps/spotify/SpotifyShow;)Lcom/example/rungps/spotify/SpotifyEpisode;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
final /* data */ class SpotifyEpisode {
    private final Long durationMs;
    private final String id;
    private final List<SpotifyImage> images;
    private final String name;
    private final SpotifyShow show;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, new ArrayListSerializer(SpotifyImage$$serializer.INSTANCE), null};

    public SpotifyEpisode() {
        this((String) null, (String) null, (Long) null, (List) null, (SpotifyShow) null, 31, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SpotifyEpisode copy$default(SpotifyEpisode spotifyEpisode, String str, String str2, Long l, List list, SpotifyShow spotifyShow, int i, Object obj) {
        if ((i & 1) != 0) {
            str = spotifyEpisode.id;
        }
        if ((i & 2) != 0) {
            str2 = spotifyEpisode.name;
        }
        String str3 = str2;
        if ((i & 4) != 0) {
            l = spotifyEpisode.durationMs;
        }
        Long l2 = l;
        if ((i & 8) != 0) {
            list = spotifyEpisode.images;
        }
        List list2 = list;
        if ((i & 16) != 0) {
            spotifyShow = spotifyEpisode.show;
        }
        return spotifyEpisode.copy(str, str3, l2, list2, spotifyShow);
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

    public final List<SpotifyImage> component4() {
        return this.images;
    }

    /* renamed from: component5, reason: from getter */
    public final SpotifyShow getShow() {
        return this.show;
    }

    public final SpotifyEpisode copy(String id, String name, Long durationMs, List<SpotifyImage> images, SpotifyShow show) {
        return new SpotifyEpisode(id, name, durationMs, images, show);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpotifyEpisode)) {
            return false;
        }
        SpotifyEpisode spotifyEpisode = (SpotifyEpisode) other;
        return Intrinsics.areEqual(this.id, spotifyEpisode.id) && Intrinsics.areEqual(this.name, spotifyEpisode.name) && Intrinsics.areEqual(this.durationMs, spotifyEpisode.durationMs) && Intrinsics.areEqual(this.images, spotifyEpisode.images) && Intrinsics.areEqual(this.show, spotifyEpisode.show);
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.durationMs;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        List<SpotifyImage> list = this.images;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        SpotifyShow spotifyShow = this.show;
        return hashCode4 + (spotifyShow != null ? spotifyShow.hashCode() : 0);
    }

    public String toString() {
        return "SpotifyEpisode(id=" + this.id + ", name=" + this.name + ", durationMs=" + this.durationMs + ", images=" + this.images + ", show=" + this.show + ")";
    }

    /* compiled from: SpotifyRecentlyPlayed.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/spotify/SpotifyEpisode$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/spotify/SpotifyEpisode;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SpotifyEpisode> serializer() {
            return SpotifyEpisode$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SpotifyEpisode(int i, String str, String str2, Long l, List list, SpotifyShow spotifyShow, SerializationConstructorMarker serializationConstructorMarker) {
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
            this.images = null;
        } else {
            this.images = list;
        }
        if ((i & 16) == 0) {
            this.show = null;
        } else {
            this.show = spotifyShow;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(SpotifyEpisode self, CompositeEncoder output, SerialDescriptor serialDesc) {
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
        if (output.shouldEncodeElementDefault(serialDesc, 3) || self.images != null) {
            output.encodeNullableSerializableElement(serialDesc, 3, kSerializerArr[3], self.images);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 4) && self.show == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 4, SpotifyShow$$serializer.INSTANCE, self.show);
    }

    public SpotifyEpisode(String str, String str2, Long l, List<SpotifyImage> list, SpotifyShow spotifyShow) {
        this.id = str;
        this.name = str2;
        this.durationMs = l;
        this.images = list;
        this.show = spotifyShow;
    }

    public /* synthetic */ SpotifyEpisode(String str, String str2, Long l, List list, SpotifyShow spotifyShow, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : l, (i & 8) != 0 ? null : list, (i & 16) != 0 ? null : spotifyShow);
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

    public final List<SpotifyImage> getImages() {
        return this.images;
    }

    public final SpotifyShow getShow() {
        return this.show;
    }
}
