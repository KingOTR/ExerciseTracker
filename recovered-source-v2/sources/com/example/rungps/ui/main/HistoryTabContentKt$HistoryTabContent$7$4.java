package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.data.GymLoadStats;
import com.example.rungps.feature.run.RunRow;
import com.example.rungps.tracking.ActivityTypes;
import com.example.rungps.ui.components.EmptyStateKt;
import com.example.rungps.ui.navigation.MainTab;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HistoryTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HistoryTabContentKt$HistoryTabContent$7$4 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ List<RunRow> $finishedActivities;
    final /* synthetic */ Function1<String, Unit> $goTab;
    final /* synthetic */ GymLoadStats $gymLoad;
    final /* synthetic */ Function1<Long, Unit> $onDeleteOneId;
    final /* synthetic */ Function1<Long, Unit> $onExport;
    final /* synthetic */ Function0<Unit> $onExportAll;
    final /* synthetic */ Function1<Long, Unit> $onSelectRun;
    final /* synthetic */ Function1<Long, Unit> $onShareOnPhoto;
    final /* synthetic */ Function1<Boolean, Unit> $onShowDeleteAll;

    /* JADX WARN: Multi-variable type inference failed */
    HistoryTabContentKt$HistoryTabContent$7$4(List<RunRow> list, Function1<? super String, Unit> function1, Function0<Unit> function0, Function1<? super Boolean, Unit> function12, GymLoadStats gymLoadStats, Function1<? super Long, Unit> function13, Function1<? super Long, Unit> function14, Function1<? super Long, Unit> function15, Function1<? super Long, Unit> function16) {
        this.$finishedActivities = list;
        this.$goTab = function1;
        this.$onExportAll = function0;
        this.$onShowDeleteAll = function12;
        this.$gymLoad = gymLoadStats;
        this.$onSelectRun = function13;
        this.$onShareOnPhoto = function14;
        this.$onExport = function15;
        this.$onDeleteOneId = function16;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1654805724, i, -1, "com.example.rungps.ui.main.HistoryTabContent.<anonymous>.<anonymous> (HistoryTabContent.kt:551)");
            }
            Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
            Arrangement.Horizontal end = Arrangement.INSTANCE.getEnd();
            Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
            final Function0<Unit> function0 = this.$onExportAll;
            List<RunRow> list = this.$finishedActivities;
            final Function1<Boolean, Unit> function1 = this.$onShowDeleteAll;
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(end, centerVertically, composer, 54);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
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
            Updater.m3343setimpl(m3336constructorimpl, rowMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl, currentCompositionLocalMap, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl.getInserting() || !Intrinsics.areEqual(m3336constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m3336constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m3336constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m3343setimpl(m3336constructorimpl, materializeModifier, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
            float f = 8;
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
            ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
            int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
            Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, companion);
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
            Updater.m3343setimpl(m3336constructorimpl2, rowMeasurePolicy2, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
            Updater.m3343setimpl(m3336constructorimpl2, currentCompositionLocalMap2, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
            if (m3336constructorimpl2.getInserting() || !Intrinsics.areEqual(m3336constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                m3336constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                m3336constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m3343setimpl(m3336constructorimpl2, materializeModifier2, ComposeUiNode.INSTANCE.getSetModifier());
            ComposerKt.sourceInformationMarkerStart(composer, -407840262, "C101@5126L9:Row.kt#2w3rfo");
            RowScopeInstance rowScopeInstance2 = RowScopeInstance.INSTANCE;
            composer.startReplaceGroup(-1392296148);
            boolean changed = composer.changed(function0);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$4$lambda$1$lambda$0;
                        invoke$lambda$5$lambda$4$lambda$1$lambda$0 = HistoryTabContentKt$HistoryTabContent$7$4.invoke$lambda$5$lambda$4$lambda$1$lambda$0(Function0.this);
                        return invoke$lambda$5$lambda$4$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$HistoryTabContentKt.INSTANCE.m7198getLambda15$app_sideload(), composer, 805306368, 510);
            boolean z = !list.isEmpty();
            composer.startReplaceGroup(-1392290796);
            boolean changed2 = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$4$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$5$lambda$4$lambda$3$lambda$2 = HistoryTabContentKt$HistoryTabContent$7$4.invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1.this);
                        return invoke$lambda$5$lambda$4$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            ButtonKt.OutlinedButton((Function0) rememberedValue2, null, z, null, null, null, null, null, null, ComposableSingletons$HistoryTabContentKt.INSTANCE.m7199getLambda16$app_sideload(), composer, 805306368, 506);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            if (this.$finishedActivities.isEmpty()) {
                composer.startReplaceGroup(-1763174950);
                composer.startReplaceGroup(-749607655);
                boolean changed3 = composer.changed(this.$goTab);
                final Function1<String, Unit> function12 = this.$goTab;
                Object rememberedValue3 = composer.rememberedValue();
                if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$7$lambda$6;
                            invoke$lambda$7$lambda$6 = HistoryTabContentKt$HistoryTabContent$7$4.invoke$lambda$7$lambda$6(Function1.this);
                            return invoke$lambda$7$lambda$6;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                EmptyStateKt.EmptyState("No activities yet — start a run or bike ride from Home.", null, "Go to Home", (Function0) rememberedValue3, composer, 390, 2);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-1762915232);
                Modifier fillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(f));
                List<RunRow> list2 = this.$finishedActivities;
                GymLoadStats gymLoadStats = this.$gymLoad;
                final Function1<Long, Unit> function13 = this.$onSelectRun;
                final Function1<Long, Unit> function14 = this.$onShareOnPhoto;
                final Function1<Long, Unit> function15 = this.$onExport;
                final Function1<Long, Unit> function16 = this.$onDeleteOneId;
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getStart(), composer, 6);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default2);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
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
                Updater.m3343setimpl(m3336constructorimpl3, columnMeasurePolicy, ComposeUiNode.INSTANCE.getSetMeasurePolicy());
                Updater.m3343setimpl(m3336constructorimpl3, currentCompositionLocalMap3, ComposeUiNode.INSTANCE.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = ComposeUiNode.INSTANCE.getSetCompositeKeyHash();
                if (m3336constructorimpl3.getInserting() || !Intrinsics.areEqual(m3336constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    m3336constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    m3336constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m3343setimpl(m3336constructorimpl3, materializeModifier3, ComposeUiNode.INSTANCE.getSetModifier());
                ComposerKt.sourceInformationMarkerStart(composer, -384784025, "C88@4444L9:Column.kt#2w3rfo");
                ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                composer.startReplaceGroup(1196766570);
                for (final RunRow runRow : list2) {
                    String str = "Recovery " + MainActivityFormattersKt.suggestRecovery(runRow.getKm() * 1000.0d, runRow.getDurationMs(), gymLoadStats, ActivityTypes.INSTANCE.isBike(runRow.getActivityType()));
                    composer.startReplaceGroup(-1392258544);
                    boolean changed4 = composer.changed(function13) | composer.changedInstance(runRow);
                    Object rememberedValue4 = composer.rememberedValue();
                    if (changed4 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$4$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$17$lambda$16$lambda$9$lambda$8;
                                invoke$lambda$17$lambda$16$lambda$9$lambda$8 = HistoryTabContentKt$HistoryTabContent$7$4.invoke$lambda$17$lambda$16$lambda$9$lambda$8(Function1.this, runRow);
                                return invoke$lambda$17$lambda$16$lambda$9$lambda$8;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue4);
                    }
                    Function0 function02 = (Function0) rememberedValue4;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1392256493);
                    boolean changed5 = composer.changed(function14) | composer.changedInstance(runRow);
                    Object rememberedValue5 = composer.rememberedValue();
                    if (changed5 || rememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue5 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$4$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$17$lambda$16$lambda$11$lambda$10;
                                invoke$lambda$17$lambda$16$lambda$11$lambda$10 = HistoryTabContentKt$HistoryTabContent$7$4.invoke$lambda$17$lambda$16$lambda$11$lambda$10(Function1.this, runRow);
                                return invoke$lambda$17$lambda$16$lambda$11$lambda$10;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue5);
                    }
                    Function0 function03 = (Function0) rememberedValue5;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1392254547);
                    boolean changed6 = composer.changed(function15) | composer.changedInstance(runRow);
                    Object rememberedValue6 = composer.rememberedValue();
                    if (changed6 || rememberedValue6 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue6 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$4$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$17$lambda$16$lambda$13$lambda$12;
                                invoke$lambda$17$lambda$16$lambda$13$lambda$12 = HistoryTabContentKt$HistoryTabContent$7$4.invoke$lambda$17$lambda$16$lambda$13$lambda$12(Function1.this, runRow);
                                return invoke$lambda$17$lambda$16$lambda$13$lambda$12;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue6);
                    }
                    Function0 function04 = (Function0) rememberedValue6;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1392252782);
                    boolean changed7 = composer.changed(function16) | composer.changedInstance(runRow);
                    Object rememberedValue7 = composer.rememberedValue();
                    if (changed7 || rememberedValue7 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue7 = new Function0() { // from class: com.example.rungps.ui.main.HistoryTabContentKt$HistoryTabContent$7$4$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$17$lambda$16$lambda$15$lambda$14;
                                invoke$lambda$17$lambda$16$lambda$15$lambda$14 = HistoryTabContentKt$HistoryTabContent$7$4.invoke$lambda$17$lambda$16$lambda$15$lambda$14(Function1.this, runRow);
                                return invoke$lambda$17$lambda$16$lambda$15$lambda$14;
                            }
                        };
                        composer.updateRememberedValue(rememberedValue7);
                    }
                    composer.endReplaceGroup();
                    RunListRowKt.RunListRow(runRow, str, function02, function03, function04, (Function0) rememberedValue7, composer, 0);
                }
                composer.endReplaceGroup();
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endReplaceGroup();
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
    public static final Unit invoke$lambda$5$lambda$4$lambda$1$lambda$0(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$7$lambda$6(Function1 function1) {
        function1.invoke(MainTab.Run.getRoute());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16$lambda$9$lambda$8(Function1 function1, RunRow runRow) {
        function1.invoke(Long.valueOf(runRow.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16$lambda$11$lambda$10(Function1 function1, RunRow runRow) {
        function1.invoke(Long.valueOf(runRow.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16$lambda$13$lambda$12(Function1 function1, RunRow runRow) {
        function1.invoke(Long.valueOf(runRow.getId()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$17$lambda$16$lambda$15$lambda$14(Function1 function1, RunRow runRow) {
        function1.invoke(Long.valueOf(runRow.getId()));
        return Unit.INSTANCE;
    }
}
