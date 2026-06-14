package com.example.rungps.data;

import androidx.autofill.HintConstants;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: Repository.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.Repository", f = "Repository.kt", i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3}, l = {571, 574, 576, 578}, m = "createSplitPerDayExercises", n = {"this", HintConstants.AUTOFILL_HINT_NAME, "dayPlans", "defaultSets", "this", "dayPlans", "sets", "this", "exs", "sets", "splitId", "index$iv", "this", "sets", "splitId", "index$iv", "dayId", "index$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "I$0", "L$0", "L$2", "I$0", "J$0", "I$1", "L$0", "I$0", "J$0", "I$1", "J$1", "I$2"})
/* loaded from: classes3.dex */
final class Repository$createSplitPerDayExercises$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Repository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Repository$createSplitPerDayExercises$1(Repository repository, Continuation<? super Repository$createSplitPerDayExercises$1> continuation) {
        super(continuation);
        this.this$0 = repository;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createSplitPerDayExercises(null, null, 0, this);
    }
}
