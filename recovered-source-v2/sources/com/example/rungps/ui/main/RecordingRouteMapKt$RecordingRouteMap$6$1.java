package com.example.rungps.ui.main;

import androidx.compose.runtime.MutableState;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.compass.InternalCompassOrientationProvider;

/* compiled from: RecordingRouteMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.RecordingRouteMapKt$RecordingRouteMap$6$1", f = "RecordingRouteMap.kt", i = {}, l = {233}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class RecordingRouteMapKt$RecordingRouteMap$6$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $compact;
    final /* synthetic */ Double $liveLat;
    final /* synthetic */ Double $liveLon;
    final /* synthetic */ MapView $mapView;
    final /* synthetic */ InternalCompassOrientationProvider $orient;
    final /* synthetic */ MutableState<List<GeoPoint>> $trail$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecordingRouteMapKt$RecordingRouteMap$6$1(InternalCompassOrientationProvider internalCompassOrientationProvider, MapView mapView, Double d, Double d2, boolean z, MutableState<List<GeoPoint>> mutableState, Continuation<? super RecordingRouteMapKt$RecordingRouteMap$6$1> continuation) {
        super(2, continuation);
        this.$orient = internalCompassOrientationProvider;
        this.$mapView = mapView;
        this.$liveLat = d;
        this.$liveLon = d2;
        this.$compact = z;
        this.$trail$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new RecordingRouteMapKt$RecordingRouteMap$6$1(this.$orient, this.$mapView, this.$liveLat, this.$liveLon, this.$compact, this.$trail$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((RecordingRouteMapKt$RecordingRouteMap$6$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List RecordingRouteMap$lambda$8;
        List RecordingRouteMap$lambda$82;
        List RecordingRouteMap$lambda$83;
        List RecordingRouteMap$lambda$84;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        do {
            float lastKnownOrientation = this.$orient.getLastKnownOrientation();
            RecordingRouteMap$lambda$8 = RecordingRouteMapKt.RecordingRouteMap$lambda$8(this.$trail$delegate);
            if (RecordingRouteMap$lambda$8.size() >= 2) {
                RecordingRouteMap$lambda$82 = RecordingRouteMapKt.RecordingRouteMap$lambda$8(this.$trail$delegate);
                RecordingRouteMap$lambda$83 = RecordingRouteMapKt.RecordingRouteMap$lambda$8(this.$trail$delegate);
                GeoPoint geoPoint = (GeoPoint) RecordingRouteMap$lambda$82.get(RecordingRouteMap$lambda$83.size() - 2);
                RecordingRouteMap$lambda$84 = RecordingRouteMapKt.RecordingRouteMap$lambda$8(this.$trail$delegate);
                GeoPoint geoPoint2 = (GeoPoint) CollectionsKt.last(RecordingRouteMap$lambda$84);
                if (MapOsMapKitKt.geoDistanceM(geoPoint, geoPoint2) >= 4.0d) {
                    lastKnownOrientation = MapOsMapKitKt.bearingDegrees(geoPoint, geoPoint2);
                }
            }
            float f = lastKnownOrientation;
            this.$mapView.setMapOrientation(-f);
            Double d = this.$liveLat;
            Double d2 = this.$liveLon;
            if (d != null && d2 != null) {
                this.$mapView.getController().setCenter(MapOsMapKitKt.lookAheadPoint(d.doubleValue(), d2.doubleValue(), f, this.$compact ? 75.0d : 45.0d));
            }
            this.$mapView.postInvalidateOnAnimation();
            this.label = 1;
        } while (DelayKt.delay(100L, this) != coroutine_suspended);
        return coroutine_suspended;
    }
}
