package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Build;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BleGattOps.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleGattOps$write$result$1", f = "BleGattOps.kt", i = {0}, l = {94}, m = "invokeSuspend", n = {"$this$withTimeoutOrNull"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class BleGattOps$write$result$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
    final /* synthetic */ BluetoothGattCharacteristic $char;
    final /* synthetic */ byte[] $data;
    final /* synthetic */ BluetoothGatt $gatt;
    final /* synthetic */ int $id;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ BleGattOps this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleGattOps$write$result$1(BleGattOps bleGattOps, int i, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, Continuation<? super BleGattOps$write$result$1> continuation) {
        super(2, continuation);
        this.this$0 = bleGattOps;
        this.$id = i;
        this.$gatt = bluetoothGatt;
        this.$char = bluetoothGattCharacteristic;
        this.$data = bArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BleGattOps$write$result$1 bleGattOps$write$result$1 = new BleGattOps$write$result$1(this.this$0, this.$id, this.$gatt, this.$char, this.$data, continuation);
        bleGattOps$write$result$1.L$0 = obj;
        return bleGattOps$write$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
        return ((BleGattOps$write$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ConcurrentHashMap concurrentHashMap;
        Object m7905constructorimpl;
        ConcurrentHashMap concurrentHashMap2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            BleGattOps bleGattOps = this.this$0;
            int i2 = this.$id;
            BluetoothGatt bluetoothGatt = this.$gatt;
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.$char;
            byte[] bArr = this.$data;
            this.L$0 = coroutineScope;
            this.L$1 = bleGattOps;
            this.L$2 = bluetoothGatt;
            this.L$3 = bluetoothGattCharacteristic;
            this.L$4 = bArr;
            this.I$0 = i2;
            this.label = 1;
            BleGattOps$write$result$1 bleGattOps$write$result$1 = this;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(bleGattOps$write$result$1), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            Integer boxInt = Boxing.boxInt(i2);
            concurrentHashMap = bleGattOps.pending;
            concurrentHashMap.put(boxInt, new Function1<Result<? extends byte[]>, Unit>() { // from class: com.example.rungps.ble.BleGattOps$write$result$1$1$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Result<? extends byte[]> result) {
                    m6780invoke(result.getValue());
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m6780invoke(Object obj2) {
                    if (cancellableContinuationImpl2.isActive()) {
                        CancellableContinuation<Boolean> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m7905constructorimpl(Boolean.valueOf(Result.m7912isSuccessimpl(obj2))));
                    }
                }
            });
            try {
                Result.Companion companion = Result.INSTANCE;
                if (Build.VERSION.SDK_INT >= 33) {
                    if (bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr, bluetoothGattCharacteristic.getWriteType()) != 0) {
                        z = false;
                    }
                } else {
                    bluetoothGattCharacteristic.setValue(bArr);
                    z = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic);
                }
                m7905constructorimpl = Result.m7905constructorimpl(Boxing.boxBoolean(z));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            Boolean boxBoolean = Boxing.boxBoolean(false);
            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                m7905constructorimpl = boxBoolean;
            }
            if (!((Boolean) m7905constructorimpl).booleanValue()) {
                concurrentHashMap2 = bleGattOps.pending;
                concurrentHashMap2.remove(Boxing.boxInt(i2));
                Result.Companion companion3 = Result.INSTANCE;
                cancellableContinuationImpl2.resumeWith(Result.m7905constructorimpl(Boxing.boxBoolean(false)));
            }
            obj = cancellableContinuationImpl.getResult();
            if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(bleGattOps$write$result$1);
            }
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
