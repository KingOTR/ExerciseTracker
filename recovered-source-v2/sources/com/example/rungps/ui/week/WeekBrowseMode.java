package com.example.rungps.ui.week;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TrainingWeekScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/example/rungps/ui/week/WeekBrowseMode;", "", "<init>", "(Ljava/lang/String;I)V", "CURRENT", "ARCHIVE", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class WeekBrowseMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WeekBrowseMode[] $VALUES;
    public static final WeekBrowseMode CURRENT = new WeekBrowseMode("CURRENT", 0);
    public static final WeekBrowseMode ARCHIVE = new WeekBrowseMode("ARCHIVE", 1);

    private static final /* synthetic */ WeekBrowseMode[] $values() {
        return new WeekBrowseMode[]{CURRENT, ARCHIVE};
    }

    public static EnumEntries<WeekBrowseMode> getEntries() {
        return $ENTRIES;
    }

    static {
        WeekBrowseMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private WeekBrowseMode(String str, int i) {
    }

    public static WeekBrowseMode valueOf(String str) {
        return (WeekBrowseMode) Enum.valueOf(WeekBrowseMode.class, str);
    }

    public static WeekBrowseMode[] values() {
        return (WeekBrowseMode[]) $VALUES.clone();
    }
}
