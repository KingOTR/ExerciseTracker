package com.example.rungps.ui.main;

import android.content.Context;
import android.content.Intent;
import android.widget.Toast;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import com.example.rungps.MainActivity;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleScanDevice;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.ble.SavedBleWatch;
import com.example.rungps.data.GearEntity;
import com.example.rungps.data.MoyoungImportStats;
import com.example.rungps.data.Repository;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.tracking.RunCuePreview;
import com.example.rungps.tracking.TrackingService;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.navigation.MoreDestination;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RunTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RunTabContentKt$RunTabContent$7 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MainActivity $act;
    final /* synthetic */ BleClient $ble;
    final /* synthetic */ String $bleAddr;
    final /* synthetic */ BleStatus $bleStatus;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Long $followRouteId;
    final /* synthetic */ String $followRouteName;
    final /* synthetic */ Function1<String, Unit> $goTab;
    final /* synthetic */ TrackingUiState $live;
    final /* synthetic */ Function1<String, Unit> $onBleAddr;
    final /* synthetic */ Function2<Long, String, Unit> $onFollowRoute;
    final /* synthetic */ Function1<Boolean, Unit> $onShowConfirmStart;
    final /* synthetic */ Function0<Unit> $onStop;
    final /* synthetic */ List<RouteEntity> $routes;
    final /* synthetic */ String $sportLabelHome;
    final /* synthetic */ boolean $started;

    /* JADX WARN: Multi-variable type inference failed */
    RunTabContentKt$RunTabContent$7(TrackingUiState trackingUiState, List<RouteEntity> list, Function1<? super String, Unit> function1, Long l, Context context, BleStatus bleStatus, String str, BleClient bleClient, String str2, Function1<? super String, Unit> function12, MainActivity mainActivity, boolean z, Function2<? super Long, ? super String, Unit> function2, String str3, Function1<? super Boolean, Unit> function13, Function0<Unit> function0) {
        this.$live = trackingUiState;
        this.$routes = list;
        this.$goTab = function1;
        this.$followRouteId = l;
        this.$ctx = context;
        this.$bleStatus = bleStatus;
        this.$sportLabelHome = str;
        this.$ble = bleClient;
        this.$bleAddr = str2;
        this.$onBleAddr = function12;
        this.$act = mainActivity;
        this.$started = z;
        this.$onFollowRoute = function2;
        this.$followRouteName = str3;
        this.$onShowConfirmStart = function13;
        this.$onStop = function0;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public final void invoke(androidx.compose.foundation.layout.ColumnScope r129, androidx.compose.runtime.Composer r130, int r131) {
        /*
            Method dump skipped, instructions count: 11897
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7.invoke(androidx.compose.foundation.layout.ColumnScope, androidx.compose.runtime.Composer, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(MoreDestination.Map.getRoute());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$7$lambda$3$lambda$2(Function2 function2, Context context) {
        function2.invoke(null, null);
        Toast.makeText(context, "Route cleared", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$7$lambda$6$lambda$5$lambda$4(Function2 function2, RouteEntity routeEntity, Context context) {
        function2.invoke(Long.valueOf(routeEntity.getId()), routeEntity.getName());
        Toast.makeText(context, "Following " + routeEntity.getName() + " — map shows while recording", 0).show();
        return Unit.INSTANCE;
    }

    private static final boolean invoke$lambda$173$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    private static final void invoke$lambda$173$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState invoke$lambda$173$lambda$11$lambda$10(Context context) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(context.getSharedPreferences("settings", 0).getBoolean("hideWatchPanel", false)), null, 2, null);
    }

    private static final List<SavedBleWatch> invoke$lambda$173$lambda$15(MutableState<List<SavedBleWatch>> mutableState) {
        return mutableState.getValue();
    }

    private static final int invoke$lambda$173$lambda$20(MutableState<Integer> mutableState) {
        return mutableState.getValue().intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$173$lambda$21(MutableState<Integer> mutableState, int i) {
        mutableState.setValue(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean invoke$lambda$173$lambda$23(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$173$lambda$24(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState invoke$lambda$173$lambda$26$lambda$25() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    private static final Long invoke$lambda$173$lambda$27(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean invoke$lambda$173$lambda$30(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState invoke$lambda$173$lambda$33$lambda$32(Context context) {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(context.getSharedPreferences("settings", 0).getBoolean("healthConnectAutoBackup", false)), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$37$lambda$36(HealthConnectManager healthConnectManager, MutableState mutableState, Set granted) {
        Intrinsics.checkNotNullParameter(granted, "granted");
        invoke$lambda$173$lambda$24(mutableState, granted.containsAll(healthConnectManager.getStepsReadPermissions()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$45$lambda$44$lambda$43(RowScope rowScope, Context context, HealthConnectManager healthConnectManager) {
        try {
            Result.Companion companion = Result.INSTANCE;
            context.startActivity(healthConnectManager.openHealthConnectApp().addFlags(268435456));
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$54$lambda$47$lambda$46(HealthConnectManager healthConnectManager, Context context, ManagedActivityResultLauncher managedActivityResultLauncher) {
        if (healthConnectManager.permissionController() == null) {
            Toast.makeText(context, "Health Connect not ready — install/update first", 0).show();
            return Unit.INSTANCE;
        }
        managedActivityResultLauncher.launch(healthConnectManager.getAllRequestedPermissions());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$54$lambda$50$lambda$49(RowScope rowScope, Context context, HealthConnectManager healthConnectManager) {
        try {
            Result.Companion companion = Result.INSTANCE;
            context.startActivity(healthConnectManager.openHealthConnectApp().addFlags(268435456));
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$54$lambda$53$lambda$52(RowScope rowScope, Context context, HealthConnectManager healthConnectManager) {
        try {
            Result.Companion companion = Result.INSTANCE;
            context.startActivity(healthConnectManager.openHealthConnectPlayStore());
            Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$57$lambda$56$lambda$55(BleClient bleClient) {
        bleClient.disconnect();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$60$lambda$59(BleClient bleClient, final Context context) {
        bleClient.syncSoccerFromWatch(new Function1() { // from class: com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$$ExternalSyntheticLambda43
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$173$lambda$60$lambda$59$lambda$58;
                invoke$lambda$173$lambda$60$lambda$59$lambda$58 = RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$60$lambda$59$lambda$58(context, (MoyoungImportStats) obj);
                return invoke$lambda$173$lambda$60$lambda$59$lambda$58;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$60$lambda$59$lambda$58(Context context, MoyoungImportStats stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Toast.makeText(context, stats.getMessage(), 1).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$67$lambda$63$lambda$62(BleClient bleClient) {
        bleClient.refreshWatchSoccerStatus();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$67$lambda$66$lambda$65(BleClient bleClient, final Context context) {
        bleClient.syncSoccerFromWatch(new Function1() { // from class: com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit invoke$lambda$173$lambda$67$lambda$66$lambda$65$lambda$64;
                invoke$lambda$173$lambda$67$lambda$66$lambda$65$lambda$64 = RunTabContentKt$RunTabContent$7.invoke$lambda$173$lambda$67$lambda$66$lambda$65$lambda$64(context, (MoyoungImportStats) obj);
                return invoke$lambda$173$lambda$67$lambda$66$lambda$65$lambda$64;
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$67$lambda$66$lambda$65$lambda$64(Context context, MoyoungImportStats stats) {
        Intrinsics.checkNotNullParameter(stats, "stats");
        Toast.makeText(context, stats.getMessage(), 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$71$lambda$70$lambda$69(Context context, MutableState mutableState) {
        invoke$lambda$173$lambda$13(mutableState, true);
        context.getSharedPreferences("settings", 0).edit().putBoolean("hideWatchPanel", true).apply();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$78$lambda$73$lambda$72(BleClient bleClient) {
        bleClient.refreshEnabled();
        BleClient.startScan$default(bleClient, 0L, 1, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$78$lambda$75$lambda$74(BleClient bleClient) {
        bleClient.stopScan();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$78$lambda$77$lambda$76(String str, Context context, BleClient bleClient) {
        String obj = StringsKt.trim((CharSequence) str).toString();
        if (obj.length() > 0) {
            context.getSharedPreferences("settings", 0).edit().putString("bleLastAddress", obj).apply();
        }
        bleClient.connect(obj);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$82$lambda$81$lambda$80$lambda$79(Function1 function1, SavedBleWatch savedBleWatch, BleClient bleClient) {
        function1.invoke(savedBleWatch.getAddress());
        bleClient.connect(savedBleWatch.getAddress());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$84$lambda$83(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(StringsKt.take(it, 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$87$lambda$86$lambda$85(Function1 function1, BleScanDevice bleScanDevice) {
        function1.invoke(bleScanDevice.getAddress());
        return Unit.INSTANCE;
    }

    private static final Map<String, Long> invoke$lambda$173$lambda$90(MutableState<Map<String, Long>> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<String, Long> invoke$lambda$173$lambda$93(MutableState<Map<String, Long>> mutableState) {
        return mutableState.getValue();
    }

    private static final void invoke$lambda$173$testBeepAndVibrate(final Context context, final MainActivity mainActivity) {
        RunCuePreview.INSTANCE.preview(context, mainActivity.getVoiceCuesEnabled$app_sideload(), mainActivity.getBeepCuesEnabled$app_sideload(), mainActivity.getVibrationCuesEnabled$app_sideload(), new Function0() { // from class: com.example.rungps.ui.main.RunTabContentKt$RunTabContent$7$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Unit invoke$lambda$173$testBeepAndVibrate$lambda$97;
                invoke$lambda$173$testBeepAndVibrate$lambda$97 = RunTabContentKt$RunTabContent$7.invoke$lambda$173$testBeepAndVibrate$lambda$97(context, mainActivity);
                return invoke$lambda$173$testBeepAndVibrate$lambda$97;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$testBeepAndVibrate$lambda$97(Context context, MainActivity mainActivity) {
        String str;
        List createListBuilder = CollectionsKt.createListBuilder();
        if (mainActivity.getVoiceCuesEnabled$app_sideload()) {
            createListBuilder.add("voice");
        }
        if (mainActivity.getBeepCuesEnabled$app_sideload()) {
            createListBuilder.add("beep");
        }
        if (mainActivity.getVibrationCuesEnabled$app_sideload()) {
            createListBuilder.add("vibrate");
        }
        List build = CollectionsKt.build(createListBuilder);
        if (build.isEmpty()) {
            str = "Enable voice, beeps, or vibrate to preview cues";
        } else {
            str = "Preview: " + CollectionsKt.joinToString$default(build, ", ", null, null, 0, null, null, 62, null);
        }
        Toast.makeText(context, str, 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$112$lambda$99$lambda$98(MainActivity mainActivity) {
        mainActivity.setAutoPauseEnabled$app_sideload(!mainActivity.getAutoPauseEnabled$app_sideload());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$112$lambda$101$lambda$100(MainActivity mainActivity) {
        mainActivity.setVibrationCuesEnabled$app_sideload(!mainActivity.getVibrationCuesEnabled$app_sideload());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$112$lambda$103$lambda$102(MainActivity mainActivity, Context context) {
        mainActivity.setVoiceCuesEnabled$app_sideload(!mainActivity.getVoiceCuesEnabled$app_sideload());
        context.getSharedPreferences("settings", 0).edit().putBoolean(TrackingService.EXTRA_VOICE_ALERTS, mainActivity.getVoiceCuesEnabled$app_sideload()).apply();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$112$lambda$105$lambda$104(MainActivity mainActivity, Context context) {
        mainActivity.setBeepCuesEnabled$app_sideload(!mainActivity.getBeepCuesEnabled$app_sideload());
        context.getSharedPreferences("settings", 0).edit().putBoolean(TrackingService.EXTRA_BEEP_CUES, mainActivity.getBeepCuesEnabled$app_sideload()).apply();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$112$lambda$107$lambda$106(MainActivity mainActivity, Context context) {
        String runPreset = mainActivity.getRunPreset();
        String str = TrackingService.BATTERY_RACE;
        if (Intrinsics.areEqual(runPreset, TrackingService.BATTERY_RACE)) {
            str = TrackingService.BATTERY_NORMAL;
        } else if (Intrinsics.areEqual(runPreset, TrackingService.BATTERY_NORMAL)) {
            str = "saver";
        }
        mainActivity.setRunPreset(str);
        context.getSharedPreferences("settings", 0).edit().putString("act.runPreset", mainActivity.getRunPreset()).apply();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$112$lambda$109$lambda$108(Context context, MutableState mutableState) {
        invoke$lambda$173$lambda$13(mutableState, false);
        context.getSharedPreferences("settings", 0).edit().putBoolean("hideWatchPanel", false).apply();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$112$lambda$111$lambda$110(Context context, MainActivity mainActivity) {
        invoke$lambda$173$testBeepAndVibrate(context, mainActivity);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$120$lambda$119(MainActivity mainActivity, boolean z, String raw) {
        String take;
        Intrinsics.checkNotNullParameter(raw, "raw");
        int i = 0;
        if (z) {
            String str = raw;
            StringBuilder sb = new StringBuilder();
            int length = str.length();
            while (i < length) {
                char charAt = str.charAt(i);
                if (Character.isDigit(charAt) || charAt == '.') {
                    sb.append(charAt);
                }
                i++;
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
            take = StringsKt.take(sb2, 5);
        } else {
            String str2 = raw;
            StringBuilder sb3 = new StringBuilder();
            int length2 = str2.length();
            while (i < length2) {
                char charAt2 = str2.charAt(i);
                if (Character.isDigit(charAt2) || charAt2 == ':') {
                    sb3.append(charAt2);
                }
                i++;
            }
            String sb4 = sb3.toString();
            Intrinsics.checkNotNullExpressionValue(sb4, "toString(...)");
            take = StringsKt.take(sb4, 5);
        }
        mainActivity.setRacePaceText$app_sideload(take);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$132$lambda$129$lambda$128(MainActivity mainActivity) {
        mainActivity.setGpsActivityType("RUN");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$132$lambda$131$lambda$130(MainActivity mainActivity) {
        mainActivity.setGpsActivityType(ActivityTypes.BIKE);
        return Unit.INSTANCE;
    }

    private static final List<GearEntity> invoke$lambda$173$lambda$134(MutableState<List<GearEntity>> mutableState) {
        return mutableState.getValue();
    }

    private static final Map<Long, Double> invoke$lambda$173$lambda$137(MutableState<Map<Long, Double>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MutableState invoke$lambda$173$lambda$140$lambda$139() {
        return SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Long invoke$lambda$173$lambda$141(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$145$lambda$144(boolean z, Context context, MutableState mutableState, Long l) {
        mutableState.setValue(l);
        if (z) {
            Repository.INSTANCE.get(context).setPendingGearForRide(l);
        } else {
            Repository.INSTANCE.get(context).setPendingGearForRun(l);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$154$lambda$147$lambda$146(MainActivity mainActivity) {
        mainActivity.setPlanType(TrackingService.PLAN_FREE_RUN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$154$lambda$149$lambda$148(MainActivity mainActivity) {
        mainActivity.setPlanType(TrackingService.PLAN_TIME_INTERVALS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$154$lambda$151$lambda$150(MainActivity mainActivity) {
        mainActivity.setPlanType(TrackingService.PLAN_DISTANCE_INTERVALS);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$154$lambda$153$lambda$152(MainActivity mainActivity) {
        mainActivity.setPlanType(TrackingService.PLAN_CUSTOM);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$161$lambda$156$lambda$155(MainActivity mainActivity) {
        mainActivity.setTimeSession$app_sideload(TrackingService.TIME_SESSION_1);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$161$lambda$158$lambda$157(MainActivity mainActivity) {
        mainActivity.setTimeSession$app_sideload(TrackingService.TIME_SESSION_2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$161$lambda$160$lambda$159(MainActivity mainActivity) {
        mainActivity.setTimeSession$app_sideload(TrackingService.TIME_SESSION_3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$163$lambda$162(MainActivity mainActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainActivity.setCustomName$app_sideload(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$165$lambda$164(MainActivity mainActivity, List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mainActivity.setCustomSegments$app_sideload(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$172$lambda$167$lambda$166(Function1 function1) {
        function1.invoke(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$172$lambda$171$lambda$170(Context context, RowScope rowScope) {
        Intent intent = new Intent(context, (Class<?>) TrackingService.class);
        intent.setAction(TrackingService.ACTION_LAP);
        try {
            Result.Companion companion = Result.INSTANCE;
            Result.m7905constructorimpl(context.startService(intent));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$127$lambda$123$lambda$122(MainActivity mainActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt) || charAt == '.') {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mainActivity.setGoalDistKmText$app_sideload(StringsKt.take(sb2, 6));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$173$lambda$127$lambda$126$lambda$125(MainActivity mainActivity, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String str = it;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        mainActivity.setGoalTimeMinText$app_sideload(StringsKt.take(sb2, 4));
        return Unit.INSTANCE;
    }
}
