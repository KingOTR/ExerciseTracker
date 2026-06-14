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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 \u001d*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0003\u001e\u001d\u001fJ\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R#\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00160\u00158\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001a¨\u0006 "}, d2 = {"Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$Entry;", "uidDataList", "Ljava/util/List;", "getUidDataList", "()Ljava/util/List;", "clientDataIdList", "getClientDataIdList", "Companion", "BasicBuilder", "Entry", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class UpdateDataRequest<T extends DataPoint> implements Parcelable {
    private final List<Entry<T>> clientDataIdList;
    private final DataType dataType;
    private final int requiredVersion;
    private final List<Entry<T>> uidDataList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<UpdateDataRequest<?>> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u0019*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003:\u0001\u0019J%\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0001H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0013\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R \u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "", "uid", "data", "addDataWithUid", "(Ljava/lang/String;Lcom/samsung/android/sdk/health/data/data/DataPoint;)Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "clientDataId", "addDataWithClientDataId", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;", "", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$Entry;", "uidDataList", "Ljava/util/List;", "clientDataIdList", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class BasicBuilder<T extends DataPoint> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final List<Entry<T>> clientDataIdList;
        private final DataType dataType;
        private int requiredVersion;
        private final List<Entry<T>> uidDataList;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType;)Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$BasicBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
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
        public final BasicBuilder<T> addDataWithClientDataId(String clientDataId, T data) {
            Intrinsics.checkNotNullParameter(clientDataId, "clientDataId");
            Intrinsics.checkNotNullParameter(data, "data");
            HealthDataPoint healthDataPoint = (HealthDataPoint) data;
            DataType requestDataType = this.dataType;
            Intrinsics.checkNotNullParameter(healthDataPoint, "healthDataPoint");
            Intrinsics.checkNotNullParameter(requestDataType, "requestDataType");
            if (!Intrinsics.areEqual(healthDataPoint.getDataType(), requestDataType)) {
                throw new InvalidRequestException(1001, "Health data point must be of same data type as request");
            }
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.clientDataIdList.add(Entry.INSTANCE.of(clientDataId, data));
            return this;
        }

        @ApiVersion(minRequired = 1010000)
        public final BasicBuilder<T> addDataWithUid(String uid, T data) {
            Intrinsics.checkNotNullParameter(uid, "uid");
            Intrinsics.checkNotNullParameter(data, "data");
            HealthDataPoint healthDataPoint = (HealthDataPoint) data;
            DataType requestDataType = this.dataType;
            Intrinsics.checkNotNullParameter(healthDataPoint, "healthDataPoint");
            Intrinsics.checkNotNullParameter(requestDataType, "requestDataType");
            if (!Intrinsics.areEqual(healthDataPoint.getDataType(), requestDataType)) {
                throw new InvalidRequestException(1001, "Health data point must be of same data type as request");
            }
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.uidDataList.add(Entry.INSTANCE.of(uid, data));
            return this;
        }

        public final UpdateDataRequest<T> build() {
            if (this.uidDataList.isEmpty() && this.clientDataIdList.isEmpty()) {
                throw new InvalidRequestException(1001, "At least, one of input values should be not null");
            }
            List<Entry<T>> list = this.uidDataList;
            ArrayList<Parcelable> parcelableList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                parcelableList.add(((Entry) it.next()).getDataPoint());
            }
            Intrinsics.checkNotNullParameter(parcelableList, "parcelableList");
            if (!parcelableList.isEmpty()) {
                for (Parcelable parcelable : parcelableList) {
                    Parcel obtain = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(obtain, "obtain()");
                    parcelable.writeToParcel(obtain, 0);
                    int dataSize = obtain.dataSize();
                    obtain.recycle();
                    if (dataSize >= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) {
                        throw new InvalidRequestException(1001, "Data size is too large");
                    }
                }
            }
            List<Entry<T>> list2 = this.clientDataIdList;
            ArrayList<Parcelable> parcelableList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                parcelableList2.add(((Entry) it2.next()).getDataPoint());
            }
            Intrinsics.checkNotNullParameter(parcelableList2, "parcelableList");
            if (!parcelableList2.isEmpty()) {
                for (Parcelable parcelable2 : parcelableList2) {
                    Parcel obtain2 = Parcel.obtain();
                    Intrinsics.checkNotNullExpressionValue(obtain2, "obtain()");
                    parcelable2.writeToParcel(obtain2, 0);
                    int dataSize2 = obtain2.dataSize();
                    obtain2.recycle();
                    if (dataSize2 >= PlaybackStateCompat.ACTION_SET_PLAYBACK_SPEED) {
                        throw new InvalidRequestException(1001, "Data size is too large");
                    }
                }
            }
            return new UpdateDataRequest<>(this.requiredVersion, this.dataType, this.uidDataList, this.clientDataIdList, null);
        }

        private BasicBuilder(int i, DataType dataType) {
            this.requiredVersion = i;
            this.dataType = dataType;
            this.uidDataList = new ArrayList();
            this.clientDataIdList = new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;", "", "flags", "", "write", "(Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest;Landroid/os/Parcel;I)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parceler<UpdateDataRequest<DataPoint>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public UpdateDataRequest<DataPoint>[] newArray(int i) {
            return (UpdateDataRequest[]) Parceler.DefaultImpls.newArray(this, i);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public UpdateDataRequest<DataPoint> create(Parcel parcel) {
            DataType dataType;
            ArrayList uidDataList;
            ArrayList clientDataList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable readParcelable = parcel.readParcelable(UpdateDataRequest.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                dataType = (DataType) readParcelable;
            } else {
                Object readParcelable2 = parcel.readParcelable(UpdateDataRequest.class.getClassLoader(), DataType.class);
                Intrinsics.checkNotNull(readParcelable2);
                dataType = (DataType) readParcelable2;
            }
            DataType dataType2 = dataType;
            Intrinsics.checkNotNullExpressionValue(dataType2, "if (Build.VERSION.SDK_IN…ass.java)!!\n            }");
            if (readInt >= 1010000) {
                uidDataList = g.a(parcel);
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < readInt2; i++) {
                    Entry<?> createFromParcel = Entry.CREATOR.createFromParcel(parcel);
                    Intrinsics.checkNotNullExpressionValue(createFromParcel, "createFromParcel(parcel)");
                    arrayList.add(createFromParcel);
                }
                uidDataList = arrayList;
            }
            if (readInt >= 1010000) {
                clientDataList = g.a(parcel);
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList();
                for (int i2 = 0; i2 < readInt3; i2++) {
                    Entry<?> createFromParcel2 = Entry.CREATOR.createFromParcel(parcel);
                    Intrinsics.checkNotNullExpressionValue(createFromParcel2, "createFromParcel(parcel)");
                    arrayList2.add(createFromParcel2);
                }
                clientDataList = arrayList2;
            }
            Intrinsics.checkNotNullExpressionValue(uidDataList, "uidDataList");
            Intrinsics.checkNotNullExpressionValue(clientDataList, "clientDataList");
            return new UpdateDataRequest<>(readInt, dataType2, uidDataList, clientDataList, null);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(UpdateDataRequest<DataPoint> updateDataRequest, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(updateDataRequest, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeInt(updateDataRequest.getRequiredVersion());
            parcel.writeParcelable(updateDataRequest.getDataType(), i);
            g.a(parcel, updateDataRequest.getUidDataList());
            g.a(parcel, updateDataRequest.getClientDataIdList());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UpdateDataRequest<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateDataRequest<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return UpdateDataRequest.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UpdateDataRequest<?>[] newArray(int i) {
            return new UpdateDataRequest[i];
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \u0016*\n\b\u0001\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0003:\u0001\u0016J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$Entry;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "dataPoint", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "getDataPoint", "()Lcom/samsung/android/sdk/health/data/data/DataPoint;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Entry<T extends DataPoint> implements Parcelable {
        private final T dataPoint;
        private final String id;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final Parcelable.Creator<Entry<?>> CREATOR = new Creator();

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J1\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\"\n\b\u0002\u0010\u0003*\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00028\u0002H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$Entry$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "id", "dataPoint", "Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$Entry;", "of", "(Ljava/lang/String;Lcom/samsung/android/sdk/health/data/data/DataPoint;)Lcom/samsung/android/sdk/health/data/request/UpdateDataRequest$Entry;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @JvmStatic
            public final <T extends DataPoint> Entry<T> of(String id, T dataPoint) {
                Intrinsics.checkNotNullParameter(id, "id");
                return new Entry<>(id, dataPoint, null);
            }

            private Companion() {
            }
        }

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Entry<?>> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Entry<?> createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Entry<>(parcel.readString(), (DataPoint) parcel.readParcelable(Entry.class.getClassLoader()), null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Entry<?>[] newArray(int i) {
                return new Entry[i];
            }
        }

        public /* synthetic */ Entry(String str, DataPoint dataPoint, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, dataPoint);
        }

        @JvmStatic
        public static final <T extends DataPoint> Entry<T> of(String str, T t) {
            return INSTANCE.of(str, t);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final T getDataPoint() {
            return this.dataPoint;
        }

        public final String getId() {
            return this.id;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            parcel.writeString(this.id);
            parcel.writeParcelable(this.dataPoint, flags);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private Entry(String str, DataPoint dataPoint) {
            this.id = str;
            this.dataPoint = dataPoint;
        }
    }

    public /* synthetic */ UpdateDataRequest(int i, DataType dataType, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dataType, list, list2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<Entry<T>> getClientDataIdList() {
        return this.clientDataIdList;
    }

    public final DataType getDataType() {
        return this.dataType;
    }

    public final int getRequiredVersion() {
        return this.requiredVersion;
    }

    public final List<Entry<T>> getUidDataList() {
        return this.uidDataList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write((UpdateDataRequest<DataPoint>) this, parcel, flags);
    }

    private UpdateDataRequest(int i, DataType dataType, List list, List list2) {
        this.requiredVersion = i;
        this.dataType = dataType;
        this.uidDataList = list;
        this.clientDataIdList = list2;
    }
}
