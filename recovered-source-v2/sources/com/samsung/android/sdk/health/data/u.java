package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.device.Device;
import com.samsung.android.sdk.health.data.response.DeviceResponse;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class u extends Lambda implements Function1 {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(c0 c0Var, int i, String str, c cVar) {
        super(1);
        this.a = c0Var;
        this.b = i;
        this.c = str;
        this.d = cVar;
    }

    public final void a(IHealthDataStore storeInterface) {
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        storeInterface.getDevice2(this.a.a, this.b, this.c, com.samsung.android.sdk.health.data.internal.m.a(this.d, new Function() { // from class: com.samsung.android.sdk.health.data.u$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return u.a((DeviceResponse) obj);
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
        if (deviceResponse.getDeviceList().isEmpty()) {
            return null;
        }
        return deviceResponse.getDeviceList().get(0);
    }
}
