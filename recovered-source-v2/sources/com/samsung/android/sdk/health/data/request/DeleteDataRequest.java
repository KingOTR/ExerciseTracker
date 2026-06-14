package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.e2;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\"J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "idFilter", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "getIdFilter", "()Lcom/samsung/android/sdk/health/data/request/IdFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "instantTimeFilter", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "getInstantTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "getLocalTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "BasicBuilder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DeleteDataRequest implements Parcelable {
    public static final Parcelable.Creator<DeleteDataRequest> CREATOR = new Creator();
    private final DataType dataType;
    private final IdFilter idFilter;
    private final InstantTimeFilter instantTimeFilter;
    private final LocalTimeFilter localTimeFilter;
    private final int requiredVersion;

    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fJ\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "idFilter", "setIdFilter", "(Lcom/samsung/android/sdk/health/data/request/IdFilter;)Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "instantTimeFilter", "setInstantTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;)Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "setLocalTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;)Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "setAllData", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest;", "", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "", "allData", "Z", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class BasicBuilder {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private boolean allData;
        private final DataType dataType;
        private IdFilter idFilter;
        private InstantTimeFilter instantTimeFilter;
        private LocalTimeFilter localTimeFilter;
        private int requiredVersion;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder$Companion;", "", "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType;)Lcom/samsung/android/sdk/health/data/request/DeleteDataRequest$BasicBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
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

        public final DeleteDataRequest build() {
            if (this.allData) {
                if (this.idFilter != null || this.instantTimeFilter != null || this.localTimeFilter != null) {
                    throw new InvalidRequestException(1001, "Can not use delete all data with any filter");
                }
            } else if (this.idFilter == null && this.instantTimeFilter == null && this.localTimeFilter == null) {
                throw new InvalidRequestException(1001, "At least, one of input values should be not null");
            }
            return new DeleteDataRequest(this.requiredVersion, this.dataType, this.idFilter, this.instantTimeFilter, this.localTimeFilter, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final BasicBuilder setAllData() {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.allData = true;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final BasicBuilder setIdFilter(IdFilter idFilter) {
            Intrinsics.checkNotNullParameter(idFilter, "idFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.idFilter = idFilter;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final BasicBuilder setInstantTimeFilter(InstantTimeFilter instantTimeFilter) {
            Intrinsics.checkNotNullParameter(instantTimeFilter, "instantTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.instantTimeFilter = instantTimeFilter;
            this.localTimeFilter = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final BasicBuilder setLocalTimeFilter(LocalTimeFilter localTimeFilter) {
            Intrinsics.checkNotNullParameter(localTimeFilter, "localTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.instantTimeFilter = null;
            this.localTimeFilter = localTimeFilter;
            return this;
        }

        private BasicBuilder(int i, DataType dataType) {
            this.requiredVersion = i;
            this.dataType = dataType;
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeleteDataRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteDataRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeleteDataRequest(parcel.readInt(), (DataType) parcel.readParcelable(DeleteDataRequest.class.getClassLoader()), parcel.readInt() == 0 ? null : IdFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstantTimeFilter.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? LocalTimeFilter.CREATOR.createFromParcel(parcel) : null, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeleteDataRequest[] newArray(int i) {
            return new DeleteDataRequest[i];
        }
    }

    public /* synthetic */ DeleteDataRequest(int i, DataType dataType, IdFilter idFilter, InstantTimeFilter instantTimeFilter, LocalTimeFilter localTimeFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dataType, idFilter, instantTimeFilter, localTimeFilter);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final IdFilter getIdFilter() {
        return this.idFilter;
    }

    public final InstantTimeFilter getInstantTimeFilter() {
        return this.instantTimeFilter;
    }

    public final LocalTimeFilter getLocalTimeFilter() {
        return this.localTimeFilter;
    }

    public final int getRequiredVersion() {
        return this.requiredVersion;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.requiredVersion);
        parcel.writeParcelable(this.dataType, flags);
        IdFilter idFilter = this.idFilter;
        if (idFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            idFilter.writeToParcel(parcel, flags);
        }
        InstantTimeFilter instantTimeFilter = this.instantTimeFilter;
        if (instantTimeFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            instantTimeFilter.writeToParcel(parcel, flags);
        }
        LocalTimeFilter localTimeFilter = this.localTimeFilter;
        if (localTimeFilter == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            localTimeFilter.writeToParcel(parcel, flags);
        }
    }

    private DeleteDataRequest(int i, DataType dataType, IdFilter idFilter, InstantTimeFilter instantTimeFilter, LocalTimeFilter localTimeFilter) {
        this.requiredVersion = i;
        this.dataType = dataType;
        this.idFilter = idFilter;
        this.instantTimeFilter = instantTimeFilter;
        this.localTimeFilter = localTimeFilter;
    }
}
