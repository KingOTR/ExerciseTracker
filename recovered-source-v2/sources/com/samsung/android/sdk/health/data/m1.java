package com.samsung.android.sdk.health.data;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;

/* loaded from: classes5.dex */
public final class m1 extends Lambda implements Function1 {
    public final /* synthetic */ CancellableContinuation a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(CancellableContinuation cancellableContinuation) {
        super(1);
        this.a = cancellableContinuation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Throwable it = (Throwable) obj;
        Intrinsics.checkNotNullParameter(it, "it");
        if (this.a.isActive()) {
            CancellableContinuation cancellableContinuation = this.a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m7905constructorimpl(ResultKt.createFailure(it)));
        }
        return Unit.INSTANCE;
    }
}
