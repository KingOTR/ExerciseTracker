package com.example.rungps.ui.profile;

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
import com.example.rungps.ui.sync.CloudAccountPanelKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserProfileScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComposableSingletons$UserProfileScreenKt {
    public static final ComposableSingletons$UserProfileScreenKt INSTANCE = new ComposableSingletons$UserProfileScreenKt();

    /* renamed from: lambda-1, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f303lambda1 = ComposableLambdaKt.composableLambdaInstance(225812251, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt$lambda-1$1
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
                ComposerKt.traceEventStart(225812251, i, -1, "com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt.lambda-1.<anonymous> (UserProfileScreen.kt:88)");
            }
            TextKt.m2376Text4IGK_g("Save profile", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-2, reason: not valid java name */
    public static Function3<RowScope, Composer, Integer, Unit> f304lambda2 = ComposableLambdaKt.composableLambdaInstance(-611475656, false, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt$lambda-2$1
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
                ComposerKt.traceEventStart(-611475656, i, -1, "com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt.lambda-2.<anonymous> (UserProfileScreen.kt:96)");
            }
            TextKt.m2376Text4IGK_g("Skip for now", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-3, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f305lambda3 = ComposableLambdaKt.composableLambdaInstance(-492094110, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt$lambda-3$1
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
                ComposerKt.traceEventStart(-492094110, i, -1, "com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt.lambda-3.<anonymous> (UserProfileScreen.kt:100)");
            }
            CloudAccountPanelKt.CloudAccountPanel(null, false, composer, 0, 3);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    /* renamed from: lambda-4, reason: not valid java name */
    public static Function3<ColumnScope, Composer, Integer, Unit> f306lambda4 = ComposableLambdaKt.composableLambdaInstance(-299162909, false, new Function3<ColumnScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt$lambda-4$1
        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
            invoke(columnScope, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
            if ((i & 17) != 16 || !composer.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-299162909, i, -1, "com.example.rungps.ui.profile.ComposableSingletons$UserProfileScreenKt.lambda-4.<anonymous> (UserProfileScreen.kt:103)");
                }
                TextKt.m2376Text4IGK_g("Uses recovery load timing on-device; with cloud sync signed in it is written to prefs/body_profile for the gym portal dashboard.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).m1588getOnSurfaceVariant0d7_KjU(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 6, 0, 65530);
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
    public final Function3<RowScope, Composer, Integer, Unit> m7398getLambda1$app_sideload() {
        return f303lambda1;
    }

    /* renamed from: getLambda-2$app_sideload, reason: not valid java name */
    public final Function3<RowScope, Composer, Integer, Unit> m7399getLambda2$app_sideload() {
        return f304lambda2;
    }

    /* renamed from: getLambda-3$app_sideload, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7400getLambda3$app_sideload() {
        return f305lambda3;
    }

    /* renamed from: getLambda-4$app_sideload, reason: not valid java name */
    public final Function3<ColumnScope, Composer, Integer, Unit> m7401getLambda4$app_sideload() {
        return f306lambda4;
    }
}
