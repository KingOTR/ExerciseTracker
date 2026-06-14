package com.example.rungps.ui.shell;

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

/* compiled from: AppScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$AppScreenKt {
    public static final ComposableSingletons$AppScreenKt INSTANCE = new ComposableSingletons$AppScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f324lambda1 = ComposableLambdaKt.composableLambdaInstance(1755184150, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(1755184150, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-1.<anonymous> (AppScreen.kt:174)");
            }
            TextKt.m2376Text4IGK_g("Allow calendar", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f335lambda2 = ComposableLambdaKt.composableLambdaInstance(-171561371, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(-171561371, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-2.<anonymous> (AppScreen.kt:177)");
            }
            TextKt.m2376Text4IGK_g("Not now", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f340lambda3 = ComposableLambdaKt.composableLambdaInstance(-141039318, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-3$1
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
                ComposerKt.traceEventStart(-141039318, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-3.<anonymous> (AppScreen.kt:164)");
            }
            TextKt.m2376Text4IGK_g("Calendar (optional)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f341lambda4 = ComposableLambdaKt.composableLambdaInstance(582251115, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) != 2 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(582251115, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-4.<anonymous> (AppScreen.kt:166)");
                }
                TextKt.m2376Text4IGK_g("Read tomorrow morning events for wake hints. Works with Google Calendar when synced to Android.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
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
    public static Function3<RowScope, Composer, Integer, Unit> f342lambda5 = ComposableLambdaKt.composableLambdaInstance(-1417503947, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-5$1
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
                ComposerKt.traceEventStart(-1417503947, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-5.<anonymous> (AppScreen.kt:198)");
            }
            TextKt.m2376Text4IGK_g("Nice!", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-6, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f343lambda6 = ComposableLambdaKt.composableLambdaInstance(-1911921851, false, ComposableSingletons$AppScreenKt$lambda6$1.INSTANCE);

    /* renamed from: lambda-7, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f344lambda7 = ComposableLambdaKt.composableLambdaInstance(981239881, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-7$1
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
                ComposerKt.traceEventStart(981239881, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-7.<anonymous> (AppScreen.kt:184)");
            }
            TextKt.m2376Text4IGK_g("New personal record!", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-8, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f345lambda8 = ComposableLambdaKt.composableLambdaInstance(-295224748, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-8$1
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
                ComposerKt.traceEventStart(-295224748, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-8.<anonymous> (AppScreen.kt:318)");
            }
            TextKt.m2376Text4IGK_g("Copy", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-9, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f346lambda9 = ComposableLambdaKt.composableLambdaInstance(1383622232, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-9$1
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
                ComposerKt.traceEventStart(1383622232, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-9.<anonymous> (AppScreen.kt:321)");
            }
            TextKt.m2376Text4IGK_g("Close", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-10, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f325lambda10 = ComposableLambdaKt.composableLambdaInstance(2103519080, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-10$1
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
                ComposerKt.traceEventStart(2103519080, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-10.<anonymous> (AppScreen.kt:306)");
            }
            TextKt.m2376Text4IGK_g("Startup error", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-11, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f326lambda11 = ComposableLambdaKt.composableLambdaInstance(2027244592, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-11$1
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
                ComposerKt.traceEventStart(2027244592, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-11.<anonymous> (AppScreen.kt:449)");
            }
            TextKt.m2376Text4IGK_g("Delete", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-12, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f327lambda12 = ComposableLambdaKt.composableLambdaInstance(-990812364, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-12$1
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
                ComposerKt.traceEventStart(-990812364, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-12.<anonymous> (AppScreen.kt:452)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-13, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f328lambda13 = ComposableLambdaKt.composableLambdaInstance(809346116, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-13$1
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
                ComposerKt.traceEventStart(809346116, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-13.<anonymous> (AppScreen.kt:443)");
            }
            TextKt.m2376Text4IGK_g("Delete all history?", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-14, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f329lambda14 = ComposableLambdaKt.composableLambdaInstance(2075416901, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-14$1
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
                ComposerKt.traceEventStart(2075416901, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-14.<anonymous> (AppScreen.kt:444)");
            }
            TextKt.m2376Text4IGK_g("This removes all runs and track points from this phone.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-15, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f330lambda15 = ComposableLambdaKt.composableLambdaInstance(-1601514279, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-15$1
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
                ComposerKt.traceEventStart(-1601514279, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-15.<anonymous> (AppScreen.kt:467)");
            }
            TextKt.m2376Text4IGK_g("Delete", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-16, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f331lambda16 = ComposableLambdaKt.composableLambdaInstance(1443643101, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-16$1
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
                ComposerKt.traceEventStart(1443643101, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-16.<anonymous> (AppScreen.kt:470)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-17, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f332lambda17 = ComposableLambdaKt.composableLambdaInstance(1742401710, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-17$1
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
                ComposerKt.traceEventStart(1742401710, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-17.<anonymous> (AppScreen.kt:462)");
            }
            TextKt.m2376Text4IGK_g("This removes the run and its GPS points.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-18, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f333lambda18 = ComposableLambdaKt.composableLambdaInstance(-1838132104, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-18$1
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
                ComposerKt.traceEventStart(-1838132104, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-18.<anonymous> (AppScreen.kt:506)");
            }
            TextKt.m2376Text4IGK_g("Start", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-19, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f334lambda19 = ComposableLambdaKt.composableLambdaInstance(1207025276, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-19$1
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
                ComposerKt.traceEventStart(1207025276, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-19.<anonymous> (AppScreen.kt:509)");
            }
            TextKt.m2376Text4IGK_g("Cancel", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-20, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f336lambda20 = ComposableLambdaKt.composableLambdaInstance(-2074749929, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-20$1
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
                ComposerKt.traceEventStart(-2074749929, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-20.<anonymous> (AppScreen.kt:529)");
            }
            TextKt.m2376Text4IGK_g("Open settings", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-21, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f337lambda21 = ComposableLambdaKt.composableLambdaInstance(970407451, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-21$1
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
                ComposerKt.traceEventStart(970407451, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-21.<anonymous> (AppScreen.kt:537)");
            }
            TextKt.m2376Text4IGK_g("Start anyway", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-22, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f338lambda22 = ComposableLambdaKt.composableLambdaInstance(50886443, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-22$1
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
                ComposerKt.traceEventStart(50886443, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-22.<anonymous> (AppScreen.kt:517)");
            }
            TextKt.m2376Text4IGK_g("Turn off Power saving for GPS", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-23, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f339lambda23 = ComposableLambdaKt.composableLambdaInstance(1269166060, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt$lambda-23$1
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
                ComposerKt.traceEventStart(1269166060, i, -1, "com.example.rungps.ui.shell.ComposableSingletons$AppScreenKt.lambda-23.<anonymous> (AppScreen.kt:519)");
            }
            TextKt.m2376Text4IGK_g("Battery Saver / Power saving can reduce GPS accuracy and update frequency. Turn it off for better tracking.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7456getLambda1$app_sideload() {
        return f324lambda1;
    }

    /* renamed from: getLambda-10$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7457getLambda10$app_sideload() {
        return f325lambda10;
    }

    /* renamed from: getLambda-11$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7458getLambda11$app_sideload() {
        return f326lambda11;
    }

    /* renamed from: getLambda-12$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7459getLambda12$app_sideload() {
        return f327lambda12;
    }

    /* renamed from: getLambda-13$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7460getLambda13$app_sideload() {
        return f328lambda13;
    }

    /* renamed from: getLambda-14$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7461getLambda14$app_sideload() {
        return f329lambda14;
    }

    /* renamed from: getLambda-15$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7462getLambda15$app_sideload() {
        return f330lambda15;
    }

    /* renamed from: getLambda-16$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7463getLambda16$app_sideload() {
        return f331lambda16;
    }

    /* renamed from: getLambda-17$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7464getLambda17$app_sideload() {
        return f332lambda17;
    }

    /* renamed from: getLambda-18$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7465getLambda18$app_sideload() {
        return f333lambda18;
    }

    /* renamed from: getLambda-19$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7466getLambda19$app_sideload() {
        return f334lambda19;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7467getLambda2$app_sideload() {
        return f335lambda2;
    }

    /* renamed from: getLambda-20$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7468getLambda20$app_sideload() {
        return f336lambda20;
    }

    /* renamed from: getLambda-21$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7469getLambda21$app_sideload() {
        return f337lambda21;
    }

    /* renamed from: getLambda-22$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7470getLambda22$app_sideload() {
        return f338lambda22;
    }

    /* renamed from: getLambda-23$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7471getLambda23$app_sideload() {
        return f339lambda23;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7472getLambda3$app_sideload() {
        return f340lambda3;
    }

    /* renamed from: getLambda-4$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7473getLambda4$app_sideload() {
        return f341lambda4;
    }

    /* renamed from: getLambda-5$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7474getLambda5$app_sideload() {
        return f342lambda5;
    }

    /* renamed from: getLambda-6$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7475getLambda6$app_sideload() {
        return f343lambda6;
    }

    /* renamed from: getLambda-7$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7476getLambda7$app_sideload() {
        return f344lambda7;
    }

    /* renamed from: getLambda-8$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7477getLambda8$app_sideload() {
        return f345lambda8;
    }

    /* renamed from: getLambda-9$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7478getLambda9$app_sideload() {
        return f346lambda9;
    }
}
