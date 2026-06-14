package com.example.rungps.domain;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeAnalyticsPortImpl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.domain.HomeAnalyticsPortImpl", f = "HomeAnalyticsPortImpl.kt", i = {0, 0, 0, 0, 0, 0}, l = {142}, m = "weekTrendKm", n = {"runs", "strava", "weekRunRideKm", "destination$iv$iv", "isBike", "now"}, s = {"L$0", "L$1", "L$2", "L$3", "Z$0", "J$0"})
/* loaded from: classes3.dex */
final class HomeAnalyticsPortImpl$weekTrendKm$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeAnalyticsPortImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeAnalyticsPortImpl$weekTrendKm$1(HomeAnalyticsPortImpl homeAnalyticsPortImpl, Continuation<? super HomeAnalyticsPortImpl$weekTrendKm$1> continuation) {
        super(continuation);
        this.this$0 = homeAnalyticsPortImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.weekTrendKm(null, null, false, null, this);
    }
}
