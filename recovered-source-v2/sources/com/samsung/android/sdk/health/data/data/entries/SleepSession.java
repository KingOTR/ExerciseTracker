package com.samsung.android.sdk.health.data.data.entries;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.request.DataType;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002#$J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0019\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006%"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SleepSession;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/time/Instant;", "startTime", "Ljava/time/Instant;", "getStartTime", "()Ljava/time/Instant;", "endTime", "getEndTime", "Ljava/time/Duration;", "duration", "Ljava/time/Duration;", "getDuration", "()Ljava/time/Duration;", "", "Lcom/samsung/android/sdk/health/data/data/entries/SleepSession$SleepStage;", "stages", "Ljava/util/List;", "getStages", "()Ljava/util/List;", "Companion", "SleepStage", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SleepSession implements Parcelable {
    private final Duration duration;
    private final Instant endTime;
    private final List<SleepStage> stages;
    private final Instant startTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<SleepSession> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SleepSession$Companion;", "", "Ljava/time/Instant;", "startTime", "endTime", "Ljava/time/Duration;", "duration", "", "Lcom/samsung/android/sdk/health/data/data/entries/SleepSession$SleepStage;", "stages", "Lcom/samsung/android/sdk/health/data/data/entries/SleepSession;", "of", "(Ljava/time/Instant;Ljava/time/Instant;Ljava/time/Duration;Ljava/util/List;)Lcom/samsung/android/sdk/health/data/data/entries/SleepSession;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SleepSession of(Instant startTime, Instant endTime, Duration duration, List<SleepStage> stages) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            Intrinsics.checkNotNullParameter(duration, "duration");
            if (startTime == null) {
                throw new InvalidRequestException(1001, "Start time must be set");
            }
            if (endTime == null) {
                throw new InvalidRequestException(1001, "End time must be set");
            }
            if (startTime.compareTo(endTime) <= 0) {
                return new SleepSession(startTime, endTime, duration, stages, null);
            }
            throw new InvalidRequestException(1001, "End time can not be less than start time");
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SleepSession> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SleepSession createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            Instant instant = (Instant) parcel.readSerializable();
            Instant instant2 = (Instant) parcel.readSerializable();
            Duration duration = (Duration) parcel.readSerializable();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                for (int i = 0; i != readInt; i++) {
                    arrayList2.add(SleepStage.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList2;
            }
            return new SleepSession(instant, instant2, duration, arrayList, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SleepSession[] newArray(int i) {
            return new SleepSession[i];
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0011\u0010\u001d\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SleepSession$SleepStage;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/time/Instant;", "startTime", "Ljava/time/Instant;", "getStartTime", "()Ljava/time/Instant;", "endTime", "getEndTime", "sleepStageOrdinal", "I", "Lcom/samsung/android/sdk/health/data/request/DataType$SleepType$StageType;", "getStage", "()Lcom/samsung/android/sdk/health/data/request/DataType$SleepType$StageType;", "stage", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class SleepStage implements Parcelable {
        private final Instant endTime;
        private final int sleepStageOrdinal;
        private final Instant startTime;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<SleepStage> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SleepSession$SleepStage$Companion;", "", "Ljava/time/Instant;", "startTime", "endTime", "Lcom/samsung/android/sdk/health/data/request/DataType$SleepType$StageType;", "stage", "Lcom/samsung/android/sdk/health/data/data/entries/SleepSession$SleepStage;", "of", "(Ljava/time/Instant;Ljava/time/Instant;Lcom/samsung/android/sdk/health/data/request/DataType$SleepType$StageType;)Lcom/samsung/android/sdk/health/data/data/entries/SleepSession$SleepStage;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final SleepStage of(Instant startTime, Instant endTime, DataType.SleepType.StageType stage) {
                Intrinsics.checkNotNullParameter(startTime, "startTime");
                Intrinsics.checkNotNullParameter(endTime, "endTime");
                Intrinsics.checkNotNullParameter(stage, "stage");
                if (startTime == null) {
                    throw new InvalidRequestException(1001, "Start time must be set");
                }
                if (endTime == null) {
                    throw new InvalidRequestException(1001, "End time must be set");
                }
                if (startTime.compareTo(endTime) > 0) {
                    throw new InvalidRequestException(1001, "End time can not be less than start time");
                }
                if (stage != null && stage.ordinal() == 0) {
                    throw new InvalidRequestException(1001, "The enum value should not be of undefined type. It needs to be explicitly specified");
                }
                DefaultConstructorMarker defaultConstructorMarker = null;
                Integer valueOf = stage != null ? Integer.valueOf(stage.ordinal()) : null;
                Intrinsics.checkNotNull(valueOf);
                return new SleepStage(startTime, endTime, valueOf.intValue(), defaultConstructorMarker);
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SleepStage> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SleepStage createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SleepStage((Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), parcel.readInt(), null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SleepStage[] newArray(int i) {
                return new SleepStage[i];
            }
        }

        public /* synthetic */ SleepStage(Instant instant, Instant instant2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(instant, instant2, i);
        }

        @JvmStatic
        public static final SleepStage of(Instant instant, Instant instant2, DataType.SleepType.StageType stageType) {
            return INSTANCE.of(instant, instant2, stageType);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual(SleepStage.class, other.getClass())) {
                return false;
            }
            SleepStage sleepStage = (SleepStage) other;
            return Intrinsics.areEqual(this.startTime, sleepStage.startTime) && Intrinsics.areEqual(this.endTime, sleepStage.endTime) && getStage() == sleepStage.getStage();
        }

        public final Instant getEndTime() {
            return this.endTime;
        }

        public final DataType.SleepType.StageType getStage() {
            Enum r2;
            int i = this.sleepStageOrdinal;
            Enum[] enumConstants = (Enum[]) DataType.SleepType.StageType.class.getEnumConstants();
            if (enumConstants != null) {
                Intrinsics.checkNotNullExpressionValue(enumConstants, "enumConstants");
                r2 = (i <= 0 || i >= enumConstants.length) ? enumConstants[0] : enumConstants[i];
            } else {
                r2 = null;
            }
            DataType.SleepType.StageType stageType = (DataType.SleepType.StageType) r2;
            return stageType == null ? DataType.SleepType.StageType.UNDEFINED : stageType;
        }

        public final Instant getStartTime() {
            return this.startTime;
        }

        public int hashCode() {
            return Objects.hash(this.startTime, this.endTime, getStage().toString());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeSerializable(this.startTime);
            parcel.writeSerializable(this.endTime);
            parcel.writeInt(this.sleepStageOrdinal);
        }

        private SleepStage(Instant instant, Instant instant2, int i) {
            this.startTime = instant;
            this.endTime = instant2;
            this.sleepStageOrdinal = i;
        }
    }

    public /* synthetic */ SleepSession(Instant instant, Instant instant2, Duration duration, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, instant2, duration, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(SleepSession.class, other.getClass())) {
            return false;
        }
        SleepSession sleepSession = (SleepSession) other;
        return Intrinsics.areEqual(this.startTime, sleepSession.startTime) && Intrinsics.areEqual(this.endTime, sleepSession.endTime) && Intrinsics.areEqual(this.duration, sleepSession.duration);
    }

    public final Duration getDuration() {
        return this.duration;
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final List<SleepStage> getStages() {
        return this.stages;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Objects.hash(this.startTime, this.endTime, this.duration);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.startTime);
        parcel.writeSerializable(this.endTime);
        parcel.writeSerializable(this.duration);
        List<SleepStage> list = this.stages;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(list.size());
        Iterator<SleepStage> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    private SleepSession(Instant instant, Instant instant2, Duration duration, List list) {
        this.startTime = instant;
        this.endTime = instant2;
        this.duration = duration;
        this.stages = list;
    }
}
