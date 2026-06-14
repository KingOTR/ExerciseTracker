package com.example.rungps.navigation;

import com.example.rungps.ui.navigation.MainTab;
import com.example.rungps.ui.navigation.MoreDestination;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppRoutes.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\u0019\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007¨\u0006\u001a"}, d2 = {"Lcom/example/rungps/navigation/AppRoutes;", "", "<init>", "()V", "home", "", "getHome", "()Ljava/lang/String;", "run", "getRun", "gym", "getGym", "history", "getHistory", "recovery", "getRecovery", "settings", "getSettings", "sleep", "getSleep", "week", "getWeek", "isMainTab", "", "route", "isMoreDestination", "app_sideload"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppRoutes {
    public static final int $stable = 0;
    public static final AppRoutes INSTANCE = new AppRoutes();

    private AppRoutes() {
    }

    public final String getHome() {
        return MainTab.Home.getRoute();
    }

    public final String getRun() {
        return MainTab.Run.getRoute();
    }

    public final String getGym() {
        return MainTab.Gym.getRoute();
    }

    public final String getHistory() {
        return MainTab.History.getRoute();
    }

    public final String getRecovery() {
        return MainTab.Recovery.getRoute();
    }

    public final String getSettings() {
        return MoreDestination.Settings.getRoute();
    }

    public final String getSleep() {
        return MoreDestination.Sleep.getRoute();
    }

    public final String getWeek() {
        return MoreDestination.Week.getRoute();
    }

    public final boolean isMainTab(String route) {
        EnumEntries<MainTab> entries = MainTab.getEntries();
        if ((entries instanceof Collection) && entries.isEmpty()) {
            return false;
        }
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((MainTab) it.next()).getRoute(), route)) {
                return true;
            }
        }
        return false;
    }

    public final boolean isMoreDestination(String route) {
        EnumEntries<MoreDestination> entries = MoreDestination.getEntries();
        if ((entries instanceof Collection) && entries.isEmpty()) {
            return false;
        }
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((MoreDestination) it.next()).getRoute(), route)) {
                return true;
            }
        }
        return false;
    }
}
