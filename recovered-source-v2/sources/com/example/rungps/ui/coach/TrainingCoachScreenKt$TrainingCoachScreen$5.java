package com.example.rungps.ui.coach;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import com.example.rungps.training.BuiltinTrainingPlans;
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
final class TrainingCoachScreenKt$TrainingCoachScreen$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<BuiltinTrainingPlans.PlanDefinition> $confirmStart$delegate;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ BuiltinTrainingPlans.PlanDefinition $pending;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ ZoneId $zone;

    TrainingCoachScreenKt$TrainingCoachScreen$5(BuiltinTrainingPlans.PlanDefinition planDefinition, CoroutineScope coroutineScope, Repository repository, ZoneId zoneId, Context context, MutableState<BuiltinTrainingPlans.PlanDefinition> mutableState) {
        this.$pending = planDefinition;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$zone = zoneId;
        this.$ctx = context;
        this.$confirmStart$delegate = mutableState;
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
            ComposerKt.traceEventStart(1521028826, i, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous> (TrainingCoachScreen.kt:349)");
        }
        composer.startReplaceGroup(837183335);
        boolean changedInstance = composer.changedInstance(this.$pending) | composer.changedInstance(this.$scope) | composer.changedInstance(this.$repo) | composer.changedInstance(this.$zone) | composer.changedInstance(this.$ctx);
        final BuiltinTrainingPlans.PlanDefinition planDefinition = this.$pending;
        final CoroutineScope coroutineScope = this.$scope;
        final Context context = this.$ctx;
        final MutableState<BuiltinTrainingPlans.PlanDefinition> mutableState = this.$confirmStart$delegate;
        final Repository repository = this.$repo;
        final ZoneId zoneId = this.$zone;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TrainingCoachScreenKt$TrainingCoachScreen$5.invoke$lambda$1$lambda$0(BuiltinTrainingPlans.PlanDefinition.this, coroutineScope, context, mutableState, repository, zoneId);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6942getLambda8$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(BuiltinTrainingPlans.PlanDefinition planDefinition, CoroutineScope coroutineScope, Context context, MutableState mutableState, Repository repository, ZoneId zoneId) {
        mutableState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new TrainingCoachScreenKt$TrainingCoachScreen$5$1$1$1(repository, planDefinition, zoneId, null), 2, null);
        Toast.makeText(context, "Started", 0).show();
        return Unit.INSTANCE;
    }
}
