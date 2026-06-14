package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.request.DeviceRegistrationRequest;
import java.util.function.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class b0 extends Lambda implements Function1 {
    public final /* synthetic */ c0 a;
    public final /* synthetic */ DeviceRegistrationRequest b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, DeviceRegistrationRequest deviceRegistrationRequest, c cVar) {
        super(1);
        this.a = c0Var;
        this.b = deviceRegistrationRequest;
        this.c = cVar;
    }

    public final void a(IHealthDataStore storeInterface) {
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        storeInterface.registerDevice(this.a.a, this.b, com.samsung.android.sdk.health.data.internal.m.a(this.c, new Function() { // from class: com.samsung.android.sdk.health.data.b0$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return b0.a((String) obj);
            }
        }));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        a((IHealthDataStore) obj);
        return Unit.INSTANCE;
    }

    public static final String a(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        return id;
    }
}
