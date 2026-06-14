package com.example.rungps.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeAnalyticsPortImpl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.domain.HomeAnalyticsPortImpl", f = "HomeAnalyticsPortImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {48}, m = "combinedLoad", n = {"gymSessions", "setsBySession", "sportLabel", "nowMs", "steps7d", "soccerMin"}, s = {"L$0", "L$1", "L$2", "J$0", "J$1", "I$0"})
/* loaded from: classes3.dex */
final class HomeAnalyticsPortImpl$combinedLoad$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeAnalyticsPortImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeAnalyticsPortImpl$combinedLoad$1(HomeAnalyticsPortImpl homeAnalyticsPortImpl, Continuation<? super HomeAnalyticsPortImpl$combinedLoad$1> continuation) {
        super(continuation);
        this.this$0 = homeAnalyticsPortImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.combinedLoad(null, null, null, null, null, null, null, 0L, 0L, this);
    }
}
