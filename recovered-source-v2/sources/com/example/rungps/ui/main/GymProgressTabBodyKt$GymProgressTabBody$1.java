package com.example.rungps.ui.main;

import android.content.Context;
import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.material3.ChipKt;
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
import com.example.rungps.gym.GymPreferences;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymProgressTabBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymProgressTabBodyKt$GymProgressTabBody$1 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ int $heatmapDays;
    final /* synthetic */ Function1<Integer, Unit> $onHeatmapDaysChange;

    /* JADX WARN: Multi-variable type inference failed */
    GymProgressTabBodyKt$GymProgressTabBody$1(int i, Context context, Function1<? super Integer, Unit> function1) {
        this.$heatmapDays = i;
        this.$ctx = context;
        this.$onHeatmapDaysChange = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1123985824, i, -1, "com.example.rungps.ui.main.GymProgressTabBody.<anonymous> (GymProgressTabBody.kt:71)");
            }
            boolean z = true;
            List listOf = CollectionsKt.listOf((Object[]) new Integer[]{7, 30, 90});
            int i2 = this.$heatmapDays;
            final Context context = this.$ctx;
            final Function1<Integer, Unit> function1 = this.$onHeatmapDaysChange;
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                final int intValue = ((Number) it.next()).intValue();
                boolean z2 = i2 == intValue ? z : false;
                composer2.startReplaceGroup(301119018);
                boolean changedInstance = composer2.changedInstance(context) | composer2.changed(intValue) | composer2.changed(function1);
                Object rememberedValue = composer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = GymProgressTabBodyKt$GymProgressTabBody$1.invoke$lambda$2$lambda$1$lambda$0(context, intValue, function1);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(z2, (Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(2051962539, z, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2051962539, i3, -1, "com.example.rungps.ui.main.GymProgressTabBody.<anonymous>.<anonymous>.<anonymous> (GymProgressTabBody.kt:78)");
                        }
                        TextKt.m2376Text4IGK_g(intValue + "d", (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 0, 3072, 57342);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
                composer2 = composer;
                function1 = function1;
                context = context;
                z = z;
                i2 = i2;
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
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Context context, int i, Function1 function1) {
        GymPreferences.INSTANCE.setVolumeHeatmapDays(context, i);
        function1.invoke(Integer.valueOf(i));
        return Unit.INSTANCE;
    }
}
