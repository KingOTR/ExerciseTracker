package com.example.rungps.ble.moyoung;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync", f = "MoyoungWorkoutSync.kt", i = {0, 1, 2, 3, 4}, l = {92, 93, 94, 95, 109, 110}, m = "warmUpWatch", n = {"this", "this", "this", "this", "this"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$warmUpWatch$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$warmUpWatch$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$warmUpWatch$1> continuation) {
        super(continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object warmUpWatch;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        warmUpWatch = this.this$0.warmUpWatch(this);
        return warmUpWatch;
    }
}
