package com.example.rungps.ui.settings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;
import androidx.activity.compose.ActivityResultRegistryKt;
import androidx.activity.compose.ManagedActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.health.connect.client.PermissionController;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.Repository;
import com.example.rungps.health.HealthConnectManager;
import com.example.rungps.ui.components.TabUiKt;
import com.example.rungps.ui.onboarding.OnboardingPermissions;
import com.example.rungps.widget.WidgetBootstrap;
import com.example.rungps.widget.WidgetPinHelper;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppSettingsScreen.kt */
@Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\u001a\u0017\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0004\u001aC\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0015\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0011H\u0003¢\u0006\u0002\u0010\u0012¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\nX\u008a\u008e\u0002²\u0006\n\u0010\u0015\u001a\u00020\nX\u008a\u008e\u0002²\u0006\f\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\nX\u008a\u008e\u0002"}, d2 = {"AppSettingsScreen", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "PermissionRow", "title", "", "detail", "granted", "", "onAllow", "Lkotlin/Function0;", "onOpenSettings", "(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "HealthConnectGrantButton", "manager", "Lcom/example/rungps/health/HealthConnectManager;", "(Lcom/example/rungps/health/HealthConnectManager;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "sleepLite", "mapLibre", "moyoungSync", "", "busy"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AppSettingsScreenKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$50(Modifier modifier, int i, int i2, Composer composer, int i3) {
        AppSettingsScreen(modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthConnectGrantButton$lambda$60(HealthConnectManager healthConnectManager, int i, Composer composer, int i2) {
        HealthConnectGrantButton(healthConnectManager, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PermissionRow$lambda$54(String str, String str2, boolean z, Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        PermissionRow(str, str2, z, function0, function02, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void AppSettingsScreen(Modifier modifier, Composer composer, final int i, final int i2) {
        final Modifier modifier2;
        int i3;
        Unit unit;
        MutableState mutableState;
        CoroutineScope coroutineScope;
        int i4;
        Repository repository;
        SnapshotMutationPolicy snapshotMutationPolicy;
        final MutableState mutableState2;
        CoroutineScope coroutineScope2;
        Composer composer2;
        Composer composer3;
        final MutableState mutableState3;
        final MutableState mutableState4;
        Composer startRestartGroup = composer.startRestartGroup(-422305272);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (startRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !startRestartGroup.getSkipping()) {
            Modifier modifier3 = i5 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-422305272, i3, -1, "com.example.rungps.ui.settings.AppSettingsScreen (AppSettingsScreen.kt:47)");
            }
            ProvidableCompositionLocal<Context> localContext = AndroidCompositionLocals_androidKt.getLocalContext();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 2023513938, "CC:CompositionLocal.kt#9igjgp");
            Object consume = startRestartGroup.consume(localContext);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            final Context context = (Context) consume;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 773894976, "CC(rememberCoroutineScope)482@20332L144:Effects.kt#9igjgp");
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -954367824, "CC(remember):Effects.kt#9igjgp");
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller = new CompositionScopedCoroutineScopeCanceller(EffectsKt.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, startRestartGroup));
                startRestartGroup.updateRememberedValue(compositionScopedCoroutineScopeCanceller);
                rememberedValue = compositionScopedCoroutineScopeCanceller;
            }
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            CoroutineScope coroutineScope3 = ((CompositionScopedCoroutineScopeCanceller) rememberedValue).getCoroutineScope();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.startReplaceGroup(1860037318);
            boolean changed = startRestartGroup.changed(context);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = Repository.INSTANCE.get(context);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            Repository repository2 = (Repository) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1860039203);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            final MutableState mutableState5 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1860040962);
            Object rememberedValue4 = startRestartGroup.rememberedValue();
            if (rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                rememberedValue4 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(true, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue4);
            }
            MutableState mutableState6 = (MutableState) rememberedValue4;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1860042793);
            Object rememberedValue5 = startRestartGroup.rememberedValue();
            if (rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                rememberedValue5 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue5);
            }
            MutableState mutableState7 = (MutableState) rememberedValue5;
            startRestartGroup.endReplaceGroup();
            Unit unit2 = Unit.INSTANCE;
            startRestartGroup.startReplaceGroup(1860045073);
            boolean changedInstance = startRestartGroup.changedInstance(context);
            AppSettingsScreenKt$AppSettingsScreen$1$1 rememberedValue6 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                unit = unit2;
                mutableState = mutableState6;
                coroutineScope = coroutineScope3;
                i4 = 1;
                repository = repository2;
                snapshotMutationPolicy = null;
                rememberedValue6 = new AppSettingsScreenKt$AppSettingsScreen$1$1(context, mutableState5, mutableState6, mutableState7, null);
                startRestartGroup.updateRememberedValue(rememberedValue6);
            } else {
                unit = unit2;
                mutableState = mutableState6;
                coroutineScope = coroutineScope3;
                repository = repository2;
                i4 = 1;
                snapshotMutationPolicy = null;
            }
            startRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) rememberedValue6, startRestartGroup, 6);
            startRestartGroup.startReplaceGroup(1860052099);
            Object rememberedValue7 = startRestartGroup.rememberedValue();
            if (rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                rememberedValue7 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(false, snapshotMutationPolicy, 2, snapshotMutationPolicy);
                startRestartGroup.updateRememberedValue(rememberedValue7);
            }
            MutableState mutableState8 = (MutableState) rememberedValue7;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(1860053895);
            Object rememberedValue8 = startRestartGroup.rememberedValue();
            if (rememberedValue8 == Composer.INSTANCE.getEmpty()) {
                rememberedValue8 = new HealthConnectManager(context);
                startRestartGroup.updateRememberedValue(rememberedValue8);
            }
            final HealthConnectManager healthConnectManager = (HealthConnectManager) rememberedValue8;
            startRestartGroup.endReplaceGroup();
            boolean isReady = healthConnectManager.isReady();
            Modifier m688paddingqDBjuR0$default = PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(modifier3, 0.0f, i4, snapshotMutationPolicy), 0.0f, 0.0f, 0.0f, Dp.m6303constructorimpl(24), 7, null);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(12));
            Modifier modifier4 = modifier3;
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m688paddingqDBjuR0$default);
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
            TabUiKt.TabHeroHeader("App settings", "v0.7.93 · permissions, maps, sleep, sync, backups", null, null, startRestartGroup, 6, 12);
            String runtimeStatusLine = OnboardingPermissions.INSTANCE.runtimeStatusLine(context);
            boolean hasAllRuntimePermissions = OnboardingPermissions.INSTANCE.hasAllRuntimePermissions(context);
            startRestartGroup.startReplaceGroup(2079606280);
            boolean changedInstance2 = startRestartGroup.changedInstance(context);
            Object rememberedValue9 = startRestartGroup.rememberedValue();
            if (changedInstance2 || rememberedValue9 == Composer.INSTANCE.getEmpty()) {
                rememberedValue9 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$17$lambda$16;
                        AppSettingsScreen$lambda$49$lambda$17$lambda$16 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$17$lambda$16(context);
                        return AppSettingsScreen$lambda$49$lambda$17$lambda$16;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue9);
            }
            startRestartGroup.endReplaceGroup();
            PermissionRow("Location & activity", runtimeStatusLine, hasAllRuntimePermissions, null, (Function0) rememberedValue9, startRestartGroup, 3078);
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default);
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
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            final RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            Modifier weight$default = RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), startRestartGroup, 0);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(startRestartGroup, weight$default);
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
            final CoroutineScope coroutineScope4 = coroutineScope;
            final Repository repository3 = repository;
            Composer composer4 = startRestartGroup;
            TextKt.m2376Text4IGK_g("Health Connect", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), composer4, 196614, 0, 65502);
            TextKt.m2376Text4IGK_g("Steps, sleep, and heart rate for recovery and readiness.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer4, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer4, MaterialTheme.$stable).getBodySmall(), composer4, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            if (isReady) {
                composer4.startReplaceGroup(-231137952);
                HealthConnectGrantButton(healthConnectManager, composer4, 0);
                composer4.endReplaceGroup();
            } else {
                composer4.startReplaceGroup(-231058654);
                composer4.startReplaceGroup(1100927032);
                boolean changedInstance3 = composer4.changedInstance(context) | composer4.changedInstance(healthConnectManager);
                Object rememberedValue10 = composer4.rememberedValue();
                if (changedInstance3 || rememberedValue10 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue10 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda15
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit AppSettingsScreen$lambda$49$lambda$22$lambda$21$lambda$20;
                            AppSettingsScreen$lambda$49$lambda$22$lambda$21$lambda$20 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$22$lambda$21$lambda$20(RowScope.this, context, healthConnectManager);
                            return AppSettingsScreen$lambda$49$lambda$22$lambda$21$lambda$20;
                        }
                    };
                    composer4.updateRememberedValue(rememberedValue10);
                }
                composer4.endReplaceGroup();
                composer4 = composer4;
                ButtonKt.OutlinedButton((Function0) rememberedValue10, null, false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7421getLambda1$app_sideload(), composer4, 805306368, 510);
                composer4.endReplaceGroup();
            }
            ComposerKt.sourceInformationMarkerEnd(composer4);
            composer4.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            ComposerKt.sourceInformationMarkerEnd(composer4);
            Composer composer5 = composer4;
            DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer5, MaterialTheme.$stable).getOutline(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), composer5, 0, 3);
            TextKt.m2376Text4IGK_g("Maps", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer5, MaterialTheme.$stable).getTitleSmall(), composer4, 196614, 0, 65502);
            float f = 8;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            Composer composer6 = composer4;
            ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer6, 6);
            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash4 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composer6.getCurrentCompositionLocalMap();
            Modifier materializeModifier4 = ComposedModifierKt.materializeModifier(composer6, companion);
            Function0<ComposeUiNode> constructor4 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor4);
            } else {
                composer6.useNode();
            }
            Composer m3336constructorimpl4 = Updater.m3336constructorimpl(composer6);
            Updater.m3343setimpl(m3336constructorimpl4, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl4, currentCompositionLocalMap4, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl4.getInserting() || !Intrinsics.areEqual(m3336constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                m3336constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                m3336constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
            }
            Updater.m3343setimpl(m3336constructorimpl4, materializeModifier4, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            boolean AppSettingsScreen$lambda$5 = AppSettingsScreen$lambda$5(mutableState);
            composer6.startReplaceGroup(1100945612);
            boolean changedInstance4 = composer6.changedInstance(coroutineScope4) | composer6.changedInstance(context);
            Object rememberedValue11 = composer6.rememberedValue();
            if (changedInstance4 || rememberedValue11 == Composer.INSTANCE.getEmpty()) {
                mutableState2 = mutableState;
                rememberedValue11 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda16
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$27$lambda$24$lambda$23;
                        AppSettingsScreen$lambda$49$lambda$27$lambda$24$lambda$23 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$27$lambda$24$lambda$23(CoroutineScope.this, mutableState2, context);
                        return AppSettingsScreen$lambda$49$lambda$27$lambda$24$lambda$23;
                    }
                };
                composer6.updateRememberedValue(rememberedValue11);
            } else {
                mutableState2 = mutableState;
            }
            composer6.endReplaceGroup();
            final MutableState mutableState9 = mutableState2;
            ChipKt.FilterChip(AppSettingsScreen$lambda$5, (Function0) rememberedValue11, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7426getLambda2$app_sideload(), null, false, null, null, null, null, null, null, null, composer6, 384, 0, 4088);
            boolean z = !AppSettingsScreen$lambda$5(mutableState9);
            composer6.startReplaceGroup(1100957261);
            boolean changedInstance5 = composer6.changedInstance(coroutineScope4) | composer6.changedInstance(context);
            Object rememberedValue12 = composer6.rememberedValue();
            if (changedInstance5 || rememberedValue12 == Composer.INSTANCE.getEmpty()) {
                rememberedValue12 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$27$lambda$26$lambda$25;
                        AppSettingsScreen$lambda$49$lambda$27$lambda$26$lambda$25 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$27$lambda$26$lambda$25(CoroutineScope.this, mutableState9, context);
                        return AppSettingsScreen$lambda$49$lambda$27$lambda$26$lambda$25;
                    }
                };
                composer6.updateRememberedValue(rememberedValue12);
            }
            composer6.endReplaceGroup();
            ChipKt.FilterChip(z, (Function0) rememberedValue12, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7427getLambda3$app_sideload(), null, false, null, null, null, null, null, null, null, composer6, 384, 0, 4088);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            TextKt.m2376Text4IGK_g("Recording always uses MapLibre. Planning tab follows this setting (offline MapsForge needs OSM).", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer6, 6, 0, 65530);
            DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOutline(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), composer6, 0, 3);
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween2 = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically2 = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(composer6, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(spaceBetween2, centerVertically2, composer6, 54);
            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash5 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap5 = composer6.getCurrentCompositionLocalMap();
            Modifier materializeModifier5 = ComposedModifierKt.materializeModifier(composer6, fillMaxWidth$default2);
            Function0<ComposeUiNode> constructor5 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor5);
            } else {
                composer6.useNode();
            }
            Composer m3336constructorimpl5 = Updater.m3336constructorimpl(composer6);
            Updater.m3343setimpl(m3336constructorimpl5, rowMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl5, currentCompositionLocalMap5, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl5.getInserting() || !Intrinsics.areEqual(m3336constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                m3336constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                m3336constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
            }
            Updater.m3343setimpl(m3336constructorimpl5, materializeModifier5, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer6, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            Modifier weight$default2 = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
            ComposerKt.sourceInformationMarkerStart(composer6, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer6, 0);
            ComposerKt.sourceInformationMarkerStart(composer6, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash6 = ComposablesKt.getCurrentCompositeKeyHash(composer6, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composer6.getCurrentCompositionLocalMap();
            Modifier materializeModifier6 = ComposedModifierKt.materializeModifier(composer6, weight$default2);
            Function0<ComposeUiNode> constructor6 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer6, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer6.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer6.startReusableNode();
            if (composer6.getInserting()) {
                composer6.createNode(constructor6);
            } else {
                composer6.useNode();
            }
            Composer m3336constructorimpl6 = Updater.m3336constructorimpl(composer6);
            Updater.m3343setimpl(m3336constructorimpl6, columnMeasurePolicy3, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl6, currentCompositionLocalMap6, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl6.getInserting() || !Intrinsics.areEqual(m3336constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                m3336constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                m3336constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
            }
            Updater.m3343setimpl(m3336constructorimpl6, materializeModifier6, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer6, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance3 = ColumnScopeInstance.INSTANCE;
            TextKt.m2376Text4IGK_g("Sleep lite mode", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getTitleSmall(), composer6, 196614, 0, 65502);
            TextKt.m2376Text4IGK_g("Health Connect / manual sleep only — no overnight microphone tracking.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer6, 6, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            boolean AppSettingsScreen$lambda$2 = AppSettingsScreen$lambda$2(mutableState5);
            composer6.startReplaceGroup(1101000611);
            boolean changedInstance6 = composer6.changedInstance(coroutineScope4) | composer6.changedInstance(context);
            Object rememberedValue13 = composer6.rememberedValue();
            if (changedInstance6 || rememberedValue13 == Composer.INSTANCE.getEmpty()) {
                rememberedValue13 = new Function1() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit AppSettingsScreen$lambda$49$lambda$31$lambda$30$lambda$29;
                        AppSettingsScreen$lambda$49$lambda$31$lambda$30$lambda$29 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$31$lambda$30$lambda$29(CoroutineScope.this, mutableState5, context, ((Boolean) obj).booleanValue());
                        return AppSettingsScreen$lambda$49$lambda$31$lambda$30$lambda$29;
                    }
                };
                composer6.updateRememberedValue(rememberedValue13);
            }
            composer6.endReplaceGroup();
            SwitchKt.Switch(AppSettingsScreen$lambda$2, (Function1) rememberedValue13, null, null, false, null, null, composer6, 0, 124);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            composer6.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            ComposerKt.sourceInformationMarkerEnd(composer6);
            Long AppSettingsScreen$lambda$8 = AppSettingsScreen$lambda$8(mutableState7);
            composer6.startReplaceGroup(2079720645);
            if (AppSettingsScreen$lambda$8 == null) {
                coroutineScope2 = coroutineScope4;
                composer2 = composer6;
            } else {
                coroutineScope2 = coroutineScope4;
                composer2 = composer6;
                TextKt.m2376Text4IGK_g("Watch last sync: " + DateFormat.getDateTimeInstance(3, 3, Locale.getDefault()).format(new Date(AppSettingsScreen$lambda$8.longValue())), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer6, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer6, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            Composer composer7 = composer2;
            DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer7, MaterialTheme.$stable).getOutline(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), composer7, 0, 3);
            Composer composer8 = composer2;
            TextKt.m2376Text4IGK_g("Calendar", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer7, MaterialTheme.$stable).getTitleSmall(), composer8, 196614, 0, 65502);
            Composer composer9 = composer2;
            TextKt.m2376Text4IGK_g("Google Calendar uses Android READ_CALENDAR (Sleep tab). Events must appear in the system Calendar app.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer9, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer9, MaterialTheme.$stable).getBodySmall(), composer8, 6, 0, 65530);
            Composer composer10 = composer2;
            DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer10, MaterialTheme.$stable).getOutline(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), composer10, 0, 3);
            TextKt.m2376Text4IGK_g("Home screen widgets", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer10, MaterialTheme.$stable).getTitleSmall(), composer8, 196614, 0, 65502);
            Composer composer11 = composer2;
            TextKt.m2376Text4IGK_g("Pin a widget without leaving the app (Android 8+). Refresh if a widget looks stuck after an update.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer11, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer11, MaterialTheme.$stable).getBodySmall(), composer8, 6, 0, 65530);
            Composer composer12 = composer2;
            TextKt.m2376Text4IGK_g("If you see “Couldn't add widget”: long-press home screen → Widgets → Exercise Tracker.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer12, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer12, MaterialTheme.$stable).getBodySmall(), composer8, 6, 0, 65530);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_43 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            Composer composer13 = composer2;
            ComposerKt.sourceInformationMarkerStart(composer13, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy4 = RowKt.rowMeasurePolicy(m564spacedBy0680j_43, Alignment.INSTANCE.getTop(), composer13, 6);
            ComposerKt.sourceInformationMarkerStart(composer13, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash7 = ComposablesKt.getCurrentCompositeKeyHash(composer13, 0);
            CompositionLocalMap currentCompositionLocalMap7 = composer13.getCurrentCompositionLocalMap();
            Modifier materializeModifier7 = ComposedModifierKt.materializeModifier(composer13, companion2);
            Function0<ComposeUiNode> constructor7 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer13, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
            if (!(composer13.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer13.startReusableNode();
            if (composer13.getInserting()) {
                composer13.createNode(constructor7);
            } else {
                composer13.useNode();
            }
            Composer m3336constructorimpl7 = Updater.m3336constructorimpl(composer13);
            Updater.m3343setimpl(m3336constructorimpl7, rowMeasurePolicy4, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl7, currentCompositionLocalMap7, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash7 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl7.getInserting() || !Intrinsics.areEqual(m3336constructorimpl7.rememberedValue(), Integer.valueOf(currentCompositeKeyHash7))) {
                m3336constructorimpl7.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash7));
                m3336constructorimpl7.apply(Integer.valueOf(currentCompositeKeyHash7), setCompositeKeyHash7);
            }
            Updater.m3343setimpl(m3336constructorimpl7, materializeModifier7, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer13, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance3 = RowScopeInstance.INSTANCE;
            composer13.startReplaceGroup(1101057765);
            boolean changedInstance7 = composer13.changedInstance(context);
            Object rememberedValue14 = composer13.rememberedValue();
            if (changedInstance7 || rememberedValue14 == Composer.INSTANCE.getEmpty()) {
                rememberedValue14 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$39$lambda$34$lambda$33;
                        AppSettingsScreen$lambda$49$lambda$39$lambda$34$lambda$33 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$39$lambda$34$lambda$33(context);
                        return AppSettingsScreen$lambda$49$lambda$39$lambda$34$lambda$33;
                    }
                };
                composer13.updateRememberedValue(rememberedValue14);
            }
            composer13.endReplaceGroup();
            composer3 = composer13;
            ButtonKt.OutlinedButton((Function0) rememberedValue14, RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7428getLambda4$app_sideload(), composer13, 805306368, 508);
            composer3.startReplaceGroup(1101063273);
            boolean changedInstance8 = composer3.changedInstance(context);
            Object rememberedValue15 = composer3.rememberedValue();
            if (changedInstance8 || rememberedValue15 == Composer.INSTANCE.getEmpty()) {
                rememberedValue15 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$39$lambda$36$lambda$35;
                        AppSettingsScreen$lambda$49$lambda$39$lambda$36$lambda$35 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$39$lambda$36$lambda$35(context);
                        return AppSettingsScreen$lambda$49$lambda$39$lambda$36$lambda$35;
                    }
                };
                composer3.updateRememberedValue(rememberedValue15);
            }
            composer3.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue15, RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7429getLambda5$app_sideload(), composer3, 805306368, 508);
            composer3.startReplaceGroup(1101069066);
            boolean changedInstance9 = composer3.changedInstance(context);
            Object rememberedValue16 = composer3.rememberedValue();
            if (changedInstance9 || rememberedValue16 == Composer.INSTANCE.getEmpty()) {
                rememberedValue16 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$39$lambda$38$lambda$37;
                        AppSettingsScreen$lambda$49$lambda$39$lambda$38$lambda$37 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$39$lambda$38$lambda$37(context);
                        return AppSettingsScreen$lambda$49$lambda$39$lambda$38$lambda$37;
                    }
                };
                composer3.updateRememberedValue(rememberedValue16);
            }
            composer3.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue16, RowScope.weight$default(rowScopeInstance3, Modifier.INSTANCE, 1.0f, false, 2, null), false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7430getLambda6$app_sideload(), composer3, 805306368, 508);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.startReplaceGroup(2079789178);
            boolean changedInstance10 = composer3.changedInstance(context);
            Object rememberedValue17 = composer3.rememberedValue();
            if (changedInstance10 || rememberedValue17 == Composer.INSTANCE.getEmpty()) {
                rememberedValue17 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$41$lambda$40;
                        AppSettingsScreen$lambda$49$lambda$41$lambda$40 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$41$lambda$40(context);
                        return AppSettingsScreen$lambda$49$lambda$41$lambda$40;
                    }
                };
                composer3.updateRememberedValue(rememberedValue17);
            }
            composer3.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue17, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7431getLambda7$app_sideload(), composer3, 805306416, 508);
            DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, Color.m3842copywmQWz5c$default(MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOutline(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), composer3, 0, 3);
            TextKt.m2376Text4IGK_g("Data", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65502);
            composer3.startReplaceGroup(2079804869);
            final CoroutineScope coroutineScope5 = coroutineScope2;
            boolean changedInstance11 = composer3.changedInstance(coroutineScope5) | composer3.changedInstance(repository3) | composer3.changedInstance(context);
            Object rememberedValue18 = composer3.rememberedValue();
            if (changedInstance11 || rememberedValue18 == Composer.INSTANCE.getEmpty()) {
                mutableState3 = mutableState8;
                rememberedValue18 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$43$lambda$42;
                        AppSettingsScreen$lambda$49$lambda$43$lambda$42 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$43$lambda$42(CoroutineScope.this, mutableState3, context, repository3);
                        return AppSettingsScreen$lambda$49$lambda$43$lambda$42;
                    }
                };
                composer3.updateRememberedValue(rememberedValue18);
            } else {
                mutableState3 = mutableState8;
            }
            composer3.endReplaceGroup();
            MutableState mutableState10 = mutableState3;
            ButtonKt.OutlinedButton((Function0) rememberedValue18, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !AppSettingsScreen$lambda$12(mutableState3), null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7432getLambda8$app_sideload(), composer3, 805306416, 504);
            composer3.startReplaceGroup(2079821867);
            boolean changedInstance12 = composer3.changedInstance(coroutineScope5) | composer3.changedInstance(context);
            Object rememberedValue19 = composer3.rememberedValue();
            if (changedInstance12 || rememberedValue19 == Composer.INSTANCE.getEmpty()) {
                mutableState4 = mutableState10;
                rememberedValue19 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda12
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$45$lambda$44;
                        AppSettingsScreen$lambda$49$lambda$45$lambda$44 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$45$lambda$44(CoroutineScope.this, mutableState4, context);
                        return AppSettingsScreen$lambda$49$lambda$45$lambda$44;
                    }
                };
                composer3.updateRememberedValue(rememberedValue19);
            } else {
                mutableState4 = mutableState10;
            }
            composer3.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue19, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), !AppSettingsScreen$lambda$12(mutableState4), null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7433getLambda9$app_sideload(), composer3, 805306416, 504);
            composer3.startReplaceGroup(2079844904);
            boolean changedInstance13 = composer3.changedInstance(context);
            Object rememberedValue20 = composer3.rememberedValue();
            if (changedInstance13 || rememberedValue20 == Composer.INSTANCE.getEmpty()) {
                rememberedValue20 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda13
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit AppSettingsScreen$lambda$49$lambda$48$lambda$47;
                        AppSettingsScreen$lambda$49$lambda$48$lambda$47 = AppSettingsScreenKt.AppSettingsScreen$lambda$49$lambda$48$lambda$47(context);
                        return AppSettingsScreen$lambda$49$lambda$48$lambda$47;
                    }
                };
                composer3.updateRememberedValue(rememberedValue20);
            }
            composer3.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue20, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7422getLambda10$app_sideload(), composer3, 805306416, 508);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            composer3.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            ComposerKt.sourceInformationMarkerEnd(composer3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
        } else {
            startRestartGroup.skipToGroupEnd();
            composer3 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer3.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda14
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit AppSettingsScreen$lambda$50;
                    AppSettingsScreen$lambda$50 = AppSettingsScreenKt.AppSettingsScreen$lambda$50(Modifier.this, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    return AppSettingsScreen$lambda$50;
                }
            });
        }
    }

    private static final boolean AppSettingsScreen$lambda$2(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppSettingsScreen$lambda$3(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final boolean AppSettingsScreen$lambda$5(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppSettingsScreen$lambda$6(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    private static final Long AppSettingsScreen$lambda$8(MutableState<Long> mutableState) {
        return mutableState.getValue();
    }

    private static final boolean AppSettingsScreen$lambda$12(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AppSettingsScreen$lambda$13(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$17$lambda$16(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$22$lambda$21$lambda$20(RowScope rowScope, Context context, HealthConnectManager healthConnectManager) {
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
    public static final Unit AppSettingsScreen$lambda$49$lambda$27$lambda$24$lambda$23(CoroutineScope coroutineScope, MutableState mutableState, Context context) {
        AppSettingsScreen$lambda$6(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AppSettingsScreenKt$AppSettingsScreen$2$3$1$1$1(context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$27$lambda$26$lambda$25(CoroutineScope coroutineScope, MutableState mutableState, Context context) {
        AppSettingsScreen$lambda$6(mutableState, false);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AppSettingsScreenKt$AppSettingsScreen$2$3$2$1$1(context, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$31$lambda$30$lambda$29(CoroutineScope coroutineScope, MutableState mutableState, Context context, boolean z) {
        AppSettingsScreen$lambda$3(mutableState, z);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AppSettingsScreenKt$AppSettingsScreen$2$4$2$1$1(context, z, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$39$lambda$34$lambda$33(Context context) {
        WidgetPinHelper.INSTANCE.requestPinGym(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$39$lambda$36$lambda$35(Context context) {
        WidgetPinHelper.INSTANCE.requestPinRideRun(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$39$lambda$38$lambda$37(Context context) {
        WidgetPinHelper.INSTANCE.requestPinRecovery(context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$41$lambda$40(Context context) {
        WidgetBootstrap.refreshAllAsync$default(WidgetBootstrap.INSTANCE, context, false, 2, null);
        Toast.makeText(context, "Refreshing widgets…", 0).show();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$43$lambda$42(CoroutineScope coroutineScope, MutableState mutableState, Context context, Repository repository) {
        if (AppSettingsScreen$lambda$12(mutableState)) {
            return Unit.INSTANCE;
        }
        AppSettingsScreen$lambda$13(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AppSettingsScreenKt$AppSettingsScreen$2$8$1$1(context, repository, mutableState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$45$lambda$44(CoroutineScope coroutineScope, MutableState mutableState, Context context) {
        if (AppSettingsScreen$lambda$12(mutableState)) {
            return Unit.INSTANCE;
        }
        AppSettingsScreen$lambda$13(mutableState, true);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AppSettingsScreenKt$AppSettingsScreen$2$9$1$1(context, mutableState, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AppSettingsScreen$lambda$49$lambda$48$lambda$47(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
        return Unit.INSTANCE;
    }

    private static final void PermissionRow(final String str, final String str2, final boolean z, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) {
        int i2;
        long error;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1423555232);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(function02) ? 16384 : 8192;
        }
        int i3 = i2;
        if ((i3 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1423555232, i3, -1, "com.example.rungps.ui.settings.PermissionRow (AppSettingsScreen.kt:259)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            float f = 8;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), startRestartGroup, 6);
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
            Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, startRestartGroup, 54);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(startRestartGroup, fillMaxWidth$default2);
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
            TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getTitleSmall(), startRestartGroup, (i3 & 14) | ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
            String str3 = z ? "Allowed" : "Not allowed";
            TextStyle labelMedium = MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getLabelMedium();
            if (z) {
                startRestartGroup.startReplaceGroup(-2126524031);
                error = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimary();
            } else {
                startRestartGroup.startReplaceGroup(-2126522785);
                error = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getError();
            }
            startRestartGroup.endReplaceGroup();
            TextKt.m2376Text4IGK_g(str3, (Modifier) null, error, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, labelMedium, startRestartGroup, 0, 0, 65530);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            startRestartGroup.endNode();
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            ComposerKt.sourceInformationMarkerEnd(startRestartGroup);
            TextKt.m2376Text4IGK_g(str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), startRestartGroup, (i3 >> 3) & 14, 0, 65530);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), startRestartGroup, 6);
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
            Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            startRestartGroup.startReplaceGroup(-2126515450);
            if (z || function0 == null) {
                composer2 = startRestartGroup;
            } else {
                composer2 = startRestartGroup;
                ButtonKt.Button(function0, null, false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7423getLambda11$app_sideload(), startRestartGroup, ((i3 >> 9) & 14) | 805306368, 510);
            }
            composer2.endReplaceGroup();
            ButtonKt.OutlinedButton(function02, null, false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7424getLambda12$app_sideload(), composer2, ((i3 >> 12) & 14) | 805306368, 510);
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
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit PermissionRow$lambda$54;
                    PermissionRow$lambda$54 = AppSettingsScreenKt.PermissionRow$lambda$54(str, str2, z, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                    return PermissionRow$lambda$54;
                }
            });
        }
    }

    private static final void HealthConnectGrantButton(final HealthConnectManager healthConnectManager, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(1410818372);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(healthConnectManager) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1410818372, i2, -1, "com.example.rungps.ui.settings.HealthConnectGrantButton (AppSettingsScreen.kt:287)");
            }
            startRestartGroup.startReplaceGroup(-45278437);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = healthConnectManager.getAllRequestedPermissions();
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final Set set = (Set) rememberedValue;
            startRestartGroup.endReplaceGroup();
            ActivityResultContract createRequestPermissionResultContract$default = PermissionController.Companion.createRequestPermissionResultContract$default(PermissionController.INSTANCE, null, 1, null);
            startRestartGroup.startReplaceGroup(-45272878);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit HealthConnectGrantButton$lambda$57$lambda$56;
                        HealthConnectGrantButton$lambda$57$lambda$56 = AppSettingsScreenKt.HealthConnectGrantButton$lambda$57$lambda$56((Set) obj);
                        return HealthConnectGrantButton$lambda$57$lambda$56;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            startRestartGroup.endReplaceGroup();
            final ManagedActivityResultLauncher rememberLauncherForActivityResult = ActivityResultRegistryKt.rememberLauncherForActivityResult(createRequestPermissionResultContract$default, (Function1) rememberedValue2, startRestartGroup, 48);
            startRestartGroup.startReplaceGroup(-45271793);
            boolean changedInstance = startRestartGroup.changedInstance(rememberLauncherForActivityResult) | startRestartGroup.changedInstance(set);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit HealthConnectGrantButton$lambda$59$lambda$58;
                        HealthConnectGrantButton$lambda$59$lambda$58 = AppSettingsScreenKt.HealthConnectGrantButton$lambda$59$lambda$58(ManagedActivityResultLauncher.this, set);
                        return HealthConnectGrantButton$lambda$59$lambda$58;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            ButtonKt.OutlinedButton((Function0) rememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$AppSettingsScreenKt.INSTANCE.m7425getLambda13$app_sideload(), startRestartGroup, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.settings.AppSettingsScreenKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit HealthConnectGrantButton$lambda$60;
                    HealthConnectGrantButton$lambda$60 = AppSettingsScreenKt.HealthConnectGrantButton$lambda$60(HealthConnectManager.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return HealthConnectGrantButton$lambda$60;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthConnectGrantButton$lambda$57$lambda$56(Set it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HealthConnectGrantButton$lambda$59$lambda$58(ManagedActivityResultLauncher managedActivityResultLauncher, Set set) {
        managedActivityResultLauncher.launch(set);
        return Unit.INSTANCE;
    }
}
