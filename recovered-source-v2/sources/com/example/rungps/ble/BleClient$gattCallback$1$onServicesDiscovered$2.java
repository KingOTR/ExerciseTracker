package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleClient$gattCallback$1$onServicesDiscovered$2", f = "BleClient.kt", i = {0}, l = {424}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class BleClient$gattCallback$1$onServicesDiscovered$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BluetoothGatt $discoveredGatt;
    final /* synthetic */ boolean $hasSoccer;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleClient$gattCallback$1$onServicesDiscovered$2(BleClient bleClient, BluetoothGatt bluetoothGatt, boolean z, Continuation<? super BleClient$gattCallback$1$onServicesDiscovered$2> continuation) {
        super(2, continuation);
        this.this$0 = bleClient;
        this.$discoveredGatt = bluetoothGatt;
        this.$hasSoccer = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BleClient$gattCallback$1$onServicesDiscovered$2 bleClient$gattCallback$1$onServicesDiscovered$2 = new BleClient$gattCallback$1$onServicesDiscovered$2(this.this$0, this.$discoveredGatt, this.$hasSoccer, continuation);
        bleClient$gattCallback$1$onServicesDiscovered$2.L$0 = obj;
        return bleClient$gattCallback$1$onServicesDiscovered$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BleClient$gattCallback$1$onServicesDiscovered$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BluetoothGatt bluetoothGatt;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.L$0 = (CoroutineScope) this.L$0;
            this.label = 1;
            if (DelayKt.delay(1200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        bluetoothGatt = this.this$0.gatt;
        if (!Intrinsics.areEqual(bluetoothGatt, this.$discoveredGatt)) {
            return Unit.INSTANCE;
        }
        if (this.$hasSoccer) {
            BleClient bleClient = this.this$0;
            try {
                Result.Companion companion = Result.INSTANCE;
                bleClient.refreshWatchSoccerStatus();
                Result.m7905constructorimpl(Unit.INSTANCE);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
        BleClient.syncSoccerFromWatch$default(this.this$0, null, 1, null);
        return Unit.INSTANCE;
    }
}
