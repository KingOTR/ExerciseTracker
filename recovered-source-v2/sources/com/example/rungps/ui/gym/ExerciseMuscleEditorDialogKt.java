package com.example.rungps.ui.gym;

import androidx.autofill.HintConstants;
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
import com.example.rungps.recovery.MuscleAnatomyCatalog;
import com.example.rungps.recovery.MuscleHeatmapRegions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExerciseMuscleEditorDialog.kt */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aw\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\t2<\u0010\n\u001a8\u0012\u0019\u0012\u0017\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000e\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011²\u0006\u0010\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\u0007X\u008a\u008e\u0002"}, d2 = {"ExerciseMuscleEditorDialog", "", "exerciseName", "", "currentMuscles", "", "currentUnilateral", "", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function2;", "Lkotlin/ParameterName;", HintConstants.AUTOFILL_HINT_NAME, "orderedMuscles", "isUnilateral", "(Ljava/lang/String;Ljava/util/List;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", "app_sideload", "ordered", "unilateral"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ExerciseMuscleEditorDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ExerciseMuscleEditorDialog$lambda$8(String str, List list, boolean z, Function0 function0, Function2 function2, int i, Composer composer, int i2) {
        ExerciseMuscleEditorDialog(str, list, z, function0, function2, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ExerciseMuscleEditorDialog(final String exerciseName, final List<String> currentMuscles, final boolean z, final Function0<Unit> onDismiss, final Function2<? super List<String>, ? super Boolean, Unit> onSave, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(exerciseName, "exerciseName");
        Intrinsics.checkNotNullParameter(currentMuscles, "currentMuscles");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Composer startRestartGroup = composer.startRestartGroup(1380163566);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(exerciseName) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(currentMuscles) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(onSave) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1380163566, i2, -1, "com.example.rungps.ui.gym.ExerciseMuscleEditorDialog (ExerciseMuscleEditorDialog.kt:33)");
            }
            startRestartGroup.startReplaceGroup(-1043790560);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = CollectionsKt.listOf((Object[]) new String[]{MuscleHeatmapRegions.GLUTES, MuscleHeatmapRegions.ABDUCTORS, MuscleHeatmapRegions.ADDUCTORS, MuscleHeatmapRegions.QUADS, MuscleHeatmapRegions.HAMSTRINGS, MuscleHeatmapRegions.HIP_FLEXORS, MuscleHeatmapRegions.CALVES, MuscleHeatmapRegions.CHEST, MuscleHeatmapRegions.BACK, MuscleHeatmapRegions.SHOULDERS, MuscleHeatmapRegions.BICEPS, MuscleHeatmapRegions.TRICEPS, MuscleHeatmapRegions.LATS, MuscleHeatmapRegions.TRAPS, MuscleHeatmapRegions.LOWER_BACK, MuscleHeatmapRegions.CORE, MuscleHeatmapRegions.FOREARMS});
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            List list = (List) rememberedValue;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1043766369);
            int i3 = i2 & 14;
            boolean changed = (i3 == 4) | startRestartGroup.changed(currentMuscles);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                List<String> list2 = currentMuscles;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(MuscleHeatmapRegions.INSTANCE.regionForUserTag((String) it.next()));
                }
                rememberedValue2 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(CollectionsKt.distinct(arrayList), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            startRestartGroup.endReplaceGroup();
            startRestartGroup.startReplaceGroup(-1043761028);
            boolean z2 = (i3 == 4) | ((i2 & 896) == 256);
            Object rememberedValue3 = startRestartGroup.rememberedValue();
            if (z2 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
                startRestartGroup.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState2 = (MutableState) rememberedValue3;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(985145398, true, new ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$1(mutableState, onSave, mutableState2), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(1652527288, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1652527288, i4, -1, "com.example.rungps.ui.gym.ExerciseMuscleEditorDialog.<anonymous> (ExerciseMuscleEditorDialog.kt:129)");
                    }
                    ButtonKt.OutlinedButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$ExerciseMuscleEditorDialogKt.INSTANCE.m7057getLambda2$app_sideload(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-1975058118, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1975058118, i4, -1, "com.example.rungps.ui.gym.ExerciseMuscleEditorDialog.<anonymous> (ExerciseMuscleEditorDialog.kt:64)");
                    }
                    TextKt.m2376Text4IGK_g("Muscles — " + exerciseName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(506116475, true, new ExerciseMuscleEditorDialogKt$ExerciseMuscleEditorDialog$4(mutableState, mutableState2, list), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 9) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.ExerciseMuscleEditorDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit ExerciseMuscleEditorDialog$lambda$8;
                    ExerciseMuscleEditorDialog$lambda$8 = ExerciseMuscleEditorDialogKt.ExerciseMuscleEditorDialog$lambda$8(exerciseName, currentMuscles, z, onDismiss, onSave, i, (Composer) obj, ((Integer) obj2).intValue());
                    return ExerciseMuscleEditorDialog$lambda$8;
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<String> ExerciseMuscleEditorDialog$lambda$3(MutableState<List<String>> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ExerciseMuscleEditorDialog$lambda$6(MutableState<Boolean> mutableState) {
        return mutableState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void ExerciseMuscleEditorDialog$lambda$7(MutableState<Boolean> mutableState, boolean z) {
        mutableState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ExerciseMuscleEditorDialog$regionLabel(String str) {
        return MuscleAnatomyCatalog.INSTANCE.infoFor(str).getDisplayName();
    }
}
