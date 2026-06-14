package com.example.rungps.sleep;

import androidx.health.connect.client.records.CervicalMucusRecord;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* compiled from: SleepPcmRingBuffer.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0016\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0003J\u000e\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0003R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/example/rungps/sleep/SleepPcmRingBuffer;", "", "seconds", "", "sampleRate", "<init>", "(II)V", "bytesPerSecond", "capacityBytes", "data", "", "writePos", "filled", "", CervicalMucusRecord.Appearance.CLEAR, "", "appendPcm", "samples", "", "count", "tailPcmBytes", "ms", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepPcmRingBuffer {
    public static final int $stable = 8;
    private final int bytesPerSecond;
    private final int capacityBytes;
    private final byte[] data;
    private boolean filled;
    private final int sampleRate;
    private int writePos;

    public SleepPcmRingBuffer(int i, int i2) {
        this.sampleRate = i2;
        int i3 = i2 * 2;
        this.bytesPerSecond = i3;
        int coerceIn = RangesKt.coerceIn(i, 5, 60) * i3;
        this.capacityBytes = coerceIn;
        this.data = new byte[coerceIn];
    }

    public final synchronized void clear() {
        this.writePos = 0;
        this.filled = false;
    }

    public final synchronized void appendPcm(short[] samples, int count) {
        Intrinsics.checkNotNullParameter(samples, "samples");
        int coerceIn = RangesKt.coerceIn(count, 0, samples.length);
        for (int i = 0; i < coerceIn; i++) {
            short s = samples[i];
            byte[] bArr = this.data;
            int i2 = this.writePos;
            bArr[i2] = (byte) (s & 255);
            int i3 = this.capacityBytes;
            int i4 = (i2 + 1) % i3;
            this.writePos = i4;
            bArr[i4] = (byte) ((s >> 8) & 255);
            int i5 = (i4 + 1) % i3;
            this.writePos = i5;
            if (i5 == 0) {
                this.filled = true;
            }
        }
    }

    public final synchronized byte[] tailPcmBytes(int ms) {
        int coerceAtMost = RangesKt.coerceAtMost(RangesKt.coerceAtMost((int) ((RangesKt.coerceAtLeast(ms, 0) / 1000.0d) * this.bytesPerSecond), this.capacityBytes), this.filled ? this.capacityBytes : this.writePos);
        if (coerceAtMost <= 0) {
            return new byte[0];
        }
        byte[] bArr = new byte[coerceAtMost];
        int i = this.writePos - coerceAtMost;
        if (i < 0) {
            i += this.capacityBytes;
        }
        int i2 = i + coerceAtMost;
        int i3 = this.capacityBytes;
        if (i2 <= i3) {
            System.arraycopy(this.data, i, bArr, 0, coerceAtMost);
        } else {
            int i4 = i3 - i;
            System.arraycopy(this.data, i, bArr, 0, i4);
            System.arraycopy(this.data, 0, bArr, i4, coerceAtMost - i4);
        }
        return bArr;
    }
}
