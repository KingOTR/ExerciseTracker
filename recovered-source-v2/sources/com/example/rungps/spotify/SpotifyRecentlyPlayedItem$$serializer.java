package com.example.rungps.spotify;

import com.google.firebase.firestore.model.Values;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SpotifyRecentlyPlayed.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/rungps/spotify/SpotifyRecentlyPlayedItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/rungps/spotify/SpotifyRecentlyPlayedItem;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", Values.VECTOR_MAP_VECTORS_KEY, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public /* synthetic */ class SpotifyRecentlyPlayedItem$$serializer implements GeneratedSerializer<SpotifyRecentlyPlayedItem> {
    public static final int $stable;
    public static final SpotifyRecentlyPlayedItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SpotifyRecentlyPlayedItem$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpotifyRecentlyPlayedItem$$serializer spotifyRecentlyPlayedItem$$serializer = new SpotifyRecentlyPlayedItem$$serializer();
        INSTANCE = spotifyRecentlyPlayedItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.rungps.spotify.SpotifyRecentlyPlayedItem", spotifyRecentlyPlayedItem$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement("played_at", true);
        pluginGeneratedSerialDescriptor.addElement("track", true);
        pluginGeneratedSerialDescriptor.addElement("episode", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(SpotifyItem$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SpotifyEpisode$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpotifyRecentlyPlayedItem deserialize(Decoder decoder) {
        int i;
        String str;
        SpotifyItem spotifyItem;
        SpotifyEpisode spotifyEpisode;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        String str2 = null;
        if (beginStructure.decodeSequentially()) {
            String str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            SpotifyItem spotifyItem2 = (SpotifyItem) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SpotifyItem$$serializer.INSTANCE, null);
            str = str3;
            spotifyEpisode = (SpotifyEpisode) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SpotifyEpisode$$serializer.INSTANCE, null);
            spotifyItem = spotifyItem2;
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            SpotifyItem spotifyItem3 = null;
            SpotifyEpisode spotifyEpisode2 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                if (decodeElementIndex == -1) {
                    z = false;
                } else if (decodeElementIndex == 0) {
                    str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str2);
                    i2 |= 1;
                } else if (decodeElementIndex == 1) {
                    spotifyItem3 = (SpotifyItem) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, SpotifyItem$$serializer.INSTANCE, spotifyItem3);
                    i2 |= 2;
                } else {
                    if (decodeElementIndex != 2) {
                        throw new UnknownFieldException(decodeElementIndex);
                    }
                    spotifyEpisode2 = (SpotifyEpisode) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, SpotifyEpisode$$serializer.INSTANCE, spotifyEpisode2);
                    i2 |= 4;
                }
            }
            i = i2;
            str = str2;
            spotifyItem = spotifyItem3;
            spotifyEpisode = spotifyEpisode2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new SpotifyRecentlyPlayedItem(i, str, spotifyItem, spotifyEpisode, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, SpotifyRecentlyPlayedItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        SpotifyRecentlyPlayedItem.write$Self$app_sideload(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
