package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.ColumnScope;
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
import com.example.rungps.ui.sync.CloudAccountPanelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymProgressTabBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$GymProgressTabBodyKt {
    public static final ComposableSingletons$GymProgressTabBodyKt INSTANCE = new ComposableSingletons$GymProgressTabBodyKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f199lambda1 = ComposableLambdaKt.composableLambdaInstance(-391766978, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymProgressTabBodyKt$lambda-1$1
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
                ComposerKt.traceEventStart(-391766978, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymProgressTabBodyKt.lambda-1.<anonymous> (GymProgressTabBody.kt:209)");
            }
            TextKt.m2376Text4IGK_g("Assign", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f200lambda2 = ComposableLambdaKt.composableLambdaInstance(1655361754, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.ComposableSingletons$GymProgressTabBodyKt$lambda-2$1
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
                ComposerKt.traceEventStart(1655361754, i, -1, "com.example.rungps.ui.main.ComposableSingletons$GymProgressTabBodyKt.lambda-2.<anonymous> (GymProgressTabBody.kt:216)");
            }
            CloudAccountPanelKt.CloudAccountPanel(null, false, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7190getLambda1$app_sideload() {
        return f199lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7191getLambda2$app_sideload() {
        return f200lambda2;
    }
}
