package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6}, l = {771, 774, 780, 782, 783, 790, 791}, m = "backfillGymCarryover", n = {"this", "splitId", "this", "dayIds", "splitId", "this", "written", "sess", "splitId", "tid", "this", "written", "sess", "splitId", "tid", "this", "written", "sess", "templates", "splitId", "tid", "this", "written", "sess", "spec", "splitId", "tid", "this", "written", "sess", "splitId", "tid"}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "L$3", "J$0", "J$1", "L$0", "L$1", "L$3", "J$0", "J$1", "L$0", "L$1", "L$3", "L$4", "J$0", "J$1", "L$0", "L$1", "L$3", "L$5", "J$0", "J$1", "L$0", "L$1", "L$3", "J$0", "J$1"})
/* loaded from: classes3.dex */
final class Repository$backfillGymCarryover$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$backfillGymCarryover$1(Repository repository, Continuation<? super Repository$backfillGymCarryover$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.backfillGymCarryover(0L, this);
    }
}
