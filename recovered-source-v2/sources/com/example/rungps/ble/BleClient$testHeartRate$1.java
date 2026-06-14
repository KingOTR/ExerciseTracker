package com.example.rungps.ble;

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
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleClient$testHeartRate$1", f = "BleClient.kt", i = {0, 0}, l = {302}, m = "invokeSuspend", n = {"$this$launch", "start"}, s = {"L$0", "J$0"})
/* loaded from: classes3.dex */
final class BleClient$testHeartRate$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BluetoothGattCharacteristic $c;
    final /* synthetic */ long $durationMs;
    final /* synthetic */ BluetoothGatt $g;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ BleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleClient$testHeartRate$1(long j, BleClient bleClient, BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, Continuation<? super BleClient$testHeartRate$1> continuation) {
        super(2, continuation);
        this.$durationMs = j;
        this.this$0 = bleClient;
        this.$g = bluetoothGatt;
        this.$c = bluetoothGattCharacteristic;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BleClient$testHeartRate$1 bleClient$testHeartRate$1 = new BleClient$testHeartRate$1(this.$durationMs, this.this$0, this.$g, this.$c, continuation);
        bleClient$testHeartRate$1.L$0 = obj;
        return bleClient$testHeartRate$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BleClient$testHeartRate$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope;
        long currentTimeMillis;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        BleStatus copy;
        boolean readCharacteristic;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            currentTimeMillis = System.currentTimeMillis();
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            currentTimeMillis = this.J$0;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        }
        long j = currentTimeMillis;
        CoroutineScope coroutineScope2 = coroutineScope;
        while (System.currentTimeMillis() - j < this.$durationMs) {
            BluetoothGatt bluetoothGatt = this.$g;
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.$c;
            try {
                Result.Companion companion = Result.INSTANCE;
                if (Build.VERSION.SDK_INT >= 33) {
                    readCharacteristic = bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
                } else {
                    readCharacteristic = bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
                }
                Result.m7905constructorimpl(Boxing.boxBoolean(readCharacteristic));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
            this.L$0 = coroutineScope2;
            this.J$0 = j;
            this.label = 1;
            if (DelayKt.delay(1200L, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        mutableStateFlow = this.this$0._status;
        mutableStateFlow2 = this.this$0._status;
        copy = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : null, (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
        mutableStateFlow.setValue(copy);
        return Unit.INSTANCE;
    }
}
