package com.example.rungps.ble.moyoung;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync", f = "MoyoungWorkoutSync.kt", i = {0, 0}, l = {272}, m = "writeCommand", n = {"this", "outChar"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$writeCommand$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$writeCommand$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$writeCommand$1> continuation) {
        super(continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object writeCommand;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        writeCommand = this.this$0.writeCommand((byte) 0, null, this);
        return writeCommand;
    }
}
