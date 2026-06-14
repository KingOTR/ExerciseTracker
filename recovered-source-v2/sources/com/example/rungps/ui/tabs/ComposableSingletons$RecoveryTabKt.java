package com.example.rungps.ui.tabs;

import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
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

/* compiled from: RecoveryTab.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$RecoveryTabKt {
    public static final ComposableSingletons$RecoveryTabKt INSTANCE = new ComposableSingletons$RecoveryTabKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f421lambda1 = ComposableLambdaKt.composableLambdaInstance(-16948261, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.tabs.ComposableSingletons$RecoveryTabKt$lambda-1$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-16948261, i, -1, "com.example.rungps.ui.tabs.ComposableSingletons$RecoveryTabKt.lambda-1.<anonymous> (RecoveryTab.kt:369)");
                }
                TextKt.m2376Text4IGK_g("Runs, rides, gym sessions, and sport add training load (including recent Strava activities). When everything has cleared, you are fully recovered. Steps and sleep from Health Connect feed into readiness on Home and in Coach.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1588getOnSurfaceVariant0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                    return;
                }
                return;
            }
            composer.skipToGroupEnd();
        }
    });

    /* renamed from: getLambda-1$app_sideload, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7626getLambda1$app_sideload() {
        return f421lambda1;
    }
}
