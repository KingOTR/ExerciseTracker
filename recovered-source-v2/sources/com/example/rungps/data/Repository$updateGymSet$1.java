package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4}, l = {2024, 2034, 2035, 2036, 2039, 2047}, m = "updateGymSet", n = {"this", "reps", "id", "weightKg", "this", "reps", "existing", "loggedAt", "id", "weightKg", "now", "wasFilled", "nowFilled", "this", "reps", "existing", "loggedAt", "priorPr", "id", "weightKg", "now", "wasFilled", "nowFilled", "this", "reps", "existing", "loggedAt", "priorPr", "weightKg", "now", "wasFilled", "nowFilled", "this", "loggedAt", "set", "now", "nowFilled"}, s = {"L$0", "L$1", "J$0", "D$0", "L$0", "L$1", "L$2", "L$3", "J$0", "D$0", "J$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "J$0", "D$0", "J$1", "I$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "D$0", "J$0", "I$0", "I$1", "L$0", "L$1", "L$2", "J$0", "I$0"})
/* loaded from: classes3.dex */
final class Repository$updateGymSet$1 extends ContinuationImpl {
    double D$0;
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$updateGymSet$1(Repository repository, Continuation<? super Repository$updateGymSet$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateGymSet(0L, null, 0.0d, this);
    }
}
