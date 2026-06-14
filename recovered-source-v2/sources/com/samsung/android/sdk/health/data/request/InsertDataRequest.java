package com.samsung.android.sdk.health.data.request;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.data.DataPoint;
import com.samsung.android.sdk.health.data.data.HealthDataPoint;
import com.samsung.android.sdk.health.data.e2;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.g;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import com.samsung.android.sdk.health.data.z1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u001a*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u001b\u001aJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "", "dataList", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "Companion", "BasicBuilder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class InsertDataRequest<T extends DataPoint> implements Parcelable {
    private final List<T> dataList;
    private final DataType dataType;
    private final int requiredVersion;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<InsertDataRequest<?>> CREATOR = new Creator();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0004\u0018\u0000 \u0013*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0013J\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0004\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "data", "addData", "(Lcom/samsung/android/sdk/health/data/data/DataPoint;)Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;", "", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "", "dataList", "Ljava/util/List;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class BasicBuilder<T extends DataPoint> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<T> dataList;
        private final DataType dataType;
        private int requiredVersion;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType;)Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$BasicBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
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

        @ApiVersion(minRequired = 1010000)
        public final BasicBuilder<T> addData(T data) {
            Intrinsics.checkNotNullParameter(data, "data");
            HealthDataPoint healthDataPoint = (HealthDataPoint) data;
            DataType requestDataType = this.dataType;
            Intrinsics.checkNotNullParameter(healthDataPoint, "healthDataPoint");
            Intrinsics.checkNotNullParameter(requestDataType, "requestDataType");
            if (!Intrinsics.areEqual(healthDataPoint.getDataType(), requestDataType)) {
                throw new InvalidRequestException(1001, "Health data point must be of same data type as request");
            }
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.dataList.add(data);
            return this;
        }

        public final InsertDataRequest<T> build() {
            z1.a("Data", this.dataList);
            List<T> parcelableList = this.dataList;
            Intrinsics.checkNotNullParameter(parcelableList, "parcelableList");
            if (!(parcelableList instanceof Collection) || !parcelableList.isEmpty()) {
                for (T t : parcelableList) {
                    Parcel obtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
                    t.writeToParcel(obtain, 0);
                    int dataSize = obtain.dataSize();
                    obtain.recycle();
                    if (dataSize >= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) {
                        throw new InvalidRequestException(1001, "Data size is too large");
                    }
                }
            }
            return new InsertDataRequest<>(this.requiredVersion, this.dataType, this.dataList, null);
        }

        private BasicBuilder(int i, DataType dataType) {
            this.requiredVersion = i;
            this.dataType = dataType;
            this.dataList = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/InsertDataRequest$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;", "", "flags", "", "write", "(Lcom/samsung/android/sdk/health/data/request/InsertDataRequest;Landroid/os/Parcel;I)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parceler<InsertDataRequest<DataPoint>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public InsertDataRequest<DataPoint>[] newArray(int i) {
            return (InsertDataRequest[]) Parceler.DefaultImpls.newArray(this, i);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public InsertDataRequest<DataPoint> create(Parcel parcel) {
            DataType dataType;
            ArrayList dataList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable readParcelable = parcel.readParcelable(InsertDataRequest.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                dataType = (DataType) readParcelable;
            } else {
                Object readParcelable2 = parcel.readParcelable(InsertDataRequest.class.getClassLoader(), DataType.class);
                Intrinsics.checkNotNull(readParcelable2);
                dataType = (DataType) readParcelable2;
            }
            Intrinsics.checkNotNullExpressionValue(dataType, "if (Build.VERSION.SDK_IN…ass.java)!!\n            }");
            if (readInt >= 1010000) {
                dataList = g.a(parcel);
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < readInt2; i++) {
                    Parcelable readParcelable3 = parcel.readParcelable(InsertDataRequest.class.getClassLoader());
                    Intrinsics.checkNotNull(readParcelable3);
                    arrayList.add(readParcelable3);
                }
                dataList = arrayList;
            }
            Intrinsics.checkNotNullExpressionValue(dataList, "dataList");
            return new InsertDataRequest<>(readInt, dataType, dataList, null);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(InsertDataRequest<DataPoint> insertDataRequest, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(insertDataRequest, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeInt(insertDataRequest.getRequiredVersion());
            parcel.writeParcelable(insertDataRequest.getDataType(), i);
            g.a(parcel, insertDataRequest.getDataList());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<InsertDataRequest<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsertDataRequest<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return InsertDataRequest.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final InsertDataRequest<?>[] newArray(int i) {
            return new InsertDataRequest[i];
        }
    }

    public /* synthetic */ InsertDataRequest(int i, DataType dataType, List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dataType, list);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<T> getDataList() {
        return this.dataList;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final int getRequiredVersion() {
        return this.requiredVersion;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write((InsertDataRequest<DataPoint>) this, parcel, flags);
    }

    private InsertDataRequest(int i, DataType dataType, List list) {
        this.requiredVersion = i;
        this.dataType = dataType;
        this.dataList = list;
    }
}
