package com.example.rungps.sleep;

import androidx.activity.compose.BackHandlerKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonDefaults;
import androidx.compose.material3.ButtonKt;
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
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.TextUnitKt;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepAlarmActivity.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"SleepAlarmScreen", "", "onDismiss", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SleepAlarmActivityKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepAlarmScreen$lambda$4(Function0 function0, int i, Composer composer, int i2) {
        SleepAlarmScreen(function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SleepAlarmScreen(final Function0<Unit> function0, Composer composer, final int i) {
        int i2;
        TextStyle m5814copyp1EtxEg;
        Composer composer2;
        Composer startRestartGroup = composer.startRestartGroup(253055916);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(253055916, i2, -1, "com.example.rungps.sleep.SleepAlarmScreen (SleepAlarmActivity.kt:105)");
            }
            startRestartGroup.startReplaceGroup(24554122);
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.sleep.SleepAlarmActivityKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit SleepAlarmScreen$lambda$1$lambda$0;
                        SleepAlarmScreen$lambda$1$lambda$0 = SleepAlarmActivityKt.SleepAlarmScreen$lambda$1$lambda$0(Function0.this);
                        return SleepAlarmScreen$lambda$1$lambda$0;
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            startRestartGroup.endReplaceGroup();
            BackHandlerKt.BackHandler(false, (Function0) rememberedValue, startRestartGroup, 0, 1);
            String format = LocalTime.now().format(DateTimeFormatter.ofPattern("h:mm a"));
            ColorScheme colorScheme = MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable);
            float f = 24;
            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(f));
            Alignment center = Alignment.INSTANCE.getCenter();
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, 733328855, "CC(Box)P(2,1,3)72@3384L130:Box.kt#2w3rfo");
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, m684padding3ABfNKs);
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
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
            float f2 = 20;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f2));
            ComposerKt.sourceInformationMarkerStart(startRestartGroup, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, centerHorizontally, startRestartGroup, 54);
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
            Intrinsics.checkNotNull(format);
            m5814copyp1EtxEg = r40.m5814copyp1EtxEg((r48 & 1) != 0 ? r40.spanStyle.m5738getColor0d7_KjU() : 0L, (r48 & 2) != 0 ? r40.spanStyle.getFontSize() : TextUnitKt.getSp(56), (r48 & 4) != 0 ? r40.spanStyle.getFontWeight() : FontWeight.INSTANCE.getBold(), (r48 & 8) != 0 ? r40.spanStyle.getFontStyle() : null, (r48 & 16) != 0 ? r40.spanStyle.getFontSynthesis() : null, (r48 & 32) != 0 ? r40.spanStyle.getFontFamily() : null, (r48 & 64) != 0 ? r40.spanStyle.getFontFeatureSettings() : null, (r48 & 128) != 0 ? r40.spanStyle.getLetterSpacing() : 0L, (r48 & 256) != 0 ? r40.spanStyle.getBaselineShift() : null, (r48 & 512) != 0 ? r40.spanStyle.getTextGeometricTransform() : null, (r48 & 1024) != 0 ? r40.spanStyle.getLocaleList() : null, (r48 & 2048) != 0 ? r40.spanStyle.getBackground() : 0L, (r48 & 4096) != 0 ? r40.spanStyle.getTextDecoration() : null, (r48 & 8192) != 0 ? r40.spanStyle.getShadow() : null, (r48 & 16384) != 0 ? r40.spanStyle.getDrawStyle() : null, (r48 & 32768) != 0 ? r40.paragraphStyle.getTextAlign() : 0, (r48 & 65536) != 0 ? r40.paragraphStyle.getTextDirection() : 0, (r48 & 131072) != 0 ? r40.paragraphStyle.getLineHeight() : 0L, (r48 & 262144) != 0 ? r40.paragraphStyle.getTextIndent() : null, (r48 & 524288) != 0 ? r40.platformStyle : null, (r48 & 1048576) != 0 ? r40.paragraphStyle.getLineHeightStyle() : null, (r48 & 2097152) != 0 ? r40.paragraphStyle.getLineBreak() : 0, (r48 & 4194304) != 0 ? r40.paragraphStyle.getHyphens() : 0, (r48 & 8388608) != 0 ? MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getDisplayLarge().paragraphStyle.getTextMotion() : null);
            TextKt.m2376Text4IGK_g(format, (Modifier) null, colorScheme.getOnBackground(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, m5814copyp1EtxEg, startRestartGroup, 0, 0, 65018);
            TextKt.m2376Text4IGK_g("Wake up", (Modifier) null, colorScheme.getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getHeadlineMedium(), startRestartGroup, 196614, 0, 65498);
            TextKt.m2376Text4IGK_g("Alarm is ringing. Tap below to stop sound and vibration.", PaddingKt.m686paddingVpY3zN4$default(Modifier.INSTANCE, Dp.m6303constructorimpl(8), 0.0f, 2, null), colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, TextAlign.m6185boximpl(TextAlign.INSTANCE.m6192getCentere0LSkKk()), 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(startRestartGroup, MaterialTheme.$stable).getBodyLarge(), startRestartGroup, 54, 0, 65016);
            composer2 = startRestartGroup;
            ButtonKt.Button(function0, PaddingKt.m688paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, Dp.m6303constructorimpl(f), 0.0f, 0.0f, 13, null), false, null, ButtonDefaults.INSTANCE.m1491buttonColorsro_MJ88(colorScheme.getPrimary(), colorScheme.getOnPrimary(), 0L, 0L, startRestartGroup, ButtonDefaults.$stable << 12, 12), null, null, PaddingKt.m678PaddingValuesYgX7TsA(Dp.m6303constructorimpl(f), Dp.m6303constructorimpl(f2)), null, ComposableSingletons$SleepAlarmActivityKt.INSTANCE.m6914getLambda1$app_sideload(), composer2, i3 | 817889328, 364);
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
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.sleep.SleepAlarmActivityKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit SleepAlarmScreen$lambda$4;
                    SleepAlarmScreen$lambda$4 = SleepAlarmActivityKt.SleepAlarmScreen$lambda$4(Function0.this, i, (Composer) obj, ((Integer) obj2).intValue());
                    return SleepAlarmScreen$lambda$4;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SleepAlarmScreen$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
