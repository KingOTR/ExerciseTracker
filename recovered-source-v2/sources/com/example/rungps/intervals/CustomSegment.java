package com.example.rungps.intervals;

import androidx.health.connect.client.records.Vo2MaxRecord;
import com.example.rungps.intervals.CustomTarget;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: CustomPlan.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \"2\u00020\u0001:\u0002!\"B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\tHÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J%\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/example/rungps/intervals/CustomSegment;", "", "label", "", "target", "Lcom/example/rungps/intervals/CustomTarget;", "<init>", "(Ljava/lang/String;Lcom/example/rungps/intervals/CustomTarget;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/example/rungps/intervals/CustomTarget;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLabel", "()Ljava/lang/String;", "getTarget", "()Lcom/example/rungps/intervals/CustomTarget;", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class CustomSegment {
    private final String label;
    private final CustomTarget target;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, new SealedClassSerializer("com.example.rungps.intervals.CustomTarget", Reflection.getOrCreateKotlinClass(CustomTarget.class), new KClass[]{Reflection.getOrCreateKotlinClass(CustomTarget.DistanceM.class), Reflection.getOrCreateKotlinClass(CustomTarget.SpeedHold.class), Reflection.getOrCreateKotlinClass(CustomTarget.TimeMs.class)}, new KSerializer[]{CustomTarget$DistanceM$$serializer.INSTANCE, CustomTarget$SpeedHold$$serializer.INSTANCE, CustomTarget$TimeMs$$serializer.INSTANCE}, new Annotation[0])};

    public static /* synthetic */ CustomSegment copy$default(CustomSegment customSegment, String str, CustomTarget customTarget, int i, Object obj) {
        if ((i & 1) != 0) {
            str = customSegment.label;
        }
        if ((i & 2) != 0) {
            customTarget = customSegment.target;
        }
        return customSegment.copy(str, customTarget);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* renamed from: component2, reason: from getter */
    public final CustomTarget getTarget() {
        return this.target;
    }

    public final CustomSegment copy(String label, CustomTarget target) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(target, "target");
        return new CustomSegment(label, target);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CustomSegment)) {
            return false;
        }
        CustomSegment customSegment = (CustomSegment) other;
        return Intrinsics.areEqual(this.label, customSegment.label) && Intrinsics.areEqual(this.target, customSegment.target);
    }

    public int hashCode() {
        return (this.label.hashCode() * 31) + this.target.hashCode();
    }

    public String toString() {
        return "CustomSegment(label=" + this.label + ", target=" + this.target + ")";
    }

    /* compiled from: CustomPlan.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/intervals/CustomSegment$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/intervals/CustomSegment;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CustomSegment> serializer() {
            return CustomSegment$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CustomSegment(int i, String str, CustomTarget customTarget, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, CustomSegment$$serializer.INSTANCE.getDescriptor());
        }
        this.label = str;
        this.target = customTarget;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(CustomSegment self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.label);
        output.encodeSerializableElement(serialDesc, 1, kSerializerArr[1], self.target);
    }

    public CustomSegment(String label, CustomTarget target) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(target, "target");
        this.label = label;
        this.target = target;
    }

    public final String getLabel() {
        return this.label;
    }

    public final CustomTarget getTarget() {
        return this.target;
    }
}
