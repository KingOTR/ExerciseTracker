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

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u00020\u0001:\u0001*J\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u001a\u0010!\u001a\u00020\u00078\u0000X\u0080D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\tR\u0017\u0010)\u001a\u00020$8F¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLocation;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "startTime", "J", "", "longitude", "F", "getLongitude", "()F", "latitude", "getLatitude", "altitude", "Ljava/lang/Float;", "getAltitude", "()Ljava/lang/Float;", "accuracy", "getAccuracy", "version", "I", "getVersion$SDK_clientRelease", "Ljava/time/Instant;", "getTimestamp", "()Ljava/time/Instant;", "getTimestamp$annotations", "()V", "timestamp", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ExerciseLocation implements Parcelable {

    @SerializedName("accuracy")
    private final Float accuracy;

    @SerializedName("altitude")
    private final Float altitude;

    @SerializedName("latitude")
    private final float latitude;

    @SerializedName("longitude")
    private final float longitude;

    @SerializedName("start_time")
    private final long startTime;
    private final int version;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ExerciseLocation> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J9\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLocation$Companion;", "", "Ljava/time/Instant;", "timestamp", "", "longitude", "latitude", "altitude", "accuracy", "Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLocation;", "of", "(Ljava/time/Instant;FFLjava/lang/Float;Ljava/lang/Float;)Lcom/samsung/android/sdk/health/data/data/entries/ExerciseLocation;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ExerciseLocation of(Instant timestamp, float longitude, float latitude, Float altitude, Float accuracy) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new ExerciseLocation(timestamp.toEpochMilli(), longitude, latitude, altitude, accuracy, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ExerciseLocation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseLocation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ExerciseLocation(parcel.readLong(), parcel.readFloat(), parcel.readFloat(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ExerciseLocation[] newArray(int i) {
            return new ExerciseLocation[i];
        }
    }

    public /* synthetic */ ExerciseLocation(long j, float f, float f2, Float f3, Float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, f, f2, f3, f4);
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
        if (other == null || !Intrinsics.areEqual(ExerciseLocation.class, other.getClass())) {
            return false;
        }
        ExerciseLocation exerciseLocation = (ExerciseLocation) other;
        return Intrinsics.areEqual(getTimestamp(), exerciseLocation.getTimestamp()) && this.longitude == exerciseLocation.longitude && this.latitude == exerciseLocation.latitude && Intrinsics.areEqual(this.altitude, exerciseLocation.altitude) && Intrinsics.areEqual(this.accuracy, exerciseLocation.accuracy);
    }

    public final Float getAccuracy() {
        return this.accuracy;
    }

    public final Float getAltitude() {
        return this.altitude;
    }

    public final float getLatitude() {
        return this.latitude;
    }

    public final float getLongitude() {
        return this.longitude;
    }

    public final Instant getTimestamp() {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.startTime);
        Intrinsics.checkNotNullExpressionValue(ofEpochMilli, "ofEpochMilli(startTime)");
        return ofEpochMilli;
    }

    /* renamed from: getVersion$SDK_clientRelease, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public int hashCode() {
        return Objects.hash(getTimestamp(), Float.valueOf(this.longitude), Float.valueOf(this.latitude), this.altitude, this.accuracy);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeLong(this.startTime);
        parcel.writeFloat(this.longitude);
        parcel.writeFloat(this.latitude);
        Float f = this.altitude;
        if (f == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f);
        }
        Float f2 = this.accuracy;
        if (f2 == null) {
            parcel.writeInt(0);
        } else {
            e0.a(parcel, 1, f2);
        }
    }

    private ExerciseLocation(long j, float f, float f2, Float f3, Float f4) {
        this.startTime = j;
        this.longitude = f;
        this.latitude = f2;
        this.altitude = f3;
        this.accuracy = f4;
        this.version = 2;
    }
}
