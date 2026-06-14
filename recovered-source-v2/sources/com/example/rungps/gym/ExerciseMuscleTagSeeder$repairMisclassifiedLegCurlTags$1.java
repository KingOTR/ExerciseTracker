package com.example.rungps.gym;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ExerciseMuscleTagSeeder.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.gym.ExerciseMuscleTagSeeder", f = "ExerciseMuscleTagSeeder.kt", i = {0, 0, 1, 1}, l = {40, 50}, m = "repairMisclassifiedLegCurlTags", n = {"repo", "n", "repo", "n"}, s = {"L$0", "I$0", "L$0", "I$0"})
/* loaded from: classes3.dex */
final class ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ExerciseMuscleTagSeeder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1(ExerciseMuscleTagSeeder exerciseMuscleTagSeeder, Continuation<? super ExerciseMuscleTagSeeder$repairMisclassifiedLegCurlTags$1> continuation) {
        super(continuation);
        this.this$0 = exerciseMuscleTagSeeder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.repairMisclassifiedLegCurlTags(null, this);
    }
}
