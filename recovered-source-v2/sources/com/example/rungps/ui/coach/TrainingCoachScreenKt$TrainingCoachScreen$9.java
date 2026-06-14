package com.example.rungps.ui.coach;

import android.content.Context;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.training.GoalPromptParser;
import com.example.rungps.training.RunningGoalCoach;
import com.example.rungps.training.SavedCoachPlanStore;
import java.time.ZoneId;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TrainingCoachScreenKt$TrainingCoachScreen$9 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ RunningGoalCoach.CoachPlan $coachPlanToSave;
    final /* synthetic */ MutableState<Boolean> $confirmSaveCoach$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $goalText$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ZoneId $zone;

    TrainingCoachScreenKt$TrainingCoachScreen$9(MutableState<String> mutableState, RunningGoalCoach.CoachPlan coachPlan, CoroutineScope coroutineScope, Context context, Repository repository, ZoneId zoneId, MutableState<Boolean> mutableState2) {
        this.$goalText$delegate = mutableState;
        this.$coachPlanToSave = coachPlan;
        this.$scope = coroutineScope;
        this.$ctx = context;
        this.$repo = repository;
        this.$zone = zoneId;
        this.$confirmSaveCoach$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2046730193, i, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous> (TrainingCoachScreen.kt:379)");
        }
        composer.startReplaceGroup(837223853);
        boolean changed = composer.changed(this.$goalText$delegate) | composer.changedInstance(this.$coachPlanToSave) | composer.changedInstance(this.$scope) | composer.changedInstance(this.$ctx) | composer.changedInstance(this.$repo) | composer.changedInstance(this.$zone);
        final RunningGoalCoach.CoachPlan coachPlan = this.$coachPlanToSave;
        final CoroutineScope coroutineScope = this.$scope;
        final MutableState<Boolean> mutableState = this.$confirmSaveCoach$delegate;
        final MutableState<String> mutableState2 = this.$goalText$delegate;
        final Context context = this.$ctx;
        final Repository repository = this.$repo;
        final ZoneId zoneId = this.$zone;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$9$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TrainingCoachScreenKt$TrainingCoachScreen$9.invoke$lambda$1$lambda$0(RunningGoalCoach.CoachPlan.this, coroutineScope, mutableState, mutableState2, context, repository, zoneId);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6933getLambda11$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(RunningGoalCoach.CoachPlan coachPlan, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Context context, Repository repository, ZoneId zoneId) {
        String TrainingCoachScreen$lambda$4;
        TrainingCoachScreenKt.TrainingCoachScreen$lambda$18(mutableState, false);
        GoalPromptParser goalPromptParser = GoalPromptParser.INSTANCE;
        TrainingCoachScreen$lambda$4 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$4(mutableState2);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new TrainingCoachScreenKt$TrainingCoachScreen$9$1$1$1(context, SavedCoachPlanStore.INSTANCE.fromCoachPlan(coachPlan, goalPromptParser.parse(TrainingCoachScreen$lambda$4)), repository, zoneId, null), 2, null);
        return Unit.INSTANCE;
    }
}
