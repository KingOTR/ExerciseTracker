package com.samsung.android.sdk.health.data.request;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.google.gson.Gson;
import com.samsung.android.sdk.health.data.BuildConfig;
import com.samsung.android.sdk.health.data.data.DataPoint;
import com.samsung.android.sdk.health.data.data.UserDataPoint;
import com.samsung.android.sdk.health.data.device.AccessoryType;
import com.samsung.android.sdk.health.data.device.DeviceGroup;
import com.samsung.android.sdk.health.data.e;
import com.samsung.android.sdk.health.data.e2;
import com.samsung.android.sdk.health.data.error.InvalidRequestException;
import com.samsung.android.sdk.health.data.f0;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import com.samsung.android.sdk.health.data.request.DataType;
import com.samsung.android.sdk.health.data.request.LocalTimeFilter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlinx.parcelize.Parceler;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 9*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0005:9;<=J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J \u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0006R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010&\u001a\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u00100\u001a\u0004\u0018\u00010/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0019\u00105\u001a\u0004\u0018\u0001048\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u0006>"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "getDataType", "()Lcom/samsung/android/sdk/health/data/request/DataType;", "limit", "Ljava/lang/Integer;", "getLimit", "()Ljava/lang/Integer;", "pageSize", "getPageSize", "", "pageToken", "Ljava/lang/String;", "getPageToken", "()Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "getOrdering", "()Lcom/samsung/android/sdk/health/data/request/Ordering;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "idFilter", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "getIdFilter", "()Lcom/samsung/android/sdk/health/data/request/IdFilter;", "Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "sourceFilter", "Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "getSourceFilter", "()Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "instantTimeFilter", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "getInstantTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "getLocalTimeFilter", "()Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Companion", "Builder", "DualTimeBuilder", "LocalDateBuilder", "UserProfileBuilder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ReadDataRequest<T extends DataPoint> implements Parcelable {
    private final DataType dataType;
    private final IdFilter idFilter;
    private final InstantTimeFilter instantTimeFilter;
    private final Integer limit;
    private final LocalTimeFilter localTimeFilter;
    private final Ordering ordering;
    private final Integer pageSize;
    private final String pageToken;
    private final int requiredVersion;
    private final ReadSourceFilter sourceFilter;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ReadDataRequest<?>> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u00020\u0003J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Builder;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "", "build", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Builder<T extends DataPoint> {
        ReadDataRequest<T> build();
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000b\u001a\u00020\n*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "", "flags", "", "write", "(Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;Landroid/os/Parcel;I)V", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parceler<ReadDataRequest<DataPoint>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public ReadDataRequest<DataPoint>[] newArray(int i) {
            return (ReadDataRequest[]) Parceler.DefaultImpls.newArray(this, i);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public ReadDataRequest<DataPoint> create(Parcel parcel) {
            DataType dataType;
            Ordering valueOf;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int readInt = parcel.readInt();
            if (readInt >= 1000000) {
                Gson gson = e.a;
                byte[] createByteArray = parcel.createByteArray();
                Intrinsics.checkNotNull(createByteArray);
                return (ReadDataRequest) e.a(createByteArray, ReadDataRequest.class);
            }
            if (Build.VERSION.SDK_INT < 33) {
                Parcelable readParcelable = parcel.readParcelable(ReadDataRequest.class.getClassLoader());
                Intrinsics.checkNotNull(readParcelable);
                dataType = (DataType) readParcelable;
            } else {
                Object readParcelable2 = parcel.readParcelable(ReadDataRequest.class.getClassLoader(), DataType.class);
                Intrinsics.checkNotNull(readParcelable2);
                dataType = (DataType) readParcelable2;
            }
            DataType dataType2 = dataType;
            Intrinsics.checkNotNullExpressionValue(dataType2, "if (Build.VERSION.SDK_IN…java)!!\n                }");
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                String readString2 = parcel.readString();
                Intrinsics.checkNotNull(readString2);
                valueOf = Ordering.valueOf(readString2);
            }
            return new ReadDataRequest<>(readInt, dataType2, valueOf2, valueOf3, readString, valueOf, parcel.readInt() == 0 ? null : IdFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ReadSourceFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : InstantTimeFilter.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LocalTimeFilter.CREATOR.createFromParcel(parcel), null);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(ReadDataRequest<DataPoint> readDataRequest, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(readDataRequest, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeInt(readDataRequest.getRequiredVersion());
            Gson gson = e.a;
            parcel.writeByteArray(e.a(readDataRequest));
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReadDataRequest<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReadDataRequest<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return ReadDataRequest.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReadDataRequest<?>[] newArray(int i) {
            return new ReadDataRequest[i];
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 1*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u00011J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001f\u001a\u00020\u001eH\u0007¢\u0006\u0004\b \u0010!J\u0015\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00010\"H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010%\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010*R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010-R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010.R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010/R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u00100¨\u00062"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Builder;", "", "limit", "setLimit", "(I)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "pageSize", "setPageSize", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "setOrdering", "(Lcom/samsung/android/sdk/health/data/request/Ordering;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "idFilter", "setIdFilter", "(Lcom/samsung/android/sdk/health/data/request/IdFilter;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "sourceFilter", "setSourceFilter", "(Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "instantTimeFilter", "setInstantTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "setLocalTimeFilter", "(Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Ljava/lang/Integer;", "Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "Lcom/samsung/android/sdk/health/data/request/InstantTimeFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class DualTimeBuilder<T extends DataPoint> implements Builder<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DataType dataType;
        private IdFilter idFilter;
        private InstantTimeFilter instantTimeFilter;
        private Integer limit;
        private LocalTimeFilter localTimeFilter;
        private Ordering ordering;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;
        private ReadSourceFilter sourceFilter;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$DualTimeBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ DualTimeBuilder builder$SDK_clientRelease(int requiredVersion, DataType dataType) {
                Intrinsics.checkNotNullParameter(dataType, "dataType");
                return new DualTimeBuilder(requiredVersion, dataType, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ DualTimeBuilder(int i, DataType dataType, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, dataType);
        }

        @Override // com.samsung.android.sdk.health.data.request.ReadDataRequest.Builder
        public ReadDataRequest<T> build() {
            return new ReadDataRequest<>(this.requiredVersion, this.dataType, this.limit, this.pageSize, this.pageToken, this.ordering, this.idFilter, this.sourceFilter, this.instantTimeFilter, this.localTimeFilter, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setIdFilter(IdFilter idFilter) {
            Intrinsics.checkNotNullParameter(idFilter, "idFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.idFilter = idFilter;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setInstantTimeFilter(InstantTimeFilter instantTimeFilter) {
            Intrinsics.checkNotNullParameter(instantTimeFilter, "instantTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.instantTimeFilter = instantTimeFilter;
            this.localTimeFilter = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setLimit(int limit) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (limit < 1) {
                throw new InvalidRequestException(1001, "Limit should be greater than zero");
            }
            this.limit = Integer.valueOf(limit);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setLocalTimeFilter(LocalTimeFilter localTimeFilter) {
            Intrinsics.checkNotNullParameter(localTimeFilter, "localTimeFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.localTimeFilter = localTimeFilter;
            this.instantTimeFilter = null;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setOrdering(Ordering ordering) {
            Intrinsics.checkNotNullParameter(ordering, "ordering");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.ordering = ordering;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setPageSize(int pageSize) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageToken = pageToken;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DualTimeBuilder<T> setSourceFilter(ReadSourceFilter sourceFilter) {
            Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
            Object deviceType = sourceFilter.getDeviceType();
            if (deviceType != null) {
                int i = this.requiredVersion;
                Intrinsics.checkNotNullParameter(deviceType, "deviceType");
                Enum r0 = deviceType instanceof DeviceGroup ? (Enum) deviceType : (AccessoryType) deviceType;
                Class declaringClass = r0.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass, "this as java.lang.Enum<E>).declaringClass");
                f0 f0Var = (f0) declaringClass.getField(r0.name()).getAnnotation(f0.class);
                this.requiredVersion = Integer.max(i, f0Var != null ? f0Var.minRequired() : BuildConfig.SDK_VERSION_CODE);
            }
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.sourceFilter = sourceFilter;
            return this;
        }

        private DualTimeBuilder(int i, DataType dataType) {
            this.requiredVersion = i;
            this.dataType = dataType;
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 .*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00010\u0003:\u0001.J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0013\u001a\u00020\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010&R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010&R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010(R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010)R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010*R\u0018\u0010,\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Builder;", "", "limit", "setLimit", "(I)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "pageSize", "setPageSize", "", "pageToken", "setPageToken", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "ordering", "setOrdering", "(Lcom/samsung/android/sdk/health/data/request/Ordering;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "idFilter", "setIdFilter", "(Lcom/samsung/android/sdk/health/data/request/IdFilter;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "sourceFilter", "setSourceFilter", "(Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;", "localDateFilter", "setLocalDateFilter", "(Lcom/samsung/android/sdk/health/data/request/LocalDateFilter;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType;", "Ljava/lang/Integer;", "Ljava/lang/String;", "Lcom/samsung/android/sdk/health/data/request/Ordering;", "Lcom/samsung/android/sdk/health/data/request/IdFilter;", "Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "localTimeFilter", "Lcom/samsung/android/sdk/health/data/request/LocalTimeFilter;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class LocalDateBuilder<T extends DataPoint> implements Builder<T> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DataType dataType;
        private IdFilter idFilter;
        private Integer limit;
        private LocalTimeFilter localTimeFilter;
        private Ordering ordering;
        private Integer pageSize;
        private String pageToken;
        private int requiredVersion;
        private ReadSourceFilter sourceFilter;

        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J/\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00020\b\"\b\b\u0002\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder$Companion;", "", "Lcom/samsung/android/sdk/health/data/data/DataPoint;", ExifInterface.GPS_DIRECTION_TRUE, "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$LocalDateBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ LocalDateBuilder builder$SDK_clientRelease(int requiredVersion, DataType dataType) {
                Intrinsics.checkNotNullParameter(dataType, "dataType");
                return new LocalDateBuilder(requiredVersion, dataType, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ LocalDateBuilder(int i, DataType dataType, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, dataType);
        }

        @Override // com.samsung.android.sdk.health.data.request.ReadDataRequest.Builder
        public ReadDataRequest<T> build() {
            return new ReadDataRequest<>(this.requiredVersion, this.dataType, this.limit, this.pageSize, this.pageToken, this.ordering, this.idFilter, this.sourceFilter, null, this.localTimeFilter, null);
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setIdFilter(IdFilter idFilter) {
            Intrinsics.checkNotNullParameter(idFilter, "idFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.idFilter = idFilter;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setLimit(int limit) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (limit < 1) {
                throw new InvalidRequestException(1001, "Limit should be greater than zero");
            }
            this.limit = Integer.valueOf(limit);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setLocalDateFilter(LocalDateFilter localDateFilter) {
            Intrinsics.checkNotNullParameter(localDateFilter, "localDateFilter");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            LocalTimeFilter.Companion companion = LocalTimeFilter.INSTANCE;
            LocalDate startDate = localDateFilter.getStartDate();
            LocalDateTime atStartOfDay = startDate != null ? startDate.atStartOfDay() : null;
            LocalDate endDate = localDateFilter.getEndDate();
            this.localTimeFilter = companion.of(atStartOfDay, endDate != null ? endDate.atStartOfDay() : null, localDateFilter.getIsInclusiveStart(), localDateFilter.getIsInclusiveEnd());
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setOrdering(Ordering ordering) {
            Intrinsics.checkNotNullParameter(ordering, "ordering");
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.ordering = ordering;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setPageSize(int pageSize) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            if (pageSize < 1) {
                throw new InvalidRequestException(1001, "Page size should be greater than zero");
            }
            this.pageSize = Integer.valueOf(pageSize);
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setPageToken(String pageToken) {
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.pageToken = pageToken;
            return this;
        }

        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final LocalDateBuilder<T> setSourceFilter(ReadSourceFilter sourceFilter) {
            Intrinsics.checkNotNullParameter(sourceFilter, "sourceFilter");
            Object deviceType = sourceFilter.getDeviceType();
            if (deviceType != null) {
                int i = this.requiredVersion;
                Intrinsics.checkNotNullParameter(deviceType, "deviceType");
                Enum r0 = deviceType instanceof DeviceGroup ? (Enum) deviceType : (AccessoryType) deviceType;
                Class declaringClass = r0.getDeclaringClass();
                Intrinsics.checkNotNullExpressionValue(declaringClass, "this as java.lang.Enum<E>).declaringClass");
                f0 f0Var = (f0) declaringClass.getField(r0.name()).getAnnotation(f0.class);
                this.requiredVersion = Integer.max(i, f0Var != null ? f0Var.minRequired() : BuildConfig.SDK_VERSION_CODE);
            }
            this.requiredVersion = Integer.max(this.requiredVersion, e2.a());
            this.sourceFilter = sourceFilter;
            return this;
        }

        private LocalDateBuilder(int i, DataType dataType) {
            this.requiredVersion = i;
            this.dataType = dataType;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fJ\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$UserProfileBuilder;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$Builder;", "Lcom/samsung/android/sdk/health/data/data/UserDataPoint;", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "build", "()Lcom/samsung/android/sdk/health/data/request/ReadDataRequest;", "", "requiredVersion", "I", "Lcom/samsung/android/sdk/health/data/request/DataType$UserProfileDataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/DataType$UserProfileDataType;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class UserProfileBuilder implements Builder<UserDataPoint> {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final DataType.UserProfileDataType dataType;
        private final int requiredVersion;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$UserProfileBuilder$Companion;", "", "", "requiredVersion", "Lcom/samsung/android/sdk/health/data/request/DataType$UserProfileDataType;", "dataType", "Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$UserProfileBuilder;", "builder$SDK_clientRelease", "(ILcom/samsung/android/sdk/health/data/request/DataType$UserProfileDataType;)Lcom/samsung/android/sdk/health/data/request/ReadDataRequest$UserProfileBuilder;", "builder", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final /* synthetic */ UserProfileBuilder builder$SDK_clientRelease(int requiredVersion, DataType.UserProfileDataType dataType) {
                Intrinsics.checkNotNullParameter(dataType, "dataType");
                return new UserProfileBuilder(requiredVersion, dataType, null);
            }

            private Companion() {
            }
        }

        public /* synthetic */ UserProfileBuilder(int i, DataType.UserProfileDataType userProfileDataType, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, userProfileDataType);
        }

        @Override // com.samsung.android.sdk.health.data.request.ReadDataRequest.Builder
        public ReadDataRequest<UserDataPoint> build() {
            return new ReadDataRequest<>(this.requiredVersion, this.dataType, null, null, null, null, null, null, null, null, null);
        }

        private UserProfileBuilder(int i, DataType.UserProfileDataType userProfileDataType) {
            this.requiredVersion = i;
            this.dataType = userProfileDataType;
        }
    }

    public /* synthetic */ ReadDataRequest(int i, DataType dataType, Integer num, Integer num2, String str, Ordering ordering, IdFilter idFilter, ReadSourceFilter readSourceFilter, InstantTimeFilter instantTimeFilter, LocalTimeFilter localTimeFilter, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, dataType, num, num2, str, ordering, idFilter, readSourceFilter, instantTimeFilter, localTimeFilter);
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

    public final Integer getLimit() {
        return this.limit;
    }

    public final LocalTimeFilter getLocalTimeFilter() {
        return this.localTimeFilter;
    }

    public final Ordering getOrdering() {
        return this.ordering;
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

    public final ReadSourceFilter getSourceFilter() {
        return this.sourceFilter;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write((ReadDataRequest<DataPoint>) this, parcel, flags);
    }

    private ReadDataRequest(int i, DataType dataType, Integer num, Integer num2, String str, Ordering ordering, IdFilter idFilter, ReadSourceFilter readSourceFilter, InstantTimeFilter instantTimeFilter, LocalTimeFilter localTimeFilter) {
        this.requiredVersion = i;
        this.dataType = dataType;
        this.limit = num;
        this.pageSize = num2;
        this.pageToken = str;
        this.ordering = ordering;
        this.idFilter = idFilter;
        this.sourceFilter = readSourceFilter;
        this.instantTimeFilter = instantTimeFilter;
        this.localTimeFilter = localTimeFilter;
    }
}
