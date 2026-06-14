package com.samsung.android.sdk.health.data.data.entries;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.io.Serializable;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0002)*J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001f\u0010%\u001a\n\u0012\u0004\u0012\u00020$\u0018\u00010#8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006+"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "poolLength", "I", "getPoolLength", "", "poolLengthUnit", "Ljava/lang/String;", "getPoolLengthUnit", "()Ljava/lang/String;", "", "totalDistance", "Ljava/lang/Float;", "getTotalDistance", "()Ljava/lang/Float;", "Ljava/time/Duration;", "totalDuration", "Ljava/time/Duration;", "getTotalDuration", "()Ljava/time/Duration;", "", "Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog$SwimmingInterval;", "swimmingIntervals", "Ljava/util/List;", "getSwimmingIntervals", "()Ljava/util/List;", "Companion", "SwimmingInterval", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SwimmingLog implements Parcelable {
    private final int poolLength;
    private final String poolLengthUnit;
    private final List<SwimmingInterval> swimmingIntervals;
    private final Float totalDistance;
    private final Duration totalDuration;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SwimmingLog> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001JA\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0016\u001a\u00020\u0015*\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "", "poolLength", "", "poolLengthUnit", "", "totalDistance", "Ljava/time/Duration;", "totalDuration", "", "Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog$SwimmingInterval;", "swimmingIntervals", "of", "(ILjava/lang/String;Ljava/lang/Float;Ljava/time/Duration;Ljava/util/List;)Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;", "flags", "", "write", "(Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog;Landroid/os/Parcel;I)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parceler<SwimmingLog> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public SwimmingLog[] newArray(int i) {
            return (SwimmingLog[]) Parceler.DefaultImpls.newArray(this, i);
        }

        public final SwimmingLog of(int poolLength, String poolLengthUnit, Float totalDistance, Duration totalDuration, List<SwimmingInterval> swimmingIntervals) {
            Intrinsics.checkNotNullParameter(poolLengthUnit, "poolLengthUnit");
            return new SwimmingLog(poolLength, poolLengthUnit, totalDistance, totalDuration, swimmingIntervals, null);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public SwimmingLog create(Parcel parcel) {
            Enum r13;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            String readString = parcel.readString();
            if (readString == null) {
                readString = "";
            }
            String str = readString;
            float readFloat = parcel.readFloat();
            Serializable readSerializable = parcel.readSerializable();
            Intrinsics.checkNotNull(readSerializable, "null cannot be cast to non-null type java.time.Duration");
            Duration duration = (Duration) readSerializable;
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < readInt2; i++) {
                SwimmingInterval.Companion companion = SwimmingInterval.INSTANCE;
                Serializable readSerializable2 = parcel.readSerializable();
                Intrinsics.checkNotNull(readSerializable2, "null cannot be cast to non-null type java.time.Duration");
                Duration duration2 = (Duration) readSerializable2;
                int readInt3 = parcel.readInt();
                int readInt4 = parcel.readInt();
                Enum[] enumConstants = (Enum[]) DataType.ExerciseType.StrokeType.class.getEnumConstants();
                if (enumConstants != null) {
                    Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
                    r13 = (readInt4 <= 0 || readInt4 >= enumConstants.length) ? enumConstants[0] : enumConstants[readInt4];
                } else {
                    r13 = null;
                }
                DataType.ExerciseType.StrokeType strokeType = (DataType.ExerciseType.StrokeType) r13;
                if (strokeType == null) {
                    strokeType = DataType.ExerciseType.StrokeType.UNDEFINED;
                }
                arrayList.add(companion.of(duration2, readInt3, strokeType, parcel.readInt()));
            }
            return of(readInt, str, Float.valueOf(readFloat), duration, arrayList);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(SwimmingLog swimmingLog, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(swimmingLog, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeInt(swimmingLog.getPoolLength());
            parcel.writeString(swimmingLog.getPoolLengthUnit());
            Float totalDistance = swimmingLog.getTotalDistance();
            parcel.writeFloat(totalDistance != null ? totalDistance.floatValue() : 0.0f);
            Duration totalDuration = swimmingLog.getTotalDuration();
            if (totalDuration == null) {
                totalDuration = Duration.ZERO;
            }
            Intrinsics.checkNotNull(totalDuration, "null cannot be cast to non-null type java.io.Serializable");
            parcel.writeSerializable(totalDuration);
            List<SwimmingInterval> swimmingIntervals = swimmingLog.getSwimmingIntervals();
            if (swimmingIntervals == null) {
                swimmingIntervals = CollectionsKt.emptyList();
            }
            parcel.writeInt(swimmingIntervals.size());
            for (SwimmingInterval swimmingInterval : swimmingIntervals) {
                Duration duration = swimmingInterval.getDuration();
                Intrinsics.checkNotNull(duration, "null cannot be cast to non-null type java.io.Serializable");
                parcel.writeSerializable(duration);
                parcel.writeInt(swimmingInterval.getStrokeCount());
                parcel.writeInt(swimmingInterval.getStrokeType().ordinal());
                parcel.writeInt(swimmingInterval.getInterval());
            }
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SwimmingLog> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwimmingLog createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SwimmingLog.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SwimmingLog[] newArray(int i) {
            return new SwimmingLog[i];
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0001\"J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0014\u0010\u0019\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0017R\u0017\u0010\u001a\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\tR\u0017\u0010!\u001a\u00020\u001c8F¢\u0006\f\u0012\u0004\b\u001f\u0010 \u001a\u0004\b\u001d\u0010\u001e¨\u0006#"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog$SwimmingInterval;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/time/Duration;", "duration", "Ljava/time/Duration;", "getDuration", "()Ljava/time/Duration;", "strokeCount", "I", "getStrokeCount", "strokeTypeOrdinal", "interval", "getInterval", "Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$StrokeType;", "getStrokeType", "()Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$StrokeType;", "getStrokeType$annotations", "()V", "strokeType", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class SwimmingInterval implements Parcelable {
        private final Duration duration;
        private final int interval;
        private final int strokeCount;
        private final int strokeTypeOrdinal;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<SwimmingInterval> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog$SwimmingInterval$Companion;", "", "Ljava/time/Duration;", "duration", "", "strokeCount", "Lcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$StrokeType;", "strokeType", "interval", "Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog$SwimmingInterval;", "of", "(Ljava/time/Duration;ILcom/samsung/android/sdk/health/data/request/DataType$ExerciseType$StrokeType;I)Lcom/samsung/android/sdk/health/data/data/entries/SwimmingLog$SwimmingInterval;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SwimmingInterval of(Duration duration, int strokeCount, DataType.ExerciseType.StrokeType strokeType, int interval) {
                Intrinsics.checkNotNullParameter(duration, "duration");
                Intrinsics.checkNotNullParameter(strokeType, "strokeType");
                if (strokeType != null && strokeType.ordinal() == 0) {
                    throw new InvalidRequestException(1001, "The enum value should not be of undefined type. It needs to be explicitly specified");
                }
                Integer valueOf = strokeType != null ? Integer.valueOf(strokeType.ordinal()) : null;
                Intrinsics.checkNotNull(valueOf);
                return new SwimmingInterval(duration, strokeCount, valueOf.intValue(), interval, null);
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SwimmingInterval> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwimmingInterval createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SwimmingInterval((Duration) parcel.readSerializable(), parcel.readInt(), parcel.readInt(), parcel.readInt(), null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SwimmingInterval[] newArray(int i) {
                return new SwimmingInterval[i];
            }
        }

        public /* synthetic */ SwimmingInterval(Duration duration, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(duration, i, i2, i3);
        }

        public static /* synthetic */ void getStrokeType$annotations() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(SwimmingInterval.class, other.getClass())) {
                return false;
            }
            SwimmingInterval swimmingInterval = (SwimmingInterval) other;
            return getStrokeType() == swimmingInterval.getStrokeType() && Intrinsics.areEqual(this.duration, swimmingInterval.duration) && this.strokeCount == swimmingInterval.strokeCount && this.interval == swimmingInterval.interval;
        }

        public final Duration getDuration() {
            return this.duration;
        }

        public final int getInterval() {
            return this.interval;
        }

        public final int getStrokeCount() {
            return this.strokeCount;
        }

        public final DataType.ExerciseType.StrokeType getStrokeType() {
            Enum r2;
            int i = this.strokeTypeOrdinal;
            Enum[] enumConstants = (Enum[]) DataType.ExerciseType.StrokeType.class.getEnumConstants();
            if (enumConstants != null) {
                Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
                r2 = (i <= 0 || i >= enumConstants.length) ? enumConstants[0] : enumConstants[i];
            } else {
                r2 = null;
            }
            DataType.ExerciseType.StrokeType strokeType = (DataType.ExerciseType.StrokeType) r2;
            return strokeType == null ? DataType.ExerciseType.StrokeType.UNDEFINED : strokeType;
        }

        public int hashCode() {
            return Objects.hash(this.duration, Integer.valueOf(this.strokeCount), getStrokeType(), Integer.valueOf(this.interval));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeSerializable(this.duration);
            parcel.writeInt(this.strokeCount);
            parcel.writeInt(this.strokeTypeOrdinal);
            parcel.writeInt(this.interval);
        }

        private SwimmingInterval(Duration duration, int i, int i2, int i3) {
            this.duration = duration;
            this.strokeCount = i;
            this.strokeTypeOrdinal = i2;
            this.interval = i3;
        }
    }

    public /* synthetic */ SwimmingLog(int i, String str, Float f, Duration duration, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, f, duration, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(SwimmingLog.class, other.getClass())) {
            return false;
        }
        SwimmingLog swimmingLog = (SwimmingLog) other;
        return Intrinsics.areEqual(this.poolLengthUnit, swimmingLog.poolLengthUnit) && this.poolLength == swimmingLog.poolLength && Intrinsics.areEqual(this.totalDistance, swimmingLog.totalDistance) && Intrinsics.areEqual(this.totalDuration, swimmingLog.totalDuration) && Intrinsics.areEqual(this.swimmingIntervals, swimmingLog.swimmingIntervals);
    }

    public final int getPoolLength() {
        return this.poolLength;
    }

    public final String getPoolLengthUnit() {
        return this.poolLengthUnit;
    }

    public final List<SwimmingInterval> getSwimmingIntervals() {
        return this.swimmingIntervals;
    }

    public final Float getTotalDistance() {
        return this.totalDistance;
    }

    public final Duration getTotalDuration() {
        return this.totalDuration;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.poolLength), this.poolLengthUnit, this.totalDistance, this.totalDuration, this.swimmingIntervals);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write(this, parcel, flags);
    }

    private SwimmingLog(int i, String str, Float f, Duration duration, List list) {
        this.poolLength = i;
        this.poolLengthUnit = str;
        this.totalDistance = f;
        this.totalDuration = duration;
        this.swimmingIntervals = list;
    }
}
