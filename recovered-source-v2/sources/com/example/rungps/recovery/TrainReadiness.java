package com.example.rungps.recovery;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ReadyToTrain.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/recovery/TrainReadiness;", "", "<init>", "(Ljava/lang/String;I)V", "Ready", "Caution", "Rest", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TrainReadiness {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TrainReadiness[] $VALUES;
    public static final TrainReadiness Ready = new TrainReadiness("Ready", 0);
    public static final TrainReadiness Caution = new TrainReadiness("Caution", 1);
    public static final TrainReadiness Rest = new TrainReadiness("Rest", 2);

    private static final /* synthetic */ TrainReadiness[] $values() {
        return new TrainReadiness[]{Ready, Caution, Rest};
    }

    public static EnumEntries<TrainReadiness> getEntries() {
        return $ENTRIES;
    }

    static {
        TrainReadiness[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private TrainReadiness(String str, int i) {
    }

    public static TrainReadiness valueOf(String str) {
        return (TrainReadiness) Enum.valueOf(TrainReadiness.class, str);
    }

    public static TrainReadiness[] values() {
        return (TrainReadiness[]) $VALUES.clone();
    }
}
