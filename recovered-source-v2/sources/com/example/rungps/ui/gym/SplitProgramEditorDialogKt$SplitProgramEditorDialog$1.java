package com.example.rungps.ui.gym;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: SplitProgramEditorDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SplitProgramEditorDialogKt$SplitProgramEditorDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function1<List<SplitExerciseEditRow>, Unit> $onSave;
    final /* synthetic */ SnapshotStateList<SplitExerciseEditRow> $rows;

    /* JADX WARN: Multi-variable type inference failed */
    SplitProgramEditorDialogKt$SplitProgramEditorDialog$1(Function1<? super List<SplitExerciseEditRow>, Unit> function1, SnapshotStateList<SplitExerciseEditRow> snapshotStateList) {
        this.$onSave = function1;
        this.$rows = snapshotStateList;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, SnapshotStateList snapshotStateList) {
        function1.invoke(snapshotStateList.toList());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2103514761, i, -1, "com.example.rungps.ui.gym.SplitProgramEditorDialog.<anonymous> (SplitProgramEditorDialog.kt:96)");
        }
        composer.startReplaceGroup(1615956966);
        boolean changed = composer.changed(this.$onSave) | composer.changed(this.$rows);
        final Function1<List<SplitExerciseEditRow>, Unit> function1 = this.$onSave;
        final SnapshotStateList<SplitExerciseEditRow> snapshotStateList = this.$rows;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.SplitProgramEditorDialogKt$SplitProgramEditorDialog$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SplitProgramEditorDialogKt$SplitProgramEditorDialog$1.invoke$lambda$1$lambda$0(Function1.this, snapshotStateList);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SplitProgramEditorDialogKt.INSTANCE.m7103getLambda1$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
