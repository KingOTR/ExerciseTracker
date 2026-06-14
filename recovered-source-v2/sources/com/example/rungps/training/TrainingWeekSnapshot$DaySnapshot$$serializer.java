package com.example.rungps.training;

import com.example.rungps.training.TrainingWeekSnapshot;
import com.google.firebase.firestore.model.Values;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TrainingWeekSnapshot.kt */
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0015\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006¢\u0006\u0002\u0010\bJ\u000e\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bJ\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002R\u0011\u0010\u0011\u001a\u00020\u0012¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"com/example/rungps/training/TrainingWeekSnapshot.DaySnapshot.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/example/rungps/training/TrainingWeekSnapshot$DaySnapshot;", "<init>", "()V", "childSerializers", "", "Lkotlinx/serialization/KSerializer;", "()[Lkotlinx/serialization/KSerializer;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", Values.VECTOR_MAP_VECTORS_KEY, "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly")
/* loaded from: classes3.dex */
public /* synthetic */ class TrainingWeekSnapshot$DaySnapshot$$serializer implements GeneratedSerializer<TrainingWeekSnapshot.DaySnapshot> {
    public static final int $stable;
    public static final TrainingWeekSnapshot$DaySnapshot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    private TrainingWeekSnapshot$DaySnapshot$$serializer() {
    }

    @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.SerializationStrategy, kotlinx.serialization.DeserializationStrategy
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    static {
        TrainingWeekSnapshot$DaySnapshot$$serializer trainingWeekSnapshot$DaySnapshot$$serializer = new TrainingWeekSnapshot$DaySnapshot$$serializer();
        INSTANCE = trainingWeekSnapshot$DaySnapshot$$serializer;
        $stable = 8;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.example.rungps.training.TrainingWeekSnapshot.DaySnapshot", trainingWeekSnapshot$DaySnapshot$$serializer, 6);
        pluginGeneratedSerialDescriptor.addElement("dayLabel", false);
        pluginGeneratedSerialDescriptor.addElement("dateIso", false);
        pluginGeneratedSerialDescriptor.addElement("isToday", true);
        pluginGeneratedSerialDescriptor.addElement("runKm", false);
        pluginGeneratedSerialDescriptor.addElement("gymTonnageKg", false);
        pluginGeneratedSerialDescriptor.addElement("events", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public final KSerializer<?>[] childSerializers() {
        KSerializer<?>[] kSerializerArr;
        kSerializerArr = TrainingWeekSnapshot.DaySnapshot.$childSerializers;
        return new KSerializer[]{StringSerializer.INSTANCE, StringSerializer.INSTANCE, BooleanSerializer.INSTANCE, DoubleSerializer.INSTANCE, DoubleSerializer.INSTANCE, kSerializerArr[5]};
    }

    @Override // kotlinx.serialization.DeserializationStrategy
    public final TrainingWeekSnapshot.DaySnapshot deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        List list;
        double d;
        double d2;
        String str;
        String str2;
        boolean z;
        int i;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptor);
        kSerializerArr = TrainingWeekSnapshot.DaySnapshot.$childSerializers;
        if (beginStructure.decodeSequentially()) {
            String decodeStringElement = beginStructure.decodeStringElement(serialDescriptor, 0);
            String decodeStringElement2 = beginStructure.decodeStringElement(serialDescriptor, 1);
            boolean decodeBooleanElement = beginStructure.decodeBooleanElement(serialDescriptor, 2);
            double decodeDoubleElement = beginStructure.decodeDoubleElement(serialDescriptor, 3);
            double decodeDoubleElement2 = beginStructure.decodeDoubleElement(serialDescriptor, 4);
            list = (List) beginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], null);
            d2 = decodeDoubleElement2;
            z = decodeBooleanElement;
            str2 = decodeStringElement2;
            d = decodeDoubleElement;
            str = decodeStringElement;
            i = 63;
        } else {
            double d3 = 0.0d;
            boolean z2 = true;
            boolean z3 = false;
            String str3 = null;
            String str4 = null;
            List list2 = null;
            double d4 = 0.0d;
            int i2 = 0;
            while (z2) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptor);
                switch (decodeElementIndex) {
                    case -1:
                        z2 = false;
                        continue;
                    case 0:
                        str3 = beginStructure.decodeStringElement(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        str4 = beginStructure.decodeStringElement(serialDescriptor, 1);
                        i2 |= 2;
                        break;
                    case 2:
                        z3 = beginStructure.decodeBooleanElement(serialDescriptor, 2);
                        i2 |= 4;
                        break;
                    case 3:
                        d4 = beginStructure.decodeDoubleElement(serialDescriptor, 3);
                        i2 |= 8;
                        break;
                    case 4:
                        d3 = beginStructure.decodeDoubleElement(serialDescriptor, 4);
                        i2 |= 16;
                        break;
                    case 5:
                        list2 = (List) beginStructure.decodeSerializableElement(serialDescriptor, 5, kSerializerArr[5], list2);
                        i2 |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(decodeElementIndex);
                }
            }
            list = list2;
            d = d4;
            d2 = d3;
            str = str3;
            str2 = str4;
            z = z3;
            i = i2;
        }
        beginStructure.endStructure(serialDescriptor);
        return new TrainingWeekSnapshot.DaySnapshot(i, str, str2, z, d, d2, list, (SerializationConstructorMarker) null);
    }

    @Override // kotlinx.serialization.SerializationStrategy
    public final void serialize(Encoder encoder, TrainingWeekSnapshot.DaySnapshot value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerialDescriptor serialDescriptor = descriptor;
        CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptor);
        TrainingWeekSnapshot.DaySnapshot.write$Self$app_sideload(value, beginStructure, serialDescriptor);
        beginStructure.endStructure(serialDescriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer<?>[] typeParametersSerializers() {
        return GeneratedSerializer.DefaultImpls.typeParametersSerializers(this);
    }
}
