package com.example.rungps.ui.diagnostics;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import com.example.rungps.widget.GymWidgetProvider;
import com.example.rungps.widget.WidgetBootstrap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiagnosticsScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DiagnosticsScreenKt$DiagnosticsScreen$1$1 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;

    DiagnosticsScreenKt$DiagnosticsScreen$1$1(Context context) {
        this.$ctx = context;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(ColumnScope columnScope, Composer composer, Integer num) {
        invoke(columnScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(ColumnScope TabSectionCard, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(TabSectionCard, "$this$TabSectionCard");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-683564882, i, -1, "com.example.rungps.ui.diagnostics.DiagnosticsScreen.<anonymous>.<anonymous> (DiagnosticsScreen.kt:49)");
            }
            TextKt.m2376Text4IGK_g("Version: 0.7.93 (107)", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            TextKt.m2376Text4IGK_g("Package: com.exercisetracker.app", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            composer.startReplaceGroup(816361256);
            Context context = this.$ctx;
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = Integer.valueOf(AppWidgetManager.getInstance(context).getAppWidgetIds(new ComponentName(context, (Class<?>) GymWidgetProvider.class)).length);
                composer.updateRememberedValue(rememberedValue);
            }
            int intValue = ((Number) rememberedValue).intValue();
            composer.endReplaceGroup();
            TextKt.m2376Text4IGK_g("Gym home widgets placed: " + intValue, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131070);
            composer.startReplaceGroup(816370339);
            boolean changedInstance = composer.changedInstance(this.$ctx);
            final Context context2 = this.$ctx;
            Object rememberedValue2 = composer.rememberedValue();
            if (changedInstance || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.diagnostics.DiagnosticsScreenKt$DiagnosticsScreen$1$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$2$lambda$1;
                        invoke$lambda$2$lambda$1 = DiagnosticsScreenKt$DiagnosticsScreen$1$1.invoke$lambda$2$lambda$1(context2);
                        return invoke$lambda$2$lambda$1;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$DiagnosticsScreenKt.INSTANCE.m7009getLambda1$app_sideload(), composer, 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(Context context) {
        WidgetBootstrap.refreshAllAsync$default(WidgetBootstrap.INSTANCE, context, false, 2, null);
        Toast.makeText(context, "Refreshing home widgets…", 0).show();
        return Unit.INSTANCE;
    }
}
