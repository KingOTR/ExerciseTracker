package com.example.rungps.ui.nfc;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: GymNfcConfirmDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymNfcConfirmDialogKt$GymNfcConfirmDialog$5 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ int $confirmSeq;
    final /* synthetic */ Function0<Unit> $onClearPrompt;
    final /* synthetic */ Function1<Integer, Unit> $onHandledSeq;

    /* JADX WARN: Multi-variable type inference failed */
    GymNfcConfirmDialogKt$GymNfcConfirmDialog$5(Function1<? super Integer, Unit> function1, int i, Function0<Unit> function0) {
        this.$onHandledSeq = function1;
        this.$confirmSeq = i;
        this.$onClearPrompt = function0;
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
            ComposerKt.traceEventStart(1400998155, i, -1, "com.example.rungps.ui.nfc.GymNfcConfirmDialog.<anonymous> (GymNfcConfirmDialog.kt:80)");
        }
        composer.startReplaceGroup(-1734092272);
        boolean changed = composer.changed(this.$onHandledSeq) | composer.changed(this.$confirmSeq) | composer.changed(this.$onClearPrompt);
        final Function1<Integer, Unit> function1 = this.$onHandledSeq;
        final int i2 = this.$confirmSeq;
        final Function0<Unit> function0 = this.$onClearPrompt;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.nfc.GymNfcConfirmDialogKt$GymNfcConfirmDialog$5$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = GymNfcConfirmDialogKt$GymNfcConfirmDialog$5.invoke$lambda$1$lambda$0(Function1.this, i2, function0);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.TextButton((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GymNfcConfirmDialogKt.INSTANCE.m7378getLambda1$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, int i, Function0 function0) {
        function1.invoke(Integer.valueOf(i));
        function0.invoke();
        return Unit.INSTANCE;
    }
}
