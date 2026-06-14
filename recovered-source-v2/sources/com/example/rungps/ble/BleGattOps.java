package com.example.rungps.ble;

import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.core.app.NotificationCompat;
import androidx.health.connect.client.records.CervicalMucusRecord;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutKt;

/* compiled from: BleGattOps.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\r\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u0012J&\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u000bH\u0086@¢\u0006\u0002\u0010\u0016J \u0010\u0017\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\bJ\u0016\u0010\u001b\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\"\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001a\u001a\u00020\bH\u0002J\u0006\u0010\u001d\u001a\u00020\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\u0006\u001a \u0012\u0004\u0012\u00020\b\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0004\u0012\u00020\f0\t0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/example/rungps/ble/BleGattOps;", "", "<init>", "()V", "nextOpId", "Ljava/util/concurrent/atomic/AtomicInteger;", "pending", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lkotlin/Function1;", "Lkotlin/Result;", "", "", "read", "gatt", "Landroid/bluetooth/BluetoothGatt;", "char", "Landroid/bluetooth/BluetoothGattCharacteristic;", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "write", "", "data", "(Landroid/bluetooth/BluetoothGatt;Landroid/bluetooth/BluetoothGattCharacteristic;[BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "completeRead", "uuid", "Ljava/util/UUID;", NotificationCompat.CATEGORY_STATUS, "completeWrite", "complete", CervicalMucusRecord.Appearance.CLEAR, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BleGattOps {
    public static final int $stable = 8;
    private final AtomicInteger nextOpId = new AtomicInteger(0);
    private final ConcurrentHashMap<Integer, Function1<Result<byte[]>, Unit>> pending = new ConcurrentHashMap<>();

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object read(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, Continuation<? super byte[]> continuation) {
        BleGattOps$read$1 bleGattOps$read$1;
        int i;
        if (continuation instanceof BleGattOps$read$1) {
            bleGattOps$read$1 = (BleGattOps$read$1) continuation;
            if ((bleGattOps$read$1.label & Integer.MIN_VALUE) != 0) {
                bleGattOps$read$1.label -= Integer.MIN_VALUE;
                Object obj = bleGattOps$read$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bleGattOps$read$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BleGattOps$read$result$1 bleGattOps$read$result$1 = new BleGattOps$read$result$1(this, this.nextOpId.incrementAndGet(), bluetoothGatt, bluetoothGattCharacteristic, null);
                    bleGattOps$read$1.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(8000L, bleGattOps$read$result$1, bleGattOps$read$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return (byte[]) obj;
            }
        }
        bleGattOps$read$1 = new BleGattOps$read$1(this, continuation);
        Object obj2 = bleGattOps$read$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bleGattOps$read$1.label;
        if (i != 0) {
        }
        return (byte[]) obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object write(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, Continuation<? super Boolean> continuation) {
        BleGattOps$write$1 bleGattOps$write$1;
        int i;
        if (continuation instanceof BleGattOps$write$1) {
            bleGattOps$write$1 = (BleGattOps$write$1) continuation;
            if ((bleGattOps$write$1.label & Integer.MIN_VALUE) != 0) {
                bleGattOps$write$1.label -= Integer.MIN_VALUE;
                Object obj = bleGattOps$write$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = bleGattOps$write$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    BleGattOps$write$result$1 bleGattOps$write$result$1 = new BleGattOps$write$result$1(this, this.nextOpId.incrementAndGet(), bluetoothGatt, bluetoothGattCharacteristic, bArr, null);
                    bleGattOps$write$1.label = 1;
                    obj = TimeoutKt.withTimeoutOrNull(8000L, bleGattOps$write$result$1, bleGattOps$write$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(Intrinsics.areEqual((Boolean) obj, Boxing.boxBoolean(true)));
            }
        }
        bleGattOps$write$1 = new BleGattOps$write$1(this, continuation);
        Object obj2 = bleGattOps$write$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = bleGattOps$write$1.label;
        if (i != 0) {
        }
        return Boxing.boxBoolean(Intrinsics.areEqual((Boolean) obj2, Boxing.boxBoolean(true)));
    }

    public final void completeRead(UUID uuid, byte[] data, int status) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        complete(uuid, data, status);
    }

    public final void completeWrite(UUID uuid, int status) {
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        complete(uuid, null, status);
    }

    private final void complete(UUID uuid, byte[] data, int status) {
        Set<Map.Entry<Integer, Function1<Result<byte[]>, Unit>>> entrySet = this.pending.entrySet();
        Intrinsics.checkNotNullExpressionValue(entrySet, "<get-entries>(...)");
        Map.Entry entry = (Map.Entry) CollectionsKt.firstOrNull(entrySet);
        if (entry == null) {
            return;
        }
        this.pending.remove(entry.getKey());
        if (status == 0) {
            Function1 function1 = (Function1) entry.getValue();
            Result.Companion companion = Result.INSTANCE;
            if (data == null) {
                data = new byte[0];
            }
            function1.invoke(Result.m7904boximpl(Result.m7905constructorimpl(data)));
            return;
        }
        Function1 function12 = (Function1) entry.getValue();
        Result.Companion companion2 = Result.INSTANCE;
        function12.invoke(Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("GATT " + status + " for " + uuid)))));
    }

    public final void clear() {
        Collection<Function1<Result<byte[]>, Unit>> values = this.pending.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            Function1 function1 = (Function1) it.next();
            Result.Companion companion = Result.INSTANCE;
            function1.invoke(Result.m7904boximpl(Result.m7905constructorimpl(ResultKt.createFailure(new IllegalStateException("Disconnected")))));
        }
        this.pending.clear();
    }
}
