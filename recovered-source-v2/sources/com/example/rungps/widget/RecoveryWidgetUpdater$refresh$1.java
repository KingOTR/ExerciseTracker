package com.example.rungps.widget;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RecoveryWidgetUpdater.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.widget.RecoveryWidgetUpdater", f = "RecoveryWidgetUpdater.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, l = {22, 23, 24, 25, 26}, m = "refresh", n = {"this", "app", "repo", "zone", "now", "this", "app", "repo", "zone", "runs", "now", "this", "app", "repo", "zone", "runs", "gym", "now", "this", "app", "zone", "runs", "gym", "recovery", "now", "this", "app", "zone", "gym", "recovery", "now"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "J$0", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0"})
/* loaded from: classes3.dex */
final class RecoveryWidgetUpdater$refresh$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RecoveryWidgetUpdater this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecoveryWidgetUpdater$refresh$1(RecoveryWidgetUpdater recoveryWidgetUpdater, Continuation<? super RecoveryWidgetUpdater$refresh$1> continuation) {
        super(continuation);
        this.this$0 = recoveryWidgetUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.refresh(null, this);
    }
}
