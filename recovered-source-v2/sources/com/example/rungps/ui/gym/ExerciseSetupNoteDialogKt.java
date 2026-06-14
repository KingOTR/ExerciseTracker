package com.example.rungps.ui.gym;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseSetupNoteDialog.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\bH\u0007¢\u0006\u0002\u0010\t¨\u0006\n²\u0006\n\u0010\u000b\u001a\u00020\u0003X\u008a\u008e\u0002"}, d2 = {"ExerciseSetupNoteDialog", "", "exerciseName", "", "initialNote", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "note"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseSetupNoteDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExerciseSetupNoteDialog$lambda$3(String str, String str2, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        ExerciseSetupNoteDialog(str, str2, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ExerciseSetupNoteDialog(final String exerciseName, final String str, final Function0<Unit> onDismiss, final Function1<? super String, Unit> onSave, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Composer startRestartGroup = composer.startRestartGroup(-1103981848);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(exerciseName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onSave) ? 2048 : 1024;
        }
        if ((i2 & 1171) != 1170 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1103981848, i2, -1, "com.example.rungps.ui.gym.ExerciseSetupNoteDialog (ExerciseSetupNoteDialog.kt:25)");
            }
            startRestartGroup.startReplaceGroup(661490576);
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (z || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(str == null ? "" : str, null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(-2089861328, true, new ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$1(onSave, mutableState), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-158735694, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-158735694, i3, -1, "com.example.rungps.ui.gym.ExerciseSetupNoteDialog.<anonymous> (ExerciseSetupNoteDialog.kt:50)");
                    }
                    ButtonKt.OutlinedButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ExerciseSetupNoteDialogKt.INSTANCE.m7060getLambda2$app_sideload(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(1772389940, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i3) {
                    if ((i3 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1772389940, i3, -1, "com.example.rungps.ui.gym.ExerciseSetupNoteDialog.<anonymous> (ExerciseSetupNoteDialog.kt:29)");
                    }
                    TextKt.m2376Text4IGK_g("Setup — " + exerciseName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(-1557014539, true, new ExerciseSetupNoteDialogKt$ExerciseSetupNoteDialog$4(mutableState), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 6) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.ExerciseSetupNoteDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExerciseSetupNoteDialog$lambda$3;
                    ExerciseSetupNoteDialog$lambda$3 = ExerciseSetupNoteDialogKt.ExerciseSetupNoteDialog$lambda$3(exerciseName, str, onDismiss, onSave, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExerciseSetupNoteDialog$lambda$3;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ExerciseSetupNoteDialog$lambda$1(MutableState<String> mutableState) {
        return mutableState.getValue();
    }
}
