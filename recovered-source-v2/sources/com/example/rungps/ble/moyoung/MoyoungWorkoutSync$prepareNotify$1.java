package com.example.rungps.ble.moyoung;

import androidx.health.connect.client.records.ExerciseSessionRecord;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync", f = "MoyoungWorkoutSync.kt", i = {}, l = {76, ExerciseSessionRecord.EXERCISE_TYPE_WALKING}, m = "prepareNotify", n = {}, s = {})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$prepareNotify$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$prepareNotify$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$prepareNotify$1> continuation) {
        super(continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object prepareNotify;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        prepareNotify = this.this$0.prepareNotify(this);
        return prepareNotify;
    }
}
