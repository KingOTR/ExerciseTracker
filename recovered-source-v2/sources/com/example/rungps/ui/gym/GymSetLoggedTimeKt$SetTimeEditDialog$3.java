package com.example.rungps.ui.gym;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextFieldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.VisualTransformation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymSetLoggedTime.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymSetLoggedTimeKt$SetTimeEditDialog$3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $text$delegate;

    GymSetLoggedTimeKt$SetTimeEditDialog$3(MutableState<String> mutableState) {
        this.$text$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        String SetTimeEditDialog$lambda$12;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1576264506, i, -1, "com.example.rungps.ui.gym.SetTimeEditDialog.<anonymous> (GymSetLoggedTime.kt:62)");
            }
            SetTimeEditDialog$lambda$12 = GymSetLoggedTimeKt.SetTimeEditDialog$lambda$12(this.$text$delegate);
            Intrinsics.checkNotNullExpressionValue(SetTimeEditDialog$lambda$12, "access$SetTimeEditDialog$lambda$12(...)");
            composer.startReplaceGroup(-1611589410);
            boolean changed = composer.changed(this.$text$delegate);
            final MutableState<String> mutableState = this.$text$delegate;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function1() { // from class: com.example.rungps.ui.gym.GymSetLoggedTimeKt$SetTimeEditDialog$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = GymSetLoggedTimeKt$SetTimeEditDialog$3.invoke$lambda$1$lambda$0(MutableState.this, (String) obj);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceGroup();
            TextFieldKt.TextField(SetTimeEditDialog$lambda$12, (Function1<? super String, Unit>) rememberedValue, (Modifier) null, false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableSingletons$GymSetLoggedTimeKt.INSTANCE.m7077getLambda4$app_sideload(), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, false, (VisualTransformation) null, (KeyboardOptions) null, (KeyboardActions) null, true, 0, 0, (MutableInteractionSource) null, (Shape) null, (TextFieldColors) null, composer, 1572864, 12582912, 0, 8257468);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(MutableState mutableState, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        mutableState.setValue(it);
        return Unit.INSTANCE;
    }
}
