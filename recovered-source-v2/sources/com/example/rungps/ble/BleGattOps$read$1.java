package com.example.rungps.ble;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: BleGattOps.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleGattOps", f = "BleGattOps.kt", i = {}, l = {22}, m = "read", n = {}, s = {})
/* loaded from: classes3.dex */
final class BleGattOps$read$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BleGattOps this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleGattOps$read$1(BleGattOps bleGattOps, Continuation<? super BleGattOps$read$1> continuation) {
        super(continuation);
        this.this$0 = bleGattOps;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.read(null, null, this);
    }
}
