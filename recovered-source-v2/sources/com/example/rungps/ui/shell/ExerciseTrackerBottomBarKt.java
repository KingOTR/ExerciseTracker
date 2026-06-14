package com.example.rungps.ui.shell;

import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.NavigationBarDefaults;
import androidx.compose.material3.NavigationBarKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.compose.NavHostControllerKt;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.ui.navigation.MoreDestination;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseTrackerBottomBar.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\f\u0010\n\u001a\u0004\u0018\u00010\u000bX\u008a\u0084\u0002"}, d2 = {"ExerciseTrackerBottomBar", "", "navController", "Landroidx/navigation/NavController;", "onMoreClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/navigation/NavController;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "app_sideload", "entry", "Landroidx/navigation/NavBackStackEntry;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseTrackerBottomBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExerciseTrackerBottomBar$lambda$2(NavController navController, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ExerciseTrackerBottomBar(navController, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c4 A[LOOP:0: B:33:0x00be->B:35:0x00c4, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ExerciseTrackerBottomBar(final NavController navController, final Function0<Unit> onMoreClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        Iterator<E> it;
        Composer composer2;
        NavDestination destination;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(onMoreClick, "onMoreClick");
        Composer startRestartGroup = composer.startRestartGroup(-181763866);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changedInstance(navController) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onMoreClick) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            i4 = i3;
            if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-181763866, i4, -1, "com.example.rungps.ui.shell.ExerciseTrackerBottomBar (ExerciseTrackerBottomBar.kt:28)");
                }
                NavBackStackEntry ExerciseTrackerBottomBar$lambda$0 = ExerciseTrackerBottomBar$lambda$0(NavHostControllerKt.currentBackStackEntryAsState(navController, startRestartGroup, i4 & 14));
                String route = (ExerciseTrackerBottomBar$lambda$0 != null || (destination = ExerciseTrackerBottomBar$lambda$0.getDestination()) == null) ? null : destination.getRoute();
                EnumEntries<MoreDestination> entries = MoreDestination.getEntries();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
                it = entries.iterator();
                while (it.hasNext()) {
                    arrayList.add(((MoreDestination) it.next()).getRoute());
                }
                boolean contains = CollectionsKt.contains(CollectionsKt.toSet(arrayList), route);
                ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                composer2 = startRestartGroup;
                NavigationBarKt.m1956NavigationBarHsRjFd4(modifier3, colorScheme.getSurfaceContainerLow(), 0L, NavigationBarDefaults.INSTANCE.m1941getElevationD9Ej5fM(), null, ComposableLambdaKt.rememberComposableLambda(1378532301, true, new ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1(colorScheme, contains, onMoreClick, route, navController), startRestartGroup, 54), composer2, ((i4 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier3;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.shell.ExerciseTrackerBottomBarKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit ExerciseTrackerBottomBar$lambda$2;
                        ExerciseTrackerBottomBar$lambda$2 = ExerciseTrackerBottomBarKt.ExerciseTrackerBottomBar$lambda$2(NavController.this, onMoreClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return ExerciseTrackerBottomBar$lambda$2;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
        }
        if (i5 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        NavBackStackEntry ExerciseTrackerBottomBar$lambda$02 = ExerciseTrackerBottomBar$lambda$0(NavHostControllerKt.currentBackStackEntryAsState(navController, startRestartGroup, i4 & 14));
        String route2 = (ExerciseTrackerBottomBar$lambda$02 != null || (destination = ExerciseTrackerBottomBar$lambda$02.getDestination()) == null) ? null : destination.getRoute();
        EnumEntries<MoreDestination> entries2 = MoreDestination.getEntries();
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries2, 10));
        it = entries2.iterator();
        while (it.hasNext()) {
        }
        boolean contains2 = CollectionsKt.contains(CollectionsKt.toSet(arrayList2), route2);
        ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        composer2 = startRestartGroup;
        NavigationBarKt.m1956NavigationBarHsRjFd4(modifier3, colorScheme2.getSurfaceContainerLow(), 0L, NavigationBarDefaults.INSTANCE.m1941getElevationD9Ej5fM(), null, ComposableLambdaKt.rememberComposableLambda(1378532301, true, new ExerciseTrackerBottomBarKt$ExerciseTrackerBottomBar$1(colorScheme2, contains2, onMoreClick, route2, navController), startRestartGroup, 54), composer2, ((i4 >> 6) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 20);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier3;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final NavBackStackEntry ExerciseTrackerBottomBar$lambda$0(State<NavBackStackEntry> state) {
        return state.getValue();
    }
}
