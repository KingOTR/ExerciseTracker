package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.data.DataPoint;
import com.samsung.android.sdk.health.data.e2;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001#J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "pageSize", "Ljava/lang/Integer;", "getPageSize", "()Ljava/lang/Integer;", "", "pageToken", "Ljava/lang/String;", "getPageToken", "()Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "changeTimeFilter", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "getChangeTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "BasicBuilder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ChangedDataRequest<T extends DataPoint> implements Parcelable {
    public static final Parcelable.Creator<ChangedDataRequest<?>> CREATOR = new Creator();
    private final InstantTimeFilter changeTimeFilter;
    private final DataType dataType;
    private final Integer pageSize;
    private final String pageToken;
    private final int requiredVersion;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001b*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u001bJ\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018R\u0018\u0010\t\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019R\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "pageSize", "setPageSize", "(I)Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "changeTimeFilter", "setChangeTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;)Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest;", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType;", "datatype", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Ljava/lang/Integer;", "Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class BasicBuilder<T extends DataPoint> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private InstantTimeFilter changeTimeFilter;
        private DataType datatype;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType;)Lcom/samsung/android/sdk/health/data/request/ChangedDataRequest$BasicBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ BasicBuilder builder$SDK_clientRelease(int requiredVersion, DataType dataType) {
                Intrinsics.checkNotNullParameter(dataType, "dataType");
                return new BasicBuilder(requiredVersion, dataType, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ BasicBuilder(int i, DataType dataType, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, dataType);
        }

        public final ChangedDataRequest<T> build() {
            if (this.pageToken == null && this.changeTimeFilter == null) {
                throw new InvalidRequestException(1001, "changeTimeFilter and pageToken both cannot be null");
            }
            return new ChangedDataRequest<>(this.requiredVersion, this.datatype, this.pageSize, this.pageToken, this.changeTimeFilter, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final BasicBuilder<T> setChangeTimeFilter(InstantTimeFilter changeTimeFilter) {
            Intrinsics.checkNotNullParameter(changeTimeFilter, "changeTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.changeTimeFilter = changeTimeFilter;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final BasicBuilder<T> setPageSize(int pageSize) {
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final BasicBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageToken = pageToken;
            return this;
        }

        private BasicBuilder(int i, DataType dataType) {
            this.requiredVersion = i;
            this.datatype = dataType;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ChangedDataRequest<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangedDataRequest<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChangedDataRequest<>(parcel.readInt(), (DataType) parcel.readParcelable(ChangedDataRequest.class.getClassLoader()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), parcel.readInt() != 0 ? InstantTimeFilter.CREATOR.createFromParcel(parcel) : null, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ChangedDataRequest<?>[] newArray(int i) {
            return new ChangedDataRequest[i];
        }
    }

    public /* synthetic */ ChangedDataRequest(int i, DataType dataType, Integer num, String str, InstantTimeFilter instantTimeFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dataType, num, str, instantTimeFilter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final InstantTimeFilter getChangeTimeFilter() {
        return this.changeTimeFilter;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final Integer getPageSize() {
        return this.pageSize;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    public final int getRequiredVersion() {
        return this.requiredVersion;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.requiredVersion);
        parcel.writeParcelable(this.dataType, flags);
        Integer num = this.pageSize;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.pageToken);
        InstantTimeFilter instantTimeFilter = this.changeTimeFilter;
        if (instantTimeFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instantTimeFilter.writeToParcel(parcel, flags);
        }
    }

    private ChangedDataRequest(int i, DataType dataType, Integer num, String str, InstantTimeFilter instantTimeFilter) {
        this.requiredVersion = i;
        this.dataType = dataType;
        this.pageSize = num;
        this.pageToken = str;
        this.changeTimeFilter = instantTimeFilter;
    }
}
