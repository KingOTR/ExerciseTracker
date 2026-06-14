package com.samsung.android.sdk.health.data;

import com.samsung.android.sdk.health.data.response.AsyncCompletableFuture;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes5.dex */
public final class o1 extends Lambda implements Function1 {
    public final /* synthetic */ AsyncCompletableFuture a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(AsyncCompletableFuture asyncCompletableFuture) {
        super(1);
        this.a = asyncCompletableFuture;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        this.a.cancel(true);
        return Unit.INSTANCE;
    }
}
