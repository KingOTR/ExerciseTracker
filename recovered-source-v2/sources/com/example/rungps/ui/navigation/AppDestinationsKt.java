package com.example.rungps.ui.navigation;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppDestinations.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001\u001a$\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0004\"\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"routeForNfcTab", "", "tab", "routeUsesFullPane", "", "route", "isRecording", "showingRunDetails", "runDetailRoutes", "", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppDestinationsKt {
    private static final Set<String> runDetailRoutes = SetsKt.setOf((Object[]) new String[]{MainTab.Home.getRoute(), MainTab.Run.getRoute(), MainTab.History.getRoute()});

    public static final String routeForNfcTab(String tab) {
        Intrinsics.checkNotNullParameter(tab, "tab");
        switch (tab.hashCode()) {
            case -799113323:
                return !tab.equals("recovery") ? tab : MainTab.Recovery.getRoute();
            case 102843:
                return !tab.equals("gym") ? tab : MainTab.Gym.getRoute();
            case 107868:
                return !tab.equals("map") ? tab : MoreDestination.Map.getRoute();
            case 113291:
                return !tab.equals("run") ? tab : MainTab.Run.getRoute();
            case 3208415:
                return !tab.equals("home") ? tab : MainTab.Home.getRoute();
            case 109522647:
                return !tab.equals("sleep") ? tab : MoreDestination.Sleep.getRoute();
            default:
                return tab;
        }
    }

    public static /* synthetic */ boolean routeUsesFullPane$default(String str, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        return routeUsesFullPane(str, z, z2);
    }

    public static final boolean routeUsesFullPane(String str, boolean z, boolean z2) {
        return (z2 && CollectionsKt.contains(runDetailRoutes, str)) || (Intrinsics.areEqual(str, MainTab.Run.getRoute()) && z) || Intrinsics.areEqual(str, MoreDestination.Map.getRoute()) || Intrinsics.areEqual(str, MoreDestination.Week.getRoute()) || Intrinsics.areEqual(str, MoreDestination.Coach.getRoute()) || Intrinsics.areEqual(str, MoreDestination.Sleep.getRoute()) || Intrinsics.areEqual(str, MainTab.Home.getRoute());
    }
}
