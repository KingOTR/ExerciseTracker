package com.example.rungps.data;

import androidx.health.connect.client.records.ExerciseSegment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RepositoryGymSessions.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryGymSessionsKt", f = "RepositoryGymSessions.kt", i = {0, 0, 0, 0, 1}, l = {ExerciseSegment.EXERCISE_SEGMENT_TYPE_YOGA, 89}, m = "importRemoteGymSessionImpl", n = {"$this$importRemoteGymSessionImpl", "sets", "startedAtMs", "endedAtMs", "sid"}, s = {"L$0", "L$1", "J$0", "J$1", "J$0"})
/* loaded from: classes3.dex */
final class RepositoryGymSessionsKt$importRemoteGymSessionImpl$1 extends ContinuationImpl {
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    RepositoryGymSessionsKt$importRemoteGymSessionImpl$1(Continuation<? super RepositoryGymSessionsKt$importRemoteGymSessionImpl$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RepositoryGymSessionsKt.importRemoteGymSessionImpl(null, null, 0L, 0L, null, false, null, null, null, null, this);
    }
}
