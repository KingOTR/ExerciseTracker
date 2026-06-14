package com.example.rungps.ble.moyoung;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync", f = "MoyoungWorkoutSync.kt", i = {0, 0, 0}, l = {ExerciseSessionRecord.EXERCISE_TYPE_STAIR_CLIMBING}, m = "fetchWorkoutsV2AllPages", n = {"this", "merged", "page"}, s = {"L$0", "L$1", "I$0"})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$fetchWorkoutsV2AllPages$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$fetchWorkoutsV2AllPages$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$fetchWorkoutsV2AllPages$1> continuation) {
        super(continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchWorkoutsV2AllPages;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchWorkoutsV2AllPages = this.this$0.fetchWorkoutsV2AllPages(this);
        return fetchWorkoutsV2AllPages;
    }
}
