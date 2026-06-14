package com.example.rungps.ui.navigation;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppDestinations.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/example/rungps/ui/navigation/MainTab;", "", "route", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "getLabel", "Home", "Run", "Gym", "History", "Recovery", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainTab {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MainTab[] $VALUES;
    private final String label;
    private final String route;
    public static final MainTab Home = new MainTab("Home", 0, "home", "Home");
    public static final MainTab Run = new MainTab("Run", 1, "run", "Run");
    public static final MainTab Gym = new MainTab("Gym", 2, "gym", "Gym");
    public static final MainTab History = new MainTab("History", 3, "history", "History");
    public static final MainTab Recovery = new MainTab("Recovery", 4, "recovery", "Rest");

    private static final /* synthetic */ MainTab[] $values() {
        return new MainTab[]{Home, Run, Gym, History, Recovery};
    }

    public static EnumEntries<MainTab> getEntries() {
        return $ENTRIES;
    }

    private MainTab(String str, int i, String str2, String str3) {
        this.route = str2;
        this.label = str3;
    }

    public final String getRoute() {
        return this.route;
    }

    public final String getLabel() {
        return this.label;
    }

    static {
        MainTab[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static MainTab valueOf(String str) {
        return (MainTab) Enum.valueOf(MainTab.class, str);
    }

    public static MainTab[] values() {
        return (MainTab[]) $VALUES.clone();
    }
}
