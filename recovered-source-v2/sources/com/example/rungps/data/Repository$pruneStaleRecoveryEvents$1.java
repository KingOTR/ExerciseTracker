package com.example.rungps.data;

import androidx.core.view.PointerIconCompat;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 1, 2, 2, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6}, l = {1001, 1002, PointerIconCompat.TYPE_HELP, PointerIconCompat.TYPE_CELL, PointerIconCompat.TYPE_CROSSHAIR, PointerIconCompat.TYPE_TEXT, PointerIconCompat.TYPE_NO_DROP, PointerIconCompat.TYPE_HORIZONTAL_DOUBLE_ARROW}, m = "pruneStaleRecoveryEvents", n = {"this", "this", "this", "linkedStrava", "this", "linkedStrava", "e", "this", "linkedStrava", "e", "this", "linkedStrava", "e", "this", "linkedStrava"}, s = {"L$0", "L$0", "L$0", "L$1", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1", "L$3", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class Repository$pruneStaleRecoveryEvents$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$pruneStaleRecoveryEvents$1(Repository repository, Continuation<? super Repository$pruneStaleRecoveryEvents$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pruneStaleRecoveryEvents(this);
    }
}
