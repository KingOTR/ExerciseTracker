package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.response.AsyncSingleFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class j1 extends Lambda implements Function1 {
    public final /* synthetic */ AsyncSingleFuture a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(AsyncSingleFuture asyncSingleFuture) {
        super(1);
        this.a = asyncSingleFuture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.cancel(true);
        return Unit.INSTANCE;
    }
}
