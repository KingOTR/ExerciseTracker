package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0019\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "Landroid/os/Parcelable;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "toLocalTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/time/LocalDate;", "startDate", "Ljava/time/LocalDate;", "getStartDate", "()Ljava/time/LocalDate;", "endDate", "getEndDate", "", "isInclusiveStart", "Z", "()Z", "isInclusiveEnd", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class LocalDateFilter implements Parcelable {
    private final LocalDate endDate;
    private final boolean isInclusiveEnd;
    private final boolean isInclusiveStart;
    private final LocalDate startDate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<LocalDateFilter> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0006J#\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\t\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/LocalDateFilter$Companion;", "", "Ljava/time/LocalDate;", "startDate", "Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "since", "(Ljava/time/LocalDate;)Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "endDate", "to", "of", "(Ljava/time/LocalDate;Ljava/time/LocalDate;)Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "", "isInclusiveStart", "isInclusiveEnd", "(Ljava/time/LocalDate;Ljava/time/LocalDate;ZZ)Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final LocalDateFilter of(LocalDate startDate, LocalDate endDate) {
            if (startDate == null && endDate == null) {
                throw new InvalidRequestException(1001, "At least, one of input values should be not null");
            }
            if (startDate != null && endDate != null && startDate.compareTo(endDate) > 0) {
                throw new InvalidRequestException(1001, "End time can not be less than start time");
            }
            Intrinsics.checkNotNull(startDate);
            Intrinsics.checkNotNull(endDate);
            return new LocalDateFilter(startDate, endDate, true, false, null);
        }

        @JvmStatic
        public final LocalDateFilter since(LocalDate startDate) {
            Intrinsics.checkNotNullParameter(startDate, "startDate");
            return new LocalDateFilter(startDate, null, true, false, null);
        }

        @JvmStatic
        public final LocalDateFilter to(LocalDate endDate) {
            Intrinsics.checkNotNullParameter(endDate, "endDate");
            return new LocalDateFilter(null, endDate, true, false, null);
        }

        private Companion() {
        }

        @JvmStatic
        public final LocalDateFilter of(LocalDate startDate, LocalDate endDate, boolean isInclusiveStart, boolean isInclusiveEnd) {
            if (startDate == null && endDate == null) {
                throw new InvalidRequestException(1001, "At least, one of input values should be not null");
            }
            if (startDate != null && endDate != null && startDate.compareTo(endDate) > 0) {
                throw new InvalidRequestException(1001, "End time can not be less than start time");
            }
            Intrinsics.checkNotNull(startDate);
            Intrinsics.checkNotNull(endDate);
            return new LocalDateFilter(startDate, endDate, isInclusiveStart, isInclusiveEnd, null);
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LocalDateFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalDateFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LocalDateFilter((LocalDate) parcel.readSerializable(), (LocalDate) parcel.readSerializable(), parcel.readInt() != 0, parcel.readInt() != 0, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final LocalDateFilter[] newArray(int i) {
            return new LocalDateFilter[i];
        }
    }

    public /* synthetic */ LocalDateFilter(LocalDate localDate, LocalDate localDate2, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(localDate, localDate2, z, z2);
    }

    @JvmStatic
    public static final LocalDateFilter of(LocalDate localDate, LocalDate localDate2) {
        return INSTANCE.of(localDate, localDate2);
    }

    @JvmStatic
    public static final LocalDateFilter since(LocalDate localDate) {
        return INSTANCE.since(localDate);
    }

    @JvmStatic
    public static final LocalDateFilter to(LocalDate localDate) {
        return INSTANCE.to(localDate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final LocalDate getEndDate() {
        return this.endDate;
    }

    public final LocalDate getStartDate() {
        return this.startDate;
    }

    /* renamed from: isInclusiveEnd, reason: from getter */
    public final boolean getIsInclusiveEnd() {
        return this.isInclusiveEnd;
    }

    /* renamed from: isInclusiveStart, reason: from getter */
    public final boolean getIsInclusiveStart() {
        return this.isInclusiveStart;
    }

    public final LocalTimeFilter toLocalTimeFilter() {
        LocalDate localDate = this.startDate;
        LocalDateTime atStartOfDay = localDate != null ? this.isInclusiveStart ? localDate.atStartOfDay() : localDate.plusDays(1L).atStartOfDay() : null;
        LocalDate localDate2 = this.endDate;
        return LocalTimeFilter.INSTANCE.of(atStartOfDay, localDate2 != null ? this.isInclusiveEnd ? localDate2.plusDays(1L).atStartOfDay() : localDate2.atStartOfDay() : null, true, false);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeSerializable(this.startDate);
        parcel.writeSerializable(this.endDate);
        parcel.writeInt(this.isInclusiveStart ? 1 : 0);
        parcel.writeInt(this.isInclusiveEnd ? 1 : 0);
    }

    private LocalDateFilter(LocalDate localDate, LocalDate localDate2, boolean z, boolean z2) {
        this.startDate = localDate;
        this.endDate = localDate2;
        this.isInclusiveStart = z;
        this.isInclusiveEnd = z2;
    }

    @JvmStatic
    public static final LocalDateFilter of(LocalDate localDate, LocalDate localDate2, boolean z, boolean z2) {
        return INSTANCE.of(localDate, localDate2, z, z2);
    }
}
