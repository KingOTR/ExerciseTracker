package com.example.rungps.data;

import com.example.rungps.data.GymDao;
import com.example.rungps.sleep.SleepScience;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.GymDao$DefaultImpls", f = "GymDao.kt", i = {0, 0, 1}, l = {359, SleepScience.TYPICAL_MIN_MIN}, m = "replaceSetsForSession", n = {"$this", "sets", "$this"}, s = {"L$0", "L$1", "L$0"})
/* loaded from: classes3.dex */
final class GymDao$replaceSetsForSession$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    GymDao$replaceSetsForSession$1(Continuation<? super GymDao$replaceSetsForSession$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return GymDao.DefaultImpls.replaceSetsForSession(null, 0L, null, this);
    }
}
