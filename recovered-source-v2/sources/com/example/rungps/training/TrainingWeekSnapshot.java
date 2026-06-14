package com.example.rungps.training;

import androidx.health.connect.client.records.Vo2MaxRecord;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.DoubleSerializer;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TrainingWeekSnapshot.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0004@ABCBo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u007f\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0011\u0010\u0016J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0006HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\tHÆ\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010 J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0003J\u0080\u0001\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fHÆ\u0001¢\u0006\u0002\u00102J\u0013\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u00020\tHÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001J%\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u00002\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>H\u0001¢\u0006\u0002\b?R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010!\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0018R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0018R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u0006D"}, d2 = {"Lcom/example/rungps/training/TrainingWeekSnapshot;", "", "weekStartIso", "", "weekEndIso", "totalRunKm", "", "totalGymKg", "sleepNights", "", "avgSleepHours", "coachHeadline", "coachSummary", "coachWeekLine", "days", "", "Lcom/example/rungps/training/TrainingWeekSnapshot$DaySnapshot;", "<init>", "(Ljava/lang/String;Ljava/lang/String;DDILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;DDILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getWeekStartIso", "()Ljava/lang/String;", "getWeekEndIso", "getTotalRunKm", "()D", "getTotalGymKg", "getSleepNights", "()I", "getAvgSleepHours", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getCoachHeadline", "getCoachSummary", "getCoachWeekLine", "getDays", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "(Ljava/lang/String;Ljava/lang/String;DDILjava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/example/rungps/training/TrainingWeekSnapshot;", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "DaySnapshot", "EventSnapshot", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes3.dex */
public final /* data */ class TrainingWeekSnapshot {
    private final Double avgSleepHours;
    private final String coachHeadline;
    private final String coachSummary;
    private final String coachWeekLine;
    private final List<DaySnapshot> days;
    private final int sleepNights;
    private final double totalGymKg;
    private final double totalRunKm;
    private final String weekEndIso;
    private final String weekStartIso;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, null, null, null, null, new ArrayListSerializer(TrainingWeekSnapshot$DaySnapshot$$serializer.INSTANCE)};

    /* renamed from: component1, reason: from getter */
    public final String getWeekStartIso() {
        return this.weekStartIso;
    }

    public final List<DaySnapshot> component10() {
        return this.days;
    }

    /* renamed from: component2, reason: from getter */
    public final String getWeekEndIso() {
        return this.weekEndIso;
    }

    /* renamed from: component3, reason: from getter */
    public final double getTotalRunKm() {
        return this.totalRunKm;
    }

    /* renamed from: component4, reason: from getter */
    public final double getTotalGymKg() {
        return this.totalGymKg;
    }

    /* renamed from: component5, reason: from getter */
    public final int getSleepNights() {
        return this.sleepNights;
    }

    /* renamed from: component6, reason: from getter */
    public final Double getAvgSleepHours() {
        return this.avgSleepHours;
    }

    /* renamed from: component7, reason: from getter */
    public final String getCoachHeadline() {
        return this.coachHeadline;
    }

    /* renamed from: component8, reason: from getter */
    public final String getCoachSummary() {
        return this.coachSummary;
    }

    /* renamed from: component9, reason: from getter */
    public final String getCoachWeekLine() {
        return this.coachWeekLine;
    }

    public final TrainingWeekSnapshot copy(String weekStartIso, String weekEndIso, double totalRunKm, double totalGymKg, int sleepNights, Double avgSleepHours, String coachHeadline, String coachSummary, String coachWeekLine, List<DaySnapshot> days) {
        Intrinsics.checkNotNullParameter(weekStartIso, "weekStartIso");
        Intrinsics.checkNotNullParameter(weekEndIso, "weekEndIso");
        Intrinsics.checkNotNullParameter(days, "days");
        return new TrainingWeekSnapshot(weekStartIso, weekEndIso, totalRunKm, totalGymKg, sleepNights, avgSleepHours, coachHeadline, coachSummary, coachWeekLine, days);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrainingWeekSnapshot)) {
            return false;
        }
        TrainingWeekSnapshot trainingWeekSnapshot = (TrainingWeekSnapshot) other;
        return Intrinsics.areEqual(this.weekStartIso, trainingWeekSnapshot.weekStartIso) && Intrinsics.areEqual(this.weekEndIso, trainingWeekSnapshot.weekEndIso) && Double.compare(this.totalRunKm, trainingWeekSnapshot.totalRunKm) == 0 && Double.compare(this.totalGymKg, trainingWeekSnapshot.totalGymKg) == 0 && this.sleepNights == trainingWeekSnapshot.sleepNights && Intrinsics.areEqual((Object) this.avgSleepHours, (Object) trainingWeekSnapshot.avgSleepHours) && Intrinsics.areEqual(this.coachHeadline, trainingWeekSnapshot.coachHeadline) && Intrinsics.areEqual(this.coachSummary, trainingWeekSnapshot.coachSummary) && Intrinsics.areEqual(this.coachWeekLine, trainingWeekSnapshot.coachWeekLine) && Intrinsics.areEqual(this.days, trainingWeekSnapshot.days);
    }

    public int hashCode() {
        int hashCode = ((((((((this.weekStartIso.hashCode() * 31) + this.weekEndIso.hashCode()) * 31) + Double.hashCode(this.totalRunKm)) * 31) + Double.hashCode(this.totalGymKg)) * 31) + Integer.hashCode(this.sleepNights)) * 31;
        Double d = this.avgSleepHours;
        int hashCode2 = (hashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.coachHeadline;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.coachSummary;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.coachWeekLine;
        return ((hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.days.hashCode();
    }

    public String toString() {
        return "TrainingWeekSnapshot(weekStartIso=" + this.weekStartIso + ", weekEndIso=" + this.weekEndIso + ", totalRunKm=" + this.totalRunKm + ", totalGymKg=" + this.totalGymKg + ", sleepNights=" + this.sleepNights + ", avgSleepHours=" + this.avgSleepHours + ", coachHeadline=" + this.coachHeadline + ", coachSummary=" + this.coachSummary + ", coachWeekLine=" + this.coachWeekLine + ", days=" + this.days + ")";
    }

    /* compiled from: TrainingWeekSnapshot.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/training/TrainingWeekSnapshot$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/training/TrainingWeekSnapshot;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TrainingWeekSnapshot> serializer() {
            return TrainingWeekSnapshot$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TrainingWeekSnapshot(int i, String str, String str2, double d, double d2, int i2, Double d3, String str3, String str4, String str5, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            PluginExceptionsKt.throwMissingFieldException(i, 31, TrainingWeekSnapshot$$serializer.INSTANCE.getDescriptor());
        }
        this.weekStartIso = str;
        this.weekEndIso = str2;
        this.totalRunKm = d;
        this.totalGymKg = d2;
        this.sleepNights = i2;
        if ((i & 32) == 0) {
            this.avgSleepHours = null;
        } else {
            this.avgSleepHours = d3;
        }
        if ((i & 64) == 0) {
            this.coachHeadline = null;
        } else {
            this.coachHeadline = str3;
        }
        if ((i & 128) == 0) {
            this.coachSummary = null;
        } else {
            this.coachSummary = str4;
        }
        if ((i & 256) == 0) {
            this.coachWeekLine = null;
        } else {
            this.coachWeekLine = str5;
        }
        if ((i & 512) == 0) {
            this.days = CollectionsKt.emptyList();
        } else {
            this.days = list;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$app_sideload(TrainingWeekSnapshot self, CompositeEncoder output, SerialDescriptor serialDesc) {
        KSerializer<Object>[] kSerializerArr = $childSerializers;
        output.encodeStringElement(serialDesc, 0, self.weekStartIso);
        output.encodeStringElement(serialDesc, 1, self.weekEndIso);
        output.encodeDoubleElement(serialDesc, 2, self.totalRunKm);
        output.encodeDoubleElement(serialDesc, 3, self.totalGymKg);
        output.encodeIntElement(serialDesc, 4, self.sleepNights);
        if (output.shouldEncodeElementDefault(serialDesc, 5) || self.avgSleepHours != null) {
            output.encodeNullableSerializableElement(serialDesc, 5, DoubleSerializer.INSTANCE, self.avgSleepHours);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 6) || self.coachHeadline != null) {
            output.encodeNullableSerializableElement(serialDesc, 6, StringSerializer.INSTANCE, self.coachHeadline);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 7) || self.coachSummary != null) {
            output.encodeNullableSerializableElement(serialDesc, 7, StringSerializer.INSTANCE, self.coachSummary);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 8) || self.coachWeekLine != null) {
            output.encodeNullableSerializableElement(serialDesc, 8, StringSerializer.INSTANCE, self.coachWeekLine);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 9) && Intrinsics.areEqual(self.days, CollectionsKt.emptyList())) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 9, kSerializerArr[9], self.days);
    }

    public TrainingWeekSnapshot(String weekStartIso, String weekEndIso, double d, double d2, int i, Double d3, String str, String str2, String str3, List<DaySnapshot> days) {
        Intrinsics.checkNotNullParameter(weekStartIso, "weekStartIso");
        Intrinsics.checkNotNullParameter(weekEndIso, "weekEndIso");
        Intrinsics.checkNotNullParameter(days, "days");
        this.weekStartIso = weekStartIso;
        this.weekEndIso = weekEndIso;
        this.totalRunKm = d;
        this.totalGymKg = d2;
        this.sleepNights = i;
        this.avgSleepHours = d3;
        this.coachHeadline = str;
        this.coachSummary = str2;
        this.coachWeekLine = str3;
        this.days = days;
    }

    public final String getWeekStartIso() {
        return this.weekStartIso;
    }

    public final String getWeekEndIso() {
        return this.weekEndIso;
    }

    public final double getTotalRunKm() {
        return this.totalRunKm;
    }

    public final double getTotalGymKg() {
        return this.totalGymKg;
    }

    public final int getSleepNights() {
        return this.sleepNights;
    }

    public final Double getAvgSleepHours() {
        return this.avgSleepHours;
    }

    public final String getCoachHeadline() {
        return this.coachHeadline;
    }

    public final String getCoachSummary() {
        return this.coachSummary;
    }

    public final String getCoachWeekLine() {
        return this.coachWeekLine;
    }

    /* compiled from: TrainingWeekSnapshot.kt */
    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 12\u00020\u0001:\u000201BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eBW\b\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\r\u0010\u0013J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0006HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003JK\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\u00062\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0010HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001J%\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00002\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.H\u0001¢\u0006\u0002\b/R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0017R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u00062"}, d2 = {"Lcom/example/rungps/training/TrainingWeekSnapshot$DaySnapshot;", "", "dayLabel", "", "dateIso", "isToday", "", "runKm", "", "gymTonnageKg", "events", "", "Lcom/example/rungps/training/TrainingWeekSnapshot$EventSnapshot;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZDDLjava/util/List;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;ZDDLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getDayLabel", "()Ljava/lang/String;", "getDateIso", "()Z", "getRunKm", "()D", "getGymTonnageKg", "getEvents", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class DaySnapshot {
        private final String dateIso;
        private final String dayLabel;
        private final List<EventSnapshot> events;
        private final double gymTonnageKg;
        private final boolean isToday;
        private final double runKm;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final KSerializer<Object>[] $childSerializers = {null, null, null, null, null, new ArrayListSerializer(TrainingWeekSnapshot$EventSnapshot$$serializer.INSTANCE)};

        /* renamed from: component1, reason: from getter */
        public final String getDayLabel() {
            return this.dayLabel;
        }

        /* renamed from: component2, reason: from getter */
        public final String getDateIso() {
            return this.dateIso;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsToday() {
            return this.isToday;
        }

        /* renamed from: component4, reason: from getter */
        public final double getRunKm() {
            return this.runKm;
        }

        /* renamed from: component5, reason: from getter */
        public final double getGymTonnageKg() {
            return this.gymTonnageKg;
        }

        public final List<EventSnapshot> component6() {
            return this.events;
        }

        public final DaySnapshot copy(String dayLabel, String dateIso, boolean isToday, double runKm, double gymTonnageKg, List<EventSnapshot> events) {
            Intrinsics.checkNotNullParameter(dayLabel, "dayLabel");
            Intrinsics.checkNotNullParameter(dateIso, "dateIso");
            Intrinsics.checkNotNullParameter(events, "events");
            return new DaySnapshot(dayLabel, dateIso, isToday, runKm, gymTonnageKg, events);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DaySnapshot)) {
                return false;
            }
            DaySnapshot daySnapshot = (DaySnapshot) other;
            return Intrinsics.areEqual(this.dayLabel, daySnapshot.dayLabel) && Intrinsics.areEqual(this.dateIso, daySnapshot.dateIso) && this.isToday == daySnapshot.isToday && Double.compare(this.runKm, daySnapshot.runKm) == 0 && Double.compare(this.gymTonnageKg, daySnapshot.gymTonnageKg) == 0 && Intrinsics.areEqual(this.events, daySnapshot.events);
        }

        public int hashCode() {
            return (((((((((this.dayLabel.hashCode() * 31) + this.dateIso.hashCode()) * 31) + Boolean.hashCode(this.isToday)) * 31) + Double.hashCode(this.runKm)) * 31) + Double.hashCode(this.gymTonnageKg)) * 31) + this.events.hashCode();
        }

        public String toString() {
            return "DaySnapshot(dayLabel=" + this.dayLabel + ", dateIso=" + this.dateIso + ", isToday=" + this.isToday + ", runKm=" + this.runKm + ", gymTonnageKg=" + this.gymTonnageKg + ", events=" + this.events + ")";
        }

        /* compiled from: TrainingWeekSnapshot.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/training/TrainingWeekSnapshot$DaySnapshot$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/training/TrainingWeekSnapshot$DaySnapshot;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<DaySnapshot> serializer() {
                return TrainingWeekSnapshot$DaySnapshot$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DaySnapshot(int i, String str, String str2, boolean z, double d, double d2, List list, SerializationConstructorMarker serializationConstructorMarker) {
            if (27 != (i & 27)) {
                PluginExceptionsKt.throwMissingFieldException(i, 27, TrainingWeekSnapshot$DaySnapshot$$serializer.INSTANCE.getDescriptor());
            }
            this.dayLabel = str;
            this.dateIso = str2;
            if ((i & 4) == 0) {
                this.isToday = false;
            } else {
                this.isToday = z;
            }
            this.runKm = d;
            this.gymTonnageKg = d2;
            if ((i & 32) == 0) {
                this.events = CollectionsKt.emptyList();
            } else {
                this.events = list;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$app_sideload(DaySnapshot self, CompositeEncoder output, SerialDescriptor serialDesc) {
            KSerializer<Object>[] kSerializerArr = $childSerializers;
            output.encodeStringElement(serialDesc, 0, self.dayLabel);
            output.encodeStringElement(serialDesc, 1, self.dateIso);
            if (output.shouldEncodeElementDefault(serialDesc, 2) || self.isToday) {
                output.encodeBooleanElement(serialDesc, 2, self.isToday);
            }
            output.encodeDoubleElement(serialDesc, 3, self.runKm);
            output.encodeDoubleElement(serialDesc, 4, self.gymTonnageKg);
            if (!output.shouldEncodeElementDefault(serialDesc, 5) && Intrinsics.areEqual(self.events, CollectionsKt.emptyList())) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 5, kSerializerArr[5], self.events);
        }

        public DaySnapshot(String dayLabel, String dateIso, boolean z, double d, double d2, List<EventSnapshot> events) {
            Intrinsics.checkNotNullParameter(dayLabel, "dayLabel");
            Intrinsics.checkNotNullParameter(dateIso, "dateIso");
            Intrinsics.checkNotNullParameter(events, "events");
            this.dayLabel = dayLabel;
            this.dateIso = dateIso;
            this.isToday = z;
            this.runKm = d;
            this.gymTonnageKg = d2;
            this.events = events;
        }

        public final String getDayLabel() {
            return this.dayLabel;
        }

        public final String getDateIso() {
            return this.dateIso;
        }

        public final boolean isToday() {
            return this.isToday;
        }

        public final double getRunKm() {
            return this.runKm;
        }

        public final double getGymTonnageKg() {
            return this.gymTonnageKg;
        }

        public /* synthetic */ DaySnapshot(String str, String str2, boolean z, double d, double d2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? false : z, d, d2, (i & 32) != 0 ? CollectionsKt.emptyList() : list);
        }

        public final List<EventSnapshot> getEvents() {
            return this.events;
        }
    }

    public /* synthetic */ TrainingWeekSnapshot(String str, String str2, double d, double d2, int i, Double d3, String str3, String str4, String str5, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, d, d2, i, (i2 & 32) != 0 ? null : d3, (i2 & 64) != 0 ? null : str3, (i2 & 128) != 0 ? null : str4, (i2 & 256) != 0 ? null : str5, (i2 & 512) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<DaySnapshot> getDays() {
        return this.days;
    }

    /* compiled from: TrainingWeekSnapshot.kt */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lcom/example/rungps/training/TrainingWeekSnapshot$EventSnapshot;", "", "kind", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getKind", "()Ljava/lang/String;", "getTitle", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", Vo2MaxRecord.MeasurementMethod.OTHER, "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$app_sideload", "$serializer", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @Serializable
    public static final /* data */ class EventSnapshot {
        public static final int $stable = 0;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String kind;
        private final String subtitle;
        private final String title;

        public static /* synthetic */ EventSnapshot copy$default(EventSnapshot eventSnapshot, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = eventSnapshot.kind;
            }
            if ((i & 2) != 0) {
                str2 = eventSnapshot.title;
            }
            if ((i & 4) != 0) {
                str3 = eventSnapshot.subtitle;
            }
            return eventSnapshot.copy(str, str2, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getKind() {
            return this.kind;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        public final EventSnapshot copy(String kind, String title, String subtitle) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(title, "title");
            return new EventSnapshot(kind, title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EventSnapshot)) {
                return false;
            }
            EventSnapshot eventSnapshot = (EventSnapshot) other;
            return Intrinsics.areEqual(this.kind, eventSnapshot.kind) && Intrinsics.areEqual(this.title, eventSnapshot.title) && Intrinsics.areEqual(this.subtitle, eventSnapshot.subtitle);
        }

        public int hashCode() {
            int hashCode = ((this.kind.hashCode() * 31) + this.title.hashCode()) * 31;
            String str = this.subtitle;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "EventSnapshot(kind=" + this.kind + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
        }

        /* compiled from: TrainingWeekSnapshot.kt */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/training/TrainingWeekSnapshot$EventSnapshot$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/example/rungps/training/TrainingWeekSnapshot$EventSnapshot;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<EventSnapshot> serializer() {
                return TrainingWeekSnapshot$EventSnapshot$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ EventSnapshot(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
            if (3 != (i & 3)) {
                PluginExceptionsKt.throwMissingFieldException(i, 3, TrainingWeekSnapshot$EventSnapshot$$serializer.INSTANCE.getDescriptor());
            }
            this.kind = str;
            this.title = str2;
            if ((i & 4) == 0) {
                this.subtitle = null;
            } else {
                this.subtitle = str3;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$app_sideload(EventSnapshot self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeStringElement(serialDesc, 0, self.kind);
            output.encodeStringElement(serialDesc, 1, self.title);
            if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.subtitle == null) {
                return;
            }
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.subtitle);
        }

        public EventSnapshot(String kind, String title, String str) {
            Intrinsics.checkNotNullParameter(kind, "kind");
            Intrinsics.checkNotNullParameter(title, "title");
            this.kind = kind;
            this.title = title;
            this.subtitle = str;
        }

        public /* synthetic */ EventSnapshot(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, (i & 4) != 0 ? null : str3);
        }

        public final String getKind() {
            return this.kind;
        }

        public final String getTitle() {
            return this.title;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }
    }
}
