package com.example.rungps.ui.sleep;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
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
import androidx.compose.ui.unit.Dp;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepAnalyticsCompact;
import com.example.rungps.sleep.SleepOsaRiskScorer;
import com.example.rungps.sleep.SleepSnoreMetrics;
import com.example.rungps.sleep.SleepTrendAnalysis;
import com.example.rungps.ui.theme.EarthColors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt;

/* compiled from: SleepTrendCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTrendCardKt$SleepTrendCard$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ SleepTrendAnalysis.NightPoint $active;
    final /* synthetic */ MutableIntState $activeIdx$delegate;
    final /* synthetic */ List<SleepEntryEntity> $entries;
    final /* synthetic */ SleepOsaRiskScorer.Result $osaTier;
    final /* synthetic */ ColorScheme $scheme;
    final /* synthetic */ SleepTrendAnalysis.TrendSummary $summary;
    final /* synthetic */ MutableState<SleepTrendAnalysis.Window> $window$delegate;

    SleepTrendCardKt$SleepTrendCard$3(SleepTrendAnalysis.NightPoint nightPoint, ColorScheme colorScheme, SleepTrendAnalysis.TrendSummary trendSummary, SleepOsaRiskScorer.Result result, List<SleepEntryEntity> list, MutableIntState mutableIntState, MutableState<SleepTrendAnalysis.Window> mutableState) {
        this.$active = nightPoint;
        this.$scheme = colorScheme;
        this.$summary = trendSummary;
        this.$osaTier = result;
        this.$entries = list;
        this.$activeIdx$delegate = mutableIntState;
        this.$window$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        ColorScheme colorScheme;
        SleepSnoreMetrics.NightMetrics snore;
        SleepTrendAnalysis.Window SleepTrendCard$lambda$2;
        final MutableState<SleepTrendAnalysis.Window> mutableState;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2053121674, i, -1, "com.example.rungps.ui.sleep.SleepTrendCard.<anonymous> (SleepTrendCard.kt:60)");
            }
            Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
            final SleepTrendAnalysis.NightPoint nightPoint = this.$active;
            final ColorScheme colorScheme2 = this.$scheme;
            SleepTrendAnalysis.TrendSummary trendSummary = this.$summary;
            SleepOsaRiskScorer.Result result = this.$osaTier;
            List<SleepEntryEntity> list = this.$entries;
            final MutableIntState mutableIntState = this.$activeIdx$delegate;
            MutableState<SleepTrendAnalysis.Window> mutableState2 = this.$window$delegate;
            ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
            MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, m684padding3ABfNKs);
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
            Updater.m3343setimpl(m3336constructorimpl, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            MutableState<SleepTrendAnalysis.Window> mutableState3 = mutableState2;
            TextKt.m2376Text4IGK_g("Sleep trends", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            String str = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            Composer composer2 = composer;
            ComposerKt.sourceInformationMarkerStart(composer2, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer2, 6);
            String str2 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            ComposerKt.sourceInformationMarkerStart(composer2, -1323940314, str2);
            boolean z = false;
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer2, companion);
            Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
            String str3 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            ComposerKt.sourceInformationMarkerStart(composer2, -692256719, str3);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer2.createNode(constructor2);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl2 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            String str4 = "C101@5126L9:Row.kt#2w3rfo";
            ComposerKt.sourceInformationMarkerStart(composer2, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            composer2.startReplaceGroup(2052270161);
            for (final SleepTrendAnalysis.Window window : SleepTrendAnalysis.Window.getEntries()) {
                SleepTrendCard$lambda$2 = SleepTrendCardKt.SleepTrendCard$lambda$2(mutableState3);
                boolean z2 = SleepTrendCard$lambda$2 == window ? true : z;
                composer2.startReplaceGroup(1489199251);
                boolean changed = composer2.changed(window);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    mutableState = mutableState3;
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$SleepTrendCard$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$14$lambda$3$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$14$lambda$3$lambda$2$lambda$1$lambda$0 = SleepTrendCardKt$SleepTrendCard$3.invoke$lambda$14$lambda$3$lambda$2$lambda$1$lambda$0(SleepTrendAnalysis.Window.this, mutableState);
                            return invoke$lambda$14$lambda$3$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                } else {
                    mutableState = mutableState3;
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(z2, (Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(1585530624, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$SleepTrendCard$3$1$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i2) {
                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1585530624, i2, -1, "com.example.rungps.ui.sleep.SleepTrendCard.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SleepTrendCard.kt:74)");
                        }
                        TextKt.m2376Text4IGK_g(SleepTrendAnalysis.Window.this.getLabel(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                composer2 = composer;
                mutableState3 = mutableState;
                str4 = str4;
                str3 = str3;
                str2 = str2;
                str = str;
                z = false;
            }
            String str5 = str4;
            String str6 = str3;
            String str7 = str2;
            String str8 = str;
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (nightPoint != null) {
                composer.startReplaceGroup(1961299633);
                final String label = nightPoint.getLabel();
                SurfaceKt.m2226SurfaceT9BRK9s(null, RoundedCornerShapeKt.m967RoundedCornerShape0680j_4(Dp.m6303constructorimpl(12)), colorScheme2.getSurface(), 0L, 0.0f, 0.0f, null, ComposableLambdaKt.rememberComposableLambda(-31659958, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$SleepTrendCard$3$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i2) {
                        if ((i2 & 3) != 2 || !composer3.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-31659958, i2, -1, "com.example.rungps.ui.sleep.SleepTrendCard.<anonymous>.<anonymous>.<anonymous> (SleepTrendCard.kt:84)");
                            }
                            Modifier m685paddingVpY3zN4 = PaddingKt.m685paddingVpY3zN4(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(14), Dp.m6303constructorimpl(12));
                            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                            String str9 = label;
                            SleepTrendAnalysis.NightPoint nightPoint2 = nightPoint;
                            ColorScheme colorScheme3 = colorScheme2;
                            ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                            ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer3, m685paddingVpY3zN4);
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
                            TextKt.m2376Text4IGK_g(str9, (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodyMedium(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String format = String.format(Locale.US, "%.1f h", Arrays.copyOf(new Object[]{Float.valueOf(nightPoint2.getTotalSleepHours())}, 1));
                            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                            TextKt.m2376Text4IGK_g(format, (Modifier) null, colorScheme3.getPrimary(), 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getTitleMedium(), composer3, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65498);
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
                }, composer, 54), composer, 12582912, 121);
                composer.endReplaceGroup();
                colorScheme = colorScheme2;
            } else {
                composer.startReplaceGroup(1962367831);
                colorScheme = colorScheme2;
                TextKt.m2376Text4IGK_g("Tap a bar for exact sleep time", (Modifier) null, colorScheme2.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 6, 0, 65530);
                composer.endReplaceGroup();
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, str8);
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str7);
            int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
            Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
            ComposerKt.sourceInformationMarkerStart(composer, -692256719, str6);
            if (!(composer.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor3);
            } else {
                composer.useNode();
            }
            Composer m3336constructorimpl3 = Updater.m3336constructorimpl(composer);
            Updater.m3343setimpl(m3336constructorimpl3, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, str5);
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("%.1f h", Arrays.copyOf(new Object[]{Float.valueOf(trendSummary.getAvgSleepHours())}, 1));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            SleepTrendCardKt.TrendStat("Avg sleep", format, composer, 6);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            String format2 = String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(trendSummary.getAvgEstimatedCycles())}, 1));
            Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
            SleepTrendCardKt.TrendStat("~Cycles", format2, composer, 6);
            Integer avgQuality = trendSummary.getAvgQuality();
            composer.startReplaceGroup(2052332881);
            if (avgQuality != null) {
                SleepTrendCardKt.TrendStat("Avg quality", avgQuality.intValue() + "/100", composer, 6);
                Unit unit = Unit.INSTANCE;
                Unit unit2 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            Integer avgDeepMin = trendSummary.getAvgDeepMin();
            composer.startReplaceGroup(2052335437);
            if (avgDeepMin != null) {
                SleepTrendCardKt.TrendStat("Avg deep", avgDeepMin.intValue() + "m", composer, 6);
                Unit unit3 = Unit.INSTANCE;
                Unit unit4 = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            TextKt.m2376Text4IGK_g(trendSummary.getDurationBand().getLabel(), (Modifier) null, colorScheme.getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 65530);
            composer.startReplaceGroup(-1045047383);
            if (trendSummary.getNightsLogged() > 0) {
                TextKt.m2376Text4IGK_g(trendSummary.getNightsInRecoveryBand() + DomExceptionUtils.SEPARATOR + trendSummary.getNightsLogged() + " nights in 8–10 h band · " + trendSummary.getNightsWithAllStages() + " with light+deep+REM", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1045034748);
            if (!StringsKt.isBlank(trendSummary.getCoachInsight())) {
                TextKt.m2376Text4IGK_g(trendSummary.getCoachInsight(), (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1045025793);
            if (result.getTier() != SleepOsaRiskScorer.Tier.INSUFFICIENT_DATA) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    SleepAnalyticsCompact parse = SleepAnalyticsCompact.INSTANCE.parse(((SleepEntryEntity) it.next()).getSleepAnalyticsJson());
                    Integer valueOf = (parse == null || (snore = parse.getSnore()) == null) ? null : Integer.valueOf(snore.getSnoreScore());
                    if (valueOf != null) {
                        arrayList.add(valueOf);
                    }
                }
                Double valueOf2 = Double.valueOf(CollectionsKt.averageOfInt(arrayList));
                if (Double.isNaN(valueOf2.doubleValue())) {
                    valueOf2 = null;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("Breathing wellness tier: " + result.getTier().name());
                if (valueOf2 != null) {
                    sb.append(" · avg snore score " + ((int) valueOf2.doubleValue()));
                }
                sb.append(" (not a diagnosis)");
                String sb2 = sb.toString();
                Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
                TextKt.m2376Text4IGK_g(sb2, (Modifier) null, colorScheme.getTertiary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1045002930);
            if (trendSummary.getPoints().size() >= 2) {
                List<SleepTrendAnalysis.NightPoint> points = trendSummary.getPoints();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(points, 10));
                Iterator<T> it2 = points.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(Float.valueOf(((SleepTrendAnalysis.NightPoint) it2.next()).getTotalSleepHours()));
                }
                ArrayList arrayList3 = arrayList2;
                long m7648getSage0d7_KjU = EarthColors.INSTANCE.m7648getSage0d7_KjU();
                Modifier m715height3ABfNKs = SizeKt.m715height3ABfNKs(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), Dp.m6303constructorimpl(104));
                composer.startReplaceGroup(-1044988789);
                boolean changed2 = composer.changed(mutableIntState);
                Object rememberedValue2 = composer.rememberedValue();
                if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function1() { // from class: com.example.rungps.ui.sleep.SleepTrendCardKt$SleepTrendCard$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            Unit invoke$lambda$14$lambda$13$lambda$12;
                            invoke$lambda$14$lambda$13$lambda$12 = SleepTrendCardKt$SleepTrendCard$3.invoke$lambda$14$lambda$13$lambda$12(MutableIntState.this, ((Integer) obj).intValue());
                            return invoke$lambda$14$lambda$13$lambda$12;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                SleepTrendCardKt.m7607SleepHoursSparklineoC9nPe0(arrayList3, m7648getSage0d7_KjU, 6.0f, 8.0f, 10.0f, m715height3ABfNKs, (Function1) rememberedValue2, composer, 224640, 0);
                TextKt.m2376Text4IGK_g(trendSummary.getNightsLogged() + " nights · dashed lines: 6 h typical min, 8 h goal, 10 h typical max", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65530);
            }
            composer.endReplaceGroup();
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
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$3$lambda$2$lambda$1$lambda$0(SleepTrendAnalysis.Window window, MutableState mutableState) {
        mutableState.setValue(window);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$14$lambda$13$lambda$12(MutableIntState mutableIntState, int i) {
        int SleepTrendCard$lambda$8;
        SleepTrendCard$lambda$8 = SleepTrendCardKt.SleepTrendCard$lambda$8(mutableIntState);
        if (SleepTrendCard$lambda$8 == i) {
            i = -1;
        }
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }
}
