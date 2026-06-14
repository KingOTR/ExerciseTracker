package com.example.rungps.widget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WidgetRefreshWorker.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.widget.WidgetRefreshWorker", f = "WidgetRefreshWorker.kt", i = {0, 0, 1, 1, 2}, l = {20, 21, 22}, m = "doWork", n = {"$this$doWork_u24lambda_u241", "app", "$this$doWork_u24lambda_u241", "app", "app"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class WidgetRefreshWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WidgetRefreshWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WidgetRefreshWorker$doWork$1(WidgetRefreshWorker widgetRefreshWorker, Continuation<? super WidgetRefreshWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = widgetRefreshWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
