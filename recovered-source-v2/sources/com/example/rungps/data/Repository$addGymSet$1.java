package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 3}, l = {1973, 1976, 1977, 1989}, m = "addGymSet", n = {"this", "reps", "sessionId", "setIndex", "weightKg", "this", "reps", "canonical", "sessionId", "setIndex", "weightKg", "now", "filled", "this", "reps", "canonical", "priorPr", "sessionId", "weightKg", "filled", "id"}, s = {"L$0", "L$1", "J$0", "I$0", "D$0", "L$0", "L$1", "L$2", "J$0", "I$0", "D$0", "J$1", "I$1", "L$0", "L$1", "L$2", "L$3", "J$0", "D$0", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class Repository$addGymSet$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$addGymSet$1(Repository repository, Continuation<? super Repository$addGymSet$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.addGymSet(0L, null, 0, null, 0.0d, this);
    }
}
