package com.example.rungps.intervals;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.maplibre.turf.TurfConstants;

/* compiled from: CustomPlan.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00052\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/example/rungps/intervals/CustomTarget;", "", "TimeMs", "DistanceM", "SpeedHold", "Companion", "Lcom/example/rungps/intervals/CustomTarget$DistanceM;", "Lcom/example/rungps/intervals/CustomTarget$SpeedHold;", "Lcom/example/rungps/intervals/CustomTarget$TimeMs;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public interface CustomTarget {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    /* compiled from: CustomPlan.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/intervals/CustomTarget$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/intervals/CustomTarget;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        public final KSerializer<CustomTarget> serializer() {
            return new SealedClassSerializer("com.example.rungps.intervals.CustomTarget", Reflection.getOrCreateKotlinClass(CustomTarget.class), new KClass[]{Reflection.getOrCreateKotlinClass(DistanceM.class), Reflection.getOrCreateKotlinClass(SpeedHold.class), Reflection.getOrCreateKotlinClass(TimeMs.class)}, new KSerializer[]{CustomTarget$DistanceM$$serializer.INSTANCE, CustomTarget$SpeedHold$$serializer.INSTANCE, CustomTarget$TimeMs$$serializer.INSTANCE}, new Annotation[0]);
        }
    }

    /* compiled from: CustomPlan.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/example/rungps/intervals/CustomTarget$TimeMs;", "Lcom/example/rungps/intervals/CustomTarget;", "ms", "", "<init>", "(J)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMs", "()J", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @SerialName("timeMs")
    public static final /* data */ class TimeMs implements CustomTarget {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final long ms;

        public static /* synthetic */ TimeMs copy$default(TimeMs timeMs, long j, int i, Object obj) {
            if ((i & 1) != 0) {
                j = timeMs.ms;
            }
            return timeMs.copy(j);
        }

        /* renamed from: component1, reason: from getter */
        public final long getMs() {
            return this.ms;
        }

        public final TimeMs copy(long ms) {
            return new TimeMs(ms);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof TimeMs) && this.ms == ((TimeMs) other).ms;
        }

        public int hashCode() {
            return Long.hashCode(this.ms);
        }

        public String toString() {
            return "TimeMs(ms=" + this.ms + ")";
        }

        /* compiled from: CustomPlan.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/intervals/CustomTarget$TimeMs$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/intervals/CustomTarget$TimeMs;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<TimeMs> serializer() {
                return CustomTarget$TimeMs$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ TimeMs(int i, long j, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, CustomTarget$TimeMs$$serializer.INSTANCE.getDescriptor());
            }
            this.ms = j;
        }

        public TimeMs(long j) {
            this.ms = j;
        }

        public final long getMs() {
            return this.ms;
        }
    }

    /* compiled from: CustomPlan.kt */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0004\u0010\nJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J%\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0001¢\u0006\u0002\b\u001dR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Lcom/example/rungps/intervals/CustomTarget$DistanceM;", "Lcom/example/rungps/intervals/CustomTarget;", TurfConstants.UNIT_METERS, "", "<init>", "(D)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMeters", "()D", "component1", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @SerialName("distanceM")
    public static final /* data */ class DistanceM implements CustomTarget {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double meters;

        public static /* synthetic */ DistanceM copy$default(DistanceM distanceM, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = distanceM.meters;
            }
            return distanceM.copy(d);
        }

        /* renamed from: component1, reason: from getter */
        public final double getMeters() {
            return this.meters;
        }

        public final DistanceM copy(double meters) {
            return new DistanceM(meters);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof DistanceM) && Double.compare(this.meters, ((DistanceM) other).meters) == 0;
        }

        public int hashCode() {
            return Double.hashCode(this.meters);
        }

        public String toString() {
            return "DistanceM(meters=" + this.meters + ")";
        }

        /* compiled from: CustomPlan.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/intervals/CustomTarget$DistanceM$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/intervals/CustomTarget$DistanceM;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<DistanceM> serializer() {
                return CustomTarget$DistanceM$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DistanceM(int i, double d, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                PluginExceptionsKt.throwMissingFieldException(i, 1, CustomTarget$DistanceM$$serializer.INSTANCE.getDescriptor());
            }
            this.meters = d;
        }

        public DistanceM(double d) {
            this.meters = d;
        }

        public final double getMeters() {
            return this.meters;
        }
    }

    /* compiled from: CustomPlan.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B+\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006%"}, d2 = {"Lcom/example/rungps/intervals/CustomTarget$SpeedHold;", "Lcom/example/rungps/intervals/CustomTarget;", "ms", "", "kmh", "", "<init>", "(JD)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IJDLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getMs", "()J", "getKmh", "()D", "component1", "component2", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    @SerialName("speedHold")
    public static final /* data */ class SpeedHold implements CustomTarget {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final double kmh;
        private final long ms;

        public static /* synthetic */ SpeedHold copy$default(SpeedHold speedHold, long j, double d, int i, Object obj) {
            if ((i & 1) != 0) {
                j = speedHold.ms;
            }
            if ((i & 2) != 0) {
                d = speedHold.kmh;
            }
            return speedHold.copy(j, d);
        }

        /* renamed from: component1, reason: from getter */
        public final long getMs() {
            return this.ms;
        }

        /* renamed from: component2, reason: from getter */
        public final double getKmh() {
            return this.kmh;
        }

        public final SpeedHold copy(long ms, double kmh) {
            return new SpeedHold(ms, kmh);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SpeedHold)) {
                return false;
            }
            SpeedHold speedHold = (SpeedHold) other;
            return this.ms == speedHold.ms && Double.compare(this.kmh, speedHold.kmh) == 0;
        }

        public int hashCode() {
            return (Long.hashCode(this.ms) * 31) + Double.hashCode(this.kmh);
        }

        public String toString() {
            return "SpeedHold(ms=" + this.ms + ", kmh=" + this.kmh + ")";
        }

        /* compiled from: CustomPlan.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/intervals/CustomTarget$SpeedHold$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/intervals/CustomTarget$SpeedHold;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<SpeedHold> serializer() {
                return CustomTarget$SpeedHold$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ SpeedHold(int i, long j, double d, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, CustomTarget$SpeedHold$$serializer.INSTANCE.getDescriptor());
            }
            this.ms = j;
            this.kmh = d;
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$app_sideload(SpeedHold self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeLongElement(serialDesc, 0, self.ms);
            output.encodeDoubleElement(serialDesc, 1, self.kmh);
        }

        public SpeedHold(long j, double d) {
            this.ms = j;
            this.kmh = d;
        }

        public final double getKmh() {
            return this.kmh;
        }

        public final long getMs() {
            return this.ms;
        }
    }
}
