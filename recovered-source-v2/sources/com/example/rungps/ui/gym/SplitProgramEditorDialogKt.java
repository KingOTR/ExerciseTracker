package com.example.rungps.ui.gym;

import androidx.compose.material3.AndroidAlertDialog_androidKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymDayTemplateEntity;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SplitProgramEditorDialog.kt */
@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00050\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\u0018\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u0005\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, d2 = {"SplitProgramEditorDialog", "", "splitName", "", "days", "", "Lcom/example/rungps/data/GymDayTemplateEntity;", "exercisesByDay", "", "", "Lcom/example/rungps/data/ExerciseTemplateEntity;", "onDismiss", "Lkotlin/Function0;", "onSave", "Lkotlin/Function1;", "Lcom/example/rungps/ui/gym/SplitExerciseEditRow;", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SplitProgramEditorDialogKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SplitProgramEditorDialog$lambda$6(String str, List list, Map map, Function0 function0, Function1 function1, int i, Composer composer, int i2) {
        SplitProgramEditorDialog(str, list, map, function0, function1, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x00c4, code lost:
    
        if (r7 == androidx.compose.runtime.Composer.INSTANCE.getEmpty()) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SplitProgramEditorDialog(final String splitName, final List<GymDayTemplateEntity> days, final Map<Long, ? extends List<ExerciseTemplateEntity>> exercisesByDay, final Function0<Unit> onDismiss, final Function1<? super List<SplitExerciseEditRow>, Unit> onSave, Composer composer, final int i) {
        Object obj;
        Composer composer2;
        Intrinsics.checkNotNullParameter(splitName, "splitName");
        Intrinsics.checkNotNullParameter(days, "days");
        Intrinsics.checkNotNullParameter(exercisesByDay, "exercisesByDay");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        Intrinsics.checkNotNullParameter(onSave, "onSave");
        Composer startRestartGroup = composer.startRestartGroup(979619393);
        int i2 = (i & 6) == 0 ? (startRestartGroup.changed(splitName) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(days) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changedInstance(exercisesByDay) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onDismiss) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(onSave) ? 16384 : 8192;
        }
        if ((i2 & 9363) != 9362 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(979619393, i2, -1, "com.example.rungps.ui.gym.SplitProgramEditorDialog (SplitProgramEditorDialog.kt:38)");
            }
            startRestartGroup.startReplaceGroup(-470815675);
            boolean changed = ((i2 & 14) == 4) | startRestartGroup.changed(days) | startRestartGroup.changed(exercisesByDay);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (!changed) {
                obj = rememberedValue;
            }
            SnapshotStateList mutableStateListOf = SnapshotStateKt.mutableStateListOf();
            for (GymDayTemplateEntity gymDayTemplateEntity : CollectionsKt.sortedWith(days, new Comparator() { // from class: com.example.rungps.ui.gym.SplitProgramEditorDialogKt$SplitProgramEditorDialog$lambda$5$lambda$4$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Integer.valueOf(((GymDayTemplateEntity) t).getOrderIdx()), Integer.valueOf(((GymDayTemplateEntity) t2).getOrderIdx()));
                }
            })) {
                List<ExerciseTemplateEntity> list = exercisesByDay.get(Long.valueOf(gymDayTemplateEntity.getId()));
                if (list == null) {
                    list = CollectionsKt.emptyList();
                }
                for (ExerciseTemplateEntity exerciseTemplateEntity : CollectionsKt.sortedWith(list, new Comparator() { // from class: com.example.rungps.ui.gym.SplitProgramEditorDialogKt$SplitProgramEditorDialog$lambda$5$lambda$4$lambda$3$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Integer.valueOf(((ExerciseTemplateEntity) t).getOrderIdx()), Integer.valueOf(((ExerciseTemplateEntity) t2).getOrderIdx()));
                    }
                })) {
                    mutableStateListOf.add(new SplitExerciseEditRow(exerciseTemplateEntity.getId(), gymDayTemplateEntity.getDayName(), exerciseTemplateEntity.getName(), String.valueOf(exerciseTemplateEntity.getDefaultSets())));
                }
            }
            startRestartGroup.updateRememberedValue(mutableStateListOf);
            obj = mutableStateListOf;
            SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
            startRestartGroup.endReplaceGroup();
            composer2 = startRestartGroup;
            AndroidAlertDialog_androidKt.m1443AlertDialogOix01E0(onDismiss, ComposableLambdaKt.rememberComposableLambda(2103514761, true, new SplitProgramEditorDialogKt$SplitProgramEditorDialog$1(onSave, snapshotStateList), startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(-744871669, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.SplitProgramEditorDialogKt$SplitProgramEditorDialog$2
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
                        ComposerKt.traceEventStart(-744871669, i3, -1, "com.example.rungps.ui.gym.SplitProgramEditorDialog.<anonymous> (SplitProgramEditorDialog.kt:99)");
                    }
                    ButtonKt.OutlinedButton(onDismiss, null, false, null, null, null, null, null, null, ComposableSingletons$SplitProgramEditorDialogKt.INSTANCE.m7104getLambda2$app_sideload(), composer3, 805306368, 510);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), null, ComposableLambdaKt.rememberComposableLambda(701709197, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.SplitProgramEditorDialogKt$SplitProgramEditorDialog$3
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
                        ComposerKt.traceEventStart(701709197, i3, -1, "com.example.rungps.ui.gym.SplitProgramEditorDialog.<anonymous> (SplitProgramEditorDialog.kt:58)");
                    }
                    TextKt.m2376Text4IGK_g("Edit " + splitName, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer3, 0, 0, 131070);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), ComposableLambdaKt.rememberComposableLambda(1424999630, true, new SplitProgramEditorDialogKt$SplitProgramEditorDialog$4(snapshotStateList), startRestartGroup, 54), null, 0L, 0L, 0L, 0L, 0.0f, null, composer2, ((i2 >> 9) & 14) | 1772592, 0, 16276);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.gym.SplitProgramEditorDialogKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Unit SplitProgramEditorDialog$lambda$6;
                    SplitProgramEditorDialog$lambda$6 = SplitProgramEditorDialogKt.SplitProgramEditorDialog$lambda$6(splitName, days, exercisesByDay, onDismiss, onSave, i, (Composer) obj2, ((Integer) obj3).intValue());
                    return SplitProgramEditorDialog$lambda$6;
                }
            });
        }
    }
}
