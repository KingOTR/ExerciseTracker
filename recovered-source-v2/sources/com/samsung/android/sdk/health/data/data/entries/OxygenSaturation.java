package com.samsung.android.sdk.health.data.data.entries;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import java.time.Instant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006\""}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/OxygenSaturation;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "oxygenSaturation", "F", "getOxygenSaturation", "()F", "min", "getMin", "max", "getMax", "Ljava/time/Instant;", "startTime", "Ljava/time/Instant;", "getStartTime", "()Ljava/time/Instant;", "endTime", "getEndTime", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class OxygenSaturation implements Parcelable {
    private final Instant endTime;
    private final float max;
    private final float min;
    private final float oxygenSaturation;
    private final Instant startTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<OxygenSaturation> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J5\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/OxygenSaturation$Companion;", "", "", "oxygenSaturation", "min", "max", "Ljava/time/Instant;", "startTime", "endTime", "Lcom/samsung/android/sdk/health/data/data/entries/OxygenSaturation;", "of", "(FFFLjava/time/Instant;Ljava/time/Instant;)Lcom/samsung/android/sdk/health/data/data/entries/OxygenSaturation;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final OxygenSaturation of(float oxygenSaturation, float min, float max, Instant startTime, Instant endTime) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            if (startTime == null) {
                throw new InvalidRequestException(1001, "Start time must be set");
            }
            if (endTime == null) {
                throw new InvalidRequestException(1001, "End time must be set");
            }
            if (startTime.compareTo(endTime) <= 0) {
                return new OxygenSaturation(oxygenSaturation, min, max, startTime, endTime, null);
            }
            throw new InvalidRequestException(1001, "End time can not be less than start time");
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OxygenSaturation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OxygenSaturation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OxygenSaturation(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OxygenSaturation[] newArray(int i) {
            return new OxygenSaturation[i];
        }
    }

    public /* synthetic */ OxygenSaturation(float f, float f2, float f3, Instant instant, Instant instant2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, instant, instant2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(OxygenSaturation.class, other.getClass())) {
            return false;
        }
        OxygenSaturation oxygenSaturation = (OxygenSaturation) other;
        return this.oxygenSaturation == oxygenSaturation.oxygenSaturation && this.min == oxygenSaturation.min && this.max == oxygenSaturation.max && Intrinsics.areEqual(this.startTime, oxygenSaturation.startTime) && Intrinsics.areEqual(this.endTime, oxygenSaturation.endTime);
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final float getMax() {
        return this.max;
    }

    public final float getMin() {
        return this.min;
    }

    public final float getOxygenSaturation() {
        return this.oxygenSaturation;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.oxygenSaturation), Float.valueOf(this.min), Float.valueOf(this.max), this.startTime, this.endTime);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.oxygenSaturation);
        parcel.writeFloat(this.min);
        parcel.writeFloat(this.max);
        parcel.writeSerializable(this.startTime);
        parcel.writeSerializable(this.endTime);
    }

    private OxygenSaturation(float f, float f2, float f3, Instant instant, Instant instant2) {
        this.oxygenSaturation = f;
        this.min = f2;
        this.max = f3;
        this.startTime = instant;
        this.endTime = instant2;
    }
}
