package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import com.example.rungps.ble.moyoung.MoyoungWorkoutSync;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleClient$gattCallback$1$onServicesDiscovered$1", f = "BleClient.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BleClient$gattCallback$1$onServicesDiscovered$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BluetoothGatt $gatt;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleClient$gattCallback$1$onServicesDiscovered$1(BluetoothGatt bluetoothGatt, Continuation<? super BleClient$gattCallback$1$onServicesDiscovered$1> continuation) {
        super(2, continuation);
        this.$gatt = bluetoothGatt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BleClient$gattCallback$1$onServicesDiscovered$1 bleClient$gattCallback$1$onServicesDiscovered$1 = new BleClient$gattCallback$1$onServicesDiscovered$1(this.$gatt, continuation);
        bleClient$gattCallback$1$onServicesDiscovered$1.L$0 = obj;
        return bleClient$gattCallback$1$onServicesDiscovered$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BleClient$gattCallback$1$onServicesDiscovered$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        BluetoothGatt bluetoothGatt = this.$gatt;
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m7905constructorimpl(Boxing.boxBoolean(MoyoungWorkoutSync.INSTANCE.enableNotify(bluetoothGatt)));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        BluetoothGatt bluetoothGatt2 = this.$gatt;
        try {
            Result.Companion companion3 = Result.INSTANCE;
            Result.m7905constructorimpl(Boxing.boxBoolean(bluetoothGatt2.requestMtu(517)));
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        return Unit.INSTANCE;
    }
}
