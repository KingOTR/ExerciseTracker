package com.samsung.android.sdk.health.data.data.entries;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.google.gson.annotations.SerializedName;
import com.samsung.android.sdk.health.data.e0;
import java.time.Instant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 )2\u00020\u0001:\u0001)J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0016\u001a\u0004\b \u0010\u0018R\u001c\u0010!\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018R\u0017\u0010(\u001a\u00020#8F¢\u0006\f\u0012\u0004\b&\u0010'\u001a\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLog;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "startTime", "J", "", "heartRate", "Ljava/lang/Float;", "getHeartRate", "()Ljava/lang/Float;", "cadence", "getCadence", "count", "Ljava/lang/Integer;", "getCount", "()Ljava/lang/Integer;", "power", "getPower", "speed", "getSpeed", "Ljava/time/Instant;", "getTimestamp", "()Ljava/time/Instant;", "getTimestamp$annotations", "()V", "timestamp", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ExerciseLog implements Parcelable {

    @SerializedName("cadence")
    private final Float cadence;

    @SerializedName("count")
    private final Integer count;

    @SerializedName("heart_rate")
    private final Float heartRate;

    @SerializedName("power")
    private final Float power;

    @SerializedName("speed")
    private final Float speed;

    @SerializedName("start_time")
    private final long startTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ExerciseLog> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JG\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLog$Companion;", "", "Ljava/time/Instant;", "timestamp", "", "heartRate", "cadence", "", "count", "power", "speed", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLog;", "of", "(Ljava/time/Instant;Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLog;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExerciseLog of(Instant timestamp, Float heartRate, Float cadence, Integer count, Float power, Float speed) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new ExerciseLog(timestamp.toEpochMilli(), heartRate, cadence, count, power, speed, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExerciseLog> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseLog createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExerciseLog(parcel.readLong(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseLog[] newArray(int i) {
            return new ExerciseLog[i];
        }
    }

    public /* synthetic */ ExerciseLog(long j, Float f, Float f2, Integer num, Float f3, Float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, num, f3, f4);
    }

    public static /* synthetic */ void getTimestamp$annotations() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(ExerciseLog.class, other.getClass())) {
            return false;
        }
        ExerciseLog exerciseLog = (ExerciseLog) other;
        return Intrinsics.areEqual(getTimestamp(), exerciseLog.getTimestamp()) && Intrinsics.areEqual(this.heartRate, exerciseLog.heartRate) && Intrinsics.areEqual(this.cadence, exerciseLog.cadence) && Intrinsics.areEqual(this.count, exerciseLog.count) && Intrinsics.areEqual(this.power, exerciseLog.power) && Intrinsics.areEqual(this.speed, exerciseLog.speed);
    }

    public final Float getCadence() {
        return this.cadence;
    }

    public final Integer getCount() {
        return this.count;
    }

    public final Float getHeartRate() {
        return this.heartRate;
    }

    public final Float getPower() {
        return this.power;
    }

    public final Float getSpeed() {
        return this.speed;
    }

    public final Instant getTimestamp() {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.startTime);
        Intrinsics.checkNotNullExpressionValue(ofEpochMilli, "ofEpochMilli(startTime)");
        return ofEpochMilli;
    }

    public int hashCode() {
        return Objects.hash(getTimestamp(), this.heartRate, this.cadence, this.count, this.power, this.speed);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.startTime);
        Float f = this.heartRate;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f);
        }
        Float f2 = this.cadence;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f2);
        }
        Integer num = this.count;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Float f3 = this.power;
        if (f3 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f3);
        }
        Float f4 = this.speed;
        if (f4 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f4);
        }
    }

    private ExerciseLog(long j, Float f, Float f2, Integer num, Float f3, Float f4) {
        this.startTime = j;
        this.heartRate = f;
        this.cadence = f2;
        this.count = num;
        this.power = f3;
        this.speed = f4;
    }
}
