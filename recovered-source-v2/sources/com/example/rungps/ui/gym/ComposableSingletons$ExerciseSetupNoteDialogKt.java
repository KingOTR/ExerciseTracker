package com.example.rungps.ui.gym;

import androidx.compose.foundation.layout.RowScope;
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

/* compiled from: ExerciseSetupNoteDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ExerciseSetupNoteDialogKt {
    public static final ComposableSingletons$ExerciseSetupNoteDialogKt INSTANCE = new ComposableSingletons$ExerciseSetupNoteDialogKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f123lambda1 = ComposableLambdaKt.composableLambdaInstance(-1306464480, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ComposableSingletons$ExerciseSetupNoteDialogKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1306464480, i, -1, "com.example.rungps.ui.gym.ComposableSingletons$ExerciseSetupNoteDialogKt.lambda-1.<anonymous> (ExerciseSetupNoteDialog.kt:47)");
            }
            TextKt.m2376Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f124lambda2 = ComposableLambdaKt.composableLambdaInstance(-1903117020, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ComposableSingletons$ExerciseSetupNoteDialogKt$lambda-2$1
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
                ComposerKt.traceEventStart(-1903117020, i, -1, "com.example.rungps.ui.gym.ComposableSingletons$ExerciseSetupNoteDialogKt.lambda-2.<anonymous> (ExerciseSetupNoteDialog.kt:50)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f125lambda3 = ComposableLambdaKt.composableLambdaInstance(-1135547996, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.ComposableSingletons$ExerciseSetupNoteDialogKt$lambda-3$1
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
                ComposerKt.traceEventStart(-1135547996, i, -1, "com.example.rungps.ui.gym.ComposableSingletons$ExerciseSetupNoteDialogKt.lambda-3.<anonymous> (ExerciseSetupNoteDialog.kt:41)");
            }
            TextKt.m2376Text4IGK_g("e.g. Seat 4, rope, elbows tucked", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7059getLambda1$app_sideload() {
        return f123lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7060getLambda2$app_sideload() {
        return f124lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7061getLambda3$app_sideload() {
        return f125lambda3;
    }
}
