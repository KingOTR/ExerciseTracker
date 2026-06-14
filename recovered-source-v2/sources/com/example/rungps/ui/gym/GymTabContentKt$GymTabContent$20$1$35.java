package com.example.rungps.ui.gym;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.GymSessionEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: GymTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$35 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<GymSessionEntity> $finishTimeDialogSession$delegate;
    final /* synthetic */ GymSessionEntity $openGymSession;
    final /* synthetic */ MutableState<Boolean> $showAutoFinishConfirm$delegate;

    GymTabContentKt$GymTabContent$20$1$35(MutableState<Boolean> mutableState, GymSessionEntity gymSessionEntity, MutableState<GymSessionEntity> mutableState2) {
        this.$showAutoFinishConfirm$delegate = mutableState;
        this.$openGymSession = gymSessionEntity;
        this.$finishTimeDialogSession$delegate = mutableState2;
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
            ComposerKt.traceEventStart(1739244424, i, -1, "com.example.rungps.ui.gym.GymTabContent.<anonymous>.<anonymous>.<anonymous> (GymTabContent.kt:1498)");
        }
        composer.startReplaceGroup(-584105293);
        boolean changed = composer.changed(this.$showAutoFinishConfirm$delegate) | composer.changedInstance(this.$openGymSession);
        final GymSessionEntity gymSessionEntity = this.$openGymSession;
        final MutableState<Boolean> mutableState = this.$showAutoFinishConfirm$delegate;
        final MutableState<GymSessionEntity> mutableState2 = this.$finishTimeDialogSession$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$35$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = GymTabContentKt$GymTabContent$20$1$35.invoke$lambda$1$lambda$0(GymSessionEntity.this, mutableState, mutableState2);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GymTabContentKt.INSTANCE.m7082getLambda13$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(GymSessionEntity gymSessionEntity, MutableState mutableState, MutableState mutableState2) {
        GymTabContentKt$GymTabContent$20.invoke$lambda$264$lambda$111(mutableState, false);
        mutableState2.setValue(gymSessionEntity);
        return Unit.INSTANCE;
    }
}
