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
import com.example.rungps.CrashLog;
import java.util.Date;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: DiagnosticsScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class DiagnosticsScreenKt$DiagnosticsScreen$1$3 implements Function3<ColumnScope, Composer, Integer, Unit> {
    final /* synthetic */ CrashLog.CrashEntry $crash;
    final /* synthetic */ Context $ctx;

    DiagnosticsScreenKt$DiagnosticsScreen$1$3(CrashLog.CrashEntry crashEntry, Context context) {
        this.$crash = crashEntry;
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
                ComposerKt.traceEventStart(-23284120, i, -1, "com.example.rungps.ui.diagnostics.DiagnosticsScreen.<anonymous>.<anonymous> (DiagnosticsScreen.kt:113)");
            }
            if (this.$crash == null) {
                composer.startReplaceGroup(-460071487);
                TextKt.m2376Text4IGK_g("No crash recorded on this device.", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 6, 0, 131070);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(-459967327);
                TextKt.m2376Text4IGK_g("Time: " + new Date(this.$crash.getAtMs()), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                TextKt.m2376Text4IGK_g("Thread: " + this.$crash.getThread(), (Modifier) null, MaterialTheme.INSTANCE.getColorScheme(composer, MaterialTheme.$stable).getOnSurfaceVariant(), 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer, 0, 0, 131066);
                TextKt.m2376Text4IGK_g(StringsKt.trim((CharSequence) this.$crash.getStacktrace()).toString(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) FontFamily.INSTANCE.getMonospace(), 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer, MaterialTheme.$stable).getBodySmall(), composer, 0, 0, 65470);
                composer.startReplaceGroup(816460278);
                boolean changedInstance = composer.changedInstance(this.$ctx);
                final Context context = this.$ctx;
                final CrashLog.CrashEntry crashEntry = this.$crash;
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.diagnostics.DiagnosticsScreenKt$DiagnosticsScreen$1$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$1$lambda$0;
                            invoke$lambda$1$lambda$0 = DiagnosticsScreenKt$DiagnosticsScreen$1$3.invoke$lambda$1$lambda$0(context, crashEntry);
                            return invoke$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                ButtonKt.Button((Function0) rememberedValue, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$DiagnosticsScreenKt.INSTANCE.m7013getLambda5$app_sideload(), composer, 805306416, 508);
                composer.startReplaceGroup(816468783);
                boolean changedInstance2 = composer.changedInstance(this.$ctx);
                final Context context2 = this.$ctx;
                Object rememberedValue2 = composer.rememberedValue();
                if (changedInstance2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.diagnostics.DiagnosticsScreenKt$DiagnosticsScreen$1$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$3$lambda$2;
                            invoke$lambda$3$lambda$2 = DiagnosticsScreenKt$DiagnosticsScreen$1$3.invoke$lambda$3$lambda$2(context2);
                            return invoke$lambda$3$lambda$2;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue2);
                }
                composer.endReplaceGroup();
                ButtonKt.OutlinedButton((Function0) rememberedValue2, SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), false, null, null, null, null, null, null, ComposableSingletons$DiagnosticsScreenKt.INSTANCE.m7014getLambda6$app_sideload(), composer, 805306416, 508);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, CrashLog.CrashEntry crashEntry) {
        DiagnosticsScreenKt.copyToClipboard(context, "Crash stacktrace", crashEntry.getStacktrace());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Context context) {
        CrashLog.INSTANCE.clear(context);
        return Unit.INSTANCE;
    }
}
