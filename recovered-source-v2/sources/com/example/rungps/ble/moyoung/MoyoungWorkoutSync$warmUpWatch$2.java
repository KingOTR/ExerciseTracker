package com.example.rungps.ble.moyoung;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
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

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync$warmUpWatch$2", f = "MoyoungWorkoutSync.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$warmUpWatch$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$warmUpWatch$2(MoyoungWorkoutSync moyoungWorkoutSync, Continuation<? super MoyoungWorkoutSync$warmUpWatch$2> continuation) {
        super(2, continuation);
        this.this$0 = moyoungWorkoutSync;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MoyoungWorkoutSync$warmUpWatch$2 moyoungWorkoutSync$warmUpWatch$2 = new MoyoungWorkoutSync$warmUpWatch$2(this.this$0, continuation);
        moyoungWorkoutSync$warmUpWatch$2.L$0 = obj;
        return moyoungWorkoutSync$warmUpWatch$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MoyoungWorkoutSync$warmUpWatch$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BluetoothGatt bluetoothGatt;
        BluetoothGatt bluetoothGatt2;
        boolean readCharacteristic;
        BluetoothGatt bluetoothGatt3;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            bluetoothGatt = this.this$0.gatt;
            BluetoothGattService service = bluetoothGatt.getService(MoyoungConstants.INSTANCE.getUUID_SERVICE());
            BluetoothGattCharacteristic characteristic = service != null ? service.getCharacteristic(MoyoungConstants.INSTANCE.getUUID_CHARACTERISTIC_STEPS()) : null;
            if (characteristic != null) {
                MoyoungWorkoutSync moyoungWorkoutSync = this.this$0;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (Build.VERSION.SDK_INT >= 33) {
                        bluetoothGatt3 = moyoungWorkoutSync.gatt;
                        readCharacteristic = bluetoothGatt3.readCharacteristic(characteristic);
                    } else {
                        bluetoothGatt2 = moyoungWorkoutSync.gatt;
                        readCharacteristic = bluetoothGatt2.readCharacteristic(characteristic);
                    }
                    Result.m7905constructorimpl(Boxing.boxBoolean(readCharacteristic));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
