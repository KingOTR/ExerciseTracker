package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Polyline;

/* compiled from: RecordingRouteMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RecordingRouteMapKt$RecordingRouteMap$4$1", f = "RecordingRouteMap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecordingRouteMapKt$RecordingRouteMap$4$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ OsMapKit $kit;
    final /* synthetic */ MapView $mapView;
    final /* synthetic */ MutableState<List<GeoPoint>> $trail$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecordingRouteMapKt$RecordingRouteMap$4$1(OsMapKit osMapKit, MapView mapView, MutableState<List<GeoPoint>> mutableState, Continuation<? super RecordingRouteMapKt$RecordingRouteMap$4$1> continuation) {
        super(2, continuation);
        this.$kit = osMapKit;
        this.$mapView = mapView;
        this.$trail$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordingRouteMapKt$RecordingRouteMap$4$1(this.$kit, this.$mapView, this.$trail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecordingRouteMapKt$RecordingRouteMap$4$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<GeoPoint> RecordingRouteMap$lambda$8;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Polyline liveLine = this.$kit.getLiveLine();
        RecordingRouteMap$lambda$8 = RecordingRouteMapKt.RecordingRouteMap$lambda$8(this.$trail$delegate);
        liveLine.setPoints(RecordingRouteMap$lambda$8);
        this.$mapView.invalidate();
        return Unit.INSTANCE;
    }
}
