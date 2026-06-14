package com.example.rungps.ble.moyoung;

import com.example.rungps.sleep.SleepAlarmScheduler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync", f = "MoyoungWorkoutSync.kt", i = {0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 4, 4, 4}, l = {151, 155, 156, 160, 165}, m = "fetchWorkoutDetail", n = {"this", "id", "this", "id", "this", "id", "this", "id", "this", "hrChunks", "workouts", "id", SleepAlarmScheduler.EXTRA_DEADLINE}, s = {"L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "I$0", "L$0", "L$1", "L$2", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$fetchWorkoutDetail$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$fetchWorkoutDetail$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$fetchWorkoutDetail$1> continuation) {
        super(continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchWorkoutDetail;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchWorkoutDetail = this.this$0.fetchWorkoutDetail(0, this);
        return fetchWorkoutDetail;
    }
}
