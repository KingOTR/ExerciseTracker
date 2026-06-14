package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import android.content.Context;
import com.example.rungps.ble.moyoung.MoyoungConstants;
import com.example.rungps.ble.moyoung.MoyoungWorkoutSync;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.MoyoungImportStats;
import com.example.rungps.data.Repository;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/example/rungps/data/MoyoungImportStats;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ble.BleClient$syncSoccerFromWatch$1$stats$1$1$1", f = "BleClient.kt", i = {0, 1, 2}, l = {222, 229, 232}, m = "invokeSuspend", n = {"repo", "repo", "stats"}, s = {"L$0", "L$0", "L$0"})
/* loaded from: classes3.dex */
final class BleClient$syncSoccerFromWatch$1$stats$1$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super MoyoungImportStats>, Object> {
    final /* synthetic */ BluetoothGatt $g;
    final /* synthetic */ boolean $useExerciseTrackerBand;
    final /* synthetic */ boolean $useMoyoung;
    Object L$0;
    int label;
    final /* synthetic */ BleClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BleClient$syncSoccerFromWatch$1$stats$1$1$1(BleClient bleClient, boolean z, BluetoothGatt bluetoothGatt, boolean z2, Continuation<? super BleClient$syncSoccerFromWatch$1$stats$1$1$1> continuation) {
        super(2, continuation);
        this.this$0 = bleClient;
        this.$useMoyoung = z;
        this.$g = bluetoothGatt;
        this.$useExerciseTrackerBand = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BleClient$syncSoccerFromWatch$1$stats$1$1$1(this.this$0, this.$useMoyoung, this.$g, this.$useExerciseTrackerBand, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super MoyoungImportStats> continuation) {
        return ((BleClient$syncSoccerFromWatch$1$stats$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Context context;
        Repository repository;
        MoyoungImportStats moyoungImportStats;
        MoyoungWorkoutSync moyoungWorkoutSync;
        Object fetchWorkouts;
        int i;
        MutableStateFlow mutableStateFlow;
        MutableStateFlow mutableStateFlow2;
        BleStatus copy;
        Object importMoyoungWorkouts;
        BleGattOps bleGattOps;
        Object pullAndImport;
        MoyoungImportStats moyoungImportStats2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            Repository.Companion companion = Repository.INSTANCE;
            context = this.this$0.context;
            repository = companion.get(context);
            boolean z = this.$useMoyoung || this.$g.getService(MoyoungConstants.INSTANCE.getUUID_SERVICE()) != null;
            moyoungImportStats = new MoyoungImportStats(0, 0, 0, 0, 15, null);
            if (z) {
                if (!this.$useMoyoung) {
                    mutableStateFlow = this.this$0._status;
                    mutableStateFlow2 = this.this$0._status;
                    copy = r8.copy((r36 & 1) != 0 ? r8.enabled : false, (r36 & 2) != 0 ? r8.scanning : false, (r36 & 4) != 0 ? r8.connectingTo : null, (r36 & 8) != 0 ? r8.connectedAddress : null, (r36 & 16) != 0 ? r8.lastError : null, (r36 & 32) != 0 ? r8.devices : null, (r36 & 64) != 0 ? r8.services : null, (r36 & 128) != 0 ? r8.hasHeartRateService : false, (r36 & 256) != 0 ? r8.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r8.hasMoyoungService : true, (r36 & 1024) != 0 ? r8.watchSoccerState : null, (r36 & 2048) != 0 ? r8.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r8.syncingSoccer : false, (r36 & 8192) != 0 ? r8.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r8.lastMoyoungImport : null, (r36 & 32768) != 0 ? r8.latestHrBpm : null, (r36 & 65536) != 0 ? r8.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
                    mutableStateFlow.setValue(copy);
                }
                moyoungWorkoutSync = this.this$0.moyoungSync;
                if (moyoungWorkoutSync == null) {
                    BluetoothGatt bluetoothGatt = this.$g;
                    i = this.this$0.moyoungMtu;
                    moyoungWorkoutSync = new MoyoungWorkoutSync(bluetoothGatt, i);
                    this.this$0.moyoungSync = moyoungWorkoutSync;
                }
                this.L$0 = repository;
                this.label = 1;
                fetchWorkouts = moyoungWorkoutSync.fetchWorkouts(this);
                if (fetchWorkouts == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            if (!this.$useExerciseTrackerBand) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    MoyoungImportStats moyoungImportStats3 = (MoyoungImportStats) this.L$0;
                    ResultKt.throwOnFailure(obj);
                    moyoungImportStats2 = moyoungImportStats3;
                    pullAndImport = obj;
                    int intValue = ((Number) pullAndImport).intValue();
                    return MoyoungImportStats.copy$default(moyoungImportStats2, moyoungImportStats2.getImported() + intValue, 0, 0, moyoungImportStats2.getFetchedFromWatch() + intValue, 6, null);
                }
                repository = (Repository) this.L$0;
                ResultKt.throwOnFailure(obj);
                importMoyoungWorkouts = obj;
                moyoungImportStats = (MoyoungImportStats) importMoyoungWorkouts;
                if (!this.$useExerciseTrackerBand) {
                    return moyoungImportStats;
                }
                WatchSoccerSync watchSoccerSync = WatchSoccerSync.INSTANCE;
                BluetoothGatt bluetoothGatt2 = this.$g;
                bleGattOps = this.this$0.gattOps;
                this.L$0 = moyoungImportStats;
                this.label = 3;
                pullAndImport = watchSoccerSync.pullAndImport(bluetoothGatt2, bleGattOps, repository, this);
                if (pullAndImport == coroutine_suspended) {
                    return coroutine_suspended;
                }
                moyoungImportStats2 = moyoungImportStats;
                int intValue2 = ((Number) pullAndImport).intValue();
                return MoyoungImportStats.copy$default(moyoungImportStats2, moyoungImportStats2.getImported() + intValue2, 0, 0, moyoungImportStats2.getFetchedFromWatch() + intValue2, 6, null);
            }
            repository = (Repository) this.L$0;
            ResultKt.throwOnFailure(obj);
            fetchWorkouts = obj;
        }
        BuildersKt__BuildersKt.runBlocking$default(null, new AnonymousClass1(this.this$0, null), 1, null);
        this.L$0 = repository;
        this.label = 2;
        importMoyoungWorkouts = repository.importMoyoungWorkouts((List) fetchWorkouts, this);
        if (importMoyoungWorkouts == coroutine_suspended) {
            return coroutine_suspended;
        }
        moyoungImportStats = (MoyoungImportStats) importMoyoungWorkouts;
        if (!this.$useExerciseTrackerBand) {
        }
    }

    /* compiled from: BleClient.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "com.example.rungps.ble.BleClient$syncSoccerFromWatch$1$stats$1$1$1$1", f = "BleClient.kt", i = {}, l = {224}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.example.rungps.ble.BleClient$syncSoccerFromWatch$1$stats$1$1$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;
        final /* synthetic */ BleClient this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(BleClient bleClient, Continuation<? super AnonymousClass1> continuation) {
            super(2, continuation);
            this.this$0 = bleClient;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Context context;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AppPreferences appPreferences = AppPreferences.INSTANCE;
                context = this.this$0.context;
                this.label = 1;
                if (appPreferences.setMoyoungLastSyncMs(context, System.currentTimeMillis(), this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }
}
