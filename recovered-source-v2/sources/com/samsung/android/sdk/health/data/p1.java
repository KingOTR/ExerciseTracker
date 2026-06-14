package com.samsung.android.sdk.health.data;

import java.util.function.Consumer;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final /* synthetic */ class p1 implements Consumer {
    public final /* synthetic */ Function1 a;

    public p1(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.a = function;
    }

    @Override // java.util.function.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.a.invoke(obj);
    }
}
