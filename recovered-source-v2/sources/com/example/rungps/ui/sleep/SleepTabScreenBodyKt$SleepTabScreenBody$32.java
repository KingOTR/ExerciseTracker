package com.example.rungps.ui.sleep;

import android.content.Context;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.SleepEntryEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$32 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ SleepEntryEntity $entry;
    final /* synthetic */ MutableState<SleepEntryEntity> $repairEntry$delegate;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showRepairPrompt$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$32(SleepEntryEntity sleepEntryEntity, CoroutineScope coroutineScope, Context context, MutableState<Boolean> mutableState, MutableState<SleepEntryEntity> mutableState2) {
        this.$entry = sleepEntryEntity;
        this.$scope = coroutineScope;
        this.$ctx = context;
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
            ComposerKt.traceEventStart(1085866466, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:1708)");
        }
        composer.startReplaceGroup(-1959911282);
        boolean changedInstance = composer.changedInstance(this.$entry) | composer.changedInstance(this.$scope) | composer.changedInstance(this.$ctx);
        final SleepEntryEntity sleepEntryEntity = this.$entry;
        final CoroutineScope coroutineScope = this.$scope;
        final MutableState<Boolean> mutableState = this.$showRepairPrompt$delegate;
        final MutableState<SleepEntryEntity> mutableState2 = this.$repairEntry$delegate;
        final Context context = this.$ctx;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$32$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SleepTabScreenBodyKt$SleepTabScreenBody$32.invoke$lambda$1$lambda$0(SleepEntryEntity.this, coroutineScope, mutableState, mutableState2, context);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7538getLambda42$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SleepEntryEntity sleepEntryEntity, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Context context) {
        SleepTabScreenBodyKt.SleepTabScreenBody$lambda$151(mutableState, false);
        mutableState2.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SleepTabScreenBodyKt$SleepTabScreenBody$32$1$1$1(context, sleepEntryEntity, null), 2, null);
        return Unit.INSTANCE;
    }
}
