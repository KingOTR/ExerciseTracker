package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.response.DeviceResponse;
import java.util.List;
import java.util.function.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class w extends Lambda implements Function1 {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Pair c;
    public final /* synthetic */ c d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(c0 c0Var, int i, Pair pair, c cVar) {
        super(1);
        this.a = c0Var;
        this.b = i;
        this.c = pair;
        this.d = cVar;
    }

    public final void a(IHealthDataStore storeInterface) {
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        storeInterface.getDevices2(this.a.a, this.b, ((Number) this.c.getFirst()).intValue(), ((Number) this.c.getSecond()).intValue(), com.samsung.android.sdk.health.data.internal.m.a(this.d, new Function() { // from class: com.samsung.android.sdk.health.data.w$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return w.a((DeviceResponse) obj);
            }
        }));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((IHealthDataStore) obj);
        return Unit.INSTANCE;
    }

    public static final List a(DeviceResponse deviceResponse) {
        Intrinsics.checkNotNullParameter(deviceResponse, "deviceResponse");
        return deviceResponse.getDeviceList();
    }
}
