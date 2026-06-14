package com.example.rungps.ui.coach;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.FilterChipDefaults;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TrainingCoachScreen.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class TrainingCoachScreenKt$TrainingCoachScreen$3$2$1$2 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $goalText$delegate;

    TrainingCoachScreenKt$TrainingCoachScreen$3$2$1$2(MutableState<String> mutableState) {
        this.$goalText$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        List<String> list;
        String TrainingCoachScreen$lambda$4;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1553551414, i, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrainingCoachScreen.kt:176)");
            }
            list = TrainingCoachScreenKt.goalPresets;
            final MutableState<String> mutableState = this.$goalText$delegate;
            for (final String str : list) {
                TrainingCoachScreen$lambda$4 = TrainingCoachScreenKt.TrainingCoachScreen$lambda$4(mutableState);
                boolean areEqual = Intrinsics.areEqual(TrainingCoachScreen$lambda$4, str);
                composer2.startReplaceGroup(-849624148);
                boolean changed = composer2.changed(mutableState) | composer2.changed(str);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$2$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = TrainingCoachScreenKt$TrainingCoachScreen$3$2$1$2.invoke$lambda$2$lambda$1$lambda$0(str, mutableState);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(areEqual, (Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(-1990870521, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.coach.TrainingCoachScreenKt$TrainingCoachScreen$3$2$1$2$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i2) {
                        if ((i2 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1990870521, i2, -1, "com.example.rungps.ui.coach.TrainingCoachScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrainingCoachScreen.kt:180)");
                        }
                        TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelLarge(), composer3, 0, 0, 65534);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, false, null, null, null, FilterChipDefaults.INSTANCE.m1794filterChipColorsXqyqHi0(0L, 0L, 0L, 0L, 0L, 0L, 0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getSecondaryContainer(), 0L, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnSecondaryContainer(), 0L, 0L, composer, 0, FilterChipDefaults.$stable << 6, 3455), null, null, null, composer, 384, 0, 3832);
                composer2 = composer;
                mutableState = mutableState;
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
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(String str, MutableState mutableState) {
        mutableState.setValue(str);
        return Unit.INSTANCE;
    }
}
