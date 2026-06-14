package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavHostController;
import com.example.rungps.MainActivity;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.main.AppTabRouterKt;
import com.example.rungps.ui.navigation.AppDestinationsKt;
import com.example.rungps.ui.navigation.MainTab;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KFunction;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$29$1$4$1$1$1$1 implements Function4<AnimatedContentScope, NavBackStackEntry, Composer, Integer, Unit> {
    final /* synthetic */ BleClient $ble;
    final /* synthetic */ MutableState<String> $bleAddr$delegate;
    final /* synthetic */ State<BleStatus> $bleStatus$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Long> $deleteOneId$delegate;
    final /* synthetic */ MutableState<Long> $focusGymSessionId$delegate;
    final /* synthetic */ MutableState<Long> $followRouteId$delegate;
    final /* synthetic */ MutableState<String> $followRouteName$delegate;
    final /* synthetic */ State<GymLoadStats> $gymLoad$delegate;
    final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
    final /* synthetic */ State<TrackingUiState> $live$delegate;
    final /* synthetic */ MainActivity $mainAct;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Function1<Long, Unit> $onExport;
    final /* synthetic */ Function0<Unit> $onStart;
    final /* synthetic */ Function0<Unit> $onStop;
    final /* synthetic */ MutableState<Long> $photoExportRunId$delegate;
    final /* synthetic */ String $route;
    final /* synthetic */ State<List<RouteEntity>> $routes$delegate;
    final /* synthetic */ MutableState<Long> $selectedRunId$delegate;
    final /* synthetic */ MutableState<Boolean> $showConfirmStart$delegate;
    final /* synthetic */ MutableState<Boolean> $showDeleteAll$delegate;
    final /* synthetic */ boolean $started;
    final /* synthetic */ RunsViewModel $vm;

    /* JADX WARN: Multi-variable type inference failed */
    AppScreenKt$AppScreen$29$1$4$1$1$1$1(String str, State<TrackingUiState> state, MutableState<Long> mutableState, Function1<? super Long, Unit> function1, MutableState<Long> mutableState2, RunsViewModel runsViewModel, MutableState<Long> mutableState3, MutableState<String> mutableState4, MainActivity mainActivity, boolean z, Function0<Unit> function0, Function0<Unit> function02, MutableState<Boolean> mutableState5, BleClient bleClient, MutableState<String> mutableState6, Context context, NavHostController navHostController, MutableState<Boolean> mutableState7, MutableState<Long> mutableState8, MutableState<Long> mutableState9, State<? extends List<RouteEntity>> state2, State<BleStatus> state3, State<? extends List<GymSessionEntity>> state4, State<GymLoadStats> state5) {
        this.$route = str;
        this.$live$delegate = state;
        this.$selectedRunId$delegate = mutableState;
        this.$onExport = function1;
        this.$photoExportRunId$delegate = mutableState2;
        this.$vm = runsViewModel;
        this.$followRouteId$delegate = mutableState3;
        this.$followRouteName$delegate = mutableState4;
        this.$mainAct = mainActivity;
        this.$started = z;
        this.$onStart = function0;
        this.$onStop = function02;
        this.$showConfirmStart$delegate = mutableState5;
        this.$ble = bleClient;
        this.$bleAddr$delegate = mutableState6;
        this.$ctx = context;
        this.$navController = navHostController;
        this.$showDeleteAll$delegate = mutableState7;
        this.$deleteOneId$delegate = mutableState8;
        this.$focusGymSessionId$delegate = mutableState9;
        this.$routes$delegate = state2;
        this.$bleStatus$delegate = state3;
        this.$gymSessions$delegate = state4;
        this.$gymLoad$delegate = state5;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, NavBackStackEntry navBackStackEntry, Composer composer, Integer num) {
        invoke(animatedContentScope, navBackStackEntry, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x034b  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(AnimatedContentScope composable, NavBackStackEntry it, Composer composer, int i) {
        boolean z;
        Long AppScreen$lambda$91;
        boolean z2;
        TrackingUiState AppScreen$lambda$2;
        Modifier padding;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        Long AppScreen$lambda$24;
        Long AppScreen$lambda$912;
        TrackingUiState AppScreen$lambda$22;
        List AppScreen$lambda$1;
        BleStatus AppScreen$lambda$62;
        List AppScreen$lambda$67;
        Long invoke$lambda$2;
        String invoke$lambda$6;
        String AppScreen$lambda$65;
        GymLoadStats AppScreen$lambda$69;
        boolean changed;
        Object rememberedValue;
        boolean changed2;
        Object rememberedValue2;
        boolean changed3;
        Object rememberedValue3;
        boolean changed4;
        Object rememberedValue4;
        boolean changed5;
        Object rememberedValue5;
        boolean changed6;
        Object rememberedValue6;
        boolean changedInstance;
        Object rememberedValue7;
        boolean changed7;
        Object rememberedValue8;
        boolean changed8;
        Object rememberedValue9;
        TrackingUiState AppScreen$lambda$23;
        TrackingUiState AppScreen$lambda$25;
        Intrinsics.checkNotNullParameter(composable, "$this$composable");
        Intrinsics.checkNotNullParameter(it, "it");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(306149953, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AppScreen.kt:366)");
        }
        ScrollState rememberScrollState = ScrollKt.rememberScrollState(0, composer, 0, 1);
        if (Intrinsics.areEqual(this.$route, MainTab.Run.getRoute())) {
            AppScreen$lambda$25 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
            if (AppScreen$lambda$25.isRecording()) {
                z = true;
                AppScreen$lambda$91 = AppScreenKt.AppScreen$lambda$91(this.$selectedRunId$delegate);
                if (AppScreen$lambda$91 != null) {
                    AppScreen$lambda$23 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
                    if (!AppScreen$lambda$23.isRecording()) {
                        z2 = true;
                        if (z) {
                            padding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingKt.m677PaddingValues0680j_4(Dp.m6303constructorimpl(4)));
                        } else {
                            String str = this.$route;
                            AppScreen$lambda$2 = AppScreenKt.AppScreen$lambda$2(this.$live$delegate);
                            if (AppDestinationsKt.routeUsesFullPane(str, AppScreen$lambda$2.isRecording(), z2)) {
                                padding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), PaddingKt.m677PaddingValues0680j_4(Dp.m6303constructorimpl(20)));
                            } else {
                                padding = PaddingKt.padding(ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), rememberScrollState, false, null, false, 14, null), PaddingKt.m677PaddingValues0680j_4(Dp.m6303constructorimpl(20)));
                            }
                        }
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                        String str2 = this.$route;
                        final MutableState<Long> mutableState = this.$selectedRunId$delegate;
                        Function1<Long, Unit> function1 = this.$onExport;
                        final MutableState<Long> mutableState2 = this.$photoExportRunId$delegate;
                        RunsViewModel runsViewModel = this.$vm;
                        final MutableState<Long> mutableState3 = this.$followRouteId$delegate;
                        final MutableState<String> mutableState4 = this.$followRouteName$delegate;
                        MainActivity mainActivity = this.$mainAct;
                        boolean z3 = this.$started;
                        Function0<Unit> function0 = this.$onStart;
                        Function0<Unit> function02 = this.$onStop;
                        final MutableState<Boolean> mutableState5 = this.$showConfirmStart$delegate;
                        BleClient bleClient = this.$ble;
                        final MutableState<String> mutableState6 = this.$bleAddr$delegate;
                        Context context = this.$ctx;
                        NavHostController navHostController = this.$navController;
                        final MutableState<Boolean> mutableState7 = this.$showDeleteAll$delegate;
                        final MutableState<Long> mutableState8 = this.$deleteOneId$delegate;
                        MutableState<Long> mutableState9 = this.$focusGymSessionId$delegate;
                        State<TrackingUiState> state = this.$live$delegate;
                        State<List<RouteEntity>> state2 = this.$routes$delegate;
                        State<BleStatus> state3 = this.$bleStatus$delegate;
                        State<List<GymSessionEntity>> state4 = this.$gymSessions$delegate;
                        State<GymLoadStats> state5 = this.$gymLoad$delegate;
                        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, padding);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        m3336constructorimpl = Updater.m3336constructorimpl(composer);
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        AppScreen$lambda$24 = AppScreenKt.AppScreen$lambda$24(mutableState9);
                        AppScreen$lambda$912 = AppScreenKt.AppScreen$lambda$91(mutableState);
                        AppScreen$lambda$22 = AppScreenKt.AppScreen$lambda$2(state);
                        AppScreen$lambda$1 = AppScreenKt.AppScreen$lambda$1(state2);
                        AppScreen$lambda$62 = AppScreenKt.AppScreen$lambda$62(state3);
                        AppScreen$lambda$67 = AppScreenKt.AppScreen$lambda$67(state4);
                        invoke$lambda$2 = AppScreenKt$AppScreen$29$1$4.invoke$lambda$2(mutableState3);
                        invoke$lambda$6 = AppScreenKt$AppScreen$29$1$4.invoke$lambda$6(mutableState4);
                        AppScreen$lambda$65 = AppScreenKt.AppScreen$lambda$65(mutableState6);
                        AppScreen$lambda$69 = AppScreenKt.AppScreen$lambda$69(state5);
                        composer.startReplaceGroup(1351974403);
                        changed = composer.changed(mutableState);
                        rememberedValue = composer.rememberedValue();
                        if (!changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                            rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    Unit invoke$lambda$17$lambda$1$lambda$0;
                                    invoke$lambda$17$lambda$1$lambda$0 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$1$lambda$0(MutableState.this);
                                    return invoke$lambda$17$lambda$1$lambda$0;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue);
                        }
                        Function0 function03 = (Function0) rememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1352012353);
                        changed2 = composer.changed(mutableState);
                        rememberedValue2 = composer.rememberedValue();
                        if (!changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit invoke$lambda$17$lambda$3$lambda$2;
                                    invoke$lambda$17$lambda$3$lambda$2 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$3$lambda$2(MutableState.this, ((Long) obj).longValue());
                                    return invoke$lambda$17$lambda$3$lambda$2;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue2);
                        }
                        Function1 function12 = (Function1) rememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1351978244);
                        changed3 = composer.changed(mutableState2);
                        rememberedValue3 = composer.rememberedValue();
                        if (!changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit invoke$lambda$17$lambda$5$lambda$4;
                                    invoke$lambda$17$lambda$5$lambda$4 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$5$lambda$4(MutableState.this, ((Long) obj).longValue());
                                    return invoke$lambda$17$lambda$5$lambda$4;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue3);
                        }
                        Function1 function13 = (Function1) rememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1351991872);
                        changed4 = composer.changed(mutableState3) | composer.changed(mutableState4);
                        rememberedValue4 = composer.rememberedValue();
                        if (!changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue4 = new Function2() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit invoke$lambda$17$lambda$7$lambda$6;
                                    invoke$lambda$17$lambda$7$lambda$6 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$7$lambda$6(MutableState.this, mutableState4, (Long) obj, (String) obj2);
                                    return invoke$lambda$17$lambda$7$lambda$6;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue4);
                        }
                        Function2 function2 = (Function2) rememberedValue4;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1352004100);
                        changed5 = composer.changed(mutableState5);
                        rememberedValue5 = composer.rememberedValue();
                        if (!changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit invoke$lambda$17$lambda$9$lambda$8;
                                    invoke$lambda$17$lambda$9$lambda$8 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$9$lambda$8(MutableState.this, ((Boolean) obj).booleanValue());
                                    return invoke$lambda$17$lambda$9$lambda$8;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue5);
                        }
                        Function1 function14 = (Function1) rememberedValue5;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1352008987);
                        changed6 = composer.changed(mutableState6);
                        rememberedValue6 = composer.rememberedValue();
                        if (!changed6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit invoke$lambda$17$lambda$11$lambda$10;
                                    invoke$lambda$17$lambda$11$lambda$10 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$11$lambda$10(MutableState.this, (String) obj);
                                    return invoke$lambda$17$lambda$11$lambda$10;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue6);
                        }
                        Function1 function15 = (Function1) rememberedValue6;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1352010706);
                        changedInstance = composer.changedInstance(context) | composer.changedInstance(navHostController);
                        rememberedValue7 = composer.rememberedValue();
                        if (!changedInstance || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue7 = (KFunction) new AppScreenKt$AppScreen$29$1$4$1$1$1$1$1$7$1(context, navHostController);
                            composer.updateRememberedValue(rememberedValue7);
                        }
                        composer.endReplaceGroup();
                        Function1 function16 = (Function1) ((KFunction) rememberedValue7);
                        composer.startReplaceGroup(1352014593);
                        changed7 = composer.changed(mutableState7);
                        rememberedValue8 = composer.rememberedValue();
                        if (!changed7 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit invoke$lambda$17$lambda$14$lambda$13;
                                    invoke$lambda$17$lambda$14$lambda$13 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$14$lambda$13(MutableState.this, ((Boolean) obj).booleanValue());
                                    return invoke$lambda$17$lambda$14$lambda$13;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue8);
                        }
                        Function1 function17 = (Function1) rememberedValue8;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1352016767);
                        changed8 = composer.changed(mutableState8);
                        rememberedValue9 = composer.rememberedValue();
                        if (!changed8 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                            rememberedValue9 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    Unit invoke$lambda$17$lambda$16$lambda$15;
                                    invoke$lambda$17$lambda$16$lambda$15 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$16$lambda$15(MutableState.this, (Long) obj);
                                    return invoke$lambda$17$lambda$16$lambda$15;
                                }
                            };
                            composer.updateRememberedValue(rememberedValue9);
                        }
                        composer.endReplaceGroup();
                        AppTabRouterKt.AppTabRouter(str2, AppScreen$lambda$912, function03, function12, function1, function13, runsViewModel, AppScreen$lambda$22, AppScreen$lambda$1, AppScreen$lambda$62, AppScreen$lambda$67, invoke$lambda$2, invoke$lambda$6, function2, mainActivity, z3, function0, function02, function14, bleClient, AppScreen$lambda$65, function15, function16, function17, (Function1) rememberedValue9, AppScreen$lambda$69, AppScreen$lambda$24, composer, 0, 0, 0, 0);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        composer.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        ComposerKt.sourceInformationMarkerEnd(composer);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                }
                z2 = false;
                if (z) {
                }
                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                String str22 = this.$route;
                final MutableState mutableState10 = this.$selectedRunId$delegate;
                Function1<Long, Unit> function18 = this.$onExport;
                final MutableState mutableState22 = this.$photoExportRunId$delegate;
                RunsViewModel runsViewModel2 = this.$vm;
                final MutableState mutableState32 = this.$followRouteId$delegate;
                final MutableState mutableState42 = this.$followRouteName$delegate;
                MainActivity mainActivity2 = this.$mainAct;
                boolean z32 = this.$started;
                Function0<Unit> function04 = this.$onStart;
                Function0<Unit> function022 = this.$onStop;
                final MutableState mutableState52 = this.$showConfirmStart$delegate;
                BleClient bleClient2 = this.$ble;
                final MutableState mutableState62 = this.$bleAddr$delegate;
                Context context2 = this.$ctx;
                NavHostController navHostController2 = this.$navController;
                final MutableState mutableState72 = this.$showDeleteAll$delegate;
                final MutableState mutableState82 = this.$deleteOneId$delegate;
                MutableState<Long> mutableState92 = this.$focusGymSessionId$delegate;
                State<TrackingUiState> state6 = this.$live$delegate;
                State<List<RouteEntity>> state22 = this.$routes$delegate;
                State<BleStatus> state32 = this.$bleStatus$delegate;
                State<List<GymSessionEntity>> state42 = this.$gymSessions$delegate;
                State<GymLoadStats> state52 = this.$gymLoad$delegate;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, padding);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                }
                m3336constructorimpl = Updater.m3336constructorimpl(composer);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting()) {
                }
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                AppScreen$lambda$24 = AppScreenKt.AppScreen$lambda$24(mutableState92);
                AppScreen$lambda$912 = AppScreenKt.AppScreen$lambda$91(mutableState10);
                AppScreen$lambda$22 = AppScreenKt.AppScreen$lambda$2(state6);
                AppScreen$lambda$1 = AppScreenKt.AppScreen$lambda$1(state22);
                AppScreen$lambda$62 = AppScreenKt.AppScreen$lambda$62(state32);
                AppScreen$lambda$67 = AppScreenKt.AppScreen$lambda$67(state42);
                invoke$lambda$2 = AppScreenKt$AppScreen$29$1$4.invoke$lambda$2(mutableState32);
                invoke$lambda$6 = AppScreenKt$AppScreen$29$1$4.invoke$lambda$6(mutableState42);
                AppScreen$lambda$65 = AppScreenKt.AppScreen$lambda$65(mutableState62);
                AppScreen$lambda$69 = AppScreenKt.AppScreen$lambda$69(state52);
                composer.startReplaceGroup(1351974403);
                changed = composer.changed(mutableState10);
                rememberedValue = composer.rememberedValue();
                if (!changed) {
                }
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$17$lambda$1$lambda$0;
                        invoke$lambda$17$lambda$1$lambda$0 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$17$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
                Function0 function032 = (Function0) rememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1352012353);
                changed2 = composer.changed(mutableState10);
                rememberedValue2 = composer.rememberedValue();
                if (!changed2) {
                }
                rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$3$lambda$2;
                        invoke$lambda$17$lambda$3$lambda$2 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$3$lambda$2(MutableState.this, ((Long) obj).longValue());
                        return invoke$lambda$17$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
                Function1 function122 = (Function1) rememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1351978244);
                changed3 = composer.changed(mutableState22);
                rememberedValue3 = composer.rememberedValue();
                if (!changed3) {
                }
                rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$5$lambda$4;
                        invoke$lambda$17$lambda$5$lambda$4 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$5$lambda$4(MutableState.this, ((Long) obj).longValue());
                        return invoke$lambda$17$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
                Function1 function132 = (Function1) rememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1351991872);
                changed4 = composer.changed(mutableState32) | composer.changed(mutableState42);
                rememberedValue4 = composer.rememberedValue();
                if (!changed4) {
                }
                rememberedValue4 = new Function2() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit invoke$lambda$17$lambda$7$lambda$6;
                        invoke$lambda$17$lambda$7$lambda$6 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$7$lambda$6(MutableState.this, mutableState42, (Long) obj, (String) obj2);
                        return invoke$lambda$17$lambda$7$lambda$6;
                    }
                };
                composer.updateRememberedValue(rememberedValue4);
                Function2 function22 = (Function2) rememberedValue4;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1352004100);
                changed5 = composer.changed(mutableState52);
                rememberedValue5 = composer.rememberedValue();
                if (!changed5) {
                }
                rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$9$lambda$8;
                        invoke$lambda$17$lambda$9$lambda$8 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$9$lambda$8(MutableState.this, ((Boolean) obj).booleanValue());
                        return invoke$lambda$17$lambda$9$lambda$8;
                    }
                };
                composer.updateRememberedValue(rememberedValue5);
                Function1 function142 = (Function1) rememberedValue5;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1352008987);
                changed6 = composer.changed(mutableState62);
                rememberedValue6 = composer.rememberedValue();
                if (!changed6) {
                }
                rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$11$lambda$10;
                        invoke$lambda$17$lambda$11$lambda$10 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$11$lambda$10(MutableState.this, (String) obj);
                        return invoke$lambda$17$lambda$11$lambda$10;
                    }
                };
                composer.updateRememberedValue(rememberedValue6);
                Function1 function152 = (Function1) rememberedValue6;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1352010706);
                changedInstance = composer.changedInstance(context2) | composer.changedInstance(navHostController2);
                rememberedValue7 = composer.rememberedValue();
                if (!changedInstance) {
                }
                rememberedValue7 = (KFunction) new AppScreenKt$AppScreen$29$1$4$1$1$1$1$1$7$1(context2, navHostController2);
                composer.updateRememberedValue(rememberedValue7);
                composer.endReplaceGroup();
                Function1 function162 = (Function1) ((KFunction) rememberedValue7);
                composer.startReplaceGroup(1352014593);
                changed7 = composer.changed(mutableState72);
                rememberedValue8 = composer.rememberedValue();
                if (!changed7) {
                }
                rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$14$lambda$13;
                        invoke$lambda$17$lambda$14$lambda$13 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$14$lambda$13(MutableState.this, ((Boolean) obj).booleanValue());
                        return invoke$lambda$17$lambda$14$lambda$13;
                    }
                };
                composer.updateRememberedValue(rememberedValue8);
                Function1 function172 = (Function1) rememberedValue8;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1352016767);
                changed8 = composer.changed(mutableState82);
                rememberedValue9 = composer.rememberedValue();
                if (!changed8) {
                }
                rememberedValue9 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$17$lambda$16$lambda$15;
                        invoke$lambda$17$lambda$16$lambda$15 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$16$lambda$15(MutableState.this, (Long) obj);
                        return invoke$lambda$17$lambda$16$lambda$15;
                    }
                };
                composer.updateRememberedValue(rememberedValue9);
                composer.endReplaceGroup();
                AppTabRouterKt.AppTabRouter(str22, AppScreen$lambda$912, function032, function122, function18, function132, runsViewModel2, AppScreen$lambda$22, AppScreen$lambda$1, AppScreen$lambda$62, AppScreen$lambda$67, invoke$lambda$2, invoke$lambda$6, function22, mainActivity2, z32, function04, function022, function142, bleClient2, AppScreen$lambda$65, function152, function162, function172, (Function1) rememberedValue9, AppScreen$lambda$69, AppScreen$lambda$24, composer, 0, 0, 0, 0);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        z = false;
        AppScreen$lambda$91 = AppScreenKt.AppScreen$lambda$91(this.$selectedRunId$delegate);
        if (AppScreen$lambda$91 != null) {
        }
        z2 = false;
        if (z) {
        }
        Arrangement.HorizontalOrVertical m564spacedBy0680j_422 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
        String str222 = this.$route;
        final MutableState mutableState102 = this.$selectedRunId$delegate;
        Function1<Long, Unit> function182 = this.$onExport;
        final MutableState mutableState222 = this.$photoExportRunId$delegate;
        RunsViewModel runsViewModel22 = this.$vm;
        final MutableState mutableState322 = this.$followRouteId$delegate;
        final MutableState mutableState422 = this.$followRouteName$delegate;
        MainActivity mainActivity22 = this.$mainAct;
        boolean z322 = this.$started;
        Function0<Unit> function042 = this.$onStart;
        Function0<Unit> function0222 = this.$onStop;
        final MutableState mutableState522 = this.$showConfirmStart$delegate;
        BleClient bleClient22 = this.$ble;
        final MutableState mutableState622 = this.$bleAddr$delegate;
        Context context22 = this.$ctx;
        NavHostController navHostController22 = this.$navController;
        final MutableState mutableState722 = this.$showDeleteAll$delegate;
        final MutableState mutableState822 = this.$deleteOneId$delegate;
        MutableState<Long> mutableState922 = this.$focusGymSessionId$delegate;
        State<TrackingUiState> state62 = this.$live$delegate;
        State<List<RouteEntity>> state222 = this.$routes$delegate;
        State<BleStatus> state322 = this.$bleStatus$delegate;
        State<List<GymSessionEntity>> state422 = this.$gymSessions$delegate;
        State<GymLoadStats> state522 = this.$gymLoad$delegate;
        ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy22 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_422, Alignment.INSTANCE.getStart(), composer, 6);
        ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap22 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier22 = ComposedModifierKt.materializeModifier(composer, padding);
        Function0<ComposeUiNode> constructor22 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(composer);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy22, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap22, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash22 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash22);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier22, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance22 = ColumnScopeInstance.INSTANCE;
        AppScreen$lambda$24 = AppScreenKt.AppScreen$lambda$24(mutableState922);
        AppScreen$lambda$912 = AppScreenKt.AppScreen$lambda$91(mutableState102);
        AppScreen$lambda$22 = AppScreenKt.AppScreen$lambda$2(state62);
        AppScreen$lambda$1 = AppScreenKt.AppScreen$lambda$1(state222);
        AppScreen$lambda$62 = AppScreenKt.AppScreen$lambda$62(state322);
        AppScreen$lambda$67 = AppScreenKt.AppScreen$lambda$67(state422);
        invoke$lambda$2 = AppScreenKt$AppScreen$29$1$4.invoke$lambda$2(mutableState322);
        invoke$lambda$6 = AppScreenKt$AppScreen$29$1$4.invoke$lambda$6(mutableState422);
        AppScreen$lambda$65 = AppScreenKt.AppScreen$lambda$65(mutableState622);
        AppScreen$lambda$69 = AppScreenKt.AppScreen$lambda$69(state522);
        composer.startReplaceGroup(1351974403);
        changed = composer.changed(mutableState102);
        rememberedValue = composer.rememberedValue();
        if (!changed) {
        }
        rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$17$lambda$1$lambda$0;
                invoke$lambda$17$lambda$1$lambda$0 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$1$lambda$0(MutableState.this);
                return invoke$lambda$17$lambda$1$lambda$0;
            }
        };
        composer.updateRememberedValue(rememberedValue);
        Function0 function0322 = (Function0) rememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1352012353);
        changed2 = composer.changed(mutableState102);
        rememberedValue2 = composer.rememberedValue();
        if (!changed2) {
        }
        rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$3$lambda$2;
                invoke$lambda$17$lambda$3$lambda$2 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$3$lambda$2(MutableState.this, ((Long) obj).longValue());
                return invoke$lambda$17$lambda$3$lambda$2;
            }
        };
        composer.updateRememberedValue(rememberedValue2);
        Function1 function1222 = (Function1) rememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1351978244);
        changed3 = composer.changed(mutableState222);
        rememberedValue3 = composer.rememberedValue();
        if (!changed3) {
        }
        rememberedValue3 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$5$lambda$4;
                invoke$lambda$17$lambda$5$lambda$4 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$5$lambda$4(MutableState.this, ((Long) obj).longValue());
                return invoke$lambda$17$lambda$5$lambda$4;
            }
        };
        composer.updateRememberedValue(rememberedValue3);
        Function1 function1322 = (Function1) rememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1351991872);
        changed4 = composer.changed(mutableState322) | composer.changed(mutableState422);
        rememberedValue4 = composer.rememberedValue();
        if (!changed4) {
        }
        rememberedValue4 = new Function2() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                Unit invoke$lambda$17$lambda$7$lambda$6;
                invoke$lambda$17$lambda$7$lambda$6 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$7$lambda$6(MutableState.this, mutableState422, (Long) obj, (String) obj2);
                return invoke$lambda$17$lambda$7$lambda$6;
            }
        };
        composer.updateRememberedValue(rememberedValue4);
        Function2 function222 = (Function2) rememberedValue4;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1352004100);
        changed5 = composer.changed(mutableState522);
        rememberedValue5 = composer.rememberedValue();
        if (!changed5) {
        }
        rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$9$lambda$8;
                invoke$lambda$17$lambda$9$lambda$8 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$9$lambda$8(MutableState.this, ((Boolean) obj).booleanValue());
                return invoke$lambda$17$lambda$9$lambda$8;
            }
        };
        composer.updateRememberedValue(rememberedValue5);
        Function1 function1422 = (Function1) rememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1352008987);
        changed6 = composer.changed(mutableState622);
        rememberedValue6 = composer.rememberedValue();
        if (!changed6) {
        }
        rememberedValue6 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$11$lambda$10;
                invoke$lambda$17$lambda$11$lambda$10 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$11$lambda$10(MutableState.this, (String) obj);
                return invoke$lambda$17$lambda$11$lambda$10;
            }
        };
        composer.updateRememberedValue(rememberedValue6);
        Function1 function1522 = (Function1) rememberedValue6;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1352010706);
        changedInstance = composer.changedInstance(context22) | composer.changedInstance(navHostController22);
        rememberedValue7 = composer.rememberedValue();
        if (!changedInstance) {
        }
        rememberedValue7 = (KFunction) new AppScreenKt$AppScreen$29$1$4$1$1$1$1$1$7$1(context22, navHostController22);
        composer.updateRememberedValue(rememberedValue7);
        composer.endReplaceGroup();
        Function1 function1622 = (Function1) ((KFunction) rememberedValue7);
        composer.startReplaceGroup(1352014593);
        changed7 = composer.changed(mutableState722);
        rememberedValue8 = composer.rememberedValue();
        if (!changed7) {
        }
        rememberedValue8 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$14$lambda$13;
                invoke$lambda$17$lambda$14$lambda$13 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$14$lambda$13(MutableState.this, ((Boolean) obj).booleanValue());
                return invoke$lambda$17$lambda$14$lambda$13;
            }
        };
        composer.updateRememberedValue(rememberedValue8);
        Function1 function1722 = (Function1) rememberedValue8;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1352016767);
        changed8 = composer.changed(mutableState822);
        rememberedValue9 = composer.rememberedValue();
        if (!changed8) {
        }
        rememberedValue9 = new Function1() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$4$1$1$1$1$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$17$lambda$16$lambda$15;
                invoke$lambda$17$lambda$16$lambda$15 = AppScreenKt$AppScreen$29$1$4$1$1$1$1.invoke$lambda$17$lambda$16$lambda$15(MutableState.this, (Long) obj);
                return invoke$lambda$17$lambda$16$lambda$15;
            }
        };
        composer.updateRememberedValue(rememberedValue9);
        composer.endReplaceGroup();
        AppTabRouterKt.AppTabRouter(str222, AppScreen$lambda$912, function0322, function1222, function182, function1322, runsViewModel22, AppScreen$lambda$22, AppScreen$lambda$1, AppScreen$lambda$62, AppScreen$lambda$67, invoke$lambda$2, invoke$lambda$6, function222, mainActivity22, z322, function042, function0222, function1422, bleClient22, AppScreen$lambda$65, function1522, function1622, function1722, (Function1) rememberedValue9, AppScreen$lambda$69, AppScreen$lambda$24, composer, 0, 0, 0, 0);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$1$lambda$0(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$5$lambda$4(MutableState mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$7$lambda$6(MutableState mutableState, MutableState mutableState2, Long l, String str) {
        mutableState.setValue(l);
        mutableState2.setValue(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$9$lambda$8(MutableState mutableState, boolean z) {
        AppScreenKt.AppScreen$lambda$80(mutableState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$11$lambda$10(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$3$lambda$2(MutableState mutableState, long j) {
        mutableState.setValue(Long.valueOf(j));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$14$lambda$13(MutableState mutableState, boolean z) {
        AppScreenKt.AppScreen$lambda$6(mutableState, z);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16$lambda$15(MutableState mutableState, Long l) {
        mutableState.setValue(l);
        return Unit.INSTANCE;
    }
}
