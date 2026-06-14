package com.example.rungps.ble.moyoung;

import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoyoungPacket.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\b\u0010\r\u001a\u0004\u0018\u00010\u0005R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungPacketIn;", "", "<init>", "()V", "packet", "", "position", "", "reset", "", "putFragment", "", "fragment", "completePacket", "Companion", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungPacketIn {
    private byte[] packet;
    private int position;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public final void reset() {
        this.packet = null;
        this.position = 0;
    }

    public final boolean putFragment(byte[] fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (this.packet == null) {
            int parsePacketLength = INSTANCE.parsePacketLength(fragment);
            if (parsePacketLength < 0) {
                return false;
            }
            this.packet = new byte[parsePacketLength];
            this.position = 0;
        }
        byte[] bArr = this.packet;
        if (bArr == null) {
            return false;
        }
        int min = Math.min(fragment.length, bArr.length - this.position);
        System.arraycopy(fragment, 0, bArr, this.position, min);
        int i = this.position + min;
        this.position = i;
        return i >= bArr.length;
    }

    public final byte[] completePacket() {
        byte[] bArr = this.packet;
        if (bArr != null && this.position >= bArr.length) {
            return bArr;
        }
        return null;
    }

    /* compiled from: MoyoungPacket.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¨\u0006\f"}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungPacketIn$Companion;", "", "<init>", "()V", "parsePacket", "Lkotlin/Pair;", "", "", "packet", "parsePacketLength", "", "fragment", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Pair<Byte, byte[]> parsePacket(byte[] packet) {
            Intrinsics.checkNotNullParameter(packet, "packet");
            int parsePacketLength = parsePacketLength(packet);
            if (parsePacketLength < 0 || parsePacketLength != packet.length) {
                return null;
            }
            byte b = packet[4];
            return TuplesKt.to(Byte.valueOf(b), ArraysKt.copyOfRange(packet, 5, packet.length));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int parsePacketLength(byte[] fragment) {
            if (fragment.length < 4) {
                return -1;
            }
            int i = 0;
            if (fragment[0] != -2 || fragment[1] != -22) {
                return -1;
            }
            byte b = fragment[2];
            if ((b & 255) != 16) {
                int i2 = b & 255;
                if (i2 < 32) {
                    return -1;
                }
                i = i2 - 32;
            }
            return (i << 8) | (fragment[3] & 255);
        }
    }
}
