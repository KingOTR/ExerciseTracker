package com.example.rungps.ui.shell;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SnackbarHostKt;
import androidx.compose.material3.SnackbarHostState;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.navigation.NavHostController;
import com.example.rungps.MainActivity;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingService;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.main.RecordingLockControlsKt;
import com.example.rungps.ui.run.RunOverlayExportDialogKt;
import com.example.rungps.ui.shell.AppScreenKt$AppScreen$29;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$29 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ BleClient $ble;
    final /* synthetic */ MutableState<String> $bleAddr$delegate;
    final /* synthetic */ State<BleStatus> $bleStatus$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Long> $deleteOneId$delegate;
    final /* synthetic */ MutableState<Long> $focusGymSessionId$delegate;
    final /* synthetic */ State<GymLoadStats> $gymLoad$delegate;
    final /* synthetic */ State<List<GymSessionEntity>> $gymSessions$delegate;
    final /* synthetic */ AppScreenHost $host;
    final /* synthetic */ State<TrackingUiState> $live$delegate;
    final /* synthetic */ MainActivity $mainAct;
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ Function1<Long, Unit> $onExport;
    final /* synthetic */ Function0<Unit> $onStart;
    final /* synthetic */ Function0<Unit> $onStop;
    final /* synthetic */ MutableState<Boolean> $pendingStart$delegate;
    final /* synthetic */ MutableState<Long> $photoExportRunId$delegate;
    final /* synthetic */ boolean $powerSaveOn;
    final /* synthetic */ State<List<RouteEntity>> $routes$delegate;
    final /* synthetic */ MutableState<Long> $selectedRunId$delegate;
    final /* synthetic */ MutableState<Boolean> $showConfirmStart$delegate;
    final /* synthetic */ MutableState<Boolean> $showDeleteAll$delegate;
    final /* synthetic */ MutableState<Boolean> $showMoreSheet$delegate;
    final /* synthetic */ MutableState<Boolean> $showPowerSaveWarning$delegate;
    final /* synthetic */ SnackbarHostState $snackbarHostState;
    final /* synthetic */ boolean $started;
    final /* synthetic */ RunsViewModel $vm;

    /* JADX WARN: Multi-variable type inference failed */
    AppScreenKt$AppScreen$29(MutableState<Boolean> mutableState, MutableState<Long> mutableState2, AppScreenHost appScreenHost, MutableState<Boolean> mutableState3, MutableState<Boolean> mutableState4, MutableState<Boolean> mutableState5, Context context, MainActivity mainActivity, NavHostController navHostController, MutableState<Boolean> mutableState6, SnackbarHostState snackbarHostState, State<TrackingUiState> state, MutableState<Long> mutableState7, MutableState<Long> mutableState8, State<? extends List<RouteEntity>> state2, State<BleStatus> state3, State<? extends List<GymSessionEntity>> state4, MutableState<String> mutableState9, State<GymLoadStats> state5, Function1<? super Long, Unit> function1, MutableState<Long> mutableState10, RunsViewModel runsViewModel, boolean z, Function0<Unit> function0, Function0<Unit> function02, BleClient bleClient, boolean z2) {
        this.$showDeleteAll$delegate = mutableState;
        this.$deleteOneId$delegate = mutableState2;
        this.$host = appScreenHost;
        this.$showConfirmStart$delegate = mutableState3;
        this.$showPowerSaveWarning$delegate = mutableState4;
        this.$pendingStart$delegate = mutableState5;
        this.$ctx = context;
        this.$mainAct = mainActivity;
        this.$navController = navHostController;
        this.$showMoreSheet$delegate = mutableState6;
        this.$snackbarHostState = snackbarHostState;
        this.$live$delegate = state;
        this.$selectedRunId$delegate = mutableState7;
        this.$focusGymSessionId$delegate = mutableState8;
        this.$routes$delegate = state2;
        this.$bleStatus$delegate = state3;
        this.$gymSessions$delegate = state4;
        this.$bleAddr$delegate = mutableState9;
        this.$gymLoad$delegate = state5;
        this.$onExport = function1;
        this.$photoExportRunId$delegate = mutableState10;
        this.$vm = runsViewModel;
        this.$started = z;
        this.$onStart = function0;
        this.$onStop = function02;
        this.$ble = bleClient;
        this.$powerSaveOn = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        TrackingUiState AppScreen$lambda$2;
        Long AppScreen$lambda$13;
        boolean AppScreen$lambda$5;
        final Long AppScreen$lambda$9;
        boolean AppScreen$lambda$79;
        boolean AppScreen$lambda$83;
        TrackingUiState AppScreen$lambda$22;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2041639245, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous> (AppScreen.kt:330)");
            }
            Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            final Context context = this.$ctx;
            AppScreenHost appScreenHost = this.$host;
            MainActivity mainActivity = this.$mainAct;
            NavHostController navHostController = this.$navController;
            MutableState<Boolean> mutableState = this.$showMoreSheet$delegate;
            final SnackbarHostState snackbarHostState = this.$snackbarHostState;
            State<TrackingUiState> state = this.$live$delegate;
            MutableState<Long> mutableState2 = this.$selectedRunId$delegate;
            MutableState<Long> mutableState3 = this.$focusGymSessionId$delegate;
            State<List<RouteEntity>> state2 = this.$routes$delegate;
            State<BleStatus> state3 = this.$bleStatus$delegate;
            State<List<GymSessionEntity>> state4 = this.$gymSessions$delegate;
            MutableState<String> mutableState4 = this.$bleAddr$delegate;
            State<GymLoadStats> state5 = this.$gymLoad$delegate;
            Function1<Long, Unit> function1 = this.$onExport;
            MutableState<Long> mutableState5 = this.$photoExportRunId$delegate;
            RunsViewModel runsViewModel = this.$vm;
            boolean z = this.$started;
            Function0<Unit> function0 = this.$onStart;
            Function0<Unit> function02 = this.$onStop;
            MutableState<Boolean> mutableState6 = this.$showConfirmStart$delegate;
            BleClient bleClient = this.$ble;
            MutableState<Boolean> mutableState7 = this.$showDeleteAll$delegate;
            MutableState<Long> mutableState8 = this.$deleteOneId$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxSize$default);
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
            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            ScaffoldKt.m2091ScaffoldTvnljyQ(null, ComposableLambdaKt.rememberComposableLambda(-2117014615, true, new AppScreenKt$AppScreen$29$1$1(appScreenHost, mainActivity, context), composer, 54), ComposableLambdaKt.rememberComposableLambda(-1343972664, true, new AppScreenKt$AppScreen$29$1$2(navHostController, mutableState), composer, 54), ComposableLambdaKt.rememberComposableLambda(-570930713, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-570930713, i2, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous>.<anonymous> (AppScreen.kt:332)");
                    }
                    SnackbarHostKt.SnackbarHost(SnackbarHostState.this, null, null, composer2, 6, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), null, 0, 0L, 0L, null, ComposableLambdaKt.rememberComposableLambda(29476158, true, new AppScreenKt$AppScreen$29$1$4(navHostController, state, mutableState2, mutableState3, state2, state3, state4, mutableState4, state5, function1, mutableState5, runsViewModel, mainActivity, z, function0, function02, mutableState6, bleClient, context, mutableState7, mutableState8), composer, 54), composer, 805309872, 497);
            composer.startReplaceGroup(2029320547);
            AppScreen$lambda$2 = AppScreenKt.AppScreen$lambda$2(state);
            if (AppScreen$lambda$2.isRecording()) {
                AppScreen$lambda$22 = AppScreenKt.AppScreen$lambda$2(state);
                boolean isPaused = AppScreen$lambda$22.isPaused();
                composer.startReplaceGroup(2029324136);
                boolean changedInstance = composer.changedInstance(context);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$6$lambda$1$lambda$0;
                            invoke$lambda$6$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.invoke$lambda$6$lambda$1$lambda$0(context);
                            return invoke$lambda$6$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                Function0 function03 = (Function0) rememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(2029326993);
                boolean changedInstance2 = composer.changedInstance(context);
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$6$lambda$3$lambda$2;
                            invoke$lambda$6$lambda$3$lambda$2 = AppScreenKt$AppScreen$29.invoke$lambda$6$lambda$3$lambda$2(context);
                            return invoke$lambda$6$lambda$3$lambda$2;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                Function0 function04 = (Function0) rememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(2029330096);
                boolean changedInstance3 = composer.changedInstance(context);
                Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$6$lambda$5$lambda$4;
                            invoke$lambda$6$lambda$5$lambda$4 = AppScreenKt$AppScreen$29.invoke$lambda$6$lambda$5$lambda$4(context);
                            return invoke$lambda$6$lambda$5$lambda$4;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                RecordingLockControlsKt.RecordingLockControls(isPaused, function03, function04, (Function0) rememberedValue3, boxScopeInstance.align(Modifier.INSTANCE, Alignment.INSTANCE.getBottomCenter()), composer, 0, 0);
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            AppScreen$lambda$13 = AppScreenKt.AppScreen$lambda$13(this.$photoExportRunId$delegate);
            composer.startReplaceGroup(-1032200420);
            if (AppScreen$lambda$13 != null) {
                final MutableState<Long> mutableState9 = this.$photoExportRunId$delegate;
                long longValue = AppScreen$lambda$13.longValue();
                composer.startReplaceGroup(2029338988);
                boolean changed = composer.changed(mutableState9);
                Object rememberedValue4 = composer.rememberedValue();
                if (changed || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$9$lambda$8$lambda$7;
                            invoke$lambda$9$lambda$8$lambda$7 = AppScreenKt$AppScreen$29.invoke$lambda$9$lambda$8$lambda$7(MutableState.this);
                            return invoke$lambda$9$lambda$8$lambda$7;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue4);
                }
                composer.endReplaceGroup();
                RunOverlayExportDialogKt.RunOverlayExportDialog(longValue, (Function0) rememberedValue4, composer, 0);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1032195364);
            AppScreen$lambda$5 = AppScreenKt.AppScreen$lambda$5(this.$showDeleteAll$delegate);
            if (AppScreen$lambda$5) {
                composer.startReplaceGroup(-1032193589);
                boolean changed2 = composer.changed(this.$showDeleteAll$delegate);
                final MutableState<Boolean> mutableState10 = this.$showDeleteAll$delegate;
                Object rememberedValue5 = composer.rememberedValue();
                if (changed2 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$11$lambda$10;
                            invoke$lambda$11$lambda$10 = AppScreenKt$AppScreen$29.invoke$lambda$11$lambda$10(MutableState.this);
                            return invoke$lambda$11$lambda$10;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue5);
                }
                composer.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue5, ComposableLambdaKt.rememberComposableLambda(40030272, true, new AnonymousClass4(this.$showDeleteAll$delegate, this.$vm), composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1722795454, true, new AnonymousClass5(this.$showDeleteAll$delegate), composer, 54), null, ComposableSingletons$AppScreenKt.INSTANCE.m7460getLambda13$app_sideload(), ComposableSingletons$AppScreenKt.INSTANCE.m7461getLambda14$app_sideload(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer, 1772592, 0, 16276);
            }
            composer.endReplaceGroup();
            AppScreen$lambda$9 = AppScreenKt.AppScreen$lambda$9(this.$deleteOneId$delegate);
            composer.startReplaceGroup(-1032175547);
            if (AppScreen$lambda$9 != null) {
                composer.startReplaceGroup(-1032173752);
                boolean changed3 = composer.changed(this.$deleteOneId$delegate);
                final MutableState<Long> mutableState11 = this.$deleteOneId$delegate;
                Object rememberedValue6 = composer.rememberedValue();
                if (changed3 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$13$lambda$12;
                            invoke$lambda$13$lambda$12 = AppScreenKt$AppScreen$29.invoke$lambda$13$lambda$12(MutableState.this);
                            return invoke$lambda$13$lambda$12;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue6);
                }
                composer.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue6, ComposableLambdaKt.rememberComposableLambda(-54029079, true, new AnonymousClass7(this.$deleteOneId$delegate, this.$vm, AppScreen$lambda$9), composer, 54), null, ComposableLambdaKt.rememberComposableLambda(-1912437141, true, new AnonymousClass8(this.$deleteOneId$delegate), composer, 54), null, ComposableLambdaKt.rememberComposableLambda(524122093, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29.9
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(524122093, i2, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:461)");
                        }
                        TextKt.m2376Text4IGK_g("Delete run #" + AppScreen$lambda$9 + "?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), ComposableSingletons$AppScreenKt.INSTANCE.m7464getLambda17$app_sideload(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer, 1772592, 0, 16276);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1032156054);
            AppScreen$lambda$79 = AppScreenKt.AppScreen$lambda$79(this.$showConfirmStart$delegate);
            if (AppScreen$lambda$79) {
                final boolean isBike = ActivityTypes.INSTANCE.isBike(this.$host.getGpsActivityType());
                composer.startReplaceGroup(-1032153394);
                boolean changed4 = composer.changed(this.$showConfirmStart$delegate);
                final MutableState<Boolean> mutableState12 = this.$showConfirmStart$delegate;
                Object rememberedValue7 = composer.rememberedValue();
                if (changed4 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$15$lambda$14;
                            invoke$lambda$15$lambda$14 = AppScreenKt$AppScreen$29.invoke$lambda$15$lambda$14(MutableState.this);
                            return invoke$lambda$15$lambda$14;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue7);
                }
                Function0 function05 = (Function0) rememberedValue7;
                composer.endReplaceGroup();
                ComposableLambda rememberComposableLambda = ComposableLambdaKt.rememberComposableLambda(-290646904, true, new AnonymousClass11(this.$showConfirmStart$delegate, this.$pendingStart$delegate, this.$showPowerSaveWarning$delegate, this.$powerSaveOn, this.$onStart), composer, 54);
                ComposableLambda rememberComposableLambda2 = ComposableLambdaKt.rememberComposableLambda(2145912330, true, new AnonymousClass12(this.$showConfirmStart$delegate), composer, 54);
                ComposableLambda rememberComposableLambda3 = ComposableLambdaKt.rememberComposableLambda(287504268, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29.13
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i2) {
                        if ((i2 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(287504268, i2, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:480)");
                        }
                        TextKt.m2376Text4IGK_g(isBike ? "Start bike ride?" : "Start run?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54);
                final AppScreenHost appScreenHost2 = this.$host;
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(function05, rememberComposableLambda, null, rememberComposableLambda2, null, rememberComposableLambda3, ComposableLambdaKt.rememberComposableLambda(1505783885, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29.14
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
                    /* JADX WARN: Removed duplicated region for block: B:45:0x00b3  */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final void invoke(Composer composer2, int i2) {
                        String str;
                        String concat;
                        String str2;
                        if ((i2 & 3) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1505783885, i2, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:483)");
                            }
                            if (isBike) {
                                String planType = appScreenHost2.getPlanType();
                                int hashCode = planType.hashCode();
                                if (hashCode == -1761323007) {
                                    if (planType.equals(TrackingService.PLAN_TIME_INTERVALS)) {
                                        str2 = "Ride time intervals preset.";
                                        concat = str2.concat(Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE) ? " Race-day GPS mode." : "");
                                    }
                                    str2 = "Custom ride workout (time, distance, speed).";
                                    concat = str2.concat(Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE) ? " Race-day GPS mode." : "");
                                } else if (hashCode == -166532135) {
                                    if (planType.equals(TrackingService.PLAN_DISTANCE_INTERVALS)) {
                                        str2 = "Ride distance intervals preset.";
                                        concat = str2.concat(Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE) ? " Race-day GPS mode." : "");
                                    }
                                    str2 = "Custom ride workout (time, distance, speed).";
                                    concat = str2.concat(Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE) ? " Race-day GPS mode." : "");
                                } else {
                                    if (hashCode == 3151468 && planType.equals(TrackingService.PLAN_FREE_RUN)) {
                                        str2 = "GPS bike ride — km/h & km stats, km beeps.";
                                        concat = str2.concat(Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE) ? " Race-day GPS mode." : "");
                                    }
                                    str2 = "Custom ride workout (time, distance, speed).";
                                    concat = str2.concat(Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE) ? " Race-day GPS mode." : "");
                                }
                            } else {
                                String planType2 = appScreenHost2.getPlanType();
                                int hashCode2 = planType2.hashCode();
                                if (hashCode2 == -1761323007) {
                                    if (planType2.equals(TrackingService.PLAN_TIME_INTERVALS)) {
                                        str = "Time intervals preset.";
                                        concat = str.concat((isBike && Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE)) ? " Race-day GPS mode." : "");
                                    }
                                    str = "Custom workout.";
                                    concat = str.concat((isBike && Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE)) ? " Race-day GPS mode." : "");
                                } else if (hashCode2 == -166532135) {
                                    if (planType2.equals(TrackingService.PLAN_DISTANCE_INTERVALS)) {
                                        str = "Distance intervals preset.";
                                        concat = str.concat((isBike && Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE)) ? " Race-day GPS mode." : "");
                                    }
                                    str = "Custom workout.";
                                    concat = str.concat((isBike && Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE)) ? " Race-day GPS mode." : "");
                                } else {
                                    if (hashCode2 == 3151468 && planType2.equals(TrackingService.PLAN_FREE_RUN)) {
                                        str = "Free run.";
                                        concat = str.concat((isBike && Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE)) ? " Race-day GPS mode." : "");
                                    }
                                    str = "Custom workout.";
                                    concat = str.concat((isBike && Intrinsics.areEqual(appScreenHost2.getRunPreset(), TrackingService.BATTERY_RACE)) ? " Race-day GPS mode." : "");
                                }
                            }
                            TextKt.m2376Text4IGK_g(concat, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }, composer, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer, 1772592, 0, 16276);
            }
            composer.endReplaceGroup();
            AppScreen$lambda$83 = AppScreenKt.AppScreen$lambda$83(this.$showPowerSaveWarning$delegate);
            if (AppScreen$lambda$83) {
                composer.startReplaceGroup(-1032095960);
                boolean changed5 = composer.changed(this.$showPowerSaveWarning$delegate) | composer.changed(this.$pendingStart$delegate);
                final MutableState<Boolean> mutableState13 = this.$showPowerSaveWarning$delegate;
                final MutableState<Boolean> mutableState14 = this.$pendingStart$delegate;
                Object rememberedValue8 = composer.rememberedValue();
                if (changed5 || rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue8 = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$17$lambda$16;
                            invoke$lambda$17$lambda$16 = AppScreenKt$AppScreen$29.invoke$lambda$17$lambda$16(MutableState.this, mutableState14);
                            return invoke$lambda$17$lambda$16;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue8);
                }
                composer.endReplaceGroup();
                AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0((Function0) rememberedValue8, ComposableLambdaKt.rememberComposableLambda(-527264729, true, new AnonymousClass16(this.$showPowerSaveWarning$delegate, this.$pendingStart$delegate, this.$ctx), composer, 54), null, ComposableLambdaKt.rememberComposableLambda(1909294505, true, new AnonymousClass17(this.$showPowerSaveWarning$delegate, this.$pendingStart$delegate, this.$onStart), composer, 54), null, ComposableSingletons$AppScreenKt.INSTANCE.m7470getLambda22$app_sideload(), ComposableSingletons$AppScreenKt.INSTANCE.m7471getLambda23$app_sideload(), null, 0L, 0L, 0L, 0L, 0.0f, null, composer, 1772592, 0, 16276);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$1$lambda$0(Context context) {
        RecordingLockControlsKt.sendTrackingAction(context, TrackingService.ACTION_LAP);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$3$lambda$2(Context context) {
        RecordingLockControlsKt.sendTrackingAction(context, TrackingService.ACTION_TOGGLE_PAUSE);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5$lambda$4(Context context) {
        RecordingLockControlsKt.sendTrackingAction(context, TrackingService.ACTION_MARK_HAZARD);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$9$lambda$8$lambda$7(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10(MutableState mutableState) {
        AppScreenKt.AppScreen$lambda$6(mutableState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$4, reason: invalid class name */
    static final class AnonymousClass4 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<Boolean> $showDeleteAll$delegate;
        final /* synthetic */ RunsViewModel $vm;

        AnonymousClass4(MutableState<Boolean> mutableState, RunsViewModel runsViewModel) {
            this.$showDeleteAll$delegate = mutableState;
            this.$vm = runsViewModel;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(40030272, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:446)");
            }
            composer.startReplaceGroup(2029350389);
            boolean changed = composer.changed(this.$showDeleteAll$delegate) | composer.changedInstance(this.$vm);
            final RunsViewModel runsViewModel = this.$vm;
            final MutableState<Boolean> mutableState = this.$showDeleteAll$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass4.invoke$lambda$1$lambda$0(RunsViewModel.this, mutableState);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7458getLambda11$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RunsViewModel runsViewModel, MutableState mutableState) {
            AppScreenKt.AppScreen$lambda$6(mutableState, false);
            runsViewModel.deleteAllRuns();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$5, reason: invalid class name */
    static final class AnonymousClass5 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<Boolean> $showDeleteAll$delegate;

        AnonymousClass5(MutableState<Boolean> mutableState) {
            this.$showDeleteAll$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
            AppScreenKt.AppScreen$lambda$6(mutableState, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1722795454, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:452)");
            }
            composer.startReplaceGroup(2029356938);
            boolean changed = composer.changed(this.$showDeleteAll$delegate);
            final MutableState<Boolean> mutableState = this.$showDeleteAll$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass5.invoke$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7459getLambda12$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12(MutableState mutableState) {
        mutableState.setValue(null);
        return Unit.INSTANCE;
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$7, reason: invalid class name */
    static final class AnonymousClass7 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Long $delId;
        final /* synthetic */ MutableState<Long> $deleteOneId$delegate;
        final /* synthetic */ RunsViewModel $vm;

        AnonymousClass7(MutableState<Long> mutableState, RunsViewModel runsViewModel, Long l) {
            this.$deleteOneId$delegate = mutableState;
            this.$vm = runsViewModel;
            this.$delId = l;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-54029079, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:464)");
            }
            composer.startReplaceGroup(2029369651);
            boolean changed = composer.changed(this.$deleteOneId$delegate) | composer.changedInstance(this.$vm) | composer.changed(this.$delId);
            final RunsViewModel runsViewModel = this.$vm;
            final Long l = this.$delId;
            final MutableState<Long> mutableState = this.$deleteOneId$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$7$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass7.invoke$lambda$1$lambda$0(RunsViewModel.this, l, mutableState);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7462getLambda15$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RunsViewModel runsViewModel, Long l, MutableState mutableState) {
            mutableState.setValue(null);
            runsViewModel.deleteRun(l.longValue());
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$8, reason: invalid class name */
    static final class AnonymousClass8 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<Long> $deleteOneId$delegate;

        AnonymousClass8(MutableState<Long> mutableState) {
            this.$deleteOneId$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
            mutableState.setValue(null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1912437141, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:470)");
            }
            composer.startReplaceGroup(2029376135);
            boolean changed = composer.changed(this.$deleteOneId$delegate);
            final MutableState<Long> mutableState = this.$deleteOneId$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$8$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass8.invoke$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7463getLambda16$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$15$lambda$14(MutableState mutableState) {
        AppScreenKt.AppScreen$lambda$80(mutableState, false);
        return Unit.INSTANCE;
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$11, reason: invalid class name */
    static final class AnonymousClass11 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onStart;
        final /* synthetic */ MutableState<Boolean> $pendingStart$delegate;
        final /* synthetic */ boolean $powerSaveOn;
        final /* synthetic */ MutableState<Boolean> $showConfirmStart$delegate;
        final /* synthetic */ MutableState<Boolean> $showPowerSaveWarning$delegate;

        AnonymousClass11(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, MutableState<Boolean> mutableState3, boolean z, Function0<Unit> function0) {
            this.$showConfirmStart$delegate = mutableState;
            this.$pendingStart$delegate = mutableState2;
            this.$showPowerSaveWarning$delegate = mutableState3;
            this.$powerSaveOn = z;
            this.$onStart = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-290646904, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:501)");
            }
            composer.startReplaceGroup(2029425440);
            boolean changed = composer.changed(this.$showConfirmStart$delegate) | composer.changed(this.$pendingStart$delegate) | composer.changed(this.$showPowerSaveWarning$delegate) | composer.changed(this.$powerSaveOn) | composer.changed(this.$onStart);
            final boolean z = this.$powerSaveOn;
            final Function0<Unit> function0 = this.$onStart;
            final MutableState<Boolean> mutableState = this.$showConfirmStart$delegate;
            final MutableState<Boolean> mutableState2 = this.$pendingStart$delegate;
            final MutableState<Boolean> mutableState3 = this.$showPowerSaveWarning$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$11$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass11.invoke$lambda$1$lambda$0(z, function0, mutableState, mutableState2, mutableState3);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7465getLambda18$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(boolean z, Function0 function0, MutableState mutableState, MutableState mutableState2, MutableState mutableState3) {
            AppScreenKt.AppScreen$lambda$80(mutableState, false);
            AppScreenKt.AppScreen$lambda$88(mutableState2, true);
            AppScreenKt.AppScreen$lambda$84(mutableState3, z);
            if (!z) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$12, reason: invalid class name */
    static final class AnonymousClass12 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ MutableState<Boolean> $showConfirmStart$delegate;

        AnonymousClass12(MutableState<Boolean> mutableState) {
            this.$showConfirmStart$delegate = mutableState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
            AppScreenKt.AppScreen$lambda$80(mutableState, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2145912330, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:509)");
            }
            composer.startReplaceGroup(2029435277);
            boolean changed = composer.changed(this.$showConfirmStart$delegate);
            final MutableState<Boolean> mutableState = this.$showConfirmStart$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$12$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass12.invoke$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7466getLambda19$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16(MutableState mutableState, MutableState mutableState2) {
        AppScreenKt.AppScreen$lambda$84(mutableState, false);
        AppScreenKt.AppScreen$lambda$88(mutableState2, false);
        return Unit.INSTANCE;
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$16, reason: invalid class name */
    static final class AnonymousClass16 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Context $ctx;
        final /* synthetic */ MutableState<Boolean> $pendingStart$delegate;
        final /* synthetic */ MutableState<Boolean> $showPowerSaveWarning$delegate;

        AnonymousClass16(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Context context) {
            this.$showPowerSaveWarning$delegate = mutableState;
            this.$pendingStart$delegate = mutableState2;
            this.$ctx = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-527264729, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:522)");
            }
            composer.startReplaceGroup(2029452029);
            boolean changed = composer.changed(this.$showPowerSaveWarning$delegate) | composer.changed(this.$pendingStart$delegate) | composer.changedInstance(this.$ctx);
            final Context context = this.$ctx;
            final MutableState<Boolean> mutableState = this.$showPowerSaveWarning$delegate;
            final MutableState<Boolean> mutableState2 = this.$pendingStart$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$16$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass16.invoke$lambda$1$lambda$0(context, mutableState, mutableState2);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7468getLambda20$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Context context, MutableState mutableState, MutableState mutableState2) {
            AppScreenKt.AppScreen$lambda$84(mutableState, false);
            AppScreenKt.AppScreen$lambda$88(mutableState2, false);
            try {
                context.startActivity(new Intent("android.settings.BATTERY_SAVER_SETTINGS").addFlags(268435456));
            } catch (Exception unused) {
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AppScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$17, reason: invalid class name */
    static final class AnonymousClass17 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onStart;
        final /* synthetic */ MutableState<Boolean> $pendingStart$delegate;
        final /* synthetic */ MutableState<Boolean> $showPowerSaveWarning$delegate;

        AnonymousClass17(MutableState<Boolean> mutableState, MutableState<Boolean> mutableState2, Function0<Unit> function0) {
            this.$showPowerSaveWarning$delegate = mutableState;
            this.$pendingStart$delegate = mutableState2;
            this.$onStart = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1909294505, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous> (AppScreen.kt:532)");
            }
            composer.startReplaceGroup(2029466176);
            boolean changed = composer.changed(this.$showPowerSaveWarning$delegate) | composer.changed(this.$pendingStart$delegate) | composer.changed(this.$onStart);
            final Function0<Unit> function0 = this.$onStart;
            final MutableState<Boolean> mutableState = this.$showPowerSaveWarning$delegate;
            final MutableState<Boolean> mutableState2 = this.$pendingStart$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$17$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29.AnonymousClass17.invoke$lambda$1$lambda$0(Function0.this, mutableState, mutableState2);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7469getLambda21$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Function0 function0, MutableState mutableState, MutableState mutableState2) {
            boolean AppScreen$lambda$87;
            AppScreenKt.AppScreen$lambda$84(mutableState, false);
            AppScreen$lambda$87 = AppScreenKt.AppScreen$lambda$87(mutableState2);
            AppScreenKt.AppScreen$lambda$88(mutableState2, false);
            if (AppScreen$lambda$87) {
                function0.invoke();
            }
            return Unit.INSTANCE;
        }
    }
}
