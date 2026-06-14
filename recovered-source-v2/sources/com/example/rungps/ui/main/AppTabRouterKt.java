package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.MainActivity;
import com.example.rungps.MainActivityExportsKt;
import com.example.rungps.ble.BleClient;
import com.example.rungps.ble.BleStatus;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.data.GymSessionEntity;
import com.example.rungps.data.RouteEntity;
import com.example.rungps.feature.run.RunRow;
import com.example.rungps.feature.run.RunsViewModel;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.coach.TrainingCoachScreenKt;
import com.example.rungps.ui.diagnostics.DiagnosticsScreenKt;
import com.example.rungps.ui.gear.GearManagementScreenKt;
import com.example.rungps.ui.gym.GymTabContentKt;
import com.example.rungps.ui.navigation.MainTab;
import com.example.rungps.ui.navigation.MoreDestination;
import com.example.rungps.ui.profile.UserProfileScreenKt;
import com.example.rungps.ui.settings.AppSettingsScreenKt;
import com.example.rungps.ui.sleep.SleepTabScreenKt;
import com.example.rungps.ui.tabs.RecoveryTabKt;
import com.example.rungps.ui.week.TrainingWeekScreenKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppTabRouter.kt */
@Metadata(d1 = {"\u0000n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\u001a\u0089\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00112\b\u0010\u0017\u001a\u0004\u0018\u00010\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u00032\u001c\u0010\u0019\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\t2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00032\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\t2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00010\t2\u0014\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00010\t2\b\u0010)\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010,¨\u0006-²\u0006\u0010\u0010.\u001a\b\u0012\u0004\u0012\u00020/0\u0011X\u008a\u0084\u0002"}, d2 = {"AppTabRouter", "", "route", "", "selectedRunId", "", "onCloseRun", "Lkotlin/Function0;", "onSelectRun", "Lkotlin/Function1;", "onExport", "onShareOnPhoto", "vm", "Lcom/example/rungps/feature/run/RunsViewModel;", "live", "Lcom/example/rungps/tracking/TrackingUiState;", "routes", "", "Lcom/example/rungps/data/RouteEntity;", "bleStatus", "Lcom/example/rungps/ble/BleStatus;", "gymSessions", "Lcom/example/rungps/data/GymSessionEntity;", "followRouteId", "followRouteName", "onFollowRoute", "Lkotlin/Function2;", "mainAct", "Lcom/example/rungps/MainActivity;", "started", "", "onStart", "onStop", "onShowConfirmStart", "ble", "Lcom/example/rungps/ble/BleClient;", "bleAddr", "onBleAddr", "goTab", "onShowDeleteAll", "onDeleteOneId", "gymLoad", "Lcom/example/rungps/data/GymLoadStats;", "focusGymSessionId", "(Ljava/lang/String;Ljava/lang/Long;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/example/rungps/feature/run/RunsViewModel;Lcom/example/rungps/tracking/TrackingUiState;Ljava/util/List;Lcom/example/rungps/ble/BleStatus;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lcom/example/rungps/MainActivity;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/example/rungps/ble/BleClient;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/example/rungps/data/GymLoadStats;Ljava/lang/Long;Landroidx/compose/runtime/Composer;IIII)V", "app_sideload", "runs", "Lcom/example/rungps/feature/run/RunRow;"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppTabRouterKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTabRouter$lambda$5(String str, Long l, Function0 function0, Function1 function1, Function1 function12, Function1 function13, RunsViewModel runsViewModel, TrackingUiState trackingUiState, List list, BleStatus bleStatus, List list2, Long l2, String str2, Function2 function2, MainActivity mainActivity, boolean z, Function0 function02, Function0 function03, Function1 function14, BleClient bleClient, String str3, Function1 function15, Function1 function16, Function1 function17, Function1 function18, GymLoadStats gymLoadStats, Long l3, int i, int i2, int i3, int i4, Composer composer, int i5) {
        AppTabRouter(str, l, function0, function1, function12, function13, runsViewModel, trackingUiState, list, bleStatus, list2, l2, str2, function2, mainActivity, z, function02, function03, function14, bleClient, str3, function15, function16, function17, function18, gymLoadStats, l3, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), RecomposeScopeImplKt.updateChangedFlags(i3), i4);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x077c  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0408  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0473  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x04f2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0532  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0556  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x057a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x05e9  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x062c  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0771  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0751  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0610  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x058a  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x0244  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x03b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AppTabRouter(final String route, final Long l, final Function0<Unit> onCloseRun, final Function1<? super Long, Unit> onSelectRun, final Function1<? super Long, Unit> onExport, final Function1<? super Long, Unit> onShareOnPhoto, final RunsViewModel vm, final TrackingUiState live, final List<RouteEntity> routes, final BleStatus bleStatus, final List<GymSessionEntity> gymSessions, final Long l2, final String str, final Function2<? super Long, ? super String, Unit> onFollowRoute, final MainActivity mainActivity, final boolean z, final Function0<Unit> onStart, final Function0<Unit> onStop, final Function1<? super Boolean, Unit> onShowConfirmStart, final BleClient ble, final String bleAddr, final Function1<? super String, Unit> onBleAddr, final Function1<? super String, Unit> goTab, final Function1<? super Boolean, Unit> onShowDeleteAll, final Function1<? super Long, Unit> onDeleteOneId, final GymLoadStats gymLoadStats, Long l3, Composer composer, final int i, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        MainActivity mainActivity2;
        Object obj;
        BleClient bleClient;
        int i9;
        int i10;
        final Function1<? super String, Unit> function1;
        Object obj2;
        int i11;
        int i12;
        boolean z2;
        MainActivity mainActivity3;
        int i13;
        Composer composer2;
        int i14;
        Long l4;
        String str2;
        final MainActivity mainActivity4;
        Composer composer3;
        Composer composer4;
        Composer composer5;
        final Long l5;
        ScopeUpdateScope endRestartGroup;
        int i15;
        int i16;
        int i17;
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(onCloseRun, "onCloseRun");
        Intrinsics.checkNotNullParameter(onSelectRun, "onSelectRun");
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
        Intrinsics.checkNotNullParameter(onShowDeleteAll, "onShowDeleteAll");
        Intrinsics.checkNotNullParameter(onDeleteOneId, "onDeleteOneId");
        Composer startRestartGroup = composer.startRestartGroup(1059142055);
        if ((i4 & 1) != 0) {
            i5 = i;
            i6 = i5 | 6;
        } else {
            i5 = i;
            if ((i5 & 6) == 0) {
                i6 = i5 | (startRestartGroup.changed(route) ? 4 : 2);
            } else {
                i6 = i5;
            }
        }
        if ((i4 & 2) != 0) {
            i6 |= 48;
        } else if ((i5 & 48) == 0) {
            i6 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        int i18 = i6;
        if ((i4 & 4) != 0) {
            i18 |= 384;
        } else if ((i5 & 384) == 0) {
            i18 |= startRestartGroup.changedInstance(onCloseRun) ? 256 : 128;
        }
        if ((i4 & 8) != 0) {
            i18 |= 3072;
        } else if ((i5 & 3072) == 0) {
            i18 |= startRestartGroup.changedInstance(onSelectRun) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i18 |= 24576;
        } else if ((i5 & 24576) == 0) {
            i18 |= startRestartGroup.changedInstance(onExport) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i18 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else if ((i5 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            i18 |= startRestartGroup.changedInstance(onShareOnPhoto) ? 131072 : 65536;
        }
        if ((i4 & 64) != 0) {
            i18 |= 1572864;
        } else if ((i5 & 1572864) == 0) {
            i18 |= startRestartGroup.changedInstance(vm) ? 1048576 : 524288;
        }
        if ((i4 & 128) == 0) {
            i17 = (12582912 & i5) == 0 ? startRestartGroup.changed(live) ? 8388608 : 4194304 : 12582912;
            if ((i4 & 256) != 0) {
                i16 = (100663296 & i5) == 0 ? startRestartGroup.changedInstance(routes) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432 : 100663296;
                if ((i4 & 512) == 0) {
                    i15 = (805306368 & i5) == 0 ? startRestartGroup.changedInstance(bleStatus) ? 536870912 : 268435456 : 805306368;
                    if ((i4 & 1024) == 0) {
                        i7 = i2;
                        i8 = i7 | 6;
                    } else {
                        i7 = i2;
                        if ((i7 & 6) == 0) {
                            i8 = i7 | (startRestartGroup.changedInstance(gymSessions) ? 4 : 2);
                        } else {
                            i8 = i7;
                        }
                    }
                    if ((i4 & 2048) == 0) {
                        i8 |= 48;
                    } else if ((i7 & 48) == 0) {
                        i8 |= startRestartGroup.changed(l2) ? 32 : 16;
                    }
                    int i19 = i8;
                    if ((i4 & 4096) == 0) {
                        i19 |= 384;
                    } else if ((i7 & 384) == 0) {
                        i19 |= startRestartGroup.changed(str) ? 256 : 128;
                        if ((i4 & 8192) != 0) {
                            i19 |= 3072;
                        } else if ((i7 & 3072) == 0) {
                            i19 |= startRestartGroup.changedInstance(onFollowRoute) ? 2048 : 1024;
                        }
                        if ((i4 & 16384) != 0) {
                            i19 |= 24576;
                        } else if ((i7 & 24576) == 0) {
                            mainActivity2 = mainActivity;
                            obj = bleAddr;
                            i19 |= startRestartGroup.changedInstance(mainActivity2) ? 16384 : 8192;
                            if ((i4 & 32768) == 0) {
                                i19 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                            } else if ((i7 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                i19 |= startRestartGroup.changed(z) ? 131072 : 65536;
                            }
                            if ((i4 & 65536) == 0) {
                                i19 |= 1572864;
                            } else if ((i7 & 1572864) == 0) {
                                i19 |= startRestartGroup.changedInstance(onStart) ? 1048576 : 524288;
                            }
                            if ((i4 & 131072) == 0) {
                                i19 |= 12582912;
                            } else if ((i7 & 12582912) == 0) {
                                i19 |= startRestartGroup.changedInstance(onStop) ? 8388608 : 4194304;
                            }
                            if ((i4 & 262144) == 0) {
                                i19 |= 100663296;
                            } else if ((i7 & 100663296) == 0) {
                                i19 |= startRestartGroup.changedInstance(onShowConfirmStart) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                            }
                            if ((i4 & 524288) == 0) {
                                i19 |= 805306368;
                                bleClient = ble;
                            } else {
                                int i20 = i7 & 805306368;
                                bleClient = ble;
                                if (i20 == 0) {
                                    i19 |= startRestartGroup.changedInstance(bleClient) ? 536870912 : 268435456;
                                }
                            }
                            if ((i4 & 1048576) == 0) {
                                i9 = i3;
                                i10 = i9 | 6;
                            } else {
                                i9 = i3;
                                if ((i9 & 6) == 0) {
                                    i10 = i9 | (startRestartGroup.changed(obj) ? 4 : 2);
                                } else {
                                    i10 = i9;
                                }
                            }
                            if ((i4 & 2097152) == 0) {
                                i10 |= 48;
                                function1 = goTab;
                            } else {
                                function1 = goTab;
                                if ((i9 & 48) == 0) {
                                    i10 |= startRestartGroup.changedInstance(onBleAddr) ? 32 : 16;
                                }
                            }
                            int i21 = i10;
                            if ((i4 & 4194304) == 0) {
                                i21 |= 384;
                            } else if ((i9 & 384) == 0) {
                                i21 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
                            }
                            if ((8388608 & i4) == 0) {
                                i21 |= 3072;
                            } else if ((i9 & 3072) == 0) {
                                obj2 = onDeleteOneId;
                                i21 |= startRestartGroup.changedInstance(onShowDeleteAll) ? 2048 : 1024;
                                if ((i4 & 16777216) != 0) {
                                    i21 |= 24576;
                                } else if ((i9 & 24576) == 0) {
                                    i21 |= startRestartGroup.changedInstance(obj2) ? 16384 : 8192;
                                }
                                if ((33554432 & i4) != 0) {
                                    i21 |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                                } else if ((i9 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                                    i21 |= startRestartGroup.changed(gymLoadStats) ? 131072 : 65536;
                                    i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                    if (i11 == 0) {
                                        i21 |= 1572864;
                                    } else if ((i9 & 1572864) == 0) {
                                        i21 |= startRestartGroup.changed(l3) ? 1048576 : 524288;
                                    }
                                    if ((i18 & 306783379) == 306783378 || (306783379 & i19) != 306783378 || (599187 & i21) != 599186 || !startRestartGroup.getSkipping()) {
                                        Long l6 = i11 == 0 ? null : l3;
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1059142055, i18, i19, "com.example.rungps.ui.main.AppTabRouter (AppTabRouter.kt:63)");
                                        }
                                        State collectAsState = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
                                        startRestartGroup.startReplaceGroup(1200352060);
                                        if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
                                            UserProfileScreenKt.UserProfileScreen(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200355488);
                                        if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
                                            DiagnosticsScreenKt.DiagnosticsScreen(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200359037);
                                        if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
                                            AppSettingsScreenKt.AppSettingsScreen(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200362492);
                                        if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
                                            GearManagementScreenKt.GearManagementScreen(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200366358);
                                        if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
                                            MapTabContentKt.MapTabContent(live.getLastLat(), live.getLastLon(), live.getElapsedMs(), live.getDistanceM(), live.getSteps(), live.isRecording(), l2, str, onFollowRoute, routes, vm, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, ((i19 << 15) & 267911168) | ((i18 << 3) & 1879048192), ((i18 >> 18) & 14) | 48, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200383548);
                                        if (Intrinsics.areEqual(route, MainTab.Gym.getRoute()) || mainActivity2 == null) {
                                            i12 = 0;
                                        } else {
                                            i12 = 0;
                                            GymTabContentKt.GymTabContent(mainActivity2, l6, startRestartGroup, ((i19 >> 12) & 14) | ((i21 >> 15) & SdkConfig.SDK_VERSION), 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200388920);
                                        if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
                                            RecoveryTabKt.RecoveryTab(null, startRestartGroup, i12, 1);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200391222);
                                        if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
                                            SleepTabScreenKt.SleepTabScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200394457);
                                        if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
                                            TrainingWeekScreenKt.TrainingWeekScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200397787);
                                        if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                            TrainingCoachScreenKt.TrainingCoachScreen(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, 6, 0);
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200401285);
                                        if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
                                            startRestartGroup.startReplaceGroup(1200406290);
                                            if ((i21 & 896) == 256) {
                                                z2 = true;
                                            }
                                            Object rememberedValue = startRestartGroup.rememberedValue();
                                            if (z2 || rememberedValue == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.AppTabRouterKt$$ExternalSyntheticLambda0
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit AppTabRouter$lambda$2$lambda$1;
                                                        AppTabRouter$lambda$2$lambda$1 = AppTabRouterKt.AppTabRouter$lambda$2$lambda$1(Function1.this);
                                                        return AppTabRouter$lambda$2$lambda$1;
                                                    }
                                                };
                                                startRestartGroup.updateRememberedValue(rememberedValue);
                                            }
                                            startRestartGroup.endReplaceGroup();
                                            SoccerTabContentKt.SoccerTabContent(bleClient, bleStatus, (Function0) rememberedValue, startRestartGroup, ((i19 >> 27) & 14) | ((i18 >> 24) & SdkConfig.SDK_VERSION));
                                        }
                                        startRestartGroup.endReplaceGroup();
                                        startRestartGroup.startReplaceGroup(1200408049);
                                        if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
                                            mainActivity3 = mainActivity2;
                                            i13 = i21;
                                            composer2 = startRestartGroup;
                                        } else {
                                            i13 = i21;
                                            mainActivity3 = mainActivity;
                                            composer2 = startRestartGroup;
                                            HomeTabContentKt.HomeTabContent(gymSessions, goTab, SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, ((i21 >> 3) & SdkConfig.SDK_VERSION) | (i19 & 14) | 384, 0);
                                        }
                                        composer2.endReplaceGroup();
                                        Composer composer6 = composer2;
                                        composer6.startReplaceGroup(1200414798);
                                        if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
                                            i14 = i18;
                                            l4 = l6;
                                            str2 = route;
                                            mainActivity4 = mainActivity3;
                                            composer3 = composer6;
                                        } else {
                                            int i22 = i18 >> 3;
                                            int i23 = ((i19 >> 12) & 14) | (i18 & SdkConfig.SDK_VERSION) | (i18 & 896) | (i22 & 7168) | (57344 & i22) | (458752 & i22) | (3670016 & i22) | (29360128 & i22) | (i22 & 234881024) | ((i19 << 27) & 1879048192);
                                            int i24 = (i19 >> 3) & 1022;
                                            int i25 = i19 >> 6;
                                            int i26 = (i25 & 29360128) | i24 | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (3670016 & i25);
                                            int i27 = i13 << 24;
                                            l4 = l6;
                                            mainActivity4 = mainActivity3;
                                            i14 = i18;
                                            str2 = route;
                                            composer3 = composer6;
                                            RunTabContentKt.RunTabContent(mainActivity, l, onCloseRun, onExport, onShareOnPhoto, vm, live, routes, bleStatus, gymSessions, l2, str, onFollowRoute, z, onStart, onStop, onShowConfirmStart, ble, bleAddr, onBleAddr, goTab, composer3, i23, i26 | (234881024 & i27) | (i27 & 1879048192), (i13 >> 6) & 14);
                                        }
                                        composer3.endReplaceGroup();
                                        Composer composer7 = composer3;
                                        composer7.startReplaceGroup(1200440029);
                                        if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
                                            composer4 = composer7;
                                        } else {
                                            List<RunRow> AppTabRouter$lambda$0 = AppTabRouter$lambda$0(collectAsState);
                                            composer7.startReplaceGroup(1200453749);
                                            boolean changedInstance = composer7.changedInstance(mainActivity4);
                                            Object rememberedValue2 = composer7.rememberedValue();
                                            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.AppTabRouterKt$$ExternalSyntheticLambda1
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        Unit AppTabRouter$lambda$4$lambda$3;
                                                        AppTabRouter$lambda$4$lambda$3 = AppTabRouterKt.AppTabRouter$lambda$4$lambda$3(MainActivity.this);
                                                        return AppTabRouter$lambda$4$lambda$3;
                                                    }
                                                };
                                                composer7.updateRememberedValue(rememberedValue2);
                                            }
                                            composer7.endReplaceGroup();
                                            int i28 = i14 << 6;
                                            int i29 = i13 << 15;
                                            composer4 = composer7;
                                            HistoryTabContentKt.HistoryTabContent(vm, AppTabRouter$lambda$0, gymLoadStats, l, onCloseRun, onSelectRun, onExport, onShareOnPhoto, onShowDeleteAll, onDeleteOneId, (Function0) rememberedValue2, goTab, composer7, ((i14 >> 18) & 14) | ((i13 >> 9) & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (3670016 & i28) | (29360128 & i28) | (234881024 & i29) | (i29 & 1879048192), (i13 >> 3) & SdkConfig.SDK_VERSION);
                                        }
                                        composer4.endReplaceGroup();
                                        composer5 = composer4;
                                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        l5 = l4;
                                    } else {
                                        startRestartGroup.skipToGroupEnd();
                                        l5 = l3;
                                        composer5 = startRestartGroup;
                                    }
                                    endRestartGroup = composer5.endRestartGroup();
                                    if (endRestartGroup == null) {
                                        endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.AppTabRouterKt$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj3, Object obj4) {
                                                Unit AppTabRouter$lambda$5;
                                                AppTabRouter$lambda$5 = AppTabRouterKt.AppTabRouter$lambda$5(route, l, onCloseRun, onSelectRun, onExport, onShareOnPhoto, vm, live, routes, bleStatus, gymSessions, l2, str, onFollowRoute, mainActivity, z, onStart, onStop, onShowConfirmStart, ble, bleAddr, onBleAddr, goTab, onShowDeleteAll, onDeleteOneId, gymLoadStats, l5, i, i2, i3, i4, (Composer) obj3, ((Integer) obj4).intValue());
                                                return AppTabRouter$lambda$5;
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                                if (i11 == 0) {
                                }
                                if ((i18 & 306783379) == 306783378) {
                                }
                                if (i11 == 0) {
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                State collectAsState2 = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
                                startRestartGroup.startReplaceGroup(1200352060);
                                if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200355488);
                                if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200359037);
                                if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200362492);
                                if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200366358);
                                if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200383548);
                                if (Intrinsics.areEqual(route, MainTab.Gym.getRoute())) {
                                }
                                i12 = 0;
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200388920);
                                if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200391222);
                                if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200394457);
                                if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200397787);
                                if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200401285);
                                if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
                                }
                                startRestartGroup.endReplaceGroup();
                                startRestartGroup.startReplaceGroup(1200408049);
                                if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
                                }
                                composer2.endReplaceGroup();
                                Composer composer62 = composer2;
                                composer62.startReplaceGroup(1200414798);
                                if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
                                }
                                composer3.endReplaceGroup();
                                Composer composer72 = composer3;
                                composer72.startReplaceGroup(1200440029);
                                if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
                                }
                                composer4.endReplaceGroup();
                                composer5 = composer4;
                                SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                l5 = l4;
                                endRestartGroup = composer5.endRestartGroup();
                                if (endRestartGroup == null) {
                                }
                            }
                            obj2 = onDeleteOneId;
                            if ((i4 & 16777216) != 0) {
                            }
                            if ((33554432 & i4) != 0) {
                            }
                            i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                            if (i11 == 0) {
                            }
                            if ((i18 & 306783379) == 306783378) {
                            }
                            if (i11 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            State collectAsState22 = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
                            startRestartGroup.startReplaceGroup(1200352060);
                            if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200355488);
                            if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200359037);
                            if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200362492);
                            if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200366358);
                            if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200383548);
                            if (Intrinsics.areEqual(route, MainTab.Gym.getRoute())) {
                            }
                            i12 = 0;
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200388920);
                            if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200391222);
                            if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200394457);
                            if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200397787);
                            if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200401285);
                            if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
                            }
                            startRestartGroup.endReplaceGroup();
                            startRestartGroup.startReplaceGroup(1200408049);
                            if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
                            }
                            composer2.endReplaceGroup();
                            Composer composer622 = composer2;
                            composer622.startReplaceGroup(1200414798);
                            if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
                            }
                            composer3.endReplaceGroup();
                            Composer composer722 = composer3;
                            composer722.startReplaceGroup(1200440029);
                            if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
                            }
                            composer4.endReplaceGroup();
                            composer5 = composer4;
                            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            l5 = l4;
                            endRestartGroup = composer5.endRestartGroup();
                            if (endRestartGroup == null) {
                            }
                        }
                        mainActivity2 = mainActivity;
                        obj = bleAddr;
                        if ((i4 & 32768) == 0) {
                        }
                        if ((i4 & 65536) == 0) {
                        }
                        if ((i4 & 131072) == 0) {
                        }
                        if ((i4 & 262144) == 0) {
                        }
                        if ((i4 & 524288) == 0) {
                        }
                        if ((i4 & 1048576) == 0) {
                        }
                        if ((i4 & 2097152) == 0) {
                        }
                        int i212 = i10;
                        if ((i4 & 4194304) == 0) {
                        }
                        if ((8388608 & i4) == 0) {
                        }
                        obj2 = onDeleteOneId;
                        if ((i4 & 16777216) != 0) {
                        }
                        if ((33554432 & i4) != 0) {
                        }
                        i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                        if (i11 == 0) {
                        }
                        if ((i18 & 306783379) == 306783378) {
                        }
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        State collectAsState222 = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
                        startRestartGroup.startReplaceGroup(1200352060);
                        if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200355488);
                        if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200359037);
                        if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200362492);
                        if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200366358);
                        if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200383548);
                        if (Intrinsics.areEqual(route, MainTab.Gym.getRoute())) {
                        }
                        i12 = 0;
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200388920);
                        if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200391222);
                        if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200394457);
                        if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200397787);
                        if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200401285);
                        if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
                        }
                        startRestartGroup.endReplaceGroup();
                        startRestartGroup.startReplaceGroup(1200408049);
                        if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
                        }
                        composer2.endReplaceGroup();
                        Composer composer6222 = composer2;
                        composer6222.startReplaceGroup(1200414798);
                        if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
                        }
                        composer3.endReplaceGroup();
                        Composer composer7222 = composer3;
                        composer7222.startReplaceGroup(1200440029);
                        if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
                        }
                        composer4.endReplaceGroup();
                        composer5 = composer4;
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        l5 = l4;
                        endRestartGroup = composer5.endRestartGroup();
                        if (endRestartGroup == null) {
                        }
                    }
                    if ((i4 & 8192) != 0) {
                    }
                    if ((i4 & 16384) != 0) {
                    }
                    mainActivity2 = mainActivity;
                    obj = bleAddr;
                    if ((i4 & 32768) == 0) {
                    }
                    if ((i4 & 65536) == 0) {
                    }
                    if ((i4 & 131072) == 0) {
                    }
                    if ((i4 & 262144) == 0) {
                    }
                    if ((i4 & 524288) == 0) {
                    }
                    if ((i4 & 1048576) == 0) {
                    }
                    if ((i4 & 2097152) == 0) {
                    }
                    int i2122 = i10;
                    if ((i4 & 4194304) == 0) {
                    }
                    if ((8388608 & i4) == 0) {
                    }
                    obj2 = onDeleteOneId;
                    if ((i4 & 16777216) != 0) {
                    }
                    if ((33554432 & i4) != 0) {
                    }
                    i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                    if (i11 == 0) {
                    }
                    if ((i18 & 306783379) == 306783378) {
                    }
                    if (i11 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    State collectAsState2222 = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
                    startRestartGroup.startReplaceGroup(1200352060);
                    if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200355488);
                    if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200359037);
                    if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200362492);
                    if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200366358);
                    if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200383548);
                    if (Intrinsics.areEqual(route, MainTab.Gym.getRoute())) {
                    }
                    i12 = 0;
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200388920);
                    if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200391222);
                    if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200394457);
                    if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200397787);
                    if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200401285);
                    if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
                    }
                    startRestartGroup.endReplaceGroup();
                    startRestartGroup.startReplaceGroup(1200408049);
                    if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
                    }
                    composer2.endReplaceGroup();
                    Composer composer62222 = composer2;
                    composer62222.startReplaceGroup(1200414798);
                    if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
                    }
                    composer3.endReplaceGroup();
                    Composer composer72222 = composer3;
                    composer72222.startReplaceGroup(1200440029);
                    if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
                    }
                    composer4.endReplaceGroup();
                    composer5 = composer4;
                    SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    l5 = l4;
                    endRestartGroup = composer5.endRestartGroup();
                    if (endRestartGroup == null) {
                    }
                }
                i18 |= i15;
                if ((i4 & 1024) == 0) {
                }
                if ((i4 & 2048) == 0) {
                }
                int i192 = i8;
                if ((i4 & 4096) == 0) {
                }
                if ((i4 & 8192) != 0) {
                }
                if ((i4 & 16384) != 0) {
                }
                mainActivity2 = mainActivity;
                obj = bleAddr;
                if ((i4 & 32768) == 0) {
                }
                if ((i4 & 65536) == 0) {
                }
                if ((i4 & 131072) == 0) {
                }
                if ((i4 & 262144) == 0) {
                }
                if ((i4 & 524288) == 0) {
                }
                if ((i4 & 1048576) == 0) {
                }
                if ((i4 & 2097152) == 0) {
                }
                int i21222 = i10;
                if ((i4 & 4194304) == 0) {
                }
                if ((8388608 & i4) == 0) {
                }
                obj2 = onDeleteOneId;
                if ((i4 & 16777216) != 0) {
                }
                if ((33554432 & i4) != 0) {
                }
                i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
                if (i11 == 0) {
                }
                if ((i18 & 306783379) == 306783378) {
                }
                if (i11 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                State collectAsState22222 = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
                startRestartGroup.startReplaceGroup(1200352060);
                if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200355488);
                if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200359037);
                if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200362492);
                if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200366358);
                if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200383548);
                if (Intrinsics.areEqual(route, MainTab.Gym.getRoute())) {
                }
                i12 = 0;
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200388920);
                if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200391222);
                if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200394457);
                if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200397787);
                if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200401285);
                if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
                }
                startRestartGroup.endReplaceGroup();
                startRestartGroup.startReplaceGroup(1200408049);
                if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
                }
                composer2.endReplaceGroup();
                Composer composer622222 = composer2;
                composer622222.startReplaceGroup(1200414798);
                if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
                }
                composer3.endReplaceGroup();
                Composer composer722222 = composer3;
                composer722222.startReplaceGroup(1200440029);
                if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
                }
                composer4.endReplaceGroup();
                composer5 = composer4;
                SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
                if (ComposerKt.isTraceInProgress()) {
                }
                l5 = l4;
                endRestartGroup = composer5.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            i18 |= i16;
            if ((i4 & 512) == 0) {
            }
            i18 |= i15;
            if ((i4 & 1024) == 0) {
            }
            if ((i4 & 2048) == 0) {
            }
            int i1922 = i8;
            if ((i4 & 4096) == 0) {
            }
            if ((i4 & 8192) != 0) {
            }
            if ((i4 & 16384) != 0) {
            }
            mainActivity2 = mainActivity;
            obj = bleAddr;
            if ((i4 & 32768) == 0) {
            }
            if ((i4 & 65536) == 0) {
            }
            if ((i4 & 131072) == 0) {
            }
            if ((i4 & 262144) == 0) {
            }
            if ((i4 & 524288) == 0) {
            }
            if ((i4 & 1048576) == 0) {
            }
            if ((i4 & 2097152) == 0) {
            }
            int i212222 = i10;
            if ((i4 & 4194304) == 0) {
            }
            if ((8388608 & i4) == 0) {
            }
            obj2 = onDeleteOneId;
            if ((i4 & 16777216) != 0) {
            }
            if ((33554432 & i4) != 0) {
            }
            i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
            if (i11 == 0) {
            }
            if ((i18 & 306783379) == 306783378) {
            }
            if (i11 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            State collectAsState222222 = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
            startRestartGroup.startReplaceGroup(1200352060);
            if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200355488);
            if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200359037);
            if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200362492);
            if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200366358);
            if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200383548);
            if (Intrinsics.areEqual(route, MainTab.Gym.getRoute())) {
            }
            i12 = 0;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200388920);
            if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200391222);
            if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200394457);
            if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200397787);
            if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200401285);
            if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
            }
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1200408049);
            if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
            }
            composer2.endReplaceGroup();
            Composer composer6222222 = composer2;
            composer6222222.startReplaceGroup(1200414798);
            if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
            }
            composer3.endReplaceGroup();
            Composer composer7222222 = composer3;
            composer7222222.startReplaceGroup(1200440029);
            if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
            }
            composer4.endReplaceGroup();
            composer5 = composer4;
            SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            l5 = l4;
            endRestartGroup = composer5.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        i18 |= i17;
        if ((i4 & 256) != 0) {
        }
        i18 |= i16;
        if ((i4 & 512) == 0) {
        }
        i18 |= i15;
        if ((i4 & 1024) == 0) {
        }
        if ((i4 & 2048) == 0) {
        }
        int i19222 = i8;
        if ((i4 & 4096) == 0) {
        }
        if ((i4 & 8192) != 0) {
        }
        if ((i4 & 16384) != 0) {
        }
        mainActivity2 = mainActivity;
        obj = bleAddr;
        if ((i4 & 32768) == 0) {
        }
        if ((i4 & 65536) == 0) {
        }
        if ((i4 & 131072) == 0) {
        }
        if ((i4 & 262144) == 0) {
        }
        if ((i4 & 524288) == 0) {
        }
        if ((i4 & 1048576) == 0) {
        }
        if ((i4 & 2097152) == 0) {
        }
        int i2122222 = i10;
        if ((i4 & 4194304) == 0) {
        }
        if ((8388608 & i4) == 0) {
        }
        obj2 = onDeleteOneId;
        if ((i4 & 16777216) != 0) {
        }
        if ((33554432 & i4) != 0) {
        }
        i11 = i4 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        if (i11 == 0) {
        }
        if ((i18 & 306783379) == 306783378) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        State collectAsState2222222 = SnapshotStateKt.collectAsState(vm.getRuns(), null, startRestartGroup, 0, 1);
        startRestartGroup.startReplaceGroup(1200352060);
        if (Intrinsics.areEqual(route, MoreDestination.Profile.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200355488);
        if (Intrinsics.areEqual(route, MoreDestination.Diagnostics.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200359037);
        if (Intrinsics.areEqual(route, MoreDestination.Settings.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200362492);
        if (Intrinsics.areEqual(route, MoreDestination.Gear.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200366358);
        if (Intrinsics.areEqual(route, MoreDestination.Map.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200383548);
        if (Intrinsics.areEqual(route, MainTab.Gym.getRoute())) {
        }
        i12 = 0;
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200388920);
        if (Intrinsics.areEqual(route, MainTab.Recovery.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200391222);
        if (Intrinsics.areEqual(route, MoreDestination.Sleep.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200394457);
        if (Intrinsics.areEqual(route, MoreDestination.Week.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200397787);
        if (Intrinsics.areEqual(route, MoreDestination.Coach.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200401285);
        if (Intrinsics.areEqual(route, MoreDestination.Soccer.getRoute())) {
        }
        startRestartGroup.endReplaceGroup();
        startRestartGroup.startReplaceGroup(1200408049);
        if (Intrinsics.areEqual(route, MainTab.Home.getRoute())) {
        }
        composer2.endReplaceGroup();
        Composer composer62222222 = composer2;
        composer62222222.startReplaceGroup(1200414798);
        if (Intrinsics.areEqual(route, MainTab.Run.getRoute())) {
        }
        composer3.endReplaceGroup();
        Composer composer72222222 = composer3;
        composer72222222.startReplaceGroup(1200440029);
        if (Intrinsics.areEqual(str2, MainTab.History.getRoute())) {
        }
        composer4.endReplaceGroup();
        composer5 = composer4;
        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), composer5, 6);
        if (ComposerKt.isTraceInProgress()) {
        }
        l5 = l4;
        endRestartGroup = composer5.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTabRouter$lambda$2$lambda$1(Function1 function1) {
        function1.invoke(MainTab.Run.getRoute());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppTabRouter$lambda$4$lambda$3(MainActivity mainActivity) {
        if (mainActivity != null) {
            MainActivityExportsKt.exportAllDataZip(mainActivity);
        }
        return Unit.INSTANCE;
    }

    private static final List<RunRow> AppTabRouter$lambda$0(State<? extends List<RunRow>> state) {
        return state.getValue();
    }
}
