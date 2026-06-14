package com.example.rungps.data;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WatchActivityReclassifier.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.data.WatchActivityReclassifier", f = "WatchActivityReclassifier.kt", i = {0, 0, 1, 1, 1, 1, 2, 2, 2, 3, 3}, l = {61, 64, ExerciseSessionRecord.EXERCISE_TYPE_SURFING, ExerciseSessionRecord.EXERCISE_TYPE_WHEELCHAIR}, m = "moveSoccerToRun", n = {"this", "sessionId", "this", "session", "sessionId", "watchId", "this", "sessionId", "totalMin", "totalMin", "runId"}, s = {"L$0", "J$0", "L$0", "L$1", "J$0", "J$1", "L$0", "J$0", "I$0", "I$0", "J$0"})
/* loaded from: classes3.dex */
final class WatchActivityReclassifier$moveSoccerToRun$1 extends ContinuationImpl {
    int I$0;
    long J$0;
    long J$1;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WatchActivityReclassifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchActivityReclassifier$moveSoccerToRun$1(WatchActivityReclassifier watchActivityReclassifier, Continuation<? super WatchActivityReclassifier$moveSoccerToRun$1> continuation) {
        super(continuation);
        this.this$0 = watchActivityReclassifier;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.moveSoccerToRun(0L, this);
    }
}
