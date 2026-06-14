package com.example.rungps.ui.gym;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.data.Repository;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: GymTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class GymTabContentKt$GymTabContent$20$1$37$2 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ String $oldName;
    final /* synthetic */ MutableState<Pair<Long, String>> $renameExercise$delegate;
    final /* synthetic */ MutableState<String> $renameText$delegate;
    final /* synthetic */ Repository $repo;
    final /* synthetic */ CoroutineScope $scope;
    final /* synthetic */ long $sid;

    GymTabContentKt$GymTabContent$20$1$37$2(MutableState<String> mutableState, String str, CoroutineScope coroutineScope, Repository repository, long j, MutableState<Pair<Long, String>> mutableState2) {
        this.$renameText$delegate = mutableState;
        this.$oldName = str;
        this.$scope = coroutineScope;
        this.$repo = repository;
        this.$sid = j;
        this.$renameExercise$delegate = mutableState2;
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
            ComposerKt.traceEventStart(1085882112, i, -1, "com.example.rungps.ui.gym.GymTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GymTabContent.kt:1529)");
        }
        composer.startReplaceGroup(-887411053);
        boolean changed = composer.changed(this.$renameText$delegate) | composer.changed(this.$oldName) | composer.changedInstance(this.$scope) | composer.changedInstance(this.$repo) | composer.changed(this.$sid);
        final String str = this.$oldName;
        final CoroutineScope coroutineScope = this.$scope;
        final MutableState<String> mutableState = this.$renameText$delegate;
        final MutableState<Pair<Long, String>> mutableState2 = this.$renameExercise$delegate;
        final Repository repository = this.$repo;
        final long j = this.$sid;
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.gym.GymTabContentKt$GymTabContent$20$1$37$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = GymTabContentKt$GymTabContent$20$1$37$2.invoke$lambda$1$lambda$0(str, coroutineScope, mutableState, mutableState2, repository, j);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$GymTabContentKt.INSTANCE.m7086getLambda17$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(String str, CoroutineScope coroutineScope, MutableState mutableState, MutableState mutableState2, Repository repository, long j) {
        String GymTabContent$lambda$106;
        GymTabContent$lambda$106 = GymTabContentKt.GymTabContent$lambda$106(mutableState);
        String obj = StringsKt.trim((CharSequence) GymTabContent$lambda$106).toString();
        mutableState2.setValue(null);
        if (obj.length() > 0 && !StringsKt.equals(obj, str, true)) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, Dispatchers.getIO(), null, new GymTabContentKt$GymTabContent$20$1$37$2$1$1$1(repository, j, str, obj, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
