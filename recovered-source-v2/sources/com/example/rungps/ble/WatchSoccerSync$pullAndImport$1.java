package com.example.rungps.ble;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WatchSoccerSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.WatchSoccerSync", f = "WatchSoccerSync.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2}, l = {23, 29, 31}, m = "pullAndImport", n = {"this", "gatt", "ops", "repo", "ackChar", "this", "gatt", "ops", "repo", "ackChar", "rec", "imported", "this", "gatt", "ops", "repo", "ackChar", "imported"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$0", "L$1", "L$2", "L$3", "L$4", "L$6", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* loaded from: classes3.dex */
final class WatchSoccerSync$pullAndImport$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WatchSoccerSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchSoccerSync$pullAndImport$1(WatchSoccerSync watchSoccerSync, Continuation<? super WatchSoccerSync$pullAndImport$1> continuation) {
        super(continuation);
        this.this$0 = watchSoccerSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.pullAndImport(null, null, null, this);
    }
}
