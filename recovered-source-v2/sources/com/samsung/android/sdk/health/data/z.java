package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.device.Device;
import com.samsung.android.sdk.health.data.response.DeviceResponse;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class z extends Lambda implements Function1 {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(c0 c0Var, int i, c cVar) {
        super(1);
        this.a = c0Var;
        this.b = i;
        this.c = cVar;
    }

    public final void a(IHealthDataStore storeInterface) {
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        storeInterface.getLocalDevice2(this.a.a, this.b, com.samsung.android.sdk.health.data.internal.m.a(this.c, new Function() { // from class: com.samsung.android.sdk.health.data.z$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return z.a((DeviceResponse) obj);
            }
        }));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((IHealthDataStore) obj);
        return Unit.INSTANCE;
    }

    public static final Device a(DeviceResponse deviceResponse) {
        Intrinsics.checkNotNullParameter(deviceResponse, "deviceResponse");
        return deviceResponse.getDeviceList().get(0);
    }
}
