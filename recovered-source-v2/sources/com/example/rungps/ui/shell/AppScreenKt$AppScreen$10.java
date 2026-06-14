package com.example.rungps.ui.shell;

import android.content.Context;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.sleep.SleepCalendarPermissions;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class AppScreenKt$AppScreen$10 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<Boolean> $showCalendarNudge$delegate;

    AppScreenKt$AppScreen$10(MutableState<Boolean> mutableState, Context context) {
        this.$showCalendarNudge$delegate = mutableState;
        this.$ctx = context;
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
            ComposerKt.traceEventStart(1260766246, i, -1, "com.example.rungps.ui.shell.AppScreen.<anonymous> (AppScreen.kt:171)");
        }
        composer.startReplaceGroup(-1032547363);
        boolean changed = composer.changed(this.$showCalendarNudge$delegate) | composer.changedInstance(this.$ctx);
        final Context context = this.$ctx;
        final MutableState<Boolean> mutableState = this.$showCalendarNudge$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.AppScreenKt$AppScreen$10$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = AppScreenKt$AppScreen$10.invoke$lambda$1$lambda$0(context, mutableState);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7456getLambda1$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, MutableState mutableState) {
        AppScreenKt.AppScreen$lambda$48(mutableState, false);
        SleepCalendarPermissions.INSTANCE.launchPermissionRequest(context);
        return Unit.INSTANCE;
    }
}
