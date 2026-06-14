package com.example.rungps.ble.moyoung;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
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
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.moyoung.MoyoungWorkoutSync$writeChunk$2", f = "MoyoungWorkoutSync.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MoyoungWorkoutSync$writeChunk$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Object>>, Object> {
    final /* synthetic */ BluetoothGattCharacteristic $char;
    final /* synthetic */ byte[] $data;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ MoyoungWorkoutSync this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MoyoungWorkoutSync$writeChunk$2(MoyoungWorkoutSync moyoungWorkoutSync, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, Continuation<? super MoyoungWorkoutSync$writeChunk$2> continuation) {
        super(2, continuation);
        this.this$0 = moyoungWorkoutSync;
        this.$char = bluetoothGattCharacteristic;
        this.$data = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MoyoungWorkoutSync$writeChunk$2 moyoungWorkoutSync$writeChunk$2 = new MoyoungWorkoutSync$writeChunk$2(this.this$0, this.$char, this.$data, continuation);
        moyoungWorkoutSync$writeChunk$2.L$0 = obj;
        return moyoungWorkoutSync$writeChunk$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Object>> continuation) {
        return ((MoyoungWorkoutSync$writeChunk$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        BluetoothGatt bluetoothGatt;
        Object boxBoolean;
        BluetoothGatt bluetoothGatt2;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        MoyoungWorkoutSync moyoungWorkoutSync = this.this$0;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.$char;
        byte[] bArr = this.$data;
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 33) {
                bluetoothGatt2 = moyoungWorkoutSync.gatt;
                boxBoolean = Boxing.boxInt(bluetoothGatt2.writeCharacteristic(bluetoothGattCharacteristic, bArr, bluetoothGattCharacteristic.getWriteType()));
            } else {
                bluetoothGattCharacteristic.setValue(bArr);
                bluetoothGatt = moyoungWorkoutSync.gatt;
                boxBoolean = Boxing.boxBoolean(bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic));
            }
            m7905constructorimpl = Result.m7905constructorimpl(boxBoolean);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Result.m7904boximpl(m7905constructorimpl);
    }
}
