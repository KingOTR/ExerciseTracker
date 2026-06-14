package com.example.rungps.ui.sleep;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ColorScheme;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
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
import com.example.rungps.sleep.SleepScience;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepRecoveryGuideCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepRecoveryGuideCardKt$SleepRecoveryGuideCard$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $expanded$delegate;
    final /* synthetic */ ColorScheme $scheme;

    SleepRecoveryGuideCardKt$SleepRecoveryGuideCard$1(ColorScheme colorScheme, MutableState<Boolean> mutableState) {
        this.$scheme = colorScheme;
        this.$expanded$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        final MutableState<Boolean> mutableState;
        boolean SleepRecoveryGuideCard$lambda$1;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-134763168, i, -1, "com.example.rungps.ui.sleep.SleepRecoveryGuideCard.<anonymous> (SleepRecoveryGuideCard.kt:30)");
        }
        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        ColorScheme colorScheme = this.$scheme;
        MutableState<Boolean> mutableState2 = this.$expanded$delegate;
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
        TextKt.m2376Text4IGK_g("Why sleep matters for training", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, 196614, 0, 65502);
        TextKt.m2376Text4IGK_g("Sleep supports genetic repair and adaptation after hard sessions, and helps metabolic, autonomic (ANS), and immune systems return toward resting levels.", (Modifier) null, colorScheme.getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
        composer.startReplaceGroup(-856969015);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            mutableState = mutableState2;
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepRecoveryGuideCardKt$SleepRecoveryGuideCard$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$2$lambda$1$lambda$0;
                    invoke$lambda$2$lambda$1$lambda$0 = SleepRecoveryGuideCardKt$SleepRecoveryGuideCard$1.invoke$lambda$2$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$2$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        } else {
            mutableState = mutableState2;
        }
        composer.endReplaceGroup();
        ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(-1897328365, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.SleepRecoveryGuideCardKt$SleepRecoveryGuideCard$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer2, Integer num) {
                invoke(rowScope, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(RowScope TextButton, Composer composer2, int i2) {
                boolean SleepRecoveryGuideCard$lambda$12;
                Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
                if ((i2 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1897328365, i2, -1, "com.example.rungps.ui.sleep.SleepRecoveryGuideCard.<anonymous>.<anonymous>.<anonymous> (SleepRecoveryGuideCard.kt:43)");
                }
                SleepRecoveryGuideCard$lambda$12 = SleepRecoveryGuideCardKt.SleepRecoveryGuideCard$lambda$1(mutableState);
                TextKt.m2376Text4IGK_g(SleepRecoveryGuideCard$lambda$12 ? "Hide stages & cycles" : "Stages, duration & cycles", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54), composer, 805306374, 510);
        composer.startReplaceGroup(-856963207);
        SleepRecoveryGuideCard$lambda$1 = SleepRecoveryGuideCardKt.SleepRecoveryGuideCard$lambda$1(mutableState);
        if (SleepRecoveryGuideCard$lambda$1) {
            SleepRecoveryGuideCardKt.GuideBullet("How much", "Most adults need about 6–10 h per night; 8–10 h is a practical recovery target when training hard.", composer, 54);
            SleepRecoveryGuideCardKt.GuideBullet("Ultradian cycles", "Sleep moves in ~80–100 min cycles (often ~90 min). A full night usually includes several cycles with light (NREM 1–2), deep (NREM 3), and REM — all matter for effective rest.", composer, 54);
            SleepRecoveryGuideCardKt.GuideBullet("Light sleep (NREM 1–2)", SleepScience.INSTANCE.lightStageHint(), composer, 6);
            SleepRecoveryGuideCardKt.GuideBullet("Deep sleep (NREM 3)", SleepScience.INSTANCE.deepStageHint(), composer, 6);
            SleepRecoveryGuideCardKt.GuideBullet("REM", SleepScience.INSTANCE.remStageHint(), composer, 6);
            SleepRecoveryGuideCardKt.GuideBullet("Early night", "Missing the first sleep drive (staying up late) can reduce deep sleep — protect a consistent wind-down.", composer, 54);
        }
        composer.endReplaceGroup();
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(MutableState mutableState) {
        boolean SleepRecoveryGuideCard$lambda$1;
        SleepRecoveryGuideCard$lambda$1 = SleepRecoveryGuideCardKt.SleepRecoveryGuideCard$lambda$1(mutableState);
        SleepRecoveryGuideCardKt.SleepRecoveryGuideCard$lambda$2(mutableState, !SleepRecoveryGuideCard$lambda$1);
        return Unit.INSTANCE;
    }
}
