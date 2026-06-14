package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$3$1", f = "MapTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$3$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Density $density;
    final /* synthetic */ MutableState<Boolean> $headingUp$delegate;
    final /* synthetic */ OsMapKit $kit;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$3$1(Density density, OsMapKit osMapKit, MutableState<Boolean> mutableState, Continuation<? super MapTabContentKt$MapTabContent$3$1> continuation) {
        super(2, continuation);
        this.$density = density;
        this.$kit = osMapKit;
        this.$headingUp$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTabContentKt$MapTabContent$3$1(this.$density, this.$kit, this.$headingUp$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapTabContentKt$MapTabContent$3$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean MapTabContent$lambda$17;
        boolean MapTabContent$lambda$172;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Density density = this.$density;
        MapTabContent$lambda$17 = MapTabContentKt.MapTabContent$lambda$17(this.$headingUp$delegate);
        int mo370roundToPx0680j_4 = MapTabContent$lambda$17 ? density.mo370roundToPx0680j_4(Dp.m6303constructorimpl(44)) : 0;
        this.$kit.getMapView().setPadding(mo370roundToPx0680j_4, mo370roundToPx0680j_4, mo370roundToPx0680j_4, mo370roundToPx0680j_4);
        MapTabContent$lambda$172 = MapTabContentKt.MapTabContent$lambda$17(this.$headingUp$delegate);
        if (MapTabContent$lambda$172) {
            this.$kit.getMapView().getController().zoomOut();
        }
        this.$kit.getMapView().postInvalidateOnAnimation();
        return Unit.INSTANCE;
    }
}
