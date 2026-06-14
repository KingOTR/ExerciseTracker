package com.example.rungps.ble.moyoung;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync", f = "MoyoungWorkoutSync.kt", i = {0, 0, 1, 1, 2, 2, 3, 3}, l = {131, 132, 133, 144}, m = "fetchWorkoutsV2Page", n = {"this", "page", "this", "page", "this", "page", "this", "workouts"}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$fetchWorkoutsV2Page$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$fetchWorkoutsV2Page$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$fetchWorkoutsV2Page$1> continuation) {
        super(continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchWorkoutsV2Page;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchWorkoutsV2Page = this.this$0.fetchWorkoutsV2Page(0, this);
        return fetchWorkoutsV2Page;
    }
}
