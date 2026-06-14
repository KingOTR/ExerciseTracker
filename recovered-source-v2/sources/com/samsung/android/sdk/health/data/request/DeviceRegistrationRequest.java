package com.samsung.android.sdk.health.data.request;

import android.os.Parcel;
import android.os.Parcelable;
import com.samsung.android.sdk.health.data.BuildConfig;
import com.samsung.android.sdk.health.data.device.AccessoryType;
import com.samsung.android.sdk.health.data.device.Device;
import com.samsung.android.sdk.health.data.device.DeviceGroup;
import com.samsung.android.sdk.health.data.e2;
import com.samsung.android.sdk.health.data.f0;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u0004R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DeviceRegistrationRequest;", "Landroid/os/Parcelable;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "requiredVersion", "I", "getRequiredVersion", "Lcom/samsung/android/sdk/health/data/device/Device;", "device", "Lcom/samsung/android/sdk/health/data/device/Device;", "getDevice", "()Lcom/samsung/android/sdk/health/data/device/Device;", "", "seed", "Ljava/lang/String;", "getSeed", "()Ljava/lang/String;", "Companion", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes5.dex */
public final class DeviceRegistrationRequest implements Parcelable {
    private final Device device;
    private final int requiredVersion;
    private final String seed;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final Parcelable.Creator<DeviceRegistrationRequest> CREATOR = new Creator();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/samsung/android/sdk/health/data/request/DeviceRegistrationRequest$Companion;", "", "Lcom/samsung/android/sdk/health/data/device/Device;", "device", "", "seed", "Lcom/samsung/android/sdk/health/data/request/DeviceRegistrationRequest;", "registerDevice", "(Lcom/samsung/android/sdk/health/data/device/Device;Ljava/lang/String;)Lcom/samsung/android/sdk/health/data/request/DeviceRegistrationRequest;", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
        public final DeviceRegistrationRequest registerDevice(Device device, String seed) {
            Intrinsics.checkNotNullParameter(device, "device");
            Intrinsics.checkNotNullParameter(seed, "seed");
            int a = e2.a();
            Object deviceType = device.getDeviceType();
            Intrinsics.checkNotNullParameter(deviceType, "deviceType");
            Enum r0 = deviceType instanceof DeviceGroup ? (Enum) deviceType : (AccessoryType) deviceType;
            Class declaringClass = r0.getDeclaringClass();
            Intrinsics.checkNotNullExpressionValue(declaringClass, "this as java.lang.Enum<E>).declaringClass");
            f0 f0Var = (f0) declaringClass.getField(r0.name()).getAnnotation(f0.class);
            return new DeviceRegistrationRequest(Integer.max(a, f0Var != null ? f0Var.minRequired() : BuildConfig.SDK_VERSION_CODE), device, seed, null);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DeviceRegistrationRequest> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceRegistrationRequest createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new DeviceRegistrationRequest(parcel.readInt(), Device.CREATOR.createFromParcel(parcel), parcel.readString(), null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final DeviceRegistrationRequest[] newArray(int i) {
            return new DeviceRegistrationRequest[i];
        }
    }

    public /* synthetic */ DeviceRegistrationRequest(int i, Device device, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, device, str);
    }

    @JvmStatic
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public static final DeviceRegistrationRequest registerDevice(Device device, String str) {
        return INSTANCE.registerDevice(device, str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final Device getDevice() {
        return this.device;
    }

    public final int getRequiredVersion() {
        return this.requiredVersion;
    }

    public final String getSeed() {
        return this.seed;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.requiredVersion);
        this.device.writeToParcel(parcel, flags);
        parcel.writeString(this.seed);
    }

    private DeviceRegistrationRequest(int i, Device device, String str) {
        this.requiredVersion = i;
        this.device = device;
        this.seed = str;
    }
}
