package com.samsung.android.sdk.health.data.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.firestore.model.Values;
import com.samsung.android.sdk.health.data.helper.DataUtilHelper;
import java.time.Instant;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003J\u0015\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0019\u001a\t\u0018\u00018\u0000¢\u0006\u0002\b\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\"\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b!\u0010\u001e¨\u0006#"}, d2 = {"Lcom/samsung/android/sdk/health/data/data/AggregatedData;", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "defaultValue", "getValueOrDefault", "(Ljava/lang/Object;)Ljava/lang/Object;", "Ljava/time/LocalDateTime;", "getStartLocalDateTime", "()Ljava/time/LocalDateTime;", "getEndLocalDateTime", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lkotlinx/parcelize/RawValue;", "a", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", Values.VECTOR_MAP_VECTORS_KEY, "Ljava/time/Instant;", "b", "Ljava/time/Instant;", "getStartTime", "()Ljava/time/Instant;", "startTime", "c", "getEndTime", "endTime", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class AggregatedData<T> implements Parcelable {
    public static final Parcelable.Creator<AggregatedData<?>> CREATOR = new Creator();

    /* renamed from: a, reason: from kotlin metadata */
    private final Object value;

    /* renamed from: b, reason: from kotlin metadata */
    private final Instant startTime;

    /* renamed from: c, reason: from kotlin metadata */
    private final Instant endTime;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AggregatedData<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AggregatedData<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AggregatedData<>(parcel.readValue(AggregatedData.class.getClassLoader()), (Instant) parcel.readSerializable(), (Instant) parcel.readSerializable(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AggregatedData<?>[] newArray(int i) {
            return new AggregatedData[i];
        }
    }

    public /* synthetic */ AggregatedData(Object obj, Instant instant, Instant instant2, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, instant, instant2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final LocalDateTime getEndLocalDateTime() {
        return DataUtilHelper.instantToLocal$default(DataUtilHelper.INSTANCE, this.endTime, null, 2, null);
    }

    public final Instant getEndTime() {
        return this.endTime;
    }

    public final LocalDateTime getStartLocalDateTime() {
        return DataUtilHelper.instantToLocal$default(DataUtilHelper.INSTANCE, this.startTime, null, 2, null);
    }

    public final Instant getStartTime() {
        return this.startTime;
    }

    public final T getValue() {
        return (T) this.value;
    }

    public final T getValueOrDefault(T defaultValue) {
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = (T) this.value;
        return t == null ? defaultValue : t;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeValue(this.value);
        parcel.writeSerializable(this.startTime);
        parcel.writeSerializable(this.endTime);
    }

    private AggregatedData(Object obj, Instant instant, Instant instant2) {
        this.value = obj;
        this.startTime = instant;
        this.endTime = instant2;
    }
}
