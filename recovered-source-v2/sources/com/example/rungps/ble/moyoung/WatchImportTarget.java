package com.example.rungps.ble.moyoung;

import com.example.rungps.tracking.ActivityTypes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MoyoungSportLabels.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/example/rungps/ble/moyoung/WatchImportTarget;", "", "<init>", "(Ljava/lang/String;I)V", "SOCCER", "RUN", ActivityTypes.BIKE, "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WatchImportTarget {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WatchImportTarget[] $VALUES;
    public static final WatchImportTarget SOCCER = new WatchImportTarget("SOCCER", 0);
    public static final WatchImportTarget RUN = new WatchImportTarget("RUN", 1);
    public static final WatchImportTarget BIKE = new WatchImportTarget(ActivityTypes.BIKE, 2);

    private static final /* synthetic */ WatchImportTarget[] $values() {
        return new WatchImportTarget[]{SOCCER, RUN, BIKE};
    }

    public static EnumEntries<WatchImportTarget> getEntries() {
        return $ENTRIES;
    }

    private WatchImportTarget(String str, int i) {
    }

    static {
        WatchImportTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static WatchImportTarget valueOf(String str) {
        return (WatchImportTarget) Enum.valueOf(WatchImportTarget.class, str);
    }

    public static WatchImportTarget[] values() {
        return (WatchImportTarget[]) $VALUES.clone();
    }
}
