package com.example.rungps.ui.gym;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: ExerciseMuscleEditorDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Function2<List<String>, Boolean, Unit> $onSave;
    final /* synthetic */ MutableState<List<String>> $ordered$delegate;
    final /* synthetic */ MutableState<Boolean> $unilateral$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$1(MutableState<List<String>> mutableState, Function2<? super List<String>, ? super Boolean, Unit> function2, MutableState<Boolean> mutableState2) {
        this.$ordered$delegate = mutableState;
        this.$onSave = function2;
        this.$unilateral$delegate = mutableState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        List ExerciseMuscleEditorDialog$lambda$3;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(985145398, i, -1, "com.example.rungps.ui.gym.ExerciseMuscleEditorDialog.<anonymous> (ExerciseMuscleEditorDialog.kt:119)");
            }
            composer.startReplaceGroup(-1490996495);
            boolean changed = composer.changed(this.$ordered$delegate) | composer.changed(this.$onSave) | composer.changed(this.$unilateral$delegate);
            final Function2<List<String>, Boolean, Unit> function2 = this.$onSave;
            final MutableState<List<String>> mutableState = this.$ordered$delegate;
            final MutableState<Boolean> mutableState2 = this.$unilateral$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$2$lambda$1;
                        invoke$lambda$2$lambda$1 = ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$1.invoke$lambda$2$lambda$1(Function2.this, mutableState, mutableState2);
                        return invoke$lambda$2$lambda$1;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ExerciseMuscleEditorDialog$lambda$3 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(this.$ordered$delegate);
            ButtonKt.Button((Function0) rememberedValue, null, !ExerciseMuscleEditorDialog$lambda$3.isEmpty(), null, null, null, null, null, null, ComposableSingletons$ExerciseMuscleEditorDialogKt.INSTANCE.m7056getLambda1$app_sideload(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Function2 function2, MutableState mutableState, MutableState mutableState2) {
        List ExerciseMuscleEditorDialog$lambda$3;
        List ExerciseMuscleEditorDialog$lambda$32;
        boolean ExerciseMuscleEditorDialog$lambda$6;
        String ExerciseMuscleEditorDialog$regionLabel;
        ExerciseMuscleEditorDialog$lambda$3 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState);
        if (!ExerciseMuscleEditorDialog$lambda$3.isEmpty()) {
            ExerciseMuscleEditorDialog$lambda$32 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$3(mutableState);
            List list = ExerciseMuscleEditorDialog$lambda$32;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ExerciseMuscleEditorDialog$regionLabel = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$regionLabel((String) it.next());
                arrayList.add(ExerciseMuscleEditorDialog$regionLabel);
            }
            ExerciseMuscleEditorDialog$lambda$6 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$6(mutableState2);
            function2.invoke(arrayList, Boolean.valueOf(ExerciseMuscleEditorDialog$lambda$6));
        }
        return Unit.INSTANCE;
    }
}
