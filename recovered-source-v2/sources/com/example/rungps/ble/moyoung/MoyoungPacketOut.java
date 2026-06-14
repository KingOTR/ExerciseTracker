package com.example.rungps.ble.moyoung;

import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoyoungPacket.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0005J\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\u000e"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungPacketOut;", "", "<init>", "()V", "buildPacket", "", "mtu", "", "packetType", "", "payload", "fragments", "", "packet", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungPacketOut {
    public static final int $stable = 0;
    public static final MoyoungPacketOut INSTANCE = new MoyoungPacketOut();

    private MoyoungPacketOut() {
    }

    public final byte[] buildPacket(int mtu, byte packetType, byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        int length = payload.length + 5;
        byte[] bArr = new byte[length];
        bArr[0] = -2;
        bArr[1] = -22;
        if (mtu == 20) {
            bArr[2] = Ascii.DLE;
        } else {
            bArr[2] = (byte) (((length >> 8) + 32) & 255);
        }
        bArr[3] = (byte) (length & 255);
        bArr[4] = packetType;
        System.arraycopy(payload, 0, bArr, 5, payload.length);
        return bArr;
    }

    public final List<byte[]> fragments(byte[] packet, int mtu) {
        Intrinsics.checkNotNullParameter(packet, "packet");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < packet.length) {
            int min = Math.min(mtu, packet.length - i) + i;
            arrayList.add(ArraysKt.copyOfRange(packet, i, min));
            i = min;
        }
        return arrayList;
    }
}
