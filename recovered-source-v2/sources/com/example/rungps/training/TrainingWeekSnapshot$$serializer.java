package com.example.rungps.training;

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
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TrainingWeekSnapshot.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/rungps/training/TrainingWeekSnapshot.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/rungps/training/TrainingWeekSnapshot;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", Values.VECTOR_MAP_VECTORS_KEY, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public /* synthetic */ class TrainingWeekSnapshot$$serializer implements GeneratedSerializer<TrainingWeekSnapshot> {
    public static final int $stable;
    public static final TrainingWeekSnapshot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private TrainingWeekSnapshot$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrainingWeekSnapshot$$serializer trainingWeekSnapshot$$serializer = new TrainingWeekSnapshot$$serializer();
        INSTANCE = trainingWeekSnapshot$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.rungps.training.TrainingWeekSnapshot", trainingWeekSnapshot$$serializer, 10);
        pluginGeneratedSerialDescriptor.addElement("weekStartIso", false);
        pluginGeneratedSerialDescriptor.addElement("weekEndIso", false);
        pluginGeneratedSerialDescriptor.addElement("totalRunKm", false);
        pluginGeneratedSerialDescriptor.addElement("totalGymKg", false);
        pluginGeneratedSerialDescriptor.addElement("sleepNights", false);
        pluginGeneratedSerialDescriptor.addElement("avgSleepHours", true);
        pluginGeneratedSerialDescriptor.addElement("coachHeadline", true);
        pluginGeneratedSerialDescriptor.addElement("coachSummary", true);
        pluginGeneratedSerialDescriptor.addElement("coachWeekLine", true);
        pluginGeneratedSerialDescriptor.addElement("days", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TrainingWeekSnapshot.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, DoubleSerializer.INSTANCE, DoubleSerializer.INSTANCE, IntSerializer.INSTANCE, BuiltinSerializersKt.getNullable(DoubleSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE), kSerializerArr[9]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrainingWeekSnapshot deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        String str;
        String str2;
        String str3;
        int i;
        String str4;
        double d;
        List list;
        Double d2;
        String str5;
        double d3;
        int i2;
        char c;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        kSerializerArr = TrainingWeekSnapshot.$childSerializers;
        int i3 = 7;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            double decodeDoubleElement = beginStructure.decodeDoubleElement(serialDescriptor, 2);
            double decodeDoubleElement2 = beginStructure.decodeDoubleElement(serialDescriptor, 3);
            int decodeIntElement = beginStructure.decodeIntElement(serialDescriptor, 4);
            Double d4 = (Double) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.INSTANCE, null);
            String str6 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, null);
            String str7 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 7, StringSerializer.INSTANCE, null);
            String str8 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, null);
            list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], null);
            str = str8;
            i = 1023;
            str4 = decodeStringElement2;
            d = decodeDoubleElement;
            d3 = decodeDoubleElement2;
            str5 = decodeStringElement;
            str2 = str7;
            str3 = str6;
            d2 = d4;
            i2 = decodeIntElement;
        } else {
            boolean z = true;
            int i4 = 0;
            String str9 = null;
            List list2 = null;
            String str10 = null;
            String str11 = null;
            double d5 = 0.0d;
            double d6 = 0.0d;
            String str12 = null;
            String str13 = null;
            Double d7 = null;
            int i5 = 0;
            while (z) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z = false;
                    case 0:
                        i5 |= 1;
                        str12 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i3 = 7;
                    case 1:
                        str13 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i5 |= 2;
                        i3 = 7;
                    case 2:
                        d5 = beginStructure.decodeDoubleElement(serialDescriptor, 2);
                        i5 |= 4;
                        i3 = 7;
                    case 3:
                        d6 = beginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i5 |= 8;
                        i3 = 7;
                    case 4:
                        c = 5;
                        i4 = beginStructure.decodeIntElement(serialDescriptor, 4);
                        i5 |= 16;
                        i3 = 7;
                    case 5:
                        c = 5;
                        d7 = (Double) beginStructure.decodeNullableSerializableElement(serialDescriptor, 5, DoubleSerializer.INSTANCE, d7);
                        i5 |= 32;
                        i3 = 7;
                    case 6:
                        str11 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 6, StringSerializer.INSTANCE, str11);
                        i5 |= 64;
                    case 7:
                        str10 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, i3, StringSerializer.INSTANCE, str10);
                        i5 |= 128;
                    case 8:
                        str9 = (String) beginStructure.decodeNullableSerializableElement(serialDescriptor, 8, StringSerializer.INSTANCE, str9);
                        i5 |= 256;
                    case 9:
                        list2 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 9, kSerializerArr[9], list2);
                        i5 |= 512;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            str = str9;
            str2 = str10;
            str3 = str11;
            i = i5;
            str4 = str13;
            d = d5;
            list = list2;
            d2 = d7;
            str5 = str12;
            d3 = d6;
            i2 = i4;
        }
        beginStructure.endStructure(serialDescriptor);
        return new TrainingWeekSnapshot(i, str5, str4, d, d3, i2, d2, str3, str2, str, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, TrainingWeekSnapshot value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        TrainingWeekSnapshot.write$Self$app_sideload(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
