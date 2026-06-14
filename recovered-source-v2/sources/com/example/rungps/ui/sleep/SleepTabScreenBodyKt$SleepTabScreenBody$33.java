package com.example.rungps.ui.sleep;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepEntryEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$33 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<SleepEntryEntity> $repairEntry$delegate;
    final /* synthetic */ MutableState<Boolean> $showRepairPrompt$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$33(MutableState<Boolean> mutableState, MutableState<SleepEntryEntity> mutableState2) {
        this.$showRepairPrompt$delegate = mutableState;
        this.$repairEntry$delegate = mutableState2;
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
            ComposerKt.traceEventStart(656208160, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:1723)");
        }
        composer.startReplaceGroup(-1959890395);
        final MutableState<Boolean> mutableState = this.$showRepairPrompt$delegate;
        final MutableState<SleepEntryEntity> mutableState2 = this.$repairEntry$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$33$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SleepTabScreenBodyKt$SleepTabScreenBody$33.invoke$lambda$1$lambda$0(MutableState.this, mutableState2);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7539getLambda43$app_sideload(), composer, 805306374, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, MutableState mutableState2) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$151(mutableState, false);
        mutableState2.setValue(null);
        return Unit.INSTANCE;
    }
}
