package com.example.rungps.ui.sleep;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
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
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.sleep.SleepMorningDiagnostics;
import com.google.firebase.firestore.model.Values;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepMorningDiagnosticsCard.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a\u001d\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"SleepMorningDiagnosticsCard", "", "snapshot", "Lcom/example/rungps/sleep/SleepMorningDiagnostics$Snapshot;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/example/rungps/sleep/SleepMorningDiagnostics$Snapshot;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "DiagnosticRow", "label", "", Values.VECTOR_MAP_VECTORS_KEY, "(Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepMorningDiagnosticsCardKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DiagnosticRow$lambda$1(String str, String str2, int i, Composer composer, int i2) {
        DiagnosticRow(str, str2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepMorningDiagnosticsCard$lambda$0(SleepMorningDiagnostics.Snapshot snapshot, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SleepMorningDiagnosticsCard(snapshot, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SleepMorningDiagnosticsCard(final SleepMorningDiagnostics.Snapshot snapshot, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope endRestartGroup;
        Intrinsics.checkNotNullParameter(snapshot, "snapshot");
        Composer startRestartGroup = composer.startRestartGroup(-682721270);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (startRestartGroup.changed(snapshot) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            modifier2 = modifier;
            i3 |= startRestartGroup.changed(modifier2) ? 32 : 16;
            if ((i3 & 19) == 18 || !startRestartGroup.getSkipping()) {
                Modifier modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-682721270, i3, -1, "com.example.rungps.ui.sleep.SleepMorningDiagnosticsCard (SleepMorningDiagnosticsCard.kt:20)");
                }
                final ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
                Modifier modifier4 = modifier3;
                composer2 = startRestartGroup;
                CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(colorScheme.getSecondaryContainer(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1570104024, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepMorningDiagnosticsCardKt$SleepMorningDiagnosticsCard$1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                        invoke(columnScope, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(ColumnScope Card, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                        if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1570104024, i5, -1, "com.example.rungps.ui.sleep.SleepMorningDiagnosticsCard.<anonymous> (SleepMorningDiagnosticsCard.kt:26)");
                            }
                            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                            SleepMorningDiagnostics.Snapshot snapshot2 = SleepMorningDiagnostics.Snapshot.this;
                            ColorScheme colorScheme2 = colorScheme;
                            ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
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
                            TextKt.m2376Text4IGK_g("Overnight diagnostics", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65502);
                            SleepMorningDiagnosticsCardKt.DiagnosticRow("Pipeline", snapshot2.getPipelineLine(), composer3, 6);
                            Integer micCoveragePercent = snapshot2.getMicCoveragePercent();
                            composer3.startReplaceGroup(-1405754429);
                            if (micCoveragePercent != null) {
                                int intValue = micCoveragePercent.intValue();
                                String micCoverageLabel = snapshot2.getMicCoverageLabel();
                                String str = micCoverageLabel != null ? " (" + micCoverageLabel + ")" : null;
                                if (str == null) {
                                    str = "";
                                }
                                SleepMorningDiagnosticsCardKt.DiagnosticRow("Mic coverage", intValue + "%" + str, composer3, 6);
                            }
                            composer3.endReplaceGroup();
                            String batteryLine = snapshot2.getBatteryLine();
                            composer3.startReplaceGroup(-1405748034);
                            if (batteryLine != null) {
                                SleepMorningDiagnosticsCardKt.DiagnosticRow("Battery", batteryLine, composer3, 6);
                            }
                            composer3.endReplaceGroup();
                            String alarmLine = snapshot2.getAlarmLine();
                            composer3.startReplaceGroup(-1405745828);
                            if (alarmLine != null) {
                                SleepMorningDiagnosticsCardKt.DiagnosticRow("Alarm", alarmLine, composer3, 6);
                            }
                            composer3.endReplaceGroup();
                            SleepMorningDiagnosticsCardKt.DiagnosticRow("Samples", snapshot2.getSampleCount() + " buckets", composer3, 6);
                            SleepMorningDiagnosticsCardKt.DiagnosticRow("Tracking", snapshot2.getTrackingHealthLine(), composer3, 6);
                            String smartAlarmUnavailable = snapshot2.getSmartAlarmUnavailable();
                            composer3.startReplaceGroup(-1405738689);
                            if (smartAlarmUnavailable != null) {
                                TextKt.m2376Text4IGK_g(smartAlarmUnavailable, (Modifier) null, colorScheme2.getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                            }
                            composer3.endReplaceGroup();
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
                }, composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                startRestartGroup.skipToGroupEnd();
                composer2 = startRestartGroup;
            }
            endRestartGroup = composer2.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepMorningDiagnosticsCardKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        Unit SleepMorningDiagnosticsCard$lambda$0;
                        SleepMorningDiagnosticsCard$lambda$0 = SleepMorningDiagnosticsCardKt.SleepMorningDiagnosticsCard$lambda$0(SleepMorningDiagnostics.Snapshot.this, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        return SleepMorningDiagnosticsCard$lambda$0;
                    }
                });
                return;
            }
            return;
        }
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
        }
        if (i4 == 0) {
        }
        if (ComposerKt.isTraceInProgress()) {
        }
        final ColorScheme colorScheme2 = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
        Modifier modifier42 = modifier3;
        composer2 = startRestartGroup;
        CardKt.Card(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, null), null, CardDefaults.INSTANCE.m1511cardColorsro_MJ88(Color.m3842copywmQWz5c$default(colorScheme2.getSecondaryContainer(), 0.35f, 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, 0L, startRestartGroup, CardDefaults.$stable << 12, 14), null, null, ComposableLambdaKt.rememberComposableLambda(1570104024, true, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepMorningDiagnosticsCardKt$SleepMorningDiagnosticsCard$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer3, Integer num) {
                invoke(columnScope, composer3, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(ColumnScope Card, Composer composer3, int i5) {
                Intrinsics.checkNotNullParameter(Card, "$this$Card");
                if ((i5 & 17) != 16 || !composer3.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1570104024, i5, -1, "com.example.rungps.ui.sleep.SleepMorningDiagnosticsCard.<anonymous> (SleepMorningDiagnosticsCard.kt:26)");
                    }
                    Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(14));
                    Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(6));
                    SleepMorningDiagnostics.Snapshot snapshot2 = SleepMorningDiagnostics.Snapshot.this;
                    ColorScheme colorScheme22 = colorScheme2;
                    ComposerKt.sourceInformationMarkerStart(composer3, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                    MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer3, 6);
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
                    TextKt.m2376Text4IGK_g("Overnight diagnostics", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleSmall(), composer3, 196614, 0, 65502);
                    SleepMorningDiagnosticsCardKt.DiagnosticRow("Pipeline", snapshot2.getPipelineLine(), composer3, 6);
                    Integer micCoveragePercent = snapshot2.getMicCoveragePercent();
                    composer3.startReplaceGroup(-1405754429);
                    if (micCoveragePercent != null) {
                        int intValue = micCoveragePercent.intValue();
                        String micCoverageLabel = snapshot2.getMicCoverageLabel();
                        String str = micCoverageLabel != null ? " (" + micCoverageLabel + ")" : null;
                        if (str == null) {
                            str = "";
                        }
                        SleepMorningDiagnosticsCardKt.DiagnosticRow("Mic coverage", intValue + "%" + str, composer3, 6);
                    }
                    composer3.endReplaceGroup();
                    String batteryLine = snapshot2.getBatteryLine();
                    composer3.startReplaceGroup(-1405748034);
                    if (batteryLine != null) {
                        SleepMorningDiagnosticsCardKt.DiagnosticRow("Battery", batteryLine, composer3, 6);
                    }
                    composer3.endReplaceGroup();
                    String alarmLine = snapshot2.getAlarmLine();
                    composer3.startReplaceGroup(-1405745828);
                    if (alarmLine != null) {
                        SleepMorningDiagnosticsCardKt.DiagnosticRow("Alarm", alarmLine, composer3, 6);
                    }
                    composer3.endReplaceGroup();
                    SleepMorningDiagnosticsCardKt.DiagnosticRow("Samples", snapshot2.getSampleCount() + " buckets", composer3, 6);
                    SleepMorningDiagnosticsCardKt.DiagnosticRow("Tracking", snapshot2.getTrackingHealthLine(), composer3, 6);
                    String smartAlarmUnavailable = snapshot2.getSmartAlarmUnavailable();
                    composer3.startReplaceGroup(-1405738689);
                    if (smartAlarmUnavailable != null) {
                        TextKt.m2376Text4IGK_g(smartAlarmUnavailable, (Modifier) null, colorScheme22.getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer3, 0, 0, 65530);
                    }
                    composer3.endReplaceGroup();
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
        }, composer2, 54), composer2, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 26);
        if (ComposerKt.isTraceInProgress()) {
        }
        modifier2 = modifier42;
        endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DiagnosticRow(final String str, final String str2, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(-1350808743);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str2) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1350808743, i2, -1, "com.example.rungps.ui.sleep.DiagnosticRow (SleepMorningDiagnosticsCard.kt:56)");
            }
            composer2 = startRestartGroup;
            TextKt.m2376Text4IGK_g(str + ": " + str2, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodySmall(), composer2, 0, 0, 65530);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.sleep.SleepMorningDiagnosticsCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit DiagnosticRow$lambda$1;
                    DiagnosticRow$lambda$1 = SleepMorningDiagnosticsCardKt.DiagnosticRow$lambda$1(str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                    return DiagnosticRow$lambda$1;
                }
            });
        }
    }
}
