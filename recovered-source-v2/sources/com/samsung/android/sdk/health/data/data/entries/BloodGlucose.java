package com.samsung.android.sdk.health.data.data.entries;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.health.connect.client.records.Vo2MaxRecord;
import java.time.Instant;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bJ\u001a\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\n\u0010\tJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/BloodGlucose;", "Landroid/os/Parcelable;", "", Vo2MaxRecord.MeasurementMethod.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "glucose", "F", "getGlucose", "()F", "Ljava/time/Instant;", "timestamp", "Ljava/time/Instant;", "getTimestamp", "()Ljava/time/Instant;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class BloodGlucose implements Parcelable {
    private final float glucose;
    private final Instant timestamp;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<BloodGlucose> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/entries/BloodGlucose$Companion;", "", "", "glucose", "Ljava/time/Instant;", "timestamp", "Lcom/samsung/android/sdk/health/data/data/entries/BloodGlucose;", "of", "(FLjava/time/Instant;)Lcom/samsung/android/sdk/health/data/data/entries/BloodGlucose;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final BloodGlucose of(float glucose, Instant timestamp) {
            Intrinsics.checkNotNullParameter(timestamp, "timestamp");
            return new BloodGlucose(glucose, timestamp, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BloodGlucose> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BloodGlucose createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new BloodGlucose(parcel.readFloat(), (Instant) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final BloodGlucose[] newArray(int i) {
            return new BloodGlucose[i];
        }
    }

    public /* synthetic */ BloodGlucose(float f, Instant instant, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, instant);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !Intrinsics.areEqual(BloodGlucose.class, other.getClass())) {
            return false;
        }
        BloodGlucose bloodGlucose = (BloodGlucose) other;
        return this.glucose == bloodGlucose.glucose && Intrinsics.areEqual(this.timestamp, bloodGlucose.timestamp);
    }

    public final float getGlucose() {
        return this.glucose;
    }

    public final Instant getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.glucose), this.timestamp);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeFloat(this.glucose);
        parcel.writeSerializable(this.timestamp);
    }

    private BloodGlucose(float f, Instant instant) {
        this.glucose = f;
        this.timestamp = instant;
    }
}
