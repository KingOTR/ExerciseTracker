package com.example.rungps.spotify;

import androidx.autofill.HintConstants;
import com.google.firebase.firestore.model.Values;
import java.util.List;
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
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: SpotifyWebApi.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/rungps/spotify/SpotifyItem.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/rungps/spotify/SpotifyItem;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", Values.VECTOR_MAP_VECTORS_KEY, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public /* synthetic */ class SpotifyItem$$serializer implements GeneratedSerializer<SpotifyItem> {
    public static final int $stable;
    public static final SpotifyItem$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private SpotifyItem$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        SpotifyItem$$serializer spotifyItem$$serializer = new SpotifyItem$$serializer();
        INSTANCE = spotifyItem$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.rungps.spotify.SpotifyItem", spotifyItem$$serializer, 7);
        pluginGeneratedSerialDescriptor.addElement("id", true);
        pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("duration_ms", true);
        pluginGeneratedSerialDescriptor.addElement("artists", true);
        pluginGeneratedSerialDescriptor.addElement("album", true);
        pluginGeneratedSerialDescriptor.addElement("show", true);
        pluginGeneratedSerialDescriptor.addElement("images", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = SpotifyItem.$childSerializers;
        return new KSerializer[]{BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(LongSerializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[3]), BuiltinSerializersKt.getNullable(SpotifyAlbum$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(SpotifyShow$$serializer.INSTANCE), BuiltinSerializersKt.getNullable(kSerializerArr[6])};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final SpotifyItem deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        int i;
        List list;
        String str;
        Long l;
        SpotifyAlbum spotifyAlbum;
        SpotifyShow spotifyShow;
        String str2;
        List list2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        kSerializerArr = SpotifyItem.$childSerializers;
        int i2 = 5;
        String str3 = null;
        if (beginStructure.decodeSequentially()) {
            String str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, null);
            String str5 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            Long l2 = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, null);
            List list3 = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], null);
            SpotifyAlbum spotifyAlbum2 = (SpotifyAlbum) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SpotifyAlbum$$serializer.INSTANCE, null);
            SpotifyShow spotifyShow2 = (SpotifyShow) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, SpotifyShow$$serializer.INSTANCE, null);
            list = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], null);
            spotifyShow = spotifyShow2;
            spotifyAlbum = spotifyAlbum2;
            l = l2;
            list2 = list3;
            str2 = str5;
            str = str4;
            i = 127;
        } else {
            boolean z = true;
            int i3 = 0;
            List list4 = null;
            SpotifyShow spotifyShow3 = null;
            String str6 = null;
            Long l3 = null;
            List list5 = null;
            SpotifyAlbum spotifyAlbum3 = null;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i2 = 5;
                    case 0:
                        str3 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 0, StringSerializer.INSTANCE, str3);
                        i3 |= 1;
                        i2 = 5;
                    case 1:
                        str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str6);
                        i3 |= 2;
                        i2 = 5;
                    case 2:
                        l3 = (Long) beginStructure.decodeNullableSerializableElement(serialDescriptor, 2, LongSerializer.INSTANCE, l3);
                        i3 |= 4;
                        i2 = 5;
                    case 3:
                        list5 = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 3, kSerializerArr[3], list5);
                        i3 |= 8;
                    case 4:
                        spotifyAlbum3 = (SpotifyAlbum) beginStructure.decodeNullableSerializableElement(serialDescriptor, 4, SpotifyAlbum$$serializer.INSTANCE, spotifyAlbum3);
                        i3 |= 16;
                    case 5:
                        spotifyShow3 = (SpotifyShow) beginStructure.decodeNullableSerializableElement(serialDescriptor, i2, SpotifyShow$$serializer.INSTANCE, spotifyShow3);
                        i3 |= 32;
                    case 6:
                        list4 = (List) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, kSerializerArr[6], list4);
                        i3 |= 64;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            i = i3;
            SpotifyAlbum spotifyAlbum4 = spotifyAlbum3;
            list = list4;
            str = str3;
            l = l3;
            spotifyAlbum = spotifyAlbum4;
            List list6 = list5;
            spotifyShow = spotifyShow3;
            str2 = str6;
            list2 = list6;
        }
        beginStructure.endStructure(serialDescriptor);
        return new SpotifyItem(i, str, str2, l, list2, spotifyAlbum, spotifyShow, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, SpotifyItem value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        SpotifyItem.write$Self$app_sideload(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
