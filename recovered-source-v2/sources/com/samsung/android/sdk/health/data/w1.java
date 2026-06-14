package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.helper.RequestHelperKt;
import com.samsung.android.sdk.health.data.request.DataType;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class w1 extends ContinuationImpl {
    public HealthDataStore a;
    public DataType.Readable b;
    public /* synthetic */ Object c;
    public int d;

    public w1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.d |= Integer.MIN_VALUE;
        return RequestHelperKt.read(null, null, null, this);
    }
}
