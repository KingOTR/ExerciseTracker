package com.example.rungps.ui.components;

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

/* compiled from: ScrollSafeAlarmTimePicker.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ScrollSafeAlarmTimePickerKt {
    public static final ComposableSingletons$ScrollSafeAlarmTimePickerKt INSTANCE = new ComposableSingletons$ScrollSafeAlarmTimePickerKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f92lambda1 = ComposableLambdaKt.composableLambdaInstance(331076552, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.ComposableSingletons$ScrollSafeAlarmTimePickerKt$lambda-1$1
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
                ComposerKt.traceEventStart(331076552, i, -1, "com.example.rungps.ui.components.ComposableSingletons$ScrollSafeAlarmTimePickerKt.lambda-1.<anonymous> (ScrollSafeAlarmTimePicker.kt:95)");
            }
            TextKt.m2376Text4IGK_g("▲", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f93lambda2 = ComposableLambdaKt.composableLambdaInstance(-975929281, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.components.ComposableSingletons$ScrollSafeAlarmTimePickerKt$lambda-2$1
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
                ComposerKt.traceEventStart(-975929281, i, -1, "com.example.rungps.ui.components.ComposableSingletons$ScrollSafeAlarmTimePickerKt.lambda-2.<anonymous> (ScrollSafeAlarmTimePicker.kt:101)");
            }
            TextKt.m2376Text4IGK_g("▼", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6957getLambda1$app_sideload() {
        return f92lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m6958getLambda2$app_sideload() {
        return f93lambda2;
    }
}
