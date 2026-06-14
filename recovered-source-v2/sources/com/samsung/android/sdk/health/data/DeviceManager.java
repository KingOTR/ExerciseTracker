package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.device.Device;
import com.samsung.android.sdk.health.data.device.DeviceType;
import com.samsung.android.sdk.health.data.request.DeviceRegistrationRequest;
import com.samsung.android.sdk.health.data.response.AsyncSingleFuture;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u0018\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\b2\u0006\u0010\n\u001a\u00020\u0005H&J\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u000e\u001a\u00020\u000fH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0010J\u001c\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0013\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\b2\u0006\u0010\u0013\u001a\u00020\u0005H&J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\u0016\u001a\u00020\u0005H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\b2\u0006\u0010\u0016\u001a\u00020\u0005H&J\u0011\u0010\u0018\u001a\u00020\u0003H¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\bH&J\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010\u0019J\u0014\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\r0\bH&J\u0019\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH¦@ø\u0001\u0000¢\u0006\u0002\u0010 J\u0016\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u001e\u001a\u00020\u001fH&\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\""}, d2 = {"Lcom/samsung/android/sdk/health/data/DeviceManager;", "", "getDevice", "Lcom/samsung/android/sdk/health/data/device/Device;", "deviceId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDeviceAsync", "Lcom/samsung/android/sdk/health/data/response/AsyncSingleFuture;", "getDeviceBySeed", "seed", "getDeviceBySeedAsync", "getDevices", "", "deviceType", "Lcom/samsung/android/sdk/health/data/device/DeviceType;", "(Lcom/samsung/android/sdk/health/data/device/DeviceType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDevicesAsync", "getDevicesByManufacturer", "manufacturer", "getDevicesByManufacturerAsync", "getDevicesByModel", "model", "getDevicesByModelAsync", "getLocalDevice", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getLocalDeviceAsync", "getOwnDevices", "getOwnDevicesAsync", "registerDevice", "request", "Lcom/samsung/android/sdk/health/data/request/DeviceRegistrationRequest;", "(Lcom/samsung/android/sdk/health/data/request/DeviceRegistrationRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerDeviceAsync", "SDK_clientRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface DeviceManager {
    Object getDevice(String str, Continuation<? super Device> continuation);

    AsyncSingleFuture<Device> getDeviceAsync(String deviceId);

    Object getDeviceBySeed(String str, Continuation<? super Device> continuation);

    AsyncSingleFuture<Device> getDeviceBySeedAsync(String seed);

    Object getDevices(DeviceType deviceType, Continuation<? super List<Device>> continuation);

    AsyncSingleFuture<List<Device>> getDevicesAsync(DeviceType deviceType);

    Object getDevicesByManufacturer(String str, Continuation<? super List<Device>> continuation);

    AsyncSingleFuture<List<Device>> getDevicesByManufacturerAsync(String manufacturer);

    Object getDevicesByModel(String str, Continuation<? super List<Device>> continuation);

    AsyncSingleFuture<List<Device>> getDevicesByModelAsync(String model);

    Object getLocalDevice(Continuation<? super Device> continuation);

    AsyncSingleFuture<Device> getLocalDeviceAsync();

    Object getOwnDevices(Continuation<? super List<Device>> continuation);

    AsyncSingleFuture<List<Device>> getOwnDevicesAsync();

    Object registerDevice(DeviceRegistrationRequest deviceRegistrationRequest, Continuation<? super String> continuation);

    AsyncSingleFuture<String> registerDeviceAsync(DeviceRegistrationRequest request);
}
