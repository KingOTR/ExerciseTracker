package com.example.rungps.data;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WatchActivityReclassifier.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.WatchActivityReclassifier", f = "WatchActivityReclassifier.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4}, l = {22, 30, 34, 42, 52}, m = "moveRunToSoccer", n = {"this", "runId", "this", "run", "runId", "watchId", "this", "run", "runId", "watchId", "totalMin", "this", "runId", "totalMin", "this", "totalMin", "soccerId"}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "J$1", "L$0", "L$1", "J$0", "J$1", "I$0", "L$0", "J$0", "I$0", "L$0", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class WatchActivityReclassifier$moveRunToSoccer$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WatchActivityReclassifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchActivityReclassifier$moveRunToSoccer$1(WatchActivityReclassifier watchActivityReclassifier, Continuation<? super WatchActivityReclassifier$moveRunToSoccer$1> continuation) {
        super(continuation);
        this.this$0 = watchActivityReclassifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.moveRunToSoccer(0L, this);
    }
}
