package com.samsung.android.sdk.health.data.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.device.Device;
import com.samsung.android.sdk.health.data.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parceler;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/samsung/android/sdk/health/data/response/DeviceResponse;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "Lcom/samsung/android/sdk/health/data/device/Device;", "a", "Ljava/util/List;", "getDeviceList", "()Ljava/util/List;", "deviceList", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DeviceResponse implements Parcelable {

    /* renamed from: a, reason: from kotlin metadata */
    private final List deviceList;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeviceResponse> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J#\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/samsung/android/sdk/health/data/response/DeviceResponse$Companion;", "Lkotlinx/parcelize/Parceler;", "Lcom/samsung/android/sdk/health/data/response/DeviceResponse;", "Landroid/os/Parcel;", "parcel", "", "flags", "", "write", "(Lcom/samsung/android/sdk/health/data/response/DeviceResponse;Landroid/os/Parcel;I)V", "create", "(Landroid/os/Parcel;)Lcom/samsung/android/sdk/health/data/response/DeviceResponse;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion implements Parceler<DeviceResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public DeviceResponse[] newArray(int i) {
            return (DeviceResponse[]) Parceler.DefaultImpls.newArray(this, i);
        }

        private Companion() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlinx.parcelize.Parceler
        public DeviceResponse create(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceResponse(parcel, null);
        }

        @Override // kotlinx.parcelize.Parceler
        public void write(DeviceResponse deviceResponse, Parcel parcel, int i) {
            Intrinsics.checkNotNullParameter(deviceResponse, "<this>");
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            g.a(parcel, deviceResponse.getDeviceList());
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceResponse createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return DeviceResponse.INSTANCE.create(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceResponse[] newArray(int i) {
            return new DeviceResponse[i];
        }
    }

    public /* synthetic */ DeviceResponse(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final List<Device> getDeviceList() {
        return this.deviceList;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        INSTANCE.write(this, parcel, flags);
    }

    private DeviceResponse(ArrayList arrayList) {
        this.deviceList = arrayList;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private DeviceResponse(Parcel parcel) {
        this(r2);
        ArrayList a = g.a(parcel);
        Intrinsics.checkNotNullExpressionValue(a, "readLargeListFromParcel(parcel)");
    }
}
