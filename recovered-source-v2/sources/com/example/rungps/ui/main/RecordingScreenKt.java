package com.example.rungps.ui.main;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.ProgressIndicatorKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import androidx.health.platform.client.SdkConfig;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.sleep.BatteryOptimizationNudgeKt;
import com.example.rungps.tracking.TrackingUiState;
import com.example.rungps.ui.components.SpotifyMiniPlayerCardKt;
import com.example.rungps.ui.icons.EtIcons;
import com.example.rungps.ui.run.RaceDayHudKt;
import com.example.rungps.ui.util.ActivityFormattersKt;
import com.google.firebase.firestore.model.Values;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.ranges.RangesKt;

/* compiled from: RecordingScreen.kt */
@Metadata(d1 = {"\u0000L\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a¡\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0012\u001a\u00020\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0007¢\u0006\u0002\u0010\u0017\u001a\u0015\u0010\u0018\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u001a\u001aQ\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u0010\u001c\u001aQ\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00070\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00070\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0003¢\u0006\u0002\u0010\u001c\u001a0\u0010\u001e\u001a\u00020\u00012\u0011\u0010\u001f\u001a\r\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0002\b 2\u0006\u0010!\u001a\u00020\u00072\u0006\u0010\"\u001a\u00020\u0007H\u0003¢\u0006\u0002\u0010#\u001a'\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\u00102\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0003¢\u0006\u0002\u0010'\u001a1\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010*\u001a\u0015\u0010+\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010,\u001a\u0015\u0010-\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010,¨\u0006."}, d2 = {"ActiveRecordingPane", "", "live", "Lcom/example/rungps/tracking/TrackingUiState;", "followRouteId", "", "followRouteName", "", "isBike", "", "onPauseToggle", "Lkotlin/Function0;", "onStop", "formatElapsed", "Lkotlin/Function1;", "formatPace", "", "hrZoneLabel", "raceDayMode", "hrBpm", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/tracking/TrackingUiState;Ljava/lang/Long;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "RecordingGpsStrip", "hasFix", "(ZLandroidx/compose/runtime/Composer;I)V", "RecordingStatsCard", "(Lcom/example/rungps/tracking/TrackingUiState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V", "RecordingNoMapHud", "StatIconColumn", "icon", "Landroidx/compose/runtime/Composable;", Values.VECTOR_MAP_VECTORS_KEY, "hint", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "KmSplitBars", "splitCount", "distanceM", "(IDLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "RecordingControlBar", "paused", "(ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "intervalPaceSecPerKm", "(Lcom/example/rungps/tracking/TrackingUiState;)Ljava/lang/Double;", "avgPaceSecPerKm", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RecordingScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ActiveRecordingPane$lambda$4(TrackingUiState trackingUiState, Long l, String str, boolean z, Function0 function0, Function0 function02, Function1 function1, Function1 function12, String str2, boolean z2, Integer num, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        ActiveRecordingPane(trackingUiState, l, str, z, function0, function02, function1, function12, str2, z2, num, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), RecomposeScopeImplKt.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit KmSplitBars$lambda$20(int i, double d, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        KmSplitBars(i, d, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingControlBar$lambda$21(boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        RecordingControlBar(z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingGpsStrip$lambda$6(boolean z, int i, Composer composer, int i2) {
        RecordingGpsStrip(z, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingNoMapHud$lambda$13(TrackingUiState trackingUiState, boolean z, Function1 function1, Function1 function12, String str, int i, int i2, Composer composer, int i3) {
        RecordingNoMapHud(trackingUiState, z, function1, function12, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RecordingStatsCard$lambda$8(TrackingUiState trackingUiState, boolean z, Function1 function1, Function1 function12, String str, int i, int i2, Composer composer, int i3) {
        RecordingStatsCard(trackingUiState, z, function1, function12, str, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StatIconColumn$lambda$15(Function2 function2, String str, String str2, int i, Composer composer, int i2) {
        StatIconColumn(function2, str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x068a  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ActiveRecordingPane(final TrackingUiState live, final Long l, final String str, final boolean z, final Function0<Unit> onPauseToggle, final Function0<Unit> onStop, final Function1<? super Long, String> formatElapsed, final Function1<? super Double, String> formatPace, String str2, boolean z2, Integer num, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        Integer num2;
        Composer composer2;
        Modifier modifier2;
        Modifier modifier3;
        final String str3;
        final boolean z3;
        int i11;
        Modifier modifier4;
        ScopeUpdateScope endRestartGroup;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(live, "live");
        Intrinsics.checkNotNullParameter(onPauseToggle, "onPauseToggle");
        Intrinsics.checkNotNullParameter(onStop, "onStop");
        Intrinsics.checkNotNullParameter(formatElapsed, "formatElapsed");
        Intrinsics.checkNotNullParameter(formatPace, "formatPace");
        Composer startRestartGroup = composer.startRestartGroup(-901520191);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (startRestartGroup.changed(live) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= startRestartGroup.changed(l) ? 32 : 16;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= startRestartGroup.changed(z) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= startRestartGroup.changedInstance(onPauseToggle) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i5 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
        } else {
            if ((196608 & i) == 0) {
                i5 = startRestartGroup.changedInstance(onStop) ? 131072 : 65536;
            }
            if ((i3 & 64) != 0) {
                i13 = (1572864 & i) == 0 ? startRestartGroup.changedInstance(formatElapsed) ? 1048576 : 524288 : 1572864;
                if ((i3 & 128) == 0) {
                    i12 = (12582912 & i) == 0 ? startRestartGroup.changedInstance(formatPace) ? 8388608 : 4194304 : 12582912;
                    i6 = i3 & 256;
                    if (i6 == 0) {
                        i4 |= 100663296;
                    } else if ((100663296 & i) == 0) {
                        i4 |= startRestartGroup.changed(str2) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
                        i7 = i3 & 512;
                        if (i7 != 0) {
                            i4 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i4 |= startRestartGroup.changed(z2) ? 536870912 : 268435456;
                        }
                        i8 = i3 & 1024;
                        if (i8 != 0) {
                            i9 = i2 | 6;
                        } else if ((i2 & 6) == 0) {
                            i9 = i2 | (startRestartGroup.changed(num) ? 4 : 2);
                        } else {
                            i9 = i2;
                        }
                        i10 = i3 & 2048;
                        if (i10 != 0) {
                            i9 |= 48;
                        } else if ((i2 & 48) == 0) {
                            i9 |= startRestartGroup.changed(modifier) ? 32 : 16;
                        }
                        int i14 = i9;
                        if ((i4 & 306783251) == 306783250 || (i14 & 19) != 18 || !startRestartGroup.getSkipping()) {
                            String str4 = i6 != 0 ? null : str2;
                            boolean z4 = i7 != 0 ? false : z2;
                            num2 = i8 != 0 ? null : num;
                            Modifier modifier5 = i10 != 0 ? Modifier.INSTANCE : modifier;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-901520191, i4, i14, "com.example.rungps.ui.main.ActiveRecordingPane (RecordingScreen.kt:57)");
                            }
                            boolean z5 = (z4 || (live.getGoalDistanceM() == null && live.getTargetPaceSecPerKm() == null)) ? false : true;
                            boolean isPaused = live.isPaused();
                            if (l != null) {
                                startRestartGroup.startReplaceGroup(-2006111206);
                                Modifier fillMaxSize$default = SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxSize$default);
                                Modifier modifier6 = modifier5;
                                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                                Updater.m3343setimpl(m3336constructorimpl, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                int i15 = i4 >> 3;
                                MapLibreRecordingMapKt.MapLibreRecordingMap(l.longValue(), live.getLastLat(), live.getLastLon(), SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), startRestartGroup, (i15 & 14) | 3072, 0);
                                Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(12), Dp.m6303constructorimpl(8));
                                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(spaceBetween, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, m685paddingVpY3zN4);
                                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor2);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                                Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                                RecordingGpsStrip((live.getLastLat() == null || live.getLastLon() == null) ? false : true, startRestartGroup, 0);
                                BatteryOptimizationNudgeKt.BatteryOptimizationCard(false, true, null, startRestartGroup, 48, 5);
                                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
                                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                startRestartGroup.startReusableNode();
                                if (startRestartGroup.getInserting()) {
                                    startRestartGroup.createNode(constructor3);
                                } else {
                                    startRestartGroup.useNode();
                                }
                                Composer m3336constructorimpl3 = Updater.m3336constructorimpl(startRestartGroup);
                                Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
                                if (z5) {
                                    startRestartGroup.startReplaceGroup(888488517);
                                    int i16 = i4 >> 9;
                                    i11 = i4;
                                    modifier4 = null;
                                    RaceDayHudKt.RaceDayHud(live, num2, z, formatElapsed, formatPace, null, startRestartGroup, (i4 & 14) | ((i14 << 3) & SdkConfig.SDK_VERSION) | (i15 & 896) | (i16 & 7168) | (i16 & 57344), 32);
                                    startRestartGroup.endReplaceGroup();
                                    composer2 = startRestartGroup;
                                } else {
                                    i11 = i4;
                                    modifier4 = null;
                                    composer2 = startRestartGroup;
                                    composer2.startReplaceGroup(888818481);
                                    int i17 = i11 >> 12;
                                    RecordingStatsCard(live, z, formatElapsed, formatPace, str4, composer2, (i11 & 14) | ((i11 >> 6) & SdkConfig.SDK_VERSION) | (i17 & 896) | (i17 & 7168) | (i17 & 57344), 0);
                                    composer2.endReplaceGroup();
                                }
                                SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard(modifier4, composer2, 0, 1);
                                RecordingControlBar(isPaused, onPauseToggle, onStop, composer2, (i11 >> 9) & PointerIconCompat.TYPE_TEXT);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                                modifier2 = modifier6;
                            } else {
                                int i18 = i4;
                                Modifier modifier7 = modifier5;
                                composer2 = startRestartGroup;
                                composer2.startReplaceGroup(-2004393620);
                                Modifier m685paddingVpY3zN42 = PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxSize$default(modifier7, 0.0f, 1, null), Dp.m6303constructorimpl(16), Dp.m6303constructorimpl(8));
                                Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                                MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(spaceBetween2, centerHorizontally, composer2, 54);
                                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                                int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composer2.getCurrentCompositionLocalMap();
                                Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer2, m685paddingVpY3zN42);
                                Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
                                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                                if (!(composer2.getApplier() instanceof Applier)) {
                                    ComposablesKt.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor4);
                                } else {
                                    composer2.useNode();
                                }
                                Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer2);
                                Updater.m3343setimpl(m3336constructorimpl4, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                                Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                                if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
                                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                                ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
                                RecordingGpsStrip((live.getLastLat() == null || live.getLastLon() == null) ? false : true, composer2, 0);
                                modifier2 = modifier7;
                                BatteryOptimizationNudgeKt.BatteryOptimizationCard(false, true, null, composer2, 48, 5);
                                if (z5) {
                                    composer2.startReplaceGroup(-2146523421);
                                    int i19 = i18 >> 9;
                                    RaceDayHudKt.RaceDayHud(live, num2, z, formatElapsed, formatPace, null, composer2, (i18 & 14) | ((i14 << 3) & SdkConfig.SDK_VERSION) | ((i18 >> 3) & 896) | (i19 & 7168) | (i19 & 57344), 32);
                                    composer2.endReplaceGroup();
                                    composer2 = composer2;
                                } else {
                                    composer2.startReplaceGroup(-2146256976);
                                    int i20 = i18 >> 12;
                                    RecordingNoMapHud(live, z, formatElapsed, formatPace, str4, composer2, (i18 & 14) | ((i18 >> 6) & SdkConfig.SDK_VERSION) | (i20 & 896) | (i20 & 7168) | (i20 & 57344), 0);
                                    composer2.endReplaceGroup();
                                }
                                SpotifyMiniPlayerCardKt.SpotifyMiniPlayerCard(null, composer2, 0, 1);
                                RecordingControlBar(isPaused, onPauseToggle, onStop, composer2, (i18 >> 9) & PointerIconCompat.TYPE_TEXT);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endNode();
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                ComposerKt.sourceInformationMarkerEnd(composer2);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier2;
                            str3 = str4;
                            z3 = z4;
                        } else {
                            startRestartGroup.skipToGroupEnd();
                            str3 = str2;
                            z3 = z2;
                            num2 = num;
                            modifier3 = modifier;
                            composer2 = startRestartGroup;
                        }
                        endRestartGroup = composer2.endRestartGroup();
                        if (endRestartGroup != null) {
                            final Integer num3 = num2;
                            final Modifier modifier8 = modifier3;
                            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingScreenKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    Unit ActiveRecordingPane$lambda$4;
                                    ActiveRecordingPane$lambda$4 = RecordingScreenKt.ActiveRecordingPane$lambda$4(TrackingUiState.this, l, str, z, onPauseToggle, onStop, formatElapsed, formatPace, str3, z3, num3, modifier8, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    return ActiveRecordingPane$lambda$4;
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i7 = i3 & 512;
                    if (i7 != 0) {
                    }
                    i8 = i3 & 1024;
                    if (i8 != 0) {
                    }
                    i10 = i3 & 2048;
                    if (i10 != 0) {
                    }
                    int i142 = i9;
                    if ((i4 & 306783251) == 306783250) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i10 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (z4) {
                    }
                    boolean isPaused2 = live.isPaused();
                    if (l != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    str3 = str4;
                    z3 = z4;
                    endRestartGroup = composer2.endRestartGroup();
                    if (endRestartGroup != null) {
                    }
                }
                i4 |= i12;
                i6 = i3 & 256;
                if (i6 == 0) {
                }
                i7 = i3 & 512;
                if (i7 != 0) {
                }
                i8 = i3 & 1024;
                if (i8 != 0) {
                }
                i10 = i3 & 2048;
                if (i10 != 0) {
                }
                int i1422 = i9;
                if ((i4 & 306783251) == 306783250) {
                }
                if (i6 != 0) {
                }
                if (i7 != 0) {
                }
                if (i8 != 0) {
                }
                if (i10 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (z4) {
                }
                boolean isPaused22 = live.isPaused();
                if (l != null) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier2;
                str3 = str4;
                z3 = z4;
                endRestartGroup = composer2.endRestartGroup();
                if (endRestartGroup != null) {
                }
            }
            i4 |= i13;
            if ((i3 & 128) == 0) {
            }
            i4 |= i12;
            i6 = i3 & 256;
            if (i6 == 0) {
            }
            i7 = i3 & 512;
            if (i7 != 0) {
            }
            i8 = i3 & 1024;
            if (i8 != 0) {
            }
            i10 = i3 & 2048;
            if (i10 != 0) {
            }
            int i14222 = i9;
            if ((i4 & 306783251) == 306783250) {
            }
            if (i6 != 0) {
            }
            if (i7 != 0) {
            }
            if (i8 != 0) {
            }
            if (i10 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            if (z4) {
            }
            boolean isPaused222 = live.isPaused();
            if (l != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier2;
            str3 = str4;
            z3 = z4;
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 |= i5;
        if ((i3 & 64) != 0) {
        }
        i4 |= i13;
        if ((i3 & 128) == 0) {
        }
        i4 |= i12;
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        i7 = i3 & 512;
        if (i7 != 0) {
        }
        i8 = i3 & 1024;
        if (i8 != 0) {
        }
        i10 = i3 & 2048;
        if (i10 != 0) {
        }
        int i142222 = i9;
        if ((i4 & 306783251) == 306783250) {
        }
        if (i6 != 0) {
        }
        if (i7 != 0) {
        }
        if (i8 != 0) {
        }
        if (i10 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        if (z4) {
        }
        boolean isPaused2222 = live.isPaused();
        if (l != null) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier2;
        str3 = str4;
        z3 = z4;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    private static final void RecordingGpsStrip(final boolean z, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(156447525);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(156447525, i2, -1, "com.example.rungps.ui.main.RecordingGpsStrip (RecordingScreen.kt:142)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical center = Arrangement.INSTANCE.getCenter();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(center, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            ImageVector gps = EtIcons.INSTANCE.getGps();
            startRestartGroup.startReplaceGroup(1077569426);
            long Color = z ? ColorKt.Color(4281236786L) : MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant();
            startRestartGroup.endReplaceGroup();
            IconKt.m1833Iconww6aTOc(gps, (String) null, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16)), Color, startRestartGroup, 438, 0);
            SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(6)), startRestartGroup, 6);
            String str = z ? "GPS" : "GPS…";
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium();
            startRestartGroup.startReplaceGroup(1077579218);
            long Color2 = z ? ColorKt.Color(4281236786L) : MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant();
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str, (Modifier) null, Color2, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelMedium, composer2, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecordingGpsStrip$lambda$6;
                    RecordingGpsStrip$lambda$6 = RecordingScreenKt.RecordingGpsStrip$lambda$6(z, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecordingGpsStrip$lambda$6;
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void RecordingStatsCard(final TrackingUiState trackingUiState, final boolean z, final Function1<? super Long, String> function1, final Function1<? super Double, String> function12, String str, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        String str2;
        final String str3;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(572472529);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(trackingUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                str2 = str;
                i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
                if ((i3 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                    String str4 = i4 != 0 ? null : str2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(572472529, i3, -1, "com.example.rungps.ui.main.RecordingStatsCard (RecordingScreen.kt:170)");
                    }
                    final Double intervalPaceSecPerKm = intervalPaceSecPerKm(trackingUiState);
                    final Double avgPaceSecPerKm = avgPaceSecPerKm(trackingUiState);
                    final String str5 = str4;
                    final Double valueOf = avgPaceSecPerKm != null ? Double.valueOf(3600.0d / avgPaceSecPerKm.doubleValue()) : null;
                    CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(16)), CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m1512cardElevationaqJV_2Y(Dp.m6303constructorimpl(6), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-340153021, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.RecordingScreenKt$RecordingStatsCard$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                            invoke(columnScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(ColumnScope Card, Composer composer2, int i5) {
                            Function1<Double, String> function13;
                            String str6;
                            Intrinsics.checkNotNullParameter(Card, "$this$Card");
                            if ((i5 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-340153021, i5, -1, "com.example.rungps.ui.main.RecordingStatsCard.<anonymous> (RecordingScreen.kt:181)");
                            }
                            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                            Function1<Long, String> function14 = function1;
                            TrackingUiState trackingUiState2 = trackingUiState;
                            String str7 = str5;
                            boolean z2 = z;
                            Double d = intervalPaceSecPerKm;
                            Function1<Double, String> function15 = function12;
                            Double d2 = valueOf;
                            Double d3 = avgPaceSecPerKm;
                            ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m684padding3ABfNKs);
                            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                            TextKt.m2376Text4IGK_g(function14.invoke(Long.valueOf(trackingUiState2.getElapsedMs())), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getHeadlineLarge(), composer2, 196656, 0, 64988);
                            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer2, 6);
                            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                            if (!(composer2.getApplier() instanceof Applier)) {
                                ComposablesKt.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor2);
                            } else {
                                composer2.useNode();
                            }
                            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                            Function2<Composer, Integer, Unit> m7237getLambda1$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7237getLambda1$app_sideload();
                            String str8 = "—";
                            if (z2 && d != null) {
                                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                                str6 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(3600.0d / RangesKt.coerceAtLeast(d.doubleValue(), 1.0d))}, 1));
                                Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                                function13 = function15;
                            } else if (d != null) {
                                function13 = function15;
                                str6 = function13.invoke(d);
                            } else {
                                function13 = function15;
                                str6 = "—";
                            }
                            RecordingScreenKt.StatIconColumn(m7237getLambda1$app_sideload, str6, z2 ? "int km/h" : "int /km", composer2, 6);
                            Function2<Composer, Integer, Unit> m7238getLambda2$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7238getLambda2$app_sideload();
                            if (z2 && d2 != null) {
                                StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                                str8 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{d2}, 1));
                                Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                            } else if (d3 != null) {
                                str8 = function13.invoke(d3);
                            }
                            RecordingScreenKt.StatIconColumn(m7238getLambda2$app_sideload, str8, z2 ? "avg km/h" : "avg /km", composer2, 6);
                            Function2<Composer, Integer, Unit> m7239getLambda3$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7239getLambda3$app_sideload();
                            StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                            String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(trackingUiState2.getDistanceM() / 1000.0d)}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            RecordingScreenKt.StatIconColumn(m7239getLambda3$app_sideload, format, "km", composer2, 390);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            RecordingScreenKt.KmSplitBars(trackingUiState2.getSplitCount(), trackingUiState2.getDistanceM(), null, composer2, 0, 4);
                            composer2.startReplaceGroup(2064170192);
                            if (str7 != null) {
                                TextKt.m2376Text4IGK_g(str7, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 48, 0, 65016);
                            }
                            composer2.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            composer2.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            ComposerKt.sourceInformationMarkerEnd(composer2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 196614, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str3 = str4;
                } else {
                    startRestartGroup.skipToGroupEnd();
                    str3 = str2;
                }
                endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingScreenKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            Unit RecordingStatsCard$lambda$8;
                            RecordingStatsCard$lambda$8 = RecordingScreenKt.RecordingStatsCard$lambda$8(TrackingUiState.this, z, function1, function12, str3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            return RecordingStatsCard$lambda$8;
                        }
                    });
                    return;
                }
                return;
            }
            str2 = str;
            if ((i3 & 9363) == 9362) {
            }
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Double intervalPaceSecPerKm2 = intervalPaceSecPerKm(trackingUiState);
            final Double avgPaceSecPerKm2 = avgPaceSecPerKm(trackingUiState);
            if (avgPaceSecPerKm2 != null) {
            }
            final String str52 = str4;
            final Double valueOf2 = avgPaceSecPerKm2 != null ? Double.valueOf(3600.0d / avgPaceSecPerKm2.doubleValue()) : null;
            CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(16)), CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m1512cardElevationaqJV_2Y(Dp.m6303constructorimpl(6), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-340153021, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.RecordingScreenKt$RecordingStatsCard$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                    invoke(columnScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(ColumnScope Card, Composer composer2, int i5) {
                    Function1<Double, String> function13;
                    String str6;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-340153021, i5, -1, "com.example.rungps.ui.main.RecordingStatsCard.<anonymous> (RecordingScreen.kt:181)");
                    }
                    Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                    Function1<Long, String> function14 = function1;
                    TrackingUiState trackingUiState2 = trackingUiState;
                    String str7 = str52;
                    boolean z2 = z;
                    Double d = intervalPaceSecPerKm2;
                    Function1<Double, String> function15 = function12;
                    Double d2 = valueOf2;
                    Double d3 = avgPaceSecPerKm2;
                    ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m684padding3ABfNKs);
                    Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    TextKt.m2376Text4IGK_g(function14.invoke(Long.valueOf(trackingUiState2.getElapsedMs())), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getHeadlineLarge(), composer2, 196656, 0, 64988);
                    Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                    ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                    MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer2, 6);
                    ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                    if (!(composer2.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                    Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    Function2<Composer, Integer, Unit> m7237getLambda1$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7237getLambda1$app_sideload();
                    String str8 = "—";
                    if (z2 && d != null) {
                        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                        str6 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(3600.0d / RangesKt.coerceAtLeast(d.doubleValue(), 1.0d))}, 1));
                        Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                        function13 = function15;
                    } else if (d != null) {
                        function13 = function15;
                        str6 = function13.invoke(d);
                    } else {
                        function13 = function15;
                        str6 = "—";
                    }
                    RecordingScreenKt.StatIconColumn(m7237getLambda1$app_sideload, str6, z2 ? "int km/h" : "int /km", composer2, 6);
                    Function2<Composer, Integer, Unit> m7238getLambda2$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7238getLambda2$app_sideload();
                    if (z2 && d2 != null) {
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        str8 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{d2}, 1));
                        Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                    } else if (d3 != null) {
                        str8 = function13.invoke(d3);
                    }
                    RecordingScreenKt.StatIconColumn(m7238getLambda2$app_sideload, str8, z2 ? "avg km/h" : "avg /km", composer2, 6);
                    Function2<Composer, Integer, Unit> m7239getLambda3$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7239getLambda3$app_sideload();
                    StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                    String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(trackingUiState2.getDistanceM() / 1000.0d)}, 1));
                    Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                    RecordingScreenKt.StatIconColumn(m7239getLambda3$app_sideload, format, "km", composer2, 390);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    RecordingScreenKt.KmSplitBars(trackingUiState2.getSplitCount(), trackingUiState2.getDistanceM(), null, composer2, 0, 4);
                    composer2.startReplaceGroup(2064170192);
                    if (str7 != null) {
                        TextKt.m2376Text4IGK_g(str7, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 48, 0, 65016);
                    }
                    composer2.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    composer2.endNode();
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    ComposerKt.sourceInformationMarkerEnd(composer2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 196614, 16);
            if (ComposerKt.isTraceInProgress()) {
            }
            str3 = str4;
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        str2 = str;
        if ((i3 & 9363) == 9362) {
        }
        if (i4 != 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final Double intervalPaceSecPerKm22 = intervalPaceSecPerKm(trackingUiState);
        final Double avgPaceSecPerKm22 = avgPaceSecPerKm(trackingUiState);
        if (avgPaceSecPerKm22 != null) {
        }
        final String str522 = str4;
        final Double valueOf22 = avgPaceSecPerKm22 != null ? Double.valueOf(3600.0d / avgPaceSecPerKm22.doubleValue()) : null;
        CardKt.Card(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(16)), CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m1512cardElevationaqJV_2Y(Dp.m6303constructorimpl(6), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-340153021, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.RecordingScreenKt$RecordingStatsCard$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer2, Integer num) {
                invoke(columnScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer2, int i5) {
                Function1<Double, String> function13;
                String str6;
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i5 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-340153021, i5, -1, "com.example.rungps.ui.main.RecordingStatsCard.<anonymous> (RecordingScreen.kt:181)");
                }
                Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
                Function1<Long, String> function14 = function1;
                TrackingUiState trackingUiState2 = trackingUiState;
                String str7 = str522;
                boolean z2 = z;
                Double d = intervalPaceSecPerKm22;
                Function1<Double, String> function15 = function12;
                Double d2 = valueOf22;
                Double d3 = avgPaceSecPerKm22;
                ComposerKt.sourceInformationMarkerStart(composer2, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, m684padding3ABfNKs);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor);
                } else {
                    composer2.useNode();
                }
                Composer m3336constructorimpl = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                TextKt.m2376Text4IGK_g(function14.invoke(Long.valueOf(trackingUiState2.getElapsedMs())), SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getHeadlineLarge(), composer2, 196656, 0, 64988);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, Alignment.INSTANCE.getTop(), composer2, 6);
                ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer2, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer2.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.createNode(constructor2);
                } else {
                    composer2.useNode();
                }
                Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer2);
                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                Function2<Composer, Integer, Unit> m7237getLambda1$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7237getLambda1$app_sideload();
                String str8 = "—";
                if (z2 && d != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    str6 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(3600.0d / RangesKt.coerceAtLeast(d.doubleValue(), 1.0d))}, 1));
                    Intrinsics.checkNotNullExpressionValue(str6, "format(...)");
                    function13 = function15;
                } else if (d != null) {
                    function13 = function15;
                    str6 = function13.invoke(d);
                } else {
                    function13 = function15;
                    str6 = "—";
                }
                RecordingScreenKt.StatIconColumn(m7237getLambda1$app_sideload, str6, z2 ? "int km/h" : "int /km", composer2, 6);
                Function2<Composer, Integer, Unit> m7238getLambda2$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7238getLambda2$app_sideload();
                if (z2 && d2 != null) {
                    StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                    str8 = String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{d2}, 1));
                    Intrinsics.checkNotNullExpressionValue(str8, "format(...)");
                } else if (d3 != null) {
                    str8 = function13.invoke(d3);
                }
                RecordingScreenKt.StatIconColumn(m7238getLambda2$app_sideload, str8, z2 ? "avg km/h" : "avg /km", composer2, 6);
                Function2<Composer, Integer, Unit> m7239getLambda3$app_sideload = ComposableSingletons$RecordingScreenKt.INSTANCE.m7239getLambda3$app_sideload();
                StringCompanionObject stringCompanionObject3 = StringCompanionObject.INSTANCE;
                String format = String.format(Locale.US, "%.2f", Arrays.copyOf(new Object[]{Double.valueOf(trackingUiState2.getDistanceM() / 1000.0d)}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                RecordingScreenKt.StatIconColumn(m7239getLambda3$app_sideload, format, "km", composer2, 390);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                RecordingScreenKt.KmSplitBars(trackingUiState2.getSplitCount(), trackingUiState2.getDistanceM(), null, composer2, 0, 4);
                composer2.startReplaceGroup(2064170192);
                if (str7 != null) {
                    TextKt.m2376Text4IGK_g(str7, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer2, MaterialTheme.$stable).getBodyMedium(), composer2, 48, 0, 65016);
                }
                composer2.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                composer2.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                ComposerKt.sourceInformationMarkerEnd(composer2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, startRestartGroup, 54), startRestartGroup, 196614, 16);
        if (ComposerKt.isTraceInProgress()) {
        }
        str3 = str4;
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void RecordingNoMapHud(final TrackingUiState trackingUiState, final boolean z, final Function1<? super Long, String> function1, final Function1<? super Double, String> function12, String str, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        int i4;
        Double intervalPaceSecPerKm;
        Double avgPaceSecPerKm;
        Double d;
        Double d2;
        int currentCompositeKeyHash;
        Composer m3336constructorimpl;
        Double d3;
        int i5;
        int i6;
        String invoke;
        Double d4;
        String str3;
        String invoke2;
        String segmentLabel;
        final String str4;
        Composer startRestartGroup = composer.startRestartGroup(1100950974);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(trackingUiState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= startRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= startRestartGroup.changedInstance(function12) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            str2 = str;
            i3 |= startRestartGroup.changed(str2) ? 16384 : 8192;
            i4 = i3;
            if ((i4 & 9363) == 9362 || !startRestartGroup.getSkipping()) {
                String str5 = i7 == 0 ? null : str2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1100950974, i4, -1, "com.example.rungps.ui.main.RecordingNoMapHud (RecordingScreen.kt:239)");
                }
                intervalPaceSecPerKm = intervalPaceSecPerKm(trackingUiState);
                avgPaceSecPerKm = avgPaceSecPerKm(trackingUiState);
                Double valueOf = intervalPaceSecPerKm == null ? Double.valueOf(3600.0d / RangesKt.coerceAtLeast(intervalPaceSecPerKm.doubleValue(), 1.0d)) : null;
                if (avgPaceSecPerKm == null) {
                    d = avgPaceSecPerKm;
                    d2 = Double.valueOf(3600.0d / RangesKt.coerceAtLeast(avgPaceSecPerKm.doubleValue(), 1.0d));
                } else {
                    d = avgPaceSecPerKm;
                    d2 = null;
                }
                double distanceM = trackingUiState.getDistanceM() / 1000.0d;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-855740175);
                if (trackingUiState.isPaused()) {
                    d3 = d;
                    i5 = i4;
                    i6 = 1;
                } else {
                    d3 = d;
                    i6 = 1;
                    i5 = i4;
                    TextKt.m2376Text4IGK_g("PAUSED", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelLarge(), startRestartGroup, 196614, 0, 65498);
                }
                startRestartGroup.endReplaceGroup();
                TextKt.m2376Text4IGK_g(function1.invoke(Long.valueOf(trackingUiState.getElapsedMs())), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, TextUnitKt.getSp(i6), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplayMedium(), startRestartGroup, 12779520, 0, 65374);
                if (!z && valueOf != null) {
                    StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                    invoke = String.format(Locale.US, "%.1f km/h", Arrays.copyOf(new Object[]{valueOf}, i6));
                    Intrinsics.checkNotNullExpressionValue(invoke, "format(...)");
                } else {
                    invoke = intervalPaceSecPerKm == null ? function12.invoke(intervalPaceSecPerKm) : "—";
                }
                TextKt.m2376Text4IGK_g(invoke, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                TextKt.m2376Text4IGK_g(!z ? "interval speed" : "interval pace", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
                if (z || d2 == null) {
                    d4 = d3;
                    if (d4 != null) {
                        str3 = "—";
                        TextKt.m2376Text4IGK_g(str3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleLarge(), startRestartGroup, 0, 0, 65530);
                        StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
                        String format = String.format(Locale.US, "%.2f km", Arrays.copyOf(new Object[]{Double.valueOf(distanceM)}, 1));
                        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                        float f = 8;
                        TextKt.m2376Text4IGK_g(format, PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(f), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), startRestartGroup, 48, 0, 65532);
                        KmSplitBars(trackingUiState.getSplitCount(), trackingUiState.getDistanceM(), PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(16), 0.0f, 0.0f, 13, null), startRestartGroup, 384, 0);
                        startRestartGroup.startReplaceGroup(-855686875);
                        if (str5 != null) {
                            TextKt.m2376Text4IGK_g(str5, PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(f), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, ((i5 >> 12) & 14) | 48, 0, 65528);
                        }
                        startRestartGroup.endReplaceGroup();
                        segmentLabel = trackingUiState.getSegmentLabel();
                        startRestartGroup.startReplaceGroup(-855677232);
                        if (segmentLabel != null) {
                            TextKt.m2376Text4IGK_g(segmentLabel, PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(f), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium(), startRestartGroup, 48, 0, 65528);
                            Unit unit = Unit.INSTANCE;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        startRestartGroup.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        startRestartGroup.endNode();
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        str4 = str5;
                    } else {
                        invoke2 = function12.invoke(d4);
                    }
                } else {
                    invoke2 = ActivityFormattersKt.formatSpeedKmh(d2.doubleValue());
                }
                str3 = invoke2;
                TextKt.m2376Text4IGK_g(str3, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleLarge(), startRestartGroup, 0, 0, 65530);
                StringCompanionObject stringCompanionObject22 = StringCompanionObject.INSTANCE;
                String format2 = String.format(Locale.US, "%.2f km", Arrays.copyOf(new Object[]{Double.valueOf(distanceM)}, 1));
                Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
                float f2 = 8;
                TextKt.m2376Text4IGK_g(format2, PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(f2), 0.0f, 0.0f, 13, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), startRestartGroup, 48, 0, 65532);
                KmSplitBars(trackingUiState.getSplitCount(), trackingUiState.getDistanceM(), PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(16), 0.0f, 0.0f, 13, null), startRestartGroup, 384, 0);
                startRestartGroup.startReplaceGroup(-855686875);
                if (str5 != null) {
                }
                startRestartGroup.endReplaceGroup();
                segmentLabel = trackingUiState.getSegmentLabel();
                startRestartGroup.startReplaceGroup(-855677232);
                if (segmentLabel != null) {
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                }
                str4 = str5;
            } else {
                startRestartGroup.skipToGroupEnd();
                str4 = str2;
            }
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit RecordingNoMapHud$lambda$13;
                        RecordingNoMapHud$lambda$13 = RecordingScreenKt.RecordingNoMapHud$lambda$13(TrackingUiState.this, z, function1, function12, str4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return RecordingNoMapHud$lambda$13;
                    }
                });
                return;
            }
            return;
        }
        str2 = str;
        i4 = i3;
        if ((i4 & 9363) == 9362) {
        }
        if (i7 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        intervalPaceSecPerKm = intervalPaceSecPerKm(trackingUiState);
        avgPaceSecPerKm = avgPaceSecPerKm(trackingUiState);
        if (intervalPaceSecPerKm == null) {
        }
        if (avgPaceSecPerKm == null) {
        }
        double distanceM2 = trackingUiState.getDistanceM() / 1000.0d;
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
        Alignment.Horizontal centerHorizontally2 = Alignment.INSTANCE.getCenterHorizontally();
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
        MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, centerHorizontally2, startRestartGroup, 54);
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash2);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
        ColumnScopeInstance columnScopeInstance2 = ColumnScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(-855740175);
        if (trackingUiState.isPaused()) {
        }
        startRestartGroup.endReplaceGroup();
        TextKt.m2376Text4IGK_g(function1.invoke(Long.valueOf(trackingUiState.getElapsedMs())), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getBold(), (FontFamily) null, TextUnitKt.getSp(i6), (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplayMedium(), startRestartGroup, 12779520, 0, 65374);
        if (!z) {
        }
        if (intervalPaceSecPerKm == null) {
        }
        TextKt.m2376Text4IGK_g(invoke, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplaySmall(), startRestartGroup, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
        TextKt.m2376Text4IGK_g(!z ? "interval speed" : "interval pace", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), startRestartGroup, 0, 0, 65530);
        if (z) {
        }
        d4 = d3;
        if (d4 != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void StatIconColumn(final Function2<? super Composer, ? super Integer, Unit> function2, final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(402318920);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 256 : 128;
        }
        int i3 = i2;
        if ((i3 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(402318920, i3, -1, "com.example.rungps.ui.main.StatIconColumn (RecordingScreen.kt:318)");
            }
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            Composer m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            function2.invoke(startRestartGroup, Integer.valueOf(i3 & 14));
            TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleLarge(), startRestartGroup, ((i3 >> 3) & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelSmall(), composer2, (i3 >> 6) & 14, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            composer2.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            ComposerKt.sourceInformationMarkerEnd(composer2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingScreenKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit StatIconColumn$lambda$15;
                    StatIconColumn$lambda$15 = RecordingScreenKt.StatIconColumn$lambda$15(Function2.this, str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return StatIconColumn$lambda$15;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void KmSplitBars(final int i, final double d, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Modifier modifier2;
        int i5;
        int currentCompositeKeyHash;
        Modifier modifier3;
        Composer m3336constructorimpl;
        int i6;
        String str;
        int i7;
        int i8;
        String str2;
        int i9;
        int i10;
        ScopeUpdateScope endRestartGroup;
        Composer startRestartGroup = composer.startRestartGroup(562286123);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (startRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= startRestartGroup.changed(d) ? 32 : 16;
        }
        int i11 = i3 & 4;
        if (i11 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            modifier2 = modifier;
            i4 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i4 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(562286123, i4, -1, "com.example.rungps.ui.main.KmSplitBars (RecordingScreen.kt:327)");
                }
                float coerceIn = RangesKt.coerceIn((float) ((d % 1000.0d) / 1000.0d), 0.0f, 1.0f);
                int coerceAtMost = RangesKt.coerceAtMost(i, 3);
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                Alignment.Vertical bottom = Alignment.INSTANCE.getBottom();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, bottom, startRestartGroup, 54);
                int i12 = -1323940314;
                String str3 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                modifier3 = modifier4;
                String str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(startRestartGroup.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                startRestartGroup.startReusableNode();
                if (!startRestartGroup.getInserting()) {
                    startRestartGroup.createNode(constructor);
                } else {
                    startRestartGroup.useNode();
                }
                m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
                Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (!m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(534141943);
                i6 = 0;
                while (i6 < i5) {
                    float f = (i6 == coerceAtMost && i == coerceAtMost) ? coerceIn : i6 < coerceAtMost ? 1.0f : 0.0f;
                    Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
                    Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, startRestartGroup, 48);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, i12, str3);
                    int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
                    Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                    float f2 = coerceIn;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor2);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3336constructorimpl2 = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl2, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    float f3 = 28;
                    float f4 = 4;
                    Modifier m239backgroundbw27NRU$default = BackgroundKt.m239backgroundbw27NRU$default(ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(f3)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f4))), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceContainerHighest(), null, 2, null);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, str3);
                    int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
                    Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, m239backgroundbw27NRU$default);
                    Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                    String str5 = str3;
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str4);
                    if (!(startRestartGroup.getApplier() instanceof Applier)) {
                        ComposablesKt.invalidApplier();
                    }
                    startRestartGroup.startReusableNode();
                    if (startRestartGroup.getInserting()) {
                        startRestartGroup.createNode(constructor3);
                    } else {
                        startRestartGroup.useNode();
                    }
                    Composer m3336constructorimpl3 = Updater.m3336constructorimpl(startRestartGroup);
                    Updater.m3343setimpl(m3336constructorimpl3, maybeCachedBoxMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                    Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                    if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                    ComposerKt.sourceInformationMarkerStart(startRestartGroup, -2146769399, "C73@3429L9:Box.kt#2w3rfo");
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    startRestartGroup.startReplaceGroup(-506174572);
                    if (f > 0.0f) {
                        str = str4;
                        i7 = coerceAtMost;
                        i10 = 3;
                        str2 = str5;
                        i8 = i6;
                        i9 = -1323940314;
                        ProgressIndicatorKt.m2056LinearProgressIndicator_5eSRE(f, ClipKt.clip(SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(f3)), RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(f4))), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary(), Color.INSTANCE.m3878getTransparent0d7_KjU(), 0, startRestartGroup, 3072, 16);
                    } else {
                        str = str4;
                        i7 = coerceAtMost;
                        i8 = i6;
                        str2 = str5;
                        i9 = -1323940314;
                        i10 = 3;
                    }
                    startRestartGroup.endReplaceGroup();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    startRestartGroup.endNode();
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                    i6 = i8 + 1;
                    i12 = i9;
                    str3 = str2;
                    coerceAtMost = i7;
                    coerceIn = f2;
                    str4 = str;
                }
                startRestartGroup.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                startRestartGroup.endNode();
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit KmSplitBars$lambda$20;
                        KmSplitBars$lambda$20 = RecordingScreenKt.KmSplitBars$lambda$20(i, d, modifier5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        return KmSplitBars$lambda$20;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i4 & 147) == 146) {
        }
        if (i11 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        float coerceIn2 = RangesKt.coerceIn((float) ((d % 1000.0d) / 1000.0d), 0.0f, 1.0f);
        int coerceAtMost2 = RangesKt.coerceAtMost(i, 3);
        Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
        Alignment.Vertical bottom2 = Alignment.INSTANCE.getBottom();
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, bottom2, startRestartGroup, 54);
        int i122 = -1323940314;
        String str32 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap4 = startRestartGroup.getCurrentCompositionLocalMap();
        Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
        Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
        modifier3 = modifier4;
        String str42 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(startRestartGroup.getApplier() instanceof Applier)) {
        }
        startRestartGroup.startReusableNode();
        if (!startRestartGroup.getInserting()) {
        }
        m3336constructorimpl = Updater.m3336constructorimpl(startRestartGroup);
        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
        if (!m3336constructorimpl.getInserting()) {
        }
        m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
        m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash4);
        Updater.m3343setimpl(m3336constructorimpl, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
        ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
        startRestartGroup.startReplaceGroup(534141943);
        i6 = 0;
        for (i5 = 3; i6 < i5; i5 = i10) {
        }
        startRestartGroup.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        startRestartGroup.endNode();
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
        if (ComposerKt.isTraceInProgress()) {
        }
        endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    private static final void RecordingControlBar(final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1397968155);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1397968155, i2, -1, "com.example.rungps.ui.main.RecordingControlBar (RecordingScreen.kt:371)");
            }
            float f = 20;
            composer2 = startRestartGroup;
            SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), RoundedCornerShapeKt.m969RoundedCornerShapea9UjIt4$default(Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f), 0.0f, 0.0f, 12, null), MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurface(), 0L, 0.0f, Dp.m6303constructorimpl(8), null, ComposableLambdaKt.rememberComposableLambda(-1324161600, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.RecordingScreenKt$RecordingControlBar$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1324161600, i3, -1, "com.example.rungps.ui.main.RecordingControlBar.<anonymous> (RecordingScreen.kt:378)");
                        }
                        Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(20), Dp.m6303constructorimpl(16));
                        Arrangement.HorizontalOrVertical spaceEvenly = Arrangement.INSTANCE.getSpaceEvenly();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        Function0<Unit> function03 = function02;
                        Function0<Unit> function04 = function0;
                        final boolean z2 = z;
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceEvenly, centerVertically, composer3, 54);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m685paddingVpY3zN4);
                        Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3336constructorimpl = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        float f2 = 56;
                        ButtonKt.Button(function03, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(f2)), false, RoundedCornerShapeKt.getCircleShape(), ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getErrorContainer(), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnErrorContainer(), 0L, 0L, composer3, ButtonDefaults.$stable << 12, 12), null, null, ButtonDefaults.INSTANCE.getContentPadding(), null, ComposableSingletons$RecordingScreenKt.INSTANCE.m7240getLambda4$app_sideload(), composer3, 805306416, 356);
                        ButtonKt.Button(function04, PaddingKt.m686paddingVpY3zN4$default(RowScope.weight$default(rowScopeInstance, SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(f2)), 1.0f, false, 2, null), Dp.m6303constructorimpl(12), 0.0f, 2, null), false, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(28)), ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(ColorKt.Color(4294940672L), Color.INSTANCE.m3880getWhite0d7_KjU(), 0L, 0L, composer3, (ButtonDefaults.$stable << 12) | 54, 12), null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1479598187, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.RecordingScreenKt$RecordingControlBar$1$1$1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                invoke(rowScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope Button, Composer composer4, int i4) {
                                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                                if ((i4 & 17) != 16 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1479598187, i4, -1, "com.example.rungps.ui.main.RecordingControlBar.<anonymous>.<anonymous>.<anonymous> (RecordingScreen.kt:410)");
                                    }
                                    IconKt.m1833Iconww6aTOc(z2 ? EtIcons.INSTANCE.getPlay() : EtIcons.INSTANCE.getPause(), z2 ? "Resume" : "Pause", (Modifier) null, 0L, composer4, 0, 12);
                                    SpacerKt.Spacer(SizeKt.m734width3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(8)), composer4, 6);
                                    TextKt.m2376Text4IGK_g(z2 ? "Resume" : "Pause", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 131038);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composer3, 54), composer3, 805306368, 484);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, startRestartGroup, 54), startRestartGroup, 12779526, 88);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.RecordingScreenKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit RecordingControlBar$lambda$21;
                    RecordingControlBar$lambda$21 = RecordingScreenKt.RecordingControlBar$lambda$21(z, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return RecordingControlBar$lambda$21;
                }
            });
        }
    }

    public static final Double intervalPaceSecPerKm(TrackingUiState live) {
        Intrinsics.checkNotNullParameter(live, "live");
        double distanceM = live.getDistanceM() % 1000.0d;
        if (distanceM >= 20.0d && live.getCurrentSplitElapsedMs() > 0) {
            return Double.valueOf((live.getCurrentSplitElapsedMs() / 1000.0d) / (distanceM / 1000.0d));
        }
        if (live.getLastSplitMs() != null) {
            return Double.valueOf(r8.longValue() / 1000.0d);
        }
        return null;
    }

    public static final Double avgPaceSecPerKm(TrackingUiState live) {
        Intrinsics.checkNotNullParameter(live, "live");
        double distanceM = live.getDistanceM() / 1000.0d;
        if (distanceM < 0.01d) {
            return null;
        }
        return Double.valueOf((live.getElapsedMs() / 1000.0d) / distanceM);
    }
}
