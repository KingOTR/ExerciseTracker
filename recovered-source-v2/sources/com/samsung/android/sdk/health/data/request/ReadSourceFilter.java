package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.caverock.androidsvg.SVGParser;
import com.samsung.android.sdk.health.data.d0;
import com.samsung.android.sdk.health.data.device.DeviceType;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00178F¢\u0006\f\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "isLocalDevice", "Z", "()Z", "", "appId", "Ljava/lang/String;", "getAppId", "()Ljava/lang/String;", "deviceGroup", "I", "accessoryType", "Lcom/samsung/android/sdk/health/data/device/DeviceType;", "getDeviceType", "()Lcom/samsung/android/sdk/health/data/device/DeviceType;", "getDeviceType$annotations", "()V", "deviceType", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class ReadSourceFilter implements Parcelable {
    private final int accessoryType;
    private final String appId;
    private final int deviceGroup;
    private final boolean isLocalDevice;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<ReadSourceFilter> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter$Companion;", "", "", "appId", "Lcom/samsung/android/sdk/health/data/device/DeviceType;", SVGParser.XML_STYLESHEET_ATTR_TYPE, "Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "of", "(Ljava/lang/String;Lcom/samsung/android/sdk/health/data/device/DeviceType;)Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "fromPlatform", "()Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "fromLocalDevice", "fromDeviceType", "(Lcom/samsung/android/sdk/health/data/device/DeviceType;)Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "fromApplicationId", "(Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/ReadSourceFilter;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final ReadSourceFilter fromApplicationId(String appId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            return new ReadSourceFilter(false, appId, -1, -1, null);
        }

        @JvmStatic
        public final ReadSourceFilter fromDeviceType(DeviceType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            Pair a = d0.a(type);
            return new ReadSourceFilter(false, null, ((Number) a.getFirst()).intValue(), ((Number) a.getSecond()).intValue(), null);
        }

        @JvmStatic
        public final ReadSourceFilter fromLocalDevice() {
            return new ReadSourceFilter(true, null, -1, -1, null);
        }

        @JvmStatic
        public final ReadSourceFilter fromPlatform() {
            return new ReadSourceFilter(false, "com.sec.android.app.shealth", -1, -1, null);
        }

        @JvmStatic
        public final ReadSourceFilter of(String appId, DeviceType type) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(type, "type");
            Pair a = d0.a(type);
            return new ReadSourceFilter(false, appId, ((Number) a.getFirst()).intValue(), ((Number) a.getSecond()).intValue(), null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ReadSourceFilter> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReadSourceFilter createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReadSourceFilter(parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readInt(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReadSourceFilter[] newArray(int i) {
            return new ReadSourceFilter[i];
        }
    }

    public /* synthetic */ ReadSourceFilter(boolean z, String str, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, str, i, i2);
    }

    @JvmStatic
    public static final ReadSourceFilter fromApplicationId(String str) {
        return INSTANCE.fromApplicationId(str);
    }

    @JvmStatic
    public static final ReadSourceFilter fromDeviceType(DeviceType deviceType) {
        return INSTANCE.fromDeviceType(deviceType);
    }

    @JvmStatic
    public static final ReadSourceFilter fromLocalDevice() {
        return INSTANCE.fromLocalDevice();
    }

    @JvmStatic
    public static final ReadSourceFilter fromPlatform() {
        return INSTANCE.fromPlatform();
    }

    public static /* synthetic */ void getDeviceType$annotations() {
    }

    @JvmStatic
    public static final ReadSourceFilter of(String str, DeviceType deviceType) {
        return INSTANCE.of(str, deviceType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final DeviceType getDeviceType() {
        int i = this.deviceGroup;
        if (i == -1) {
            return null;
        }
        return d0.a(i, this.accessoryType);
    }

    /* renamed from: isLocalDevice, reason: from getter */
    public final boolean getIsLocalDevice() {
        return this.isLocalDevice;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.isLocalDevice ? 1 : 0);
        parcel.writeString(this.appId);
        parcel.writeInt(this.deviceGroup);
        parcel.writeInt(this.accessoryType);
    }

    private ReadSourceFilter(boolean z, String str, int i, int i2) {
        this.isLocalDevice = z;
        this.appId = str;
        this.deviceGroup = i;
        this.accessoryType = i2;
    }
}
