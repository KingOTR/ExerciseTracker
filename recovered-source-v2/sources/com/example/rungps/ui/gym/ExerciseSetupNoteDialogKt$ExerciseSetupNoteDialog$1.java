package com.example.rungps.ui.gym;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* compiled from: ExerciseSetupNoteDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $note$delegate;
    final /* synthetic */ Function1<String, Unit> $onSave;

    /* JADX WARN: Multi-variable type inference failed */
    ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$1(Function1<? super String, Unit> function1, MutableState<String> mutableState) {
        this.$onSave = function1;
        this.$note$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, MutableState mutableState) {
        String ExerciseSetupNoteDialog$lambda$1;
        ExerciseSetupNoteDialog$lambda$1 = ExerciseSetupNoteDialogKt.ExerciseSetupNoteDialog$lambda$1(mutableState);
        function1.invoke(StringsKt.trim((CharSequence) ExerciseSetupNoteDialog$lambda$1).toString());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2089861328, i, -1, "com.example.rungps.ui.gym.ExerciseSetupNoteDialog.<anonymous> (ExerciseSetupNoteDialog.kt:47)");
        }
        composer.startReplaceGroup(843241030);
        boolean changed = composer.changed(this.$onSave) | composer.changed(this.$note$delegate);
        final Function1<String, Unit> function1 = this.$onSave;
        final MutableState<String> mutableState = this.$note$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$1.invoke$lambda$1$lambda$0(Function1.this, mutableState);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$ExerciseSetupNoteDialogKt.INSTANCE.m7059getLambda1$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
