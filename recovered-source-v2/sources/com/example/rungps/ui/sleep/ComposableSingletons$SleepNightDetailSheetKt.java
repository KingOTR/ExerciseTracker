package com.example.rungps.ui.sleep;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepNightDetailSheet.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$SleepNightDetailSheetKt {
    public static final ComposableSingletons$SleepNightDetailSheetKt INSTANCE = new ComposableSingletons$SleepNightDetailSheetKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<LazyItemScope, Composer, Integer, Unit> f357lambda1 = ComposableLambdaKt.composableLambdaInstance(-1496537659, false, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
            invoke(lazyItemScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(LazyItemScope item, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(item, "$this$item");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1496537659, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-1.<anonymous> (SleepNightDetailSheet.kt:266)");
                }
                TextKt.m2376Text4IGK_g("No stage timeline for this night. Re-import from Sleep Cycle or run overnight tracking.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1588getOnSurfaceVariant0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f358lambda2 = ComposableLambdaKt.composableLambdaInstance(-1578187116, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1578187116, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-2.<anonymous> (SleepNightDetailSheet.kt:334)");
            }
            TextKt.m2376Text4IGK_g("Play", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f359lambda3 = ComposableLambdaKt.composableLambdaInstance(-1834340803, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1834340803, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-3.<anonymous> (SleepNightDetailSheet.kt:352)");
            }
            TextKt.m2376Text4IGK_g("Delete", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f360lambda4 = ComposableLambdaKt.composableLambdaInstance(435341791, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(435341791, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-4.<anonymous> (SleepNightDetailSheet.kt:372)");
            }
            TextKt.m2376Text4IGK_g("Edit wake time", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f361lambda5 = ComposableLambdaKt.composableLambdaInstance(442023757, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-5$1
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
                ComposerKt.traceEventStart(442023757, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-5.<anonymous> (SleepNightDetailSheet.kt:384)");
            }
            TextKt.m2376Text4IGK_g("Wake time", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f362lambda6 = ComposableLambdaKt.composableLambdaInstance(1695576339, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-6$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1695576339, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-6.<anonymous> (SleepNightDetailSheet.kt:399)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f363lambda7 = ComposableLambdaKt.composableLambdaInstance(1909244373, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-7$1
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
                ComposerKt.traceEventStart(1909244373, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-7.<anonymous> (SleepNightDetailSheet.kt:426)");
            }
            TextKt.m2376Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f364lambda8 = ComposableLambdaKt.composableLambdaInstance(2069556537, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt$lambda-8$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope TextButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TextButton, "$this$TextButton");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2069556537, i, -1, "com.example.rungps.ui.sleep.ComposableSingletons$SleepNightDetailSheetKt.lambda-8.<anonymous> (SleepNightDetailSheet.kt:439)");
            }
            TextKt.m2376Text4IGK_g("Delete night", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function3<LazyItemScope, Composer, Integer, Unit> m7494getLambda1$app_sideload() {
        return f357lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7495getLambda2$app_sideload() {
        return f358lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7496getLambda3$app_sideload() {
        return f359lambda3;
    }

    /* renamed from: getLambda-4$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7497getLambda4$app_sideload() {
        return f360lambda4;
    }

    /* renamed from: getLambda-5$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7498getLambda5$app_sideload() {
        return f361lambda5;
    }

    /* renamed from: getLambda-6$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7499getLambda6$app_sideload() {
        return f362lambda6;
    }

    /* renamed from: getLambda-7$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7500getLambda7$app_sideload() {
        return f363lambda7;
    }

    /* renamed from: getLambda-8$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7501getLambda8$app_sideload() {
        return f364lambda8;
    }
}
