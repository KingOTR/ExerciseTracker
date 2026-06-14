package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.BuildConfig;
import com.samsung.android.sdk.health.data.e2;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import com.samsung.android.sdk.health.data.o;
import com.samsung.android.sdk.health.data.t;
import com.samsung.android.sdk.health.data.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001(J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010$\u001a\u00020#8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "", "associatedDataTypes", "Ljava/util/List;", "getAssociatedDataTypes", "()Ljava/util/List;", "limit", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "pageSize", "getPageSize", "", "pageToken", "Ljava/lang/String;", "getPageToken", "()Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "idFilter", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "getIdFilter", "()Lcom/samsung/android/sdk/health/data/request/IdFilter;", "AssociateBuilder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class AssociatedReadRequest implements Parcelable {
    public static final Parcelable.Creator<AssociatedReadRequest> CREATOR = new Creator();
    private final List<DataType> associatedDataTypes;
    private final DataType dataType;
    private final IdFilter idFilter;
    private final Integer limit;
    private final Integer pageSize;
    private final String pageToken;
    private final int requiredVersion;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0007\u0018\u0000 \"*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\"J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0012\u001a\u00028\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0018\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0012\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010 R\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!¨\u0006#"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "Lcom/samsung/android/sdk/health/data/request/AssociateTypes;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "limit", "setLimit", "(I)Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "pageSize", "setPageSize", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "idFilter", "setIdFilter", "(Lcom/samsung/android/sdk/health/data/request/IdFilter;)Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "dataType", "addAssociatedDataType", "(Lcom/samsung/android/sdk/health/data/request/AssociateTypes;)Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest;", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/DataType;", "", "associatedTypes", "Ljava/util/List;", "Ljava/lang/Integer;", "Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class AssociateBuilder<T extends AssociateTypes> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<DataType> associatedTypes;
        private final DataType dataType;
        private IdFilter idFilter;
        private Integer limit;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\b\b\u0001\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder$Companion;", "", "Lcom/samsung/android/sdk/health/data/request/AssociateTypes;", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType;)Lcom/samsung/android/sdk/health/data/request/AssociatedReadRequest$AssociateBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ AssociateBuilder builder$SDK_clientRelease(int requiredVersion, DataType dataType) {
                Intrinsics.checkNotNullParameter(dataType, "dataType");
                return new AssociateBuilder(requiredVersion, dataType, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ AssociateBuilder(int i, DataType dataType, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, dataType);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AssociateBuilder<T> addAssociatedDataType(T dataType) {
            Intrinsics.checkNotNullParameter(dataType, "dataType");
            int i = this.requiredVersion;
            int a = e2.a();
            String dataTypeName = dataType.getDataType().getName();
            Intrinsics.checkNotNullParameter(dataTypeName, "dataTypeName");
            o oVar = (o) t.b(dataTypeName).getClass().getAnnotation(o.class);
            this.requiredVersion = Math.max(i, Math.max(a, oVar != null ? oVar.read() : BuildConfig.SDK_VERSION_CODE));
            this.associatedTypes.add(dataType.getDataType());
            return this;
        }

        public final AssociatedReadRequest build() {
            if (this.pageToken == null) {
                if (this.idFilter.getDataUidList().isEmpty() && this.idFilter.getClientDataIdList().isEmpty()) {
                    throw new InvalidRequestException(1001, "In idFilter client id and data uid both can not be null.");
                }
                z1.a("associatedTypes", this.associatedTypes);
            }
            return new AssociatedReadRequest(this.requiredVersion, this.dataType, this.associatedTypes, this.limit, this.pageSize, this.pageToken, this.idFilter, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AssociateBuilder<T> setIdFilter(IdFilter idFilter) {
            Intrinsics.checkNotNullParameter(idFilter, "idFilter");
            this.requiredVersion = Integer.max(e2.a(), this.requiredVersion);
            this.idFilter = idFilter;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AssociateBuilder<T> setLimit(int limit) {
            this.requiredVersion = Integer.max(e2.a(), this.requiredVersion);
            if (limit < 1) {
                throw new InvalidRequestException(1001, "Limit should be greater than zero");
            }
            this.limit = Integer.valueOf(limit);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AssociateBuilder<T> setPageSize(int pageSize) {
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.requiredVersion = Integer.max(e2.a(), this.requiredVersion);
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final AssociateBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(e2.a(), this.requiredVersion);
            this.pageToken = pageToken;
            return this;
        }

        private AssociateBuilder(int i, DataType dataType) {
            this.requiredVersion = i;
            this.dataType = dataType;
            this.associatedTypes = new ArrayList();
            this.idFilter = IdFilter.INSTANCE.builder().build();
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AssociatedReadRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssociatedReadRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            DataType dataType = (DataType) parcel.readParcelable(AssociatedReadRequest.class.getClassLoader());
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            for (int i = 0; i != readInt2; i++) {
                arrayList.add(parcel.readParcelable(AssociatedReadRequest.class.getClassLoader()));
            }
            return new AssociatedReadRequest(readInt, dataType, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readString(), IdFilter.CREATOR.createFromParcel(parcel), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final AssociatedReadRequest[] newArray(int i) {
            return new AssociatedReadRequest[i];
        }
    }

    public /* synthetic */ AssociatedReadRequest(int i, DataType dataType, List list, Integer num, Integer num2, String str, IdFilter idFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dataType, list, num, num2, str, idFilter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<DataType> getAssociatedDataTypes() {
        return this.associatedDataTypes;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final IdFilter getIdFilter() {
        return this.idFilter;
    }

    public final Integer getLimit() {
        return this.limit;
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
        List<DataType> list = this.associatedDataTypes;
        parcel.writeInt(list.size());
        Iterator<DataType> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), flags);
        }
        Integer num = this.limit;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        Integer num2 = this.pageSize;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        }
        parcel.writeString(this.pageToken);
        this.idFilter.writeToParcel(parcel, flags);
    }

    private AssociatedReadRequest(int i, DataType dataType, List list, Integer num, Integer num2, String str, IdFilter idFilter) {
        this.requiredVersion = i;
        this.dataType = dataType;
        this.associatedDataTypes = list;
        this.limit = num;
        this.pageSize = num2;
        this.pageToken = str;
        this.idFilter = idFilter;
    }
}
