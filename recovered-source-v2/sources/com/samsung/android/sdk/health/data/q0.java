package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.internal.SingleCallback;
import com.samsung.android.sdk.health.data.request.ReadDataRequest;
import com.samsung.android.sdk.health.data.response.DataResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class q0 extends Lambda implements Function1 {
    public final /* synthetic */ s0 a;
    public final /* synthetic */ ReadDataRequest b;
    public final /* synthetic */ c c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(s0 s0Var, ReadDataRequest readDataRequest, c cVar) {
        super(1);
        this.a = s0Var;
        this.b = readDataRequest;
        this.c = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        IHealthDataStore storeInterface = (IHealthDataStore) obj;
        Intrinsics.checkNotNullParameter(storeInterface, "storeInterface");
        String str = this.a.a;
        ReadDataRequest readDataRequest = this.b;
        SingleCallback<DataResponse> a = com.samsung.android.sdk.health.data.internal.m.a(this.c, null);
        Intrinsics.checkNotNull(a, "null cannot be cast to non-null type com.samsung.android.sdk.health.data.internal.SingleCallback<com.samsung.android.sdk.health.data.response.DataResponse<android.os.Parcelable>>");
        storeInterface.readData(str, readDataRequest, a);
        return Unit.INSTANCE;
    }
}
