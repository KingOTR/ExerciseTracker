package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.AppBarKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.material3.TopAppBarDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.health.connect.client.records.CervicalMucusRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainActivityTopBar.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"MainActivityTopBar", "", "themeMode", "", "onCycleTheme", "Lkotlin/Function0;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "app_sideload"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class MainActivityTopBarKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainActivityTopBar$lambda$0(String str, Function0 function0, int i, Composer composer, int i2) {
        MainActivityTopBar(str, function0, composer, RecomposeScopeImplKt.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MainActivityTopBar(final String themeMode, final Function0<Unit> onCycleTheme, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(themeMode, "themeMode");
        Intrinsics.checkNotNullParameter(onCycleTheme, "onCycleTheme");
        Composer startRestartGroup = composer.startRestartGroup(-463603674);
        if ((i & 6) == 0) {
            i2 = (startRestartGroup.changed(themeMode) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= startRestartGroup.changedInstance(onCycleTheme) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !startRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-463603674, i2, -1, "com.example.rungps.ui.main.MainActivityTopBar (MainActivityTopBar.kt:15)");
            }
            composer2 = startRestartGroup;
            AppBarKt.m1455TopAppBarGHTll3U(ComposableSingletons$MainActivityTopBarKt.INSTANCE.m7211getLambda1$app_sideload(), null, null, ComposableLambdaKt.rememberComposableLambda(-852239787, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MainActivityTopBarKt$MainActivityTopBar$1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer3, Integer num) {
                    invoke(rowScope, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RowScope TopAppBar, Composer composer3, int i3) {
                    Intrinsics.checkNotNullParameter(TopAppBar, "$this$TopAppBar");
                    if ((i3 & 17) != 16 || !composer3.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-852239787, i3, -1, "com.example.rungps.ui.main.MainActivityTopBar.<anonymous> (MainActivityTopBar.kt:23)");
                        }
                        Function0<Unit> function0 = onCycleTheme;
                        final String str = themeMode;
                        ButtonKt.OutlinedButton(function0, null, false, null, null, null, null, null, null, ComposableLambdaKt.rememberComposableLambda(1054982435, true, new Function3<RowScope, Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.MainActivityTopBarKt$MainActivityTopBar$1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RowScope rowScope, Composer composer4, Integer num) {
                                invoke(rowScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RowScope OutlinedButton, Composer composer4, int i4) {
                                String str2;
                                Intrinsics.checkNotNullParameter(OutlinedButton, "$this$OutlinedButton");
                                if ((i4 & 17) != 16 || !composer4.getSkipping()) {
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1054982435, i4, -1, "com.example.rungps.ui.main.MainActivityTopBar.<anonymous>.<anonymous> (MainActivityTopBar.kt:24)");
                                    }
                                    String str3 = str;
                                    int hashCode = str3.hashCode();
                                    if (hashCode == -1413862040) {
                                        if (str3.equals("amoled")) {
                                            str2 = "AMOLED";
                                        }
                                        str2 = "System";
                                    } else if (hashCode == 3075958) {
                                        if (str3.equals("dark")) {
                                            str2 = "Dark";
                                        }
                                        str2 = "System";
                                    } else {
                                        if (hashCode == 102970646 && str3.equals(CervicalMucusRecord.Sensation.LIGHT)) {
                                            str2 = "Light";
                                        }
                                        str2 = "System";
                                    }
                                    TextKt.m2376Text4IGK_g(str2, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer4, 0, 0, 131070);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    return;
                                }
                                composer4.skipToGroupEnd();
                            }
                        }, composer3, 54), composer3, 805306368, 510);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer3.skipToGroupEnd();
                }
            }, composer2, 54), 0.0f, null, TopAppBarDefaults.INSTANCE.m2547topAppBarColorszjMxDiM(MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getPrimaryContainer(), 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(startRestartGroup, MaterialTheme.$stable).getOnPrimaryContainer(), 0L, startRestartGroup, TopAppBarDefaults.$stable << 15, 22), null, composer2, 3078, 182);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
            composer2 = startRestartGroup;
        }
        ScopeUpdateScope endRestartGroup = composer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new Function2() { // from class: com.example.rungps.ui.main.MainActivityTopBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    Unit MainActivityTopBar$lambda$0;
                    MainActivityTopBar$lambda$0 = MainActivityTopBarKt.MainActivityTopBar$lambda$0(themeMode, onCycleTheme, i, (Composer) obj, ((Integer) obj2).intValue());
                    return MainActivityTopBar$lambda$0;
                }
            });
        }
    }
}
