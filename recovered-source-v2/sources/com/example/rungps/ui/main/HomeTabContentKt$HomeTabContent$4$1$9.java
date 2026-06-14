package com.example.rungps.ui.main;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.example.rungps.ui.components.HomeQuickActionsKt;
import com.example.rungps.ui.navigation.MainTab;
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
final class HomeTabContentKt$HomeTabContent$4$1$9 implements Function3<LazyItemScope, Composer, Integer, Unit> {
    final /* synthetic */ Function1<String, Unit> $goTab;
    final /* synthetic */ String $sportLabel;

    /* JADX WARN: Multi-variable type inference failed */
    HomeTabContentKt$HomeTabContent$4$1$9(String str, Function1<? super String, Unit> function1) {
        this.$sportLabel = str;
        this.$goTab = function1;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
        invoke(lazyItemScope, composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope item, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(item, "$this$item");
        if ((i & 17) != 16 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2067806152, i, -1, "com.example.rungps.ui.main.HomeTabContent.<anonymous>.<anonymous>.<anonymous> (HomeTabContent.kt:176)");
            }
            String str = this.$sportLabel;
            composer.startReplaceGroup(540708917);
            boolean changed = composer.changed(this.$goTab);
            final Function1<String, Unit> function1 = this.$goTab;
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$9$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$1$lambda$0;
                        invoke$lambda$1$lambda$0 = HomeTabContentKt$HomeTabContent$4$1$9.invoke$lambda$1$lambda$0(Function1.this);
                        return invoke$lambda$1$lambda$0;
                    }
                };
                composer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(540710645);
            boolean changed2 = composer.changed(this.$goTab);
            final Function1<String, Unit> function12 = this.$goTab;
            Object rememberedValue2 = composer.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.INSTANCE.getEmpty()) {
                rememberedValue2 = new Function0() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$9$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$3$lambda$2;
                        invoke$lambda$3$lambda$2 = HomeTabContentKt$HomeTabContent$4$1$9.invoke$lambda$3$lambda$2(Function1.this);
                        return invoke$lambda$3$lambda$2;
                    }
                };
                composer.updateRememberedValue(rememberedValue2);
            }
            Function0 function02 = (Function0) rememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(540712448);
            boolean changed3 = composer.changed(this.$goTab);
            final Function1<String, Unit> function13 = this.$goTab;
            Object rememberedValue3 = composer.rememberedValue();
            if (changed3 || rememberedValue3 == Composer.INSTANCE.getEmpty()) {
                rememberedValue3 = new Function0() { // from class: com.example.rungps.ui.main.HomeTabContentKt$HomeTabContent$4$1$9$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        Unit invoke$lambda$5$lambda$4;
                        invoke$lambda$5$lambda$4 = HomeTabContentKt$HomeTabContent$4$1$9.invoke$lambda$5$lambda$4(Function1.this);
                        return invoke$lambda$5$lambda$4;
                    }
                };
                composer.updateRememberedValue(rememberedValue3);
            }
            composer.endReplaceGroup();
            HomeQuickActionsKt.HomeQuickActions(str, function0, function02, (Function0) rememberedValue3, null, composer, 0, 16);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
                return;
            }
            return;
        }
        composer.skipToGroupEnd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(MainTab.Run.getRoute());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(MainTab.Gym.getRoute());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(Function1 function1) {
        function1.invoke(MoreDestination.Soccer.getRoute());
        return Unit.INSTANCE;
    }
}
