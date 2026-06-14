package com.example.rungps.ble;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseTrackerBleUuids.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u000e\u0010\u0010\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0014X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/example/rungps/ble/ExerciseTrackerBleUuids;", "", "<init>", "()V", "SERVICE", "Ljava/util/UUID;", "getSERVICE", "()Ljava/util/UUID;", "SOCCER_CTRL", "getSOCCER_CTRL", "SOCCER_STATUS", "getSOCCER_STATUS", "SOCCER_BATCH", "getSOCCER_BATCH", "SOCCER_ACK", "getSOCCER_ACK", "CTRL_START_TRAINING", "", "CTRL_STOP", "STATUS_IDLE", "", "STATUS_RECORDING", "STATUS_STOPPED_PENDING", "RECORD_BYTES", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseTrackerBleUuids {
    public static final int $stable;
    public static final byte CTRL_START_TRAINING = 1;
    public static final byte CTRL_STOP = 2;
    public static final ExerciseTrackerBleUuids INSTANCE = new ExerciseTrackerBleUuids();
    public static final int RECORD_BYTES = 14;
    private static final UUID SERVICE;
    private static final UUID SOCCER_ACK;
    private static final UUID SOCCER_BATCH;
    private static final UUID SOCCER_CTRL;
    private static final UUID SOCCER_STATUS;
    public static final int STATUS_IDLE = 0;
    public static final int STATUS_RECORDING = 1;
    public static final int STATUS_STOPPED_PENDING = 2;

    private ExerciseTrackerBleUuids() {
    }

    static {
        UUID fromString = UUID.fromString("a7f30100-6e5e-4e75-8e61-656561706572");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        SERVICE = fromString;
        UUID fromString2 = UUID.fromString("a7f30101-6e5e-4e75-8e61-656561706572");
        Intrinsics.checkNotNullExpressionValue(fromString2, "fromString(...)");
        SOCCER_CTRL = fromString2;
        UUID fromString3 = UUID.fromString("a7f30102-6e5e-4e75-8e61-656561706572");
        Intrinsics.checkNotNullExpressionValue(fromString3, "fromString(...)");
        SOCCER_STATUS = fromString3;
        UUID fromString4 = UUID.fromString("a7f30103-6e5e-4e75-8e61-656561706572");
        Intrinsics.checkNotNullExpressionValue(fromString4, "fromString(...)");
        SOCCER_BATCH = fromString4;
        UUID fromString5 = UUID.fromString("a7f30104-6e5e-4e75-8e61-656561706572");
        Intrinsics.checkNotNullExpressionValue(fromString5, "fromString(...)");
        SOCCER_ACK = fromString5;
        $stable = 8;
    }

    public final UUID getSERVICE() {
        return SERVICE;
    }

    public final UUID getSOCCER_CTRL() {
        return SOCCER_CTRL;
    }

    public final UUID getSOCCER_STATUS() {
        return SOCCER_STATUS;
    }

    public final UUID getSOCCER_BATCH() {
        return SOCCER_BATCH;
    }

    public final UUID getSOCCER_ACK() {
        return SOCCER_ACK;
    }
}
