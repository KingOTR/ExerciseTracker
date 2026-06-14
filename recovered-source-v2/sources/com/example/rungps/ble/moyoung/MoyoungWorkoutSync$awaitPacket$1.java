package com.example.rungps.ble.moyoung;

import com.example.rungps.sleep.SleepAlarmScheduler;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync", f = "MoyoungWorkoutSync.kt", i = {0, 0, 0}, l = {256}, m = "awaitPacket", n = {"this", "cmd", SleepAlarmScheduler.EXTRA_DEADLINE}, s = {"L$0", "B$0", "J$0"})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$awaitPacket$1 extends ContinuationImpl {
    byte B$0;
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$awaitPacket$1(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$awaitPacket$1> continuation) {
        super(continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitPacket;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitPacket = this.this$0.awaitPacket((byte) 0, 0L, this);
        return awaitPacket;
    }
}
