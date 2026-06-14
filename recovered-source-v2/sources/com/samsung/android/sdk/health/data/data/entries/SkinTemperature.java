package com.samsung.android.sdk.health.data.data.entries;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.time.Instant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u0017\u0010\u0018\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001e¨\u0006!"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/SkinTemperature;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "skinTemperature", "F", "getSkinTemperature", "()F", "min", "getMin", "max", "getMax", "Ljava/time/Instant;", "startTime", "Ljava/time/Instant;", "getStartTime", "()Ljava/time/Instant;", "endTime", "getEndTime", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class SkinTemperature implements Parcelable {
    public static final Parcelable.Creator<SkinTemperature> CREATOR = new Creator();
    private final Instant endTime;
    private final float max;
    private final float min;
    private final float skinTemperature;
    private final Instant startTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SkinTemperature> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SkinTemperature createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SkinTemperature(parcel.readFloat(), parcel.readFloat(), parcel.readFloat(), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final SkinTemperature[] newArray(int i) {
            return new SkinTemperature[i];
        }
    }

    public /* synthetic */ SkinTemperature(float f, float f2, float f3, Instant instant, Instant instant2, DefaultConstructorMarker defaultConstructorMarker) {
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
        if (other == null || !Intrinsics.areEqual(SkinTemperature.class, other.getClass())) {
            return false;
        }
        SkinTemperature skinTemperature = (SkinTemperature) other;
        return this.skinTemperature == skinTemperature.skinTemperature && this.min == skinTemperature.min && this.max == skinTemperature.max && Intrinsics.areEqual(this.startTime, skinTemperature.startTime) && Intrinsics.areEqual(this.endTime, skinTemperature.endTime);
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

    public final float getSkinTemperature() {
        return this.skinTemperature;
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.skinTemperature), Float.valueOf(this.min), Float.valueOf(this.max), this.startTime, this.endTime);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.skinTemperature);
        parcel.writeFloat(this.min);
        parcel.writeFloat(this.max);
        parcel.writeSerializable(this.startTime);
        parcel.writeSerializable(this.endTime);
    }

    private SkinTemperature(float f, float f2, float f3, Instant instant, Instant instant2) {
        this.skinTemperature = f;
        this.min = f2;
        this.max = f3;
        this.startTime = instant;
        this.endTime = instant2;
    }
}
