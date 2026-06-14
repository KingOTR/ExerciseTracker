package com.example.rungps.domain;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HomeAnalyticsPortImpl.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.domain.HomeAnalyticsPortImpl", f = "HomeAnalyticsPortImpl.kt", i = {0, 0, 0, 0}, l = {ExerciseSessionRecord.EXERCISE_TYPE_YOGA}, m = "dailyReadiness", n = {"gym", "sleep", "load", "stepsToday"}, s = {"L$0", "L$1", "L$2", "L$3"})
/* loaded from: classes3.dex */
final class HomeAnalyticsPortImpl$dailyReadiness$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HomeAnalyticsPortImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HomeAnalyticsPortImpl$dailyReadiness$1(HomeAnalyticsPortImpl homeAnalyticsPortImpl, Continuation<? super HomeAnalyticsPortImpl$dailyReadiness$1> continuation) {
        super(continuation);
        this.this$0 = homeAnalyticsPortImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.dailyReadiness(null, null, null, null, null, null, null, this);
    }
}
