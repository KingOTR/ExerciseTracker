package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RepositoryExerciseTrackerGateway.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryExerciseTrackerGateway", f = "RepositoryExerciseTrackerGateway.kt", i = {0, 0}, l = {66}, m = "steps7dTotal", n = {"nowMs", "weekStart"}, s = {"J$0", "J$1"})
/* loaded from: classes3.dex */
final class RepositoryExerciseTrackerGateway$steps7dTotal$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RepositoryExerciseTrackerGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepositoryExerciseTrackerGateway$steps7dTotal$1(RepositoryExerciseTrackerGateway repositoryExerciseTrackerGateway, Continuation<? super RepositoryExerciseTrackerGateway$steps7dTotal$1> continuation) {
        super(continuation);
        this.this$0 = repositoryExerciseTrackerGateway;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.steps7dTotal(0L, this);
    }
}
