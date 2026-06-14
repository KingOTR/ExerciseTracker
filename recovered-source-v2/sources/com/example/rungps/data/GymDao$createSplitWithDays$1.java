package com.example.rungps.data;

import com.example.rungps.data.GymDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.GymDao$DefaultImpls", f = "GymDao.kt", i = {0, 0, 1, 1, 1}, l = {405, 407}, m = "createSplitWithDays", n = {"$this", "dayNames", "$this", "splitId", "index$iv"}, s = {"L$0", "L$1", "L$0", "J$0", "I$0"})
/* loaded from: classes3.dex */
final class GymDao$createSplitWithDays$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    GymDao$createSplitWithDays$1(Continuation<? super GymDao$createSplitWithDays$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GymDao.DefaultImpls.createSplitWithDays(null, null, null, this);
    }
}
