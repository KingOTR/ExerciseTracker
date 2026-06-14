package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RepositoryExerciseTrackerGateway.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryExerciseTrackerGateway", f = "RepositoryExerciseTrackerGateway.kt", i = {0}, l = {76}, m = "stravaTrainingSessions", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RepositoryExerciseTrackerGateway$stravaTrainingSessions$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RepositoryExerciseTrackerGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepositoryExerciseTrackerGateway$stravaTrainingSessions$1(RepositoryExerciseTrackerGateway repositoryExerciseTrackerGateway, Continuation<? super RepositoryExerciseTrackerGateway$stravaTrainingSessions$1> continuation) {
        super(continuation);
        this.this$0 = repositoryExerciseTrackerGateway;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.stravaTrainingSessions(this);
    }
}
