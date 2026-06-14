package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import android.os.Handler;
import com.example.rungps.data.MoyoungImportStats;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.sync.Mutex;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleClient$syncSoccerFromWatch$1", f = "BleClient.kt", i = {0, 0, 1, 1}, l = {576, 212}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock_u24default$iv", "$this$launch", "$this$withLock_u24default$iv"}, s = {"L$0", "L$3", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class BleClient$syncSoccerFromWatch$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ BluetoothGatt $g;
    final /* synthetic */ Function1<MoyoungImportStats, Unit> $onDone;
    final /* synthetic */ boolean $useExerciseTrackerBand;
    final /* synthetic */ boolean $useMoyoung;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    int label;
    final /* synthetic */ BleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BleClient$syncSoccerFromWatch$1(BleClient bleClient, boolean z, Function1<? super MoyoungImportStats, Unit> function1, boolean z2, BluetoothGatt bluetoothGatt, Continuation<? super BleClient$syncSoccerFromWatch$1> continuation) {
        super(2, continuation);
        this.this$0 = bleClient;
        this.$useExerciseTrackerBand = z;
        this.$onDone = function1;
        this.$useMoyoung = z2;
        this.$g = bluetoothGatt;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        BleClient$syncSoccerFromWatch$1 bleClient$syncSoccerFromWatch$1 = new BleClient$syncSoccerFromWatch$1(this.this$0, this.$useExerciseTrackerBand, this.$onDone, this.$useMoyoung, this.$g, continuation);
        bleClient$syncSoccerFromWatch$1.L$0 = obj;
        return bleClient$syncSoccerFromWatch$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BleClient$syncSoccerFromWatch$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01a1  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v21, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m7905constructorimpl;
        Throwable m7908exceptionOrNullimpl;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        BleStatus copy;
        final Function1<MoyoungImportStats, Unit> function1;
        Handler handler;
        MutableStateFlow mutableStateFlow3;
        MutableStateFlow mutableStateFlow4;
        BleStatus copy2;
        CoroutineScope coroutineScope;
        MutableStateFlow mutableStateFlow5;
        MutableStateFlow mutableStateFlow6;
        BleStatus copy3;
        Mutex mutex;
        boolean z;
        boolean z2;
        BluetoothGatt bluetoothGatt;
        BleClient bleClient;
        Mutex mutex2;
        Object withContext;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r2 = this.label;
        try {
            try {
            } catch (Throwable th) {
                r2.unlock(null);
                throw th;
            }
        } catch (Throwable th2) {
            Result.Companion companion = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        if (r2 == 0) {
            ResultKt.throwOnFailure(obj);
            coroutineScope = (CoroutineScope) this.L$0;
            mutableStateFlow5 = this.this$0._status;
            mutableStateFlow6 = this.this$0._status;
            copy3 = r10.copy((r36 & 1) != 0 ? r10.enabled : false, (r36 & 2) != 0 ? r10.scanning : false, (r36 & 4) != 0 ? r10.connectingTo : null, (r36 & 8) != 0 ? r10.connectedAddress : null, (r36 & 16) != 0 ? r10.lastError : null, (r36 & 32) != 0 ? r10.devices : null, (r36 & 64) != 0 ? r10.services : null, (r36 & 128) != 0 ? r10.hasHeartRateService : false, (r36 & 256) != 0 ? r10.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r10.hasMoyoungService : false, (r36 & 1024) != 0 ? r10.watchSoccerState : null, (r36 & 2048) != 0 ? r10.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r10.syncingSoccer : true, (r36 & 8192) != 0 ? r10.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r10.lastMoyoungImport : null, (r36 & 32768) != 0 ? r10.latestHrBpm : null, (r36 & 65536) != 0 ? r10.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow6.getValue()).hrTestRunning : false);
            mutableStateFlow5.setValue(copy3);
            BleClient bleClient2 = this.this$0;
            boolean z3 = this.$useMoyoung;
            BluetoothGatt bluetoothGatt2 = this.$g;
            boolean z4 = this.$useExerciseTrackerBand;
            Result.Companion companion2 = Result.INSTANCE;
            mutex = bleClient2.syncMutex;
            this.L$0 = coroutineScope;
            this.L$1 = bleClient2;
            this.L$2 = bluetoothGatt2;
            this.L$3 = mutex;
            this.Z$0 = z3;
            this.Z$1 = z4;
            this.label = 1;
            if (mutex.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            z = z3;
            z2 = z4;
            bluetoothGatt = bluetoothGatt2;
            bleClient = bleClient2;
            mutex2 = mutex;
        } else {
            if (r2 != 1) {
                if (r2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Mutex mutex3 = (Mutex) this.L$1;
                ResultKt.throwOnFailure(obj);
                withContext = obj;
                r2 = mutex3;
                MoyoungImportStats moyoungImportStats = (MoyoungImportStats) withContext;
                r2.unlock(null);
                m7905constructorimpl = Result.m7905constructorimpl(moyoungImportStats);
                BleClient bleClient3 = this.this$0;
                m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
                if (m7908exceptionOrNullimpl != null) {
                    String message = m7908exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = "Soccer sync failed";
                    }
                    String str = message;
                    mutableStateFlow3 = bleClient3._status;
                    mutableStateFlow4 = bleClient3._status;
                    copy2 = r3.copy((r36 & 1) != 0 ? r3.enabled : false, (r36 & 2) != 0 ? r3.scanning : false, (r36 & 4) != 0 ? r3.connectingTo : null, (r36 & 8) != 0 ? r3.connectedAddress : null, (r36 & 16) != 0 ? r3.lastError : str, (r36 & 32) != 0 ? r3.devices : null, (r36 & 64) != 0 ? r3.services : null, (r36 & 128) != 0 ? r3.hasHeartRateService : false, (r36 & 256) != 0 ? r3.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r3.hasMoyoungService : false, (r36 & 1024) != 0 ? r3.watchSoccerState : null, (r36 & 2048) != 0 ? r3.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r3.syncingSoccer : false, (r36 & 8192) != 0 ? r3.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r3.lastMoyoungImport : null, (r36 & 32768) != 0 ? r3.latestHrBpm : null, (r36 & 65536) != 0 ? r3.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow4.getValue()).hrTestRunning : false);
                    mutableStateFlow3.setValue(copy2);
                    m7905constructorimpl = new MoyoungImportStats(0, 0, 0, 0, 15, null);
                }
                final MoyoungImportStats moyoungImportStats2 = (MoyoungImportStats) m7905constructorimpl;
                if (this.$useExerciseTrackerBand) {
                    BleClient bleClient4 = this.this$0;
                    try {
                        Result.Companion companion3 = Result.INSTANCE;
                        bleClient4.refreshWatchSoccerStatus();
                        Result.m7905constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th3) {
                        Result.Companion companion4 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th3));
                    }
                }
                mutableStateFlow = this.this$0._status;
                mutableStateFlow2 = this.this$0._status;
                copy = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : null, (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : Boxing.boxInt(moyoungImportStats2.getImported()), (r36 & 16384) != 0 ? r2.lastMoyoungImport : moyoungImportStats2, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
                mutableStateFlow.setValue(copy);
                function1 = this.$onDone;
                if (function1 != null) {
                    handler = this.this$0.mainHandler;
                    handler.post(new Runnable() { // from class: com.example.rungps.ble.BleClient$syncSoccerFromWatch$1$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            Function1.this.invoke(moyoungImportStats2);
                        }
                    });
                }
                return Unit.INSTANCE;
            }
            boolean z5 = this.Z$1;
            boolean z6 = this.Z$0;
            Mutex mutex4 = (Mutex) this.L$3;
            BluetoothGatt bluetoothGatt3 = (BluetoothGatt) this.L$2;
            BleClient bleClient5 = (BleClient) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            z2 = z5;
            z = z6;
            mutex2 = mutex4;
            bluetoothGatt = bluetoothGatt3;
            bleClient = bleClient5;
        }
        CoroutineDispatcher io2 = Dispatchers.getIO();
        BleClient$syncSoccerFromWatch$1$stats$1$1$1 bleClient$syncSoccerFromWatch$1$stats$1$1$1 = new BleClient$syncSoccerFromWatch$1$stats$1$1$1(bleClient, z, bluetoothGatt, z2, null);
        this.L$0 = coroutineScope;
        this.L$1 = mutex2;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
        withContext = BuildersKt.withContext(io2, bleClient$syncSoccerFromWatch$1$stats$1$1$1, this);
        r2 = mutex2;
        if (withContext == coroutine_suspended) {
            return coroutine_suspended;
        }
        MoyoungImportStats moyoungImportStats3 = (MoyoungImportStats) withContext;
        r2.unlock(null);
        m7905constructorimpl = Result.m7905constructorimpl(moyoungImportStats3);
        BleClient bleClient32 = this.this$0;
        m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
        }
        final MoyoungImportStats moyoungImportStats22 = (MoyoungImportStats) m7905constructorimpl;
        if (this.$useExerciseTrackerBand) {
        }
        mutableStateFlow = this.this$0._status;
        mutableStateFlow2 = this.this$0._status;
        copy = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : null, (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : Boxing.boxInt(moyoungImportStats22.getImported()), (r36 & 16384) != 0 ? r2.lastMoyoungImport : moyoungImportStats22, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
        mutableStateFlow.setValue(copy);
        function1 = this.$onDone;
        if (function1 != null) {
        }
        return Unit.INSTANCE;
    }
}
