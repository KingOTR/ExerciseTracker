package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/ble/WatchSoccerStatus;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleClient$refreshWatchSoccerStatus$1$st$1", f = "BleClient.kt", i = {}, l = {264}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BleClient$refreshWatchSoccerStatus$1$st$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super WatchSoccerStatus>, Object> {
    final /* synthetic */ BluetoothGatt $g;
    int label;
    final /* synthetic */ BleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleClient$refreshWatchSoccerStatus$1$st$1(BluetoothGatt bluetoothGatt, BleClient bleClient, Continuation<? super BleClient$refreshWatchSoccerStatus$1$st$1> continuation) {
        super(2, continuation);
        this.$g = bluetoothGatt;
        this.this$0 = bleClient;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BleClient$refreshWatchSoccerStatus$1$st$1(this.$g, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super WatchSoccerStatus> continuation) {
        return ((BleClient$refreshWatchSoccerStatus$1$st$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BleGattOps bleGattOps;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            WatchSoccerSync watchSoccerSync = WatchSoccerSync.INSTANCE;
            BluetoothGatt bluetoothGatt = this.$g;
            bleGattOps = this.this$0.gattOps;
            this.label = 1;
            obj = watchSoccerSync.readStatus(bluetoothGatt, bleGattOps, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return obj;
    }
}
