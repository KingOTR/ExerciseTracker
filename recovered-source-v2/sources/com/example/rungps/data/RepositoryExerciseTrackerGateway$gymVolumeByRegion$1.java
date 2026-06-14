package com.example.rungps.data;

import androidx.health.connect.client.records.ExerciseSegment;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RepositoryExerciseTrackerGateway.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RepositoryExerciseTrackerGateway", f = "RepositoryExerciseTrackerGateway.kt", i = {}, l = {ExerciseSegment.EXERCISE_SEGMENT_TYPE_SINGLE_ARM_TRICEPS_EXTENSION}, m = "gymVolumeByRegion", n = {}, s = {})
/* loaded from: classes3.dex */
final class RepositoryExerciseTrackerGateway$gymVolumeByRegion$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RepositoryExerciseTrackerGateway this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RepositoryExerciseTrackerGateway$gymVolumeByRegion$1(RepositoryExerciseTrackerGateway repositoryExerciseTrackerGateway, Continuation<? super RepositoryExerciseTrackerGateway$gymVolumeByRegion$1> continuation) {
        super(continuation);
        this.this$0 = repositoryExerciseTrackerGateway;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.gymVolumeByRegion(0, this);
    }
}
