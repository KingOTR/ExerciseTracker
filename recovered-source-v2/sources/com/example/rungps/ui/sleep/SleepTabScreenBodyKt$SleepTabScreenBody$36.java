package com.example.rungps.ui.sleep;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepCalendarManualCommitment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$36 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Integer> $manualEventHour$delegate;
    final /* synthetic */ MutableState<Integer> $manualEventMinute$delegate;
    final /* synthetic */ MutableState<String> $manualEventTitle$delegate;
    final /* synthetic */ MutableState<Boolean> $showManualCalendar$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$36(Context context, MutableState<String> mutableState, MutableState<Integer> mutableState2, MutableState<Integer> mutableState3, MutableState<Boolean> mutableState4) {
        this.$ctx = context;
        this.$manualEventTitle$delegate = mutableState;
        this.$manualEventHour$delegate = mutableState2;
        this.$manualEventMinute$delegate = mutableState3;
        this.$showManualCalendar$delegate = mutableState4;
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
            ComposerKt.traceEventStart(1886402019, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:1769)");
        }
        composer.startReplaceGroup(-1959824785);
        boolean changedInstance = composer.changedInstance(this.$ctx) | composer.changed(this.$manualEventTitle$delegate) | composer.changed(this.$manualEventHour$delegate) | composer.changed(this.$manualEventMinute$delegate);
        final Context context = this.$ctx;
        final MutableState<String> mutableState = this.$manualEventTitle$delegate;
        final MutableState<Integer> mutableState2 = this.$manualEventHour$delegate;
        final MutableState<Integer> mutableState3 = this.$manualEventMinute$delegate;
        final MutableState<Boolean> mutableState4 = this.$showManualCalendar$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$36$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SleepTabScreenBodyKt$SleepTabScreenBody$36.invoke$lambda$1$lambda$0(context, mutableState, mutableState2, mutableState3, mutableState4);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7541getLambda45$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4) {
        String SleepTabScreenBody$lambda$133;
        int SleepTabScreenBody$lambda$137;
        int SleepTabScreenBody$lambda$141;
        SleepCalendarManualCommitment sleepCalendarManualCommitment = SleepCalendarManualCommitment.INSTANCE;
        SleepTabScreenBody$lambda$133 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$133(mutableState);
        SleepTabScreenBody$lambda$137 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$137(mutableState2);
        SleepTabScreenBody$lambda$141 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$141(mutableState3);
        SleepCalendarManualCommitment.save$default(sleepCalendarManualCommitment, context, SleepTabScreenBody$lambda$133, SleepTabScreenBody$lambda$137, SleepTabScreenBody$lambda$141, false, 16, null);
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$130(mutableState4, false);
        Toast.makeText(context, "Manual event saved for tomorrow", 0).show();
        return Unit.INSTANCE;
    }
}
