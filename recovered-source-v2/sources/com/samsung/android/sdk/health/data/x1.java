package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.helper.RequestHelperKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes5.dex */
public final class x1 extends ContinuationImpl {
    public HealthDataStore a;
    public /* synthetic */ Object b;
    public int c;

    public x1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.c |= Integer.MIN_VALUE;
        return RequestHelperKt.readChange(null, null, null, this);
    }
}
