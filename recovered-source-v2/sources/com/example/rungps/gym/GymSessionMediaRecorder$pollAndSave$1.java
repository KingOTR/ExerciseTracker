package com.example.rungps.gym;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: GymSessionMediaRecorder.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.gym.GymSessionMediaRecorder", f = "GymSessionMediaRecorder.kt", i = {0, 0, 0}, l = {22, 32}, m = "pollAndSave", n = {"this", "repo", "sessionId"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class GymSessionMediaRecorder$pollAndSave$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GymSessionMediaRecorder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GymSessionMediaRecorder$pollAndSave$1(GymSessionMediaRecorder gymSessionMediaRecorder, Continuation<? super GymSessionMediaRecorder$pollAndSave$1> continuation) {
        super(continuation);
        this.this$0 = gymSessionMediaRecorder;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pollAndSave(0L, null, null, this);
    }
}
