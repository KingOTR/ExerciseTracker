package com.example.rungps.sleep;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SleepCalendarHelper.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.sleep.SleepCalendarHelper", f = "SleepCalendarHelper.kt", i = {0, 0, 0, 0}, l = {375}, m = "resolveTomorrowCommitmentAsync", n = {"this", "context", "zone", "travelBufferMin"}, s = {"L$0", "L$1", "L$2", "I$0"})
/* loaded from: classes3.dex */
final class SleepCalendarHelper$resolveTomorrowCommitmentAsync$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SleepCalendarHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SleepCalendarHelper$resolveTomorrowCommitmentAsync$1(SleepCalendarHelper sleepCalendarHelper, Continuation<? super SleepCalendarHelper$resolveTomorrowCommitmentAsync$1> continuation) {
        super(continuation);
        this.this$0 = sleepCalendarHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.resolveTomorrowCommitmentAsync(null, 0, null, this);
    }
}
