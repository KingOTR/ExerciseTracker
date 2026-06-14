package com.example.rungps.ui.main;

import android.location.Location;
import androidx.compose.runtime.MutableState;
import com.google.logging.type.LogSeverity;
import java.util.Collection;
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
import org.maplibre.android.geometry.LatLng;
import org.maplibre.android.maps.MapLibreMap;

/* compiled from: MapLibreRecordingMap.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "com.example.rungps.ui.main.MapLibreRecordingMapKt$MapLibreRecordingMap$2$1", f = "MapLibreRecordingMap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class MapLibreRecordingMapKt$MapLibreRecordingMap$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Double $liveLat;
    final /* synthetic */ Double $liveLon;
    final /* synthetic */ MutableState<MapLibreMap> $mapRef$delegate;
    final /* synthetic */ MutableState<Double> $offRouteM$delegate;
    final /* synthetic */ MutableState<List<LatLng>> $routePts$delegate;
    final /* synthetic */ MutableState<Boolean> $styleReady$delegate;
    final /* synthetic */ MutableState<List<LatLng>> $trail$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MapLibreRecordingMapKt$MapLibreRecordingMap$2$1(Double d, Double d2, MutableState<Double> mutableState, MutableState<List<LatLng>> mutableState2, MutableState<List<LatLng>> mutableState3, MutableState<MapLibreMap> mutableState4, MutableState<Boolean> mutableState5, Continuation<? super MapLibreRecordingMapKt$MapLibreRecordingMap$2$1> continuation) {
        super(2, continuation);
        this.$liveLat = d;
        this.$liveLon = d2;
        this.$offRouteM$delegate = mutableState;
        this.$routePts$delegate = mutableState2;
        this.$trail$delegate = mutableState3;
        this.$mapRef$delegate = mutableState4;
        this.$styleReady$delegate = mutableState5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new MapLibreRecordingMapKt$MapLibreRecordingMap$2$1(this.$liveLat, this.$liveLon, this.$offRouteM$delegate, this.$routePts$delegate, this.$trail$delegate, this.$mapRef$delegate, this.$styleReady$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((MapLibreRecordingMapKt$MapLibreRecordingMap$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        if (r2 >= 3.0d) goto L12;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        List MapLibreRecordingMap$lambda$2;
        Double offRouteDistanceM;
        List MapLibreRecordingMap$lambda$5;
        List MapLibreRecordingMap$lambda$52;
        MapLibreMap MapLibreRecordingMap$lambda$14;
        boolean MapLibreRecordingMap$lambda$17;
        double distanceM;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Double d = this.$liveLat;
        Double d2 = this.$liveLon;
        if (d != null && d2 != null) {
            LatLng latLng = new LatLng(d.doubleValue(), d2.doubleValue());
            MutableState<Double> mutableState = this.$offRouteM$delegate;
            MapLibreRecordingMap$lambda$2 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$2(this.$routePts$delegate);
            offRouteDistanceM = MapLibreRecordingMapKt.offRouteDistanceM(latLng, MapLibreRecordingMap$lambda$2);
            mutableState.setValue(offRouteDistanceM);
            MapLibreRecordingMap$lambda$5 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$5(this.$trail$delegate);
            LatLng latLng2 = (LatLng) CollectionsKt.lastOrNull(MapLibreRecordingMap$lambda$5);
            if (latLng2 != null) {
                distanceM = MapLibreRecordingMapKt.distanceM(latLng2, latLng);
            }
            MutableState<List<LatLng>> mutableState2 = this.$trail$delegate;
            MapLibreRecordingMap$lambda$52 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$5(mutableState2);
            mutableState2.setValue(CollectionsKt.takeLast(CollectionsKt.plus((Collection<? extends LatLng>) MapLibreRecordingMap$lambda$52, latLng), LogSeverity.ERROR_VALUE));
            MapLibreRecordingMap$lambda$14 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$14(this.$mapRef$delegate);
            if (MapLibreRecordingMap$lambda$14 == null) {
                return Unit.INSTANCE;
            }
            MapLibreRecordingMap$lambda$17 = MapLibreRecordingMapKt.MapLibreRecordingMap$lambda$17(this.$styleReady$delegate);
            if (!MapLibreRecordingMap$lambda$17 || !MapLibreRecordingMap$lambda$14.getLocationComponent().isLocationComponentEnabled()) {
                return Unit.INSTANCE;
            }
            Location location = new Location("recording");
            location.setLatitude(d.doubleValue());
            location.setLongitude(d2.doubleValue());
            location.setAccuracy(8.0f);
            MapLibreRecordingMap$lambda$14.getLocationComponent().forceLocationUpdate(location);
            return Unit.INSTANCE;
        }
        this.$offRouteM$delegate.setValue(null);
        return Unit.INSTANCE;
    }
}
