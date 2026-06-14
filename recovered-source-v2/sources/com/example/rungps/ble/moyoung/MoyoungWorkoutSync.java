package com.example.rungps.ble.moyoung;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.os.Build;
import android.util.Log;
import com.example.rungps.ble.moyoung.MoyoungHrParser;
import com.google.android.gms.location.DeviceOrientationRequest;
import com.google.firebase.firestore.model.Values;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

/* compiled from: MoyoungWorkoutSync.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 92\u00020\u0001:\u00019B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005J\u000e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0012J\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0086@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001d\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001bJ\u000e\u0010\u001e\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001bJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0082@¢\u0006\u0002\u0010\u001bJ\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010!\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\"J\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0006\u0010$\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\"J \u0010%\u001a\u00020\u00142\b\u0010&\u001a\u0004\u0018\u00010\u00112\u0006\u0010'\u001a\u00020(H\u0082@¢\u0006\u0002\u0010)J\n\u0010*\u001a\u0004\u0018\u00010\u0012H\u0002J\n\u0010+\u001a\u0004\u0018\u00010\u0012H\u0002J,\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0006\u0010-\u001a\u00020\u00112\u0006\u0010.\u001a\u00020(H\u0082@¢\u0006\u0002\u0010/J\b\u00100\u001a\u00020\u0014H\u0002J\u001e\u00101\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u00103J\u001e\u00104\u001a\u00020\u00142\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u00020\u0012H\u0082@¢\u0006\u0002\u00108R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungWorkoutSync;", "", "gatt", "Landroid/bluetooth/BluetoothGatt;", "mtu", "", "<init>", "(Landroid/bluetooth/BluetoothGatt;I)V", "fetchMutex", "Lkotlinx/coroutines/sync/Mutex;", "packetIn", "Lcom/example/rungps/ble/moyoung/MoyoungPacketIn;", "assembleLock", "inboxLock", "inbox", "", "Lkotlin/Pair;", "", "", "setMtu", "", Values.VECTOR_MAP_VECTORS_KEY, "onNotify", "fragment", "fetchWorkouts", "", "Lcom/example/rungps/ble/moyoung/MoyoungWorkout;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchWorkoutsV2AllPages", "prepareNotify", "warmUpWatch", "fetchWorkoutsLegacy", "fetchWorkoutsV2Page", "page", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchWorkoutDetail", "id", "consumeInbox", "exceptCmd", "maxMs", "", "(Ljava/lang/Byte;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findTrainingPayloadInInbox", "findListPayloadInInbox", "awaitPacket", "cmd", "timeoutMs", "(BJLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "clearInbox", "writeCommand", "payload", "(B[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "writeChunk", "char", "Landroid/bluetooth/BluetoothGattCharacteristic;", "data", "(Landroid/bluetooth/BluetoothGattCharacteristic;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungWorkoutSync {
    private static final UUID CCCD;
    private static final String TAG = "MoyoungWorkoutSync";
    private final Object assembleLock;
    private final Mutex fetchMutex;
    private final BluetoothGatt gatt;
    private final List<Pair<Byte, byte[]>> inbox;
    private final Object inboxLock;
    private int mtu;
    private final MoyoungPacketIn packetIn;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public MoyoungWorkoutSync(BluetoothGatt gatt, int i) {
        Intrinsics.checkNotNullParameter(gatt, "gatt");
        this.gatt = gatt;
        this.mtu = RangesKt.coerceIn(i, 20, 512);
        this.fetchMutex = MutexKt.Mutex$default(false, 1, null);
        this.packetIn = new MoyoungPacketIn();
        this.assembleLock = new Object();
        this.inboxLock = new Object();
        this.inbox = new ArrayList();
    }

    public /* synthetic */ MoyoungWorkoutSync(BluetoothGatt bluetoothGatt, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(bluetoothGatt, (i2 & 2) != 0 ? 20 : i);
    }

    public final void setMtu(int value) {
        this.mtu = RangesKt.coerceIn(value, 20, 512);
    }

    public final void onNotify(byte[] fragment) {
        Pair<Byte, byte[]> parsePacket;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        synchronized (this.assembleLock) {
            if (this.packetIn.putFragment(fragment)) {
                byte[] completePacket = this.packetIn.completePacket();
                if (completePacket == null) {
                    return;
                }
                this.packetIn.reset();
                if (completePacket == null || (parsePacket = MoyoungPacketIn.INSTANCE.parsePacket(completePacket)) == null) {
                    return;
                }
                synchronized (this.inboxLock) {
                    this.inbox.add(parsePacket);
                }
                Log.d(TAG, "notify cmd=0x" + (parsePacket.getFirst().byteValue() & 255) + " len=" + parsePacket.getSecond().length);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWorkouts(Continuation<? super List<MoyoungWorkout>> continuation) {
        MoyoungWorkoutSync$fetchWorkouts$1 moyoungWorkoutSync$fetchWorkouts$1;
        Object coroutine_suspended;
        int i;
        Mutex mutex;
        Throwable th;
        Mutex mutex2;
        Object withTimeout;
        try {
            if (continuation instanceof MoyoungWorkoutSync$fetchWorkouts$1) {
                moyoungWorkoutSync$fetchWorkouts$1 = (MoyoungWorkoutSync$fetchWorkouts$1) continuation;
                if ((moyoungWorkoutSync$fetchWorkouts$1.label & Integer.MIN_VALUE) != 0) {
                    moyoungWorkoutSync$fetchWorkouts$1.label -= Integer.MIN_VALUE;
                    Object obj = moyoungWorkoutSync$fetchWorkouts$1.result;
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = moyoungWorkoutSync$fetchWorkouts$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        mutex = this.fetchMutex;
                        moyoungWorkoutSync$fetchWorkouts$1.L$0 = this;
                        moyoungWorkoutSync$fetchWorkouts$1.L$1 = mutex;
                        moyoungWorkoutSync$fetchWorkouts$1.label = 1;
                        if (mutex.lock(null, moyoungWorkoutSync$fetchWorkouts$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            mutex2 = (Mutex) moyoungWorkoutSync$fetchWorkouts$1.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                List list = (List) obj;
                                mutex2.unlock(null);
                                return list;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        Mutex mutex3 = (Mutex) moyoungWorkoutSync$fetchWorkouts$1.L$1;
                        MoyoungWorkoutSync moyoungWorkoutSync = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkouts$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        mutex = mutex3;
                        this = moyoungWorkoutSync;
                    }
                    MoyoungWorkoutSync$fetchWorkouts$2$1 moyoungWorkoutSync$fetchWorkouts$2$1 = new MoyoungWorkoutSync$fetchWorkouts$2$1(this, null);
                    moyoungWorkoutSync$fetchWorkouts$1.L$0 = mutex;
                    moyoungWorkoutSync$fetchWorkouts$1.L$1 = null;
                    moyoungWorkoutSync$fetchWorkouts$1.label = 2;
                    withTimeout = TimeoutKt.withTimeout(90000L, moyoungWorkoutSync$fetchWorkouts$2$1, moyoungWorkoutSync$fetchWorkouts$1);
                    if (withTimeout != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    Mutex mutex4 = mutex;
                    obj = withTimeout;
                    mutex2 = mutex4;
                    List list2 = (List) obj;
                    mutex2.unlock(null);
                    return list2;
                }
            }
            MoyoungWorkoutSync$fetchWorkouts$2$1 moyoungWorkoutSync$fetchWorkouts$2$12 = new MoyoungWorkoutSync$fetchWorkouts$2$1(this, null);
            moyoungWorkoutSync$fetchWorkouts$1.L$0 = mutex;
            moyoungWorkoutSync$fetchWorkouts$1.L$1 = null;
            moyoungWorkoutSync$fetchWorkouts$1.label = 2;
            withTimeout = TimeoutKt.withTimeout(90000L, moyoungWorkoutSync$fetchWorkouts$2$12, moyoungWorkoutSync$fetchWorkouts$1);
            if (withTimeout != coroutine_suspended) {
            }
        } catch (Throwable th3) {
            Mutex mutex5 = mutex;
            th = th3;
            mutex2 = mutex5;
            mutex2.unlock(null);
            throw th;
        }
        moyoungWorkoutSync$fetchWorkouts$1 = new MoyoungWorkoutSync$fetchWorkouts$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$fetchWorkouts$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$fetchWorkouts$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074 A[LOOP:0: B:17:0x006e->B:19:0x0074, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x005b -> B:10:0x005e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWorkoutsV2AllPages(Continuation<? super List<MoyoungWorkout>> continuation) {
        MoyoungWorkoutSync$fetchWorkoutsV2AllPages$1 moyoungWorkoutSync$fetchWorkoutsV2AllPages$1;
        int i;
        MoyoungWorkoutSync moyoungWorkoutSync;
        int i2;
        LinkedHashMap linkedHashMap;
        if (continuation instanceof MoyoungWorkoutSync$fetchWorkoutsV2AllPages$1) {
            moyoungWorkoutSync$fetchWorkoutsV2AllPages$1 = (MoyoungWorkoutSync$fetchWorkoutsV2AllPages$1) continuation;
            if ((moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    moyoungWorkoutSync = this;
                    i2 = 0;
                    linkedHashMap = new LinkedHashMap();
                    if (i2 < 6) {
                    }
                    Collection values = linkedHashMap.values();
                    Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
                    return CollectionsKt.toList(values);
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i2 = moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.I$0;
                linkedHashMap = (LinkedHashMap) moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.L$1;
                MoyoungWorkoutSync moyoungWorkoutSync2 = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.L$0;
                ResultKt.throwOnFailure(obj);
                List<MoyoungWorkout> list = (List) obj;
                if (list.isEmpty() || i2 <= 0) {
                    for (MoyoungWorkout moyoungWorkout : list) {
                        linkedHashMap.put(Boxing.boxLong(moyoungWorkout.getDedupeId()), moyoungWorkout);
                    }
                    i2++;
                    moyoungWorkoutSync = moyoungWorkoutSync2;
                    if (i2 < 6) {
                        moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.L$0 = moyoungWorkoutSync;
                        moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.L$1 = linkedHashMap;
                        moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.I$0 = i2;
                        moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.label = 1;
                        Object fetchWorkoutsV2Page = moyoungWorkoutSync.fetchWorkoutsV2Page(i2, moyoungWorkoutSync$fetchWorkoutsV2AllPages$1);
                        if (fetchWorkoutsV2Page == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        moyoungWorkoutSync2 = moyoungWorkoutSync;
                        obj = fetchWorkoutsV2Page;
                        List<MoyoungWorkout> list2 = (List) obj;
                        if (list2.isEmpty()) {
                        }
                        while (r11.hasNext()) {
                        }
                        i2++;
                        moyoungWorkoutSync = moyoungWorkoutSync2;
                        if (i2 < 6) {
                        }
                    }
                }
                Collection values2 = linkedHashMap.values();
                Intrinsics.checkNotNullExpressionValue(values2, "<get-values>(...)");
                return CollectionsKt.toList(values2);
            }
        }
        moyoungWorkoutSync$fetchWorkoutsV2AllPages$1 = new MoyoungWorkoutSync$fetchWorkoutsV2AllPages$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$fetchWorkoutsV2AllPages$1.label;
        if (i != 0) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prepareNotify(Continuation<? super Unit> continuation) {
        MoyoungWorkoutSync$prepareNotify$1 moyoungWorkoutSync$prepareNotify$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof MoyoungWorkoutSync$prepareNotify$1) {
            moyoungWorkoutSync$prepareNotify$1 = (MoyoungWorkoutSync$prepareNotify$1) continuation;
            if ((moyoungWorkoutSync$prepareNotify$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$prepareNotify$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$prepareNotify$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moyoungWorkoutSync$prepareNotify$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    MoyoungWorkoutSync$prepareNotify$2 moyoungWorkoutSync$prepareNotify$2 = new MoyoungWorkoutSync$prepareNotify$2(this, null);
                    moyoungWorkoutSync$prepareNotify$1.label = 1;
                    if (BuildersKt.withContext(main, moyoungWorkoutSync$prepareNotify$2, moyoungWorkoutSync$prepareNotify$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                moyoungWorkoutSync$prepareNotify$1.label = 2;
                if (DelayKt.delay(500L, moyoungWorkoutSync$prepareNotify$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        moyoungWorkoutSync$prepareNotify$1 = new MoyoungWorkoutSync$prepareNotify$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$prepareNotify$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$prepareNotify$1.label;
        if (i != 0) {
        }
        moyoungWorkoutSync$prepareNotify$1.label = 2;
        if (DelayKt.delay(500L, moyoungWorkoutSync$prepareNotify$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00dc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object warmUpWatch(Continuation<? super Unit> continuation) {
        MoyoungWorkoutSync$warmUpWatch$1 moyoungWorkoutSync$warmUpWatch$1;
        MainCoroutineDispatcher main;
        MoyoungWorkoutSync$warmUpWatch$2 moyoungWorkoutSync$warmUpWatch$2;
        if (continuation instanceof MoyoungWorkoutSync$warmUpWatch$1) {
            moyoungWorkoutSync$warmUpWatch$1 = (MoyoungWorkoutSync$warmUpWatch$1) continuation;
            if ((moyoungWorkoutSync$warmUpWatch$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$warmUpWatch$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$warmUpWatch$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (moyoungWorkoutSync$warmUpWatch$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        int localNowToWatchEpochSec = MoyoungWatchTime.INSTANCE.localNowToWatchEpochSec();
                        byte[] bArr = {(byte) (localNowToWatchEpochSec >> 24), (byte) (localNowToWatchEpochSec >> 16), (byte) (localNowToWatchEpochSec >> 8), (byte) localNowToWatchEpochSec, 8};
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 1;
                        if (writeCommand(MoyoungConstants.CMD_SYNC_TIME, bArr, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 2;
                        if (DelayKt.delay(600L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 3;
                        if (this.consumeInbox(null, 2000L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        main = Dispatchers.getMain();
                        moyoungWorkoutSync$warmUpWatch$2 = new MoyoungWorkoutSync$warmUpWatch$2(this, null);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 4;
                        if (BuildersKt.withContext(main, moyoungWorkoutSync$warmUpWatch$2, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 5;
                        if (DelayKt.delay(400L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = null;
                        moyoungWorkoutSync$warmUpWatch$1.label = 6;
                        if (this.consumeInbox(null, 1500L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        return Unit.INSTANCE;
                    case 1:
                        this = (MoyoungWorkoutSync) moyoungWorkoutSync$warmUpWatch$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 2;
                        if (DelayKt.delay(600L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 3;
                        if (this.consumeInbox(null, 2000L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        main = Dispatchers.getMain();
                        moyoungWorkoutSync$warmUpWatch$2 = new MoyoungWorkoutSync$warmUpWatch$2(this, null);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 4;
                        if (BuildersKt.withContext(main, moyoungWorkoutSync$warmUpWatch$2, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 5;
                        if (DelayKt.delay(400L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = null;
                        moyoungWorkoutSync$warmUpWatch$1.label = 6;
                        if (this.consumeInbox(null, 1500L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 2:
                        this = (MoyoungWorkoutSync) moyoungWorkoutSync$warmUpWatch$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 3;
                        if (this.consumeInbox(null, 2000L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        main = Dispatchers.getMain();
                        moyoungWorkoutSync$warmUpWatch$2 = new MoyoungWorkoutSync$warmUpWatch$2(this, null);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 4;
                        if (BuildersKt.withContext(main, moyoungWorkoutSync$warmUpWatch$2, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 5;
                        if (DelayKt.delay(400L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = null;
                        moyoungWorkoutSync$warmUpWatch$1.label = 6;
                        if (this.consumeInbox(null, 1500L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 3:
                        this = (MoyoungWorkoutSync) moyoungWorkoutSync$warmUpWatch$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        main = Dispatchers.getMain();
                        moyoungWorkoutSync$warmUpWatch$2 = new MoyoungWorkoutSync$warmUpWatch$2(this, null);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 4;
                        if (BuildersKt.withContext(main, moyoungWorkoutSync$warmUpWatch$2, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 5;
                        if (DelayKt.delay(400L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = null;
                        moyoungWorkoutSync$warmUpWatch$1.label = 6;
                        if (this.consumeInbox(null, 1500L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 4:
                        this = (MoyoungWorkoutSync) moyoungWorkoutSync$warmUpWatch$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = this;
                        moyoungWorkoutSync$warmUpWatch$1.label = 5;
                        if (DelayKt.delay(400L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = null;
                        moyoungWorkoutSync$warmUpWatch$1.label = 6;
                        if (this.consumeInbox(null, 1500L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 5:
                        this = (MoyoungWorkoutSync) moyoungWorkoutSync$warmUpWatch$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        moyoungWorkoutSync$warmUpWatch$1.L$0 = null;
                        moyoungWorkoutSync$warmUpWatch$1.label = 6;
                        if (this.consumeInbox(null, 1500L, moyoungWorkoutSync$warmUpWatch$1) == coroutine_suspended) {
                        }
                        return Unit.INSTANCE;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        moyoungWorkoutSync$warmUpWatch$1 = new MoyoungWorkoutSync$warmUpWatch$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$warmUpWatch$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (moyoungWorkoutSync$warmUpWatch$1.label) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWorkoutsLegacy(Continuation<? super List<MoyoungWorkout>> continuation) {
        MoyoungWorkoutSync$fetchWorkoutsLegacy$1 moyoungWorkoutSync$fetchWorkoutsLegacy$1;
        Object obj;
        Object coroutine_suspended;
        int i;
        Pair pair;
        byte[] findTrainingPayloadInInbox;
        if (continuation instanceof MoyoungWorkoutSync$fetchWorkoutsLegacy$1) {
            moyoungWorkoutSync$fetchWorkoutsLegacy$1 = (MoyoungWorkoutSync$fetchWorkoutsLegacy$1) continuation;
            if ((moyoungWorkoutSync$fetchWorkoutsLegacy$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$fetchWorkoutsLegacy$1.label -= Integer.MIN_VALUE;
                obj = moyoungWorkoutSync$fetchWorkoutsLegacy$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moyoungWorkoutSync$fetchWorkoutsLegacy$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    clearInbox();
                    moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0 = this;
                    moyoungWorkoutSync$fetchWorkoutsLegacy$1.label = 1;
                    if (writeCommand(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE, new byte[0], moyoungWorkoutSync$fetchWorkoutsLegacy$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            this = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0;
                            ResultKt.throwOnFailure(obj);
                            moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0 = this;
                            moyoungWorkoutSync$fetchWorkoutsLegacy$1.label = 3;
                            obj = this.awaitPacket(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, moyoungWorkoutSync$fetchWorkoutsLegacy$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            pair = (Pair) obj;
                            if (pair != null) {
                            }
                            return CollectionsKt.emptyList();
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        this = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pair = (Pair) obj;
                        if ((pair != null || (findTrainingPayloadInInbox = (byte[]) pair.getSecond()) == null) && (findTrainingPayloadInInbox = this.findTrainingPayloadInInbox()) == null) {
                            return CollectionsKt.emptyList();
                        }
                        Log.d(TAG, "legacy payload len=" + findTrainingPayloadInInbox.length);
                        return MoyoungTrainingParser.INSTANCE.parseAll(findTrainingPayloadInInbox);
                    }
                    this = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0 = this;
                moyoungWorkoutSync$fetchWorkoutsLegacy$1.label = 2;
                if (DelayKt.delay(500L, moyoungWorkoutSync$fetchWorkoutsLegacy$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0 = this;
                moyoungWorkoutSync$fetchWorkoutsLegacy$1.label = 3;
                obj = this.awaitPacket(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, moyoungWorkoutSync$fetchWorkoutsLegacy$1);
                if (obj == coroutine_suspended) {
                }
                pair = (Pair) obj;
                if (pair != null) {
                }
                return CollectionsKt.emptyList();
            }
        }
        moyoungWorkoutSync$fetchWorkoutsLegacy$1 = new MoyoungWorkoutSync$fetchWorkoutsLegacy$1(this, continuation);
        obj = moyoungWorkoutSync$fetchWorkoutsLegacy$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$fetchWorkoutsLegacy$1.label;
        if (i != 0) {
        }
        moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0 = this;
        moyoungWorkoutSync$fetchWorkoutsLegacy$1.label = 2;
        if (DelayKt.delay(500L, moyoungWorkoutSync$fetchWorkoutsLegacy$1) == coroutine_suspended) {
        }
        moyoungWorkoutSync$fetchWorkoutsLegacy$1.L$0 = this;
        moyoungWorkoutSync$fetchWorkoutsLegacy$1.label = 3;
        obj = this.awaitPacket(MoyoungConstants.CMD_QUERY_MOVEMENT_HEART_RATE, DeviceOrientationRequest.OUTPUT_PERIOD_DEFAULT, moyoungWorkoutSync$fetchWorkoutsLegacy$1);
        if (obj == coroutine_suspended) {
        }
        pair = (Pair) obj;
        if (pair != null) {
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0175 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0030  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0158 -> B:13:0x015b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWorkoutsV2Page(int i, Continuation<? super List<MoyoungWorkout>> continuation) {
        MoyoungWorkoutSync$fetchWorkoutsV2Page$1 moyoungWorkoutSync$fetchWorkoutsV2Page$1;
        Object coroutine_suspended;
        int i2;
        byte[] bArr;
        MoyoungWorkoutSync moyoungWorkoutSync;
        int i3;
        Pair pair;
        byte[] findListPayloadInInbox;
        Iterator<Integer> it;
        MoyoungWorkoutSync moyoungWorkoutSync2;
        ArrayList arrayList;
        MoyoungWorkoutSync moyoungWorkoutSync3 = this;
        int i4 = i;
        if (continuation instanceof MoyoungWorkoutSync$fetchWorkoutsV2Page$1) {
            moyoungWorkoutSync$fetchWorkoutsV2Page$1 = (MoyoungWorkoutSync$fetchWorkoutsV2Page$1) continuation;
            if ((moyoungWorkoutSync$fetchWorkoutsV2Page$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$fetchWorkoutsV2Page$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$fetchWorkoutsV2Page$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = moyoungWorkoutSync$fetchWorkoutsV2Page$1.label;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    clearInbox();
                    if (i4 == 0) {
                        bArr = new byte[]{0};
                    } else {
                        bArr = new byte[]{0, (byte) i4};
                    }
                    moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0 = moyoungWorkoutSync3;
                    moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0 = i4;
                    moyoungWorkoutSync$fetchWorkoutsV2Page$1.label = 1;
                    if (moyoungWorkoutSync3.writeCommand(MoyoungConstants.CMD_QUERY_V2_WORKOUT, bArr, moyoungWorkoutSync$fetchWorkoutsV2Page$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 1) {
                    int i5 = moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0;
                    MoyoungWorkoutSync moyoungWorkoutSync4 = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i4 = i5;
                    moyoungWorkoutSync3 = moyoungWorkoutSync4;
                } else {
                    if (i2 == 2) {
                        i3 = moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0;
                        moyoungWorkoutSync = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0 = moyoungWorkoutSync;
                        moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0 = i3;
                        moyoungWorkoutSync$fetchWorkoutsV2Page$1.label = 3;
                        obj = moyoungWorkoutSync.awaitPacket(MoyoungConstants.CMD_QUERY_V2_WORKOUT, 15000L, moyoungWorkoutSync$fetchWorkoutsV2Page$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        pair = (Pair) obj;
                        if (pair != null) {
                        }
                        return CollectionsKt.emptyList();
                    }
                    if (i2 == 3) {
                        i3 = moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0;
                        moyoungWorkoutSync = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        pair = (Pair) obj;
                        if ((pair != null || (findListPayloadInInbox = (byte[]) pair.getSecond()) == null) && (findListPayloadInInbox = moyoungWorkoutSync.findListPayloadInInbox()) == null) {
                            return CollectionsKt.emptyList();
                        }
                        Log.d(TAG, "v2 list page=" + i3 + " len=" + findListPayloadInInbox.length + " head=" + CollectionsKt.joinToString$default(ArraysKt.take(findListPayloadInInbox, 8), null, null, null, 0, null, null, 63, null));
                        if (findListPayloadInInbox.length == 0 || findListPayloadInInbox[0] != 1) {
                            return CollectionsKt.emptyList();
                        }
                        List<Integer> parseWorkoutListIndices = INSTANCE.parseWorkoutListIndices(findListPayloadInInbox);
                        if (parseWorkoutListIndices.isEmpty()) {
                            return CollectionsKt.emptyList();
                        }
                        ArrayList arrayList2 = new ArrayList();
                        it = parseWorkoutListIndices.iterator();
                        moyoungWorkoutSync2 = moyoungWorkoutSync;
                        arrayList = arrayList2;
                        if (it.hasNext()) {
                        }
                    } else {
                        if (i2 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        it = (Iterator) moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$2;
                        arrayList = (ArrayList) moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$1;
                        moyoungWorkoutSync2 = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        List list = (List) obj;
                        if (list != null) {
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                arrayList.add((MoyoungWorkout) it2.next());
                            }
                        }
                        if (it.hasNext()) {
                            int intValue = it.next().intValue();
                            moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0 = moyoungWorkoutSync2;
                            moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$1 = arrayList;
                            moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$2 = it;
                            moyoungWorkoutSync$fetchWorkoutsV2Page$1.label = 4;
                            obj = moyoungWorkoutSync2.fetchWorkoutDetail(intValue, moyoungWorkoutSync$fetchWorkoutsV2Page$1);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            List list2 = (List) obj;
                            if (list2 != null) {
                            }
                            if (it.hasNext()) {
                                return arrayList;
                            }
                        }
                    }
                }
                moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0 = moyoungWorkoutSync3;
                moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0 = i4;
                moyoungWorkoutSync$fetchWorkoutsV2Page$1.label = 2;
                if (DelayKt.delay(500L, moyoungWorkoutSync$fetchWorkoutsV2Page$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i6 = i4;
                moyoungWorkoutSync = moyoungWorkoutSync3;
                i3 = i6;
                moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0 = moyoungWorkoutSync;
                moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0 = i3;
                moyoungWorkoutSync$fetchWorkoutsV2Page$1.label = 3;
                obj = moyoungWorkoutSync.awaitPacket(MoyoungConstants.CMD_QUERY_V2_WORKOUT, 15000L, moyoungWorkoutSync$fetchWorkoutsV2Page$1);
                if (obj == coroutine_suspended) {
                }
                pair = (Pair) obj;
                if (pair != null) {
                }
                return CollectionsKt.emptyList();
            }
        }
        moyoungWorkoutSync$fetchWorkoutsV2Page$1 = new MoyoungWorkoutSync$fetchWorkoutsV2Page$1(moyoungWorkoutSync3, continuation);
        Object obj2 = moyoungWorkoutSync$fetchWorkoutsV2Page$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = moyoungWorkoutSync$fetchWorkoutsV2Page$1.label;
        if (i2 != 0) {
        }
        moyoungWorkoutSync$fetchWorkoutsV2Page$1.L$0 = moyoungWorkoutSync3;
        moyoungWorkoutSync$fetchWorkoutsV2Page$1.I$0 = i4;
        moyoungWorkoutSync$fetchWorkoutsV2Page$1.label = 2;
        if (DelayKt.delay(500L, moyoungWorkoutSync$fetchWorkoutsV2Page$1) != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x01a7, code lost:
    
        if (r12.isEmpty() == false) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00d7 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00c8 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x010b -> B:14:0x010d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchWorkoutDetail(int i, Continuation<? super List<MoyoungWorkout>> continuation) {
        MoyoungWorkoutSync$fetchWorkoutDetail$1 moyoungWorkoutSync$fetchWorkoutDetail$1;
        Object coroutine_suspended;
        int i2;
        MoyoungWorkoutSync moyoungWorkoutSync;
        int i3;
        byte[] bArr;
        int i4;
        ArrayList arrayList;
        List<MoyoungWorkout> list;
        MoyoungWorkoutSync moyoungWorkoutSync2;
        long currentTimeMillis;
        MoyoungWorkout copy;
        List<MoyoungWorkout> parseAll;
        MoyoungWorkout copy2;
        int i5;
        byte[] bArr2;
        MoyoungWorkoutSync moyoungWorkoutSync3 = this;
        int i6 = i;
        if (continuation instanceof MoyoungWorkoutSync$fetchWorkoutDetail$1) {
            moyoungWorkoutSync$fetchWorkoutDetail$1 = (MoyoungWorkoutSync$fetchWorkoutDetail$1) continuation;
            if ((moyoungWorkoutSync$fetchWorkoutDetail$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$fetchWorkoutDetail$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$fetchWorkoutDetail$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i2 = moyoungWorkoutSync$fetchWorkoutDetail$1.label;
                List<MoyoungWorkout> list2 = null;
                int i7 = 5;
                if (i2 != 0) {
                    ResultKt.throwOnFailure(obj);
                    clearInbox();
                    byte[] bArr3 = {2, (byte) i6};
                    moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync3;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i6;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.label = 1;
                    if (moyoungWorkoutSync3.writeCommand(MoyoungConstants.CMD_QUERY_V2_WORKOUT, bArr3, moyoungWorkoutSync$fetchWorkoutDetail$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (i2 == 1) {
                    int i8 = moyoungWorkoutSync$fetchWorkoutDetail$1.I$0;
                    MoyoungWorkoutSync moyoungWorkoutSync4 = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutDetail$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i6 = i8;
                    moyoungWorkoutSync3 = moyoungWorkoutSync4;
                } else if (i2 == 2) {
                    i3 = moyoungWorkoutSync$fetchWorkoutDetail$1.I$0;
                    moyoungWorkoutSync = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutDetail$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    bArr = new byte[]{4, (byte) i3};
                    moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i3;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.label = 3;
                    if (moyoungWorkoutSync.writeCommand(MoyoungConstants.CMD_QUERY_V2_WORKOUT, bArr, moyoungWorkoutSync$fetchWorkoutDetail$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i3;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.label = 4;
                    if (DelayKt.delay(400L, moyoungWorkoutSync$fetchWorkoutDetail$1) == coroutine_suspended) {
                    }
                    i4 = i3;
                    arrayList = new ArrayList();
                    list = null;
                    moyoungWorkoutSync2 = moyoungWorkoutSync;
                    currentTimeMillis = System.currentTimeMillis() + 25000;
                    if (System.currentTimeMillis() >= currentTimeMillis) {
                    }
                } else if (i2 == 3) {
                    i3 = moyoungWorkoutSync$fetchWorkoutDetail$1.I$0;
                    moyoungWorkoutSync = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutDetail$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i3;
                    moyoungWorkoutSync$fetchWorkoutDetail$1.label = 4;
                    if (DelayKt.delay(400L, moyoungWorkoutSync$fetchWorkoutDetail$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i4 = i3;
                    arrayList = new ArrayList();
                    list = null;
                    moyoungWorkoutSync2 = moyoungWorkoutSync;
                    currentTimeMillis = System.currentTimeMillis() + 25000;
                    if (System.currentTimeMillis() >= currentTimeMillis) {
                    }
                } else if (i2 == 4) {
                    i3 = moyoungWorkoutSync$fetchWorkoutDetail$1.I$0;
                    moyoungWorkoutSync = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutDetail$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    i4 = i3;
                    arrayList = new ArrayList();
                    list = null;
                    moyoungWorkoutSync2 = moyoungWorkoutSync;
                    currentTimeMillis = System.currentTimeMillis() + 25000;
                    if (System.currentTimeMillis() >= currentTimeMillis) {
                    }
                } else {
                    if (i2 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    currentTimeMillis = moyoungWorkoutSync$fetchWorkoutDetail$1.J$0;
                    i4 = moyoungWorkoutSync$fetchWorkoutDetail$1.I$0;
                    list = (List) moyoungWorkoutSync$fetchWorkoutDetail$1.L$2;
                    arrayList = (ArrayList) moyoungWorkoutSync$fetchWorkoutDetail$1.L$1;
                    moyoungWorkoutSync2 = (MoyoungWorkoutSync) moyoungWorkoutSync$fetchWorkoutDetail$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Pair pair = (Pair) obj;
                    if (pair != null || (bArr2 = (byte[]) pair.getSecond()) == null || bArr2.length == 0) {
                        i5 = 5;
                    } else {
                        byte b = bArr2[0];
                        if (b != 3) {
                            i5 = 5;
                            if (b == 5) {
                                List<MoyoungHrParser.HrPoint> parse = MoyoungHrParser.INSTANCE.parse(bArr2);
                                if (!parse.isEmpty()) {
                                    arrayList.add(parse);
                                }
                            } else if (b != 1) {
                                List<MoyoungWorkout> parseAll2 = MoyoungTrainingParser.INSTANCE.parseAll(bArr2);
                                if (!parseAll2.isEmpty()) {
                                    list = parseAll2;
                                }
                                List<MoyoungHrParser.HrPoint> parse2 = MoyoungHrParser.INSTANCE.parse(bArr2);
                                if (!parse2.isEmpty()) {
                                    arrayList.add(parse2);
                                }
                            }
                        } else {
                            List<MoyoungWorkout> parseDetailPacket = MoyoungTrainingParser.INSTANCE.parseDetailPacket(bArr2);
                            if (parseDetailPacket == null) {
                                parseDetailPacket = MoyoungTrainingParser.INSTANCE.parseAll(bArr2);
                            }
                            List<MoyoungWorkout> list3 = parseDetailPacket;
                            if (list3 != null && !list3.isEmpty()) {
                                Log.d(TAG, "detail id=" + i4 + " parsed " + parseDetailPacket.size());
                                list = parseDetailPacket;
                            }
                            i5 = 5;
                        }
                        if (list != null) {
                        }
                    }
                    i7 = i5;
                    if (System.currentTimeMillis() >= currentTimeMillis) {
                        moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync2;
                        moyoungWorkoutSync$fetchWorkoutDetail$1.L$1 = arrayList;
                        moyoungWorkoutSync$fetchWorkoutDetail$1.L$2 = list;
                        moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i4;
                        moyoungWorkoutSync$fetchWorkoutDetail$1.J$0 = currentTimeMillis;
                        moyoungWorkoutSync$fetchWorkoutDetail$1.label = i7;
                        List<MoyoungWorkout> list4 = list;
                        Object awaitPacket = moyoungWorkoutSync2.awaitPacket(MoyoungConstants.CMD_QUERY_V2_WORKOUT, 3000L, moyoungWorkoutSync$fetchWorkoutDetail$1);
                        if (awaitPacket == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        list = list4;
                        obj = awaitPacket;
                        Pair pair2 = (Pair) obj;
                        if (pair2 != null) {
                        }
                        i5 = 5;
                        i7 = i5;
                        if (System.currentTimeMillis() >= currentTimeMillis) {
                            if (list != null) {
                                List<MoyoungHrParser.HrPoint> merge = MoyoungHrParser.INSTANCE.merge(arrayList);
                                if (merge.isEmpty()) {
                                    return list;
                                }
                                List<MoyoungWorkout> list5 = list;
                                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list5, 10));
                                Iterator it = list5.iterator();
                                while (it.hasNext()) {
                                    copy2 = r13.copy((r24 & 1) != 0 ? r13.startTimeMs : 0L, (r24 & 2) != 0 ? r13.endTimeMs : 0L, (r24 & 4) != 0 ? r13.activeSeconds : 0, (r24 & 8) != 0 ? r13.sportType : 0, (r24 & 16) != 0 ? r13.avgHeartRate : null, (r24 & 32) != 0 ? r13.steps : 0, (r24 & 64) != 0 ? r13.distanceM : 0, (r24 & 128) != 0 ? r13.calories : 0, (r24 & 256) != 0 ? ((MoyoungWorkout) it.next()).hrSeries : merge);
                                    arrayList2.add(copy2);
                                }
                                return arrayList2;
                            }
                            byte[] findTrainingPayloadInInbox = moyoungWorkoutSync2.findTrainingPayloadInInbox();
                            if (findTrainingPayloadInInbox != null && (parseAll = MoyoungTrainingParser.INSTANCE.parseAll(findTrainingPayloadInInbox)) != null && !parseAll.isEmpty()) {
                                list2 = parseAll;
                            }
                            List<MoyoungHrParser.HrPoint> merge2 = MoyoungHrParser.INSTANCE.merge(arrayList);
                            if (list2 == null || merge2.isEmpty()) {
                                return list2;
                            }
                            List<MoyoungWorkout> list6 = list2;
                            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list6, 10));
                            Iterator it2 = list6.iterator();
                            while (it2.hasNext()) {
                                copy = r13.copy((r24 & 1) != 0 ? r13.startTimeMs : 0L, (r24 & 2) != 0 ? r13.endTimeMs : 0L, (r24 & 4) != 0 ? r13.activeSeconds : 0, (r24 & 8) != 0 ? r13.sportType : 0, (r24 & 16) != 0 ? r13.avgHeartRate : null, (r24 & 32) != 0 ? r13.steps : 0, (r24 & 64) != 0 ? r13.distanceM : 0, (r24 & 128) != 0 ? r13.calories : 0, (r24 & 256) != 0 ? ((MoyoungWorkout) it2.next()).hrSeries : merge2);
                                arrayList3.add(copy);
                            }
                            return arrayList3;
                        }
                    }
                }
                moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync3;
                moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i6;
                moyoungWorkoutSync$fetchWorkoutDetail$1.label = 2;
                if (DelayKt.delay(500L, moyoungWorkoutSync$fetchWorkoutDetail$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                int i9 = i6;
                moyoungWorkoutSync = moyoungWorkoutSync3;
                i3 = i9;
                bArr = new byte[]{4, (byte) i3};
                moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync;
                moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i3;
                moyoungWorkoutSync$fetchWorkoutDetail$1.label = 3;
                if (moyoungWorkoutSync.writeCommand(MoyoungConstants.CMD_QUERY_V2_WORKOUT, bArr, moyoungWorkoutSync$fetchWorkoutDetail$1) == coroutine_suspended) {
                }
                moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync;
                moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i3;
                moyoungWorkoutSync$fetchWorkoutDetail$1.label = 4;
                if (DelayKt.delay(400L, moyoungWorkoutSync$fetchWorkoutDetail$1) == coroutine_suspended) {
                }
                i4 = i3;
                arrayList = new ArrayList();
                list = null;
                moyoungWorkoutSync2 = moyoungWorkoutSync;
                currentTimeMillis = System.currentTimeMillis() + 25000;
                if (System.currentTimeMillis() >= currentTimeMillis) {
                }
            }
        }
        moyoungWorkoutSync$fetchWorkoutDetail$1 = new MoyoungWorkoutSync$fetchWorkoutDetail$1(moyoungWorkoutSync3, continuation);
        Object obj2 = moyoungWorkoutSync$fetchWorkoutDetail$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i2 = moyoungWorkoutSync$fetchWorkoutDetail$1.label;
        List<MoyoungWorkout> list22 = null;
        int i72 = 5;
        if (i2 != 0) {
        }
        moyoungWorkoutSync$fetchWorkoutDetail$1.L$0 = moyoungWorkoutSync3;
        moyoungWorkoutSync$fetchWorkoutDetail$1.I$0 = i6;
        moyoungWorkoutSync$fetchWorkoutDetail$1.label = 2;
        if (DelayKt.delay(500L, moyoungWorkoutSync$fetchWorkoutDetail$1) != coroutine_suspended) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008b, code lost:
    
        if (r12.inbox.isEmpty() == false) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object consumeInbox(Byte b, long j, Continuation<? super Unit> continuation) {
        MoyoungWorkoutSync$consumeInbox$1 moyoungWorkoutSync$consumeInbox$1;
        int i;
        MoyoungWorkoutSync moyoungWorkoutSync;
        Byte b2;
        long j2;
        Pair<Byte, byte[]> remove;
        if (continuation instanceof MoyoungWorkoutSync$consumeInbox$1) {
            moyoungWorkoutSync$consumeInbox$1 = (MoyoungWorkoutSync$consumeInbox$1) continuation;
            if ((moyoungWorkoutSync$consumeInbox$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$consumeInbox$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$consumeInbox$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moyoungWorkoutSync$consumeInbox$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis() + j;
                    moyoungWorkoutSync = this;
                    b2 = b;
                    j2 = currentTimeMillis;
                } else {
                    if (i != 1 && i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = moyoungWorkoutSync$consumeInbox$1.J$0;
                    Byte b3 = (Byte) moyoungWorkoutSync$consumeInbox$1.L$1;
                    MoyoungWorkoutSync moyoungWorkoutSync2 = (MoyoungWorkoutSync) moyoungWorkoutSync$consumeInbox$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    b2 = b3;
                    moyoungWorkoutSync = moyoungWorkoutSync2;
                }
                while (System.currentTimeMillis() < j2) {
                    synchronized (moyoungWorkoutSync.inboxLock) {
                        int i2 = -1;
                        int i3 = 0;
                        if (b2 != null) {
                            Iterator<Pair<Byte, byte[]>> it = moyoungWorkoutSync.inbox.iterator();
                            while (it.hasNext()) {
                                if (it.next().getFirst().byteValue() == b2.byteValue()) {
                                    i2 = i3;
                                    break;
                                }
                                i3++;
                            }
                            remove = i2 >= 0 ? moyoungWorkoutSync.inbox.remove(i2) : null;
                        }
                    }
                    moyoungWorkoutSync$consumeInbox$1.L$0 = moyoungWorkoutSync;
                    moyoungWorkoutSync$consumeInbox$1.L$1 = b2;
                    moyoungWorkoutSync$consumeInbox$1.J$0 = j2;
                    if (remove == null) {
                        moyoungWorkoutSync$consumeInbox$1.label = 1;
                        if (DelayKt.delay(50L, moyoungWorkoutSync$consumeInbox$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        moyoungWorkoutSync$consumeInbox$1.label = 2;
                        if (DelayKt.delay(20L, moyoungWorkoutSync$consumeInbox$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        moyoungWorkoutSync$consumeInbox$1 = new MoyoungWorkoutSync$consumeInbox$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$consumeInbox$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$consumeInbox$1.label;
        if (i != 0) {
        }
        while (System.currentTimeMillis() < j2) {
        }
        return Unit.INSTANCE;
    }

    private final byte[] findTrainingPayloadInInbox() {
        synchronized (this.inboxLock) {
            int size = this.inbox.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i = size - 1;
                    Pair<Byte, byte[]> pair = this.inbox.get(size);
                    byte byteValue = pair.component1().byteValue();
                    byte[] component2 = pair.component2();
                    if (byteValue == 55 && !MoyoungTrainingParser.INSTANCE.parseAll(component2).isEmpty()) {
                        return this.inbox.remove(size).getSecond();
                    }
                    if (component2.length >= 24 && !MoyoungTrainingParser.INSTANCE.parseAll(component2).isEmpty()) {
                        return this.inbox.remove(size).getSecond();
                    }
                    if (i < 0) {
                        break;
                    }
                    size = i;
                }
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    private final byte[] findListPayloadInInbox() {
        synchronized (this.inboxLock) {
            Iterator<Pair<Byte, byte[]>> it = this.inbox.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                byte[] component2 = it.next().component2();
                if (!(component2.length == 0) && component2[0] == 1) {
                    break;
                }
                i++;
            }
            if (i >= 0) {
                return this.inbox.remove(i).getSecond();
            }
            Unit unit = Unit.INSTANCE;
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object awaitPacket(byte b, long j, Continuation<? super Pair<Byte, byte[]>> continuation) {
        MoyoungWorkoutSync$awaitPacket$1 moyoungWorkoutSync$awaitPacket$1;
        int i;
        MoyoungWorkoutSync moyoungWorkoutSync;
        byte b2;
        long j2;
        if (continuation instanceof MoyoungWorkoutSync$awaitPacket$1) {
            moyoungWorkoutSync$awaitPacket$1 = (MoyoungWorkoutSync$awaitPacket$1) continuation;
            if ((moyoungWorkoutSync$awaitPacket$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$awaitPacket$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$awaitPacket$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moyoungWorkoutSync$awaitPacket$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis() + j;
                    moyoungWorkoutSync = this;
                    b2 = b;
                    j2 = currentTimeMillis;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j2 = moyoungWorkoutSync$awaitPacket$1.J$0;
                    byte b3 = moyoungWorkoutSync$awaitPacket$1.B$0;
                    MoyoungWorkoutSync moyoungWorkoutSync2 = (MoyoungWorkoutSync) moyoungWorkoutSync$awaitPacket$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    b2 = b3;
                    moyoungWorkoutSync = moyoungWorkoutSync2;
                }
                while (System.currentTimeMillis() < j2) {
                    synchronized (moyoungWorkoutSync.inboxLock) {
                        Iterator<Pair<Byte, byte[]>> it = moyoungWorkoutSync.inbox.iterator();
                        int i2 = 0;
                        while (true) {
                            if (!it.hasNext()) {
                                i2 = -1;
                                break;
                            }
                            if (it.next().getFirst().byteValue() == b2) {
                                break;
                            }
                            i2++;
                        }
                        if (i2 >= 0) {
                            return moyoungWorkoutSync.inbox.remove(i2);
                        }
                        Unit unit = Unit.INSTANCE;
                        moyoungWorkoutSync$awaitPacket$1.L$0 = moyoungWorkoutSync;
                        moyoungWorkoutSync$awaitPacket$1.B$0 = b2;
                        moyoungWorkoutSync$awaitPacket$1.J$0 = j2;
                        moyoungWorkoutSync$awaitPacket$1.label = 1;
                        if (DelayKt.delay(50L, moyoungWorkoutSync$awaitPacket$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return null;
            }
        }
        moyoungWorkoutSync$awaitPacket$1 = new MoyoungWorkoutSync$awaitPacket$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$awaitPacket$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$awaitPacket$1.label;
        if (i != 0) {
        }
        while (System.currentTimeMillis() < j2) {
        }
        return null;
    }

    private final void clearInbox() {
        synchronized (this.inboxLock) {
            this.inbox.clear();
            Unit unit = Unit.INSTANCE;
        }
        synchronized (this.assembleLock) {
            this.packetIn.reset();
            Unit unit2 = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeCommand(byte b, byte[] bArr, Continuation<? super Unit> continuation) {
        MoyoungWorkoutSync$writeCommand$1 moyoungWorkoutSync$writeCommand$1;
        int i;
        BluetoothGattCharacteristic characteristic;
        MoyoungWorkoutSync moyoungWorkoutSync;
        Iterator<byte[]> it;
        if (continuation instanceof MoyoungWorkoutSync$writeCommand$1) {
            moyoungWorkoutSync$writeCommand$1 = (MoyoungWorkoutSync$writeCommand$1) continuation;
            if ((moyoungWorkoutSync$writeCommand$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$writeCommand$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$writeCommand$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moyoungWorkoutSync$writeCommand$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    byte[] buildPacket = MoyoungPacketOut.INSTANCE.buildPacket(this.mtu, b, bArr);
                    BluetoothGattService service = this.gatt.getService(MoyoungConstants.INSTANCE.getUUID_SERVICE());
                    if (service == null || (characteristic = service.getCharacteristic(MoyoungConstants.INSTANCE.getUUID_CHARACTERISTIC_DATA_OUT())) == null) {
                        throw new IllegalStateException("Moyoung DATA_OUT not found — reconnect watch on Home".toString());
                    }
                    Iterator<byte[]> it2 = MoyoungPacketOut.INSTANCE.fragments(buildPacket, this.mtu).iterator();
                    moyoungWorkoutSync = this;
                    it = it2;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = (Iterator) moyoungWorkoutSync$writeCommand$1.L$2;
                    BluetoothGattCharacteristic bluetoothGattCharacteristic = (BluetoothGattCharacteristic) moyoungWorkoutSync$writeCommand$1.L$1;
                    MoyoungWorkoutSync moyoungWorkoutSync2 = (MoyoungWorkoutSync) moyoungWorkoutSync$writeCommand$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    characteristic = bluetoothGattCharacteristic;
                    moyoungWorkoutSync = moyoungWorkoutSync2;
                }
                while (it.hasNext()) {
                    byte[] next = it.next();
                    moyoungWorkoutSync$writeCommand$1.L$0 = moyoungWorkoutSync;
                    moyoungWorkoutSync$writeCommand$1.L$1 = characteristic;
                    moyoungWorkoutSync$writeCommand$1.L$2 = it;
                    moyoungWorkoutSync$writeCommand$1.label = 1;
                    if (moyoungWorkoutSync.writeChunk(characteristic, next, moyoungWorkoutSync$writeCommand$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
        }
        moyoungWorkoutSync$writeCommand$1 = new MoyoungWorkoutSync$writeCommand$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$writeCommand$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$writeCommand$1.label;
        if (i != 0) {
        }
        while (it.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeChunk(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, Continuation<? super Unit> continuation) {
        MoyoungWorkoutSync$writeChunk$1 moyoungWorkoutSync$writeChunk$1;
        Object coroutine_suspended;
        int i;
        if (continuation instanceof MoyoungWorkoutSync$writeChunk$1) {
            moyoungWorkoutSync$writeChunk$1 = (MoyoungWorkoutSync$writeChunk$1) continuation;
            if ((moyoungWorkoutSync$writeChunk$1.label & Integer.MIN_VALUE) != 0) {
                moyoungWorkoutSync$writeChunk$1.label -= Integer.MIN_VALUE;
                Object obj = moyoungWorkoutSync$writeChunk$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = moyoungWorkoutSync$writeChunk$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    MainCoroutineDispatcher main = Dispatchers.getMain();
                    MoyoungWorkoutSync$writeChunk$2 moyoungWorkoutSync$writeChunk$2 = new MoyoungWorkoutSync$writeChunk$2(this, bluetoothGattCharacteristic, bArr, null);
                    moyoungWorkoutSync$writeChunk$1.label = 1;
                    if (BuildersKt.withContext(main, moyoungWorkoutSync$writeChunk$2, moyoungWorkoutSync$writeChunk$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                }
                moyoungWorkoutSync$writeChunk$1.label = 2;
                if (DelayKt.delay(80L, moyoungWorkoutSync$writeChunk$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
        }
        moyoungWorkoutSync$writeChunk$1 = new MoyoungWorkoutSync$writeChunk$1(this, continuation);
        Object obj2 = moyoungWorkoutSync$writeChunk$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = moyoungWorkoutSync$writeChunk$1.label;
        if (i != 0) {
        }
        moyoungWorkoutSync$writeChunk$1.label = 2;
        if (DelayKt.delay(80L, moyoungWorkoutSync$writeChunk$1) == coroutine_suspended) {
        }
        return Unit.INSTANCE;
    }

    /* compiled from: MoyoungWorkoutSync.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungWorkoutSync$Companion;", "", "<init>", "()V", "TAG", "", "CCCD", "Ljava/util/UUID;", "getCCCD", "()Ljava/util/UUID;", "parseWorkoutListIndices", "", "", "payload", "", "enableNotify", "", "gatt", "Landroid/bluetooth/BluetoothGatt;", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final UUID getCCCD() {
            return MoyoungWorkoutSync.CCCD;
        }

        public final List<Integer> parseWorkoutListIndices(byte[] payload) {
            int i;
            Intrinsics.checkNotNullParameter(payload, "payload");
            if (payload.length == 0 || payload[0] != 1) {
                return CollectionsKt.emptyList();
            }
            int length = payload.length / 5;
            if (length <= 0 && payload.length >= 2 && 1 <= (i = payload[1] & 255) && i < 65) {
                length = i;
            }
            if (length <= 0) {
                return CollectionsKt.emptyList();
            }
            return CollectionsKt.toList(RangesKt.until(0, RangesKt.coerceAtMost(length, 64)));
        }

        public final boolean enableNotify(BluetoothGatt gatt) {
            BluetoothGattCharacteristic characteristic;
            Intrinsics.checkNotNullParameter(gatt, "gatt");
            BluetoothGattService service = gatt.getService(MoyoungConstants.INSTANCE.getUUID_SERVICE());
            if (service == null || (characteristic = service.getCharacteristic(MoyoungConstants.INSTANCE.getUUID_CHARACTERISTIC_DATA_IN())) == null || !gatt.setCharacteristicNotification(characteristic, true)) {
                return false;
            }
            BluetoothGattDescriptor descriptor = characteristic.getDescriptor(getCCCD());
            if (descriptor == null) {
                return true;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                return gatt.writeDescriptor(descriptor, BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE) == 0;
            }
            descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
            return gatt.writeDescriptor(descriptor);
        }
    }

    static {
        UUID fromString = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        CCCD = fromString;
    }
}
