package com.example.rungps.ui.components;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MuscleHeatmapView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/example/rungps/ui/components/MuscleHeatmapMode;", "", "<init>", "(Ljava/lang/String;I)V", "Recovery", "Volume", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MuscleHeatmapMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MuscleHeatmapMode[] $VALUES;
    public static final MuscleHeatmapMode Recovery = new MuscleHeatmapMode("Recovery", 0);
    public static final MuscleHeatmapMode Volume = new MuscleHeatmapMode("Volume", 1);

    private static final /* synthetic */ MuscleHeatmapMode[] $values() {
        return new MuscleHeatmapMode[]{Recovery, Volume};
    }

    public static EnumEntries<MuscleHeatmapMode> getEntries() {
        return $ENTRIES;
    }

    static {
        MuscleHeatmapMode[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    private MuscleHeatmapMode(String str, int i) {
    }

    public static MuscleHeatmapMode valueOf(String str) {
        return (MuscleHeatmapMode) Enum.valueOf(MuscleHeatmapMode.class, str);
    }

    public static MuscleHeatmapMode[] values() {
        return (MuscleHeatmapMode[]) $VALUES.clone();
    }
}
