package com.example.rungps.ui.shell;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.example.rungps.notify.InAppAlerts;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-6$1, reason: invalid class name */
/* loaded from: classes3.dex */
final class ComposableSingletons$AppScreenKt$lambda6$1 implements Function2<Composer, Integer, Unit> {
    public static final ComposableSingletons$AppScreenKt$lambda6$1 INSTANCE = new ComposableSingletons$AppScreenKt$lambda6$1();

    ComposableSingletons$AppScreenKt$lambda6$1() {
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0() {
        InAppAlerts.INSTANCE.clearPr();
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1911921851, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-6.<anonymous> (AppScreen.kt:198)");
        }
        composer.startReplaceGroup(1752619317);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-6$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = ComposableSingletons$AppScreenKt$lambda6$1.invoke$lambda$1$lambda$0();
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$AppScreenKt.INSTANCE.m7474getLambda5$app_sideload(), composer, 805306374, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
