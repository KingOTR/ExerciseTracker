package com.example.rungps.ui.main;

import android.content.Context;
import android.widget.Toast;
import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: SoccerTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class SoccerTabContentKt$SoccerTabContent$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Context $ctx;
    final /* synthetic */ MutableState<String> $dateText$delegate;
    final /* synthetic */ MutableState<Integer> $intensity$delegate;
    final /* synthetic */ MutableState<String> $kind$delegate;
    final /* synthetic */ MutableState<String> $notesText$delegate;
    final /* synthetic */ MutableState<String> $playText$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ MutableState<Boolean> $showAdd$delegate;
    final /* synthetic */ String $sportLabel;
    final /* synthetic */ MutableState<String> $trainingMinText$delegate;
    final /* synthetic */ MutableState<String> $warmupText$delegate;

    SoccerTabContentKt$SoccerTabContent$2(MutableState<String> mutableState, Context context, MutableState<String> mutableState2, MutableState<String> mutableState3, MutableState<String> mutableState4, MutableState<String> mutableState5, CoroutineScope coroutineScope, Repository repository, MutableState<Integer> mutableState6, MutableState<String> mutableState7, String str, MutableState<Boolean> mutableState8) {
        this.$dateText$delegate = mutableState;
        this.$ctx = context;
        this.$kind$delegate = mutableState2;
        this.$trainingMinText$delegate = mutableState3;
        this.$warmupText$delegate = mutableState4;
        this.$playText$delegate = mutableState5;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$intensity$delegate = mutableState6;
        this.$notesText$delegate = mutableState7;
        this.$sportLabel = str;
        this.$showAdd$delegate = mutableState8;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1941314493, i, -1, "com.example.rungps.ui.main.SoccerTabContent.<anonymous> (SoccerTabContent.kt:135)");
        }
        composer.startReplaceGroup(-1170234489);
        boolean changed = composer.changed(this.$dateText$delegate) | composer.changedInstance(this.$ctx) | composer.changed(this.$kind$delegate) | composer.changed(this.$trainingMinText$delegate) | composer.changed(this.$warmupText$delegate) | composer.changed(this.$playText$delegate) | composer.changedInstance(this.$scope) | composer.changedInstance(this.$repo) | composer.changed(this.$intensity$delegate) | composer.changed(this.$notesText$delegate) | composer.changed(this.$sportLabel);
        final Context context = this.$ctx;
        final CoroutineScope coroutineScope = this.$scope;
        final String str = this.$sportLabel;
        final MutableState<String> mutableState = this.$dateText$delegate;
        final MutableState<String> mutableState2 = this.$kind$delegate;
        final MutableState<String> mutableState3 = this.$trainingMinText$delegate;
        final MutableState<String> mutableState4 = this.$warmupText$delegate;
        final MutableState<String> mutableState5 = this.$playText$delegate;
        final MutableState<Boolean> mutableState6 = this.$showAdd$delegate;
        final Repository repository = this.$repo;
        final MutableState<Integer> mutableState7 = this.$intensity$delegate;
        final MutableState<String> mutableState8 = this.$notesText$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.SoccerTabContentKt$SoccerTabContent$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = SoccerTabContentKt$SoccerTabContent$2.invoke$lambda$1$lambda$0(context, coroutineScope, str, mutableState, mutableState2, mutableState3, mutableState4, mutableState5, mutableState6, repository, mutableState7, mutableState8);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$SoccerTabContentKt.INSTANCE.m7269getLambda1$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(Context context, CoroutineScope coroutineScope, String str, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, Repository repository, MutableState mutableState7, MutableState mutableState8) {
        String SoccerTabContent$lambda$12;
        Long SoccerTabContent$parseDateToMs;
        String SoccerTabContent$lambda$8;
        String SoccerTabContent$lambda$16;
        String SoccerTabContent$lambda$20;
        MutableState mutableState9;
        int i;
        int i2;
        String SoccerTabContent$lambda$24;
        SoccerTabContent$lambda$12 = SoccerTabContentKt.SoccerTabContent$lambda$12(mutableState);
        SoccerTabContent$parseDateToMs = SoccerTabContentKt.SoccerTabContent$parseDateToMs(SoccerTabContent$lambda$12);
        if (SoccerTabContent$parseDateToMs != null) {
            SoccerTabContent$lambda$8 = SoccerTabContentKt.SoccerTabContent$lambda$8(mutableState2);
            if (Intrinsics.areEqual(SoccerTabContent$lambda$8, "TRAINING")) {
                SoccerTabContent$lambda$24 = SoccerTabContentKt.SoccerTabContent$lambda$24(mutableState3);
                Integer intOrNull = StringsKt.toIntOrNull(SoccerTabContent$lambda$24);
                int intValue = intOrNull != null ? intOrNull.intValue() : 0;
                if (intValue <= 0) {
                    Toast.makeText(context, "Enter training minutes (greater than 0)", 1).show();
                    return Unit.INSTANCE;
                }
                mutableState9 = mutableState6;
                i2 = intValue;
                i = 0;
            } else {
                SoccerTabContent$lambda$16 = SoccerTabContentKt.SoccerTabContent$lambda$16(mutableState4);
                Integer intOrNull2 = StringsKt.toIntOrNull(SoccerTabContent$lambda$16);
                int intValue2 = intOrNull2 != null ? intOrNull2.intValue() : 0;
                SoccerTabContent$lambda$20 = SoccerTabContentKt.SoccerTabContent$lambda$20(mutableState5);
                Integer intOrNull3 = StringsKt.toIntOrNull(SoccerTabContent$lambda$20);
                int intValue3 = intOrNull3 != null ? intOrNull3.intValue() : 0;
                if (intValue2 < 0 || intValue3 <= 0) {
                    Toast.makeText(context, "Enter warmup and game minutes", 1).show();
                    return Unit.INSTANCE;
                }
                mutableState9 = mutableState6;
                i = intValue2;
                i2 = intValue3;
            }
            SoccerTabContentKt.SoccerTabContent$lambda$5(mutableState9, false);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new SoccerTabContentKt$SoccerTabContent$2$1$1$1(repository, SoccerTabContent$parseDateToMs, i, i2, mutableState2, mutableState7, mutableState8, null), 2, null);
            Toast.makeText(context, "Saved " + str + " session", 0).show();
            return Unit.INSTANCE;
        }
        Toast.makeText(context, "Enter a valid date like 2026-05-11", 1).show();
        return Unit.INSTANCE;
    }
}
