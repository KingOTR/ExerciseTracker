package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepEntryEntity;
import com.example.rungps.sleep.SleepMlFeedbackApply;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$29 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<SleepMlFeedbackApply.Kind> $hypnoFeedback$delegate;
    final /* synthetic */ MutableState<SleepEntryEntity> $repairEntry$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showRepairPrompt$delegate;
    final /* synthetic */ MutableState<Boolean> $showWakeMood$delegate;
    final /* synthetic */ MutableState<Boolean> $smartAlarm$delegate;
    final /* synthetic */ MutableState<Boolean> $trackingActive$delegate;
    final /* synthetic */ MutableIntState $wakeMood$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$29(CoroutineScope coroutineScope, Context context, MutableState<Boolean> mutableState, MutableState<SleepMlFeedbackApply.Kind> mutableState2, MutableIntState mutableIntState, MutableState<Boolean> mutableState3, MutableState<SleepEntryEntity> mutableState4, MutableState<Boolean> mutableState5, MutableState<Boolean> mutableState6) {
        this.$scope = coroutineScope;
        this.$ctx = context;
        this.$showWakeMood$delegate = mutableState;
        this.$hypnoFeedback$delegate = mutableState2;
        this.$wakeMood$delegate = mutableIntState;
        this.$smartAlarm$delegate = mutableState3;
        this.$repairEntry$delegate = mutableState4;
        this.$showRepairPrompt$delegate = mutableState5;
        this.$trackingActive$delegate = mutableState6;
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
            ComposerKt.traceEventStart(-144327393, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:1678)");
        }
        composer.startReplaceGroup(-1959945663);
        boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$ctx);
        final CoroutineScope coroutineScope = this.$scope;
        final MutableState<Boolean> mutableState = this.$showWakeMood$delegate;
        final MutableState<SleepMlFeedbackApply.Kind> mutableState2 = this.$hypnoFeedback$delegate;
        final Context context = this.$ctx;
        final MutableIntState mutableIntState = this.$wakeMood$delegate;
        final MutableState<Boolean> mutableState3 = this.$smartAlarm$delegate;
        final MutableState<SleepEntryEntity> mutableState4 = this.$repairEntry$delegate;
        final MutableState<Boolean> mutableState5 = this.$showRepairPrompt$delegate;
        final MutableState<Boolean> mutableState6 = this.$trackingActive$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$29$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SleepTabScreenBodyKt$SleepTabScreenBody$29.invoke$lambda$1$lambda$0(CoroutineScope.this, mutableState, mutableState2, context, mutableIntState, mutableState3, mutableState4, mutableState5, mutableState6);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7531getLambda36$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Context context, MutableIntState mutableIntState, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$127(mutableState, false);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new SleepTabScreenBodyKt$SleepTabScreenBody$29$1$1$1(mutableState2, context, mutableIntState, mutableState3, mutableState4, mutableState5, mutableState6, null), 3, null);
        return Unit.INSTANCE;
    }
}
