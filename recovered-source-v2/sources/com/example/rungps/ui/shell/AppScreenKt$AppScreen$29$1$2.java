package com.example.rungps.ui.shell;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$29$1$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ NavHostController $navController;
    final /* synthetic */ MutableState<Boolean> $showMoreSheet$delegate;

    AppScreenKt$AppScreen$29$1$2(NavHostController navHostController, MutableState<Boolean> mutableState) {
        this.$navController = navHostController;
        this.$showMoreSheet$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1343972664, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous>.<anonymous>.<anonymous> (AppScreen.kt:348)");
            }
            NavHostController navHostController = this.$navController;
            composer.startReplaceGroup(-408877688);
            boolean changed = composer.changed(this.$showMoreSheet$delegate);
            final MutableState<Boolean> mutableState = this.$showMoreSheet$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$29$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$29$1$2.invoke$lambda$1$lambda$0(MutableState.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ExerciseTrackerBottomBarKt.ExerciseTrackerBottomBar(navHostController, (Function0) rememberedValue, null, composer, 0, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState) {
        AppScreenKt.AppScreen$lambda$18(mutableState, true);
        return Unit.INSTANCE;
    }
}
