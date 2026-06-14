package com.example.rungps.ui.run;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.export.RunOverlayShare;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: RunOverlayExportDialog.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class RunOverlayExportDialogKt$RunOverlayExportDialog$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ boolean $canAct;
    final /* synthetic */ Context $ctx;
    final /* synthetic */ Function0<Unit> $onDismiss;
    final /* synthetic */ MutableState<Bitmap> $previewBitmap$delegate;

    RunOverlayExportDialogKt$RunOverlayExportDialog$3(Context context, Function0<Unit> function0, boolean z, MutableState<Bitmap> mutableState) {
        this.$ctx = context;
        this.$onDismiss = function0;
        this.$canAct = z;
        this.$previewBitmap$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1822158305, i, -1, "com.example.rungps.ui.run.RunOverlayExportDialog.<anonymous> (RunOverlayExportDialog.kt:230)");
            }
            composer.startReplaceGroup(581043174);
            boolean changedInstance = composer.changedInstance(this.$ctx) | composer.changed(this.$onDismiss);
            final Context context = this.$ctx;
            final Function0<Unit> function0 = this.$onDismiss;
            final MutableState<Bitmap> mutableState = this.$previewBitmap$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.run.RunOverlayExportDialogKt$RunOverlayExportDialog$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = RunOverlayExportDialogKt$RunOverlayExportDialog$3.invoke$lambda$1$lambda$0(context, function0, mutableState);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue, null, this.$canAct, null, null, null, null, null, null, ComposableSingletons$RunOverlayExportDialogKt.INSTANCE.m7411getLambda1$app_sideload(), composer, 805306368, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, Function0 function0, MutableState mutableState) {
        Bitmap RunOverlayExportDialog$lambda$4;
        RunOverlayExportDialog$lambda$4 = RunOverlayExportDialogKt.RunOverlayExportDialog$lambda$4(mutableState);
        if (RunOverlayExportDialog$lambda$4 == null) {
            return Unit.INSTANCE;
        }
        RunOverlayShare.sharePng$default(RunOverlayShare.INSTANCE, context, RunOverlayExportDialog$lambda$4, null, 4, null);
        function0.invoke();
        return Unit.INSTANCE;
    }
}
