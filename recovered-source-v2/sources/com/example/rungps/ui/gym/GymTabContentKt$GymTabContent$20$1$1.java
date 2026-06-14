package com.example.rungps.ui.gym;

import androidx.compose.material3.TabKt;
import androidx.compose.material3.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableIntState;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: GymTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ MutableIntState $gymPage$delegate;
    final /* synthetic */ List<String> $gymTabs;

    GymTabContentKt$GymTabContent$20$1$1(List<String> list, MutableIntState mutableIntState) {
        this.$gymTabs = list;
        this.$gymPage$delegate = mutableIntState;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        int GymTabContent$lambda$127;
        if ((i & 3) != 2 || !composer.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(471593005, i, -1, "com.example.rungps.ui.gym.GymTabContent.<anonymous>.<anonymous>.<anonymous> (GymTabContent.kt:364)");
            }
            List<String> list = this.$gymTabs;
            final MutableIntState mutableIntState = this.$gymPage$delegate;
            final int i2 = 0;
            for (Object obj : list) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                final String str = (String) obj;
                GymTabContent$lambda$127 = GymTabContentKt.GymTabContent$lambda$127(mutableIntState);
                boolean z = GymTabContent$lambda$127 == i2;
                composer.startReplaceGroup(-889466113);
                boolean changed = composer.changed(mutableIntState) | composer.changed(i2);
                Object rememberedValue = composer.rememberedValue();
                if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
                    rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            Unit invoke$lambda$2$lambda$1$lambda$0;
                            invoke$lambda$2$lambda$1$lambda$0 = GymTabContentKt$GymTabContent$20$1$1.invoke$lambda$2$lambda$1$lambda$0(i2, mutableIntState);
                            return invoke$lambda$2$lambda$1$lambda$0;
                        }
                    };
                    composer.updateRememberedValue(rememberedValue);
                }
                composer.endReplaceGroup();
                TabKt.m2262TabwqdebIU(z, (Function0) rememberedValue, null, false, ComposableLambdaKt.rememberComposableLambda(2029085793, true, new Function2<Composer, Integer, Unit>() { // from class: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$1$1$2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i4) {
                        if ((i4 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2029085793, i4, -1, "com.example.rungps.ui.gym.GymTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GymTabContent.kt:368)");
                        }
                        TextKt.m2376Text4IGK_g(str, (Modifier) null, 0L, 0L, (FontStyle) null, (FontWeight) null, (FontFamily) null, 0L, (TextDecoration) null, (TextAlign) null, 0L, 0, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (TextStyle) null, composer2, 0, 0, 131070);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer, 54), null, 0L, 0L, null, composer, 24576, 492);
                i2 = i3;
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
    public static final Unit invoke$lambda$2$lambda$1$lambda$0(int i, MutableIntState mutableIntState) {
        mutableIntState.setIntValue(i);
        return Unit.INSTANCE;
    }
}
