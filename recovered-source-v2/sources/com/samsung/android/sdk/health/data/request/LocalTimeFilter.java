package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/time/LocalDateTime;", "startTime", "Ljava/time/LocalDateTime;", "getStartTime", "()Ljava/time/LocalDateTime;", "endTime", "getEndTime", "", "isInclusiveStart", "Z", "()Z", "isInclusiveEnd", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class LocalTimeFilter implements Parcelable {
    private final LocalDateTime endTime;
    private final boolean isInclusiveEnd;
    private final boolean isInclusiveStart;
    private final LocalDateTime startTime;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LocalTimeFilter> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J#\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter$Companion;", "", "Ljava/time/LocalDateTime;", "startTime", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "since", "(Ljava/time/LocalDateTime;)Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "endTime", "to", "of", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "", "isInclusiveStart", "isInclusiveEnd", "(Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;ZZ)Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final LocalTimeFilter of(LocalDateTime startTime, LocalDateTime endTime) {
            if (startTime == null && endTime == null) {
                throw new InvalidRequestException(1001, "At least, one of input values should be not null");
            }
            if (startTime != null && endTime != null && startTime.compareTo(endTime) > 0) {
                throw new InvalidRequestException(1001, "End time can not be less than start time");
            }
            return new LocalTimeFilter(startTime, endTime, true, false, null);
        }

        @JvmStatic
        public final LocalTimeFilter since(LocalDateTime startTime) {
            Intrinsics.checkNotNullParameter(startTime, "startTime");
            return new LocalTimeFilter(startTime, null, true, false, null);
        }

        @JvmStatic
        public final LocalTimeFilter to(LocalDateTime endTime) {
            Intrinsics.checkNotNullParameter(endTime, "endTime");
            return new LocalTimeFilter(null, endTime, true, false, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final LocalTimeFilter of(LocalDateTime startTime, LocalDateTime endTime, boolean isInclusiveStart, boolean isInclusiveEnd) {
            if (startTime == null && endTime == null) {
                throw new InvalidRequestException(1001, "At least, one of input values should be not null");
            }
            if (startTime != null && endTime != null && startTime.compareTo(endTime) > 0) {
                throw new InvalidRequestException(1001, "End time can not be less than start time");
            }
            return new LocalTimeFilter(startTime, endTime, isInclusiveStart, isInclusiveEnd, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalTimeFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalTimeFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalTimeFilter((LocalDateTime) parcel.readSerializable(), (LocalDateTime) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalTimeFilter[] newArray(int i) {
            return new LocalTimeFilter[i];
        }
    }

    public /* synthetic */ LocalTimeFilter(LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(localDateTime, localDateTime2, z, z2);
    }

    @JvmStatic
    public static final LocalTimeFilter of(LocalDateTime localDateTime, LocalDateTime localDateTime2) {
        return INSTANCE.of(localDateTime, localDateTime2);
    }

    @JvmStatic
    public static final LocalTimeFilter since(LocalDateTime localDateTime) {
        return INSTANCE.since(localDateTime);
    }

    @JvmStatic
    public static final LocalTimeFilter to(LocalDateTime localDateTime) {
        return INSTANCE.to(localDateTime);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final LocalDateTime getEndTime() {
        return this.endTime;
    }

    public final LocalDateTime getStartTime() {
        return this.startTime;
    }

    /* renamed from: isInclusiveEnd, reason: from getter */
    public final boolean getIsInclusiveEnd() {
        return this.isInclusiveEnd;
    }

    /* renamed from: isInclusiveStart, reason: from getter */
    public final boolean getIsInclusiveStart() {
        return this.isInclusiveStart;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.startTime);
        parcel.writeSerializable(this.endTime);
        parcel.writeInt(this.isInclusiveStart ? 1 : 0);
        parcel.writeInt(this.isInclusiveEnd ? 1 : 0);
    }

    private LocalTimeFilter(LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z, boolean z2) {
        this.startTime = localDateTime;
        this.endTime = localDateTime2;
        this.isInclusiveStart = z;
        this.isInclusiveEnd = z2;
    }

    @JvmStatic
    public static final LocalTimeFilter of(LocalDateTime localDateTime, LocalDateTime localDateTime2, boolean z, boolean z2) {
        return INSTANCE.of(localDateTime, localDateTime2, z, z2);
    }
}
