package com.example.rungps.ui.coach;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
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
import androidx.profileinstaller.ProfileVerifier;
import com.example.rungps.data.Repository;
import com.example.rungps.data.TrainingPlanProgressEntity;
import com.example.rungps.training.BuiltinTrainingPlans;
import com.example.rungps.training.SavedCoachPlanStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TrainingCoachScreenKt$TrainingCoachScreen$3$6 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<BuiltinTrainingPlans.PlanDefinition> $confirmStart$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ State<TrainingPlanProgressEntity> $progress$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<String> $slug$delegate;

    TrainingCoachScreenKt$TrainingCoachScreen$3$6(MutableState<String> mutableState, CoroutineScope coroutineScope, Repository repository, Context context, MutableState<BuiltinTrainingPlans.PlanDefinition> mutableState2, State<TrainingPlanProgressEntity> state) {
        this.$slug$delegate = mutableState;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$ctx = context;
        this.$confirmStart$delegate = mutableState2;
        this.$progress$delegate = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope Card, Composer composer, int i) {
        TrainingPlanProgressEntity TrainingCoachScreen$lambda$1;
        String TrainingCoachScreen$lambda$11;
        Intrinsics.checkNotNullParameter(Card, "$this$Card");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1932807194, i, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous>.<anonymous> (TrainingCoachScreen.kt:269)");
        }
        Modifier m684padding3ABfNKs = PaddingKt.m684padding3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(16));
        Arrangement.HorizontalOrVertical m564spacedBy0680j_4 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(10));
        MutableState<String> mutableState = this.$slug$delegate;
        final CoroutineScope coroutineScope = this.$scope;
        final Repository repository = this.$repo;
        final Context context = this.$ctx;
        final MutableState<BuiltinTrainingPlans.PlanDefinition> mutableState2 = this.$confirmStart$delegate;
        State<TrainingPlanProgressEntity> state = this.$progress$delegate;
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
        MutableState<String> mutableState3 = mutableState;
        TextKt.m2376Text4IGK_g("Structured template", (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getSemiBold(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleMedium(), composer, 196614, 0, 65502);
        TextKt.m2376Text4IGK_g("Built-in schedules, or save your coach plan above. Mark workouts done as you go.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
        Composer composer2 = composer;
        composer2.startReplaceGroup(-430414778);
        for (final BuiltinTrainingPlans.PlanDefinition planDefinition : BuiltinTrainingPlans.INSTANCE.getAllPlans()) {
            String slug = planDefinition.getSlug();
            TrainingCoachScreen$lambda$11 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$11(mutableState3);
            boolean areEqual = Intrinsics.areEqual(slug, TrainingCoachScreen$lambda$11);
            composer2.startReplaceGroup(-1200994097);
            final MutableState<String> mutableState4 = mutableState3;
            boolean changed = composer2.changed(mutableState4) | composer2.changedInstance(planDefinition);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$6$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$13$lambda$2$lambda$1$lambda$0;
                        invoke$lambda$13$lambda$2$lambda$1$lambda$0 = TrainingCoachScreenKt$TrainingCoachScreen$3$6.invoke$lambda$13$lambda$2$lambda$1$lambda$0(BuiltinTrainingPlans.PlanDefinition.this, mutableState4);
                        return invoke$lambda$13$lambda$2$lambda$1$lambda$0;
                    }
                };
                composer2.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ChipKt.FilterChip(areEqual, (Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(1826702116, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$6$1$1$2
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
                        ComposerKt.traceEventStart(1826702116, i2, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrainingCoachScreen.kt:280)");
                    }
                    TextKt.m2376Text4IGK_g(BuiltinTrainingPlans.PlanDefinition.this.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer2, 54), PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, 0.0f, Dp.m6303constructorimpl(4), 7, null), false, null, null, null, FilterChipDefaults.INSTANCE.m1794filterChipColorsXqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, 0L, 0L, composer, 0, FilterChipDefaults.$stable << 6, 3967), null, null, null, composer, 3456, 0, 3824);
            composer2 = composer;
            mutableState3 = mutableState4;
        }
        final MutableState<String> mutableState5 = mutableState3;
        composer.endReplaceGroup();
        Arrangement.HorizontalOrVertical m564spacedBy0680j_42 = Arrangement.INSTANCE.m564spacedBy0680j_4(Dp.m6303constructorimpl(8));
        Composer composer3 = composer;
        ComposerKt.sourceInformationMarkerStart(composer3, 693286680, "CC(Row)P(2,1,3)99@5018L58,100@5081L130:Row.kt#2w3rfo");
        Modifier.Companion companion = Modifier.INSTANCE;
        MeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(m564spacedBy0680j_42, Alignment.INSTANCE.getTop(), composer3, 6);
        ComposerKt.sourceInformationMarkerStart(composer3, -1323940314, "CC(Layout)P(!1,2)79@3208L23,82@3359L411:Layout.kt#80mrfh");
        int currentCompositeKeyHash2 = ComposablesKt.getCurrentCompositeKeyHash(composer3, 0);
        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier2 = ComposedModifierKt.materializeModifier(composer3, companion);
        Function0<ComposeUiNode> constructor2 = ComposeUiNode.INSTANCE.getConstructor();
        ComposerKt.sourceInformationMarkerStart(composer3, -692256719, "CC(ReusableComposeNode)P(1,2)376@14062L9:Composables.kt#9igjgp");
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer3.createNode(constructor2);
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
        ComposerKt.sourceInformationMarkerStart(composer3, -407840262, "C101@5126L9:Row.kt#2w3rfo");
        RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
        composer3.startReplaceGroup(-1200978238);
        boolean changed2 = composer3.changed(mutableState5);
        Object rememberedValue2 = composer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
            rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$6$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$13$lambda$8$lambda$5$lambda$4;
                    invoke$lambda$13$lambda$8$lambda$5$lambda$4 = TrainingCoachScreenKt$TrainingCoachScreen$3$6.invoke$lambda$13$lambda$8$lambda$5$lambda$4(MutableState.this, mutableState2);
                    return invoke$lambda$13$lambda$8$lambda$5$lambda$4;
                }
            };
            composer3.updateRememberedValue(rememberedValue2);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue2, null, false, null, null, null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6939getLambda5$app_sideload(), composer, 805306368, 510);
        composer3.startReplaceGroup(-1200971351);
        boolean changedInstance = composer3.changedInstance(coroutineScope) | composer3.changedInstance(repository) | composer3.changedInstance(context);
        Object rememberedValue3 = composer.rememberedValue();
        if (changedInstance || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
            rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$6$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$13$lambda$8$lambda$7$lambda$6;
                    invoke$lambda$13$lambda$8$lambda$7$lambda$6 = TrainingCoachScreenKt$TrainingCoachScreen$3$6.invoke$lambda$13$lambda$8$lambda$7$lambda$6(CoroutineScope.this, repository, context);
                    return invoke$lambda$13$lambda$8$lambda$7$lambda$6;
                }
            };
            composer3.updateRememberedValue(rememberedValue3);
        }
        composer.endReplaceGroup();
        Unit unit = null;
        ButtonKt.OutlinedButton((Function0) rememberedValue3, null, false, null, null, null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6940getLambda6$app_sideload(), composer, 805306368, 510);
        ComposerKt.sourceInformationMarkerEnd(composer);
        composer.endNode();
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        ComposerKt.sourceInformationMarkerEnd(composer);
        TrainingCoachScreen$lambda$1 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$1(state);
        if (TrainingCoachScreen$lambda$1 == null || StringsKt.isBlank(TrainingCoachScreen$lambda$1.getPlanSlug())) {
            TrainingCoachScreen$lambda$1 = null;
        }
        composer3.startReplaceGroup(-430367557);
        if (TrainingCoachScreen$lambda$1 != null) {
            final BuiltinTrainingPlans.PlanDefinition plan = BuiltinTrainingPlans.INSTANCE.plan(TrainingCoachScreen$lambda$1.getPlanSlug(), context);
            if (plan != null) {
                composer3.startReplaceGroup(1425336793);
                int coerceIn = RangesKt.coerceIn(TrainingCoachScreen$lambda$1.getNextWorkoutIndex(), 0, plan.getWorkouts().size());
                TextKt.m2376Text4IGK_g(plan.getTitle(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer, 0, 0, 65530);
                if (coerceIn >= plan.getWorkouts().size()) {
                    composer.startReplaceGroup(1425562597);
                    TextKt.m2376Text4IGK_g("Template complete — build a new goal or pick another plan.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131066);
                    composer.endReplaceGroup();
                    composer3 = composer;
                } else {
                    composer.startReplaceGroup(1425759912);
                    BuiltinTrainingPlans.Workout workout = plan.getWorkouts().get(coerceIn);
                    TextKt.m2376Text4IGK_g("Next · " + workout.getWeekLabel(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getPrimary(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getLabelLarge(), composer, 0, 0, 65530);
                    TextKt.m2376Text4IGK_g(workout.getTitle(), (Modifier) null, 0L, 0L, (FontStyle) null, FontWeight.INSTANCE.getMedium(), (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getTitleSmall(), composer, ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE, 0, 65502);
                    TextKt.m2376Text4IGK_g(workout.getDetail(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65530);
                    composer3 = composer;
                    composer3.startReplaceGroup(-1200917134);
                    boolean changedInstance2 = composer3.changedInstance(coroutineScope) | composer3.changedInstance(repository) | composer3.changedInstance(plan) | composer3.changedInstance(context);
                    Object rememberedValue4 = composer.rememberedValue();
                    if (changedInstance2 || rememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        rememberedValue4 = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$6$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10;
                                invoke$lambda$13$lambda$12$lambda$11$lambda$10 = TrainingCoachScreenKt$TrainingCoachScreen$3$6.invoke$lambda$13$lambda$12$lambda$11$lambda$10(CoroutineScope.this, repository, plan, context);
                                return invoke$lambda$13$lambda$12$lambda$11$lambda$10;
                            }
                        };
                        composer3.updateRememberedValue(rememberedValue4);
                    }
                    composer.endReplaceGroup();
                    ButtonKt.Button((Function0) rememberedValue4, null, false, null, null, null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6941getLambda7$app_sideload(), composer, 805306368, 510);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            } else if (Intrinsics.areEqual(TrainingCoachScreen$lambda$1.getPlanSlug(), SavedCoachPlanStore.SLUG)) {
                composer3.startReplaceGroup(1426853561);
                TextKt.m2376Text4IGK_g("Saved coach plan missing — build and save again.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getError(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131066);
                composer.endReplaceGroup();
                composer3 = composer;
            } else {
                composer3 = composer;
                composer3.startReplaceGroup(1426992906);
                composer.endReplaceGroup();
            }
            Unit unit2 = Unit.INSTANCE;
            unit = Unit.INSTANCE;
        }
        composer.endReplaceGroup();
        composer3.startReplaceGroup(-430367678);
        if (unit == null) {
            TextKt.m2376Text4IGK_g("No active template.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer3, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
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
    public static final Unit invoke$lambda$13$lambda$2$lambda$1$lambda$0(BuiltinTrainingPlans.PlanDefinition planDefinition, MutableState mutableState) {
        mutableState.setValue(planDefinition.getSlug());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$8$lambda$5$lambda$4(MutableState mutableState, MutableState mutableState2) {
        String TrainingCoachScreen$lambda$11;
        BuiltinTrainingPlans builtinTrainingPlans = BuiltinTrainingPlans.INSTANCE;
        TrainingCoachScreen$lambda$11 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$11(mutableState);
        BuiltinTrainingPlans.PlanDefinition plan$default = BuiltinTrainingPlans.plan$default(builtinTrainingPlans, TrainingCoachScreen$lambda$11, null, 2, null);
        if (plan$default != null) {
            mutableState2.setValue(plan$default);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$8$lambda$7$lambda$6(CoroutineScope coroutineScope, Repository repository, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new TrainingCoachScreenKt$TrainingCoachScreen$3$6$1$2$2$1$1(repository, context, null), 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$13$lambda$12$lambda$11$lambda$10(CoroutineScope coroutineScope, Repository repository, BuiltinTrainingPlans.PlanDefinition planDefinition, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new TrainingCoachScreenKt$TrainingCoachScreen$3$6$1$3$1$1$1(repository, planDefinition, context, null), 2, null);
        return Unit.INSTANCE;
    }
}
