package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import com.example.rungps.tracking.RecordingHrBridge;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleClient$refreshWatchSoccerStatus$1", f = "BleClient.kt", i = {}, l = {263}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class BleClient$refreshWatchSoccerStatus$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BluetoothGatt $g;
    int label;
    final /* synthetic */ BleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleClient$refreshWatchSoccerStatus$1(BleClient bleClient, BluetoothGatt bluetoothGatt, Continuation<? super BleClient$refreshWatchSoccerStatus$1> continuation) {
        super(2, continuation);
        this.this$0 = bleClient;
        this.$g = bluetoothGatt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BleClient$refreshWatchSoccerStatus$1(this.this$0, this.$g, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BleClient$refreshWatchSoccerStatus$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        MutableStateFlow mutableStateFlow3;
        Long latestHrAtMs;
        BleStatus copy;
        MutableStateFlow mutableStateFlow4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            this.label = 1;
            withContext = BuildersKt.withContext(Dispatchers.getIO(), new BleClient$refreshWatchSoccerStatus$1$st$1(this.$g, this.this$0, null), this);
            if (withContext == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            withContext = obj;
        }
        WatchSoccerStatus watchSoccerStatus = (WatchSoccerStatus) withContext;
        if (watchSoccerStatus != null) {
            long currentTimeMillis = System.currentTimeMillis();
            Integer hrBpm = watchSoccerStatus.getHrBpm();
            if (hrBpm != null) {
                RecordingHrBridge.INSTANCE.offerSample(hrBpm.intValue(), currentTimeMillis);
            }
            mutableStateFlow = this.this$0._status;
            mutableStateFlow2 = this.this$0._status;
            BleStatus bleStatus = (BleStatus) mutableStateFlow2.getValue();
            Integer boxInt = Boxing.boxInt(watchSoccerStatus.getState());
            Integer boxInt2 = Boxing.boxInt(watchSoccerStatus.getElapsedSec());
            Integer hrBpm2 = watchSoccerStatus.getHrBpm();
            if (hrBpm2 == null) {
                mutableStateFlow4 = this.this$0._status;
                hrBpm2 = ((BleStatus) mutableStateFlow4.getValue()).getLatestHrBpm();
            }
            Integer num = hrBpm2;
            if (watchSoccerStatus.getHrBpm() != null) {
                latestHrAtMs = Boxing.boxLong(currentTimeMillis);
            } else {
                mutableStateFlow3 = this.this$0._status;
                latestHrAtMs = ((BleStatus) mutableStateFlow3.getValue()).getLatestHrAtMs();
            }
            copy = bleStatus.copy((r36 & 1) != 0 ? bleStatus.enabled : false, (r36 & 2) != 0 ? bleStatus.scanning : false, (r36 & 4) != 0 ? bleStatus.connectingTo : null, (r36 & 8) != 0 ? bleStatus.connectedAddress : null, (r36 & 16) != 0 ? bleStatus.lastError : null, (r36 & 32) != 0 ? bleStatus.devices : null, (r36 & 64) != 0 ? bleStatus.services : null, (r36 & 128) != 0 ? bleStatus.hasHeartRateService : false, (r36 & 256) != 0 ? bleStatus.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? bleStatus.hasMoyoungService : false, (r36 & 1024) != 0 ? bleStatus.watchSoccerState : boxInt, (r36 & 2048) != 0 ? bleStatus.watchSoccerElapsedSec : boxInt2, (r36 & 4096) != 0 ? bleStatus.syncingSoccer : false, (r36 & 8192) != 0 ? bleStatus.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? bleStatus.lastMoyoungImport : null, (r36 & 32768) != 0 ? bleStatus.latestHrBpm : num, (r36 & 65536) != 0 ? bleStatus.latestHrAtMs : latestHrAtMs, (r36 & 131072) != 0 ? bleStatus.hrTestRunning : false);
            mutableStateFlow.setValue(copy);
        }
        return Unit.INSTANCE;
    }
}
