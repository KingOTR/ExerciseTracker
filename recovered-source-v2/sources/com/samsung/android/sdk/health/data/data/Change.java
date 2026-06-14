package com.samsung.android.sdk.health.data.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.data.DataPoint;
import java.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000*\n\b\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0012\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010#\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/Change;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/samsung/android/sdk/health/data/data/ChangeType;", "a", "Lcom/samsung/android/sdk/health/data/data/ChangeType;", "getChangeType", "()Lcom/samsung/android/sdk/health/data/data/ChangeType;", "changeType", "Ljava/time/Instant;", "b", "Ljava/time/Instant;", "getChangeTime", "()Ljava/time/Instant;", "changeTime", "c", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "getUpsertDataPoint", "()Lcom/samsung/android/sdk/health/data/data/DataPoint;", "upsertDataPoint", "", "d", "Ljava/lang/String;", "getDeleteDataUid", "()Ljava/lang/String;", "deleteDataUid", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class Change<T extends DataPoint> implements Parcelable {
    public static final Parcelable.Creator<Change<?>> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final ChangeType changeType;

    /* renamed from: b, reason: from kotlin metadata */
    private final Instant changeTime;

    /* renamed from: c, reason: from kotlin metadata */
    private final DataPoint upsertDataPoint;

    /* renamed from: d, reason: from kotlin metadata */
    private final String deleteDataUid;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<Change<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Change<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new Change<>(ChangeType.valueOf(parcel.readString()), (Instant) parcel.readSerializable(), (DataPoint) parcel.readParcelable(Change.class.getClassLoader()), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Change<?>[] newArray(int i) {
            return new Change[i];
        }
    }

    public /* synthetic */ Change(ChangeType changeType, Instant instant, DataPoint dataPoint, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(changeType, instant, dataPoint, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Instant getChangeTime() {
        return this.changeTime;
    }

    public final ChangeType getChangeType() {
        return this.changeType;
    }

    public final String getDeleteDataUid() {
        return this.deleteDataUid;
    }

    public final T getUpsertDataPoint() {
        return (T) this.upsertDataPoint;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.changeType.name());
        parcel.writeSerializable(this.changeTime);
        parcel.writeParcelable(this.upsertDataPoint, flags);
        parcel.writeString(this.deleteDataUid);
    }

    private Change(ChangeType changeType, Instant instant, DataPoint dataPoint, String str) {
        this.changeType = changeType;
        this.changeTime = instant;
        this.upsertDataPoint = dataPoint;
        this.deleteDataUid = str;
    }
}
