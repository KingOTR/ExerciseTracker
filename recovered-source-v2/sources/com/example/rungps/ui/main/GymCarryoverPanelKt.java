package com.example.rungps.ui.main;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import com.example.rungps.data.ExerciseTemplateEntity;
import com.example.rungps.data.GymCarryoverEntity;
import com.example.rungps.data.Repository;
import com.example.rungps.ui.components.TabUiKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GymCarryoverPanel.kt */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aU\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"GymCarryoverPanel", "", "items", "", "Lcom/example/rungps/data/GymCarryoverEntity;", "activeDayExercises", "Lcom/example/rungps/data/ExerciseTemplateEntity;", "carryoverMode", "", "onModeChange", "Lkotlin/Function1;", "repo", "Lcom/example/rungps/data/Repository;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lcom/example/rungps/data/Repository;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GymCarryoverPanelKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GymCarryoverPanel$lambda$0(List list, List list2, String str, Function1 function1, Repository repository, CoroutineScope coroutineScope, int i, Composer composer, int i2) {
        GymCarryoverPanel(list, list2, str, function1, repository, coroutineScope, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void GymCarryoverPanel(final List<GymCarryoverEntity> items, final List<ExerciseTemplateEntity> activeDayExercises, final String carryoverMode, final Function1<? super String, Unit> onModeChange, final Repository repo, final CoroutineScope scope, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(activeDayExercises, "activeDayExercises");
        Intrinsics.checkNotNullParameter(carryoverMode, "carryoverMode");
        Intrinsics.checkNotNullParameter(onModeChange, "onModeChange");
        Intrinsics.checkNotNullParameter(repo, "repo");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Composer startRestartGroup = composer.startRestartGroup(-1843799945);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changedInstance(items) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(activeDayExercises) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= startRestartGroup.changed(carryoverMode) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= startRestartGroup.changedInstance(onModeChange) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= startRestartGroup.changedInstance(repo) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= startRestartGroup.changedInstance(scope) ? 131072 : 65536;
        }
        if ((74899 & i2) != 74898 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1843799945, i2, -1, "com.example.rungps.ui.main.GymCarryoverPanel (GymCarryoverPanel.kt:33)");
            }
            TabUiKt.TabSectionCard("Carryover from last session", null, ComposableLambdaKt.rememberComposableLambda(-1337754248, true, new GymCarryoverPanelKt$GymCarryoverPanel$1(items, carryoverMode, onModeChange, activeDayExercises, scope, repo), startRestartGroup, 54), startRestartGroup, 390, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.GymCarryoverPanelKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit GymCarryoverPanel$lambda$0;
                    GymCarryoverPanel$lambda$0 = GymCarryoverPanelKt.GymCarryoverPanel$lambda$0(items, activeDayExercises, carryoverMode, onModeChange, repo, scope, i, (Composer) obj, ((Integer) obj2).intValue());
                    return GymCarryoverPanel$lambda$0;
                }
            });
        }
    }
}
