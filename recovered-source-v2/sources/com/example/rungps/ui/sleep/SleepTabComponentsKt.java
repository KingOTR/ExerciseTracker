package com.example.rungps.ui.sleep;

import android.app.AlarmManager;
import android.content.Context;
import android.os.Build;
import android.widget.Toast;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.MenuKt;
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
import androidx.compose.ui.graphics.Color;
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
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.AppBranding;
import com.example.rungps.data.AppPreferences;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.health.SleepScoring;
import com.example.rungps.sleep.BatteryOptimizationNudge;
import com.example.rungps.sleep.SleepAlarmScheduler;
import com.example.rungps.sleep.SleepListenService;
import com.example.rungps.sleep.SleepOvernightStore;
import com.google.firebase.firestore.model.Values;
import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: SleepTabComponents.kt */
@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a \u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0000\u001a0\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0000\u001a-\u0010\u001a\u001a\u00020\u00032\u001e\u0010\u001b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00060\u001d0\u001cH\u0007¢\u0006\u0002\u0010\u001e\u001a#\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006H\u0007¢\u0006\u0002\u0010\"\u001a\u001d\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00012\u0006\u0010%\u001a\u00020\u0001H\u0007¢\u0006\u0002\u0010&\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"SLEEP_TAB_LOG", "", "SleepOvernightPrimaryButton", "", "text", "onClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "formatSleepInstant", "ms", "", "zone", "Ljava/time/ZoneId;", "fmt", "Ljava/time/format/DateTimeFormatter;", "startOvernight", "ctx", "Landroid/content/Context;", "hour", "", "minute", "windowMin", "smartAlarm", "", "FlowRowMini", "items", "", "Lkotlin/Pair;", "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V", "SleepNightRow", "e", "Lcom/example/rungps/data/SleepEntryEntity;", "(Lcom/example/rungps/data/SleepEntryEntity;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "SleepStatChip", "label", Values.VECTOR_MAP_VECTORS_KEY, "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepTabComponentsKt {
    public static final String SLEEP_TAB_LOG = "SleepTab";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FlowRowMini$lambda$7(List list, int i, Composer composer, int i2) {
        FlowRowMini(list, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepNightRow$lambda$8(SleepEntryEntity sleepEntryEntity, Function0 function0, int i, Composer composer, int i2) {
        SleepNightRow(sleepEntryEntity, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepOvernightPrimaryButton$lambda$0(String str, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepOvernightPrimaryButton(str, function0, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepStatChip$lambda$9(String str, String str2, int i, Composer composer, int i2) {
        SleepStatChip(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepOvernightPrimaryButton(final String text, final Function0<Unit> onClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(52346208);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(text) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 256 : 128;
            if ((i3 & 147) == 146 || !startRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(52346208, i3, -1, "com.example.rungps.ui.sleep.SleepOvernightPrimaryButton (SleepTabComponents.kt:49)");
                }
                Modifier modifier5 = modifier4;
                composer2 = startRestartGroup;
                ButtonKt.Button(onClick, SizeKt.m717heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m6303constructorimpl(58), 0.0f, 2, null), false, null, null, null, null, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6303constructorimpl(24), Dp.m6303constructorimpl(18)), null, ComposableLambdaKt.rememberComposableLambda(-1563458224, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$SleepOvernightPrimaryButton$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                        invoke(rowScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RowScope Button, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(Button, "$this$Button");
                        if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1563458224, i5, -1, "com.example.rungps.ui.sleep.SleepOvernightPrimaryButton.<anonymous> (SleepTabComponents.kt:57)");
                            }
                            TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleLarge();
                            TextKt.m2376Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleLarge, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer3.skipToGroupEnd();
                    }
                }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 805306368, 380);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                startRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SleepOvernightPrimaryButton$lambda$0;
                        SleepOvernightPrimaryButton$lambda$0 = SleepTabComponentsKt.SleepOvernightPrimaryButton$lambda$0(text, onClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SleepOvernightPrimaryButton$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        Modifier modifier52 = modifier4;
        composer2 = startRestartGroup;
        ButtonKt.Button(onClick, SizeKt.m717heightInVpY3zN4$default(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), Dp.m6303constructorimpl(58), 0.0f, 2, null), false, null, null, null, null, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6303constructorimpl(24), Dp.m6303constructorimpl(18)), null, ComposableLambdaKt.rememberComposableLambda(-1563458224, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$SleepOvernightPrimaryButton$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                invoke(rowScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope Button, Composer composer3, int i5) {
                Intrinsics.checkNotNullParameter(Button, "$this$Button");
                if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1563458224, i5, -1, "com.example.rungps.ui.sleep.SleepOvernightPrimaryButton.<anonymous> (SleepTabComponents.kt:57)");
                    }
                    TextStyle titleLarge = MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleLarge();
                    TextKt.m2376Text4IGK_g(text, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, titleLarge, composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer3.skipToGroupEnd();
            }
        }, startRestartGroup, 54), startRestartGroup, ((i3 >> 3) & 14) | 805306368, 380);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier3 = modifier52;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final String formatSleepInstant(long j, ZoneId zone, DateTimeFormatter fmt) {
        Intrinsics.checkNotNullParameter(zone, "zone");
        Intrinsics.checkNotNullParameter(fmt, "fmt");
        String format = Instant.ofEpochMilli(j).atZone(zone).format(fmt);
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    public static final void startOvernight(Context ctx, int i, int i2, int i3, boolean z) {
        Object m7905constructorimpl;
        AlarmManager alarmManager;
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        if (Build.VERSION.SDK_INT >= 31 && (alarmManager = (AlarmManager) ctx.getSystemService(AlarmManager.class)) != null && !alarmManager.canScheduleExactAlarms()) {
            Toast.makeText(ctx, "Optional: allow exact alarms for tighter timing — backup alarm clock alarms are still scheduled", 1).show();
        }
        if (AppPreferences.INSTANCE.sleepLiteModeBlocking(ctx)) {
            Toast.makeText(ctx, "Sleep lite mode is on — turn it off in More → App settings to use overnight microphone tracking", 1).show();
            return;
        }
        if (SleepOvernightStore.INSTANCE.isRecoverableStale(ctx)) {
            Toast.makeText(ctx, "Save your previous night first — unsaved overnight samples are waiting", 1).show();
            return;
        }
        long computeAlarmTargetMs$default = SleepListenService.Companion.computeAlarmTargetMs$default(SleepListenService.INSTANCE, i, i2, null, 4, null);
        SleepAlarmScheduler.INSTANCE.scheduleBackupAlarms(ctx, computeAlarmTargetMs$default, i3);
        BatteryOptimizationNudge.INSTANCE.requestExemptionIfNeeded(ctx);
        try {
            Result.Companion companion = Result.INSTANCE;
            SleepListenService.INSTANCE.start(ctx, computeAlarmTargetMs$default, i3, z);
            m7905constructorimpl = Result.m7905constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m7905constructorimpl = Result.m7905constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m7908exceptionOrNullimpl(m7905constructorimpl) != null) {
            Toast.makeText(ctx, "Could not start sleep tracking — check microphone permission", 1).show();
        } else {
            Toast.makeText(ctx, "Sleep tracking started — alarm " + LocalTime.of(i, i2), 1).show();
        }
    }

    public static final void FlowRowMini(final List<? extends Pair<String, ? extends Function0<Unit>>> items, Composer composer, final int i) {
        Composer composer2;
        int i2;
        Intrinsics.checkNotNullParameter(items, "items");
        Composer startRestartGroup = composer.startRestartGroup(410346490);
        int i3 = (i & 6) == 0 ? (startRestartGroup.changedInstance(items) ? 4 : 2) | i : i;
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(410346490, i3, -1, "com.example.rungps.ui.sleep.FlowRowMini (SleepTabComponents.kt:117)");
            }
            float f = 8;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            int i4 = 6;
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            int i5 = -1323940314;
            String str = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int i6 = 0;
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, companion);
            Function0<ComposeUiNode> constructor = ComposeUiNode.INSTANCE.getConstructor();
            String str2 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
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
            startRestartGroup.startReplaceGroup(116257619);
            for (List<Pair> list : CollectionsKt.chunked(items, 2)) {
                boolean z = true;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, i4);
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, i5, str);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, i6);
                CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -692256719, str2);
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
                Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                startRestartGroup.startReplaceGroup(-1675000970);
                for (Pair pair : list) {
                    final String str3 = (String) pair.component1();
                    ButtonKt.OutlinedButton((Function0) pair.component2(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1460248110, z, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$FlowRowMini$1$1$1$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                            invoke(rowScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RowScope OutlinedButton, Composer composer3, int i7) {
                            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                            if ((i7 & 17) == 16 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1460248110, i7, -1, "com.example.rungps.ui.sleep.FlowRowMini.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepTabComponents.kt:125)");
                            }
                            TextKt.m2376Text4IGK_g(str3, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 3072, 122878);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, startRestartGroup, 54), startRestartGroup, 805306368, 508);
                    startRestartGroup = startRestartGroup;
                    str = str;
                    i5 = i5;
                    str2 = str2;
                    i4 = i4;
                    f = f;
                    z = true;
                }
                String str4 = str2;
                String str5 = str;
                int i7 = i5;
                int i8 = i4;
                float f2 = f;
                Composer composer3 = startRestartGroup;
                composer3.endReplaceGroup();
                composer3.startReplaceGroup(-1674993157);
                if (list.size() == 1) {
                    i2 = 0;
                    SpacerKt.Spacer(RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), composer3, 0);
                } else {
                    i2 = 0;
                }
                composer3.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                composer3.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                ComposerKt.sourceInformationMarkerEnd(composer3);
                startRestartGroup = composer3;
                i6 = i2;
                str = str5;
                i5 = i7;
                str2 = str4;
                i4 = i8;
                f = f2;
            }
            composer2 = startRestartGroup;
            composer2.endReplaceGroup();
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
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit FlowRowMini$lambda$7;
                    FlowRowMini$lambda$7 = SleepTabComponentsKt.FlowRowMini$lambda$7(items, i, (Composer) obj, ((Integer) obj2).intValue());
                    return FlowRowMini$lambda$7;
                }
            });
        }
    }

    public static final void SleepNightRow(final SleepEntryEntity e, final Function0<Unit> onClick, Composer composer, final int i) {
        int i2;
        int resolveQuality;
        String source;
        Composer composer2;
        Intrinsics.checkNotNullParameter(e, "e");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer startRestartGroup = composer.startRestartGroup(2075244080);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2075244080, i2, -1, "com.example.rungps.ui.sleep.SleepNightRow (SleepTabComponents.kt:137)");
            }
            final int coerceAtLeast = RangesKt.coerceAtLeast((int) ((e.getEndTimeMs() - e.getStartTimeMs()) / 60000), 1);
            final int effectiveAsleepMinutes = SleepScoring.INSTANCE.effectiveAsleepMinutes(e.getTotalSleepMin(), e.getStartTimeMs(), e.getEndTimeMs(), e.getSource());
            final Integer resolveEfficiency = SleepScoring.INSTANCE.resolveEfficiency(e.getSleepEfficiency(), effectiveAsleepMinutes, coerceAtLeast, e.getDeepSleepMin(), e.getLightSleepMin());
            Integer sleepQuality = e.getSleepQuality();
            if (sleepQuality != null) {
                resolveQuality = sleepQuality.intValue();
            } else {
                resolveQuality = SleepScoring.INSTANCE.resolveQuality(e.getSource(), effectiveAsleepMinutes, (r18 & 4) != 0 ? null : e.getDeepSleepMin(), (r18 & 8) != 0 ? null : e.getLightSleepMin(), (r18 & 16) != 0 ? null : resolveEfficiency, (r18 & 32) != 0 ? null : Integer.valueOf(coerceAtLeast), (r18 & 64) != 0 ? null : null);
            }
            final int i3 = resolveQuality;
            if (SleepScoring.INSTANCE.isSleepCycleSource(e.getSource())) {
                source = "Sleep Cycle";
            } else if (SleepScoring.INSTANCE.isOvernightSource(e.getSource())) {
                source = AppBranding.OVERNIGHT_SOURCE_LABEL;
            } else {
                source = StringsKt.equals(e.getSource(), "health_connect", true) ? "Health Connect" : e.getSource();
            }
            final String str = source;
            composer2 = startRestartGroup;
            CardKt.Card(ClickableKt.m272clickableXHw0xAI$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, onClick, 7, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getSurfaceContainerHigh(), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), CardDefaults.INSTANCE.m1512cardElevationaqJV_2Y(Dp.m6303constructorimpl(0), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, startRestartGroup, (CardDefaults.$stable << 18) | 6, 62), null, ComposableLambdaKt.rememberComposableLambda(-2133853826, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$SleepNightRow$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                    invoke(columnScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:78:0x051e  */
                /* JADX WARN: Removed duplicated region for block: B:92:0x0614  */
                /* JADX WARN: Removed duplicated region for block: B:95:0x066f  */
                /* JADX WARN: Removed duplicated region for block: B:98:0x06d6  */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(ColumnScope Card, Composer composer3, int i4) {
                    Integer num;
                    char c;
                    char c2;
                    char c3;
                    Integer snoreEvents;
                    Integer wakeMood;
                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                    if ((i4 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2133853826, i4, -1, "com.example.rungps.ui.sleep.SleepNightRow.<anonymous> (SleepTabComponents.kt:173)");
                        }
                        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                        SleepEntryEntity sleepEntryEntity = SleepEntryEntity.this;
                        int i5 = i3;
                        int i6 = effectiveAsleepMinutes;
                        int i7 = coerceAtLeast;
                        Integer num2 = resolveEfficiency;
                        String str2 = str;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer3, m684padding3ABfNKs);
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
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                        Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, fillMaxWidth$default);
                        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor2);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g(SleepFormattersKt.formatSleepRange$default(sleepEntryEntity.getStartTimeMs(), sleepEntryEntity.getEndTimeMs(), null, 4, null), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                        TextKt.m2376Text4IGK_g(i5 + "/100", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelLarge(), composer3, 0, 0, 65530);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        SpacerKt.Spacer(SizeKt.m715height3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(4)), composer3, 6);
                        Modifier horizontalScroll$default = ScrollKt.horizontalScroll$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer3, 0, 1), false, null, false, 14, null);
                        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
                        Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
                        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                        MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, centerVertically2, composer3, 54);
                        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                        int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                        Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, horizontalScroll$default);
                        Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                        if (!(composer3.getApplier() instanceof Applier)) {
                            ComposablesKt.invalidApplier();
                        }
                        composer3.startReusableNode();
                        if (composer3.getInserting()) {
                            composer3.createNode(constructor3);
                        } else {
                            composer3.useNode();
                        }
                        Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer3);
                        Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                        RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
                        SleepTabComponentsKt.SleepStatChip("Asleep", SleepFormattersKt.formatDurationMinutes(i6), composer3, 6);
                        composer3.startReplaceGroup(-445303856);
                        if (i6 != i7) {
                            SleepTabComponentsKt.SleepStatChip("In bed", SleepFormattersKt.formatDurationMinutes(i7), composer3, 6);
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-445300722);
                        if (num2 != null) {
                            SleepTabComponentsKt.SleepStatChip("Efficiency", num2.intValue() + "%", composer3, 6);
                            Unit unit = Unit.INSTANCE;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        composer3.endReplaceGroup();
                        SleepTabComponentsKt.SleepStatChip("Source", str2, composer3, 6);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        List createListBuilder = CollectionsKt.createListBuilder();
                        Integer deepSleepMin = sleepEntryEntity.getDeepSleepMin();
                        if (deepSleepMin != null) {
                            if (deepSleepMin.intValue() <= 0) {
                                deepSleepMin = null;
                            }
                            if (deepSleepMin != null) {
                                Boolean.valueOf(createListBuilder.add("deep " + deepSleepMin.intValue() + "m"));
                            }
                        }
                        Integer lightSleepMin = sleepEntryEntity.getLightSleepMin();
                        if (lightSleepMin != null) {
                            if (lightSleepMin.intValue() <= 0) {
                                lightSleepMin = null;
                            }
                            if (lightSleepMin != null) {
                                Boolean.valueOf(createListBuilder.add("light " + lightSleepMin.intValue() + "m"));
                            }
                        }
                        Integer remSleepMin = sleepEntryEntity.getRemSleepMin();
                        if (remSleepMin != null) {
                            if (remSleepMin.intValue() <= 0) {
                                remSleepMin = null;
                            }
                            if (remSleepMin != null) {
                                createListBuilder.add("REM " + remSleepMin.intValue() + "m");
                                Unit unit3 = Unit.INSTANCE;
                                Unit unit4 = Unit.INSTANCE;
                            }
                        }
                        List build = CollectionsKt.build(createListBuilder);
                        composer3.startReplaceGroup(516065141);
                        if (build.isEmpty()) {
                            num = null;
                            c = 0;
                            c2 = 1;
                        } else {
                            num = null;
                            c = 0;
                            c2 = 1;
                            TextKt.m2376Text4IGK_g(CollectionsKt.joinToString$default(build, " · ", null, null, 0, null, null, 62, null), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65530);
                        }
                        composer3.endReplaceGroup();
                        String hypnogramCompact = sleepEntryEntity.getHypnogramCompact();
                        if (hypnogramCompact == null || StringsKt.isBlank(hypnogramCompact)) {
                            Integer[] numArr = new Integer[3];
                            numArr[c] = sleepEntryEntity.getDeepSleepMin();
                            numArr[c2] = sleepEntryEntity.getLightSleepMin();
                            numArr[2] = sleepEntryEntity.getRemSleepMin();
                            List listOfNotNull = CollectionsKt.listOfNotNull((Object[]) numArr);
                            if (!(listOfNotNull instanceof Collection) || !listOfNotNull.isEmpty()) {
                                Iterator it = listOfNotNull.iterator();
                                while (it.hasNext()) {
                                    if (((Number) it.next()).intValue() > 0) {
                                    }
                                }
                            }
                            c3 = c;
                            composer3.startReplaceGroup(516079575);
                            if (c3 != 0) {
                                TextKt.m2376Text4IGK_g("Tap for more details", PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, Dp.m6303constructorimpl(6), 0.0f, 0.0f, 13, null), MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 54, 0, 65528);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(516089916);
                            if (sleepEntryEntity.getScoreRoutine() != null && sleepEntryEntity.getScoreQualityPillar() != null && sleepEntryEntity.getScoreDuration() != null) {
                                TextKt.m2376Text4IGK_g("Score pillars — routine " + sleepEntryEntity.getScoreRoutine() + " · quality " + sleepEntryEntity.getScoreQualityPillar() + " · duration " + sleepEntryEntity.getScoreDuration(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65530);
                            }
                            composer3.endReplaceGroup();
                            snoreEvents = sleepEntryEntity.getSnoreEvents();
                            if (snoreEvents != null || snoreEvents.intValue() <= 0) {
                                snoreEvents = num;
                            }
                            composer3.startReplaceGroup(516104180);
                            if (snoreEvents != null) {
                                TextKt.m2376Text4IGK_g("Snore/noise events: " + snoreEvents.intValue(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65534);
                                Unit unit5 = Unit.INSTANCE;
                                Unit unit6 = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                            wakeMood = sleepEntryEntity.getWakeMood();
                            composer3.startReplaceGroup(516108557);
                            if (wakeMood != null) {
                                TextKt.m2376Text4IGK_g("Wake mood: " + wakeMood.intValue() + "/5", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65534);
                                Unit unit7 = Unit.INSTANCE;
                                Unit unit8 = Unit.INSTANCE;
                            }
                            composer3.endReplaceGroup();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            composer3.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            ComposerKt.sourceInformationMarkerEnd(composer3);
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        c3 = c2;
                        composer3.startReplaceGroup(516079575);
                        if (c3 != 0) {
                        }
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(516089916);
                        if (sleepEntryEntity.getScoreRoutine() != null) {
                            TextKt.m2376Text4IGK_g("Score pillars — routine " + sleepEntryEntity.getScoreRoutine() + " · quality " + sleepEntryEntity.getScoreQualityPillar() + " · duration " + sleepEntryEntity.getScoreDuration(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelSmall(), composer3, 0, 0, 65530);
                        }
                        composer3.endReplaceGroup();
                        snoreEvents = sleepEntryEntity.getSnoreEvents();
                        if (snoreEvents != null) {
                        }
                        snoreEvents = num;
                        composer3.startReplaceGroup(516104180);
                        if (snoreEvents != null) {
                        }
                        composer3.endReplaceGroup();
                        wakeMood = sleepEntryEntity.getWakeMood();
                        composer3.startReplaceGroup(516108557);
                        if (wakeMood != null) {
                        }
                        composer3.endReplaceGroup();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        composer3.endNode();
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        ComposerKt.sourceInformationMarkerEnd(composer3);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    } else {
                        composer3.skipToGroupEnd();
                    }
                }
            }, startRestartGroup, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 18);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SleepNightRow$lambda$8;
                    SleepNightRow$lambda$8 = SleepTabComponentsKt.SleepNightRow$lambda$8(SleepEntryEntity.this, onClick, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SleepNightRow$lambda$8;
                }
            });
        }
    }

    public static final void SleepStatChip(final String label, final String value, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer startRestartGroup = composer.startRestartGroup(-1324598602);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(label) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1324598602, i2, -1, "com.example.rungps.ui.sleep.SleepStatChip (SleepTabComponents.kt:244)");
            }
            ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            RoundedCornerShape m967RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(12));
            long m3842copywmQWz5c$default = Color.m3842copywmQWz5c$default(colorScheme.getSurface(), 0.55f, 0.0f, 0.0f, 0.0f, 14, null);
            composer2 = startRestartGroup;
            SurfaceKt.m2226SurfaceT9BRK9s(SizeKt.m736widthInVpY3zN4$default(Modifier.INSTANCE, Dp.m6303constructorimpl(108), 0.0f, 2, null), m967RoundedCornerShape0680j_4, m3842copywmQWz5c$default, 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-676232303, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$SleepStatChip$1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) != 2 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-676232303, i3, -1, "com.example.rungps.ui.sleep.SleepStatChip.<anonymous> (SleepTabComponents.kt:251)");
                        }
                        Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(Modifier.INSTANCE, Dp.m6303constructorimpl(14), Dp.m6303constructorimpl(10));
                        String str = label;
                        String str2 = value;
                        ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                        MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
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
                        Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                        Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                        if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
                        ComposerKt.sourceInformationMarkerStart(composer3, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                        ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                        TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 0, 3072, 57342);
                        TextKt.m2376Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 3072, 57310);
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
            }, startRestartGroup, 54), startRestartGroup, 12582918, MenuKt.InTransitionDuration);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepTabComponentsKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SleepStatChip$lambda$9;
                    SleepStatChip$lambda$9 = SleepTabComponentsKt.SleepStatChip$lambda$9(label, value, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SleepStatChip$lambda$9;
                }
            });
        }
    }
}
