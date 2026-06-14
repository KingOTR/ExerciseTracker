package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, l = {2248, 2269}, m = "localPbsFromSplitsWithRuns", n = {"this", "targets", "bestByLabel", "isBike", "maxSplitTargetM", "splitDurationMaxMs", "targets", "bestByLabel", "finishedRuns", "maxSplitTargetM", "splitDurationMaxMs"}, s = {"L$0", "L$1", "L$2", "Z$0", "D$0", "J$0", "L$0", "L$1", "L$2", "D$0", "J$0"})
/* loaded from: classes3.dex */
final class Repository$localPbsFromSplitsWithRuns$3 extends ContinuationImpl {
    double D$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$localPbsFromSplitsWithRuns$3(Repository repository, Continuation<? super Repository$localPbsFromSplitsWithRuns$3> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object localPbsFromSplitsWithRuns;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        localPbsFromSplitsWithRuns = this.this$0.localPbsFromSplitsWithRuns(null, false, 0.0d, 0L, this);
        return localPbsFromSplitsWithRuns;
    }
}
