package com.example.rungps.ui.diagnostics;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.RowScope;
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
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiagnosticsScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$DiagnosticsScreenKt {
    public static final ComposableSingletons$DiagnosticsScreenKt INSTANCE = new ComposableSingletons$DiagnosticsScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f94lambda1 = ComposableLambdaKt.composableLambdaInstance(-1826628450, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1826628450, i, -1, "com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt.lambda-1.<anonymous> (DiagnosticsScreen.kt:63)");
            }
            TextKt.m2376Text4IGK_g("Refresh home widgets", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f95lambda2 = ComposableLambdaKt.composableLambdaInstance(2084503397, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt$lambda-2$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2084503397, i, -1, "com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt.lambda-2.<anonymous> (DiagnosticsScreen.kt:68)");
                }
                TextKt.m2376Text4IGK_g("Register your membership tag under Gym → NFC.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1588getOnSurfaceVariant0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodyMedium(), composer, 6, 0, 65530);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f96lambda3 = ComposableLambdaKt.composableLambdaInstance(1381907558, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt$lambda-3$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1381907558, i, -1, "com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt.lambda-3.<anonymous> (DiagnosticsScreen.kt:76)");
            }
            SyncHealthPanelKt.SyncHealthPanel(null, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f97lambda4 = ComposableLambdaKt.composableLambdaInstance(1706850647, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt$lambda-4$1
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
                ComposerKt.traceEventStart(1706850647, i, -1, "com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt.lambda-4.<anonymous> (DiagnosticsScreen.kt:108)");
            }
            TextKt.m2376Text4IGK_g("Export diagnostics ZIP", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f98lambda5 = ComposableLambdaKt.composableLambdaInstance(2094926588, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt$lambda-5$1
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
                ComposerKt.traceEventStart(2094926588, i, -1, "com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt.lambda-5.<anonymous> (DiagnosticsScreen.kt:127)");
            }
            TextKt.m2376Text4IGK_g("Copy crash details", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f99lambda6 = ComposableLambdaKt.composableLambdaInstance(1599564158, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt$lambda-6$1
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
                ComposerKt.traceEventStart(1599564158, i, -1, "com.example.rungps.ui.diagnostics.ComposableSingletons$DiagnosticsScreenKt.lambda-6.<anonymous> (DiagnosticsScreen.kt:133)");
            }
            TextKt.m2376Text4IGK_g("Clear crash log", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7009getLambda1$app_sideload() {
        return f94lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7010getLambda2$app_sideload() {
        return f95lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7011getLambda3$app_sideload() {
        return f96lambda3;
    }

    /* renamed from: getLambda-4$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7012getLambda4$app_sideload() {
        return f97lambda4;
    }

    /* renamed from: getLambda-5$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7013getLambda5$app_sideload() {
        return f98lambda5;
    }

    /* renamed from: getLambda-6$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7014getLambda6$app_sideload() {
        return f99lambda6;
    }
}
