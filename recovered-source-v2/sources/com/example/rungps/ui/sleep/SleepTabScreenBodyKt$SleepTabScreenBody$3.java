package com.example.rungps.ui.sleep;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SleepTabScreenBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SleepTabScreenBodyKt$SleepTabScreenBody$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $googleTroubleshootDetail$delegate;

    SleepTabScreenBodyKt$SleepTabScreenBody$3(Context context, MutableState<String> mutableState) {
        this.$ctx = context;
        this.$googleTroubleshootDetail$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1498990807, i, -1, "com.example.rungps.ui.sleep.SleepTabScreenBody.<anonymous> (SleepTabScreenBody.kt:276)");
            }
            composer.startReplaceGroup(-1962163339);
            boolean changedInstance = composer.changedInstance(this.$ctx);
            final Context context = this.$ctx;
            final MutableState<String> mutableState = this.$googleTroubleshootDetail$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.sleep.SleepTabScreenBodyKt$SleepTabScreenBody$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = SleepTabScreenBodyKt$SleepTabScreenBody$3.invoke$lambda$1$lambda$0(context, mutableState);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SleepTabScreenBodyKt.INSTANCE.m7502getLambda1$app_sideload(), composer, 805306368, 510);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, MutableState mutableState) {
        String SleepTabScreenBody$lambda$107;
        SleepTabScreenBody$lambda$107 = SleepTabScreenBodyKt.SleepTabScreenBody$lambda$107(mutableState);
        if (SleepTabScreenBody$lambda$107 == null) {
            return Unit.INSTANCE;
        }
        Object systemService = context.getSystemService("clipboard");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("Google sign-in setup", SleepTabScreenBody$lambda$107));
        Toast.makeText(context, "Copied setup details", 0).show();
        return Unit.INSTANCE;
    }
}
