package com.samsung.android.sdk.health.data;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes5.dex */
public final class l1 implements Runnable {
    public final /* synthetic */ CancellableContinuation a;

    public l1(CancellableContinuation cancellableContinuation) {
        this.a = cancellableContinuation;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.resume((CancellableContinuation) Unit.INSTANCE, (Function1<? super Throwable, Unit>) new k1(this.a));
    }
}
