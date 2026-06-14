package com.example.rungps.data;

import com.example.rungps.data.RunDao;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: RunDao.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.RunDao$DefaultImpls", f = "RunDao.kt", i = {0}, l = {149, 150}, m = "deleteAllRuns", n = {"$this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class RunDao$deleteAllRuns$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    RunDao$deleteAllRuns$1(Continuation<? super RunDao$deleteAllRuns$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RunDao.DefaultImpls.deleteAllRuns(null, this);
    }
}
