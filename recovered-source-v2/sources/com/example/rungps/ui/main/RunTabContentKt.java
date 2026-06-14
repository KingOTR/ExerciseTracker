package com.example.rungps.ui.main;

import android.content.Context;
import android.content.Intent;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.MainActivity;
import com.example.rungps.analytics.HeartRateZones;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.data.UserProfile;
import com.example.rungps.data.UserProfileStore;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.TrackingService;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.sport.SportTrackingPrefs;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RunTabContent.kt */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\u001a\u00ad\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u001c\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0004\u0012\u00020\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00182\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010%¨\u0006&²\u0006\n\u0010'\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\u0010\u0010(\u001a\b\u0012\u0004\u0012\u00020)0\u0010X\u008a\u008e\u0002²\u0006\n\u0010*\u001a\u00020+X\u008a\u008e\u0002²\u0006\n\u0010,\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\f\u0010-\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\n\u0010/\u001a\u00020\u001cX\u008a\u008e\u0002²\u0006\u0016\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000501X\u008a\u008e\u0002²\u0006\u0016\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000501X\u008a\u008e\u0002²\u0006\u0010\u00103\u001a\b\u0012\u0004\u0012\u0002040\u0010X\u008a\u008e\u0002²\u0006\u0016\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020601X\u008a\u008e\u0002²\u0006\f\u00107\u001a\u0004\u0018\u00010\u0005X\u008a\u008e\u0002"}, d2 = {"RunTabContent", "", "mainAct", "Lcom/example/rungps/MainActivity;", "selectedRunId", "", "onCloseRun", "Lkotlin/Function0;", "onExport", "Lkotlin/Function1;", "onShareOnPhoto", "vm", "Lcom/example/rungps/feature/run/RunsViewModel;", "live", "Lcom/example/rungps/tracking/TrackingUiState;", "routes", "", "Lcom/example/rungps/data/RouteEntity;", "bleStatus", "Lcom/example/rungps/ble/BleStatus;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "followRouteId", "followRouteName", "", "onFollowRoute", "Lkotlin/Function2;", "started", "", "onStart", "onStop", "onShowConfirmStart", "ble", "Lcom/example/rungps/ble/BleClient;", "bleAddr", "onBleAddr", "goTab", "(Lcom/example/rungps/MainActivity;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/example/rungps/feature/run/RunsViewModel;Lcom/example/rungps/tracking/TrackingUiState;Ljava/util/List;Lcom/example/rungps/ble/BleStatus;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function2;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/example/rungps/ble/BleClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "app_sideload", "hideWatchPanel", "savedWatches", "Lcom/example/rungps/ble/SavedBleWatch;", "hcStatus", "", "hcHasStepsRead", "hcLastSteps", "hcBusy", "hcAutoBackup", "localRunPbsForZones", "", "localRidePbsForZones", "preStartGear", "Lcom/example/rungps/data/GearEntity;", "preStartKm", "", "preStartGearId"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RunTabContentKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunTabContent$lambda$14(MainActivity mainActivity, Long l, Function0 function0, Function1 function1, Function1 function12, RunsViewModel runsViewModel, TrackingUiState trackingUiState, List list, BleStatus bleStatus, List list2, Long l2, String str, Function2 function2, boolean z, Function0 function02, Function0 function03, Function1 function13, BleClient bleClient, String str2, Function1 function14, Function1 function15, int i, int i2, int i3, Composer composer, int i4) {
        RunTabContent(mainActivity, l, function0, function1, function12, runsViewModel, trackingUiState, list, bleStatus, list2, l2, str, function2, z, function02, function03, function13, bleClient, str2, function14, function15, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunTabContent$lambda$2(MainActivity mainActivity, Long l, Function0 function0, Function1 function1, Function1 function12, RunsViewModel runsViewModel, TrackingUiState trackingUiState, List list, BleStatus bleStatus, List list2, Long l2, String str, Function2 function2, boolean z, Function0 function02, Function0 function03, Function1 function13, BleClient bleClient, String str2, Function1 function14, Function1 function15, int i, int i2, int i3, Composer composer, int i4) {
        RunTabContent(mainActivity, l, function0, function1, function12, runsViewModel, trackingUiState, list, bleStatus, list2, l2, str, function2, z, function02, function03, function13, bleClient, str2, function14, function15, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunTabContent$lambda$3(MainActivity mainActivity, Long l, Function0 function0, Function1 function1, Function1 function12, RunsViewModel runsViewModel, TrackingUiState trackingUiState, List list, BleStatus bleStatus, List list2, Long l2, String str, Function2 function2, boolean z, Function0 function02, Function0 function03, Function1 function13, BleClient bleClient, String str2, Function1 function14, Function1 function15, int i, int i2, int i3, Composer composer, int i4) {
        RunTabContent(mainActivity, l, function0, function1, function12, runsViewModel, trackingUiState, list, bleStatus, list2, l2, str, function2, z, function02, function03, function13, bleClient, str2, function14, function15, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3));
        return Unit.INSTANCE;
    }

    public static final void RunTabContent(final MainActivity mainActivity, final Long l, final Function0<Unit> onCloseRun, final Function1<? super Long, Unit> onExport, final Function1<? super Long, Unit> onShareOnPhoto, final RunsViewModel vm, final TrackingUiState live, final List<RouteEntity> routes, final BleStatus bleStatus, final List<GymSessionEntity> gymSessions, final Long l2, final String str, final Function2<? super Long, ? super String, Unit> onFollowRoute, final boolean z, final Function0<Unit> onStart, final Function0<Unit> onStop, final Function1<? super Boolean, Unit> onShowConfirmStart, final BleClient ble, final String bleAddr, final Function1<? super String, Unit> onBleAddr, final Function1<? super String, Unit> goTab, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        final Context context;
        int i7;
        int i8;
        Composer composer2;
        Intrinsics.checkNotNullParameter(onCloseRun, "onCloseRun");
        Intrinsics.checkNotNullParameter(onExport, "onExport");
        Intrinsics.checkNotNullParameter(onShareOnPhoto, "onShareOnPhoto");
        Intrinsics.checkNotNullParameter(vm, "vm");
        Intrinsics.checkNotNullParameter(live, "live");
        Intrinsics.checkNotNullParameter(routes, "routes");
        Intrinsics.checkNotNullParameter(bleStatus, "bleStatus");
        Intrinsics.checkNotNullParameter(gymSessions, "gymSessions");
        Intrinsics.checkNotNullParameter(onFollowRoute, "onFollowRoute");
        Intrinsics.checkNotNullParameter(onStart, "onStart");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        Intrinsics.checkNotNullParameter(onShowConfirmStart, "onShowConfirmStart");
        Intrinsics.checkNotNullParameter(ble, "ble");
        Intrinsics.checkNotNullParameter(bleAddr, "bleAddr");
        Intrinsics.checkNotNullParameter(onBleAddr, "onBleAddr");
        Intrinsics.checkNotNullParameter(goTab, "goTab");
        Composer startRestartGroup = composer.startRestartGroup(1468460627);
        if ((i & 6) == 0) {
            i4 = i | (startRestartGroup.changedInstance(mainActivity) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i4 |= startRestartGroup.changedInstance(onCloseRun) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changedInstance(onExport) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onShareOnPhoto) ? 16384 : 8192;
        }
        if ((i & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i4 |= startRestartGroup.changedInstance(vm) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= startRestartGroup.changed(live) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i4 |= startRestartGroup.changedInstance(routes) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i4 |= startRestartGroup.changedInstance(bleStatus) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        int i9 = i4;
        if ((i2 & 6) == 0) {
            i5 = i2 | (startRestartGroup.changed(l2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 |= startRestartGroup.changedInstance(onFollowRoute) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i5 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i2 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i5 |= startRestartGroup.changedInstance(onStop) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= startRestartGroup.changedInstance(onShowConfirmStart) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= startRestartGroup.changedInstance(ble) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= startRestartGroup.changed(bleAddr) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= startRestartGroup.changedInstance(onBleAddr) ? 536870912 : 268435456;
        }
        int i10 = i5;
        if ((i3 & 6) == 0) {
            i6 = i3 | (startRestartGroup.changedInstance(goTab) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if ((i9 & 38347923) != 38347922 || (306775187 & i10) != 306775186 || (i6 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1468460627, i9, i10, "com.example.rungps.ui.main.RunTabContent (RunTabContent.kt:91)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            Context context2 = (Context) consume;
            startRestartGroup.startReplaceGroup(190904089);
            if (l != null && !live.isRecording()) {
                long longValue = l.longValue();
                startRestartGroup.startReplaceGroup(190910391);
                boolean z2 = ((i9 & SdkConfig.SDK_VERSION) == 32) | ((57344 & i9) == 16384);
                Object rememberedValue = startRestartGroup.rememberedValue();
                if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.RunTabContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit RunTabContent$lambda$1$lambda$0;
                            RunTabContent$lambda$1$lambda$0 = RunTabContentKt.RunTabContent$lambda$1$lambda$0(Function1.this, l);
                            return RunTabContent$lambda$1$lambda$0;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue);
                }
                startRestartGroup.endReplaceGroup();
                HomeRunControlsKt.RunDetailsCard(longValue, onCloseRun, onExport, (Function0) rememberedValue, vm, startRestartGroup, (i9 >> 3) & 58366);
                startRestartGroup.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RunTabContentKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit RunTabContent$lambda$2;
                            RunTabContent$lambda$2 = RunTabContentKt.RunTabContent$lambda$2(MainActivity.this, l, onCloseRun, onExport, onShareOnPhoto, vm, live, routes, bleStatus, gymSessions, l2, str, onFollowRoute, z, onStart, onStop, onShowConfirmStart, ble, bleAddr, onBleAddr, goTab, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return RunTabContent$lambda$2;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.endReplaceGroup();
            if (mainActivity == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RunTabContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit RunTabContent$lambda$3;
                            RunTabContent$lambda$3 = RunTabContentKt.RunTabContent$lambda$3(MainActivity.this, l, onCloseRun, onExport, onShareOnPhoto, vm, live, routes, bleStatus, gymSessions, l2, str, onFollowRoute, z, onStart, onStop, onShowConfirmStart, ble, bleAddr, onBleAddr, goTab, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            return RunTabContent$lambda$3;
                        }
                    });
                    return;
                }
                return;
            }
            startRestartGroup.startReplaceGroup(190914472);
            if (live.isRecording()) {
                context = context2;
                i7 = i9;
                i8 = i10;
            } else {
                context = context2;
                i7 = i9;
                i8 = i10;
                TabUiKt.TabHeroHeader("Run", bleStatus.getConnectedAddress() != null ? "Watch connected · GPS run & ride" : "GPS run & ride recording", null, null, startRestartGroup, 6, 12);
            }
            startRestartGroup.endReplaceGroup();
            String displayName = SportTrackingPrefs.INSTANCE.displayName(context);
            startRestartGroup.startReplaceGroup(190925557);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                Object resolvedAgeYears$default = UserProfile.resolvedAgeYears$default(UserProfileStore.INSTANCE.load(context), null, 1, null);
                startRestartGroup.updateRememberedValue(resolvedAgeYears$default);
                rememberedValue2 = resolvedAgeYears$default;
            }
            Integer num = (Integer) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            Integer latestHrBpm = bleStatus.getLatestHrBpm();
            String labelForBpm = latestHrBpm != null ? HeartRateZones.INSTANCE.labelForBpm(latestHrBpm.intValue(), num) : null;
            if (live.isRecording()) {
                startRestartGroup.startReplaceGroup(1623935959);
                boolean areEqual = Intrinsics.areEqual(mainActivity.getGpsActivityType(), ActivityTypes.BIKE);
                boolean areEqual2 = Intrinsics.areEqual(mainActivity.getRunPreset(), TrackingService.BATTERY_RACE);
                Integer latestHrBpm2 = bleStatus.getLatestHrBpm();
                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                startRestartGroup.startReplaceGroup(190945249);
                boolean changedInstance = startRestartGroup.changedInstance(context);
                Object rememberedValue3 = startRestartGroup.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.RunTabContentKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit RunTabContent$lambda$9$lambda$8;
                            RunTabContent$lambda$9$lambda$8 = RunTabContentKt.RunTabContent$lambda$9$lambda$8(context);
                            return RunTabContent$lambda$9$lambda$8;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue3);
                }
                Function0 function0 = (Function0) rememberedValue3;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(190953195);
                Object rememberedValue4 = startRestartGroup.rememberedValue();
                if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue4 = new Function1() { // from class: com.example.rungps.ui.main.RunTabContentKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String formatElapsed;
                            formatElapsed = MainActivityFormattersKt.formatElapsed(((Long) obj).longValue());
                            return formatElapsed;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue4);
                }
                Function1 function1 = (Function1) rememberedValue4;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(190954600);
                Object rememberedValue5 = startRestartGroup.rememberedValue();
                if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue5 = new Function1() { // from class: com.example.rungps.ui.main.RunTabContentKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            String formatPace;
                            formatPace = MainActivityFormattersKt.formatPace(((Double) obj).doubleValue());
                            return formatPace;
                        }
                    };
                    startRestartGroup.updateRememberedValue(rememberedValue5);
                }
                startRestartGroup.endReplaceGroup();
                int i11 = i8 << 3;
                RecordingScreenKt.ActiveRecordingPane(live, l2, str, areEqual, function0, onStop, function1, (Function1) rememberedValue5, labelForBpm, areEqual2, latestHrBpm2, fillMaxSize$default, startRestartGroup, ((i7 >> 18) & 14) | 14155776 | (i11 & SdkConfig.SDK_VERSION) | (i11 & 896) | (i8 & 458752), 48, 0);
                startRestartGroup.endReplaceGroup();
                composer2 = startRestartGroup;
            } else {
                startRestartGroup.startReplaceGroup(1625778568);
                composer2 = startRestartGroup;
                TabUiKt.TabSectionCard(null, null, ComposableLambdaKt.rememberComposableLambda(-353155689, true, new RunTabContentKt$RunTabContent$7(live, routes, goTab, l2, context, bleStatus, displayName, ble, bleAddr, onBleAddr, mainActivity, z, onFollowRoute, str, onShowConfirmStart, onStop), composer2, 54), composer2, 384, 3);
                composer2.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup3 = composer2.endRestartGroup();
        if (endRestartGroup3 != null) {
            endRestartGroup3.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RunTabContentKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RunTabContent$lambda$14;
                    RunTabContent$lambda$14 = RunTabContentKt.RunTabContent$lambda$14(MainActivity.this, l, onCloseRun, onExport, onShareOnPhoto, vm, live, routes, bleStatus, gymSessions, l2, str, onFollowRoute, z, onStart, onStop, onShowConfirmStart, ble, bleAddr, onBleAddr, goTab, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    return RunTabContent$lambda$14;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunTabContent$lambda$1$lambda$0(Function1 function1, Long l) {
        function1.invoke(l);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RunTabContent$lambda$9$lambda$8(Context context) {
        Intent intent = new Intent(context, (Class<?>) TrackingService.class);
        intent.setAction(TrackingService.ACTION_TOGGLE_PAUSE);
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m7905constructorimpl(context.startService(intent));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }
}
