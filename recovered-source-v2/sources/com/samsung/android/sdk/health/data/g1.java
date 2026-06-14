package com.samsung.android.sdk.health.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes5.dex */
public final class g1 extends Lambda implements Function1 {
    public final /* synthetic */ CancellableContinuation a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(CancellableContinuation cancellableContinuation) {
        super(1);
        this.a = cancellableContinuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        CancellableContinuation cancellableContinuation = this.a;
        cancellableContinuation.resume((CancellableContinuation) obj, (Function1<? super Throwable, Unit>) new f1(cancellableContinuation));
        return Unit.INSTANCE;
    }
}
