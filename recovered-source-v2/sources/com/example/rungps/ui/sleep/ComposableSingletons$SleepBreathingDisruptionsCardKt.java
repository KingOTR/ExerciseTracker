package com.example.rungps.ui.sleep;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: SleepBreathingDisruptionsCard.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SleepBreathingDisruptionsCardKt {
    public static final ComposableSingletons$SleepBreathingDisruptionsCardKt INSTANCE = new ComposableSingletons$SleepBreathingDisruptionsCardKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f350lambda1 = ComposableLambdaKt.composableLambdaInstance(-1356181641, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepBreathingDisruptionsCardKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1356181641, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepBreathingDisruptionsCardKt.lambda-1.<anonymous> (SleepBreathingDisruptionsCard.kt:307)");
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7487getLambda1$app_sideload() {
        return f350lambda1;
    }
}
