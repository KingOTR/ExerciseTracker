package com.example.rungps.strava;

import androidx.autofill.HintConstants;
import com.caverock.androidsvg.SVGParser;
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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.LongSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: StravaActivitiesApi.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/rungps/strava/StravaActivityJson.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/rungps/strava/StravaActivityJson;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", Values.VECTOR_MAP_VECTORS_KEY, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public /* synthetic */ class StravaActivityJson$$serializer implements GeneratedSerializer<StravaActivityJson> {
    public static final int $stable;
    public static final StravaActivityJson$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private StravaActivityJson$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        StravaActivityJson$$serializer stravaActivityJson$$serializer = new StravaActivityJson$$serializer();
        INSTANCE = stravaActivityJson$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.rungps.strava.StravaActivityJson", stravaActivityJson$$serializer, 9);
        pluginGeneratedSerialDescriptor.addElement("id", false);
        pluginGeneratedSerialDescriptor.addElement(HintConstants.AUTOFILL_HINT_NAME, true);
        pluginGeneratedSerialDescriptor.addElement("distance", true);
        pluginGeneratedSerialDescriptor.addElement("moving_time", true);
        pluginGeneratedSerialDescriptor.addElement("elapsed_time", true);
        pluginGeneratedSerialDescriptor.addElement(SVGParser.XML_STYLESHEET_ATTR_TYPE, true);
        pluginGeneratedSerialDescriptor.addElement("sport_type", true);
        pluginGeneratedSerialDescriptor.addElement("start_date", true);
        pluginGeneratedSerialDescriptor.addElement("start_date_local", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        return new KSerializer[]{LongSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), DoubleSerializer.INSTANCE, IntSerializer.INSTANCE, IntSerializer.INSTANCE, StringSerializer.INSTANCE, BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final StravaActivityJson deserialize(Decoder decoder) {
        String str;
        String str2;
        int i;
        int i2;
        String str3;
        long j;
        String str4;
        int i3;
        double d;
        String str5;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        int i4 = 7;
        int i5 = 6;
        if (beginStructure.decodeSequentially()) {
            long decodeLongElement = beginStructure.decodeLongElement(serialDescriptor, 0);
            String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, null);
            double decodeDoubleElement = beginStructure.decodeDoubleElement(serialDescriptor, 2);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 3);
            int decodeIntElement2 = beginStructure.decodeIntElement(serialDescriptor, 4);
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 5);
            String str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            str2 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            str3 = str7;
            str5 = decodeStringElement;
            str4 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, null);
            i3 = decodeIntElement2;
            i = 511;
            str = str6;
            i2 = decodeIntElement;
            d = decodeDoubleElement;
            j = decodeLongElement;
        } else {
            double d2 = 0.0d;
            boolean z = true;
            int i6 = 0;
            String str8 = null;
            String str9 = null;
            String str10 = null;
            long j2 = 0;
            int i7 = 0;
            String str11 = null;
            str = null;
            int i8 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                        i4 = 7;
                    case 0:
                        j2 = beginStructure.decodeLongElement(serialDescriptor, 0);
                        i7 |= 1;
                        i4 = 7;
                        i5 = 6;
                    case 1:
                        str = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 1, StringSerializer.INSTANCE, str);
                        i7 |= 2;
                        i4 = 7;
                        i5 = 6;
                    case 2:
                        i7 |= 4;
                        d2 = beginStructure.decodeDoubleElement(serialDescriptor, 2);
                    case 3:
                        i6 = beginStructure.decodeIntElement(serialDescriptor, 3);
                        i7 |= 8;
                    case 4:
                        i8 = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i7 |= 16;
                    case 5:
                        str10 = beginStructure.decodeStringElement(serialDescriptor, 5);
                        i7 |= 32;
                    case 6:
                        str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i5, StringSerializer.INSTANCE, str9);
                        i7 |= 64;
                    case 7:
                        str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i4, StringSerializer.INSTANCE, str8);
                        i7 |= 128;
                    case 8:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str11);
                        i7 |= 256;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str2 = str8;
            i = i7;
            String str12 = str11;
            i2 = i6;
            String str13 = str10;
            str3 = str9;
            j = j2;
            str4 = str12;
            double d3 = d2;
            i3 = i8;
            d = d3;
            str5 = str13;
        }
        beginStructure.endStructure(serialDescriptor);
        return new StravaActivityJson(i, j, str, d, i2, i3, str5, str3, str2, str4, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, StravaActivityJson value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        StravaActivityJson.write$Self$app_sideload(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
