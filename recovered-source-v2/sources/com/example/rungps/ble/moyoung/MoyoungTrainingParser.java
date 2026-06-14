package com.example.rungps.ble.moyoung;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: MoyoungTrainingParser.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\bJ*\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002¨\u0006\u0011"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungTrainingParser;", "", "<init>", "()V", "parseAll", "", "Lcom/example/rungps/ble/moyoung/MoyoungWorkout;", "data", "", "parseDetailPacket", "payload", "parseOne", "offset", "", "entryLen", "protocolV2", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungTrainingParser {
    public static final int $stable = 0;
    public static final MoyoungTrainingParser INSTANCE = new MoyoungTrainingParser();

    private MoyoungTrainingParser() {
    }

    public final List<MoyoungWorkout> parseAll(byte[] data) {
        int i;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length == 0) {
            return CollectionsKt.emptyList();
        }
        List<MoyoungWorkout> parseDetailPacket = parseDetailPacket(data);
        if (parseDetailPacket != null && !parseDetailPacket.isEmpty()) {
            return parseDetailPacket;
        }
        int i2 = 0;
        if (data.length % 26 == 0) {
            i = 26;
        } else {
            i = 24;
            if (data.length % 24 != 0) {
                i = 0;
            }
        }
        if (i == 0) {
            return CollectionsKt.emptyList();
        }
        boolean z = i == 26;
        ArrayList arrayList = new ArrayList();
        while (true) {
            int i3 = i2 + i;
            if (i3 <= data.length) {
                MoyoungWorkout parseOne = parseOne(data, i2, i, z);
                if (parseOne != null) {
                    arrayList.add(parseOne);
                }
                i2 = i3;
            } else {
                return arrayList;
            }
        }
    }

    public final List<MoyoungWorkout> parseDetailPacket(byte[] payload) {
        MoyoungWorkout parseOne;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length == 0 || payload[0] != 3) {
            return null;
        }
        if (payload.length >= 26 && (parseOne = parseOne(payload, 0, 26, true)) != null) {
            return CollectionsKt.listOf(parseOne);
        }
        byte[] copyOfRange = ArraysKt.copyOfRange(payload, 1, payload.length);
        if (copyOfRange.length == 0) {
            return null;
        }
        int length = copyOfRange.length;
        if (22 <= length && length < 29) {
            byte[] bArr = new byte[26];
            bArr[0] = 3;
            bArr[1] = 0;
            System.arraycopy(copyOfRange, 0, bArr, 2, Math.min(copyOfRange.length, 24));
            MoyoungWorkout parseOne2 = parseOne(bArr, 0, 26, true);
            if (parseOne2 != null) {
                return CollectionsKt.listOf(parseOne2);
            }
        }
        if (copyOfRange.length >= 22) {
            byte[] bArr2 = new byte[24];
            System.arraycopy(copyOfRange, 0, bArr2, 0, Math.min(copyOfRange.length, 24));
            MoyoungWorkout parseOne3 = parseOne(bArr2, 0, 24, false);
            if (parseOne3 != null) {
                return CollectionsKt.listOf(parseOne3);
            }
        }
        return null;
    }

    private final MoyoungWorkout parseOne(byte[] data, int offset, int entryLen, boolean protocolV2) {
        Integer num;
        long currentTimeMillis;
        long j;
        long watchEpochSecToLocalMs;
        int intValue;
        if (protocolV2) {
            int i = offset + entryLen;
            for (int i2 = offset + 2; i2 < i; i2++) {
                if (data[i2] == 0) {
                }
            }
            return null;
        }
        int i3 = offset + entryLen;
        for (int i4 = offset; i4 < i3; i4++) {
            if (data[i4] == 0) {
            }
        }
        return null;
        ByteBuffer order = ByteBuffer.wrap(data, offset, entryLen).order(ByteOrder.LITTLE_ENDIAN);
        if (protocolV2) {
            order.get();
            order.get();
        }
        int i5 = order.getInt();
        int i6 = order.getInt();
        int i7 = order.getShort() & UShort.MAX_VALUE;
        if (protocolV2) {
            num = Integer.valueOf(order.get() & 255);
        } else {
            order.get();
            num = null;
        }
        int i8 = order.get() & 255;
        int i9 = order.getInt();
        int i10 = order.getInt();
        int i11 = protocolV2 ? order.getInt() : order.getShort() & UShort.MAX_VALUE;
        if (i5 <= 0 && i7 <= 0 && i6 <= 0) {
            return null;
        }
        if (i7 <= 0) {
            i7 = RangesKt.coerceAtLeast(i6 - i5, 0);
            if (i7 <= 0) {
                return null;
            }
        } else if (1 <= i7 && i7 < 601 && i6 - i5 > i7 * 45) {
            i7 *= 60;
        }
        int i12 = i7;
        Integer num2 = (num == null || 40 > (intValue = num.intValue()) || intValue >= 221) ? null : num;
        if (i5 > 0) {
            currentTimeMillis = MoyoungWatchTime.INSTANCE.watchEpochSecToLocalMs(i5);
        } else {
            currentTimeMillis = System.currentTimeMillis() - (i12 * 1000);
        }
        long j2 = currentTimeMillis;
        if (i6 > i5 && i6 > 0) {
            watchEpochSecToLocalMs = MoyoungWatchTime.INSTANCE.watchEpochSecToLocalMs(i6);
        } else {
            if (i5 <= 0) {
                j = (i12 * 1000) + j2;
                return new MoyoungWorkout(j2, j, i12, i8, num2, i9, i10, i11, null, 256, null);
            }
            watchEpochSecToLocalMs = MoyoungWatchTime.INSTANCE.watchEpochSecToLocalMs(i5 + i12);
        }
        j = watchEpochSecToLocalMs;
        return new MoyoungWorkout(j2, j, i12, i8, num2, i9, i10, i11, null, 256, null);
    }
}
