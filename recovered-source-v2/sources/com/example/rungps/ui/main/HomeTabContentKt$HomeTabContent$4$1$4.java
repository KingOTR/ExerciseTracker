package com.example.rungps.ui.main;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.example.rungps.ui.gear.GearAdviceCardsKt;
import com.example.rungps.ui.navigation.MoreDestination;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HomeTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class HomeTabContentKt$HomeTabContent$4$1$4 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $goTab;

    /* JADX WARN: Multi-variable type inference failed */
    HomeTabContentKt$HomeTabContent$4$1$4(Function1<? super String, Unit> function1) {
        this.$goTab = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(MoreDestination.Gear.getRoute());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) == 16 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(663936966, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:134)");
        }
        composer.startReplaceGroup(540656606);
        boolean changed = composer.changed(this.$goTab);
        final Function1<String, Unit> function1 = this.$goTab;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$4$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = HomeTabContentKt$HomeTabContent$4$1$4.invoke$lambda$1$lambda$0(Function1.this);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        GearAdviceCardsKt.GearAdviceSection(null, 0, (Function0) rememberedValue, composer, 0, 3);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
