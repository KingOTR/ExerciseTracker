package com.samsung.android.sdk.health.data.response;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.exifinterface.media.ExifInterface;
import com.samsung.android.sdk.health.data.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0007\b\u0007\u0018\u0000 \u0018*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001:\u0001\u0018J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/samsung/android/sdk/health/data/response/DataResponse;", "Landroid/os/Parcelable;", ExifInterface.GPS_DIRECTION_TRUE, "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "a", "Ljava/lang/String;", "getPageToken", "()Ljava/lang/String;", "pageToken", "", "b", "Ljava/util/List;", "getDataList", "()Ljava/util/List;", "dataList", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DataResponse<T extends Parcelable> implements Parcelable {

    /* renamed from: a, reason: from kotlin metadata */
    private final String pageToken;

    /* renamed from: b, reason: from kotlin metadata */
    private final List dataList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DataResponse<?>> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001J'\u0010\b\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/response/DataResponse$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/samsung/android/sdk/health/data/response/DataResponse;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "write", "(Lcom/samsung/android/sdk/health/data/response/DataResponse;Landroid/os/Parcel;I)V", "create", "(Landroid/os/Parcel;)Lcom/samsung/android/sdk/health/data/response/DataResponse;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parceler<DataResponse<?>> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public DataResponse<?>[] newArray(int i) {
            return (DataResponse[]) Parceler.DefaultImpls.newArray(this, i);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public DataResponse<?> create(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DataResponse<>(parcel, (DefaultConstructorMarker) null);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(DataResponse<?> dataResponse, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(dataResponse, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            parcel.writeString(dataResponse.getPageToken());
            g.a(parcel, dataResponse.getDataList());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DataResponse<?>> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataResponse<?> createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return DataResponse.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DataResponse<?>[] newArray(int i) {
            return new DataResponse[i];
        }
    }

    public /* synthetic */ DataResponse(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<T> getDataList() {
        return this.dataList;
    }

    public final String getPageToken() {
        return this.pageToken;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write((DataResponse<?>) this, parcel, flags);
    }

    private DataResponse(String str, ArrayList arrayList) {
        this.pageToken = str;
        this.dataList = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DataResponse(Parcel parcel) {
        this(r0, r3);
        String readString = parcel.readString();
        ArrayList a = g.a(parcel);
        Intrinsics.checkNotNullExpressionValue(a, "readLargeListFromParcel(parcel)");
    }
}
