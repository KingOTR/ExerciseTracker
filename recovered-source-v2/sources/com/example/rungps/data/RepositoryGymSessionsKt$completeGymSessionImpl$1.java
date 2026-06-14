package com.example.rungps.data;

import androidx.health.connect.client.records.ExerciseSegment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RepositoryGymSessions.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryGymSessionsKt", f = "RepositoryGymSessions.kt", i = {0, 0, 0, 0, 1, 1, 1, 1, 1, 3, 3, 3, 4, 4, 4, 5, 5, 5, 6, 6, 6, 7, 7, 7, 8, 8, 8, 9, 9, 9}, l = {12, 13, 16, 24, 25, 40, 41, 42, 44, ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION}, m = "completeGymSessionImpl", n = {"$this$completeGymSessionImpl", "context", "endedAtMs", "sessionId", "$this$completeGymSessionImpl", "context", "endedAtMs", "sess", "sessionId", "$this$completeGymSessionImpl", "context", "sessionId", "$this$completeGymSessionImpl", "context", "sessionId", "$this$completeGymSessionImpl", "context", "sessionId", "$this$completeGymSessionImpl", "context", "sessionId", "$this$completeGymSessionImpl", "context", "sessionId", "$this$completeGymSessionImpl", "context", "sessionId", "$this$completeGymSessionImpl", "context", "sessionId"}, s = {"L$0", "L$1", "L$2", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0", "L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class RepositoryGymSessionsKt$completeGymSessionImpl$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    RepositoryGymSessionsKt$completeGymSessionImpl$1(Continuation<? super RepositoryGymSessionsKt$completeGymSessionImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RepositoryGymSessionsKt.completeGymSessionImpl(null, null, 0L, null, this);
    }
}
