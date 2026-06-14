package com.example.rungps.ui.coach;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TrainingCoachScreenKt$TrainingCoachScreen$10 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $confirmSaveCoach$delegate;

    TrainingCoachScreenKt$TrainingCoachScreen$10(MutableState<Boolean> mutableState) {
        this.$confirmSaveCoach$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        TrainingCoachScreenKt.TrainingCoachScreen$lambda$18(mutableState, false);
        return Unit.INSTANCE;
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
            ComposerKt.traceEventStart(1461958543, i, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous> (TrainingCoachScreen.kt:396)");
        }
        composer.startReplaceGroup(837251351);
        final MutableState<Boolean> mutableState = this.$confirmSaveCoach$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$10$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = TrainingCoachScreenKt$TrainingCoachScreen$10.invoke$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$TrainingCoachScreenKt.INSTANCE.m6934getLambda12$app_sideload(), composer, 805306374, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
