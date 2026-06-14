package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import com.example.rungps.data.Repository;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WatchSoccerSync.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\fJ \u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0086@¢\u0006\u0002\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@¢\u0006\u0002\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/example/rungps/ble/WatchSoccerSync;", "", "<init>", "()V", "pullAndImport", "", "gatt", "Landroid/bluetooth/BluetoothGatt;", "ops", "Lcom/example/rungps/ble/BleGattOps;", "repo", "Lcom/example/rungps/data/Repository;", "(Landroid/bluetooth/BluetoothGatt;Lcom/example/rungps/ble/BleGattOps;Lcom/example/rungps/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "readStatus", "Lcom/example/rungps/ble/WatchSoccerStatus;", "(Landroid/bluetooth/BluetoothGatt;Lcom/example/rungps/ble/BleGattOps;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ackWatchSession", "", "ackChar", "Landroid/bluetooth/BluetoothGattCharacteristic;", "watchSessionId", "", "(Landroid/bluetooth/BluetoothGatt;Lcom/example/rungps/ble/BleGattOps;Landroid/bluetooth/BluetoothGattCharacteristic;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchSoccerSync {
    public static final int $stable = 0;
    public static final WatchSoccerSync INSTANCE = new WatchSoccerSync();

    private WatchSoccerSync() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:52|53|50|27|(0)|30|(0)|33|34|35|36|37|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01c9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01d3, code lost:
    
        r10 = r1;
        r13 = r2;
        r9 = r3;
        r11 = r16;
        r12 = r18;
        r2 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01cb, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01cc, code lost:
    
        r2 = r12;
        r19 = r13;
        r18 = r14;
        r16 = r15;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01b6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x01b7 -> B:15:0x01c0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01dc -> B:17:0x0129). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object pullAndImport(BluetoothGatt bluetoothGatt, BleGattOps bleGattOps, Repository repository, Continuation<? super Integer> continuation) {
        WatchSoccerSync$pullAndImport$1 watchSoccerSync$pullAndImport$1;
        int i;
        BluetoothGattCharacteristic characteristic;
        BluetoothGattCharacteristic characteristic2;
        Repository repository2;
        Object read;
        byte[] bArr;
        Iterator<WatchSoccerRecord> it;
        WatchSoccerSync watchSoccerSync;
        BluetoothGatt bluetoothGatt2;
        BluetoothGattCharacteristic bluetoothGattCharacteristic;
        BleGattOps bleGattOps2;
        Repository repository3;
        WatchSoccerRecord watchSoccerRecord;
        int i2;
        Throwable th;
        Object m7905constructorimpl;
        Throwable th2;
        BluetoothGattCharacteristic bluetoothGattCharacteristic2;
        BluetoothGatt bluetoothGatt3;
        WatchSoccerSync watchSoccerSync2;
        BleGattOps bleGattOps3;
        long watchSessionId;
        WatchSoccerSync watchSoccerSync3 = this;
        BluetoothGatt bluetoothGatt4 = bluetoothGatt;
        BleGattOps bleGattOps4 = bleGattOps;
        if (continuation instanceof WatchSoccerSync$pullAndImport$1) {
            watchSoccerSync$pullAndImport$1 = (WatchSoccerSync$pullAndImport$1) continuation;
            if ((watchSoccerSync$pullAndImport$1.label & Integer.MIN_VALUE) != 0) {
                watchSoccerSync$pullAndImport$1.label -= Integer.MIN_VALUE;
                Object obj = watchSoccerSync$pullAndImport$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = watchSoccerSync$pullAndImport$1.label;
                int i3 = 0;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BluetoothGattService service = bluetoothGatt4.getService(ExerciseTrackerBleUuids.INSTANCE.getSERVICE());
                    if (service != null && (characteristic = service.getCharacteristic(ExerciseTrackerBleUuids.INSTANCE.getSOCCER_BATCH())) != null && (characteristic2 = service.getCharacteristic(ExerciseTrackerBleUuids.INSTANCE.getSOCCER_ACK())) != null) {
                        watchSoccerSync$pullAndImport$1.L$0 = watchSoccerSync3;
                        watchSoccerSync$pullAndImport$1.L$1 = bluetoothGatt4;
                        watchSoccerSync$pullAndImport$1.L$2 = bleGattOps4;
                        repository2 = repository;
                        watchSoccerSync$pullAndImport$1.L$3 = repository2;
                        watchSoccerSync$pullAndImport$1.L$4 = characteristic2;
                        watchSoccerSync$pullAndImport$1.label = 1;
                        read = bleGattOps4.read(bluetoothGatt4, characteristic, watchSoccerSync$pullAndImport$1);
                        if (read == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Boxing.boxInt(0);
                }
                if (i == 1) {
                    BluetoothGattCharacteristic bluetoothGattCharacteristic3 = (BluetoothGattCharacteristic) watchSoccerSync$pullAndImport$1.L$4;
                    Repository repository4 = (Repository) watchSoccerSync$pullAndImport$1.L$3;
                    bleGattOps4 = (BleGattOps) watchSoccerSync$pullAndImport$1.L$2;
                    BluetoothGatt bluetoothGatt5 = (BluetoothGatt) watchSoccerSync$pullAndImport$1.L$1;
                    WatchSoccerSync watchSoccerSync4 = (WatchSoccerSync) watchSoccerSync$pullAndImport$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    repository2 = repository4;
                    bluetoothGatt4 = bluetoothGatt5;
                    read = obj;
                    characteristic2 = bluetoothGattCharacteristic3;
                    watchSoccerSync3 = watchSoccerSync4;
                } else if (i == 2) {
                    i2 = watchSoccerSync$pullAndImport$1.I$0;
                    watchSoccerRecord = (WatchSoccerRecord) watchSoccerSync$pullAndImport$1.L$6;
                    it = (Iterator) watchSoccerSync$pullAndImport$1.L$5;
                    bluetoothGattCharacteristic = (BluetoothGattCharacteristic) watchSoccerSync$pullAndImport$1.L$4;
                    repository3 = (Repository) watchSoccerSync$pullAndImport$1.L$3;
                    bleGattOps2 = (BleGattOps) watchSoccerSync$pullAndImport$1.L$2;
                    bluetoothGatt2 = (BluetoothGatt) watchSoccerSync$pullAndImport$1.L$1;
                    watchSoccerSync = (WatchSoccerSync) watchSoccerSync$pullAndImport$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        Result.Companion companion = Result.INSTANCE;
                        m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                        bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                        Repository repository5 = repository3;
                        bluetoothGatt3 = bluetoothGatt2;
                        watchSoccerSync2 = watchSoccerSync;
                        bleGattOps3 = bleGattOps2;
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                        }
                        if (((Long) m7905constructorimpl) != null) {
                        }
                        Result.Companion companion2 = Result.INSTANCE;
                        WatchSoccerSync watchSoccerSync5 = watchSoccerSync2;
                        watchSessionId = watchSoccerRecord.getWatchSessionId();
                        watchSoccerSync$pullAndImport$1.L$0 = watchSoccerSync2;
                        watchSoccerSync$pullAndImport$1.L$1 = bluetoothGatt3;
                        watchSoccerSync$pullAndImport$1.L$2 = bleGattOps3;
                        watchSoccerSync$pullAndImport$1.L$3 = repository5;
                        watchSoccerSync$pullAndImport$1.L$4 = bluetoothGattCharacteristic2;
                        watchSoccerSync$pullAndImport$1.L$5 = it;
                        watchSoccerSync$pullAndImport$1.L$6 = null;
                        watchSoccerSync$pullAndImport$1.I$0 = i2;
                        watchSoccerSync$pullAndImport$1.label = 3;
                        WatchSoccerSync watchSoccerSync6 = watchSoccerSync2;
                        BleGattOps bleGattOps5 = bleGattOps3;
                        BluetoothGatt bluetoothGatt6 = bluetoothGatt3;
                        Repository repository6 = repository5;
                        if (watchSoccerSync2.ackWatchSession(bluetoothGatt3, bleGattOps3, bluetoothGattCharacteristic2, watchSessionId, watchSoccerSync$pullAndImport$1) != coroutine_suspended) {
                        }
                    }
                    m7905constructorimpl = Result.m7905constructorimpl((Long) obj);
                    bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                    Repository repository52 = repository3;
                    bluetoothGatt3 = bluetoothGatt2;
                    watchSoccerSync2 = watchSoccerSync;
                    bleGattOps3 = bleGattOps2;
                    if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                    }
                    if (((Long) m7905constructorimpl) != null) {
                    }
                    Result.Companion companion22 = Result.INSTANCE;
                    WatchSoccerSync watchSoccerSync52 = watchSoccerSync2;
                    watchSessionId = watchSoccerRecord.getWatchSessionId();
                    watchSoccerSync$pullAndImport$1.L$0 = watchSoccerSync2;
                    watchSoccerSync$pullAndImport$1.L$1 = bluetoothGatt3;
                    watchSoccerSync$pullAndImport$1.L$2 = bleGattOps3;
                    watchSoccerSync$pullAndImport$1.L$3 = repository52;
                    watchSoccerSync$pullAndImport$1.L$4 = bluetoothGattCharacteristic2;
                    watchSoccerSync$pullAndImport$1.L$5 = it;
                    watchSoccerSync$pullAndImport$1.L$6 = null;
                    watchSoccerSync$pullAndImport$1.I$0 = i2;
                    watchSoccerSync$pullAndImport$1.label = 3;
                    WatchSoccerSync watchSoccerSync62 = watchSoccerSync2;
                    BleGattOps bleGattOps52 = bleGattOps3;
                    BluetoothGatt bluetoothGatt62 = bluetoothGatt3;
                    Repository repository62 = repository52;
                    if (watchSoccerSync2.ackWatchSession(bluetoothGatt3, bleGattOps3, bluetoothGattCharacteristic2, watchSessionId, watchSoccerSync$pullAndImport$1) != coroutine_suspended) {
                    }
                } else {
                    if (i != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i4 = watchSoccerSync$pullAndImport$1.I$0;
                    Iterator<WatchSoccerRecord> it2 = (Iterator) watchSoccerSync$pullAndImport$1.L$5;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic4 = (BluetoothGattCharacteristic) watchSoccerSync$pullAndImport$1.L$4;
                    Repository repository7 = (Repository) watchSoccerSync$pullAndImport$1.L$3;
                    BleGattOps bleGattOps6 = (BleGattOps) watchSoccerSync$pullAndImport$1.L$2;
                    BluetoothGatt bluetoothGatt7 = (BluetoothGatt) watchSoccerSync$pullAndImport$1.L$1;
                    WatchSoccerSync watchSoccerSync7 = (WatchSoccerSync) watchSoccerSync$pullAndImport$1.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        watchSoccerSync = watchSoccerSync7;
                        bluetoothGatt2 = bluetoothGatt7;
                        repository2 = repository7;
                        bluetoothGattCharacteristic = bluetoothGattCharacteristic4;
                        it = it2;
                        bleGattOps4 = bleGattOps6;
                        i3 = i4;
                    } catch (Throwable th4) {
                        th2 = th4;
                        watchSoccerSync = watchSoccerSync7;
                        bluetoothGatt2 = bluetoothGatt7;
                        repository2 = repository7;
                        bluetoothGattCharacteristic = bluetoothGattCharacteristic4;
                        it = it2;
                        bleGattOps4 = bleGattOps6;
                        i3 = i4;
                        Result.Companion companion3 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th2));
                        if (!it.hasNext()) {
                        }
                    }
                    try {
                    } catch (Throwable th5) {
                        th2 = th5;
                        Result.Companion companion32 = Result.INSTANCE;
                        Result.m7905constructorimpl(ResultKt.createFailure(th2));
                        if (!it.hasNext()) {
                        }
                    }
                    Result.m7905constructorimpl(Unit.INSTANCE);
                    if (!it.hasNext()) {
                        WatchSoccerRecord next = it.next();
                        try {
                        } catch (Throwable th6) {
                            th = th6;
                            BleGattOps bleGattOps7 = bleGattOps4;
                            watchSoccerRecord = next;
                            i2 = i3;
                            repository3 = repository2;
                            bleGattOps2 = bleGattOps7;
                            Result.Companion companion4 = Result.INSTANCE;
                            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
                            bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                            Repository repository522 = repository3;
                            bluetoothGatt3 = bluetoothGatt2;
                            watchSoccerSync2 = watchSoccerSync;
                            bleGattOps3 = bleGattOps2;
                            if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            }
                            if (((Long) m7905constructorimpl) != null) {
                            }
                            Result.Companion companion222 = Result.INSTANCE;
                            WatchSoccerSync watchSoccerSync522 = watchSoccerSync2;
                            watchSessionId = watchSoccerRecord.getWatchSessionId();
                            watchSoccerSync$pullAndImport$1.L$0 = watchSoccerSync2;
                            watchSoccerSync$pullAndImport$1.L$1 = bluetoothGatt3;
                            watchSoccerSync$pullAndImport$1.L$2 = bleGattOps3;
                            watchSoccerSync$pullAndImport$1.L$3 = repository522;
                            watchSoccerSync$pullAndImport$1.L$4 = bluetoothGattCharacteristic2;
                            watchSoccerSync$pullAndImport$1.L$5 = it;
                            watchSoccerSync$pullAndImport$1.L$6 = null;
                            watchSoccerSync$pullAndImport$1.I$0 = i2;
                            watchSoccerSync$pullAndImport$1.label = 3;
                            WatchSoccerSync watchSoccerSync622 = watchSoccerSync2;
                            BleGattOps bleGattOps522 = bleGattOps3;
                            BluetoothGatt bluetoothGatt622 = bluetoothGatt3;
                            Repository repository622 = repository522;
                            if (watchSoccerSync2.ackWatchSession(bluetoothGatt3, bleGattOps3, bluetoothGattCharacteristic2, watchSessionId, watchSoccerSync$pullAndImport$1) != coroutine_suspended) {
                            }
                        }
                        Result.Companion companion5 = Result.INSTANCE;
                        WatchSoccerSync watchSoccerSync8 = watchSoccerSync;
                        watchSoccerSync$pullAndImport$1.L$0 = watchSoccerSync;
                        watchSoccerSync$pullAndImport$1.L$1 = bluetoothGatt2;
                        watchSoccerSync$pullAndImport$1.L$2 = bleGattOps4;
                        watchSoccerSync$pullAndImport$1.L$3 = repository2;
                        watchSoccerSync$pullAndImport$1.L$4 = bluetoothGattCharacteristic;
                        watchSoccerSync$pullAndImport$1.L$5 = it;
                        watchSoccerSync$pullAndImport$1.L$6 = next;
                        watchSoccerSync$pullAndImport$1.I$0 = i3;
                        watchSoccerSync$pullAndImport$1.label = 2;
                        obj = repository2.importWatchSoccerSession(next, watchSoccerSync$pullAndImport$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        BleGattOps bleGattOps8 = bleGattOps4;
                        watchSoccerRecord = next;
                        i2 = i3;
                        repository3 = repository2;
                        bleGattOps2 = bleGattOps8;
                        m7905constructorimpl = Result.m7905constructorimpl((Long) obj);
                        bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
                        Repository repository5222 = repository3;
                        bluetoothGatt3 = bluetoothGatt2;
                        watchSoccerSync2 = watchSoccerSync;
                        bleGattOps3 = bleGattOps2;
                        if (Result.m7911isFailureimpl(m7905constructorimpl)) {
                            m7905constructorimpl = null;
                        }
                        if (((Long) m7905constructorimpl) != null) {
                            i2++;
                        }
                        Result.Companion companion2222 = Result.INSTANCE;
                        WatchSoccerSync watchSoccerSync5222 = watchSoccerSync2;
                        watchSessionId = watchSoccerRecord.getWatchSessionId();
                        watchSoccerSync$pullAndImport$1.L$0 = watchSoccerSync2;
                        watchSoccerSync$pullAndImport$1.L$1 = bluetoothGatt3;
                        watchSoccerSync$pullAndImport$1.L$2 = bleGattOps3;
                        watchSoccerSync$pullAndImport$1.L$3 = repository5222;
                        watchSoccerSync$pullAndImport$1.L$4 = bluetoothGattCharacteristic2;
                        watchSoccerSync$pullAndImport$1.L$5 = it;
                        watchSoccerSync$pullAndImport$1.L$6 = null;
                        watchSoccerSync$pullAndImport$1.I$0 = i2;
                        watchSoccerSync$pullAndImport$1.label = 3;
                        WatchSoccerSync watchSoccerSync6222 = watchSoccerSync2;
                        BleGattOps bleGattOps5222 = bleGattOps3;
                        BluetoothGatt bluetoothGatt6222 = bluetoothGatt3;
                        Repository repository6222 = repository5222;
                        if (watchSoccerSync2.ackWatchSession(bluetoothGatt3, bleGattOps3, bluetoothGattCharacteristic2, watchSessionId, watchSoccerSync$pullAndImport$1) != coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        i3 = i2;
                        watchSoccerSync = watchSoccerSync6222;
                        bluetoothGattCharacteristic = bluetoothGattCharacteristic2;
                        repository2 = repository6222;
                        bluetoothGatt2 = bluetoothGatt6222;
                        bleGattOps4 = bleGattOps5222;
                        Result.m7905constructorimpl(Unit.INSTANCE);
                        if (!it.hasNext()) {
                            return Boxing.boxInt(i3);
                        }
                    }
                }
                bArr = (byte[]) read;
                if (bArr != null) {
                    return Boxing.boxInt(0);
                }
                List<WatchSoccerRecord> parseAll = WatchSoccerRecord.INSTANCE.parseAll(bArr);
                if (parseAll.isEmpty()) {
                    return Boxing.boxInt(0);
                }
                it = parseAll.iterator();
                watchSoccerSync = watchSoccerSync3;
                bluetoothGatt2 = bluetoothGatt4;
                bluetoothGattCharacteristic = characteristic2;
                if (!it.hasNext()) {
                }
            }
        }
        watchSoccerSync$pullAndImport$1 = new WatchSoccerSync$pullAndImport$1(watchSoccerSync3, continuation);
        Object obj2 = watchSoccerSync$pullAndImport$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = watchSoccerSync$pullAndImport$1.label;
        int i32 = 0;
        if (i != 0) {
        }
        bArr = (byte[]) read;
        if (bArr != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readStatus(BluetoothGatt bluetoothGatt, BleGattOps bleGattOps, Continuation<? super WatchSoccerStatus> continuation) {
        WatchSoccerSync$readStatus$1 watchSoccerSync$readStatus$1;
        int i;
        Integer num;
        BluetoothGattCharacteristic characteristic;
        byte[] bArr;
        Integer boxInt;
        int intValue;
        if (continuation instanceof WatchSoccerSync$readStatus$1) {
            watchSoccerSync$readStatus$1 = (WatchSoccerSync$readStatus$1) continuation;
            if ((watchSoccerSync$readStatus$1.label & Integer.MIN_VALUE) != 0) {
                watchSoccerSync$readStatus$1.label -= Integer.MIN_VALUE;
                Object obj = watchSoccerSync$readStatus$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = watchSoccerSync$readStatus$1.label;
                num = null;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BluetoothGattService service = bluetoothGatt.getService(ExerciseTrackerBleUuids.INSTANCE.getSERVICE());
                    if (service == null || (characteristic = service.getCharacteristic(ExerciseTrackerBleUuids.INSTANCE.getSOCCER_STATUS())) == null) {
                        return null;
                    }
                    watchSoccerSync$readStatus$1.label = 1;
                    obj = bleGattOps.read(bluetoothGatt, characteristic, watchSoccerSync$readStatus$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                bArr = (byte[]) obj;
                if (bArr != null || bArr.length < 6) {
                    return null;
                }
                int i2 = bArr[0] & 255;
                int i3 = ByteBuffer.wrap(bArr, 1, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
                boxInt = Boxing.boxInt(bArr.length >= 6 ? bArr[5] & 255 : 0);
                intValue = boxInt.intValue();
                if (40 <= intValue && intValue < 221) {
                    num = boxInt;
                }
                return new WatchSoccerStatus(i2, i3, num);
            }
        }
        watchSoccerSync$readStatus$1 = new WatchSoccerSync$readStatus$1(this, continuation);
        Object obj2 = watchSoccerSync$readStatus$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = watchSoccerSync$readStatus$1.label;
        num = null;
        if (i != 0) {
        }
        bArr = (byte[]) obj2;
        if (bArr != null) {
            return null;
        }
        int i22 = bArr[0] & 255;
        int i32 = ByteBuffer.wrap(bArr, 1, 4).order(ByteOrder.LITTLE_ENDIAN).getInt();
        boxInt = Boxing.boxInt(bArr.length >= 6 ? bArr[5] & 255 : 0);
        intValue = boxInt.intValue();
        if (40 <= intValue) {
            num = boxInt;
        }
        return new WatchSoccerStatus(i22, i32, num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object ackWatchSession(BluetoothGatt bluetoothGatt, BleGattOps bleGattOps, BluetoothGattCharacteristic bluetoothGattCharacteristic, long j, Continuation<? super Unit> continuation) {
        ByteBuffer order = ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt((int) j);
        byte[] array = order.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        Object write = bleGattOps.write(bluetoothGatt, bluetoothGattCharacteristic, array, continuation);
        return write == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? write : Unit.INSTANCE;
    }
}
