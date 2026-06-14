package com.example.rungps.data;

import com.example.rungps.data.GymDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.GymDao$DefaultImpls", f = "GymDao.kt", i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2}, l = {442, 444, 448}, m = "createSplitWithPerDayExercises", n = {"$this", "days", "defaultSets", "$this", "spec", "defaultSets", "splitId", "$this", "defaultSets", "splitId", "dayId", "index$iv"}, s = {"L$0", "L$1", "I$0", "L$0", "L$2", "I$0", "J$0", "L$0", "I$0", "J$0", "J$1", "I$1"})
/* loaded from: classes3.dex */
final class GymDao$createSplitWithPerDayExercises$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    GymDao$createSplitWithPerDayExercises$1(Continuation<? super GymDao$createSplitWithPerDayExercises$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GymDao.DefaultImpls.createSplitWithPerDayExercises(null, null, null, 0, this);
    }
}
