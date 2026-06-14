package com.example.rungps.ui.shell;

import android.content.Context;
import android.os.PowerManager;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntStateKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavHostController;
import androidx.navigation.NavOptionsBuilder;
import androidx.navigation.Navigator;
import androidx.navigation.PopUpToBuilder;
import androidx.navigation.compose.NavHostControllerKt;
import com.example.rungps.CrashLog;
import com.example.rungps.MainActivity;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.core.domain.ExerciseTrackerUseCases;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.nfc.GymNfcHandler;
import com.example.rungps.notify.InAppAlerts;
import com.example.rungps.notify.PrAlert;
import com.example.rungps.tracking.TrackingState;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.ExerciseTrackerLocalsKt;
import com.example.rungps.ui.components.AppSnackbarKt;
import com.example.rungps.ui.navigation.MainTab;
import com.example.rungps.ui.nfc.GymNfcConfirmDialogKt;
import com.example.rungps.ui.onboarding.OnboardingPrefs;
import com.example.rungps.ui.onboarding.OnboardingWizardKt;
import com.example.rungps.ui.viewmodel.MainViewModel;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AppScreen.kt */
@Metadata(d1 = {"\u0000j\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001aM\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0002\u0010\f¨\u0006\r²\u0006\u0010\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u008a\u0084\u0002²\u0006\u0010\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u000fX\u008a\u0084\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0014X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010\u0017\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u0084\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\n\u0010\u001c\u001a\u00020\u001dX\u008a\u008e\u0002²\u0006\n\u0010\u001e\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002²\u0006\n\u0010\"\u001a\u00020#X\u008a\u008e\u0002²\u0006\u0010\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000fX\u008a\u0084\u0002²\u0006\f\u0010&\u001a\u0004\u0018\u00010'X\u008a\u0084\u0002²\u0006\n\u0010(\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010)\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010+\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\f\u0010,\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u0004\u0018\u00010\u000bX\u008a\u008e\u0002²\u0006\f\u0010/\u001a\u0004\u0018\u00010#X\u008a\u008e\u0002"}, d2 = {"AppScreen", "", "host", "Lcom/example/rungps/ui/shell/AppScreenHost;", "started", "", "onStart", "Lkotlin/Function0;", "onStop", "onExport", "Lkotlin/Function1;", "", "(Lcom/example/rungps/ui/shell/AppScreenHost;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "runs", "", "Lcom/example/rungps/feature/run/RunRow;", "routes", "Lcom/example/rungps/data/RouteEntity;", "live", "Lcom/example/rungps/tracking/TrackingUiState;", "showDeleteAll", "deleteOneId", "photoExportRunId", "showMoreSheet", "navBackStack", "Landroidx/navigation/NavBackStackEntry;", "focusGymSessionId", "handledConfirmSeq", "", "showOnboarding", "showCalendarNudge", "bleStatus", "Lcom/example/rungps/ble/BleStatus;", "bleAddr", "", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "gymLoad", "Lcom/example/rungps/data/GymLoadStats;", "prevAutoPaused", "showConfirmStart", "showPowerSaveWarning", "pendingStart", "selectedRunId", "lastOpenedFinishedId", "followRouteId", "followRouteName"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$108(AppScreenHost appScreenHost, boolean z, Function0 function0, Function0 function02, Function1 function1, int i, Composer composer, int i2) {
        AppScreen(appScreenHost, z, function0, function02, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04f8  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x05e6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x082e  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0908  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0941  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x09a1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x09d0  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x0aa4  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x0ace  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x0cb9  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x0c28  */
    /* JADX WARN: Removed duplicated region for block: B:315:0x05da  */
    /* JADX WARN: Type inference failed for: r0v7, types: [androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner] */
    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.compose.runtime.Composer] */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.coroutines.Continuation, kotlin.coroutines.CoroutineContext] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppScreen(final AppScreenHost host, final boolean z, final Function0<Unit> onStart, final Function0<Unit> onStop, final Function1<? super Long, Unit> onExport, Composer composer, final int i) {
        int i2;
        CreationExtras.Empty empty;
        String route;
        Integer num;
        State state;
        final Context context;
        int i3;
        boolean z2;
        int i4;
        MutableState mutableState;
        final Context context2;
        State state2;
        MainViewModel mainViewModel;
        final PrAlert pendingPr;
        boolean changed;
        AppScreenKt$AppScreen$7$1 rememberedValue;
        Object obj;
        Object rememberedValue2;
        final MutableState mutableState2;
        boolean changed2;
        AppScreenKt$AppScreen$8$1 rememberedValue3;
        boolean z3;
        boolean changed3;
        Object rememberedValue4;
        boolean changedInstance;
        Object rememberedValue5;
        boolean z4;
        AppScreenKt$AppScreen$16$1 rememberedValue6;
        boolean changedInstance2;
        Object rememberedValue7;
        boolean changed4;
        Object rememberedValue8;
        BleClient bleClient;
        boolean changedInstance3;
        Object rememberedValue9;
        boolean changed5;
        Object rememberedValue10;
        boolean changedInstance4;
        AppScreenKt$AppScreen$18$1 rememberedValue11;
        Object rememberedValue12;
        State state3;
        boolean changedInstance5;
        AppScreenKt$AppScreen$19$1 rememberedValue13;
        boolean changed6;
        AppScreenKt$AppScreen$20$1 rememberedValue14;
        Object rememberedValue15;
        Object rememberedValue16;
        Object rememberedValue17;
        Object rememberedValue18;
        MutableState mutableState3;
        Object rememberedValue19;
        boolean changed7;
        AppScreenKt$AppScreen$21$1 rememberedValue20;
        boolean changedInstance6;
        AppScreenKt$AppScreen$22$1 rememberedValue21;
        boolean changed8;
        Object rememberedValue22;
        Object rememberedValue23;
        SnackbarHostState snackbarHostState;
        Object rememberedValue24;
        boolean changedInstance7;
        AppScreenKt$AppScreen$24$1 rememberedValue25;
        boolean changed9;
        Object rememberedValue26;
        Object value;
        Composer composer2;
        String str;
        NavDestination destination;
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        Intrinsics.checkNotNullParameter(onExport, "onExport");
        ?? startRestartGroup = composer.startRestartGroup(1863385840);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? startRestartGroup.changed(host) : startRestartGroup.changedInstance(host) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onStart) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onStop) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(onExport) ? 16384 : 8192;
        }
        int i5 = i2;
        if ((i5 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1863385840, i5, -1, "com.example.rungps.ui.shell.AppScreen (AppScreen.kt:83)");
            }
            startRestartGroup.startReplaceableGroup(1729797275);
            ComposerKt.sourceInformation(startRestartGroup, "CC(viewModel)P(3,2,1)*54@2502L7,64@2877L63:ViewModel.kt#3tja67");
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
            }
            if (current instanceof HasDefaultViewModelProviderFactory) {
                empty = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
            } else {
                empty = CreationExtras.Empty.INSTANCE;
            }
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(MainViewModel.class), current, (String) null, (ViewModelProvider.Factory) null, empty, (Composer) startRestartGroup, 0, 0);
            startRestartGroup.endReplaceableGroup();
            MainViewModel mainViewModel2 = (MainViewModel) viewModel;
            RunsViewModel runs = mainViewModel2.getRuns();
            SnapshotStateKt.collectAsState(runs.getRuns(), null, startRestartGroup, 0, 1);
            State collectAsState = SnapshotStateKt.collectAsState(runs.getRoutes(), null, startRestartGroup, 0, 1);
            State collectAsState2 = SnapshotStateKt.collectAsState(TrackingState.INSTANCE.getState(), null, startRestartGroup, 0, 1);
            Object[] objArr = new Object[0];
            startRestartGroup.startReplaceGroup(1827940908);
            Object rememberedValue27 = startRestartGroup.rememberedValue();
            if (rememberedValue27 == Composer.INSTANCE.getEmpty()) {
                rememberedValue27 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda21
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState AppScreen$lambda$4$lambda$3;
                        AppScreen$lambda$4$lambda$3 = AppScreenKt.AppScreen$lambda$4$lambda$3();
                        return AppScreen$lambda$4$lambda$3;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue27);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState4 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr, (Saver) null, (String) null, (Function0) rememberedValue27, (Composer) startRestartGroup, 3072, 6);
            Object[] objArr2 = new Object[0];
            startRestartGroup.startReplaceGroup(1827943026);
            Object rememberedValue28 = startRestartGroup.rememberedValue();
            if (rememberedValue28 == Composer.INSTANCE.getEmpty()) {
                rememberedValue28 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState AppScreen$lambda$8$lambda$7;
                        AppScreen$lambda$8$lambda$7 = AppScreenKt.AppScreen$lambda$8$lambda$7();
                        return AppScreen$lambda$8$lambda$7;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue28);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState5 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) rememberedValue28, (Composer) startRestartGroup, 3072, 6);
            Object[] objArr3 = new Object[0];
            startRestartGroup.startReplaceGroup(1827945490);
            Object rememberedValue29 = startRestartGroup.rememberedValue();
            if (rememberedValue29 == Composer.INSTANCE.getEmpty()) {
                rememberedValue29 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState AppScreen$lambda$12$lambda$11;
                        AppScreen$lambda$12$lambda$11 = AppScreenKt.AppScreen$lambda$12$lambda$11();
                        return AppScreen$lambda$12$lambda$11;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue29);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState6 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) rememberedValue29, (Composer) startRestartGroup, 3072, 6);
            final NavHostController rememberNavController = NavHostControllerKt.rememberNavController(new Navigator[0], startRestartGroup, 0);
            Object[] objArr4 = new Object[0];
            startRestartGroup.startReplaceGroup(1827949388);
            Object rememberedValue30 = startRestartGroup.rememberedValue();
            if (rememberedValue30 == Composer.INSTANCE.getEmpty()) {
                rememberedValue30 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState AppScreen$lambda$16$lambda$15;
                        AppScreen$lambda$16$lambda$15 = AppScreenKt.AppScreen$lambda$16$lambda$15();
                        return AppScreen$lambda$16$lambda$15;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue30);
            }
            startRestartGroup.endReplaceGroup();
            final MutableState mutableState7 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) rememberedValue30, (Composer) startRestartGroup, 3072, 6);
            NavHostController navHostController = rememberNavController;
            NavBackStackEntry AppScreen$lambda$19 = AppScreen$lambda$19(NavHostControllerKt.currentBackStackEntryAsState(navHostController, startRestartGroup, 0));
            if (AppScreen$lambda$19 == null || (destination = AppScreen$lambda$19.getDestination()) == null || (route = destination.getRoute()) == null) {
                route = MainTab.Home.getRoute();
            }
            String str2 = route;
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context3 = (Context) consume;
            MainActivity mainActivity = context3 instanceof MainActivity ? (MainActivity) context3 : null;
            int pulse = host.getGymNfc().getPulse();
            int confirmSeq = host.getGymNfc().getConfirmSeq();
            String prompt = host.getGymNfc().getPrompt();
            Object[] objArr5 = new Object[0];
            startRestartGroup.startReplaceGroup(1827971250);
            Object rememberedValue31 = startRestartGroup.rememberedValue();
            if (rememberedValue31 == Composer.INSTANCE.getEmpty()) {
                rememberedValue31 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda15
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState AppScreen$lambda$23$lambda$22;
                        AppScreen$lambda$23$lambda$22 = AppScreenKt.AppScreen$lambda$23$lambda$22();
                        return AppScreen$lambda$23$lambda$22;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue31);
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState8 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) rememberedValue31, (Composer) startRestartGroup, 3072, 6);
            Unit unit = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(1827973607);
            boolean changedInstance8 = startRestartGroup.changedInstance(context3) | startRestartGroup.changed(mutableState8) | startRestartGroup.changedInstance(rememberNavController) | startRestartGroup.changed(collectAsState2);
            AppScreenKt$AppScreen$1$1 rememberedValue32 = startRestartGroup.rememberedValue();
            if (changedInstance8 || rememberedValue32 == Composer.INSTANCE.getEmpty()) {
                rememberedValue32 = new AppScreenKt$AppScreen$1$1(context3, mutableState8, rememberNavController, collectAsState2, null);
                startRestartGroup.updateRememberedValue(rememberedValue32);
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue32, (Composer) startRestartGroup, 6);
            Integer valueOf = Integer.valueOf(pulse);
            startRestartGroup.startReplaceGroup(1827992267);
            boolean changed10 = startRestartGroup.changed(pulse) | startRestartGroup.changedInstance(context3) | startRestartGroup.changedInstance(rememberNavController) | startRestartGroup.changed(mutableState8);
            AppScreenKt$AppScreen$2$1 rememberedValue33 = startRestartGroup.rememberedValue();
            if (changed10 || rememberedValue33 == Composer.INSTANCE.getEmpty()) {
                num = valueOf;
                state = collectAsState2;
                context = context3;
                rememberedValue33 = new AppScreenKt$AppScreen$2$1(pulse, context3, rememberNavController, mutableState8, null);
                startRestartGroup.updateRememberedValue(rememberedValue33);
            } else {
                num = valueOf;
                state = collectAsState2;
                context = context3;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(num, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue33, (Composer) startRestartGroup, 0);
            Object[] objArr6 = new Object[0];
            startRestartGroup.startReplaceGroup(1828000491);
            Object rememberedValue34 = startRestartGroup.rememberedValue();
            if (rememberedValue34 == Composer.INSTANCE.getEmpty()) {
                rememberedValue34 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableIntState AppScreen$lambda$29$lambda$28;
                        AppScreen$lambda$29$lambda$28 = AppScreenKt.AppScreen$lambda$29$lambda$28();
                        return AppScreen$lambda$29$lambda$28;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue34);
            }
            startRestartGroup.endReplaceGroup();
            final MutableIntState mutableIntState = (MutableIntState) RememberSaveableKt.m3429rememberSaveable(objArr6, (Saver) null, (String) null, (Function0) rememberedValue34, (Composer) startRestartGroup, 3072, 6);
            Object[] objArr7 = new Object[0];
            startRestartGroup.startReplaceGroup(1828002691);
            boolean changedInstance9 = startRestartGroup.changedInstance(context);
            Object rememberedValue35 = startRestartGroup.rememberedValue();
            if (changedInstance9 || rememberedValue35 == Composer.INSTANCE.getEmpty()) {
                rememberedValue35 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda17
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        MutableState AppScreen$lambda$33$lambda$32;
                        AppScreen$lambda$33$lambda$32 = AppScreenKt.AppScreen$lambda$33$lambda$32(context);
                        return AppScreen$lambda$33$lambda$32;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue35);
            }
            startRestartGroup.endReplaceGroup();
            final MutableState mutableState9 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr7, (Saver) null, (String) null, (Function0) rememberedValue35, (Composer) startRestartGroup, 0, 6);
            if (prompt != null) {
                i3 = confirmSeq;
                if (i3 > AppScreen$lambda$30(mutableIntState)) {
                    z2 = true;
                    startRestartGroup.startReplaceGroup(1828007589);
                    if (AppScreen$lambda$34(mutableState9) || z2) {
                        i4 = i3;
                        mutableState = mutableState9;
                        context2 = context;
                        state2 = state;
                        mainViewModel = mainViewModel2;
                    } else {
                        startRestartGroup.startReplaceGroup(1828010022);
                        boolean changedInstance10 = startRestartGroup.changedInstance(context) | startRestartGroup.changedInstance(rememberNavController) | startRestartGroup.changed(mutableState9);
                        Object rememberedValue36 = startRestartGroup.rememberedValue();
                        if (changedInstance10 || rememberedValue36 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue36 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda18
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AppScreen$lambda$37$lambda$36;
                                    AppScreen$lambda$37$lambda$36 = AppScreenKt.AppScreen$lambda$37$lambda$36(context, rememberNavController, mutableState9);
                                    return AppScreen$lambda$37$lambda$36;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue36);
                        }
                        Function0 function0 = (Function0) rememberedValue36;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1828013527);
                        boolean changed11 = startRestartGroup.changed(mutableState9) | startRestartGroup.changedInstance(context);
                        Object rememberedValue37 = startRestartGroup.rememberedValue();
                        if (changed11 || rememberedValue37 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue37 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda19
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AppScreen$lambda$39$lambda$38;
                                    AppScreen$lambda$39$lambda$38 = AppScreenKt.AppScreen$lambda$39$lambda$38(context, mutableState9);
                                    return AppScreen$lambda$39$lambda$38;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue37);
                        }
                        Function0 function02 = (Function0) rememberedValue37;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1828018081);
                        int i6 = i5 & 14;
                        boolean z5 = i6 == 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(host));
                        Object rememberedValue38 = startRestartGroup.rememberedValue();
                        if (z5 || rememberedValue38 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue38 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda20
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AppScreen$lambda$41$lambda$40;
                                    AppScreen$lambda$41$lambda$40 = AppScreenKt.AppScreen$lambda$41$lambda$40(AppScreenHost.this);
                                    return AppScreen$lambda$41$lambda$40;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue38);
                        }
                        Function0 function03 = (Function0) rememberedValue38;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1828020796);
                        boolean z6 = i6 == 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(host));
                        Object rememberedValue39 = startRestartGroup.rememberedValue();
                        if (z6 || rememberedValue39 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue39 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda22
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AppScreen$lambda$43$lambda$42;
                                    AppScreen$lambda$43$lambda$42 = AppScreenKt.AppScreen$lambda$43$lambda$42(AppScreenHost.this);
                                    return AppScreen$lambda$43$lambda$42;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue39);
                        }
                        startRestartGroup.endReplaceGroup();
                        i4 = i3;
                        mutableState = mutableState9;
                        context2 = context;
                        state2 = state;
                        mainViewModel = mainViewModel2;
                        OnboardingWizardKt.OnboardingWizard(function0, function02, function03, (Function0) rememberedValue39, host.getOnboardingRuntimeStatusLine(), host.getOnboardingHealthStatusLine(), startRestartGroup, 0);
                    }
                    startRestartGroup.endReplaceGroup();
                    pendingPr = InAppAlerts.INSTANCE.getPendingPr();
                    startRestartGroup.startReplaceGroup(1828029292);
                    changed = startRestartGroup.changed(pendingPr) | startRestartGroup.changedInstance(context2);
                    rememberedValue = startRestartGroup.rememberedValue();
                    if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        obj = null;
                        rememberedValue = new AppScreenKt$AppScreen$7$1(pendingPr, context2, null);
                        startRestartGroup.updateRememberedValue(rememberedValue);
                    } else {
                        obj = null;
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(pendingPr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, (Composer) startRestartGroup, 0);
                    Object[] objArr8 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828033580);
                    rememberedValue2 = startRestartGroup.rememberedValue();
                    if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda23
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$46$lambda$45;
                                AppScreen$lambda$46$lambda$45 = AppScreenKt.AppScreen$lambda$46$lambda$45();
                                return AppScreen$lambda$46$lambda$45;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue2);
                    }
                    startRestartGroup.endReplaceGroup();
                    ?? r12 = obj;
                    mutableState2 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr8, (Saver) null, (String) null, (Function0) rememberedValue2, (Composer) startRestartGroup, 3072, 6);
                    Boolean valueOf2 = Boolean.valueOf(AppScreen$lambda$34(mutableState));
                    startRestartGroup.startReplaceGroup(1828035804);
                    MutableState mutableState10 = mutableState;
                    changed2 = startRestartGroup.changed(mutableState10) | startRestartGroup.changedInstance(context2) | startRestartGroup.changed(mutableState2);
                    rememberedValue3 = startRestartGroup.rememberedValue();
                    if (!changed2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue3 = new AppScreenKt$AppScreen$8$1(context2, mutableState10, mutableState2, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue3);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, (Composer) startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(1828045921);
                    if (AppScreen$lambda$47(mutableState2)) {
                        z3 = true;
                    } else {
                        startRestartGroup.startReplaceGroup(1828047664);
                        boolean changed12 = startRestartGroup.changed(mutableState2);
                        Object rememberedValue40 = startRestartGroup.rememberedValue();
                        if (changed12 || rememberedValue40 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue40 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda24
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AppScreen$lambda$51$lambda$50;
                                    AppScreen$lambda$51$lambda$50 = AppScreenKt.AppScreen$lambda$51$lambda$50(MutableState.this);
                                    return AppScreen$lambda$51$lambda$50;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue40);
                        }
                        startRestartGroup.endReplaceGroup();
                        z3 = true;
                        AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue40, ComposableLambdaKt.rememberComposableLambda(1260766246, true, new AppScreenKt$AppScreen$10(mutableState2, context2), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1587620184, true, new AppScreenKt$AppScreen$11(mutableState2), startRestartGroup, 54), null, ComposableSingletons$AppScreenKt.INSTANCE.m7472getLambda3$app_sideload(), ComposableSingletons$AppScreenKt.INSTANCE.m7473getLambda4$app_sideload(), null, 0L, 0L, 0L, 0L, 0.0f, null, startRestartGroup, 1772592, 0, 16276);
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1828070031);
                    if (pendingPr != null) {
                        startRestartGroup.startReplaceGroup(1828071756);
                        Object rememberedValue41 = startRestartGroup.rememberedValue();
                        if (rememberedValue41 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue41 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda25
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit AppScreen$lambda$53$lambda$52;
                                    AppScreen$lambda$53$lambda$52 = AppScreenKt.AppScreen$lambda$53$lambda$52();
                                    return AppScreen$lambda$53$lambda$52;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue41);
                        }
                        startRestartGroup.endReplaceGroup();
                        AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue41, ComposableSingletons$AppScreenKt.INSTANCE.m7475getLambda6$app_sideload(), null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7476getLambda7$app_sideload(), ComposableLambdaKt.rememberComposableLambda(1704530314, z3, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$13
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                invoke(composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i7) {
                                if ((i7 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1704530314, i7, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous> (AppScreen.kt:186)");
                                    }
                                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                    Locale locale = Locale.US;
                                    String exerciseName = PrAlert.this.getExerciseName();
                                    Double valueOf3 = Double.valueOf(PrAlert.this.getWeightKg());
                                    Integer reps = PrAlert.this.getReps();
                                    String format = String.format(locale, "%s — %.1f kg × %d\nEstimated 1RM: %.1f kg", Arrays.copyOf(new Object[]{exerciseName, valueOf3, Integer.valueOf(reps != null ? reps.intValue() : 1), Double.valueOf(PrAlert.this.getE1rm())}, 4));
                                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                                    TextKt.m2376Text4IGK_g(format, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, startRestartGroup, 1769526, 0, 16284);
                    }
                    startRestartGroup.endReplaceGroup();
                    int AppScreen$lambda$30 = AppScreen$lambda$30(mutableIntState);
                    startRestartGroup.startReplaceGroup(1828096877);
                    changed3 = startRestartGroup.changed(mutableIntState);
                    rememberedValue4 = startRestartGroup.rememberedValue();
                    if (!changed3 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda26
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                Unit AppScreen$lambda$55$lambda$54;
                                AppScreen$lambda$55$lambda$54 = AppScreenKt.AppScreen$lambda$55$lambda$54(MutableIntState.this, ((Integer) obj2).intValue());
                                return AppScreen$lambda$55$lambda$54;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue4);
                    }
                    Function1 function1 = (Function1) rememberedValue4;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1828098615);
                    int i7 = i5 & 14;
                    changedInstance = ((i7 != 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(host))) ? z3 : false) | startRestartGroup.changedInstance(context2);
                    rememberedValue5 = startRestartGroup.rememberedValue();
                    if (!changedInstance || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda27
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit AppScreen$lambda$57$lambda$56;
                                AppScreen$lambda$57$lambda$56 = AppScreenKt.AppScreen$lambda$57$lambda$56(AppScreenHost.this, context2);
                                return AppScreen$lambda$57$lambda$56;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function04 = (Function0) rememberedValue5;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1828102776);
                    z4 = i7 != 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(host));
                    rememberedValue6 = startRestartGroup.rememberedValue();
                    if (!z4 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new AppScreenKt$AppScreen$16$1(host, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue6);
                    }
                    Function1 function12 = (Function1) rememberedValue6;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1828104711);
                    changedInstance2 = (i7 != 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(host))) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(rememberNavController);
                    rememberedValue7 = startRestartGroup.rememberedValue();
                    if (!changedInstance2 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda28
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit AppScreen$lambda$60$lambda$59;
                                AppScreen$lambda$60$lambda$59 = AppScreenKt.AppScreen$lambda$60$lambda$59(AppScreenHost.this, context2, rememberNavController);
                                return AppScreen$lambda$60$lambda$59;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue7);
                    }
                    startRestartGroup.endReplaceGroup();
                    GymNfcConfirmDialogKt.GymNfcConfirmDialog(i4, prompt, AppScreen$lambda$30, function1, function04, function12, (Function0) rememberedValue7, startRestartGroup, 0);
                    PowerManager powerManager = (PowerManager) context2.getSystemService(PowerManager.class);
                    boolean z7 = powerManager == null && powerManager.isPowerSaveMode();
                    startRestartGroup.startReplaceGroup(1828111622);
                    changed4 = startRestartGroup.changed(context2);
                    rememberedValue8 = startRestartGroup.rememberedValue();
                    if (!changed4 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                        Context applicationContext = context2.getApplicationContext();
                        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                        rememberedValue8 = new BleClient(applicationContext);
                        startRestartGroup.updateRememberedValue(rememberedValue8);
                    }
                    bleClient = (BleClient) rememberedValue8;
                    startRestartGroup.endReplaceGroup();
                    State collectAsState3 = SnapshotStateKt.collectAsState(bleClient.getStatus(), r12, startRestartGroup, 0, 1);
                    Object[] objArr9 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828116087);
                    changedInstance3 = startRestartGroup.changedInstance(context2);
                    rememberedValue9 = startRestartGroup.rememberedValue();
                    if (!changedInstance3 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue9 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$64$lambda$63;
                                AppScreen$lambda$64$lambda$63 = AppScreenKt.AppScreen$lambda$64$lambda$63(context2);
                                return AppScreen$lambda$64$lambda$63;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue9);
                    }
                    startRestartGroup.endReplaceGroup();
                    MutableState mutableState11 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr9, (Saver) null, (String) null, (Function0) rememberedValue9, (Composer) startRestartGroup, 0, 6);
                    State collectAsState4 = SnapshotStateKt.collectAsState(mainViewModel.getGymSessions(), r12, startRestartGroup, 0, 1);
                    startRestartGroup.startReplaceGroup(1828122756);
                    changed5 = startRestartGroup.changed(context2);
                    rememberedValue10 = startRestartGroup.rememberedValue();
                    if (!changed5 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue10 = mainViewModel.getRepository().gymLoadFlow();
                        startRestartGroup.updateRememberedValue(rememberedValue10);
                    }
                    startRestartGroup.endReplaceGroup();
                    State collectAsState5 = SnapshotStateKt.collectAsState((Flow) rememberedValue10, null, null, startRestartGroup, 48, 2);
                    List<GymSessionEntity> AppScreen$lambda$67 = AppScreen$lambda$67(collectAsState4);
                    startRestartGroup.startReplaceGroup(1828126501);
                    changedInstance4 = startRestartGroup.changedInstance(context2);
                    rememberedValue11 = startRestartGroup.rememberedValue();
                    if (!changedInstance4 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue11 = new AppScreenKt$AppScreen$18$1(context2, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue11);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(AppScreen$lambda$67, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue11, (Composer) startRestartGroup, 0);
                    Object[] objArr10 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828135020);
                    rememberedValue12 = startRestartGroup.rememberedValue();
                    if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$72$lambda$71;
                                AppScreen$lambda$72$lambda$71 = AppScreenKt.AppScreen$lambda$72$lambda$71();
                                return AppScreen$lambda$72$lambda$71;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue12);
                    }
                    startRestartGroup.endReplaceGroup();
                    MutableState mutableState12 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr10, (Saver) null, (String) null, (Function0) rememberedValue12, (Composer) startRestartGroup, 3072, 6);
                    Boolean valueOf3 = Boolean.valueOf(AppScreen$lambda$2(state2).isRecording());
                    startRestartGroup.startReplaceGroup(1828137239);
                    state3 = state2;
                    changedInstance5 = startRestartGroup.changedInstance(bleClient) | startRestartGroup.changed(state3) | startRestartGroup.changed(str2) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(rememberNavController);
                    rememberedValue13 = startRestartGroup.rememberedValue();
                    if (!changedInstance5 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue13 = new AppScreenKt$AppScreen$19$1(bleClient, str2, state3, context2, rememberNavController, null);
                        startRestartGroup.updateRememberedValue(rememberedValue13);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue13, (Composer) startRestartGroup, 0);
                    Boolean valueOf4 = Boolean.valueOf(AppScreen$lambda$2(state3).isRecording());
                    Boolean valueOf5 = Boolean.valueOf(AppScreen$lambda$2(state3).isAutoPaused());
                    startRestartGroup.startReplaceGroup(1828146537);
                    changed6 = startRestartGroup.changed(state3) | startRestartGroup.changed(mutableState12) | startRestartGroup.changedInstance(context2);
                    rememberedValue14 = startRestartGroup.rememberedValue();
                    if (!changed6 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue14 = new AppScreenKt$AppScreen$20$1(context2, state3, mutableState12, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue14);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(valueOf4, valueOf5, (Function2) rememberedValue14, startRestartGroup, 0);
                    Object[] objArr11 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828160652);
                    rememberedValue15 = startRestartGroup.rememberedValue();
                    if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue15 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$78$lambda$77;
                                AppScreen$lambda$78$lambda$77 = AppScreenKt.AppScreen$lambda$78$lambda$77();
                                return AppScreen$lambda$78$lambda$77;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue15);
                    }
                    startRestartGroup.endReplaceGroup();
                    MutableState mutableState13 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr11, (Saver) null, (String) null, (Function0) rememberedValue15, (Composer) startRestartGroup, 3072, 6);
                    Object[] objArr12 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828163052);
                    rememberedValue16 = startRestartGroup.rememberedValue();
                    if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue16 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$82$lambda$81;
                                AppScreen$lambda$82$lambda$81 = AppScreenKt.AppScreen$lambda$82$lambda$81();
                                return AppScreen$lambda$82$lambda$81;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue16);
                    }
                    startRestartGroup.endReplaceGroup();
                    MutableState mutableState14 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr12, (Saver) null, (String) null, (Function0) rememberedValue16, (Composer) startRestartGroup, 3072, 6);
                    Object[] objArr13 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828165196);
                    rememberedValue17 = startRestartGroup.rememberedValue();
                    if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue17 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$86$lambda$85;
                                AppScreen$lambda$86$lambda$85 = AppScreenKt.AppScreen$lambda$86$lambda$85();
                                return AppScreen$lambda$86$lambda$85;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue17);
                    }
                    startRestartGroup.endReplaceGroup();
                    MutableState mutableState15 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr13, (Saver) null, (String) null, (Function0) rememberedValue17, (Composer) startRestartGroup, 3072, 6);
                    Object[] objArr14 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828167378);
                    rememberedValue18 = startRestartGroup.rememberedValue();
                    if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue18 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$90$lambda$89;
                                AppScreen$lambda$90$lambda$89 = AppScreenKt.AppScreen$lambda$90$lambda$89();
                                return AppScreen$lambda$90$lambda$89;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue18);
                    }
                    startRestartGroup.endReplaceGroup();
                    mutableState3 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr14, (Saver) null, (String) null, (Function0) rememberedValue18, (Composer) startRestartGroup, 3072, 6);
                    Object[] objArr15 = new Object[0];
                    startRestartGroup.startReplaceGroup(1828172146);
                    rememberedValue19 = startRestartGroup.rememberedValue();
                    if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue19 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                MutableState AppScreen$lambda$94$lambda$93;
                                AppScreen$lambda$94$lambda$93 = AppScreenKt.AppScreen$lambda$94$lambda$93();
                                return AppScreen$lambda$94$lambda$93;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue19);
                    }
                    startRestartGroup.endReplaceGroup();
                    MutableState mutableState16 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr15, (Saver) null, (String) null, (Function0) rememberedValue19, (Composer) startRestartGroup, 3072, 6);
                    Long lastFinishedRunId = AppScreen$lambda$2(state3).getLastFinishedRunId();
                    startRestartGroup.startReplaceGroup(1828174710);
                    changed7 = startRestartGroup.changed(state3) | startRestartGroup.changed(mutableState16) | startRestartGroup.changed(mutableState3);
                    rememberedValue20 = startRestartGroup.rememberedValue();
                    if (!changed7 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue20 = new AppScreenKt$AppScreen$21$1(state3, mutableState16, mutableState3, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue20);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(lastFinishedRunId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue20, (Composer) startRestartGroup, 0);
                    Unit unit2 = Unit.INSTANCE;
                    startRestartGroup.startReplaceGroup(1828183465);
                    changedInstance6 = startRestartGroup.changedInstance(runs) | startRestartGroup.changedInstance(context2);
                    rememberedValue21 = startRestartGroup.rememberedValue();
                    if (!changedInstance6 || rememberedValue21 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue21 = new AppScreenKt$AppScreen$22$1(runs, context2, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue21);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue21, (Composer) startRestartGroup, 6);
                    boolean AppScreen$lambda$17 = AppScreen$lambda$17(mutableState7);
                    startRestartGroup.startReplaceGroup(1828191020);
                    changed8 = startRestartGroup.changed(mutableState7);
                    rememberedValue22 = startRestartGroup.rememberedValue();
                    if (!changed8 || rememberedValue22 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue22 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit AppScreen$lambda$100$lambda$99;
                                AppScreen$lambda$100$lambda$99 = AppScreenKt.AppScreen$lambda$100$lambda$99(MutableState.this);
                                return AppScreen$lambda$100$lambda$99;
                            }
                        };
                        startRestartGroup.updateRememberedValue(rememberedValue22);
                    }
                    startRestartGroup.endReplaceGroup();
                    MoreDestinationsSheetKt.MoreDestinationsSheet(AppScreen$lambda$17, navHostController, (Function0) rememberedValue22, startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(1828193011);
                    rememberedValue23 = startRestartGroup.rememberedValue();
                    if (rememberedValue23 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue23 = new SnackbarHostState();
                        startRestartGroup.updateRememberedValue(rememberedValue23);
                    }
                    snackbarHostState = (SnackbarHostState) rememberedValue23;
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
                    rememberedValue24 = startRestartGroup.rememberedValue();
                    if (rememberedValue24 == Composer.INSTANCE.getEmpty()) {
                        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                        startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                        rememberedValue24 = compositionScopedCoroutineScopeCanceller;
                    }
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    CoroutineScope coroutineScope = ((CompositionScopedCoroutineScopeCanceller) rememberedValue24).getCoroutineScope();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.startReplaceGroup(1828196530);
                    changedInstance7 = startRestartGroup.changedInstance(runs) | startRestartGroup.changedInstance(coroutineScope);
                    rememberedValue25 = startRestartGroup.rememberedValue();
                    if (!changedInstance7 || rememberedValue25 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue25 = new AppScreenKt$AppScreen$24$1(runs, coroutineScope, snackbarHostState, r12);
                        startRestartGroup.updateRememberedValue(rememberedValue25);
                    }
                    startRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(runs, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue25, (Composer) startRestartGroup, 0);
                    startRestartGroup.startReplaceGroup(1828203327);
                    MainViewModel mainViewModel3 = mainViewModel;
                    changed9 = startRestartGroup.changed(mainViewModel3);
                    rememberedValue26 = startRestartGroup.rememberedValue();
                    if (!changed9 || rememberedValue26 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue26 = Result.m7904boximpl(mainViewModel3.m7662useCasesResultd1pmJ48());
                        startRestartGroup.updateRememberedValue(rememberedValue26);
                    }
                    value = ((Result) rememberedValue26).getValue();
                    startRestartGroup.endReplaceGroup();
                    if (!Result.m7911isFailureimpl(value)) {
                        startRestartGroup.startReplaceGroup(839841255);
                        Throwable m7908exceptionOrNullimpl = Result.m7908exceptionOrNullimpl(value);
                        startRestartGroup.startReplaceGroup(1828208363);
                        boolean changed13 = startRestartGroup.changed(m7908exceptionOrNullimpl);
                        String rememberedValue42 = startRestartGroup.rememberedValue();
                        if (changed13 || rememberedValue42 == Composer.INSTANCE.getEmpty()) {
                            StringWriter stringWriter = new StringWriter();
                            if (m7908exceptionOrNullimpl != null) {
                                m7908exceptionOrNullimpl.printStackTrace(new PrintWriter(stringWriter));
                                Unit unit3 = Unit.INSTANCE;
                            }
                            String stringWriter2 = stringWriter.toString();
                            if (StringsKt.isBlank(stringWriter2)) {
                                if (m7908exceptionOrNullimpl == null || (str = m7908exceptionOrNullimpl.getMessage()) == null) {
                                    str = "Unknown error creating app graph";
                                }
                                stringWriter2 = str;
                            }
                            rememberedValue42 = stringWriter2;
                            startRestartGroup.updateRememberedValue(rememberedValue42);
                        }
                        final String str3 = (String) rememberedValue42;
                        startRestartGroup.endReplaceGroup();
                        Intrinsics.checkNotNull(str3);
                        startRestartGroup.startReplaceGroup(1828216791);
                        Object rememberedValue43 = startRestartGroup.rememberedValue();
                        if (rememberedValue43 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue43 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit unit4;
                                    unit4 = Unit.INSTANCE;
                                    return unit4;
                                }
                            };
                            startRestartGroup.updateRememberedValue(rememberedValue43);
                        }
                        startRestartGroup.endReplaceGroup();
                        AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue43, ComposableLambdaKt.rememberComposableLambda(-789642652, true, new AppScreenKt$AppScreen$26(context2, str3), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(656938214, true, new AppScreenKt$AppScreen$27(host), startRestartGroup, 54), null, ComposableSingletons$AppScreenKt.INSTANCE.m7457getLambda10$app_sideload(), ComposableLambdaKt.rememberComposableLambda(-1468157783, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$28
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num2) {
                                invoke(composer3, num2.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) != 2 || !composer3.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1468157783, i8, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous> (AppScreen.kt:308)");
                                    }
                                    TextKt.m2376Text4IGK_g(StringsKt.trim((CharSequence) str3).toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65534);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer3.skipToGroupEnd();
                            }
                        }, startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, startRestartGroup, 1772598, 0, 16276);
                        startRestartGroup.endReplaceGroup();
                        composer2 = startRestartGroup;
                    } else {
                        startRestartGroup.startReplaceGroup(841253894);
                        ResultKt.throwOnFailure(value);
                        ProvidedValue[] providedValueArr = {ExerciseTrackerLocalsKt.getLocalExerciseTrackerUseCases().provides((ExerciseTrackerUseCases) value), AppSnackbarKt.getLocalAppSnackbar().provides(snackbarHostState)};
                        AppScreenKt$AppScreen$29 appScreenKt$AppScreen$29 = new AppScreenKt$AppScreen$29(mutableState4, mutableState5, host, mutableState13, mutableState14, mutableState15, context2, mainActivity, rememberNavController, mutableState7, snackbarHostState, state3, mutableState3, mutableState8, collectAsState, collectAsState3, collectAsState4, mutableState11, collectAsState5, onExport, mutableState6, runs, z, onStart, onStop, bleClient, z7);
                        composer2 = startRestartGroup;
                        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) providedValueArr, ComposableLambdaKt.rememberComposableLambda(-2041639245, true, appScreenKt$AppScreen$29, composer2, 54), composer2, ProvidedValue.$stable | 48);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                i3 = confirmSeq;
            }
            z2 = false;
            startRestartGroup.startReplaceGroup(1828007589);
            if (AppScreen$lambda$34(mutableState9)) {
            }
            i4 = i3;
            mutableState = mutableState9;
            context2 = context;
            state2 = state;
            mainViewModel = mainViewModel2;
            startRestartGroup.endReplaceGroup();
            pendingPr = InAppAlerts.INSTANCE.getPendingPr();
            startRestartGroup.startReplaceGroup(1828029292);
            changed = startRestartGroup.changed(pendingPr) | startRestartGroup.changedInstance(context2);
            rememberedValue = startRestartGroup.rememberedValue();
            if (changed) {
            }
            obj = null;
            rememberedValue = new AppScreenKt$AppScreen$7$1(pendingPr, context2, null);
            startRestartGroup.updateRememberedValue(rememberedValue);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(pendingPr, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue, (Composer) startRestartGroup, 0);
            Object[] objArr82 = new Object[0];
            startRestartGroup.startReplaceGroup(1828033580);
            rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            ?? r122 = obj;
            mutableState2 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr82, (Saver) null, (String) null, (Function0) rememberedValue2, (Composer) startRestartGroup, 3072, 6);
            Boolean valueOf22 = Boolean.valueOf(AppScreen$lambda$34(mutableState));
            startRestartGroup.startReplaceGroup(1828035804);
            MutableState mutableState102 = mutableState;
            changed2 = startRestartGroup.changed(mutableState102) | startRestartGroup.changedInstance(context2) | startRestartGroup.changed(mutableState2);
            rememberedValue3 = startRestartGroup.rememberedValue();
            if (!changed2) {
            }
            rememberedValue3 = new AppScreenKt$AppScreen$8$1(context2, mutableState102, mutableState2, r122);
            startRestartGroup.updateRememberedValue(rememberedValue3);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue3, (Composer) startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(1828045921);
            if (AppScreen$lambda$47(mutableState2)) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1828070031);
            if (pendingPr != null) {
            }
            startRestartGroup.endReplaceGroup();
            int AppScreen$lambda$302 = AppScreen$lambda$30(mutableIntState);
            startRestartGroup.startReplaceGroup(1828096877);
            changed3 = startRestartGroup.changed(mutableIntState);
            rememberedValue4 = startRestartGroup.rememberedValue();
            if (!changed3) {
            }
            rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda26
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    Unit AppScreen$lambda$55$lambda$54;
                    AppScreen$lambda$55$lambda$54 = AppScreenKt.AppScreen$lambda$55$lambda$54(MutableIntState.this, ((Integer) obj2).intValue());
                    return AppScreen$lambda$55$lambda$54;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue4);
            Function1 function13 = (Function1) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1828098615);
            int i72 = i5 & 14;
            changedInstance = ((i72 != 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(host))) ? z3 : false) | startRestartGroup.changedInstance(context2);
            rememberedValue5 = startRestartGroup.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda27
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppScreen$lambda$57$lambda$56;
                    AppScreen$lambda$57$lambda$56 = AppScreenKt.AppScreen$lambda$57$lambda$56(AppScreenHost.this, context2);
                    return AppScreen$lambda$57$lambda$56;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue5);
            Function0 function042 = (Function0) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1828102776);
            if (i72 != 4) {
            }
            rememberedValue6 = startRestartGroup.rememberedValue();
            if (!z4) {
            }
            rememberedValue6 = new AppScreenKt$AppScreen$16$1(host, r122);
            startRestartGroup.updateRememberedValue(rememberedValue6);
            Function1 function122 = (Function1) rememberedValue6;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1828104711);
            changedInstance2 = (i72 != 4 || ((i5 & 8) != 0 && startRestartGroup.changedInstance(host))) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(rememberNavController);
            rememberedValue7 = startRestartGroup.rememberedValue();
            if (!changedInstance2) {
            }
            rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppScreen$lambda$60$lambda$59;
                    AppScreen$lambda$60$lambda$59 = AppScreenKt.AppScreen$lambda$60$lambda$59(AppScreenHost.this, context2, rememberNavController);
                    return AppScreen$lambda$60$lambda$59;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue7);
            startRestartGroup.endReplaceGroup();
            GymNfcConfirmDialogKt.GymNfcConfirmDialog(i4, prompt, AppScreen$lambda$302, function13, function042, function122, (Function0) rememberedValue7, startRestartGroup, 0);
            PowerManager powerManager2 = (PowerManager) context2.getSystemService(PowerManager.class);
            if (powerManager2 == null) {
            }
            startRestartGroup.startReplaceGroup(1828111622);
            changed4 = startRestartGroup.changed(context2);
            rememberedValue8 = startRestartGroup.rememberedValue();
            if (!changed4) {
            }
            Context applicationContext2 = context2.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getApplicationContext(...)");
            rememberedValue8 = new BleClient(applicationContext2);
            startRestartGroup.updateRememberedValue(rememberedValue8);
            bleClient = (BleClient) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            State collectAsState32 = SnapshotStateKt.collectAsState(bleClient.getStatus(), r122, startRestartGroup, 0, 1);
            Object[] objArr92 = new Object[0];
            startRestartGroup.startReplaceGroup(1828116087);
            changedInstance3 = startRestartGroup.changedInstance(context2);
            rememberedValue9 = startRestartGroup.rememberedValue();
            if (!changedInstance3) {
            }
            rememberedValue9 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    MutableState AppScreen$lambda$64$lambda$63;
                    AppScreen$lambda$64$lambda$63 = AppScreenKt.AppScreen$lambda$64$lambda$63(context2);
                    return AppScreen$lambda$64$lambda$63;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue9);
            startRestartGroup.endReplaceGroup();
            MutableState mutableState112 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr92, (Saver) null, (String) null, (Function0) rememberedValue9, (Composer) startRestartGroup, 0, 6);
            State collectAsState42 = SnapshotStateKt.collectAsState(mainViewModel.getGymSessions(), r122, startRestartGroup, 0, 1);
            startRestartGroup.startReplaceGroup(1828122756);
            changed5 = startRestartGroup.changed(context2);
            rememberedValue10 = startRestartGroup.rememberedValue();
            if (!changed5) {
            }
            rememberedValue10 = mainViewModel.getRepository().gymLoadFlow();
            startRestartGroup.updateRememberedValue(rememberedValue10);
            startRestartGroup.endReplaceGroup();
            State collectAsState52 = SnapshotStateKt.collectAsState((Flow) rememberedValue10, null, null, startRestartGroup, 48, 2);
            List<GymSessionEntity> AppScreen$lambda$672 = AppScreen$lambda$67(collectAsState42);
            startRestartGroup.startReplaceGroup(1828126501);
            changedInstance4 = startRestartGroup.changedInstance(context2);
            rememberedValue11 = startRestartGroup.rememberedValue();
            if (!changedInstance4) {
            }
            rememberedValue11 = new AppScreenKt$AppScreen$18$1(context2, r122);
            startRestartGroup.updateRememberedValue(rememberedValue11);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(AppScreen$lambda$672, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue11, (Composer) startRestartGroup, 0);
            Object[] objArr102 = new Object[0];
            startRestartGroup.startReplaceGroup(1828135020);
            rememberedValue12 = startRestartGroup.rememberedValue();
            if (rememberedValue12 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState122 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr102, (Saver) null, (String) null, (Function0) rememberedValue12, (Composer) startRestartGroup, 3072, 6);
            Boolean valueOf32 = Boolean.valueOf(AppScreen$lambda$2(state2).isRecording());
            startRestartGroup.startReplaceGroup(1828137239);
            state3 = state2;
            changedInstance5 = startRestartGroup.changedInstance(bleClient) | startRestartGroup.changed(state3) | startRestartGroup.changed(str2) | startRestartGroup.changedInstance(context2) | startRestartGroup.changedInstance(rememberNavController);
            rememberedValue13 = startRestartGroup.rememberedValue();
            if (!changedInstance5) {
            }
            rememberedValue13 = new AppScreenKt$AppScreen$19$1(bleClient, str2, state3, context2, rememberNavController, null);
            startRestartGroup.updateRememberedValue(rememberedValue13);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf32, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue13, (Composer) startRestartGroup, 0);
            Boolean valueOf42 = Boolean.valueOf(AppScreen$lambda$2(state3).isRecording());
            Boolean valueOf52 = Boolean.valueOf(AppScreen$lambda$2(state3).isAutoPaused());
            startRestartGroup.startReplaceGroup(1828146537);
            changed6 = startRestartGroup.changed(state3) | startRestartGroup.changed(mutableState122) | startRestartGroup.changedInstance(context2);
            rememberedValue14 = startRestartGroup.rememberedValue();
            if (!changed6) {
            }
            rememberedValue14 = new AppScreenKt$AppScreen$20$1(context2, state3, mutableState122, r122);
            startRestartGroup.updateRememberedValue(rememberedValue14);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(valueOf42, valueOf52, (Function2) rememberedValue14, startRestartGroup, 0);
            Object[] objArr112 = new Object[0];
            startRestartGroup.startReplaceGroup(1828160652);
            rememberedValue15 = startRestartGroup.rememberedValue();
            if (rememberedValue15 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState132 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr112, (Saver) null, (String) null, (Function0) rememberedValue15, (Composer) startRestartGroup, 3072, 6);
            Object[] objArr122 = new Object[0];
            startRestartGroup.startReplaceGroup(1828163052);
            rememberedValue16 = startRestartGroup.rememberedValue();
            if (rememberedValue16 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState142 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr122, (Saver) null, (String) null, (Function0) rememberedValue16, (Composer) startRestartGroup, 3072, 6);
            Object[] objArr132 = new Object[0];
            startRestartGroup.startReplaceGroup(1828165196);
            rememberedValue17 = startRestartGroup.rememberedValue();
            if (rememberedValue17 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState152 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr132, (Saver) null, (String) null, (Function0) rememberedValue17, (Composer) startRestartGroup, 3072, 6);
            Object[] objArr142 = new Object[0];
            startRestartGroup.startReplaceGroup(1828167378);
            rememberedValue18 = startRestartGroup.rememberedValue();
            if (rememberedValue18 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            mutableState3 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr142, (Saver) null, (String) null, (Function0) rememberedValue18, (Composer) startRestartGroup, 3072, 6);
            Object[] objArr152 = new Object[0];
            startRestartGroup.startReplaceGroup(1828172146);
            rememberedValue19 = startRestartGroup.rememberedValue();
            if (rememberedValue19 == Composer.INSTANCE.getEmpty()) {
            }
            startRestartGroup.endReplaceGroup();
            MutableState mutableState162 = (MutableState) RememberSaveableKt.m3429rememberSaveable(objArr152, (Saver) null, (String) null, (Function0) rememberedValue19, (Composer) startRestartGroup, 3072, 6);
            Long lastFinishedRunId2 = AppScreen$lambda$2(state3).getLastFinishedRunId();
            startRestartGroup.startReplaceGroup(1828174710);
            changed7 = startRestartGroup.changed(state3) | startRestartGroup.changed(mutableState162) | startRestartGroup.changed(mutableState3);
            rememberedValue20 = startRestartGroup.rememberedValue();
            if (!changed7) {
            }
            rememberedValue20 = new AppScreenKt$AppScreen$21$1(state3, mutableState162, mutableState3, r122);
            startRestartGroup.updateRememberedValue(rememberedValue20);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(lastFinishedRunId2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue20, (Composer) startRestartGroup, 0);
            Unit unit22 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(1828183465);
            changedInstance6 = startRestartGroup.changedInstance(runs) | startRestartGroup.changedInstance(context2);
            rememberedValue21 = startRestartGroup.rememberedValue();
            if (!changedInstance6) {
            }
            rememberedValue21 = new AppScreenKt$AppScreen$22$1(runs, context2, r122);
            startRestartGroup.updateRememberedValue(rememberedValue21);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit22, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue21, (Composer) startRestartGroup, 6);
            boolean AppScreen$lambda$172 = AppScreen$lambda$17(mutableState7);
            startRestartGroup.startReplaceGroup(1828191020);
            changed8 = startRestartGroup.changed(mutableState7);
            rememberedValue22 = startRestartGroup.rememberedValue();
            if (!changed8) {
            }
            rememberedValue22 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit AppScreen$lambda$100$lambda$99;
                    AppScreen$lambda$100$lambda$99 = AppScreenKt.AppScreen$lambda$100$lambda$99(MutableState.this);
                    return AppScreen$lambda$100$lambda$99;
                }
            };
            startRestartGroup.updateRememberedValue(rememberedValue22);
            startRestartGroup.endReplaceGroup();
            MoreDestinationsSheetKt.MoreDestinationsSheet(AppScreen$lambda$172, navHostController, (Function0) rememberedValue22, startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(1828193011);
            rememberedValue23 = startRestartGroup.rememberedValue();
            if (rememberedValue23 == Composer.INSTANCE.getEmpty()) {
            }
            snackbarHostState = (SnackbarHostState) rememberedValue23;
            startRestartGroup.endReplaceGroup();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            rememberedValue24 = startRestartGroup.rememberedValue();
            if (rememberedValue24 == Composer.INSTANCE.getEmpty()) {
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope2 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue24).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1828196530);
            changedInstance7 = startRestartGroup.changedInstance(runs) | startRestartGroup.changedInstance(coroutineScope2);
            rememberedValue25 = startRestartGroup.rememberedValue();
            if (!changedInstance7) {
            }
            rememberedValue25 = new AppScreenKt$AppScreen$24$1(runs, coroutineScope2, snackbarHostState, r122);
            startRestartGroup.updateRememberedValue(rememberedValue25);
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(runs, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue25, (Composer) startRestartGroup, 0);
            startRestartGroup.startReplaceGroup(1828203327);
            MainViewModel mainViewModel32 = mainViewModel;
            changed9 = startRestartGroup.changed(mainViewModel32);
            rememberedValue26 = startRestartGroup.rememberedValue();
            if (!changed9) {
            }
            rememberedValue26 = Result.m7904boximpl(mainViewModel32.m7662useCasesResultd1pmJ48());
            startRestartGroup.updateRememberedValue(rememberedValue26);
            value = ((Result) rememberedValue26).getValue();
            startRestartGroup.endReplaceGroup();
            if (!Result.m7911isFailureimpl(value)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit AppScreen$lambda$108;
                    AppScreen$lambda$108 = AppScreenKt.AppScreen$lambda$108(AppScreenHost.this, z, onStart, onStop, onExport, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return AppScreen$lambda$108;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$4$lambda$3() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AppScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$8$lambda$7() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AppScreen$lambda$9(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$12$lambda$11() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AppScreen$lambda$13(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$16$lambda$15() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean AppScreen$lambda$17(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$lambda$18(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$goTab(Context context, final NavHostController navHostController, String str) {
        CrashLog.INSTANCE.note(context, "tab:" + str);
        navHostController.navigate(str, new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppScreen$goTab$lambda$21;
                AppScreen$goTab$lambda$21 = AppScreenKt.AppScreen$goTab$lambda$21(NavHostController.this, (NavOptionsBuilder) obj);
                return AppScreen$goTab$lambda$21;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$goTab$lambda$21(NavHostController navHostController, NavOptionsBuilder navigate) {
        Intrinsics.checkNotNullParameter(navigate, "$this$navigate");
        navigate.popUpTo(navHostController.getGraph().getStartDestId(), new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit AppScreen$goTab$lambda$21$lambda$20;
                AppScreen$goTab$lambda$21$lambda$20 = AppScreenKt.AppScreen$goTab$lambda$21$lambda$20((PopUpToBuilder) obj);
                return AppScreen$goTab$lambda$21$lambda$20;
            }
        });
        navigate.setLaunchSingleTop(true);
        navigate.setRestoreState(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$goTab$lambda$21$lambda$20(PopUpToBuilder popUpTo) {
        Intrinsics.checkNotNullParameter(popUpTo, "$this$popUpTo");
        popUpTo.setSaveState(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$23$lambda$22() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AppScreen$lambda$24(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableIntState AppScreen$lambda$29$lambda$28() {
        return SnapshotIntStateKt.mutableIntStateOf(0);
    }

    private static final int AppScreen$lambda$30(MutableIntState mutableIntState) {
        return mutableIntState.getIntValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$33$lambda$32(Context context) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(!OnboardingPrefs.INSTANCE.isDone(context)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AppScreen$lambda$34(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void AppScreen$lambda$35(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$37$lambda$36(Context context, NavHostController navHostController, MutableState mutableState) {
        AppScreen$goTab(context, navHostController, MainTab.Gym.getRoute());
        AppScreen$lambda$35(mutableState, false);
        OnboardingPrefs.INSTANCE.markDone(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$39$lambda$38(Context context, MutableState mutableState) {
        AppScreen$lambda$35(mutableState, false);
        OnboardingPrefs.INSTANCE.markDone(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$41$lambda$40(AppScreenHost appScreenHost) {
        appScreenHost.requestOnboardingRuntimePermissions();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$43$lambda$42(AppScreenHost appScreenHost) {
        appScreenHost.requestOnboardingHealthConnect();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$46$lambda$45() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    private static final boolean AppScreen$lambda$47(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$lambda$48(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$51$lambda$50(MutableState mutableState) {
        AppScreen$lambda$48(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$53$lambda$52() {
        InAppAlerts.INSTANCE.clearPr();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$55$lambda$54(MutableIntState mutableIntState, int i) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$57$lambda$56(AppScreenHost appScreenHost, Context context) {
        appScreenHost.getGymNfc().setPrompt(null);
        GymNfcHandler.INSTANCE.clearStaleDeepLinks(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$60$lambda$59(AppScreenHost appScreenHost, Context context, NavHostController navHostController) {
        AppScreen$goTab(context, navHostController, MainTab.Gym.getRoute());
        appScreenHost.getGymNfc().bumpPulse();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String AppScreen$lambda$65(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$64$lambda$63(Context context) {
        String string = context.getSharedPreferences("settings", 0).getString("bleLastAddress", "");
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(string != null ? string : "", null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$72$lambda$71() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AppScreen$lambda$73(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$lambda$74(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$78$lambda$77() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AppScreen$lambda$79(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$lambda$80(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$82$lambda$81() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AppScreen$lambda$83(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$lambda$84(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$86$lambda$85() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean AppScreen$lambda$87(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppScreen$lambda$88(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$90$lambda$89() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AppScreen$lambda$91(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState AppScreen$lambda$94$lambda$93() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long AppScreen$lambda$95(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppScreen$lambda$100$lambda$99(MutableState mutableState) {
        AppScreen$lambda$18(mutableState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<RouteEntity> AppScreen$lambda$1(State<? extends List<RouteEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TrackingUiState AppScreen$lambda$2(State<TrackingUiState> state) {
        return state.getValue();
    }

    private static final NavBackStackEntry AppScreen$lambda$19(State<NavBackStackEntry> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BleStatus AppScreen$lambda$62(State<BleStatus> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<GymSessionEntity> AppScreen$lambda$67(State<? extends List<GymSessionEntity>> state) {
        return state.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GymLoadStats AppScreen$lambda$69(State<GymLoadStats> state) {
        return state.getValue();
    }
}
