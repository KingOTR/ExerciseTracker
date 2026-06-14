package com.example.rungps.ui.tabs;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.DividerKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
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
import com.example.rungps.recovery.RecoveryModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecoveryTab.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RecoveryTabKt$RecoveryTab$6$9 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> $eventDetails$delegate;
    final /* synthetic */ MutableState<Long> $expandedGymEventId$delegate;
    final /* synthetic */ MutableState<String> $expandedGymWhy$delegate;

    RecoveryTabKt$RecoveryTab$6$9(MutableState<List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail>> mutableState, MutableState<Long> mutableState2, MutableState<String> mutableState3) {
        this.$eventDetails$delegate = mutableState;
        this.$expandedGymEventId$delegate = mutableState2;
        this.$expandedGymWhy$delegate = mutableState3;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
        List<RecoveryTabKt$RecoveryTab$RecoveryEventDetail> RecoveryTab$lambda$15;
        Modifier.Companion companion;
        String why;
        Long RecoveryTab$lambda$18;
        String RecoveryTab$lambda$21;
        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-295625288, i, -1, "com.example.rungps.ui.tabs.RecoveryTab.<anonymous>.<anonymous> (RecoveryTab.kt:454)");
            }
            TextKt.m2376Text4IGK_g("Hard sessions add training load. Your body needs time to repair muscle, refill energy stores, and adapt. Each item below shows the activity, where it was logged, and how long until that load clears.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            RecoveryTab$lambda$15 = RecoveryTabKt.RecoveryTab$lambda$15(this.$eventDetails$delegate);
            final MutableState<Long> mutableState = this.$expandedGymEventId$delegate;
            MutableState<String> mutableState2 = this.$expandedGymWhy$delegate;
            for (final RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail : RecoveryTab$lambda$15) {
                DividerKt.m1755HorizontalDivider9IZ8Weo(null, 0.0f, 0L, composer, 0, 7);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(4));
                composer.startReplaceGroup(-610800219);
                if (Intrinsics.areEqual(recoveryTabKt$RecoveryTab$RecoveryEventDetail.getEvent().getKind(), "GYM")) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    composer.startReplaceGroup(-1884010120);
                    boolean changedInstance = composer.changedInstance(recoveryTabKt$RecoveryTab$RecoveryEventDetail);
                    Object rememberedValue = composer.rememberedValue();
                    if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                        rememberedValue = new Function0() { // from class: com.example.rungps.ui.tabs.RecoveryTabKt$RecoveryTab$6$9$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$4$lambda$1$lambda$0;
                                invoke$lambda$4$lambda$1$lambda$0 = RecoveryTabKt$RecoveryTab$6$9.invoke$lambda$4$lambda$1$lambda$0(RecoveryTabKt$RecoveryTab$RecoveryEventDetail.this, mutableState);
                                return invoke$lambda$4$lambda$1$lambda$0;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue);
                    }
                    composer.endReplaceGroup();
                    companion = ClickableKt.m272clickableXHw0xAI$default(companion2, false, null, null, (Function0) rememberedValue, 7, null);
                } else {
                    companion = Modifier.INSTANCE;
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getStart(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, companion);
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
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
                MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(spaceBetween, Alignment.INSTANCE.getTop(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
                if (!(composer.getApplier() instanceof Applier)) {
                    ComposablesKt.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
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
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
                RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                MutableState<String> mutableState3 = mutableState2;
                MutableState<Long> mutableState4 = mutableState;
                TextKt.m2376Text4IGK_g(recoveryTabKt$RecoveryTab$RecoveryEventDetail.getTitle(), RowScope.weight$default(rowScopeInstance, Modifier.INSTANCE, 1.0f, false, 2, null), 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65500);
                TextKt.m2376Text4IGK_g(RecoveryModel.INSTANCE.formatRemaining(recoveryTabKt$RecoveryTab$RecoveryEventDetail.getRemainingMs()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                TextKt.m2376Text4IGK_g("Source: " + recoveryTabKt$RecoveryTab$RecoveryEventDetail.getSource(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getSecondary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 65530);
                if (Intrinsics.areEqual(recoveryTabKt$RecoveryTab$RecoveryEventDetail.getEvent().getKind(), "GYM")) {
                    long id = recoveryTabKt$RecoveryTab$RecoveryEventDetail.getEvent().getId();
                    RecoveryTab$lambda$18 = RecoveryTabKt.RecoveryTab$lambda$18(mutableState4);
                    if (RecoveryTab$lambda$18 != null && id == RecoveryTab$lambda$18.longValue()) {
                        RecoveryTab$lambda$21 = RecoveryTabKt.RecoveryTab$lambda$21(mutableState3);
                        if (RecoveryTab$lambda$21 != null) {
                            why = RecoveryTabKt.RecoveryTab$lambda$21(mutableState3);
                            Intrinsics.checkNotNull(why);
                            TextKt.m2376Text4IGK_g(why, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            composer.endNode();
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            ComposerKt.sourceInformationMarkerEnd(composer);
                            mutableState2 = mutableState3;
                            mutableState = mutableState4;
                        }
                    }
                }
                why = recoveryTabKt$RecoveryTab$RecoveryEventDetail.getWhy();
                TextKt.m2376Text4IGK_g(why, (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                mutableState2 = mutableState3;
                mutableState = mutableState4;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(RecoveryTabKt$RecoveryTab$RecoveryEventDetail recoveryTabKt$RecoveryTab$RecoveryEventDetail, MutableState mutableState) {
        Long RecoveryTab$lambda$18;
        RecoveryTab$lambda$18 = RecoveryTabKt.RecoveryTab$lambda$18(mutableState);
        mutableState.setValue((RecoveryTab$lambda$18 != null && RecoveryTab$lambda$18.longValue() == recoveryTabKt$RecoveryTab$RecoveryEventDetail.getEvent().getId()) ? null : Long.valueOf(recoveryTabKt$RecoveryTab$RecoveryEventDetail.getEvent().getId()));
        return Unit.INSTANCE;
    }
}
