package com.example.rungps.ui.main;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: SoccerTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SoccerTabContentKt$SoccerTabContent$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<Boolean> $showAdd$delegate;

    SoccerTabContentKt$SoccerTabContent$3(MutableState<Boolean> mutableState) {
        this.$showAdd$delegate = mutableState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        SoccerTabContentKt.SoccerTabContent$lambda$5(mutableState, false);
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
            ComposerKt.traceEventStart(-1943042437, i, -1, "com.example.rungps.ui.main.SoccerTabContent.<anonymous> (SoccerTabContent.kt:172)");
        }
        composer.startReplaceGroup(-1170178984);
        final MutableState<Boolean> mutableState = this.$showAdd$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SoccerTabContentKt$SoccerTabContent$3.invoke$lambda$1$lambda$0(MutableState.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.OutlinedButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7275getLambda2$app_sideload(), composer, 805306374, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
