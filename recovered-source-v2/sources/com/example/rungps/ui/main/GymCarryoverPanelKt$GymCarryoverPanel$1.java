package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
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
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.data.ExerciseNameNormalizer;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymCarryoverEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.gym.GymCarryover;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymCarryoverPanel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymCarryoverPanelKt$GymCarryoverPanel$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ List<ExerciseTemplateEntity> $activeDayExercises;
    final /* synthetic */ String $carryoverMode;
    final /* synthetic */ List<GymCarryoverEntity> $items;
    final /* synthetic */ Function1<String, Unit> $onModeChange;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;

    /* JADX WARN: Multi-variable type inference failed */
    GymCarryoverPanelKt$GymCarryoverPanel$1(List<GymCarryoverEntity> list, String str, Function1<? super String, Unit> function1, List<ExerciseTemplateEntity> list2, CoroutineScope coroutineScope, Repository repository) {
        this.$items = list;
        this.$carryoverMode = str;
        this.$onModeChange = function1;
        this.$activeDayExercises = list2;
        this.$scope = coroutineScope;
        this.$repo = repository;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
        Object obj;
        String str;
        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1337754248, i, -1, "com.example.rungps.ui.main.GymCarryoverPanel.<anonymous> (GymCarryoverPanel.kt:35)");
            }
            TextKt.m2376Text4IGK_g("Incomplete sets roll into your next workout. Choose whether they follow the same split day only or any upcoming day.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
            Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
            String str2 = this.$carryoverMode;
            final Function1<String, Unit> function1 = this.$onModeChange;
            ComposerKt.sourceInformationMarkerStart(composer, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
            Modifier.Companion companion = Modifier.INSTANCE;
            MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_4, Alignment.INSTANCE.getTop(), composer, 6);
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
            boolean areEqual = Intrinsics.areEqual(str2, "any_next");
            composer.startReplaceGroup(415035405);
            boolean changed = composer.changed(function1);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.GymCarryoverPanelKt$GymCarryoverPanel$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$4$lambda$1$lambda$0;
                        invoke$lambda$4$lambda$1$lambda$0 = GymCarryoverPanelKt$GymCarryoverPanel$1.invoke$lambda$4$lambda$1$lambda$0(Function1.this);
                        return invoke$lambda$4$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            String str3 = "C101@5126L9:Row.kt#2w3rfo";
            String str4 = "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp";
            String str5 = "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh";
            String str6 = "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo";
            ChipKt.FilterChip(areEqual, (Function0) rememberedValue, ComposableSingletons$GymCarryoverPanelKt.INSTANCE.m7175getLambda1$app_sideload(), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
            boolean areEqual2 = Intrinsics.areEqual(str2, "same_day");
            composer.startReplaceGroup(415043597);
            boolean changed2 = composer.changed(function1);
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.GymCarryoverPanelKt$GymCarryoverPanel$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$4$lambda$3$lambda$2;
                        invoke$lambda$4$lambda$3$lambda$2 = GymCarryoverPanelKt$GymCarryoverPanel$1.invoke$lambda$4$lambda$3$lambda$2(Function1.this);
                        return invoke$lambda$4$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            ChipKt.FilterChip(areEqual2, (Function0) rememberedValue2, ComposableSingletons$GymCarryoverPanelKt.INSTANCE.m7176getLambda2$app_sideload(), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
            ComposerKt.sourceInformationMarkerEnd(composer);
            composer.endNode();
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            ComposerKt.sourceInformationMarkerEnd(composer);
            List<GymCarryoverEntity> list = this.$items;
            List<ExerciseTemplateEntity> list2 = this.$activeDayExercises;
            CoroutineScope coroutineScope = this.$scope;
            Repository repository = this.$repo;
            for (final GymCarryoverEntity gymCarryoverEntity : list) {
                GymCarryover gymCarryover = GymCarryover.INSTANCE;
                String owedSetIndices = gymCarryoverEntity.getOwedSetIndices();
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (ExerciseNameNormalizer.INSTANCE.matches(gymCarryoverEntity.getExerciseName(), ((ExerciseTemplateEntity) obj).getName())) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                ExerciseTemplateEntity exerciseTemplateEntity = (ExerciseTemplateEntity) obj;
                List<Integer> decodeIndices = gymCarryover.decodeIndices(owedSetIndices, exerciseTemplateEntity != null ? exerciseTemplateEntity.getDefaultSets() : 3);
                if (StringsKt.isBlank(gymCarryoverEntity.getOwedSetIndices())) {
                    str = "Full exercise";
                } else {
                    List<Integer> list3 = decodeIndices;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list3, 10));
                    Iterator<T> it2 = list3.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((Number) it2.next()).intValue() + 1));
                    }
                    str = "Sets " + CollectionsKt.joinToString$default(arrayList, ", ", null, null, 0, null, null, 62, null);
                }
                String str7 = str;
                Modifier fillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                Arrangement.HorizontalOrVertical spaceBetween = Arrangement.INSTANCE.getSpaceBetween();
                Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                String str8 = str6;
                ComposerKt.sourceInformationMarkerStart(composer, 693286680, str8);
                MeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(spaceBetween, centerVertically, composer, 54);
                String str9 = str5;
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str9);
                int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer, fillMaxWidth$default);
                Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
                List<ExerciseTemplateEntity> list4 = list2;
                String str10 = str4;
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str10);
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
                String str11 = str3;
                ComposerKt.sourceInformationMarkerStart(composer, -407840262, str11);
                Modifier weight$default = RowScope.weight$default(RowScopeInstance.INSTANCE, Modifier.INSTANCE, 1.0f, false, 2, null);
                ComposerKt.sourceInformationMarkerStart(composer, -483455358, "CC(Column)P(2,3,1)86@4330L61,87@4396L133:Column.kt#2w3rfo");
                MeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                ComposerKt.sourceInformationMarkerStart(composer, -1323940314, str9);
                int currentCompositeKeyHash3 = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                Modifier materializeModifier3 = ComposedModifierKt.materializeModifier(composer, weight$default);
                Function0<ComposeUiNode> constructor3 = ComposeUiNode.INSTANCE.getConstructor();
                ComposerKt.sourceInformationMarkerStart(composer, -692256719, str10);
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
                str4 = str10;
                final CoroutineScope coroutineScope2 = coroutineScope;
                final Repository repository2 = repository;
                TextKt.m2376Text4IGK_g(gymCarryoverEntity.getExerciseName(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 0, 0, 65534);
                TextKt.m2376Text4IGK_g(str7, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelSmall(), composer, 0, 0, 65534);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.startReplaceGroup(1095018501);
                boolean changedInstance = composer.changedInstance(coroutineScope2) | composer.changedInstance(repository2) | composer.changedInstance(gymCarryoverEntity);
                Object rememberedValue3 = composer.rememberedValue();
                if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.GymCarryoverPanelKt$GymCarryoverPanel$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8;
                            invoke$lambda$11$lambda$10$lambda$9$lambda$8 = GymCarryoverPanelKt$GymCarryoverPanel$1.invoke$lambda$11$lambda$10$lambda$9$lambda$8(CoroutineScope.this, repository2, gymCarryoverEntity);
                            return invoke$lambda$11$lambda$10$lambda$9$lambda$8;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue3);
                }
                composer.endReplaceGroup();
                ButtonKt.TextButton((Function0) rememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$GymCarryoverPanelKt.INSTANCE.m7177getLambda3$app_sideload(), composer, 805306368, 510);
                ComposerKt.sourceInformationMarkerEnd(composer);
                composer.endNode();
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                ComposerKt.sourceInformationMarkerEnd(composer);
                coroutineScope = coroutineScope2;
                repository = repository2;
                str3 = str11;
                str6 = str8;
                list2 = list4;
                str5 = str9;
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
    public static final Unit invoke$lambda$4$lambda$1$lambda$0(Function1 function1) {
        function1.invoke("any_next");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3$lambda$2(Function1 function1) {
        function1.invoke("same_day");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$11$lambda$10$lambda$9$lambda$8(CoroutineScope coroutineScope, Repository repository, GymCarryoverEntity gymCarryoverEntity) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymCarryoverPanelKt$GymCarryoverPanel$1$2$1$2$1$1(repository, gymCarryoverEntity, null), 2, null);
        return Unit.INSTANCE;
    }
}
