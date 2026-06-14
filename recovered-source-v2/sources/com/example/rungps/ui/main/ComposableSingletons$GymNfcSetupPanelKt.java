package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.IconKt;
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
import androidx.compose.ui.unit.Dp;
import com.example.rungps.ui.icons.EtIcons;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymNfcSetupPanel.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$GymNfcSetupPanelKt {
    public static final ComposableSingletons$GymNfcSetupPanelKt INSTANCE = new ComposableSingletons$GymNfcSetupPanelKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f187lambda1 = ComposableLambdaKt.composableLambdaInstance(-1445580277, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-1$1
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
                ComposerKt.traceEventStart(-1445580277, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-1.<anonymous> (GymNfcSetupPanel.kt:166)");
            }
            TextKt.m2376Text4IGK_g("Cancel registration", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f191lambda2 = ComposableLambdaKt.composableLambdaInstance(301574792, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-2$1
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
                ComposerKt.traceEventStart(301574792, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-2.<anonymous> (GymNfcSetupPanel.kt:225)");
            }
            TextKt.m2376Text4IGK_g("Refresh GPS / at-gym status", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f192lambda3 = ComposableLambdaKt.composableLambdaInstance(-632243639, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-3$1
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
                ComposerKt.traceEventStart(-632243639, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-3.<anonymous> (GymNfcSetupPanel.kt:237)");
            }
            TextKt.m2376Text4IGK_g("Location name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f193lambda4 = ComposableLambdaKt.composableLambdaInstance(-53741071, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer, Integer num) {
            invoke(rowScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(RowScope OutlinedButton, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-53741071, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-4.<anonymous> (GymNfcSetupPanel.kt:259)");
                }
                IconKt.m1833Iconww6aTOc(EtIcons.INSTANCE.getLocate(), (String) null, (Modifier) null, 0L, composer, 54, 12);
                TextKt.m2376Text4IGK_g("Set gym location here", PaddingKt.m688paddingqDBjuR0$default(Modifier.INSTANCE, Dp.m6303constructorimpl(8), 0.0f, 0.0f, 0.0f, 14, null), 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 54, 0, 131068);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: lambda-5, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f194lambda5 = ComposableLambdaKt.composableLambdaInstance(-1080718619, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-5$1
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
                ComposerKt.traceEventStart(-1080718619, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-5.<anonymous> (GymNfcSetupPanel.kt:288)");
            }
            TextKt.m2376Text4IGK_g("Remove", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f195lambda6 = ComposableLambdaKt.composableLambdaInstance(-764567384, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-6$1
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
                ComposerKt.traceEventStart(-764567384, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-6.<anonymous> (GymNfcSetupPanel.kt:298)");
            }
            TextKt.m2376Text4IGK_g("Card label", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f196lambda7 = ComposableLambdaKt.composableLambdaInstance(-553407982, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-7$1
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
                ComposerKt.traceEventStart(-553407982, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-7.<anonymous> (GymNfcSetupPanel.kt:311)");
            }
            TextKt.m2376Text4IGK_g("Add gym card (tap NFC)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f197lambda8 = ComposableLambdaKt.composableLambdaInstance(-2049673737, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-8$1
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
                ComposerKt.traceEventStart(-2049673737, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-8.<anonymous> (GymNfcSetupPanel.kt:378)");
            }
            TextKt.m2376Text4IGK_g("Name", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f198lambda9 = ComposableLambdaKt.composableLambdaInstance(1389360958, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-9$1
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
                ComposerKt.traceEventStart(1389360958, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-9.<anonymous> (GymNfcSetupPanel.kt:383)");
            }
            TextKt.m2376Text4IGK_g("Save", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f188lambda10 = ComposableLambdaKt.composableLambdaInstance(1575572341, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-10$1
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
                ComposerKt.traceEventStart(1575572341, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-10.<anonymous> (GymNfcSetupPanel.kt:384)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f189lambda11 = ComposableLambdaKt.composableLambdaInstance(548019427, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-11$1
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
                ComposerKt.traceEventStart(548019427, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-11.<anonymous> (GymNfcSetupPanel.kt:393)");
            }
            TextKt.m2376Text4IGK_g("Rename", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f190lambda12 = ComposableLambdaKt.composableLambdaInstance(1380724644, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt$lambda-12$1
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
                ComposerKt.traceEventStart(1380724644, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymNfcSetupPanelKt.lambda-12.<anonymous> (GymNfcSetupPanel.kt:397)");
            }
            TextKt.m2376Text4IGK_g("Remove", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7178getLambda1$app_sideload() {
        return f187lambda1;
    }

    /* renamed from: getLambda-10$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7179getLambda10$app_sideload() {
        return f188lambda10;
    }

    /* renamed from: getLambda-11$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7180getLambda11$app_sideload() {
        return f189lambda11;
    }

    /* renamed from: getLambda-12$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7181getLambda12$app_sideload() {
        return f190lambda12;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7182getLambda2$app_sideload() {
        return f191lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7183getLambda3$app_sideload() {
        return f192lambda3;
    }

    /* renamed from: getLambda-4$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7184getLambda4$app_sideload() {
        return f193lambda4;
    }

    /* renamed from: getLambda-5$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7185getLambda5$app_sideload() {
        return f194lambda5;
    }

    /* renamed from: getLambda-6$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7186getLambda6$app_sideload() {
        return f195lambda6;
    }

    /* renamed from: getLambda-7$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7187getLambda7$app_sideload() {
        return f196lambda7;
    }

    /* renamed from: getLambda-8$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7188getLambda8$app_sideload() {
        return f197lambda8;
    }

    /* renamed from: getLambda-9$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7189getLambda9$app_sideload() {
        return f198lambda9;
    }
}
