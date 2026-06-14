package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.IconKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import com.example.rungps.ui.icons.EtIcons;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecordingScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$RecordingScreenKt {
    public static final ComposableSingletons$RecordingScreenKt INSTANCE = new ComposableSingletons$RecordingScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f246lambda1 = ComposableLambdaKt.composableLambdaInstance(1417891021, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(1417891021, i, -1, "com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt.lambda-1.<anonymous> (RecordingScreen.kt:194)");
            }
            IconKt.m1833Iconww6aTOc(EtIcons.INSTANCE.getTimer(), (String) null, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(18)), 0L, composer, 438, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f247lambda2 = ComposableLambdaKt.composableLambdaInstance(131639684, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(131639684, i, -1, "com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt.lambda-2.<anonymous> (RecordingScreen.kt:204)");
            }
            IconKt.m1833Iconww6aTOc(EtIcons.INSTANCE.getSpeed(), (String) null, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(18)), 0L, composer, 438, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f248lambda3 = ComposableLambdaKt.composableLambdaInstance(1175427653, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt$lambda-3$1
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
                ComposerKt.traceEventStart(1175427653, i, -1, "com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt.lambda-3.<anonymous> (RecordingScreen.kt:213)");
            }
            IconKt.m1833Iconww6aTOc(EtIcons.INSTANCE.getDistance(), (String) null, SizeKt.m729size3ABfNKs(Modifier.INSTANCE, Dp.m6303constructorimpl(18)), 0L, composer, 438, 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f249lambda4 = ComposableLambdaKt.composableLambdaInstance(1786543852, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope Button, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(Button, "$this$Button");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1786543852, i, -1, "com.example.rungps.ui.main.ComposableSingletons$RecordingScreenKt.lambda-4.<anonymous> (RecordingScreen.kt:396)");
            }
            IconKt.m1833Iconww6aTOc(EtIcons.INSTANCE.getStop(), "Stop", (Modifier) null, 0L, composer, 54, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7237getLambda1$app_sideload() {
        return f246lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7238getLambda2$app_sideload() {
        return f247lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7239getLambda3$app_sideload() {
        return f248lambda3;
    }

    /* renamed from: getLambda-4$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7240getLambda4$app_sideload() {
        return f249lambda4;
    }
}
