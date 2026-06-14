package com.example.rungps.sleep;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepMlFeedbackApply.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepMlFeedbackApply", f = "SleepMlFeedbackApply.kt", i = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {23, 35, 57, ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR}, m = "applyToEntry", n = {"this", "context", "entry", "kind", "labels", "inBedMin", "awakeMin", "deepMin", "lightMin", "remMin", "totalSleepMin", "efficiency"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "I$1", "I$2", "I$3", "I$4", "I$5", "I$6"})
/* loaded from: classes3.dex */
final class SleepMlFeedbackApply$applyToEntry$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    int I$6;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepMlFeedbackApply this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepMlFeedbackApply$applyToEntry$1(SleepMlFeedbackApply sleepMlFeedbackApply, Continuation<? super SleepMlFeedbackApply$applyToEntry$1> continuation) {
        super(continuation);
        this.this$0 = sleepMlFeedbackApply;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.applyToEntry(null, null, null, this);
    }
}
