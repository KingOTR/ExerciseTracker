package com.example.rungps.ui.gear;

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

/* compiled from: ActivityMetadataSection.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$ActivityMetadataSectionKt {
    public static final ComposableSingletons$ActivityMetadataSectionKt INSTANCE = new ComposableSingletons$ActivityMetadataSectionKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f101lambda1 = ComposableLambdaKt.composableLambdaInstance(528413285, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ComposableSingletons$ActivityMetadataSectionKt$lambda-1$1
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
                ComposerKt.traceEventStart(528413285, i, -1, "com.example.rungps.ui.gear.ComposableSingletons$ActivityMetadataSectionKt.lambda-1.<anonymous> (ActivityMetadataSection.kt:42)");
            }
            TextKt.m2376Text4IGK_g("Title", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f102lambda2 = ComposableLambdaKt.composableLambdaInstance(-1895681636, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ComposableSingletons$ActivityMetadataSectionKt$lambda-2$1
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
                ComposerKt.traceEventStart(-1895681636, i, -1, "com.example.rungps.ui.gear.ComposableSingletons$ActivityMetadataSectionKt.lambda-2.<anonymous> (ActivityMetadataSection.kt:49)");
            }
            TextKt.m2376Text4IGK_g("Description / comments", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function2<Composer, Integer, Unit> f103lambda3 = ComposableLambdaKt.composableLambdaInstance(1334318429, false, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gear.ComposableSingletons$ActivityMetadataSectionKt$lambda-3$1
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
                ComposerKt.traceEventStart(1334318429, i, -1, "com.example.rungps.ui.gear.ComposableSingletons$ActivityMetadataSectionKt.lambda-3.<anonymous> (ActivityMetadataSection.kt:56)");
            }
            TextKt.m2376Text4IGK_g("Private notes (journal)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7023getLambda1$app_sideload() {
        return f101lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7024getLambda2$app_sideload() {
        return f102lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function2<Composer, Integer, Unit> m7025getLambda3$app_sideload() {
        return f103lambda3;
    }
}
