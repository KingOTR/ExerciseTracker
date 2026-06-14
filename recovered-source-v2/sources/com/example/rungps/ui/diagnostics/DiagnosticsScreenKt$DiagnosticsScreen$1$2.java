package com.example.rungps.ui.diagnostics;

import android.content.Context;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ButtonKt;
import androidx.compose.material3.MaterialTheme;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: DiagnosticsScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DiagnosticsScreenKt$DiagnosticsScreen$1$2 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ CoroutineScope $scope;

    DiagnosticsScreenKt$DiagnosticsScreen$1$2(CoroutineScope coroutineScope, Context context) {
        this.$scope = coroutineScope;
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
                ComposerKt.traceEventStart(679311719, i, -1, "com.example.rungps.ui.diagnostics.DiagnosticsScreen.<anonymous>.<anonymous> (DiagnosticsScreen.kt:80)");
            }
            TextKt.m2376Text4IGK_g("ZIP includes diagnostics.json (version, sync, crash, deep-link prefs) and a data snapshot.", (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131066);
            composer.startReplaceGroup(816402570);
            boolean changedInstance = composer.changedInstance(this.$scope) | composer.changedInstance(this.$ctx);
            final CoroutineScope coroutineScope = this.$scope;
            final Context context = this.$ctx;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.diagnostics.DiagnosticsScreenKt$DiagnosticsScreen$1$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = DiagnosticsScreenKt$DiagnosticsScreen$1$2.invoke$lambda$1$lambda$0(CoroutineScope.this, context);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$DiagnosticsScreenKt.INSTANCE.m7012getLambda4$app_sideload(), composer, 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(CoroutineScope coroutineScope, Context context) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new DiagnosticsScreenKt$DiagnosticsScreen$1$2$1$1$1(context, null), 3, null);
        return Unit.INSTANCE;
    }
}
