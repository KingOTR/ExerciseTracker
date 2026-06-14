package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.compass.InternalCompassOrientationProvider;

/* compiled from: MapTabContent.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapTabContentKt$MapTabContent$10$1", f = "MapTabContent.kt", i = {}, l = {378}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapTabContentKt$MapTabContent$10$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ MutableState<Boolean> $headingUp$delegate;
    final /* synthetic */ MapView $mapView;
    final /* synthetic */ InternalCompassOrientationProvider $orient;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapTabContentKt$MapTabContent$10$1(MapView mapView, InternalCompassOrientationProvider internalCompassOrientationProvider, MutableState<Boolean> mutableState, Continuation<? super MapTabContentKt$MapTabContent$10$1> continuation) {
        super(2, continuation);
        this.$mapView = mapView;
        this.$orient = internalCompassOrientationProvider;
        this.$headingUp$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapTabContentKt$MapTabContent$10$1(this.$mapView, this.$orient, this.$headingUp$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapTabContentKt$MapTabContent$10$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean MapTabContent$lambda$17;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            MapTabContent$lambda$17 = MapTabContentKt.MapTabContent$lambda$17(this.$headingUp$delegate);
            if (!MapTabContent$lambda$17) {
                this.$mapView.setMapOrientation(0.0f);
                this.$mapView.postInvalidateOnAnimation();
                return Unit.INSTANCE;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        do {
            this.$mapView.setMapOrientation(-this.$orient.getLastKnownOrientation());
            this.$mapView.postInvalidateOnAnimation();
            this.label = 1;
        } while (DelayKt.delay(200L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
