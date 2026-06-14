package com.example.rungps.ui.main;

import androidx.compose.material3.ButtonKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import com.example.rungps.feature.run.RunsViewModel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MapTabContent.kt */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$13$1$4$7 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ Long $delId;
    final /* synthetic */ MutableState<Long> $deleteRouteId$delegate;
    final /* synthetic */ Long $followRouteId;
    final /* synthetic */ Function2<Long, String, Unit> $onSelectFollowRoute;
    final /* synthetic */ RunsViewModel $vm;

    /* JADX WARN: Multi-variable type inference failed */
    MapTabContentKt$MapTabContent$13$1$4$7(RunsViewModel runsViewModel, Long l, Long l2, Function2<? super Long, ? super String, Unit> function2, MutableState<Long> mutableState) {
        this.$vm = runsViewModel;
        this.$delId = l;
        this.$followRouteId = l2;
        this.$onSelectFollowRoute = function2;
        this.$deleteRouteId$delegate = mutableState;
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
            ComposerKt.traceEventStart(-165657256, i, -1, "com.example.rungps.ui.main.MapTabContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapTabContent.kt:823)");
        }
        composer.startReplaceGroup(482060473);
        boolean changedInstance = composer.changedInstance(this.$vm) | composer.changed(this.$delId) | composer.changed(this.$followRouteId) | composer.changed(this.$onSelectFollowRoute);
        final RunsViewModel runsViewModel = this.$vm;
        final Long l = this.$delId;
        final Long l2 = this.$followRouteId;
        final Function2<Long, String, Unit> function2 = this.$onSelectFollowRoute;
        final MutableState<Long> mutableState = this.$deleteRouteId$delegate;
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.INSTANCE.getEmpty()) {
            rememberedValue = new Function0() { // from class: com.example.rungps.ui.main.MapTabContentKt$MapTabContent$13$1$4$7$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Unit invoke$lambda$1$lambda$0;
                    invoke$lambda$1$lambda$0 = MapTabContentKt$MapTabContent$13$1$4$7.invoke$lambda$1$lambda$0(RunsViewModel.this, l, l2, function2, mutableState);
                    return invoke$lambda$1$lambda$0;
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceGroup();
        ButtonKt.Button((Function0) rememberedValue, null, false, null, null, null, null, null, null, ComposableSingletons$MapTabContentKt.INSTANCE.m7213getLambda10$app_sideload(), composer, 805306368, 510);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(RunsViewModel runsViewModel, Long l, Long l2, Function2 function2, MutableState mutableState) {
        mutableState.setValue(null);
        runsViewModel.deleteRoute(l.longValue());
        if (Intrinsics.areEqual(l2, l)) {
            function2.invoke(null, null);
        }
        return Unit.INSTANCE;
    }
}
