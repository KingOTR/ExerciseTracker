package com.example.rungps.ui.navigation;

import com.example.rungps.ui.sport.SportTrackingPrefs;
import com.google.android.gms.common.Scopes;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AppDestinations.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, d2 = {"Lcom/example/rungps/ui/navigation/MoreDestination;", "", "route", "", "label", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "getLabel", "Map", "Profile", "Gear", "Settings", "Week", "Coach", "Sleep", SportTrackingPrefs.DEFAULT_NAME, "Diagnostics", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MoreDestination {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MoreDestination[] $VALUES;
    private final String label;
    private final String route;
    public static final MoreDestination Map = new MoreDestination("Map", 0, "map", "Map");
    public static final MoreDestination Profile = new MoreDestination("Profile", 1, Scopes.PROFILE, "Profile");
    public static final MoreDestination Gear = new MoreDestination("Gear", 2, "gear", "My gear");
    public static final MoreDestination Settings = new MoreDestination("Settings", 3, "settings", "App settings");
    public static final MoreDestination Week = new MoreDestination("Week", 4, "week", "Week");
    public static final MoreDestination Coach = new MoreDestination("Coach", 5, "coach", "Coach");
    public static final MoreDestination Sleep = new MoreDestination("Sleep", 6, "sleep", "Sleep");
    public static final MoreDestination Soccer = new MoreDestination(SportTrackingPrefs.DEFAULT_NAME, 7, "soccer", SportTrackingPrefs.DEFAULT_NAME);
    public static final MoreDestination Diagnostics = new MoreDestination("Diagnostics", 8, "diagnostics", "Diagnostics");

    private static final /* synthetic */ MoreDestination[] $values() {
        return new MoreDestination[]{Map, Profile, Gear, Settings, Week, Coach, Sleep, Soccer, Diagnostics};
    }

    public static EnumEntries<MoreDestination> getEntries() {
        return $ENTRIES;
    }

    private MoreDestination(String str, int i, String str2, String str3) {
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
        MoreDestination[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }

    public static MoreDestination valueOf(String str) {
        return (MoreDestination) Enum.valueOf(MoreDestination.class, str);
    }

    public static MoreDestination[] values() {
        return (MoreDestination[]) $VALUES.clone();
    }
}
