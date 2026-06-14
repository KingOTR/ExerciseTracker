package com.example.rungps.ui.main;

import androidx.compose.foundation.layout.FlowRowScope;
import androidx.compose.material3.ChipKt;
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
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GymProgressTabBody.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymProgressTabBodyKt$GymProgressTabBody$5 implements Function3<FlowRowScope, Composer, Integer, Unit> {
    final /* synthetic */ MutableState<String> $filterRegion$delegate;

    GymProgressTabBodyKt$GymProgressTabBody$5(MutableState<String> mutableState) {
        this.$filterRegion$delegate = mutableState;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(FlowRowScope flowRowScope, Composer composer, Integer num) {
        invoke(flowRowScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(FlowRowScope FlowRow, Composer composer, int i) {
        String GymProgressTabBody$lambda$2;
        Composer composer2 = composer;
        Intrinsics.checkNotNullParameter(FlowRow, "$this$FlowRow");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-427314409, i, -1, "com.example.rungps.ui.main.GymProgressTabBody.<anonymous> (GymProgressTabBody.kt:154)");
            }
            EnumEntries<PrRegionFilter> entries = PrRegionFilter.getEntries();
            final MutableState<String> mutableState = this.$filterRegion$delegate;
            for (final PrRegionFilter prRegionFilter : entries) {
                GymProgressTabBody$lambda$2 = GymProgressTabBodyKt.GymProgressTabBody$lambda$2(mutableState);
                boolean areEqual = Intrinsics.areEqual(GymProgressTabBody$lambda$2, prRegionFilter.getId());
                composer2.startReplaceGroup(301235549);
                boolean changed = composer2.changed(mutableState) | composer2.changed(prRegionFilter);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$5$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = GymProgressTabBodyKt$GymProgressTabBody$5.invoke$lambda$2$lambda$1$lambda$0(PrRegionFilter.this, mutableState);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer2.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                ChipKt.FilterChip(areEqual, (Function0) rememberedValue, ComposableLambdaKt.rememberComposableLambda(-377688143, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.main.GymProgressTabBodyKt$GymProgressTabBody$5$1$2
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
                            ComposerKt.traceEventStart(-377688143, i2, -1, "com.example.rungps.ui.main.GymProgressTabBody.<anonymous>.<anonymous>.<anonymous> (GymProgressTabBody.kt:158)");
                        }
                        TextKt.m2376Text4IGK_g(PrRegionFilter.this.getLabel(), (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 1, 0, (Function1<? super TextLayoutResult, Unit>) null, MaterialTheme.INSTANCE.getTypography(composer3, MaterialTheme.$stable).getLabelMedium(), composer3, 0, 3072, 57342);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), null, false, null, null, null, null, null, null, null, composer, 384, 0, 4088);
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
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(PrRegionFilter prRegionFilter, MutableState mutableState) {
        mutableState.setValue(prRegionFilter.getId());
        return Unit.INSTANCE;
    }
}
