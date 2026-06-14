package com.samsung.android.sdk.health.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes5.dex */
public final class f1 extends Lambda implements Function1 {
    public final /* synthetic */ CancellableContinuation a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(CancellableContinuation cancellableContinuation) {
        super(1);
        this.a = cancellableContinuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable throwable = (Throwable) obj;
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        this.a.cancel(throwable);
        return Unit.INSTANCE;
    }
}
