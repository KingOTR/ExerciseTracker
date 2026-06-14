package com.example.rungps.ble;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: WatchSoccerSync.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.WatchSoccerSync", f = "WatchSoccerSync.kt", i = {}, l = {39}, m = "readStatus", n = {}, s = {})
/* loaded from: classes3.dex */
final class WatchSoccerSync$readStatus$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ WatchSoccerSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WatchSoccerSync$readStatus$1(WatchSoccerSync watchSoccerSync, Continuation<? super WatchSoccerSync$readStatus$1> continuation) {
        super(continuation);
        this.this$0 = watchSoccerSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.readStatus(null, null, this);
    }
}
