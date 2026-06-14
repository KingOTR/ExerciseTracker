package com.example.rungps.ble;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.bluetooth.BluetoothManager;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.autofill.HintConstants;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.example.rungps.ble.moyoung.MoyoungConstants;
import com.example.rungps.ble.moyoung.MoyoungWorkoutSync;
import com.example.rungps.data.MoyoungImportStats;
import com.example.rungps.tracking.RecordingHrBridge;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: BleClient.kt */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\b\u0007*\u0002>A\b\u0007\u0018\u0000 F2\u00020\u0001:\u0001FB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010(\u001a\u00020)H\u0002J\u0006\u0010*\u001a\u00020+J\u0006\u0010,\u001a\u00020+J\u0010\u0010-\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/J\u0006\u00100\u001a\u00020+J-\u00101\u001a\u00020+2%\b\u0002\u00102\u001a\u001f\u0012\u0013\u0012\u001104¢\u0006\f\b5\u0012\b\b6\u0012\u0004\b\b(7\u0012\u0004\u0012\u00020+\u0018\u000103J\u0006\u00108\u001a\u00020+J\u0010\u00109\u001a\u00020+2\b\b\u0002\u0010.\u001a\u00020/J\u000e\u0010:\u001a\u00020+2\u0006\u0010;\u001a\u00020<J\u000e\u0010C\u001a\u00020+2\u0006\u0010D\u001a\u00020)J\b\u0010E\u001a\u00020+H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0004\n\u0002\u0010?R\u0010\u0010@\u001a\u00020AX\u0082\u0004¢\u0006\u0004\n\u0002\u0010B¨\u0006G"}, d2 = {"Lcom/example/rungps/ble/BleClient;", "", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "scope", "Lkotlinx/coroutines/CoroutineScope;", "_status", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/rungps/ble/BleStatus;", NotificationCompat.CATEGORY_STATUS, "Lkotlinx/coroutines/flow/StateFlow;", "getStatus", "()Lkotlinx/coroutines/flow/StateFlow;", "btManager", "Landroid/bluetooth/BluetoothManager;", "adapter", "Landroid/bluetooth/BluetoothAdapter;", "getAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "scanJob", "Lkotlinx/coroutines/Job;", "gatt", "Landroid/bluetooth/BluetoothGatt;", "hrChar", "Landroid/bluetooth/BluetoothGattCharacteristic;", "hrTestJob", "recordingHrPollJob", "gattOps", "Lcom/example/rungps/ble/BleGattOps;", "syncJob", "moyoungSync", "Lcom/example/rungps/ble/moyoung/MoyoungWorkoutSync;", "moyoungMtu", "", "syncMutex", "Lkotlinx/coroutines/sync/Mutex;", "mainHandler", "Landroid/os/Handler;", "hasBlePermissions", "", "refreshEnabled", "", "stopScan", "startScan", "durationMs", "", "disconnect", "syncSoccerFromWatch", "onDone", "Lkotlin/Function1;", "Lcom/example/rungps/data/MoyoungImportStats;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "stats", "refreshWatchSoccerStatus", "testHeartRate", "connect", "address", "", "scanCallback", "com/example/rungps/ble/BleClient$scanCallback$1", "Lcom/example/rungps/ble/BleClient$scanCallback$1;", "gattCallback", "com/example/rungps/ble/BleClient$gattCallback$1", "Lcom/example/rungps/ble/BleClient$gattCallback$1;", "setRecordingHrPoll", "enabled", "pollHrOnce", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BleClient {
    private static final UUID CCCD_UUID;
    private static final UUID HR_MEAS_UUID;
    private static final UUID HR_SERVICE_UUID;
    private final MutableStateFlow<BleStatus> _status;
    private final BluetoothManager btManager;
    private final Context context;
    private BluetoothGatt gatt;
    private final BleClient$gattCallback$1 gattCallback;
    private final BleGattOps gattOps;
    private BluetoothGattCharacteristic hrChar;
    private Job hrTestJob;
    private final Handler mainHandler;
    private int moyoungMtu;
    private MoyoungWorkoutSync moyoungSync;
    private Job recordingHrPollJob;
    private final BleClient$scanCallback$1 scanCallback;
    private Job scanJob;
    private final CoroutineScope scope;
    private final StateFlow<BleStatus> status;
    private Job syncJob;
    private final Mutex syncMutex;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Type inference failed for: r1v8, types: [com.example.rungps.ble.BleClient$scanCallback$1] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.example.rungps.ble.BleClient$gattCallback$1] */
    public BleClient(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.scope = CoroutineScopeKt.CoroutineScope(Dispatchers.getDefault().plus(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null)));
        MutableStateFlow<BleStatus> MutableStateFlow = StateFlowKt.MutableStateFlow(new BleStatus(false, false, null, null, null, null, null, false, false, false, null, null, false, null, null, null, null, false, 262143, null));
        this._status = MutableStateFlow;
        this.status = FlowKt.asStateFlow(MutableStateFlow);
        Object systemService = context.getSystemService("bluetooth");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.bluetooth.BluetoothManager");
        this.btManager = (BluetoothManager) systemService;
        this.gattOps = new BleGattOps();
        this.moyoungMtu = 20;
        this.syncMutex = MutexKt.Mutex$default(false, 1, null);
        this.mainHandler = new Handler(Looper.getMainLooper());
        this.scanCallback = new ScanCallback() { // from class: com.example.rungps.ble.BleClient$scanCallback$1
            @Override // android.bluetooth.le.ScanCallback
            public void onScanResult(int callbackType, ScanResult result) {
                Object m7905constructorimpl;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                MutableStateFlow mutableStateFlow3;
                BleStatus copy;
                Intrinsics.checkNotNullParameter(result, "result");
                BluetoothDevice device = result.getDevice();
                if (device == null) {
                    return;
                }
                try {
                    Result.Companion companion = Result.INSTANCE;
                    BleClient$scanCallback$1 bleClient$scanCallback$1 = this;
                    m7905constructorimpl = Result.m7905constructorimpl(device.getName());
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    m7905constructorimpl = null;
                }
                String str = (String) m7905constructorimpl;
                String address = device.getAddress();
                if (address == null) {
                    return;
                }
                int rssi = result.getRssi();
                mutableStateFlow = BleClient.this._status;
                List mutableList = CollectionsKt.toMutableList((Collection) ((BleStatus) mutableStateFlow.getValue()).getDevices());
                Iterator it = mutableList.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                        break;
                    } else if (Intrinsics.areEqual(((BleScanDevice) it.next()).getAddress(), address)) {
                        break;
                    } else {
                        i++;
                    }
                }
                BleScanDevice bleScanDevice = new BleScanDevice(str, address, Integer.valueOf(rssi));
                if (i >= 0) {
                    mutableList.set(i, bleScanDevice);
                } else {
                    mutableList.add(bleScanDevice);
                }
                if (mutableList.size() > 1) {
                    CollectionsKt.sortWith(mutableList, new Comparator() { // from class: com.example.rungps.ble.BleClient$scanCallback$1$onScanResult$$inlined$sortByDescending$1
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // java.util.Comparator
                        public final int compare(T t, T t2) {
                            Integer rssi2 = ((BleScanDevice) t2).getRssi();
                            Integer valueOf = Integer.valueOf(rssi2 != null ? rssi2.intValue() : -999);
                            Integer rssi3 = ((BleScanDevice) t).getRssi();
                            return ComparisonsKt.compareValues(valueOf, Integer.valueOf(rssi3 != null ? rssi3.intValue() : -999));
                        }
                    });
                }
                mutableStateFlow2 = BleClient.this._status;
                mutableStateFlow3 = BleClient.this._status;
                copy = r5.copy((r36 & 1) != 0 ? r5.enabled : false, (r36 & 2) != 0 ? r5.scanning : false, (r36 & 4) != 0 ? r5.connectingTo : null, (r36 & 8) != 0 ? r5.connectedAddress : null, (r36 & 16) != 0 ? r5.lastError : null, (r36 & 32) != 0 ? r5.devices : CollectionsKt.take(mutableList, 30), (r36 & 64) != 0 ? r5.services : null, (r36 & 128) != 0 ? r5.hasHeartRateService : false, (r36 & 256) != 0 ? r5.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r5.hasMoyoungService : false, (r36 & 1024) != 0 ? r5.watchSoccerState : null, (r36 & 2048) != 0 ? r5.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r5.syncingSoccer : false, (r36 & 8192) != 0 ? r5.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r5.lastMoyoungImport : null, (r36 & 32768) != 0 ? r5.latestHrBpm : null, (r36 & 65536) != 0 ? r5.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow3.getValue()).hrTestRunning : false);
                mutableStateFlow2.setValue(copy);
            }

            @Override // android.bluetooth.le.ScanCallback
            public void onScanFailed(int errorCode) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                BleStatus copy;
                mutableStateFlow = BleClient.this._status;
                mutableStateFlow2 = BleClient.this._status;
                copy = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "Scan failed (" + errorCode + ")", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
                mutableStateFlow.setValue(copy);
            }
        };
        this.gattCallback = new BluetoothGattCallback() { // from class: com.example.rungps.ble.BleClient$gattCallback$1
            @Override // android.bluetooth.BluetoothGattCallback
            public void onConnectionStateChange(BluetoothGatt gatt, int status, int newState) {
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                BleStatus copy;
                BluetoothGatt bluetoothGatt;
                MutableStateFlow mutableStateFlow3;
                MutableStateFlow mutableStateFlow4;
                BleStatus copy2;
                Context context2;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                if (newState == 0) {
                    mutableStateFlow = BleClient.this._status;
                    mutableStateFlow2 = BleClient.this._status;
                    copy = r5.copy((r36 & 1) != 0 ? r5.enabled : false, (r36 & 2) != 0 ? r5.scanning : false, (r36 & 4) != 0 ? r5.connectingTo : null, (r36 & 8) != 0 ? r5.connectedAddress : null, (r36 & 16) != 0 ? r5.lastError : null, (r36 & 32) != 0 ? r5.devices : null, (r36 & 64) != 0 ? r5.services : null, (r36 & 128) != 0 ? r5.hasHeartRateService : false, (r36 & 256) != 0 ? r5.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r5.hasMoyoungService : false, (r36 & 1024) != 0 ? r5.watchSoccerState : null, (r36 & 2048) != 0 ? r5.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r5.syncingSoccer : false, (r36 & 8192) != 0 ? r5.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r5.lastMoyoungImport : null, (r36 & 32768) != 0 ? r5.latestHrBpm : null, (r36 & 65536) != 0 ? r5.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
                    mutableStateFlow.setValue(copy);
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        BleClient$gattCallback$1 bleClient$gattCallback$1 = this;
                        gatt.close();
                        Result.m7905constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                    }
                    bluetoothGatt = BleClient.this.gatt;
                    if (Intrinsics.areEqual(bluetoothGatt, gatt)) {
                        BleClient.this.gatt = null;
                        return;
                    }
                    return;
                }
                if (newState != 2) {
                    return;
                }
                BluetoothDevice device = gatt.getDevice();
                String address = device != null ? device.getAddress() : null;
                BluetoothDevice device2 = gatt.getDevice();
                String name = device2 != null ? device2.getName() : null;
                String str = address;
                if (str != null && !StringsKt.isBlank(str)) {
                    SavedBleWatchStore savedBleWatchStore = SavedBleWatchStore.INSTANCE;
                    context2 = BleClient.this.context;
                    savedBleWatchStore.remember(context2, address, name);
                }
                mutableStateFlow3 = BleClient.this._status;
                mutableStateFlow4 = BleClient.this._status;
                copy2 = r4.copy((r36 & 1) != 0 ? r4.enabled : false, (r36 & 2) != 0 ? r4.scanning : false, (r36 & 4) != 0 ? r4.connectingTo : null, (r36 & 8) != 0 ? r4.connectedAddress : address, (r36 & 16) != 0 ? r4.lastError : null, (r36 & 32) != 0 ? r4.devices : CollectionsKt.emptyList(), (r36 & 64) != 0 ? r4.services : null, (r36 & 128) != 0 ? r4.hasHeartRateService : false, (r36 & 256) != 0 ? r4.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r4.hasMoyoungService : false, (r36 & 1024) != 0 ? r4.watchSoccerState : null, (r36 & 2048) != 0 ? r4.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r4.syncingSoccer : false, (r36 & 8192) != 0 ? r4.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r4.lastMoyoungImport : null, (r36 & 32768) != 0 ? r4.latestHrBpm : null, (r36 & 65536) != 0 ? r4.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow4.getValue()).hrTestRunning : false);
                mutableStateFlow3.setValue(copy2);
                try {
                    Result.Companion companion3 = Result.INSTANCE;
                    BleClient$gattCallback$1 bleClient$gattCallback$12 = this;
                    Result.m7905constructorimpl(Boolean.valueOf(gatt.discoverServices()));
                } catch (Throwable th2) {
                    Result.Companion companion4 = Result.INSTANCE;
                    Result.m7905constructorimpl(ResultKt.createFailure(th2));
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onMtuChanged(BluetoothGatt gatt, int mtu, int status) {
                MoyoungWorkoutSync moyoungWorkoutSync;
                int i;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                if (status == 0) {
                    BleClient.this.moyoungMtu = RangesKt.coerceIn(mtu - 3, 20, 512);
                    moyoungWorkoutSync = BleClient.this.moyoungSync;
                    if (moyoungWorkoutSync != null) {
                        i = BleClient.this.moyoungMtu;
                        moyoungWorkoutSync.setMtu(i);
                    }
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onServicesDiscovered(BluetoothGatt gatt, int status) {
                boolean z;
                boolean z2;
                boolean z3;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                BleStatus copy;
                CoroutineScope coroutineScope;
                Object obj;
                int i;
                CoroutineScope coroutineScope2;
                MutableStateFlow mutableStateFlow3;
                MutableStateFlow mutableStateFlow4;
                BleStatus copy2;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                if (status != 0) {
                    mutableStateFlow3 = BleClient.this._status;
                    mutableStateFlow4 = BleClient.this._status;
                    copy2 = r3.copy((r36 & 1) != 0 ? r3.enabled : false, (r36 & 2) != 0 ? r3.scanning : false, (r36 & 4) != 0 ? r3.connectingTo : null, (r36 & 8) != 0 ? r3.connectedAddress : null, (r36 & 16) != 0 ? r3.lastError : "Service discovery failed (" + status + ")", (r36 & 32) != 0 ? r3.devices : null, (r36 & 64) != 0 ? r3.services : null, (r36 & 128) != 0 ? r3.hasHeartRateService : false, (r36 & 256) != 0 ? r3.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r3.hasMoyoungService : false, (r36 & 1024) != 0 ? r3.watchSoccerState : null, (r36 & 2048) != 0 ? r3.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r3.syncingSoccer : false, (r36 & 8192) != 0 ? r3.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r3.lastMoyoungImport : null, (r36 & 32768) != 0 ? r3.latestHrBpm : null, (r36 & 65536) != 0 ? r3.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow4.getValue()).hrTestRunning : false);
                    mutableStateFlow3.setValue(copy2);
                    return;
                }
                List<BluetoothGattService> services = gatt.getServices();
                if (services == null) {
                    services = CollectionsKt.emptyList();
                }
                List<BluetoothGattService> list = services;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (BluetoothGattService bluetoothGattService : list) {
                    String uuid = bluetoothGattService.getUuid().toString();
                    Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
                    List<BluetoothGattCharacteristic> characteristics = bluetoothGattService.getCharacteristics();
                    if (characteristics == null) {
                        characteristics = CollectionsKt.emptyList();
                    }
                    List<BluetoothGattCharacteristic> list2 = characteristics;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : list2) {
                        String uuid2 = bluetoothGattCharacteristic.getUuid().toString();
                        Intrinsics.checkNotNullExpressionValue(uuid2, "toString(...)");
                        arrayList2.add(new BleGattChar(uuid2, bluetoothGattCharacteristic.getProperties()));
                    }
                    arrayList.add(new BleGattServiceInfo(uuid, arrayList2));
                }
                List sortedWith = CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.example.rungps.ble.BleClient$gattCallback$1$onServicesDiscovered$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(((BleGattServiceInfo) t).getUuid(), ((BleGattServiceInfo) t2).getUuid());
                    }
                });
                boolean z4 = list instanceof Collection;
                if (!z4 || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        if (Intrinsics.areEqual(((BluetoothGattService) it.next()).getUuid(), BleClient.INSTANCE.getHR_SERVICE_UUID())) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                if (!z4 || !list.isEmpty()) {
                    Iterator<T> it2 = list.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.areEqual(((BluetoothGattService) it2.next()).getUuid(), ExerciseTrackerBleUuids.INSTANCE.getSERVICE())) {
                            z2 = true;
                            break;
                        }
                    }
                }
                z2 = false;
                if (!z4 || !list.isEmpty()) {
                    Iterator<T> it3 = list.iterator();
                    while (it3.hasNext()) {
                        if (Intrinsics.areEqual(((BluetoothGattService) it3.next()).getUuid(), MoyoungConstants.INSTANCE.getUUID_SERVICE())) {
                            z3 = true;
                            break;
                        }
                    }
                }
                z3 = false;
                mutableStateFlow = BleClient.this._status;
                mutableStateFlow2 = BleClient.this._status;
                boolean z5 = z2;
                copy = r5.copy((r36 & 1) != 0 ? r5.enabled : false, (r36 & 2) != 0 ? r5.scanning : false, (r36 & 4) != 0 ? r5.connectingTo : null, (r36 & 8) != 0 ? r5.connectedAddress : null, (r36 & 16) != 0 ? r5.lastError : null, (r36 & 32) != 0 ? r5.devices : null, (r36 & 64) != 0 ? r5.services : sortedWith, (r36 & 128) != 0 ? r5.hasHeartRateService : z, (r36 & 256) != 0 ? r5.hasExerciseTrackerSoccerService : z2, (r36 & 512) != 0 ? r5.hasMoyoungService : z3, (r36 & 1024) != 0 ? r5.watchSoccerState : null, (r36 & 2048) != 0 ? r5.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r5.syncingSoccer : false, (r36 & 8192) != 0 ? r5.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r5.lastMoyoungImport : null, (r36 & 32768) != 0 ? r5.latestHrBpm : null, (r36 & 65536) != 0 ? r5.latestHrAtMs : null, (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
                mutableStateFlow.setValue(copy);
                if (z3) {
                    BleClient bleClient = BleClient.this;
                    i = BleClient.this.moyoungMtu;
                    bleClient.moyoungSync = new MoyoungWorkoutSync(gatt, i);
                    coroutineScope2 = BleClient.this.scope;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, Dispatchers.getMain(), null, new BleClient$gattCallback$1$onServicesDiscovered$1(gatt, null), 2, null);
                }
                if (z5 || z3) {
                    coroutineScope = BleClient.this.scope;
                    BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new BleClient$gattCallback$1$onServicesDiscovered$2(BleClient.this, gatt, z5, null), 3, null);
                }
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        obj = it4.next();
                        if (Intrinsics.areEqual(((BluetoothGattService) obj).getUuid(), BleClient.INSTANCE.getHR_SERVICE_UUID())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                BluetoothGattService bluetoothGattService2 = (BluetoothGattService) obj;
                BluetoothGattCharacteristic characteristic = bluetoothGattService2 != null ? bluetoothGattService2.getCharacteristic(BleClient.INSTANCE.getHR_MEAS_UUID()) : null;
                if (characteristic != null) {
                    BleClient.this.hrChar = characteristic;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        BleClient$gattCallback$1 bleClient$gattCallback$1 = this;
                        gatt.setCharacteristicNotification(characteristic, true);
                        BluetoothGattDescriptor descriptor = characteristic.getDescriptor(BleClient.INSTANCE.getCCCD_UUID());
                        if (descriptor != null) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                gatt.writeDescriptor(descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                            } else {
                                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                                gatt.writeDescriptor(descriptor);
                            }
                        }
                        Result.m7905constructorimpl(Unit.INSTANCE);
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th));
                    }
                }
            }

            private final void handleHrBytes(byte[] data) {
                int i;
                MutableStateFlow mutableStateFlow;
                MutableStateFlow mutableStateFlow2;
                BleStatus copy;
                if (data.length == 0) {
                    return;
                }
                if ((data[0] & 1) == 0) {
                    if (data.length < 2) {
                        return;
                    } else {
                        i = data[1] & 255;
                    }
                } else {
                    if (data.length < 3) {
                        return;
                    }
                    i = ((data[2] & 255) << 8) | (data[1] & 255);
                }
                long currentTimeMillis = System.currentTimeMillis();
                mutableStateFlow = BleClient.this._status;
                mutableStateFlow2 = BleClient.this._status;
                copy = r5.copy((r36 & 1) != 0 ? r5.enabled : false, (r36 & 2) != 0 ? r5.scanning : false, (r36 & 4) != 0 ? r5.connectingTo : null, (r36 & 8) != 0 ? r5.connectedAddress : null, (r36 & 16) != 0 ? r5.lastError : null, (r36 & 32) != 0 ? r5.devices : null, (r36 & 64) != 0 ? r5.services : null, (r36 & 128) != 0 ? r5.hasHeartRateService : false, (r36 & 256) != 0 ? r5.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r5.hasMoyoungService : false, (r36 & 1024) != 0 ? r5.watchSoccerState : null, (r36 & 2048) != 0 ? r5.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r5.syncingSoccer : false, (r36 & 8192) != 0 ? r5.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r5.lastMoyoungImport : null, (r36 & 32768) != 0 ? r5.latestHrBpm : Integer.valueOf(i), (r36 & 65536) != 0 ? r5.latestHrAtMs : Long.valueOf(currentTimeMillis), (r36 & 131072) != 0 ? ((BleStatus) mutableStateFlow2.getValue()).hrTestRunning : false);
                mutableStateFlow.setValue(copy);
                RecordingHrBridge.INSTANCE.offerSample(i, currentTimeMillis);
            }

            /* JADX WARN: Code restructure failed: missing block: B:7:0x0021, code lost:
            
                r1 = r1.this$0.moyoungSync;
             */
            @Override // android.bluetooth.BluetoothGattCallback
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic) {
                byte[] value;
                MoyoungWorkoutSync moyoungWorkoutSync;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                if (Intrinsics.areEqual(characteristic.getUuid(), MoyoungConstants.INSTANCE.getUUID_CHARACTERISTIC_DATA_IN())) {
                    byte[] value2 = characteristic.getValue();
                    if (value2 == null || moyoungWorkoutSync == null) {
                        return;
                    }
                    moyoungWorkoutSync.onNotify(value2);
                    return;
                }
                if (Intrinsics.areEqual(characteristic.getUuid(), BleClient.INSTANCE.getHR_MEAS_UUID()) && (value = characteristic.getValue()) != null) {
                    handleHrBytes(value);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicChanged(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, byte[] value) {
                MoyoungWorkoutSync moyoungWorkoutSync;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                Intrinsics.checkNotNullParameter(value, "value");
                if (Intrinsics.areEqual(characteristic.getUuid(), MoyoungConstants.INSTANCE.getUUID_CHARACTERISTIC_DATA_IN())) {
                    moyoungWorkoutSync = BleClient.this.moyoungSync;
                    if (moyoungWorkoutSync != null) {
                        moyoungWorkoutSync.onNotify(value);
                        return;
                    }
                    return;
                }
                if (Intrinsics.areEqual(characteristic.getUuid(), BleClient.INSTANCE.getHR_MEAS_UUID())) {
                    handleHrBytes(value);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
                byte[] value;
                BleGattOps bleGattOps;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                if (Build.VERSION.SDK_INT >= 33) {
                    value = characteristic.getValue();
                } else {
                    value = characteristic.getValue();
                }
                bleGattOps = BleClient.this.gattOps;
                UUID uuid = characteristic.getUuid();
                Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                bleGattOps.completeRead(uuid, value, status);
                if (Intrinsics.areEqual(characteristic.getUuid(), BleClient.INSTANCE.getHR_MEAS_UUID()) && status == 0 && value != null) {
                    handleHrBytes(value);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicRead(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, byte[] value, int status) {
                BleGattOps bleGattOps;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                Intrinsics.checkNotNullParameter(value, "value");
                bleGattOps = BleClient.this.gattOps;
                UUID uuid = characteristic.getUuid();
                Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                bleGattOps.completeRead(uuid, value, status);
                if (Intrinsics.areEqual(characteristic.getUuid(), BleClient.INSTANCE.getHR_MEAS_UUID()) && status == 0) {
                    handleHrBytes(value);
                }
            }

            @Override // android.bluetooth.BluetoothGattCallback
            public void onCharacteristicWrite(BluetoothGatt gatt, BluetoothGattCharacteristic characteristic, int status) {
                BleGattOps bleGattOps;
                Intrinsics.checkNotNullParameter(gatt, "gatt");
                Intrinsics.checkNotNullParameter(characteristic, "characteristic");
                bleGattOps = BleClient.this.gattOps;
                UUID uuid = characteristic.getUuid();
                Intrinsics.checkNotNullExpressionValue(uuid, "getUuid(...)");
                bleGattOps.completeWrite(uuid, status);
            }
        };
    }

    public final StateFlow<BleStatus> getStatus() {
        return this.status;
    }

    private final BluetoothAdapter getAdapter() {
        return this.btManager.getAdapter();
    }

    private final boolean hasBlePermissions() {
        if (Build.VERSION.SDK_INT >= 31) {
            if (ContextCompat.checkSelfPermission(this.context, "android.permission.BLUETOOTH_SCAN") == 0 && ContextCompat.checkSelfPermission(this.context, "android.permission.BLUETOOTH_CONNECT") == 0) {
                return true;
            }
        } else if (ContextCompat.checkSelfPermission(this.context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public final void refreshEnabled() {
        BleClient bleClient;
        boolean z;
        BleStatus copy;
        BluetoothAdapter adapter = getAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            bleClient = this;
            z = false;
        } else {
            bleClient = this;
            z = true;
        }
        MutableStateFlow<BleStatus> mutableStateFlow = bleClient._status;
        copy = r3.copy((r36 & 1) != 0 ? r3.enabled : z, (r36 & 2) != 0 ? r3.scanning : false, (r36 & 4) != 0 ? r3.connectingTo : null, (r36 & 8) != 0 ? r3.connectedAddress : null, (r36 & 16) != 0 ? r3.lastError : null, (r36 & 32) != 0 ? r3.devices : null, (r36 & 64) != 0 ? r3.services : null, (r36 & 128) != 0 ? r3.hasHeartRateService : false, (r36 & 256) != 0 ? r3.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r3.hasMoyoungService : false, (r36 & 1024) != 0 ? r3.watchSoccerState : null, (r36 & 2048) != 0 ? r3.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r3.syncingSoccer : false, (r36 & 8192) != 0 ? r3.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r3.lastMoyoungImport : null, (r36 & 32768) != 0 ? r3.latestHrBpm : null, (r36 & 65536) != 0 ? r3.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow.getValue().hrTestRunning : false);
        mutableStateFlow.setValue(copy);
    }

    public final void stopScan() {
        BluetoothLeScanner bluetoothLeScanner;
        BleStatus copy;
        Job job = this.scanJob;
        Unit unit = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.scanJob = null;
        if (hasBlePermissions()) {
            try {
                Result.Companion companion = Result.INSTANCE;
                BleClient bleClient = this;
                BluetoothAdapter adapter = getAdapter();
                if (adapter != null && (bluetoothLeScanner = adapter.getBluetoothLeScanner()) != null) {
                    bluetoothLeScanner.stopScan(this.scanCallback);
                    unit = Unit.INSTANCE;
                }
                Result.m7905constructorimpl(unit);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m7905constructorimpl(ResultKt.createFailure(th));
            }
        }
        MutableStateFlow<BleStatus> mutableStateFlow = this._status;
        copy = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : null, (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow.getValue().hrTestRunning : false);
        mutableStateFlow.setValue(copy);
    }

    public static /* synthetic */ void startScan$default(BleClient bleClient, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 10000;
        }
        bleClient.startScan(j);
    }

    public final void startScan(long durationMs) {
        BleStatus copy;
        BleStatus copy2;
        Object m7905constructorimpl;
        Job launch$default;
        BleStatus copy3;
        Unit unit;
        BleStatus copy4;
        refreshEnabled();
        BluetoothAdapter adapter = getAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            MutableStateFlow<BleStatus> mutableStateFlow = this._status;
            copy = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "Bluetooth is OFF", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow.getValue().hrTestRunning : false);
            mutableStateFlow.setValue(copy);
            return;
        }
        if (!hasBlePermissions()) {
            MutableStateFlow<BleStatus> mutableStateFlow2 = this._status;
            copy4 = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "Missing Bluetooth permission", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow2.getValue().hrTestRunning : false);
            mutableStateFlow2.setValue(copy4);
            return;
        }
        MutableStateFlow<BleStatus> mutableStateFlow3 = this._status;
        copy2 = r4.copy((r36 & 1) != 0 ? r4.enabled : false, (r36 & 2) != 0 ? r4.scanning : true, (r36 & 4) != 0 ? r4.connectingTo : null, (r36 & 8) != 0 ? r4.connectedAddress : null, (r36 & 16) != 0 ? r4.lastError : null, (r36 & 32) != 0 ? r4.devices : CollectionsKt.emptyList(), (r36 & 64) != 0 ? r4.services : CollectionsKt.emptyList(), (r36 & 128) != 0 ? r4.hasHeartRateService : false, (r36 & 256) != 0 ? r4.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r4.hasMoyoungService : false, (r36 & 1024) != 0 ? r4.watchSoccerState : null, (r36 & 2048) != 0 ? r4.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r4.syncingSoccer : false, (r36 & 8192) != 0 ? r4.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r4.lastMoyoungImport : null, (r36 & 32768) != 0 ? r4.latestHrBpm : null, (r36 & 65536) != 0 ? r4.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow3.getValue().hrTestRunning : false);
        mutableStateFlow3.setValue(copy2);
        try {
            Result.Companion companion = Result.INSTANCE;
            BleClient bleClient = this;
            BluetoothLeScanner bluetoothLeScanner = adapter.getBluetoothLeScanner();
            if (bluetoothLeScanner != null) {
                bluetoothLeScanner.startScan(this.scanCallback);
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            m7905constructorimpl = Result.m7905constructorimpl(unit);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(m7905constructorimpl);
        if (m7908exceptionOrNullimpl != null) {
            MutableStateFlow<BleStatus> mutableStateFlow4 = this._status;
            BleStatus value = mutableStateFlow4.getValue();
            String message = m7908exceptionOrNullimpl.getMessage();
            if (message == null) {
                message = "Scan failed";
            }
            copy3 = value.copy((r36 & 1) != 0 ? value.enabled : false, (r36 & 2) != 0 ? value.scanning : false, (r36 & 4) != 0 ? value.connectingTo : null, (r36 & 8) != 0 ? value.connectedAddress : null, (r36 & 16) != 0 ? value.lastError : message, (r36 & 32) != 0 ? value.devices : null, (r36 & 64) != 0 ? value.services : null, (r36 & 128) != 0 ? value.hasHeartRateService : false, (r36 & 256) != 0 ? value.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? value.hasMoyoungService : false, (r36 & 1024) != 0 ? value.watchSoccerState : null, (r36 & 2048) != 0 ? value.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? value.syncingSoccer : false, (r36 & 8192) != 0 ? value.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? value.lastMoyoungImport : null, (r36 & 32768) != 0 ? value.latestHrBpm : null, (r36 & 65536) != 0 ? value.latestHrAtMs : null, (r36 & 131072) != 0 ? value.hrTestRunning : false);
            mutableStateFlow4.setValue(copy3);
            return;
        }
        Job job = this.scanJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new BleClient$startScan$3(durationMs, this, null), 3, null);
        this.scanJob = launch$default;
    }

    public final void disconnect() {
        BleStatus copy;
        BleStatus copy2;
        Unit unit;
        Unit unit2;
        Job job = this.syncJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.syncJob = null;
        this.gattOps.clear();
        MutableStateFlow<BleStatus> mutableStateFlow = this._status;
        copy = r5.copy((r36 & 1) != 0 ? r5.enabled : false, (r36 & 2) != 0 ? r5.scanning : false, (r36 & 4) != 0 ? r5.connectingTo : null, (r36 & 8) != 0 ? r5.connectedAddress : null, (r36 & 16) != 0 ? r5.lastError : null, (r36 & 32) != 0 ? r5.devices : null, (r36 & 64) != 0 ? r5.services : null, (r36 & 128) != 0 ? r5.hasHeartRateService : false, (r36 & 256) != 0 ? r5.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r5.hasMoyoungService : false, (r36 & 1024) != 0 ? r5.watchSoccerState : null, (r36 & 2048) != 0 ? r5.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r5.syncingSoccer : false, (r36 & 8192) != 0 ? r5.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r5.lastMoyoungImport : null, (r36 & 32768) != 0 ? r5.latestHrBpm : null, (r36 & 65536) != 0 ? r5.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow.getValue().hrTestRunning : false);
        mutableStateFlow.setValue(copy);
        try {
            Result.Companion companion = Result.INSTANCE;
            BleClient bleClient = this;
            BluetoothGatt bluetoothGatt = this.gatt;
            if (bluetoothGatt != null) {
                bluetoothGatt.disconnect();
                unit2 = Unit.INSTANCE;
            } else {
                unit2 = null;
            }
            Result.m7905constructorimpl(unit2);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        try {
            Result.Companion companion3 = Result.INSTANCE;
            BleClient bleClient2 = this;
            BluetoothGatt bluetoothGatt2 = this.gatt;
            if (bluetoothGatt2 != null) {
                bluetoothGatt2.close();
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            Result.m7905constructorimpl(unit);
        } catch (Throwable th2) {
            Result.Companion companion4 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th2));
        }
        this.gatt = null;
        this.moyoungSync = null;
        this.hrChar = null;
        Job job2 = this.hrTestJob;
        if (job2 != null) {
            Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
        }
        this.hrTestJob = null;
        MutableStateFlow<BleStatus> mutableStateFlow2 = this._status;
        copy2 = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : null, (r36 & 32) != 0 ? r2.devices : CollectionsKt.emptyList(), (r36 & 64) != 0 ? r2.services : CollectionsKt.emptyList(), (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow2.getValue().hrTestRunning : false);
        mutableStateFlow2.setValue(copy2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncSoccerFromWatch$default(BleClient bleClient, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            function1 = null;
        }
        bleClient.syncSoccerFromWatch(function1);
    }

    public final void syncSoccerFromWatch(Function1<? super MoyoungImportStats, Unit> onDone) {
        Job launch$default;
        BleStatus copy;
        BleStatus copy2;
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt == null) {
            MutableStateFlow<BleStatus> mutableStateFlow = this._status;
            copy2 = r4.copy((r36 & 1) != 0 ? r4.enabled : false, (r36 & 2) != 0 ? r4.scanning : false, (r36 & 4) != 0 ? r4.connectingTo : null, (r36 & 8) != 0 ? r4.connectedAddress : null, (r36 & 16) != 0 ? r4.lastError : "Not connected", (r36 & 32) != 0 ? r4.devices : null, (r36 & 64) != 0 ? r4.services : null, (r36 & 128) != 0 ? r4.hasHeartRateService : false, (r36 & 256) != 0 ? r4.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r4.hasMoyoungService : false, (r36 & 1024) != 0 ? r4.watchSoccerState : null, (r36 & 2048) != 0 ? r4.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r4.syncingSoccer : false, (r36 & 8192) != 0 ? r4.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r4.lastMoyoungImport : null, (r36 & 32768) != 0 ? r4.latestHrBpm : null, (r36 & 65536) != 0 ? r4.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow.getValue().hrTestRunning : false);
            mutableStateFlow.setValue(copy2);
            if (onDone != null) {
                onDone.invoke(new MoyoungImportStats(0, 0, 0, 0, 15, null));
                return;
            }
            return;
        }
        boolean hasMoyoungService = this._status.getValue().getHasMoyoungService();
        boolean hasExerciseTrackerSoccerService = this._status.getValue().getHasExerciseTrackerSoccerService();
        if (!hasMoyoungService && !hasExerciseTrackerSoccerService) {
            MutableStateFlow<BleStatus> mutableStateFlow2 = this._status;
            copy = r4.copy((r36 & 1) != 0 ? r4.enabled : false, (r36 & 2) != 0 ? r4.scanning : false, (r36 & 4) != 0 ? r4.connectingTo : null, (r36 & 8) != 0 ? r4.connectedAddress : null, (r36 & 16) != 0 ? r4.lastError : "Watch has no soccer sync service", (r36 & 32) != 0 ? r4.devices : null, (r36 & 64) != 0 ? r4.services : null, (r36 & 128) != 0 ? r4.hasHeartRateService : false, (r36 & 256) != 0 ? r4.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r4.hasMoyoungService : false, (r36 & 1024) != 0 ? r4.watchSoccerState : null, (r36 & 2048) != 0 ? r4.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r4.syncingSoccer : false, (r36 & 8192) != 0 ? r4.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r4.lastMoyoungImport : null, (r36 & 32768) != 0 ? r4.latestHrBpm : null, (r36 & 65536) != 0 ? r4.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow2.getValue().hrTestRunning : false);
            mutableStateFlow2.setValue(copy);
            if (onDone != null) {
                onDone.invoke(new MoyoungImportStats(0, 0, 0, 0, 15, null));
                return;
            }
            return;
        }
        if (!this._status.getValue().getSyncingSoccer()) {
            Job job = this.syncJob;
            if (job != null) {
                Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
            }
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new BleClient$syncSoccerFromWatch$1(this, hasExerciseTrackerSoccerService, onDone, hasMoyoungService, bluetoothGatt, null), 3, null);
            this.syncJob = launch$default;
            return;
        }
        if (onDone != null) {
            MoyoungImportStats lastMoyoungImport = this._status.getValue().getLastMoyoungImport();
            if (lastMoyoungImport == null) {
                lastMoyoungImport = new MoyoungImportStats(0, 0, 0, 0, 15, null);
            }
            onDone.invoke(lastMoyoungImport);
        }
    }

    public final void refreshWatchSoccerStatus() {
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt != null && this._status.getValue().getHasExerciseTrackerSoccerService()) {
            BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new BleClient$refreshWatchSoccerStatus$1(this, bluetoothGatt, null), 3, null);
        }
    }

    public static /* synthetic */ void testHeartRate$default(BleClient bleClient, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = 12000;
        }
        bleClient.testHeartRate(j);
    }

    public final void testHeartRate(long durationMs) {
        BleStatus copy;
        Job launch$default;
        BleStatus copy2;
        BleStatus copy3;
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt == null) {
            MutableStateFlow<BleStatus> mutableStateFlow = this._status;
            copy3 = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "Not connected", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow.getValue().hrTestRunning : false);
            mutableStateFlow.setValue(copy3);
            return;
        }
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.hrChar;
        if (bluetoothGattCharacteristic == null) {
            MutableStateFlow<BleStatus> mutableStateFlow2 = this._status;
            copy2 = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "HR characteristic not found", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow2.getValue().hrTestRunning : false);
            mutableStateFlow2.setValue(copy2);
            return;
        }
        MutableStateFlow<BleStatus> mutableStateFlow3 = this._status;
        copy = r8.copy((r36 & 1) != 0 ? r8.enabled : false, (r36 & 2) != 0 ? r8.scanning : false, (r36 & 4) != 0 ? r8.connectingTo : null, (r36 & 8) != 0 ? r8.connectedAddress : null, (r36 & 16) != 0 ? r8.lastError : null, (r36 & 32) != 0 ? r8.devices : null, (r36 & 64) != 0 ? r8.services : null, (r36 & 128) != 0 ? r8.hasHeartRateService : false, (r36 & 256) != 0 ? r8.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r8.hasMoyoungService : false, (r36 & 1024) != 0 ? r8.watchSoccerState : null, (r36 & 2048) != 0 ? r8.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r8.syncingSoccer : false, (r36 & 8192) != 0 ? r8.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r8.lastMoyoungImport : null, (r36 & 32768) != 0 ? r8.latestHrBpm : null, (r36 & 65536) != 0 ? r8.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow3.getValue().hrTestRunning : true);
        mutableStateFlow3.setValue(copy);
        Job job = this.hrTestJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new BleClient$testHeartRate$1(durationMs, this, bluetoothGatt, bluetoothGattCharacteristic, null), 3, null);
        this.hrTestJob = launch$default;
    }

    public final void connect(String address) {
        BleStatus copy;
        Object m7905constructorimpl;
        BleStatus copy2;
        BleStatus copy3;
        BleStatus copy4;
        Intrinsics.checkNotNullParameter(address, "address");
        refreshEnabled();
        BluetoothAdapter adapter = getAdapter();
        if (adapter == null || !adapter.isEnabled()) {
            MutableStateFlow<BleStatus> mutableStateFlow = this._status;
            copy = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "Bluetooth is OFF", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow.getValue().hrTestRunning : false);
            mutableStateFlow.setValue(copy);
            return;
        }
        if (!hasBlePermissions()) {
            MutableStateFlow<BleStatus> mutableStateFlow2 = this._status;
            copy4 = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "Missing Bluetooth permission", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow2.getValue().hrTestRunning : false);
            mutableStateFlow2.setValue(copy4);
            return;
        }
        stopScan();
        disconnect();
        try {
            Result.Companion companion = Result.INSTANCE;
            BleClient bleClient = this;
            m7905constructorimpl = Result.m7905constructorimpl(adapter.getRemoteDevice(address));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
            m7905constructorimpl = null;
        }
        BluetoothDevice bluetoothDevice = (BluetoothDevice) m7905constructorimpl;
        if (bluetoothDevice == null) {
            MutableStateFlow<BleStatus> mutableStateFlow3 = this._status;
            copy3 = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : null, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : "Bad device address", (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : null, (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow3.getValue().hrTestRunning : false);
            mutableStateFlow3.setValue(copy3);
        } else {
            MutableStateFlow<BleStatus> mutableStateFlow4 = this._status;
            copy2 = r2.copy((r36 & 1) != 0 ? r2.enabled : false, (r36 & 2) != 0 ? r2.scanning : false, (r36 & 4) != 0 ? r2.connectingTo : address, (r36 & 8) != 0 ? r2.connectedAddress : null, (r36 & 16) != 0 ? r2.lastError : null, (r36 & 32) != 0 ? r2.devices : null, (r36 & 64) != 0 ? r2.services : CollectionsKt.emptyList(), (r36 & 128) != 0 ? r2.hasHeartRateService : false, (r36 & 256) != 0 ? r2.hasExerciseTrackerSoccerService : false, (r36 & 512) != 0 ? r2.hasMoyoungService : false, (r36 & 1024) != 0 ? r2.watchSoccerState : null, (r36 & 2048) != 0 ? r2.watchSoccerElapsedSec : null, (r36 & 4096) != 0 ? r2.syncingSoccer : false, (r36 & 8192) != 0 ? r2.lastSoccerSyncImported : null, (r36 & 16384) != 0 ? r2.lastMoyoungImport : null, (r36 & 32768) != 0 ? r2.latestHrBpm : null, (r36 & 65536) != 0 ? r2.latestHrAtMs : null, (r36 & 131072) != 0 ? mutableStateFlow4.getValue().hrTestRunning : false);
            mutableStateFlow4.setValue(copy2);
            this.gatt = bluetoothDevice.connectGatt(this.context, false, this.gattCallback, 2);
        }
    }

    public final void setRecordingHrPoll(boolean enabled) {
        Job launch$default;
        Job job = this.recordingHrPollJob;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.recordingHrPollJob = null;
        if (enabled) {
            launch$default = BuildersKt__Builders_commonKt.launch$default(this.scope, null, null, new BleClient$setRecordingHrPoll$1(this, null), 3, null);
            this.recordingHrPollJob = launch$default;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void pollHrOnce() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        boolean readCharacteristic;
        refreshWatchSoccerStatus();
        BluetoothGatt bluetoothGatt = this.gatt;
        if (bluetoothGatt == null || (bluetoothGattCharacteristic = this.hrChar) == null) {
            return;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            BleClient bleClient = this;
            if (Build.VERSION.SDK_INT >= 33) {
                readCharacteristic = bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            } else {
                readCharacteristic = bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            }
            Result.m7905constructorimpl(Boolean.valueOf(readCharacteristic));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* compiled from: BleClient.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/example/rungps/ble/BleClient$Companion;", "", "<init>", "()V", "HR_SERVICE_UUID", "Ljava/util/UUID;", "getHR_SERVICE_UUID", "()Ljava/util/UUID;", "HR_MEAS_UUID", "getHR_MEAS_UUID", "CCCD_UUID", "getCCCD_UUID", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UUID getHR_SERVICE_UUID() {
            return BleClient.HR_SERVICE_UUID;
        }

        public final UUID getHR_MEAS_UUID() {
            return BleClient.HR_MEAS_UUID;
        }

        public final UUID getCCCD_UUID() {
            return BleClient.CCCD_UUID;
        }
    }

    static {
        UUID fromString = UUID.fromString("0000180d-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        HR_SERVICE_UUID = fromString;
        UUID fromString2 = UUID.fromString("00002a37-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(...)");
        HR_MEAS_UUID = fromString2;
        UUID fromString3 = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString3, "fromString(...)");
        CCCD_UUID = fromString3;
    }
}
