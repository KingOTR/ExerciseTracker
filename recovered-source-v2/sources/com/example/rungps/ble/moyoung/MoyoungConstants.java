package com.example.rungps.ble.moyoung;

import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MoyoungConstants.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0005\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0002R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u0007R\u000e\u0010\u000e\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001aX\u0086T¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lcom/example/rungps/ble/moyoung/MoyoungConstants;", "", "<init>", "()V", "UUID_SERVICE", "Ljava/util/UUID;", "getUUID_SERVICE", "()Ljava/util/UUID;", "UUID_CHARACTERISTIC_DATA_OUT", "getUUID_CHARACTERISTIC_DATA_OUT", "UUID_CHARACTERISTIC_DATA_IN", "getUUID_CHARACTERISTIC_DATA_IN", "UUID_CHARACTERISTIC_STEPS", "getUUID_CHARACTERISTIC_STEPS", "CMD_QUERY_LAST_DYNAMIC_RATE", "", "CMD_SYNC_TIME", "CMD_QUERY_MOVEMENT_HEART_RATE", "CMD_QUERY_V2_WORKOUT", "WORKOUT_LIST_REQUEST", "WORKOUT_LIST_RESPONSE", "WORKOUT_DETAIL_REQUEST", "WORKOUT_DETAIL_RESPONSE", "WORKOUT_HR_REQUEST", "WORKOUT_HR_RESPONSE", "TRAINING_TYPE_FOOTBALL", "", "TRAINING_TYPE_FITNESS", "TRAINING_TYPE_FREE_EXERCISE", "uuid16", "short", "", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoyoungConstants {
    public static final int $stable;
    public static final byte CMD_QUERY_LAST_DYNAMIC_RATE = 52;
    public static final byte CMD_QUERY_MOVEMENT_HEART_RATE = 55;
    public static final byte CMD_QUERY_V2_WORKOUT = -78;
    public static final byte CMD_SYNC_TIME = 49;
    public static final MoyoungConstants INSTANCE;
    public static final int TRAINING_TYPE_FITNESS = 13;
    public static final int TRAINING_TYPE_FOOTBALL = 6;
    public static final int TRAINING_TYPE_FREE_EXERCISE = 18;
    private static final UUID UUID_CHARACTERISTIC_DATA_IN;
    private static final UUID UUID_CHARACTERISTIC_DATA_OUT;
    private static final UUID UUID_CHARACTERISTIC_STEPS;
    private static final UUID UUID_SERVICE;
    public static final byte WORKOUT_DETAIL_REQUEST = 2;
    public static final byte WORKOUT_DETAIL_RESPONSE = 3;
    public static final byte WORKOUT_HR_REQUEST = 4;
    public static final byte WORKOUT_HR_RESPONSE = 5;
    public static final byte WORKOUT_LIST_REQUEST = 0;
    public static final byte WORKOUT_LIST_RESPONSE = 1;

    private MoyoungConstants() {
    }

    static {
        MoyoungConstants moyoungConstants = new MoyoungConstants();
        INSTANCE = moyoungConstants;
        UUID_SERVICE = moyoungConstants.uuid16("feea");
        UUID_CHARACTERISTIC_DATA_OUT = moyoungConstants.uuid16("fee2");
        UUID_CHARACTERISTIC_DATA_IN = moyoungConstants.uuid16("fee3");
        UUID_CHARACTERISTIC_STEPS = moyoungConstants.uuid16("fee1");
        $stable = 8;
    }

    public final UUID getUUID_SERVICE() {
        return UUID_SERVICE;
    }

    public final UUID getUUID_CHARACTERISTIC_DATA_OUT() {
        return UUID_CHARACTERISTIC_DATA_OUT;
    }

    public final UUID getUUID_CHARACTERISTIC_DATA_IN() {
        return UUID_CHARACTERISTIC_DATA_IN;
    }

    public final UUID getUUID_CHARACTERISTIC_STEPS() {
        return UUID_CHARACTERISTIC_STEPS;
    }

    private final UUID uuid16(String r2) {
        UUID fromString = UUID.fromString("0000" + r2 + "-0000-1000-8000-00805f9b34fb");
        Intrinsics.checkNotNullExpressionValue(fromString, "fromString(...)");
        return fromString;
    }
}
