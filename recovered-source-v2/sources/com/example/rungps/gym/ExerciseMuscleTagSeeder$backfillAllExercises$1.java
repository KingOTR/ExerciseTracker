package com.example.rungps.gym;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExerciseMuscleTagSeeder.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.gym.ExerciseMuscleTagSeeder", f = "ExerciseMuscleTagSeeder.kt", i = {0, 1, 1, 2, 2, 2, 3, 3, 3}, l = {57, 58, 59, ExerciseSessionRecord.EXERCISE_TYPE_STRETCHING}, m = "backfillAllExercises", n = {"repo", "repo", "repaired", "repo", "existing", "repaired", "repo", "existing", "n"}, s = {"L$0", "L$0", "I$0", "L$0", "L$1", "I$0", "L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class ExerciseMuscleTagSeeder$backfillAllExercises$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExerciseMuscleTagSeeder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExerciseMuscleTagSeeder$backfillAllExercises$1(ExerciseMuscleTagSeeder exerciseMuscleTagSeeder, Continuation<? super ExerciseMuscleTagSeeder$backfillAllExercises$1> continuation) {
        super(continuation);
        this.this$0 = exerciseMuscleTagSeeder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.backfillAllExercises(null, this);
    }
}
