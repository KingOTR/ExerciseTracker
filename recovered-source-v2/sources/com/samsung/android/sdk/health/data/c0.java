package com.samsung.android.sdk.health.data;

import android.util.Log;
import com.samsung.android.sdk.health.data.device.AccessoryType;
import com.samsung.android.sdk.health.data.device.Device;
import com.samsung.android.sdk.health.data.device.DeviceGroup;
import com.samsung.android.sdk.health.data.device.DeviceType;
import com.samsung.android.sdk.health.data.internal.annotation.ApiVersion;
import com.samsung.android.sdk.health.data.request.DeviceRegistrationRequest;
import com.samsung.android.sdk.health.data.response.AsyncSingleFuture;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.DurationKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes5.dex */
public final class c0 implements DeviceManager {
    public final String a;
    public final s1 b;
    public final CoroutineScope c;
    public final ExecutorService d;

    public c0(String clientName, s1 taskExecutor, CoroutineScope healthStoreScope) {
        Intrinsics.checkNotNullParameter(clientName, "clientName");
        Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
        Intrinsics.checkNotNullParameter(healthStoreScope, "healthStoreScope");
        this.a = clientName;
        this.b = taskExecutor;
        this.c = healthStoreScope;
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        Intrinsics.checkNotNullExpressionValue(newSingleThreadExecutor, "newSingleThreadExecutor()");
        this.d = newSingleThreadExecutor;
    }

    public static final void a(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void b(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void c(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void d(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void e(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void f(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void g(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    public static final void h(c futureTask, Throwable th) {
        Intrinsics.checkNotNullParameter(futureTask, "$futureTask");
        Intrinsics.checkNotNull(th);
        futureTask.a(th);
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<Device> getDeviceAsync(String deviceId) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Log.d("[SHD]DeviceManagerImpl", "getDevice invoked");
        z1.a(deviceId);
        final c cVar = new c("getDevice");
        int a = e2.a();
        this.b.a(a, new u(this, a, deviceId, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda3
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.a(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<Device> getDeviceBySeedAsync(String seed) {
        Intrinsics.checkNotNullParameter(seed, "seed");
        Log.d("[SHD]DeviceManagerImpl", "getDeviceBySeed invoked");
        z1.a(seed);
        final c cVar = new c("getDeviceBySeed");
        int a = e2.a();
        this.b.a(a, new v(this, a, seed, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda5
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.b(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<List<Device>> getDevicesAsync(DeviceType deviceType) {
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Log.d("[SHD]DeviceManagerImpl", "getDevices invoked");
        Objects.requireNonNull(deviceType, "Input data should not be null.");
        Intrinsics.checkNotNullParameter(deviceType, "deviceType");
        Enum r0 = deviceType instanceof DeviceGroup ? (Enum) deviceType : (AccessoryType) deviceType;
        Class declaringClass = r0.getDeclaringClass();
        Intrinsics.checkNotNullExpressionValue(declaringClass, "this as java.lang.Enum<E>).declaringClass");
        f0 f0Var = (f0) declaringClass.getField(r0.name()).getAnnotation(f0.class);
        int max = Integer.max(f0Var != null ? f0Var.minRequired() : BuildConfig.SDK_VERSION_CODE, e2.a());
        Pair a = d0.a(deviceType);
        final c cVar = new c("getDevices");
        this.b.a(max, new w(this, max, a, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda7
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.c(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<List<Device>> getDevicesByManufacturerAsync(String manufacturer) {
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Log.d("[SHD]DeviceManagerImpl", "getDevicesByManufacturer invoked");
        z1.a(manufacturer);
        final c cVar = new c("getDevicesByManufacturer");
        int a = e2.a();
        this.b.a(a, new x(this, a, manufacturer, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda4
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.d(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<List<Device>> getDevicesByModelAsync(String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        Log.d("[SHD]DeviceManagerImpl", "getDevicesByModel invoked");
        z1.a(model);
        final c cVar = new c("getDevicesByModel");
        int a = e2.a();
        this.b.a(a, new y(this, a, model, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda0
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.e(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<Device> getLocalDeviceAsync() {
        Log.d("[SHD]DeviceManagerImpl", "getLocalDevice invoked");
        final c cVar = new c("getLocalDevice");
        int a = e2.a();
        this.b.a(a, new z(this, a, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.f(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<List<Device>> getOwnDevicesAsync() {
        Log.d("[SHD]DeviceManagerImpl", "getOwnDevices invoked");
        final c cVar = new c("getOwnDevices");
        int a = e2.a();
        this.b.a(a, new a0(this, a, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.g(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    @ApiVersion(minRequired = DurationKt.NANOS_IN_MILLIS)
    public AsyncSingleFuture<String> registerDeviceAsync(DeviceRegistrationRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        Log.d("[SHD]DeviceManagerImpl", "registerDevice invoked");
        Objects.requireNonNull(request, "Input data should not be null.");
        int max = Integer.max(request.getRequiredVersion(), e2.a());
        final c cVar = new c("registerDevice");
        this.b.a(max, new b0(this, request, cVar), new Consumer() { // from class: com.samsung.android.sdk.health.data.c0$$ExternalSyntheticLambda6
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                c0.h(c.this, (Throwable) obj);
            }
        });
        return cVar;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object getDevice(String str, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<Device> deviceAsync = getDeviceAsync(str);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(deviceAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(deviceAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object getDevices(DeviceType deviceType, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<List<Device>> devicesAsync = getDevicesAsync(deviceType);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(devicesAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(devicesAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object getLocalDevice(Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<Device> localDeviceAsync = getLocalDeviceAsync();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(localDeviceAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(localDeviceAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object getDevicesByModel(String str, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<List<Device>> devicesByModelAsync = getDevicesByModelAsync(str);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(devicesByModelAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(devicesByModelAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object getDevicesByManufacturer(String str, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<List<Device>> devicesByManufacturerAsync = getDevicesByManufacturerAsync(str);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(devicesByManufacturerAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(devicesByManufacturerAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object registerDevice(DeviceRegistrationRequest deviceRegistrationRequest, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<String> registerDeviceAsync = registerDeviceAsync(deviceRegistrationRequest);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(registerDeviceAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(registerDeviceAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object getOwnDevices(Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<List<Device>> ownDevicesAsync = getOwnDevicesAsync();
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(ownDevicesAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(ownDevicesAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    @Override // com.samsung.android.sdk.health.data.DeviceManager
    public final Object getDeviceBySeed(String str, Continuation continuation) {
        CoroutineScope coroutineScope = this.c;
        ExecutorService executorService = this.d;
        AsyncSingleFuture<Device> deviceBySeedAsync = getDeviceBySeedAsync(str);
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new i1(deviceBySeedAsync, executorService, cancellableContinuationImpl, null), 3, null);
        cancellableContinuationImpl.invokeOnCancellation(new j1(deviceBySeedAsync));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
